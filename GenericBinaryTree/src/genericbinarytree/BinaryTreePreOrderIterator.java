/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package genericbinarytree;

import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author Anselmo
 */
public class BinaryTreePreOrderIterator<T extends Comparable<? super T>> implements Iterator{
    T next;
    Stack<BTNode<T>> stack;
    
    BinaryTreePreOrderIterator(BinaryTree<T> binTree){
        stack = (Stack<BTNode<T>>) new Stack<BTNode<T>>();
        
        BTNode<T> root = binTree.getRoot();
        stack.push(root);    
    }
    
    @Override
    public boolean hasNext(){
        if (stack.isEmpty()) {
            return false;
        }
        else {
            return true;
        }   
    }

    @Override
    public Object next() {
        if (hasNext()){
            BTNode<T> next = stack.pop();
            if (next.right!=null){
                stack.push(next.right);
            }
            if (next.left!=null){
                stack.push(next.left);
            }

            return next.getData();
        }
        else
            return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
