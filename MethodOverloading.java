package OOPSRev;

class Calculator{
    public void add(int a, int b){
        System.out.println(a+b);
        System.out.println("int-int binding"); // byte,shor,char,int
    }
    public void add(float a,float b){
        System.out.println("float-float binding"); // int float
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10,11);
        c.add('a','a');
//        c.add(10.5,20.5);
    }
}
