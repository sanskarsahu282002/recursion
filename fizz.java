import java.util.Scanner;

public class fizz {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter n");
        int n = sc.nextInt();
        for(int i=1;i<n;i++)
        {
        if(i==1||i==2)
        {
            System.out.println(i);
        }
        else if(i%3==0 && i%5==0)
        {
            System.out.println("fizz-buzz");
        }
        else if (i%3==0||i%5!=0)
        {
            System.out.println("fizz");
        }
        else if (i%3!=0 || i%5!=0)
        {
            System.out.println("buzz");
        }
    }
    }
}
