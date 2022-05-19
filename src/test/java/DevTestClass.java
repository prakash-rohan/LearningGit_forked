import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DevTestClass {
    public static void main(String[] args) {
        System.out.println("Hello From Dev Class");

        List<Integer> numsList = new ArrayList<>(Arrays.asList(8,8,6,0,5,5,7,9,7,5,7));
        numsList.forEach(num -> System.out.print(num + "=>"));

        System.out.println();

    }
}
