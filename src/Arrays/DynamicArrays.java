package Arrays;

import java.util.ArrayList;
import java.util.List;

public class DynamicArrays {
    public static void main(){

        //Normal Method

        List<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(13);
        System.out.println(arr.getFirst());

        // Custom arr method

        CustomArray newarr = new CustomArray(5);
        newarr.insert(1);
        newarr.insert(2);
        newarr.insert(3);
        newarr.insert(4);
        newarr.insert(5);
        newarr.delete(0);
        String found = newarr.search(5);
        System.out.println(found);
        System.out.println(newarr);
    }
}
