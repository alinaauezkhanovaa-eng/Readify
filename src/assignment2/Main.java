import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Jane", "Birkin", "Inspirer", 9999999.78);
        Employee e2 = new Employee("Anna", "Wintour", "Vogue", 88888888);

        Student s1 = new Student("Auyezkhan", "Alina", 4.0);
        Student s2 = new Student("Utembayeva", "Karakat", 4.0);
        ArrayList<Person> list = new ArrayList<>();
        list.add(e2);
        list.add(e1);
        list.add(s1);
        list.add(s2);
        Collections.sort(list);
        printData(list);
    }
    public static void printData(Iterable<Person> persons) {
        for (Person p : persons) {
            System.out.println(
                    p + " earns " + String.format("%.2f", p.getPaymentAmount()) + " tenge"
            );
        }
    }
}
