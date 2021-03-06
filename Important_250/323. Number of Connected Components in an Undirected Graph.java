//edges * nodes, n
Union Find!!!

public int countComponents(int n, int[][] edges) {
    int res = n;
    
    int[] roots = new int[n];
    Arrays.fill(roots, -1);
    
    for (int[] pair : edges) {
        int x = find(roots, pair[0]);
        int y = find(roots, pair[1]);
        
        if (x != y) {
            roots[x] = y;
            res--;
        }
    }
    
    return res;
}

public int find(int[] roots, int i) {
    while (roots[i] != -1) {
        i = roots[i];
    }
    
    return i;
}
