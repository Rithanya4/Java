package distance;

public class conversion {

    public static void main(String[] args)
    {
     conversion obj=new conversion();
     conversion obj1=new conversion();
     obj1.milestokm();
     obj.mtokm();
     
    }
 public void mtokm()
 {
     int m=5;
      int km=5000;
     System.out.println("Meter to km is:"+m*1000);
     System.out.println("km to meter is:"+km/1000);
 }
 public void milestokm()
 {
     int miles=5;
     int km=50;
     System.out.println("Miles to km is:"+miles*1.609);
     System.out.println("km to miles is:"+km/1.609);
 }
}

