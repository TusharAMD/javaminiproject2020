 
import java.util.Scanner;

public class AO
{
    public static void main(String[] args)
    {
        int a,b,sum,difference,product,modulo;
        float quotient;
        Scanner scanner;
        scanner=new Scanner(System.in);
            
        System.out.println("Enter Two Integers");
        
        a= scanner.nextInt();
        b= scanner.nextInt();
        
        
        sum=a+b;
        difference=a-b;
        product=a*b;
        quotient=(float)a/b;
        modulo=a%b;
        
        System.out.println(("Sum : " + sum));
        
        System.out.println("Diff : " + difference);
        
        System.out.println("Product : " + product);
        
        System.out.println("Quotient : " + quotient);
        
        System.out.println("Modulo : " + modulo);
    
    }
}
