
package package1;

import package2.p1;
import package3.p2;
import package4.pack3;

public class ex5 {
  public static void main(String args[])
  {
    ex5 obj=new ex5();
      obj.pack();
    p1 obj1=new p1();
      obj1.pack1();
    p2 obj2=new p2();
      obj2.pack2();
    pack3 obj3=new pack3();
      obj3.pack3();
  }
    void pack()
    {
        System.out.println("PACKAGE IS CREATED");
    }
}