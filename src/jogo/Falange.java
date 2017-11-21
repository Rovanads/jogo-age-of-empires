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
public class Falange extends Unidade {
    //pontosdevida = 120;
    //ataque = 20;
    //custo = 60 comidas e 40 ouros;
    //alcance = 0;
    //armadura = 7;
    //velocidade = 1.2;
public Falange (String imagem, Dinheiro custo, boolean estado, 
            int pontosvitais,Posicao posicao, Civilizacao civilizacao,
            int armadura, double velocidade, Atacante ataque){
        super (imagem, custo, estado, pontosvitais, posicao, civilizacao, 
                armadura, velocidade, ataque);       
    
}
public void Mover (String direcao){
        //aguardar a resposta do Valdir para essa implementação.
    } 
    
}
