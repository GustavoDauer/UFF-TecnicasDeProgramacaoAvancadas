/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package maxelementlist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anselmomontenegro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
   /*public static <T extends Object & Comparable<? super T>>
        T max(List<? extends T> list, int begin, int end) {

        T maxElem = list.get(begin);

        for (++begin; begin < end; ++begin)
            if (maxElem.compareTo(list.get(begin)) < 0)
                maxElem = list.get(begin);
        return maxElem;
    }*/

    public static <T extends Object & Comparable<? super T>>  T max(List<? extends T> list,int begin, int end){

        T maxElem = list.get(begin);

        for (++begin; begin < end; ++begin)
            if (maxElem.compareTo(list.get(begin)) < 0)
                maxElem = list.get(begin);

        return maxElem;
    }

    public static void main(String[] args) {
        // TODO code application logic here

        List<Person> l0 = new ArrayList<Person>();

        l0.add(new Person(5));
        l0.add(new Student(17));
        l0.add(new Professor(22));
        l0.add(new Professor(45));
        l0.add(new Student(21));
        l0.add(new Professor(35));

        Person maxPerson = max(l0,0,5);
        System.out.println(maxPerson.getAge());

        List<Student> l1 = new ArrayList<Student>();

        l1.add(new Student(5));
        l1.add(new Student(17));
        l1.add(new Student(22));
        l1.add(new Student(45));
        l1.add(new Student(21));
        l1.add(new Student(35));


        maxPerson = max(l1,0,5);
        System.out.println(maxPerson.getAge());


    }

}
