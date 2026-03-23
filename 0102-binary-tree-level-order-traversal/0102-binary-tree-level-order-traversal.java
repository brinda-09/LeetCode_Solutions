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
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> li=new LinkedList<List<Integer>>();
        if(root==null)
        return li;
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> subli=new LinkedList<Integer>();
            for(int i=0;i<size;i++){
                if(queue.peek().left!=null)
                queue.add(queue.peek().left);
                if(queue.peek().right!=null)
                queue.add(queue.peek().right);
                subli.add(queue.poll().val);
            }
            li.add(subli);
        }
        return li;
    }
}