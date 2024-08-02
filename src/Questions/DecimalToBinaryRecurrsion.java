package Questions;

public class DecimalToBinaryRecurrsion {
    public static String Binary(int a, String result){
        if (a == 0){
            return result;
        }
        int remainder = a%2;
        result = remainder + result;
        return Binary(a/2,result);


    }
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        String result = "";
        result = Binary(10,result);
        System.out.println(result);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
