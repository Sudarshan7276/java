public class test2{
static int x=20;
public static void main(String[]args){
test2 t=new test2();
test2 s=new test2();
test2 y=new test2();
s.x=t.x+10;
y.x=s.x+10;
System.out.println(y.x);
System.out.println(s.x);
}}



