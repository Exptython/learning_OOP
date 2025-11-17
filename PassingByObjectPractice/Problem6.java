
class Person{
    String name;
    int age;

    Person (String name,int age){
        this.name=name;
        this.age=age;
    }
    public void DisplayInfo(){
        System.out.println("Name: "+name);
        System.out.println("age: "+age);
    }
    Person UpdatedAge(int newAge){
        return new Person(this.name,newAge);
    }
}

public class Problem6 {
    public static void main(String[] args) {
        Person p1=new Person("Ali",20);
        p1.DisplayInfo();

        Person p2=p1.UpdatedAge(25);
        p2.DisplayInfo();
    }
}
