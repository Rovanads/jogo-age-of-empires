/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import java.util.Arrays;

/**
 *
 * @author Rovana
 */
public class Mapa {

    private static final Mapa mapa = new Mapa();

    //Construtor privado para impedir que outro Mapa seja criado (singleton)
    private Mapa() {

    }

    public static Mapa get() {
        return mapa;
    }

    public boolean moveUnidade(Unidade unidade, Direcao direcao, double velocidade) {
        
        Posicao posicaoAtual = unidade.getPosicao();
        Posicao posicaoNova = new Posicao(posicaoAtual.x, posicaoAtual.y);
        
        if (Arrays.asList(Direcao.N, Direcao.NE, Direcao.NW).contains(direcao)) {           
            posicaoNova.y+=velocidade;
        }
        if (Arrays.asList(Direcao.S, Direcao.SE, Direcao.SW).contains(direcao)) {
            posicaoNova.y+=velocidade;
        }
        if (Arrays.asList(Direcao.E, Direcao.NE, Direcao.SE).contains(direcao)) {
            posicaoNova.x+=velocidade;
        }
        if (Arrays.asList(Direcao.W, Direcao.NW, Direcao.SW).contains(direcao)) {
           posicaoNova.y+=velocidade;
        }
        unidade.setPosicao(posicaoNova);

        return false;

    }

    public static double getDistanciaRaio(Entidade e1, Entidade e2) {
        Posicao p1 = e1.getPosicao();
        Posicao p2 = e2.getPosicao();
        return Math.max(Math.abs(p1.x - p2.x), Math.abs(p1.y - p2.y));
    }
}


    
       



