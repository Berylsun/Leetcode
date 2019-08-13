// V + E, n
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        for (int[] pair : prerequisites) {
            indegree[pair[0]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        int[] res = new int[numCourses];
        int k = 0;
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
                res[k++] = i;
            }
        }
        while (!queue.isEmpty()) {
            int pre = queue.poll();
            for (int[] pair : prerequisites) {
                if (pair[1] == pre) {
                    indegree[pair[0]]--;
                    if (indegree[pair[0]] == 0) {
                        res[k++] = pair[0];
                        queue.offer(pair[0]);
                    }
                }
            }
        }
        return (k == numCourses) ? res : new int[0];
    }
}
