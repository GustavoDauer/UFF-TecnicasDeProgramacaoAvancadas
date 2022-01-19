/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package countgreaterthan;

/**
 *
 * @author Anselmo
 */
public class CountGreaterThan {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Empregado[] empregados = new Empregado[3];
        empregados[0] = new Empregado("anselmo",40,3000);
        empregados[1] = new Empregado("carlos",39,2000);
        empregados[2] = new Empregado("paulo",20,5000);
        
        Pessoa[] pessoas = new Pessoa[3];
        pessoas[0] = new Pessoa("pedro",40);
        pessoas[1] = new Pessoa("jose",23);
        pessoas[2] = new Pessoa("maria",21);
        
        
        System.out.println(Utils.countGreaterThan(empregados, empregados[0]));
        //System.out.println(Utils.countGreaterThan(pessoas, pessoas[0]));
        
        
        
    }
}
