package SpaceTime;

public class ConstantSpaceTime {
    public static void main(String args[]){
        int arr[] = new int[]{1,2,3,4,5,6};
        int num = arr[arr.length - 1]; //  it is O(4) space complexity cause INT is 4bytes and it is constant space complexity
        System.out.println(arr[1]);
        // The time complexity there is O(1) i.e a constant time complexity and it is the best time complexity

    }

}
