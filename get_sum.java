package recursion;

public class get_sum {
    static int sum(int n)
    {

        //if(n==0)
        if(n<=9)
        {
            return n;
        }
        else 
        {
            return sum(n/10)+n%10;
        }
    }
    public static void main(String[] args) {
        int n = 345;
        System.out.println(sum(n));
    }
}
