import java.util.Scanner;

public class CalculateN {// this is without recursion
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        int result=1;
        for (int i = 1; i <= number; i++) {
            result = result * i;

        }
        System.out.println(result);


        int num = input.nextInt();  // this is with recursion

        int factorial = fact(num);
        System.out.println(factorial);}

    static int fact(int n)
    {
        int output;
        if(n==1){
            return 1;
        }

        output = fact(n-1)* n;
        return output;
        }
    }
