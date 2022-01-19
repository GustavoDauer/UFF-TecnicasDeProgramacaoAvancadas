package lisplikelist;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Anselmo
 */
public class Empregado extends Pessoa{
    
    
    Empregado(String nome, int idade, double salario){
        super(nome,idade);
        this.salario = salario;
    }
    private double salario;
    
    public double getSalario(){
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

    @Override
    public String toString() {
        return "Empregado{" + "nome=" + nome + ", idade=" + idade + ", salario=" + salario + '}';
    }
    
}
