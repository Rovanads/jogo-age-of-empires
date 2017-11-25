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
public Falange (Posicao posicao, Civilizacao civilizacao){
        super ("Falange.jpg", new Dinheiro (60,40,0), true, 120, posicao, civilizacao, 
                7, 1.2, new Ataque());       
    
}
@Override
public void mover (String direcao){
        //aguardar a resposta do Valdir para essa implementacao.
    } 
    
}
