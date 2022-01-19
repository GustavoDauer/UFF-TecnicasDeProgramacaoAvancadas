/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package genericarray;

import java.lang.reflect.Array;

/**
 *
 * @author Anselmo
 */
public class GenArray<E>  
{  
   public E[ ] a;  

   public GenArray(Class<E[ ]> clazz, int length)  
   {  
      a = clazz.cast(Array.newInstance(clazz.getComponentType( ), length));  
   }  
}
