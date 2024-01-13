package recursion;

public class ex3_rec {
    static int fun(int n)
    {
        if(n==1)
        {
            return 0;
        }
        else{
            return 1+fun(n/2);
        }
    }
    public static void main(String[] args) {
    fun(16);
    System.out.println(fun(16));
    
    }
}
