package SpaceTime;

public class QuadraticSpaceTime {
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,0};
        int target = 9;
        // This is O(n^2) Time complexity
        for(int i = 0;i< arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (i+j==target){
                    System.out.println("Solution found! "+i +", "+j );
                }
            }
        }
}

}
