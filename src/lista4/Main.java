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
       int opc = 0;
       String nome, ra , curso, ano, tipo;
       ArrayList<Aluno> listAluno = new ArrayList<>();
       Aluno alunoCategoria = null;
   
        if(opc == 1){
           alunoCategoria = null;
           ano = JOptionPane.showInputDialog("Qual tipo de aluno? ");
           for(Aluno a : listAluno){
               if(a.getRa().equals(ano) && a.getNome().equals(ano))
  
           }
           
        while (opc!= 3){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Inserir Aluno \n2 - Exibir Alunos \n3 - Sair"));
  
            switch(opc){
                case 1: 
                    nome = JOptionPane.showInputDialog("Nome: ");
                    ra = JOptionPane.showInputDialog("RA: ");
                    curso = JOptionPane.showInputDialog("Curso: ");
                    ano = JOptionPane.showInputDialog("Ano Conclusão: ");
                    listAluno.add(new Aluno(ra, nome, curso));
                    
                    break;
                case 2: break;
                case 3: break;
            }
        }
    }
    
}
