class Person{
    private String name;
    private int age;


    public void setName(String name,int age){
        this.name=name;
        this.age=age;

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class Problem1 {
    public static void main(String[] args) {
        Person p=new Person();
        p.setName("wahab",12);

        System.out.println("name"+p.getName());
        System.out.println("age: "+p.getAge());
    }
}
