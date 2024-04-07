package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class HeightOfBT {

    class Tree {
        int data;
        Tree left, right;

        Tree(int data) {
            this.data = data;
        }
    }

    public Tree createBT() {
        Tree rootNode = new Tree(80);
        Tree node70 = new Tree(70);
        Tree node60 = new Tree(60);
        Tree node50 = new Tree(50);

        rootNode.left = node70;
        rootNode.right = node60;
        node70.right = node50;

        return rootNode;
    }

    public int traverse(Tree root) {
        Queue<Tree> treeQueue = new LinkedList<>();
        treeQueue.add(root);
        int numberOfLevels = -1;

        while (true) {
            int nodeCountAtLevel = treeQueue.size();
            if (nodeCountAtLevel == 0) {
                return numberOfLevels;
            }
            while (nodeCountAtLevel > 0) {
                Tree data = treeQueue.poll();
                if (data.left != null) {
                    treeQueue.add(data.left);
                }
                if (data.right != null) {
                    treeQueue.add(data.right);
                }
                nodeCountAtLevel--;
            }
            numberOfLevels++;

        }
    }

    public static void main(String[] args) {
        HeightOfBT hbt = new HeightOfBT();
        Tree root = hbt.createBT();
        System.out.println("Height of tree is " + hbt.traverse(root));
    }

}
