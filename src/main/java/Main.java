import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> triangle = new ArrayList<>();
        triangle = solution.generate(5);
        printTriangle(triangle);
    }

    public static void printTriangle(List<List<Integer>> triangle) {

        // iterates each row
        for (int i = 0; i < triangle.size(); i++) {
            int sizeOfRow = triangle.get(i).size();
            // iterates numbers within each row
            for (int j = 0; j < sizeOfRow; j++) {
                System.out.print(triangle.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
