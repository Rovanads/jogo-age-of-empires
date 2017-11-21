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
public class Atacante {
    int ataque;
    public Atacante (int ataque){
       this.ataque = ataque; 
    }
    public void Ataca (Entidade entidadeAtacada){       
        entidadeAtacada.pontosvitais = entidadeAtacada.pontosvitais - ataque -
                //esse metodo retira dos pontos vitais do objeto atacado, o numero
                //de pontos de ataque do objeto atacante, menos o numero de pontos
                //da armadura do objeto atacado;
                //se o atacante não tiver o atributo alcance, só poderá atacar
                //à 2 unidades de distancia.(dica sobreescrita)
                //apenas objetos com ataque diferente de 0, deverao ter esse metodo;
                //não consigo tirar os pontos da armadura da Entidade atacada.
    }
    
    public boolean podeAtacar (Entidade entidade){
        //qual a função desse podeAtacar?
    }
    
}
