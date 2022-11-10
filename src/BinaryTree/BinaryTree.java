/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryTree;

/**
 *
 * @author edgar
 */
public class BinaryTree {
    
    TreeNode root;
    
    public void invert(){
        root = invert(root);
    }
    
    public TreeNode invert(TreeNode node){
        if (node == null){
            return node;
        }
        
        //Recursive calls 
        TreeNode left = invert(node.left);
        TreeNode right = invert(node.right);
        
        //Swap the left and right pointers
        node.left = right;
        node.right = left; 
        
        return node;
    }
    
    public void printTree (TreeNode node){
        if (node == null) {
            return;
        }
        
        printTree(node.left);
        System.out.println(node.data + " ");
        
        printTree(node.right);
    }
    
    
}
