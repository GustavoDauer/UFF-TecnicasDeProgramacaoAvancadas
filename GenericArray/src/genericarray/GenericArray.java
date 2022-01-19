/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package genericarray;

/**
 *
 * @author Anselmo
 */
public class GenericArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GenArray<String> genArray = new GenArray(String[].class,1);
        
        genArray.a[0] = "anselmo";
        
        System.out.println(genArray.a[0]);
    }
}
