/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

import java.util.Random;

/**
 *
 * @author afnan
 */
public class BinaryTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        BinaryTree_ tree= new BinaryTree_();
        
        System.out.println(tree.isEmpty());
        System.out.println(tree.getRoot());
        System.out.println(tree.getNodeCount());
        
        System.out.println("------------------------");
        
        tree.insert(10);
        tree.insert(20);
        tree.insert(5);
        
         Random r= new Random();
        int number=0;
        for(int i=0; i<500; i++)
        {
            number= r.nextInt(2000);
            System.out.println("Random numbers are "+ number);
            tree.insert(number);
            
        }
        System.out.println("traversal in binary tree--------------------------------------");
        tree.inOrderTraversal();
        System.out.println("root value is "+ tree.getRoot().getValue());
        
      
        tree.find(5);
        
        //tree.numberOfNodes();
        System.out.println("Number of node in the tree : "+tree.numberOfNodes());
        
        System.out.println("Number of node in the tree : "+tree.getNodeCount());
        //tree.getNodeCount();
        
        System.out.println("Height of the tree : "+tree.height());
        
        System.out.println("Number of leaves in the tree : "+tree.numberOfLeaves());
        
        
    }
    
}
