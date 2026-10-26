package OOPSRev;

class Person{
    String name;
    int age;
    String address;
}
class Student extends Person{
    int marks;
    String Grade;

    Student(String name, int age, String address, int marks, String Grade){
        this.name = name;
        this.age=age;
        this.address = address;
        this.marks = marks;
        this.Grade = Grade;
    }

    void display(){
        System.out.println("Name :: "+name);
        System.out.println("Age :: "+age);
        System.out.println("Address :: "+address);
        System.out.println("Marks :: "+marks);
        System.out.println("Grade :: "+Grade);
    }

}
public class inheritance {
    public static void main(String[] args) {
        Student s1 = new Student("Sreekar malla",18,"Hyderabad",96,"O");
        s1.display();

    }
}
