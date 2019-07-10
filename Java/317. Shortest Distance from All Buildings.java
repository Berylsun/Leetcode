//m^2 * n^2, m*n
public int shortestDistance(int[][] grid) {
    if (grid == null || grid.length == 0) return -1;
    int m = grid.length;
    int n = grid[0].length;
    int[][] nums = new int[m][n];
    int[][] dist = new int[m][n];
    int buidingNum = 0;
    for (int i = 0; i < m ; i++) {
        for (int j = 0; j < n; j++) {
            if (grid[i][j] == 1) {
                buildingNum++;
                bfs(grid, i, j, dist, nums);
            }
        }
    }
    int res = Integer.MAX_VALUE;
    for (int i = 0; i < m ; i++) {
        for (int j = 0; j < n; j++) {
            if (grid[i][j] == 0 && dist[i][j] != 0 && nums[i][j] == buildingNum) {
                res = Math.min(res, dist[i][j]);
            }
        }
    }
    return res == Integer.MAX_VALUE ? -1 : res;
}

public void bfs(int[][]grid, int row, int col, int[][]dist, int[][]nums) {
    int m = grid.length;
    int n = grid[0].length;
    
    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new int[]{row, col});
    
    boolean[][]visited = new boolean[m][n];
    int[][]dirs = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    int distance = 0;
    
    while (!queue.isEmpty()) {
        distance++;
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            int[] cur = queue.poll();
            for (int k = 0; k < dirs.length; k++) {
                int x = cur[0] + dirs[k][0];
                int y = cur[1] + dirs[k][1];
                if (x >=0 && x < m && y >=0 && y < n && grid[x][y] == 0 && !visited[x][y]) {
                    visited[x][y] = true;
                    dist[x][y] += distance;
                    nums[x][y]++;
                    queue.offer(new int[]{x, y});
                }
            }
        }
    }
}
