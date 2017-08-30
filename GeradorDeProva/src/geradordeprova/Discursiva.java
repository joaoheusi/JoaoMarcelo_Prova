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
public class Discursiva extends Questao {
    
    
    private String criteriosCorrecao;
    public String retornaQuestao(){
        String questao = "\nQuestão(Peso: "+this.getPeso()+"):"+
                         "\n"+this.getPergunta()+
                         "\nR:_________________________________________________"+
                         "\n____________________________________________________"+
                         "\n____________________________________________________";
        return questao;
    }

    /**
     * @return the criteriosCorrecao
     */
    public String getCriteriosCorrecao() {
        return criteriosCorrecao;
    }

    /**
     * @param criteriosCorrecao the criteriosCorrecao to set
     */
    public void setCriteriosCorrecao(String criteriosCorrecao) {
        this.criteriosCorrecao = criteriosCorrecao;
    }
    
    
}
