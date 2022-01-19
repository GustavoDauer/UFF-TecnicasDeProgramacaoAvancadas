/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lisplikelist;

/**
 *
 * @author Anselmo
 */
public interface ILispListNode<T> {
    ILispListNode<T> cons(ILispListNode<? extends T> l1, ILispListNode<? extends T> l2);
    
    ILispListNode<T> cons(T atom, ILispListNode<? extends T> l2);
    
    ILispListNode<T> cons(T atom1, T atom2);
    
    ILispListNode<? extends T> car();
    
    ILispListNode<? extends T> cdr();
    
    boolean isAtom();
    
    public String toString();

}
