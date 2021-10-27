package sum;

import java.util.Scanner;

public class sumMultiplication {
    public static void main(String[] args) {
        int n,r,sum=0;
        System.out.println("Enter any number");
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();

        while(n>0){
            r = n%10;
            sum = sum + r;
            n = n/10;
        }
        System.out.println("Sum of Digits "+ sum);

        
        int a,b,c;
        System.out.println("Enter Number for Multiplication");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = a*b;
        System.out.println("Multiplication of two number is "+c);
    }
}
