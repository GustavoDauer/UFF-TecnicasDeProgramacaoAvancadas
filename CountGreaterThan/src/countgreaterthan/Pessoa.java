/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package countgreaterthan;

/**
 *
 * @author Anselmo
 */
public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    
    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public int compareTo(Pessoa pessoa){
        if (this.getIdade()>pessoa.getIdade()){
            return 1;
        }
        else if (this.getIdade()>pessoa.getIdade()){
            return -1;
        }
        else {
            return 0;
        }
    }
}
