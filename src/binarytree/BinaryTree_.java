/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author afnan
 */
public class BinaryTree_ {

    private TreeNode_ root;
    private int numberOfNodes = 0;

    public BinaryTree_() {
        this.root = null;
        this.numberOfNodes = 0;
    }

    /**
     *
     * @return true if tree is empty
     */
    public boolean isEmpty() {
        return (numberOfNodes == 0);
    }

    /**
     *
     * @return Reference of root node
     */
    public TreeNode_ getRoot() {
        return this.root;
    }

    /**
     *
     * @return Number of node in the tree
     */
    public int getNodeCount() {
        return this.numberOfNodes;
    }

    /**
     *
     * @return Number of node in the tree
     */
    public int numberOfNodes() {
        return countNodes(root);
    }

    private int countNodes(TreeNode_ root) {
        if (root == null) {
            return 0;

        } else {
            return (1 + countNodes(root.getLeft()) + countNodes(root.getRight()));
        }
    }

    /**
     *
     * @return height of tree or levels of tree
     */
    public int height() {
        return numLevels(root);
    }

    private int numLevels(TreeNode_ root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(numLevels(root.getLeft()), numLevels(root.getRight()));
        }
    }

    /**
     *
     * @return number of leaves in the tree
     */
    public int numberOfLeaves() {
        return countLeaves(root);
    }

    private int countLeaves(TreeNode_ root) {
        if (root == null) {
            return 0;
        } else if (root.getLeft() == null && root.getRight() == null) {
            return 1;
        } else {
            return countLeaves(root.getLeft()) + countLeaves(root.getRight());
        }

    }

    /**
     * Insert a node in the tree
     *
     * @param newValue is a node
     * @return Number of node inserted
     */
    public int insert(int newValue) {
        TreeNode_ temp;
        TreeNode_ current;
        TreeNode_ parent;

        if (this.root == null)//tree is empty
        {
            temp = new TreeNode_(newValue);
            this.root = temp;
            this.numberOfNodes++;
        } else//when tree is not empty
        {
            temp = new TreeNode_(newValue);
            current = root;

            while (true) {
                parent = current;
                if (newValue < current.getValue()) {
                    //go left
                    current = current.getLeft();
                    if (current == null) {
                        parent.setleft(temp);
                        return this.numberOfNodes++;
                    }
                } else {
                    //go right

                    current = current.getRight();
                    if (current == null) {
                        parent.setRight(temp);
                        return this.numberOfNodes++;
                    }//end if
                }//end else
            }//end while
        }//end else
        return this.numberOfNodes++;
    }

    //
    // 
    /**
     * In order traversal traverse left node , root node, right node
     */
    public void inOrderTraversal() {
        inOrderT(this.root);
    }

    protected void inOrderT(TreeNode_ tNode) {
        if (tNode != null) {
            //recursive method to get into the tree 
            inOrderT(tNode.getLeft());
            System.out.println(tNode.getValue());
            inOrderT(tNode.getRight());

        }
    }
    
    /**
     * pre order traversal 
     * root ,left , right
     */
    public void preOrderTraversal() {
        preOrderT(this.root);
    }
    protected void preOrderT(TreeNode_ tNode) {
        if (tNode != null) {
            System.out.println(tNode.getValue());
            preOrderT(tNode.getLeft());
            preOrderT(tNode.getRight());
        }
    }

    /**
     * post order traversal
     * left , right  root
     */
    public void postOrderTravesal() {
        postOrderT(this.root);
    }
    protected void postOrderT(TreeNode_ tNode) {
        if (tNode != null) {
            tNode.getLeft();
            tNode.getRight();
            System.out.println(tNode.getValue());
        }
    }

    

    /**
     * this is search function to find a number inside the tree and return it
     *
     * @param id
     * @return true if number is in the list and false if number is not in the
     * list
     */
    //http://algorithms.tutorialhorizon.com/binary-search-tree-complete-implementation/
    public BinaryTree_ find(Integer id) {
        TreeNode_ current = root;
        while (current != null) // when root node not null then do following 
        {
            if (current.getValue() == id) {
                System.out.println(current + "found ");
                break;
            } else if (current.getValue() > id) {
                current = current.getLeft();
                if (current.getValue() == id) {

                    System.out.println(current.getValue() + "found");
                } else {
                    System.out.println("value not found");
                }
                break;
            } else {

                current = current.getRight();

                if (current.getValue() == id) {
                    System.out.println(current.getValue() + "value found");
                } else {
                    System.out.println("Value not found in the list");
                }
                break;
            }
        }
        return this;
    }
}
//http://www.code2learn.com/2013/02/binary-search-tree-bst-algorithm.html

