/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import java.util.Arrays;

import jogo.unidade.Unidade;

/**
 *
 * @author Rovana
 */
public class Mapa {

    private static final Mapa mapa = new Mapa();

    //Construtor privado para impedir que outro Mapa seja criado
    Mapa() {

    }

    /**
     * Metodo get:
     *
     * @return mapa;
     */
    public static Mapa get() {
        return mapa;
    }

    /**
     * Metodo moveUnidade:
     *
     * @param unidade , unidade a ser movida;
     * @param direcao , direcao;
     * @param velocidade , velocidade do movimento.
     * @return se a unidade pode ser movida.
     */
    public boolean moveUnidade(Unidade unidade, Direcao direcao, 
            double velocidade) {

        Posicao posicaoAtual = unidade.getPosicao();
        Posicao posicaoNova = new Posicao(posicaoAtual.x, posicaoAtual.y);

        if (Arrays.asList(Direcao.N).contains(direcao)) {
            posicaoNova.y += velocidade;
        }
        if (Arrays.asList(Direcao.S).contains(direcao)) {
            posicaoNova.y -= velocidade;
        }
        if (Arrays.asList(Direcao.L).contains(direcao)) {
            posicaoNova.x += velocidade;
        }
        if (Arrays.asList(Direcao.O).contains(direcao)) {
            posicaoNova.x -= velocidade;
        }
        unidade.setPosicao(posicaoNova);

        System.out.print("~ ");
        System.out.print(unidade);
        System.out.print(" moveu para ");
        System.out.println(unidade.getPosicao());
        return true;

    }

    /**
     * Metodo getDistanciaRaio:
     *
     * @param e1 , entidade 1;
     * @param e2 , entidade 2;
     * @return distancia entre as posicoes.
     */
    public static double getDistanciaRaio(Entidade e1, Entidade e2) {
        Posicao p1 = e1.getPosicao();
        Posicao p2 = e2.getPosicao();
        return Math.max(Math.abs(p1.x - p2.x), Math.abs(p1.y - p2.y));
    }
}


    
       



