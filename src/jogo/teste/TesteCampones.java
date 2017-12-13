package jogo.teste;

import jogo.Direcao;
import jogo.Posicao;
import jogo.civilizacao.Civilizacao;
import jogo.civilizacao.Egito;
import jogo.civilizacao.Grecia;
import jogo.construcao.Quartel;
import jogo.unidade.Campones;
import jogo.unidade.Cavaleiro;

/**
 * verificar os métodos exclusivos do camponês.
 *
 */
public class TesteCampones {

	public static void main(String[] args) {

		Posicao posEgito = new Posicao(1, 1);
		Civilizacao egito = new Egito(posEgito);

		Campones camponesEgito = egito.getCentroDaCidade().criaCampones();
		camponesEgito.mover(Direcao.N);
		camponesEgito.mover(Direcao.N);
		camponesEgito.mover(Direcao.L);
		camponesEgito.corta();
		camponesEgito.colhe();
		camponesEgito.minera();

	}
}
