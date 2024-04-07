package org.example;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;

public class BTLevelOrderTraversal {

    class TreeNode {
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

        rootNode.left = node30;
        rootNode.right = node20;

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

    public static void main(String[] args) {
        BTLevelOrderTraversal lot = new BTLevelOrderTraversal();
        TreeNode rootNode = lot.createBT();
        lot.traverse(rootNode);
    }

}
