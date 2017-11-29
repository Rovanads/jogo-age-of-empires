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
    public enum Direcao{
        //norte, nordeste, noroeste, sul, sudeste, sudoeste, leste, oeste
        N, NE, NW, S, SE, SW,E, W
    }
    private Entidade[][] alocacao = new Entidade[100][100];
    private static final Mapa mapa = new Mapa();
    //Construtor privado para impedir que outro Mapa seja criado (singleton)
    private Mapa() {
		
	}
    public static Mapa get() {
		return mapa;
	}
    /**
	 * Checa se a jogada eh permitida: se ja existe outra entidade ou esta fora do mapa
	 * 
	 * @param p
	 * @return  */
public boolean podeAlocar(Posicao p) {
	try {
            return alocacao[p.x][p.y] != null;
            } 
        catch (ArrayIndexOutOfBoundsException e) {
// esta fora do array de alocacao do mapa
            return false;
		} 
	}
/**
	 * Faz a unidade mover no mapa
	 * 
	 * @param unidade
	 * @param direcao
	 * @return se a unidade moveu ou nao
	 */
public boolean moveUnidade(Unidade unidade, Direcao direcao) {
	Posicao posicaoAtual = unidade.getPosicao();
        Posicao posicaoNova = new Posicao(posicaoAtual.x, posicaoAtual.y);
if (Arrays.asList(Direcao.N, Direcao.NE, Direcao.NW).contains(direcao)) {
			posicaoNova.y++;
		}
		if (Arrays.asList(Direcao.S, Direcao.SE, Direcao.SW).contains(direcao)) {
			posicaoNova.y--;
		}
		if (Arrays.asList(Direcao.E, Direcao.NE, Direcao.SE).contains(direcao)) {
			posicaoNova.x--;
		}
		if (Arrays.asList(Direcao.W, Direcao.NW, Direcao.SW).contains(direcao)) {
			posicaoNova.x++;
		}
		
		if (podeAlocar(posicaoNova)) {
			alocacao[posicaoAtual.x][posicaoAtual.y] = null;//remove alocacao do mapa
			alocacao[posicaoNova.x][posicaoNova.y] = unidade;//adiciona alocacao do mapa
			unidade.setPosicao(posicaoNova);
			return true;
		}
		
		return false;
		
	}
}


    
       



