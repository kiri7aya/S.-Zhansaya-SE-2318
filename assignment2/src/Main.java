import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Employee("John", "Lennon", "Lecturer", 27045.78));
        persons.add(new Employee("George", "Harrison", "Senior lecturer", 50000));
        persons.add(new Student("Ringo", "Starr", 2.12));
        persons.add(new Student("Paul", "McCartney", 3.15));
        Collections.sort(persons);
        printData(persons);
    }
    public static void printData(Iterable<Person> persons){
        for(Person i: persons) {
            System.out.println(i.toStr() +" erns " + i.getPaymentAmount() + " tenge");
        }
    }
}