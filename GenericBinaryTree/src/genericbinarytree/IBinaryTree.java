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
public interface IBinaryTree<T> {
    void insert(T data);
    
    boolean search(T data);
    
    public Iterator<T> inOrderIterator();

    public Iterator<T> preOrderIterator();
    
    public Iterator<T> posOrderIterator();

    
    public void inOrder();
}
