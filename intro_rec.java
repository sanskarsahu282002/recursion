package recursion;

public class intro_rec {
    static void fun1()
    {
        System.out.println("I am in function 1");
    }
    static void fun2()
    {
        System.out.println("I am in function 2");
        fun1();
        System.out.println(" i an function 2");

    }
    public static void main(String[] args) {
        System.out.println(" beforef2");
        fun2();
        System.out.println("after f2");
    }
}
