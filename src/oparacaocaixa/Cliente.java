/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oparacaocaixa;

/**
 *
 * @author Vinicius
 */
public class Cliente {

    public Cliente(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }
    private int idade;
    private String nome;

   

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
     @Override
    public String toString() {
        return "Cliente{" + "idade=" + idade + ", nome=" + nome + '}';
    }
    
}
