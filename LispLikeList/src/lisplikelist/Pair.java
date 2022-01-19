/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lisplikelist;

/**
 *
 * @author Anselmo
 */
public  class Pair<T> extends LispListNode<T> {
    
    ILispListNode<? extends T> head;
    ILispListNode<? extends T> tail;

    Pair(){};

    Pair(ILispListNode<? extends T> l1, ILispListNode<? extends T> l2){
        head = l1;
        tail = l2;
    }

    public ILispListNode<T> cons(ILispListNode<? extends T> l1, ILispListNode<? extends T> l2) {
        return new Pair<T>(l1,l2);
    }
    

    public ILispListNode<? extends T> car() {
        return head;
    }

    public ILispListNode<? extends T> cdr() {
        return tail;
    }

    public boolean isAtom(){
        return false;
    }

    @Override
    public String toString(){
        String s1="";
        String s2=" null";

        if (head!=null) {
            s1 = head.toString();
        }

        if (tail!=null) {
            if (tail.isAtom()) {
                s2 = "." + tail.toString();
            }
            else {
                s2 = " " + tail.toString();
            }
        }

        return "("+s1+s2+")";
    }
}

