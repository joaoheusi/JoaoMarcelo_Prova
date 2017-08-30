/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradordeprova;

/**
 *
 * @author joaomheusi
 */
public class Objetiva extends Questao {
    
    private String[] opcoes = new String[5];
    private int respostaCorreta;

    /**
     *
     * @return
     */
    @Override
    public String retornaQuestao(){
        String questao = "\nQuestão (Peso: "+this.getPeso()+"):"+
                         "\n"+this.getPergunta()+
                         "\n a-"+this.opcoes[0]+
                         "\n b-"+this.opcoes[1]+
                         "\n c-"+this.opcoes[2]+
                         "\n d-"+this.opcoes[3]+
                         "\n e-"+this.opcoes[4]+
                         "\n";
        return questao;
    }
    
    /**
     * @return the opcoes
     */
    public String[] getOpcoes() {
        return opcoes;
    }

    /**
     * @param opcoes the opcoes to set
     */
    public void setOpcoes(String[] opcoes) {
        this.opcoes = opcoes;
    }

    /**
     * @return the respostaCorreta
     */
    public int getRespostaCorreta() {
        return respostaCorreta;
    }

    /**
     * @param respostaCorreta the respostaCorreta to set
     */
    public void setRespostaCorreta(int respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }

      
}
