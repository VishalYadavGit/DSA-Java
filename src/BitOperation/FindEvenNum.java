package BitOperation;

public class FindEvenNum {
    //finding if a number is even or odd with bitwise operator
    //normal % method is very slow as bit operations are always faster
    public static void main(String[] args){
        int number=21;
        // Number&1 will always return 1 or 0, depending if its odd and even respectively
        if((number&1)==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
}
