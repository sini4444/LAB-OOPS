import java.util.*;
import java.io.*;
Class eemployee1
{
int empid,salary;
String empname,eaddress;
eemployee1(int emid,String ename,String address,int sal)
{
empid=emid;
empname=ename;
eaddress=address;
salary=sal;
}
Void print()
{
System.out.println("Employee id :"+empid);
System.out.println("Employee Name :"+empname);
System.out.println(“Employee Address :"+eaddress);
System.out.println(“Employee Salary :"+salary);
}
}
Class teacher extends eemployee1
{
String dept,sub1,sub2,sub3;
teacher(String deptm,String subj1,String subj2,String subj3)
{
dept = deptm;
sub1 = subj1;
sub2 = subj2;
sub3 = subj3;
}
Void show()
{
System.out.println("Department:"+dept);
System.out.println("Subject 1:"+sub1);
System.out.println("Subject 2:"+sub2);
System.out.println("Subject 3:"+sub3);
}
Public static void main(String args[])
{
Teacher[] t=new teacher[3];
  [t1].print();
  [t1].show();
  [t2].print();
  [t2].show();
  [t3].print();
  [t3].show();
}
}


