package jogo.teste;

import jogo.Direcao;
import jogo.Posicao;
import jogo.civilizacao.Civilizacao;
import jogo.civilizacao.Egito;
import jogo.civilizacao.Grecia;
import jogo.construcao.Quartel;
import jogo.unidade.Arqueiro;
import jogo.unidade.Campones;

/**
 * criar um objeto que tenha ataque à distância, tentar atacar uma unidade que
 * está além do seu alcance, e mostrar que o ataque não gera efeito, além do
 * caso contrário;
 * 
 */
public class TesteAtaqueDistancia {

	public static void main(String[] args) {

		Posicao posEgito = new Posicao(1, 1);
		Civilizacao egito = new Egito(posEgito);

		System.out.println();

		Posicao posGrecia = new Posicao(12, 12);
		Civilizacao grecia = new Grecia(posGrecia);

		System.out.println();

		Campones camponesEgito = egito.getCentroDaCidade().criaCampones();
		camponesEgito.mover(Direcao.N);
		camponesEgito.mover(Direcao.N);
		camponesEgito.mover(Direcao.L);

		System.out.println();

		Campones camponesGrecia = grecia.getCentroDaCidade().criaCampones();
		Quartel quartelGrecia = camponesGrecia.constroi(Quartel.class);
		Arqueiro arqueiroGrecia = quartelGrecia.criaArqueiro();
		arqueiroGrecia.getAtaque().ataca(camponesEgito);
		
		arqueiroGrecia.mover(Direcao.S);
		arqueiroGrecia.mover(Direcao.S);
		arqueiroGrecia.mover(Direcao.O);
		arqueiroGrecia.mover(Direcao.O);

		arqueiroGrecia.getAtaque().ataca(camponesEgito);
		arqueiroGrecia.getAtaque().ataca(camponesEgito);
		camponesEgito.getAtaque().ataca(arqueiroGrecia);
		arqueiroGrecia.getAtaque().ataca(camponesEgito);
		camponesEgito.getAtaque().ataca(arqueiroGrecia);
		arqueiroGrecia.getAtaque().ataca(camponesEgito);
		camponesEgito.getAtaque().ataca(arqueiroGrecia);
		arqueiroGrecia.getAtaque().ataca(camponesEgito);
		camponesEgito.getAtaque().ataca(arqueiroGrecia);
		arqueiroGrecia.getAtaque().ataca(camponesEgito);


	}
}
