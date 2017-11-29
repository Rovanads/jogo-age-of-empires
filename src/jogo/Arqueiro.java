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
public class Arqueiro extends Unidade {
    //arqueiro ataca de alcance tambÃ©m
    //pontosdevida = 45;
    //ataque = 5;
    //custo = 40 comidas e 20 ouros;
    //alcance = 7;
    //armadura = 0;
    //velocidade = 2.0;

public Arqueiro (Posicao posicao, Civilizacao civilizacao){
        super ("Arqueiro.jpg", new Dinheiro (40,20,0), true, 45, posicao, 
                civilizacao, 0, 2.0, new AtaqueDeAlcance(5, this, 7));       
    //não ta dando certo, acho que e o this.
}


    
}
     
    

