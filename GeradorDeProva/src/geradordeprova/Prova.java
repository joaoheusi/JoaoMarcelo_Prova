/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradordeprova;

import java.util.ArrayList;

/**
 *
 * @author joaomheusi
 */
public class Prova {
    
    
   private String nomeDisciplina;
   private int peso;
   private String local;
   private String data;
   private ArrayList<Questao> listaQuestoes;
    
   public String obtemDetalhes(){
        
        String cabecalho="Disciplina: "+this.getNomeDisciplina()+
                         "\nNome:__________________________"+
                         "\t\tData: "+this.getData()+
                         "\nLocal: "+this.getLocal()+"\t\t\tPeso da prova: "+this.getPeso()+"";
        
        for (int i = 0; i < this.listaQuestoes.size(); i++) {
                 cabecalho+= this.listaQuestoes.get(i).retornaQuestao();
       }
    
    return cabecalho;
    };
    
   public String obtemProvaImpressao(){
       
       String s= "";
       
       
        return s; 
     };
         
   public Prova(String nome){
        this.nomeDisciplina = nome;
        this.peso =10;
        this.listaQuestoes = new ArrayList();
   }

    /**
     * @return the nomeDisciplina
     */
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    /**
     * @param nomeDisciplina the nomeDisciplina to set
     */
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the local
     */
    public String getLocal() {
        return local;
    }

    /**
     * @param local the local to set
     */
    public void setLocal(String local) {
        this.local = local;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the questoes
     */
    public ArrayList<Questao> getQuestoes() {
        return listaQuestoes;
    }

    /**
     * @param questoes the questoes to set
     */
    public void setQuestoes(ArrayList<Questao> questoes) {
        this.listaQuestoes = questoes;
    }

}
