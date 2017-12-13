package jogo.teste;

import jogo.Direcao;
import jogo.Posicao;
import jogo.civilizacao.Civilizacao;
import jogo.civilizacao.Egito;
import jogo.civilizacao.Grecia;
import jogo.construcao.Quartel;
import jogo.construcao.Templo;
import jogo.construcao.Torre;
import jogo.unidade.Campones;
import jogo.unidade.Sacerdote;

/**
 * verificar a conversão dos sacerdotes (uma unidade convertida deverá ser
 * removida do array da civilização original e ser adicionada a civilização
 * nova);
 *
 */
public class TesteSacerdote {

	public static void main(String[] args) {
		
		Posicao posEgito = new Posicao(1, 1);
		Civilizacao egito = new Egito(posEgito);
		System.out.println();
		
		Posicao posGrecia = new Posicao(2, 2);
		Civilizacao grecia = new Grecia(posGrecia);
		System.out.println();
		
		Campones camponesGrecia = grecia.getCentroDaCidade().criaCampones();
		Campones camponesEgito = egito.getCentroDaCidade().criaCampones();
		
		Templo templo = camponesEgito.constroi(Templo.class);
		Sacerdote sacerdoteEgito = templo.criaSacerdote();
		System.out.println();
		
		sacerdoteEgito.converteInimigo(camponesGrecia);
	}
}
