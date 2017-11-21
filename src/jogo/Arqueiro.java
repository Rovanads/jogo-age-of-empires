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
    //arqueiro ataca de alcance também
    //pontosdevida = 45;
    //ataque = 5;
    //custo = 40 comidas e 20 ouros;
    //alcance = 7;
    //armadura = 0;
    //velocidade = 2.0;

public Arqueiro (String imagem, Dinheiro custo, boolean estado, 
            int pontosvitais,Posicao posicao, Civilizacao civilizacao,
            int armadura, double velocidade, Atacante ataque){
        super (imagem, custo, estado, pontosvitais, posicao, civilizacao, 
                armadura, velocidade, ataque);       
    
}
@Override
public void Mover (String direcao){
        //aguardar a resposta do Valdir para essa implementação.
    } 
@Override
public void estado (){
    if (pontosvitais > 0){
        estado = true;
    }
    else {        
        System.out.println("Morto");
    }
    
}
     
    
}
