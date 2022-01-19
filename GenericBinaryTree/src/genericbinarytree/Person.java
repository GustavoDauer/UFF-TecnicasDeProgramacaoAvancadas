/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package genericbinarytree;

/**
 *
 * @author anselmomontenegro
 */
public class Person implements Comparable<Person>{
    protected String name;
    protected int age;


    public Person(){

    }

    public Person(String _name, int _age){
        name = _name;
        age = _age;
    }

    public int getAge(){
        return age;
    }
    
    public String getName(){
        return name;
    }

    @Override
    public  int compareTo(Person o) {
        if (age>o.getAge()) {
            return 1;
        }
        else if (age<o.getAge()) {
            return -1;
        }
        else {
            return 0;
        }
    }
    
    @Override
    public String toString(){
        
        return "Name:"+name+","+"Age:"+age;
    }
}
