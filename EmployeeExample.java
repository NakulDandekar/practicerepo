
import java.util.*;
class Employee
{
 private int eid;
 private  String ename;
 private  Float salary;
 
void accept()
{}
void display()
{}

}
class EmployeeExample
{  
 public static void main(String args[])
 {
 int n,i;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter n: ");
 n=sc.nextInt();  

 Employee a[]=new Employee[n];

for(i=0;i<n;i++)
{
 a[i]=new Employee();
}


 }
}