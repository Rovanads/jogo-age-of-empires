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
    
    private double alocacao;//aqui tirei a matriz, mas fiquei em duvida se 
    //usaremos ainda esse alocacao
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
            //bom isso aqui teremos que retirar né?
            //aqui nao ta compilando por causa da posicao no mapa inteiro;
            //Tá escrito assim no problema: "o objeto atacado só poderá 
                //sofrer o ataque se estiver a 2 unidades de distância do objeto atacante 
                //(dica: pense em sobrescrita de métodos);" 
                //Então a gente pode usar isso aqui também, eu acho...
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
			unidade.setPosicao(posicaoNova);
                        
		return false;
		
	}
public static double getDistanciaRaio(Entidade e1, Entidade e2) {
    Posicao p1 = e1.getPosicao();
    Posicao p2 = e2.getPosicao();
    return Math.max(Math.abs(p1.x - p2.x), Math.abs(p1.y - p2.y));
}
}


    
       



