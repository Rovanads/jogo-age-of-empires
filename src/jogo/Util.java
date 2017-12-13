package jogo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jogo.construcao.Casa;
import jogo.construcao.CentroDaCidade;
import jogo.construcao.Quartel;
import jogo.construcao.Templo;
import jogo.construcao.Torre;
import jogo.unidade.Arqueiro;
import jogo.unidade.Campones;
import jogo.unidade.Cavaleiro;
import jogo.unidade.Elefante;
import jogo.unidade.Falange;
import jogo.unidade.Guerreiro;
import jogo.unidade.Sacerdote;

public abstract class Util {

	public static final Map<Class<?>, Dinheiro> CUSTOS = new HashMap<>();
	
	public static final Class<?>[] ENTIDADES_COMUNS = {
		//unidades
		Arqueiro.class, Campones.class, Cavaleiro.class, Guerreiro.class, Sacerdote.class,
		//construcoes
		Casa.class, Quartel.class, Templo.class, Torre.class
	};
	
	static {
		//unidades
		CUSTOS.put(Arqueiro.class, new Dinheiro(40, 20, 0));
		CUSTOS.put(Campones.class, new Dinheiro(50, 0, 0));
		CUSTOS.put(Elefante.class, new Dinheiro(170, 40, 0));
		CUSTOS.put(Falange.class, new Dinheiro(60, 40, 0));
		CUSTOS.put(Guerreiro.class, new Dinheiro(0, 50, 0));
		CUSTOS.put(Sacerdote.class, new Dinheiro(0, 125, 0));
		
		//construcoes
		CUSTOS.put(Casa.class, new Dinheiro(0, 0, 30));
		CUSTOS.put(Cavaleiro.class, new Dinheiro(70, 80, 0));
		CUSTOS.put(CentroDaCidade.class, new Dinheiro(0, 0, 200));
		CUSTOS.put(Quartel.class, new Dinheiro(0, 0, 125));
		CUSTOS.put(Templo.class, new Dinheiro(0, 0, 250));
		CUSTOS.put(Torre.class, new Dinheiro(0, 0, 70));
		
	}
	
	/**
	 * Retorna unidades/construcoes comuns + especial da civilizacao
	 * @param clazz
	 * @return
	 */
	public static Class<? extends Entidade>[] entidadesCivilizacao(Class<? extends Entidade> clazz) {
		List<Class> lista = new ArrayList<>(Arrays.asList(ENTIDADES_COMUNS));
		lista.add(clazz);
		return lista.toArray(new Class[lista.size()]);
	}
}
