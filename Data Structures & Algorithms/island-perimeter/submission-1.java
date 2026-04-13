class Solution {
    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visit = new boolean[n][m];

        int[] deltaRow = new int[]{-1,1,0,0};
        int[] deltaCol = new int[]{0,0,-1,1};
        int perimeter = 0;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {  // zameen mili
                 for (int d = 0; d < 4; d++) {
                    int newRow = i + deltaRow[d];
                    int newCol = j + deltaCol[d];

                // boundary hai ya paani hai → fence laga
                    if (newRow < 0 || newRow >= n
                        || newCol < 0 || newCol >= m
                        || grid[newRow][newCol] == 0) {
                    perimeter++;
                }
            }
        }
    }
}

return perimeter;
    }
}