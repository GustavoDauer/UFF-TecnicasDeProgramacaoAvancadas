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
public class GenericBinaryTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        IBinaryTree<Person> personBinaryTree;
        personBinaryTree = new BinaryTree<>();
        
        personBinaryTree.insert(new Person("Carla",35));
        personBinaryTree.insert(new Person("Bruna",27));
        personBinaryTree.insert(new Person("Pedro",17));
        personBinaryTree.insert(new Person("Jose",43));
        personBinaryTree.insert(new Person("Antonio",50));
        personBinaryTree.insert(new Person("Lucia",5));
        personBinaryTree.insert(new Student("Joao",23));
        personBinaryTree.insert(new Student("Marcia",37));
        personBinaryTree.insert(new Student("Maria",36));
        personBinaryTree.insert(new Student("Paula",40));
        personBinaryTree.insert(new Student("Perla",10));
        personBinaryTree.insert(new Student("Paola",6));
        
        
        IBinaryTree<Student> studentBinaryTree = new BinaryTree<>();
        
        studentBinaryTree.insert(new Student("Claudio",13));
        
        
      //  personBinaryTree.inOrder();
        
        Iterator<Person> iterator = personBinaryTree.posOrderIterator();
        
        for(Iterator<Person> i = iterator;i.hasNext();){
            Person p = i.next();
            System.out.println(p.toString());
        } 
    }
}
