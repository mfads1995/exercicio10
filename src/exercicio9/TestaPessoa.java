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
public class TestaPessoa {
    
    public static void main(String[] args){
        try{
        Pessoa p = new Pessoa("michael", -24);
        }catch(IdadeInvalidaException ex){
            System.out.print(ex.getMessage());
        }
    
}
}

