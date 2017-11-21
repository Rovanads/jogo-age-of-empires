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
    Dinheiro custo;
    public boolean estado = true; //criar um método se a entidade está viva ou morta?
    public int pontosvitais; // carga de vida
    Posicao posicao;
    Civilizacao civilizacao;
    
    public Entidade (String imagem, Dinheiro custo, boolean estado, 
            int pontosvitais, Posicao posicao, Civilizacao civilizacao){
        this.imagem = imagem;
        this.custo = custo;
        this.estado = estado;
        this.pontosvitais = pontosvitais;
        this.posicao = posicao;
        this.civilizacao = civilizacao;
    }
    abstract void estado ();
        //devo criar um método para informar se a entidade está viva ou morta, 
    //crio aqui, ou mantenho esse método abstrato aqui e nas classes filhas, implementando
    //apenas nas unidades e construções, como arqueiro e etc.
    }
    
}
