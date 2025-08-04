public class test3 {
    static int x = 20;

    public static void main(String[] args) {
        test t = new test();      // First instance (t)
        test s = new test();      // Second instance (s)
        test y = new test();      // Third instance (y)

        s.x = t.x + 10;           // Static variable x updated: x = 30
        y.x = s.x + 10;           // Static variable x updated again: x = 40

        System.out.println(y.x); // Prints: 40
        System.out.println(s.x); // Prints: 40
    }
}
