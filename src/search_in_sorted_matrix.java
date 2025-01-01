public class search_in_sorted_matrix{
 static boolean searchMatrix(int[][] mat, int x) {
        int n = mat.length, m = mat[0].length, l = 0, r = n * m - 1;
        while (l <= r) {
            int mid = (l + r) / 2, val = mat[mid / m][mid % m];
            if (val == x) return true;
            if (val < x) l = mid + 1;
            else r = mid - 1;
        }
        return false;
    }

	public static void main(String[] args){

	
        int[][] mat = {
            {1, 3, 5},
            {7, 10, 11},
            {12, 14, 15}
        };

        int target = 10;  // Change this to test different values.

        if (searchMatrix(mat, target)) {
            System.out.println(target + " is found in the matrix.");
        } else {
            System.out.println(target + " is not found in the matrix.");
        }
    }
}


