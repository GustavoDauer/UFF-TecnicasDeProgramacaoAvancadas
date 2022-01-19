/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package maxelementlist;

/**
 *
 * @author anselmomontenegro
 */
public class Person implements Comparable<Person>{

    protected int age;


    public Person(){

    }

    public Person(int _age){
        age = _age;
    }

    public int getAge(){
        return age;
    }

    public  int compareTo(Person o) {
        if (age>o.getAge())
            return 1;
        else if (age<o.getAge())
            return -1;
        else
            return 0;
    }
}
