package jogo.teste;

import jogo.Direcao;
import jogo.Posicao;
import jogo.civilizacao.Civilizacao;
import jogo.civilizacao.Egito;
import jogo.civilizacao.Grecia;
import jogo.construcao.Quartel;
import jogo.unidade.Campones;
import jogo.unidade.Cavaleiro;

public class TesteJogo {

	public static void main(String[] args) {
		
		Posicao posEgito = new Posicao(1, 1);
		Civilizacao egito = new Egito(posEgito);
		
		System.out.println();
		
		Posicao posGrecia = new Posicao(10, 10);
		Civilizacao grecia = new Grecia(posGrecia);
		
		System.out.println();
		
		Campones camponesEgito = egito.getCentroDaCidade().criaCampones();
		camponesEgito.mover(Direcao.N);
		camponesEgito.mover(Direcao.N);
		camponesEgito.mover(Direcao.L);
		camponesEgito.corta();
		camponesEgito.colhe();
		camponesEgito.minera();
		
		System.out.println();
		
		Campones camponesGrecia = grecia.getCentroDaCidade().criaCampones();
		camponesGrecia.mover(Direcao.O);
		
		Quartel quartelGrecia = camponesGrecia.constroi(Quartel.class);
		Cavaleiro cavaleiroGrecia = quartelGrecia.criaCavaleiro();
		cavaleiroGrecia.mover(Direcao.S);
		cavaleiroGrecia.mover(Direcao.S);
		cavaleiroGrecia.mover(Direcao.O);
		
		cavaleiroGrecia.getAtaque().ataca(camponesEgito);
		
		cavaleiroGrecia.mover(Direcao.N);
		cavaleiroGrecia.getAtaque().ataca(camponesEgito);
		camponesEgito.getAtaque().ataca(cavaleiroGrecia);
		cavaleiroGrecia.getAtaque().ataca(camponesEgito);
		camponesEgito.getAtaque().ataca(cavaleiroGrecia);
		cavaleiroGrecia.getAtaque().ataca(camponesEgito);
		camponesEgito.getAtaque().ataca(cavaleiroGrecia);
		cavaleiroGrecia.getAtaque().ataca(camponesEgito);
		camponesEgito.getAtaque().ataca(cavaleiroGrecia);
		cavaleiroGrecia.getAtaque().ataca(camponesEgito);
		
		cavaleiroGrecia.mover(Direcao.S);
		cavaleiroGrecia.mover(Direcao.O);
		
		while (cavaleiroGrecia.getAtaque().ataca(egito.getCentroDaCidade())) {
			
		}
		
	}
}
