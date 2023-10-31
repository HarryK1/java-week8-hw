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

public class Axis extends Bank{
    public int getRateOfInterest(){
        return 9;
    }
}
