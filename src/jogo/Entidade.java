/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

/**
 *
 * @author Rovana
 */
abstract public class Entidade {
    public String imagem;
    private Dinheiro custo;
    public boolean isVivo;
    public int pontosvitais; // carga de vida
    private Posicao posicao;
    private Civilizacao civilizacao;
    
    
    public Entidade (String imagem, Dinheiro custo, boolean isVivo, 
            int pontosvitais, Posicao posicao, Civilizacao civilizacao){
        //quando meus atributos são privados, eu posso colocá-los no Construtor?
        this.imagem = imagem;
        this.custo = custo;
        this.isVivo = isVivo;
        this.pontosvitais = pontosvitais;
        this.posicao = posicao;        
        this.civilizacao = civilizacao;
       
    }
    public Posicao getPosicao (){
        return this.posicao;
    }
    public void setPosicao (Posicao p){
        this.posicao = p;
    }
    public Civilizacao getCivilizacao (){
        return this.civilizacao;
    }
    public void setCivilizacao(Civilizacao c){
        this.civilizacao = c;
    }
    public Dinheiro getDinheiro (){
        return this.custo;
    }
    public void setDinheiro (Dinheiro d){
        this.custo = d;
    }
}
    

