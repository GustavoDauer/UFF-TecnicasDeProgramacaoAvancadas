/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lisplikelist;

/**
 *
 * @author Anselmo
 */
public class Aluno extends Pessoa{
    private int matricula;
    private double cr;
    
    
    Aluno(String nome, int idade, int matricula, double cr){
        super(nome,idade);
        this.matricula = matricula;
        this.cr = cr;
        
    }
}
