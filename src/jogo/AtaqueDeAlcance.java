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
public class AtaqueDeAlcance extends Ataque {
    int alcance; //para arqueiro e sacerdote, sao as unidades que atacam por alcance;
    public AtaqueDeAlcance (int ataque, Entidade entidade, int alcance){
        super (ataque, entidade);        
        this.alcance = alcance;
    }
    @Override
     public void ataca (Entidade entidadeAtacada){        
         
     }
     @Override
     public boolean podeAtacar (Entidade entidadeAtacada){
         Posicao p1 = this.entidade.getPosicao();
         Posicao p2 = entidadeAtacada.getPosicao();
         return Math.abs(p1.x - p2.x)<= alcance && Math.abs(p1.y - p2.y) <= alcance;
     }
    
}
