/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4;

/**
 *
 * @author Usuário
 */
public class AlunoPosGraduacao extends Aluno{
    private String anoConclusaoGraduacao;

    public AlunoPosGraduacao() {
    }

    public AlunoPosGraduacao(String anoConclusaoGraduacao, String ra, String nome, String curso) {
        super(ra, nome, curso);
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
    }

    @Override
    public String toString() {
       return "----------Aluno Pos Graduação---------" + "\nCurso: " + getCurso() + "\nNome: " + getNome() 
               + "\nRA: " + getRa() + "\nAno de conclusão: " + this.anoConclusaoGraduacao;
    }
    

    public String getAnoConclusaoGraduacao() {
        return anoConclusaoGraduacao;
    }

    public void setAnoConclusaoGraduacao(String anoConclusaoGraduacao) {
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
    }
    
    
    
    
}
