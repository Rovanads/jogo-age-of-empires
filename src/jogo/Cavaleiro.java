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

public Cavaleiro (Posicao posicao, Civilizacao civilizacao){
        super ("Cavaleiro.jpg", new Dinheiro (70,80,0), true, 180, posicao, 
                civilizacao, 3, 4.0, new Ataque(12));        
        civilizacao.getUnidades().add(this);
}

}
