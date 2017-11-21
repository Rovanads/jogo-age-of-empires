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
public class Cavaleiro extends Unidade {
    //pontosdevida = 180;
    //ataque = 12;
    //custo = 70 comidas e 80 ouros;
    //alcance = 0;
    //armadura = 3;
    //velocidade = 4.0;

public Cavaleiro (String imagem, Dinheiro custo, boolean estado, 
            int pontosvitais,Posicao posicao, Civilizacao civilizacao,
            int armadura, double velocidade, Atacante ataque){
        super (imagem, custo, estado, pontosvitais, posicao, civilizacao, 
                armadura, velocidade, ataque);        
    
}
@Override
public void Mover (String direcao){
        //aguardar a resposta do Valdir para essa implementação.
    }
}
