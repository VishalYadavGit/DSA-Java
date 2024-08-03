package Arrays;

public class CustomArray {
    private int index;
    private int[] arr;
    public CustomArray(int number){
        this.arr = new int[number];
        this.index = 0;
    }

    public void insert(int val){
        this.arr[this.index]=val;
        index++;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int a : arr){
            sb.append(a).append(", ");
        }
        sb.append('\b').append('\b').append(']');
        return sb.toString();
    }
    public void delete(int index){
        int count=0;
        for(int num : this.arr){
            if(count == index){
              this.arr[index] = 0;
              break;
            }
            count++;
        }
    }
    public String search(int toFind){
        for(int i = 0; i<this.index;i++){
            if(this.arr[i]==toFind){
                return "Found " + toFind + " at index " + i;
            }
        }
        return "Not Found";
    }
}
