package Questions;

public class Recurrsion {
    //Print 54321 if n is given 5
    public static String print(int n){
        if(n==1){
            return "1";
        }
        return n + print(n-1);
    }
    public static void main(String[] args){
        int a = 5;
        String val = print(5);
        System.out.println(val);
    }
}
