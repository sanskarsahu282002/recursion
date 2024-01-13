package recursion;

public class ex_rec {
    static void fun1(int n)
    {
        if(n==1)
        {
            return;
        }
        System.out.println("sanskar");
        fun1(n-1);
    }
    public static void main(String[] args) {
       fun1(3); 
    }
}
