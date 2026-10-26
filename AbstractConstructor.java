package OOPSRev;

abstract class person{
    String name;
    int age;
    float height;
    person(String name,int age,float height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
}

class Students extends person{
    int marks;
    float avg;
    Students(String name,int age,float height,int marks,int avg){
        super(name,age,height);
        this.marks = marks;
        this.avg = avg;
    }
    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Height : "+height);
        System.out.println("Marks : "+marks);
        System.out.println("Average : "+avg);
    }
}

public class AbstractConstructor {
    public static void main(String[] args) {
        Students s =  new Students("Sreekar malla",18,5.85f,99,99);
        s.display();
    }
}
