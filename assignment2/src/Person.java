public class Person implements Payable, Comparable<Person>{
    private int id;
    private static int idCount = 1;
    private String name;
    private String surname;
    String toStr(){
       return id + ". " + name + " " + surname;
    }
    int getId(){
        return  id;
    }
    String getName(){
        return name;
    }
    void setName(String nameInput){
        name = nameInput;
    }
    String getSurname(){
        return surname;
    }
    void setSurname(String surnameInput){
        surname = surnameInput;
    }
    Person(){
        this.id = idCount;
        idCount++;
    }
    Person(String name1, String surname1){
        this.id = idCount;
        idCount++;
        setName(name1);
        setSurname(surname1);
    }
    public double getPaymentAmount(){
        return 0;
    }
    String getPosition(){
        if (this.getClass() == Employee.class) {

            return this.getPosition();
        }
        return "Student";
    }

    @Override
    public int compareTo(Person o){
        if (this.getPaymentAmount() > o.getPaymentAmount()){
            return 1;
        }
        else {
            return -1;
        }
    }
}
