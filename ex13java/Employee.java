import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Scanner;

class employee{
 String name;
 int salary;

    public employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "employee{" + "name=" + name + ", salary=" + salary + '}';
    }
 
}
class name_sort implements Comparator<employee>{
 @Override
 public int compare(employee e1,employee e2){
 if(e1.name.compareTo(e2.name)>0){
     return 1;
 }
 else{
 return -1;
 }
 }
}
public class Employee {

    public static void main(String[] args) {
       ArrayList<Employee>list=new ArrayList<>();
       while(list.size()<20)
       {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter employee name:");
       String n=sc.next();
         System.out.println("enter employee salary:");
         int a=sc.nextInt();
         list.add(new Employee());
       }
              System.out.println(list);
        Collection.sort(list,new name_sort());      
       System.out.println(list);

       }
       
    }