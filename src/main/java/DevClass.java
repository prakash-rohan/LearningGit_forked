import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DevClass {
    public static void main(String[] args) {
        System.out.println("Hello From Dev Class");
        List<Integer> nums = new ArrayList<>(Arrays.asList(1,9,2,3,9,5,1,3,9,7));

        // printing the raw numbers
        nums.forEach(num -> System.out.println(num + "->"));
        
        
        
        // Have addes some codes to print the sorted Arrays too;
        Collections.sort(nums);
        System.out.println("\n");
        nums.forEach(num -> System.out.println(num + "->"));

        // how do we sort Rohan ?

    }
}
