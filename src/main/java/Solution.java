import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {

        // triangle that will be returned
        List<List<Integer>> triangle = new ArrayList();

        // if there are zero rows, just return the triangle
        if (numRows == 0) {
            return triangle;
        }

        // every triangle will have the same first row which is just 1
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        // iterate from 1 to numRows
        // from 1 because we have already instanciated our first row
        for (int i = 1; i < numRows; i++) {
            List<Integer> previousRow = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>();

            // every row starts with 1
            row.add(1);

            // using numbers from previous row to build new row
            for (int j = 1; j < i; j++) {
                row.add(previousRow.get(j - 1) + previousRow.get(j));
            }

            // every row ends with a 1
            row.add(1);

            // add new row to triangle
            triangle.add(row);
        }

        return triangle;
    }
}

