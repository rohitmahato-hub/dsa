public class Sept22 {
    public static void main(String args[]) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;
        int[][] queries = {{2, 2, 0, 2}, {3, 3, 3, 0}, {0, 1, 0, 1}};

        Sept22 obj = new Sept22();
        int[] result = obj.resultArray(nums, k, queries);

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
    static class Node {
        int prod;
        int[] remain;

        Node(int k) {
            this.remain = new int[k];
        }
    }

    private int k;
    private Node[] tree;
    private int n;

    public int[] resultArray(int[] nums, int k, int[][] queries) {
        this.k = k;
        this.n = nums.length;
        this.tree = new Node[4 * n];
        
       
        build(0, 0, n - 1, nums);
        
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int idx = queries[i][0];
            int val = queries[i][1];
            int start = queries[i][2];
            int xi = queries[i][3];
            
            update(0, 0, n - 1, idx, val);
            
            
            Node resNode = query(0, 0, n - 1, start, n - 1);
            
            result[i] = resNode.remain[xi];
        }
        
        return result;
    }

    private void build(int node, int start, int end, int[] nums) {
        if (start == end) {
            tree[node] = new Node(k);
            int valMod = nums[start] % k;
            tree[node].prod = valMod;
            tree[node].remain[valMod] = 1;
            return;
        }
        int mid = start + (end - start) / 2;
        build(2 * node + 1, start, mid, nums);
        build(2 * node + 2, mid + 1, end, nums);
        tree[node] = merge(tree[2 * node + 1], tree[2 * node + 2]);
    }

    private void update(int node, int start, int end, int idx, int val) {
        if (start == end) {
            tree[node] = new Node(k);
            int valMod = val % k;
            tree[node].prod = valMod;
            tree[node].remain[valMod] = 1;
            return;
        }
        int mid = start + (end - start) / 2;
        if (idx <= mid) {
            update(2 * node + 1, start, mid, idx, val);
        } else {
            update(2 * node + 2, mid + 1, end, idx, val);
        }
        tree[node] = merge(tree[2 * node + 1], tree[2 * node + 2]);
    }

    private Node query(int node, int start, int end, int l, int r) {
        if (l <= start && end <= r) {
            return tree[node];
        }
        int mid = start + (end - start) / 2;
        if (r <= mid) {
            return query(2 * node + 1, start, mid, l, r);
        }
        if (l > mid) {
            return query(2 * node + 2, mid + 1, end, l, r);
        }
        Node leftNode = query(2 * node + 1, start, mid, l, r);
        Node rightNode = query(2 * node + 2, mid + 1, end, l, r);
        return merge(leftNode, rightNode);
    }

   
    private Node merge(Node left, Node right) {
        Node res = new Node(k);
        res.prod = (left.prod * right.prod) % k;
    
        for (int i = 0; i < k; i++) {
            res.remain[i] += left.remain[i];
        }
        
       
        for (int j = 0; j < k; j++) {
            int target = (left.prod * j) % k;
            res.remain[target] += right.remain[j];
        }
        
        return res;
    }
}
