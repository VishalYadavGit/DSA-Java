package BitOperation;

public class BitOperators {
    public static void main(String[] args){
        int a=2,b=3;
        System.out.println("a & b: "+(a&b));
        System.out.println("a | b: "+(a|b));
        System.out.println("~a: "+(~a));
        System.out.println("a ^ b: "+(a^b));

        // Left shift
        System.out.println(10<<1);
        //Right Shift
        System.out.println(10>>1);
    }
}
