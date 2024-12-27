import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class Spirally_traversing_a_matrix{
static ArrayList<Integer> spirallyTraverse(int mat[][]){
 ArrayList<Integer> result = new ArrayList<>();
        int top = 0, left = 0, bottom = mat.length - 1, right = mat[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) result.add(mat[top][i]);
            top++;
            for (int i = top; i <= bottom; i++) result.add(mat[i][right]);
            right--;
            if (top <= bottom)
                for (int i = right; i >= left; i--) result.add(mat[bottom][i]);
            bottom--;
            if (left <= right)
                for (int i = bottom; i >= top; i--) result.add(mat[i][left]);
            left++;
        }
        return result;
}
public static void main(String[] args){
	int [][]mat={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
	ArrayList<Integer> result=new ArrayList<>();
	result=spirallyTraverse(mat);
	System.out.println(result);
}
}
