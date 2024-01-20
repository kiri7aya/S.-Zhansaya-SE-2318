public class Employee extends Person {
    private String position;
    private double salary;
    String toStr(){
        return "Employee: " + getId() + ".  " + getName() + " " + getSurname();
    }
    String getPosition(){
        return position;
    }
    void setPosition(String positionInput){
        position = positionInput;
    }
    double getSalary(){
        return salary;
    }
    void setSalary(double salaryInput){
        salary = salaryInput;
    }
    Employee(){

    }
    Employee(String name1, String surname1, String position1, double salary1){
        setName(name1);
        setSurname(surname1);
        setPosition(position1);
        setSalary(salary1);

    }
    public double getPaymentAmount(){
        return salary;
    }
}
