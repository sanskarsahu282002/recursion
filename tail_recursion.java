public class tail_recursion {
    static void tail(int n, int k)
    {
        if(n==0 || n==1 )
        return;
        System.out.println(n);
        tail(n-1,k-1);
    }
    public static void main(String[] args) {
        tail(5, 6);
    }
}
