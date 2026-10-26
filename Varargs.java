package OOPSRev;

class AdvancedCalculator{
    public void add(int... i){
        int sum = 0;
        for(int ele : i){
            sum+=ele;
        }
        System.out.println(sum);
    }
}

public class Varargs {
    public static void main(String[] args) {
        AdvancedCalculator ac = new AdvancedCalculator();
        ac.add();
        ac.add(10);
        ac.add(10,20,30);
    }
}
