package edu.nwpu.lab430.JianZhiOffer;

/**
 * Created by laughing on 2016/11/17.
 *
 * ��Ŀ����
 * ����ĳ��������ǰ���������������Ľ�������ؽ����ö�������
 * ���������ǰ���������������Ľ���ж������ظ������֡�
 * ��������ǰ���������{1,2,4,7,3,5,6,8}��
 * �����������{4,2,7,1,5,3,8,6}�����ؽ������������ء�
 *
 *
 * ע��
 * ǰ��:���������
 * ����:���������
 * ����:����ҡ���
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
