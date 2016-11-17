package edu.nwpu.lab430.JianZhiOffer;

/**
 * Created by laughing on 2016/11/17.
 *
 * 题目描述
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和
 * 中序遍历序列{4,2,7,1,5,3,8,6}，则重建二叉树并返回。
 *
 *
 * 注：
 * 前序:根→左→右
 * 中序:左→根→右
 * 后序:左→右→根
 */

//Definition for binary tree
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class ConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {

        return new TreeNode(1);
    }

    public int[] preOrderTraverse(TreeNode bt) {
        int[] elem = {0};
        return elem;
    }
    public int[] inOrderTraverse(TreeNode bt) {
        int[] elem = {0};
        return elem;
    }
    public int[] postOrderTraverse(TreeNode bt) {
        int[] elem = {0};
        return elem;
    }
    public static int length(TreeNode bt) {
        if (bt == null)
            return 0;
        else
            return 1 + length(bt.left) + length(bt.right);
    }


    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        a.left = b;
        a.right = c;
        System.out.println(length(a));

    }
}
