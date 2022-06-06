Class Employee {
import java.util.*;
class EMPLOYEE2
{
private int no;
private String name;
private double sal;
private String dept;
public Employee(int no, String name, double sal, String dept){
this.no=no;
this.name=name;
this.sal=sal;
this.dept=dept;
}
public String getName()
{
return name;
}
public double getSal()
{
return sal;
}
public void setSal(double sal)
{
this.sal=sal;
}
public String getDept()
{
return dept;
}
public void setDept(String dept)
{
this.dept = dept;
public void display()
{
System.out.printf("Employee details: ");
System.out.printf("%d, %s, %.2f, %s\n",no, name, sal, dept);
}
public static void main(String[] args) 
{
Employee[] emp=new Employee[9];
emp[0]=new Employee(1001, "Olivia",5000,"Core Java");
emp[1]=new Employee(1002, "Amelia",5500,".Net");
emp[2]=new Employee(1003, "Ella",4500,"Oracle");
emp[3]=new Employee(1004, "Amelia",8000,"Core Java");
emp[4]=new Employee(1005, "Grace",5000,"HTML");
emp[5]=new Employee(1006, "Olivia",6500,"C++");
emp[6]=new Employee(1007, "Isla",6000,"Advance Java");
emp[7]=new Employee(1008, "Ada",7500,"Oracle");
emp[8]=new Employee(1009, "Myla",7000,"c++");
System.out.println("Original Employee details: ");
for(Employee e:emp)
{
e.display();
}   
for(Employee e: emp){
if((e.getDept().toUpperCase().contains("JAVA")
if(e.getDept().toUpperCase().contains("HTML"))
if(e.getName().equalsIgnoreCase("Amelia"))){
e.setDept("Python");
e.setSal(e.getSal()+500);
}
}
System.out.println("\nModified Employee details: ");
for(Employee e : emp){
e.display();
}
}
}
