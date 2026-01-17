public class Person implements Payable, Comparable<Person> {
    protected int id;
    protected String name;
    protected String surname;
    private static int counter = 1;
    public Person() {
        id = counter++;
    }
    public Person(String name, String surname) {
        id = counter++;
        this.name = name;
        this.surname = surname;
    }
    public int getId() {
        return id;
    }
    public String getPosition() {
        return "Student";
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }

    @Override
    public int compareTo(Person p) {
        return Double.compare(this.getPaymentAmount(), p.getPaymentAmount());
    }

    @Override
    public String toString() {
        return id + "." + name + " " + surname;
    }
}
