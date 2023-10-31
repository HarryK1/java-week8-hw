package homeworkweek8.methodoverriding24;

/*
 *
 24.	A real example of Java Method Overriding (Create package name
 ‘methodoverriding24’ and create all below classes in this package)


 ICICI i=new ICICI(); AXIS a=new AXIS();
 System.out.println("SBI Rate of Interest: "+s.getRateOfInterest()); System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest()); System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
 }
 }

 Output:
 SBI Rate of Interest: 8 ICICI Rate of Interest: 7 AXIS Rate of Interest: 9

 */


//test class to create objects and call the methods
public class Test2 {
    public static void main(String[] args) {
        Sbi s = new Sbi();
        Icici i = new Icici();
        Axis a = new Axis();
        System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
    }
}
