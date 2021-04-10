/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
       int opc = 0, tipo;
       String nome = null, ra , curso, ano;
       ArrayList<Aluno> listAluno = new ArrayList<>();
 
        while (opc!= 3){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Inserir Aluno \n2 - Exibir Alunos \n3 - Sair"));
            
            switch(opc){
                case 1:    
                    tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de aluno que deseja inserir: \n1 - Graduacao \n2 - Pos-graduacao"));
                    if(tipo == 1){ 
                        nome = JOptionPane.showInputDialog("Nome: ");
                        ra = JOptionPane.showInputDialog("RA: ");
                        curso = JOptionPane.showInputDialog("Curso: ");
                        ano = JOptionPane.showInputDialog("Ano Conclusão: ");
                        listAluno.add(new AlunoGraduacao(ano, ra, nome, curso));   
                        continue;
                    }             
                        nome = JOptionPane.showInputDialog("Nome: ");
                        ra = JOptionPane.showInputDialog("RA: ");
                        curso = JOptionPane.showInputDialog("Curso: ");
                        ano = JOptionPane.showInputDialog("Ano Conclusão: ");
                        listAluno.add(new AlunoPosGraduacao(ano, ra, nome, curso));
                    break;
                case 2: 
                    String msg = "";
                    for(Aluno a : listAluno){
                        msg += a + "\n";
                    }
                    JOptionPane.showMessageDialog(null, msg);
                    break;
                case 3: break;
            }
        }
    }
    
}
