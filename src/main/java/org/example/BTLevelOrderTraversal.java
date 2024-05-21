package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class BTLevelOrderTraversal {

    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    public TreeNode createBT() {
        TreeNode rootNode = new TreeNode(60);
        TreeNode node40 = new TreeNode(40);
        TreeNode node30 = new TreeNode(30);
        TreeNode node20 = new TreeNode(20);
        TreeNode node50 = new TreeNode(50);
        TreeNode node70 = new TreeNode(70);

        rootNode.left = node30;
        rootNode.right = node20;

        node30.left = node50;
        node30.right = node70;

        node20.right = node40;

        return rootNode;
    }

    public void traverse(TreeNode root) {
        Queue<TreeNode> treeQueue = new LinkedList<TreeNode>();
        treeQueue.add(root);

        while (!treeQueue.isEmpty()) {
            TreeNode treeNode = treeQueue.poll();
            System.out.print(" " + treeNode.data);

            if (treeNode.left != null) {
                treeQueue.add(treeNode.left);
            }

            if (treeNode.right != null) {
                treeQueue.add(treeNode.right);
            }
        }
    }

    public void inOrderTraversal(TreeNode root) {
        if(root != null){
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    public void preOrderTraversal(TreeNode root) {
        if(root != null){
            System.out.print(root.data + " ");
            inOrderTraversal(root.left);
            inOrderTraversal(root.right);
        }
    }

    public void postOrderTraversal(TreeNode root) {
        if(root != null){
            inOrderTraversal(root.left);
            inOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        BTLevelOrderTraversal lot = new BTLevelOrderTraversal();
        TreeNode rootNode = lot.createBT();
        lot.traverse(rootNode);
        System.out.println();
        System.out.println("---------------IN ORDER Traversal-------------------------");
        lot.inOrderTraversal(rootNode);
        System.out.println();
        System.out.println("___________________PRE ORDER Traversal____________________");
        lot.preOrderTraversal(rootNode);
        System.out.println();
        System.out.println("---------------------POST ORDER Traversal-----------------");
        lot.postOrderTraversal(rootNode);
    }

}
