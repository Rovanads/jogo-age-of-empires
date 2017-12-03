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
public class Ataque {
    protected int ataque;  
    protected Entidade entidade;   
    public Ataque (int ataque){
       this.ataque = ataque; 
       
       
    }
    public void ataca (Entidade entidadeAtacada){  
        if (entidadeAtacada instanceof Unidade){
        entidadeAtacada.pontosvitais = entidadeAtacada.pontosvitais - (ataque - 
                ((Unidade) entidadeAtacada).armadura);
        }
        else{
            entidadeAtacada.pontosvitais = entidadeAtacada.pontosvitais - ataque;
        }
        
        
                //esse metodo retira dos pontos vitais do objeto atacado, o numero
                //de pontos de ataque do objeto atacante, menos o numero de pontos
                //da armadura do objeto atacado;
                //se o atacante nao tiver o atributo alcance, so poderao atacar
                //a  2 unidades de distancia.(dica sobreescrita)
                //apenas objetos com ataque diferente de 0, deverao ter esse metodo;
                //nao consigo tirar os pontos da armadura da Entidade atacada.
    }
    
    public boolean podeAtacar (Entidade atacante, Entidade atacado){
        return Mapa.getDistanciaRaio (atacante, atacado)<= 2;
                //Tá escrito assim no problema: "o objeto atacado só poderá 
                //sofrer o ataque se estiver a 2 unidades de distância do objeto atacante 
                //(dica: pense em sobrescrita de métodos);"
    }
    
}
