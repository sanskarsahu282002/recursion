package recursion;

public class print_rec {
    static void fun(int n)
    {
        if(n==0)
        {
            return;
        }
        else{
            System.out.println(n);
            fun(n-1);
        }
    }
    public static void main(String[] args) {
        fun(5);

    }
}
