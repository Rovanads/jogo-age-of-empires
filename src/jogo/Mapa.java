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
public class Mapa {
    Entidade [][] alocacao;
    
    public static final Mapa mapa = new Mapa ();    

public static Mapa get(){
return mapa;
}
public  Entidade checaAlocacao (Posicao p){
return alocacao [p.x][p.y]; //ta dando erro, nao entendi pq.
}
