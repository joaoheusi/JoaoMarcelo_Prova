/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradordeprova;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author joaomheusi
 */
public class GeradorDeProva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int auxTamanho = 0;
        String[] opcoesQuestoes = new String[5];

        //pede quantidades, peso,
        System.out.println("Digite a disciplina da prova:");
        Prova p1 = new Prova(s.nextLine());
        System.out.println("Digite a data da prova:");
        p1.setData(s.nextLine());
        System.out.println("Digite o local da prova:");
        p1.setLocal(s.nextLine());
        System.out.println("Digite o peso da prova:");
        p1.setPeso(Integer.parseInt(s.nextLine()));

        while (true) {
            System.out.println("Qual o tipo de questao que voce deseja inserir?:");
            System.out.println("'O' para objetiva, 'D' para discursiva e 'X' para sair.");
            String decisao = s.nextLine();

            if (decisao.equalsIgnoreCase("D")) {
                Discursiva disc = new Discursiva();
                System.out.println("Digite a pergunta da questão:");
                disc.setPergunta(s.nextLine());
                System.out.println("Digite o critério para correção da questão discursiva:");
                disc.setCriteriosCorrecao(s.nextLine());
                
                p1.getQuestoes().add(disc);

            } else if (decisao.equalsIgnoreCase("O")) {

                Objetiva obj = new Objetiva();
                System.out.println("Digite a pergunta da questão:");
                obj.setPergunta(s.nextLine());
                System.out.println("Digite as opções para a questão discursiva:");
                System.out.println("Opção A:");
                opcoesQuestoes[0] = s.nextLine();
                System.out.println("Opção B:");
                opcoesQuestoes[1] = s.nextLine();
                System.out.println("Opção C:");
                opcoesQuestoes[2] = s.nextLine();
                System.out.println("Opção D:");
                opcoesQuestoes[3] = s.nextLine();
                System.out.println("Opção E:");
                opcoesQuestoes[4] = s.nextLine();
                obj.setOpcoes(opcoesQuestoes);
                System.out.println("Digite qual a opção correta(0...4):");
                obj.setRespostaCorreta(Integer.parseInt(s.nextLine()));
                
                p1.getQuestoes().add(obj);
                
            } else if (decisao.equalsIgnoreCase("X")) {
                break;
            } else {
                System.out.println("Você entrou uma opção Invalida!!");
            }
        }
        
        System.out.println(p1.obtemDetalhes());
    }

}
