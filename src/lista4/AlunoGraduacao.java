/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4;

                            //Herança
public class AlunoGraduacao extends Aluno {   
    private String anoConclusaoEnsinoMedio;
    
    //Consturtor Vazio
    public AlunoGraduacao() {
    }
    
    //Construtor herdando classe Pai + o parâmetro da sua própria classe
    public AlunoGraduacao(String anoConclusaoEnsinoMedio, String ra, String nome, String curso) {
        super(ra, nome, curso);
        this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
    }

    @Override    //Polimorfismo de sobrescrita
    public String toString() {
        return "----------Aluno Graduação---------" + super.toString() + "Ano Conclusão Ensino Medio: " + this.anoConclusaoEnsinoMedio;
    }

    // Método get e set
    public String getAnoConclusaoEnsinoMedio() {
        return anoConclusaoEnsinoMedio;
    }

    public void setAnoConclusaoEnsinoMedio(String anoConclusaoEnsinoMedio) {
        this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
    }
    
    
    
}
