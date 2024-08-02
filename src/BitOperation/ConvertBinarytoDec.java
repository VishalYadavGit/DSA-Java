package BitOperation;

public class ConvertBinarytoDec {
    public static int BinaryToDecimal(int n){
        int Number = 0;
        int index = 0;
        while(n!=0){
            int temp = n%10;
            n = n/10;
            Number = Number + temp*(int)Math.pow(2,index);
            index++;
        }
        return Number;
    }
    public static void main(String[] args){
        int val=BinaryToDecimal(1010);
        System.out.println(val);
    }
}
