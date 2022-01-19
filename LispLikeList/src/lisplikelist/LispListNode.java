/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lisplikelist;

/**
 *
 * @author Anselmo
 */



public class LispListNode<T> implements ILispListNode<T>{
               
    public ILispListNode<T> cons(ILispListNode<? extends T> l1, ILispListNode<? extends T> l2){
        return new Pair<T>(l1,l2);
    };
    
    public ILispListNode<T> cons(T atom, ILispListNode<? extends T> l2){
        return new Pair<T>(new Atom<T>(atom),l2);
    };
    
    public ILispListNode<T> cons(T atom1, T atom2){
        return new Pair<T>(new Atom<T>(atom1),new Atom<T>(atom2));
    }
    
    public  boolean isAtom(){return false;};
    
    public ILispListNode<? extends T> car(){return null;};
    
    public  ILispListNode<? extends T> cdr(){return null;};
    
    @Override
    public String toString(){
        String s="";
        return s;
    }
    
}        
