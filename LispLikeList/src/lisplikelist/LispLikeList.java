/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lisplikelist;

/**
 *
 * @author Anselmo
 */
public class LispLikeList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    
    ILispListNode<Number> l1 = new LispListNode<Number>();
    
    l1 = l1.cons(new Double(5.3),(ILispListNode<Number>)null);
    l1 = l1.cons(3,l1);
    
    ILispListNode<Object> l2 = new LispListNode<Object>();
    
    l2 = l2.cons("A",(ILispListNode<Object>)null);
    l2 = l2.cons("B",l2);
    l2 = l2.cons(l1,l2);
    
    ILispListNode<Pessoa> l3 = new LispListNode<Pessoa>();
    
    l3 = l3.cons(new Pessoa("Anselmo",40), (ILispListNode<Pessoa>)null);
    
    l3 = l3.cons(new Empregado("Jose",55,15000.00), l3);
    
    l2 = l2.cons(l3, l2);
        
    System.out.println(l2.toString());
    System.out.println(l2.car());
    System.out.println(l2.cdr());
    System.out.println(l2.cdr().car());
     
    }
}
