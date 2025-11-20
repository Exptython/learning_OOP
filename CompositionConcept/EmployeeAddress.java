class Person1{
    String name;
    Person1(String name) {
        this.name = name;
    }
}
class Address {
    String city;
    Address(String city) { this.city = city; }
}

class Employee extends Person1 {
    Address address;

    Employee(String name, Address address) {
        super(name);
        this.address = address;
    }

    void showDetails() {
        System.out.println(name + " lives in " + address.city);
    }
}


public class EmployeeAddress {
    public static void main(String[] args) {
        Employee e = new Employee("Ali", new Address("Lahore"));
        e.showDetails();

    }
}
