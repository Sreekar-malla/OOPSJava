package OOP;
public class cars {
    int wheelC = 4;
    Boolean Engine = true;
    Boolean Gears = true;
    void Start(){
        System.out.println("Car Started!!");
    }
    void Break(){
        System.out.println("Applied breaks");
    }
    void stop(){
        System.out.println("Car Stopped!!");
    }
    public static void main(String[] args) {
        cars c = new cars();
        c.Start();
        c.Break();
        c.stop();
        System.out.println("minimum number " +
                "of wheels a car must have :: "+c.wheelC);
    }
}



