/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4;

                               //Herança
public class AlunoPosGraduacao extends Aluno{
    private String anoConclusaoGraduacao;
    
    //Construtor vazio
    public AlunoPosGraduacao() {
    }
    
    //Construtor herdando classe Pai + o parâmetro da sua própria classe
    public AlunoPosGraduacao(String anoConclusaoGraduacao, String ra, String nome, String curso) {
        super(ra, nome, curso);
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
    }

    @Override     //Polimorfismo de sobrescrita
    public String toString() {
       return "----------Aluno Pos Graduação---------" + super.toString() + "Ano Conclusão Graduação: " + this.anoConclusaoGraduacao;
    }
    
    //Método get e set
    public String getAnoConclusaoGraduacao() {
        return anoConclusaoGraduacao;
    }

    public void setAnoConclusaoGraduacao(String anoConclusaoGraduacao) {
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
    }
    
    
    
    
}
