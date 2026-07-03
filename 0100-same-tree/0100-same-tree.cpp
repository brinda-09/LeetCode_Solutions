/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    vector<optional<int>>arr1;
    vector<optional<int>>arr2;
    void p_tree(TreeNode*p){
        if(p==nullptr) {arr1.push_back(nullopt) ;return ;}
        arr1.push_back(p->val);
        p_tree(p->left);
        p_tree(p->right);
    }
    void q_tree(TreeNode*q){
        if(q==nullptr) {arr2.push_back(nullopt) ;return ;}
        arr2.push_back(q->val);
        q_tree(q->left);
        q_tree(q->right);
    }

    bool isSameTree(TreeNode* p, TreeNode* q) {
        p_tree(p);
        q_tree(q);
        if(arr1.size()!=arr2.size()) return false;
        for(int i=0;i<arr1.size();i++){
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
    }
};