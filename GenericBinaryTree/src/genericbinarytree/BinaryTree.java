/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package genericbinarytree;

import java.util.Iterator;


/**
 *
 * @author Anselmo
 */
public class BinaryTree<T extends Comparable<? super T>> implements IBinaryTree<T> {
    private BTNode<T> root;
    
    private BTNode<T> insert(BTNode<T> subtree, BTNode<T> node){
        if (subtree==null){
            subtree = node;
        }
        else if (subtree.getData().compareTo(node.getData())>0){
            subtree.left = insert(subtree.left,node);
        }
        else if (subtree.getData().compareTo(node.getData())<0){
            subtree.right = insert(subtree.right,node);
        }
        
        return subtree;
    } 
    
    private BTNode<T> search(BTNode<T> subtree, T data){
        if (subtree==null){
          return null;
        }

        BTNode<T> node = null;

        if (subtree.getData().compareTo(data)>0){
            node = search(subtree.left,data);
        }
        else if (subtree.getData().compareTo(data)<0){
            node = search(subtree.right,data);
        }

        return node;
    }
    
    private BTNode<T> deleteNode(BTNode<T> subtree, T data){
    
        if (subtree==null){
          return null;
        }

        BTNode<T> node = null;

        if (subtree.getData().compareTo(data)>0){
            node = search(subtree.left,data);
        }
        else if (subtree.getData().compareTo(data)<0){
            node = search(subtree.right,data);
        }
        else{
            if ((subtree.left!=null) && (subtree.right!=null)){
                node = findLeftMostChild(subtree.right);
                subtree.setData(node.getData());
                subtree.right = deleteNode(subtree.right,node.getData());
            }
            else if (subtree.left!=null){
                subtree = subtree.left;
            }
            else{
                subtree = subtree.right; 
            }
            
        }

        return node;
    }
    
    private BTNode<T> findLeftMostChild(BTNode<T> subtree){
        assert (subtree != null);
        while (subtree.left != null) {
            subtree = subtree.left;
        }
        return subtree;
    }
    
    
    private void inOrder(BTNode<T> subtree){
        if (subtree==null){
            return;
        }
        
        inOrder(subtree.left);
        System.out.println(subtree.getData());
        inOrder(subtree.right);
    }
    
    BTNode<T> getRoot(){
        return root;
    }
        
    BinaryTree(){};
    
    BinaryTree(T data){
        root = new BTNode(data);
    }
        
    public void insert(T data){
        BTNode<T> newNode = new BTNode<>(data);
        root =  insert(root, newNode);
    }
    
    public boolean search(T data){    
        if (search(root,data)==null){
            return false;
        }
        else{
            return true;
        }
    }
    
    public Iterator<T> inOrderIterator(){
        return new BinaryTreeInOrderIterator<T>(this);
    }
    
    public Iterator<T> preOrderIterator(){
        return new BinaryTreePreOrderIterator<T>(this);
    }    
    
    public Iterator<T> posOrderIterator(){
        return new BinaryTreePosOrderIterator<T>(this);
    }    
    
    public void inOrder(){
        inOrder(root);
    }
    
    
}
