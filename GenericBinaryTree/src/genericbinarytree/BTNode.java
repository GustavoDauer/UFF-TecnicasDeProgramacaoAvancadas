/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package genericbinarytree;

/**
 *
 * @author Anselmo
 */
public class BTNode<T extends Comparable<? super T>>{
    private T data;
    public BTNode<T> left;
    public BTNode<T> right;

    BTNode(T _data){
        data = _data;
        left = null;
        right = null;
    }

    public T getData(){
        return data;
    }

    public void setData (T _data){
        data = _data;
    }
}
