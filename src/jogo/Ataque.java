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
    int ataque;
    public Ataque (int ataque){
       this.ataque = ataque; 
    }
    public void ataca (Entidade entidadeAtacada){       
        entidadeAtacada.pontosvitais = entidadeAtacada.pontosvitais - ataque -
                //esse metodo retira dos pontos vitais do objeto atacado, o numero
                //de pontos de ataque do objeto atacante, menos o numero de pontos
                //da armadura do objeto atacado;
                //se o atacante nao tiver o atributo alcance, so poderao atacar
                //a  2 unidades de distancia.(dica sobreescrita)
                //apenas objetos com ataque diferente de 0, deverao ter esse metodo;
                //nao consigo tirar os pontos da armadura da Entidade atacada.
    }
    
    public boolean podeAtacar (Entidade entidade){
        //qual a funcao desse podeAtacar?
    }
    
}
