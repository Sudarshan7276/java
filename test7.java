public class test7{
static int a=10;
public static void main(String[]args)
 {
test7 t=new test7();
test7 s=new test7();
test7 y=new test7();
s.a=t.a+10;
//t.a=s.a+20;
System.out.println(s.a);
}
}