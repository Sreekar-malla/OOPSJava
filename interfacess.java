package OOP;
interface ICalculator{
    void add(int a,int b);
    void sub(int a,int b);
}
interface IAdvCalculator{
    void mul(int a,int b);
    void div(int a , int b);
}
class SuperCalculator implements ICalculator,IAdvCalculator{
    public void add(int a , int b){
        System.out.println(a+b);
    }
    public void sub(int a , int b){
        System.out.println(a-b);
    }
    public void mul(int a , int b){
        System.out.println(a*b);
    }
    public void div(int a , int b){
        System.out.println(a/b);
    }
}

public class interfacess {
    public static void main(String[] args) {
        ICalculator c = new SuperCalculator();
        IAdvCalculator ac = new SuperCalculator();
        c.add(5,9);
        c.sub(10,7);
        ac.mul(3,2);
        ac.div(12,2);
    }
}
