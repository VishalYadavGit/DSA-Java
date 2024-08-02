package Questions;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args){
        // Convert Decimal number to binary:
        long startTime = System.currentTimeMillis();
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        num = sc.nextInt();
        sc.close();
        String res = "";
        while(num != 0){
            int rem = num%2;
            num = num/2;
            res = rem + res;

        }
        System.out.println(res);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
