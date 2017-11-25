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
    public boolean isVivo;
    public int pontosvitais; // carga de vida
    Posicao posicao;
    Civilizacao civilizacao;
    
    public Entidade (String imagem, Dinheiro custo, boolean isVivo, 
            int pontosvitais, Posicao posicao, Civilizacao civilizacao){
        this.imagem = imagem;
        this.custo = custo;
        this.isVivo = isVivo;
        this.pontosvitais = pontosvitais;
        this.posicao = posicao;
        this.civilizacao = civilizacao;
    }
}
    

