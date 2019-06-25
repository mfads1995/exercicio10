/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio9;

/**
 *
 * @author ifnmg
 */
public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(String n, int i)throws IdadeInvalidaException{
        this.setIdade(i);
        this.setNome(n);
        
    }

    
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public int getidade(){
        return this.idade;
    }
    public void setIdade(int i) throws IdadeInvalidaException{
        if (i < 0){
            
            throw new IdadeInvalidaException("a idade tem que ser maior que zero");
        }
        
        this.idade = i;
        
    }
    
}
