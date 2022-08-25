
package javaapplication;


public class JavaApplication {

    public static void main(String[] args) 
    {
      circle obj=new circle();
      obj.getarea();
    }
}        
class circle
        {
            double radius=1.0;
            String colour="red";
        
         circle (double radius)
         {
         System.out.println("radius:"+radius);
         }
        circle()
        {
         System.out.println("colour:"+colour);
        }
        void getradius()
        {
            System.out.println("radius");
        }
        void getarea()
        {
            double area;
            area= 3.14*radius*radius;
            System.out.println("area is"+area);
        }
}
