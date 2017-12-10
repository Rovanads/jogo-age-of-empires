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
                civilizacao, new AtaqueDeAlcance(10, 8));  
        civilizacao.getConstrucoes().add(this);
               
    
}
public Campones criaCampones (){
    if(this.getCivilizacao().podeConstruir(Campones.class)){
        
    
        this.getCivilizacao().adicionaUnidade(new Campones (this.getPosicao(), 
                this.getCivilizacao()));
        
            
            
        }
//cada centro da cidade permite 10 unidades de capacidade de populacao.
return new Campones (this.getPosicao(), this.getCivilizacao());
}
}

