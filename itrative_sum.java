package recursion;

public class itrative_sum {
    static int getSum(int n)
    {
        int res=0;
        while(n>=0)
        {
            res = res + n%10;
            n=n/10;
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 23;
        getSum(n);
        System.out.println(getSum(n));
    }
}
