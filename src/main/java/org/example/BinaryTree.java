package org.example;

public class BinaryTree {

    public static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    public static TreeNode createBT() {
        TreeNode rootNode = new TreeNode(40);
        TreeNode node20 = new TreeNode(20);
        TreeNode node30 = new TreeNode(30);
        TreeNode node50 = new TreeNode(50);
        TreeNode node60 = new TreeNode(60);
        TreeNode node70 = new TreeNode(70);
        TreeNode node80 = new TreeNode(80);

        rootNode.left = node20;
        rootNode.right = node30;

        node20.left = node50;
        node20.right = node60;

        node30.left=node70;
        node30.right=node80;

        return rootNode;

    }

    public void traverseBT(TreeNode root){
        if(root!=null){

            traverseBT(root.left);
            System.out.print(" "+root.data);
            traverseBT(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        TreeNode root = createBT();
        bt.traverseBT(root);
    }


}
