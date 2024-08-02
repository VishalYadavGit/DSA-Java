package SpaceTime;

public class LogarithmicSpaceTime {
    public static void main(String[] args){
        // O(log n) is better than 0(n)
        //Binary search Algorithm O(log n)
        int[] arr = new int[]{16,24,33,49,53,67,72,83,92,100};
        //Our task is to find 49
        int toFind = 49;
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if (arr[mid]==toFind){
                System.out.println("Found "+ toFind +" at index "+start);
                break;
            }
            else if(arr[mid]>toFind){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }

    }
}
