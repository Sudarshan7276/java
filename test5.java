public class test5{
static int a=10;
public static void main(String[]args)
 {
test5 t=new test5();
test5 s=new test5();
test5 y=new test5();
s.a=t.a+10;
t.a=s.a+20;
System.out.println(s.a);
System.out.println(t.a);
}
}