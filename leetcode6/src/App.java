/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


public class App {
    
    public class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode (int x) {val = x;}
    }
    
    TreeNode result;
    
    public TreeNode lowestCommonAncestor (TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q) {
            result = root;
            return result;
        } else if (root.left == p || root.right == p || root.left == q || root.right == q) {
            result = root;
        }
        if (root.left != null) {
            root.left = lowestCommonAncestor(root.left, p, q);
            if (result != null) return result;
        } else if (root.right != null) {
            root.right = lowestCommonAncestor(root.right, p, q);
            if (result != null ) return result;
        }
        return root;
    }
    
    
    
    public static void main(String[] args) throws Exception {
       App app = new App();
    }
}
