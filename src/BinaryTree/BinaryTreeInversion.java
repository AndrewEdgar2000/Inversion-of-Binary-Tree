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
        
        //Creating binary tree object 
        BinaryTree tree = new BinaryTree();
        
        //Declaring and adding nodes to BinaryTree object
        tree.root = new TreeNode(2);
        tree.root.left = new TreeNode(1);
        tree.root.right = new TreeNode(4);
        tree.root.right.left = new TreeNode(3);
        tree.root.left.right = new TreeNode(5);
        
        //Printing original order of tree (Not Inverted)
        System.out.println("Inorder traversal of input tree is: ");
        tree.printTree(tree.root);
        System.out.println("");
        
        //Inverting the tree using the invert function
        tree.invert();
        
        //Printing the inverted tree
        System.out.println("Inorder traversal of binary tree is: ");
        tree.printTree(tree.root);
    }
  
    
}
