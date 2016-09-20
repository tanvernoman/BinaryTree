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
public class TreeNode_ {
    private Integer value;
    private TreeNode_ left;
    private TreeNode_ right;

    public TreeNode_(Integer v) 
    {
        this.value=v;
        this.left=null;
        this.right=null;
    }
    
    //SET AND GET FOR VALUE
    
    public Integer setValue(Integer v)
    {
        this.value=v;
        return this.value;
    }
    /**
     * 
     * @return value of node
     */
    public Integer getValue()
    {
        return this.value;
    }
    
    public TreeNode_ setleft(TreeNode_ next)
    {
        this.left=next;
        return this.left;
    }
    /**
     * 
     * @return reference of left node
     */
    public TreeNode_ getLeft()
    {
        return this.left;
    }
    
    public TreeNode_ setRight(TreeNode_ next)
    {
        
        this.right=next;
        return this.right;
    }
    /**
     * 
     * @return reference of right node 
     */
    public TreeNode_ getRight()
    {
        return this.right;
    }
}
