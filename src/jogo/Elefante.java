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
public class Elefante extends Unidade {
    ////pontosdevida = 600;
    //ataque = 18;
    //custo = 170 comidas e 40 ouros;
    //alcance = 0;
    //armadura = 2;
    //velocidade = 1.0;

public Elefante (Posicao posicao, Civilizacao civilizacao){
        super ("Elefante.jpg", new Dinheiro (170,40,0), true, 600, posicao, civilizacao, 
                2, 1.0, new Ataque());
        
    
}
@Override
public void mover (String direcao){
        //aguardar a resposta do Valdir para essa implementacao.
    }
    
}
