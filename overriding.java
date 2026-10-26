package OOPSRev;

class Parents{
    public void Assets(){
        System.out.println("Money+Lands+Love+Gold");
    }
    public void marry(){
        System.out.println("Relative girl...");
    }
}

class child extends Parents{
    public void marry(){
        System.out.println("Someother Girl...");
    }
}

public class overriding {
    public static void main(String[] args) {
        Parents ps = new Parents();
        ps.Assets();
        ps.marry();
        System.out.println();

        child c = new child();
        c.Assets();
        c.marry();

        System.out.println();
        Parents ps2 = new child();
        ps2.Assets();
        ps2.marry();
    }
}
