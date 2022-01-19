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
public class BinaryTreeInOrderIterator<T extends Comparable<? super T>> implements Iterator{
    T next;
    Stack<BTNode<T>> stack;
    
    private void pushTillPutNextOnTop(BTNode<T> subtree){
        BTNode<T> aux = subtree;
        while (aux!=null){
            stack.push(aux);
            aux = aux.left;  
        }
    }
    
    BinaryTreeInOrderIterator(BinaryTree<T> binTree){
        stack = (Stack<BTNode<T>>) new Stack<BTNode<T>>();
        
        BTNode<T> root = binTree.getRoot();
        BTNode<T> aux = root;
        stack.clear();
        
        pushTillPutNextOnTop(root);
        
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
                BTNode<T> aux = next.right;
                stack.push(aux);
                pushTillPutNextOnTop(aux.left);
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
