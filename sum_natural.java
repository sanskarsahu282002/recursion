package recursion;

public class sum_natural {
    static int sum_natural(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            return n*(n+1)/2;
        }
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(sum_natural(n));
    }
}
