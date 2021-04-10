/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4;


public class Aluno {
    
    private String ra;
    private String nome;
    private String curso;
    
    //Construtor Vazio
    public Aluno() {
    }
    
    //Construtor com parâmetros
    public Aluno(String ra, String nome, String curso) {
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
    }

    @Override     //Polimorfismo de sobrescrita
    public String toString() {
        return "\nCurso: " + getCurso() + "\nNome: " + getNome() + "\nRA: " + getRa() + "\n";
    }
    
    //Métodos get e set
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    
}
