/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package countgreaterthan;

/**
 *
 * @author Anselmo
 */
public class Empregado extends Pessoa{
    
    
    Empregado(String nome, int idade, int salario){
        super(nome,idade);
        this.salario = salario;
    }
    private int salario;
    
    public int getSalario(){
        return salario;
    }
    
    int compareTo(Empregado empregado){
        if (this.getSalario()>empregado.getSalario()){
            return 1;
        }
        else if (this.getSalario()>empregado.getSalario()){
            return -1;
        }
        else {
            return 0;
        }
    }
    
}
