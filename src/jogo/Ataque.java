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
    Entidade entidade;
    public Ataque (int ataque, Entidade entidade){
       this.ataque = ataque; 
       this.entidade = entidade;
       //coloquei entidade como sugerido, mas ta dando erro nas classes filhas.
    }
    public void ataca (Entidade entidadeAtacada){       
        entidadeAtacada.pontosvitais = entidadeAtacada.pontosvitais - (ataque - 
                entidadeAtacada.armadura);
        
        
                //esse metodo retira dos pontos vitais do objeto atacado, o numero
                //de pontos de ataque do objeto atacante, menos o numero de pontos
                //da armadura do objeto atacado;
                //se o atacante nao tiver o atributo alcance, so poderao atacar
                //a  2 unidades de distancia.(dica sobreescrita)
                //apenas objetos com ataque diferente de 0, deverao ter esse metodo;
                //nao consigo tirar os pontos da armadura da Entidade atacada.
    }
    
    public boolean podeAtacar (Entidade entidadeAtacada){
        Posicao p1 = this.entidade.posicao;
        Posicao p2 = entidadeAtacada.posicao;
        return Math.abs(p1.x - p2.x) == 1 && Math.abs(p1.y - p2.y) == 1;
    }
    
}
