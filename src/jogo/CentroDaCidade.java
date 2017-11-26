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
public class CentroDaCidade extends Construcao { 
    //pontos vitais = 600;
    //ataque = 10;
    //custo = 200 madeiras;
    //alcance = 8;



public CentroDaCidade (Posicao posicao, Civilizacao civilizacao ){
        super ("CentrodaCidade.jpg", new Dinheiro (0,0,200), true, 600, posicao, 
                civilizacao, 0, new AtaqueDeAlcance(10, 8));    
               
    
}
public Campones criaCampones (){
    if(this.civilizacao.podeConstruir(Campones.class)){
        //Campones.class tambem nao ta aceitando.
    
        this.civilizacao.adicionaUnidade(new Campones (this.posicao, this.civilizacao));
        
            //implementar o metodo
            //cria a unidade campones
            
        }
//cada centro da cidade permite 10 unidades de capacidade de populacao.
}
}
