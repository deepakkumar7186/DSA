import java.util.*;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// class Solution {
//     public List<Integer> preorderTraversal(TreeNode root) {
//         List<Integer> result = new ArrayList<>();
//         preorderTraversal(root, result);
//         return result;
//     }

//     public List<Integer> preorderTraversal(TreeNode root, List<Integer> result) {
//         if(root == null){
//             return;
//         }
//         System.out.println(root.val);
//         preorderTraversal(root.left,result);
//         preorderTraversal(root.right,result);
//     }
// }
//import java.util.*;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    private void preorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);          // Visit root
        preorder(root.left, result);   // Traverse left
        preorder(root.right, result);  // Traverse right
    }
}
