package genericbinarytree;

import java.util.Iterator;
import java.util.Stack;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anselmo
 */
public class BinaryTreePosOrderIterator<T extends Comparable<? super T>> implements Iterator{
    T next;
    Stack<Pair<BTNode<T>,Integer>> stack;
    
    private void pushTillPutNextOnTop(BTNode<T> subtree){
        /* Insere todos os nos na pilha até encontrar um nó folha.
         * Nós com o ramo direito explorado tem o contador de visitas igual
         * a dois. Nós com ramo direito não explorado tem contador de visitas
         * igual a 1. Nós com contador igual a 2, quando sacados da pilha,
         * podem ser retornados como next,porque suas árvores direita e esquerda
         * já foram visitadas.
        */
        BTNode<T> aux = subtree;
        while (aux!=null){
            if (aux.left!=null){
                stack.push(new Pair<BTNode<T>,Integer>(aux,1));
                aux = aux.left;
            }
            else{
                stack.push(new Pair<BTNode<T>,Integer>(aux,2));
                /* pega o proximo no a esquerda */
                aux = aux.right;
            }
        }
        
    }
    
    BinaryTreePosOrderIterator(BinaryTree<T> binTree){
        stack = (Stack<Pair<BTNode<T>,Integer>>) new Stack<Pair<BTNode<T>,Integer>>();
        
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
            Pair<BTNode<T>,Integer> nextPair = stack.pop();
            BTNode<T> next = nextPair.getComponent1();
            
            /* Se o no tem contador de visitas igual a 1 e a árvore direita não foi
             * esplorada, então ele não é o next. Ele é re-inserido com contador
             * igual a 2 e o novo next é buscado na árvore direita. Nós com
             * contador de visitas igual a 2 ou que não tem subárvore direita são 
             * considerados next.
             */
            if (nextPair.getComponent2()==1 && next.right!=null){
                stack.push(new Pair<BTNode<T>,Integer>(next,2));
                
                pushTillPutNextOnTop(next.right);
                next = stack.pop().getComponent1();
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
