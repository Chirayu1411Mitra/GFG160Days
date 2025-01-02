public class set_matrix_zero{
	 static void setMatrixZeroes(int[][] mat) {
        int n = mat.length, m = mat[0].length, col0 = 1;
        for (int i = 0; i < n; i++) {
            if (mat[i][0] == 0) col0 = 0;
            for (int j = 1; j < m; j++) {
                if (mat[i][j] == 0) {
                    mat[i][0] = 0;
                    mat[0][j] = 0;
                }
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 1; j--) {
                if (mat[i][0] == 0 || mat[0][j] == 0) {
                    mat[i][j] = 0;
                }
            }
            if (col0 == 0) mat[i][0] = 0;
        }
}
      public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };
        
        setMatrixZeroes(matrix);
        
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
