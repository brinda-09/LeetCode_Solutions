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
    private void inorder(TreeNode root,List<Integer> vals){
        if(root==null)
        return;
        inorder(root.left,vals);
        vals.add(root.val);
        inorder(root.right,vals);
    }
    private TreeNode build(List<Integer> vals,int l,int r){
        if(l>r)
        return null;
        int mid=(l+r)/2;
        TreeNode node=new TreeNode(vals.get(mid));
        node.left=build(vals,l,mid-1);
        node.right=build(vals,mid+1,r);
        return node;

    }
    public TreeNode balanceBST(TreeNode root) {  
         List<Integer> vals=new ArrayList<>();
         inorder(root,vals);
         return build(vals,0,vals.size()-1);
    }
}