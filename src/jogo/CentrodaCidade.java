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
public class CentrodaCidade extends Construcao { 
    //pontos vitais = 600;
    //ataque = 10;
    //custo = 200 madeiras;
    //alcance = 8;

public Atacante ataque;

public CentrodaCidade (String imagem, Dinheiro custo, boolean estado, 
            int pontosvitais, Posicao posicao, Civilizacao civilizacao, 
            Atacante ataque ){
        super (imagem, custo, estado, pontosvitais, posicao, civilizacao);    
        this.ataque = ataque;        
    
}
public Campones criaCampones (){
            //implementar o método
            //cria a unidade campones
            
        }
//cada centro da cidade permite 10 unidades de capacidade de populacao.
}
