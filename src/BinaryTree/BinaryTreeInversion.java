/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BinaryTree;

/**
 *
 * @author edgar
 */
public class BinaryTreeInversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(2);
        tree.root.left = new TreeNode(1);
        tree.root.right = new TreeNode(4);
        tree.root.right.left = new TreeNode(3);
        tree.root.left.right = new TreeNode(5);
        
        System.out.println("Inorder traversal of input tree is: ");
        tree.printTree(tree.root);
        System.out.println("");
        
        tree.invert();
        
        System.out.println("Inorder traversal of binary tree is: ");
        tree.printTree(tree.root);
    }
  
    
}
