/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lisplikelist;

/**
 *
 * @author Anselmo
 */
public class Atom<T> extends LispListNode<T>{
    T data;

    Atom(){};

    Atom(T atom){
        data = atom;
    }


    public boolean isAtom(){
        return true;
    }

    public String toString(){
        return data.toString();
    }

    @Override
    public ILispListNode<T> car() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ILispListNode<T> cdr() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ILispListNode<T> cons(ILispListNode<? extends T> l1, ILispListNode<? extends T> l2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ILispListNode<T> cons(T atom, ILispListNode<? extends T> l2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ILispListNode<T> cons(T atom1, T atom2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
