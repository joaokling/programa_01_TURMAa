
package com.mycompany.mavenproject2;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Estudante {

    private String nome;
    private Date dataNascimento;
    private String cpf;
    private char genero;
    private String matricula;
    private String email;

    public Estudante() {
        this.nome = "Nobody";

    }

    public int obterIdade(Date hoje) {
        int idade = 0;

        return idade;
     
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String _nome){
        this.nome = _nome;
    }

}
