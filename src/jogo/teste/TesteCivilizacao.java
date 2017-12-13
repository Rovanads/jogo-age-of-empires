package jogo.teste;

import jogo.Posicao;
import jogo.civilizacao.Civilizacao;
import jogo.civilizacao.Grecia;
import jogo.construcao.Quartel;
import jogo.construcao.Templo;
import jogo.construcao.Torre;
import jogo.unidade.Campones;

/**
 * verificar se o programa proíbe a criação de mais unidades do que a capacidade
 * da população;
 *
 */
public class TesteCivilizacao {

	public static void main(String[] args) {
		Posicao posGrecia = new Posicao(12, 12);
		Civilizacao grecia = new Grecia(posGrecia);

		System.out.println();

		Campones campones = grecia.getCentroDaCidade().criaCampones();
		Quartel quartel = campones.constroi(Quartel.class);
		Templo templo = campones.constroi(Templo.class);
		Torre torre = campones.constroi(Torre.class);
		
		//templo.criaSacerdote();
		quartel.criaArqueiro();
		quartel.criaElefante();
		quartel.criaFalange();
		quartel.criaGuerreiro();
		quartel.criaGuerreiro();
		quartel.criaGuerreiro();
		quartel.criaGuerreiro();
		quartel.criaGuerreiro();
		quartel.criaGuerreiro();
		quartel.criaGuerreiro();
		quartel.criaGuerreiro();
	}
}
