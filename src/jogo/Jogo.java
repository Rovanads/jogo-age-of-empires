/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import jogo.civilizacao.Civilizacao;
import jogo.civilizacao.Egito;
import jogo.civilizacao.Grecia;
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
import jogo.unidade.Unidade;

/**
 *
 * @author Rovana
 */
public class Jogo {
    private Civilizacao[] civs;
    
    public Jogo(Civilizacao... civs) {
    	this.civs = civs;
    }
    /*
    public static void main(String[] args) {
        Dinheiro dinheiro = new Dinheiro (500, 500, 500);
        Posicao pos = new Posicao (2, 2);
        Egito egito = new Egito (pos);
        CentroDaCidade cd = new CentroDaCidade (pos, egito);       
        Grecia grecia = new Grecia (pos);
        CentroDaCidade cd2 = new CentroDaCidade (pos, grecia);
        Campones campones = new Campones (pos, egito);
        Campones campones2 = new Campones (pos, grecia);
        Casa casa = new Casa (pos, grecia);
        Quartel quartel = new Quartel (pos, egito);
        Templo templo = new Templo (pos, egito);
        Torre torre = new Torre(pos, grecia);
    
       
        Arqueiro arqueiro = new Arqueiro (pos, grecia);
        Arqueiro arqueiro2 = new Arqueiro (pos, egito);
        Cavaleiro cavaleiro = new Cavaleiro (pos, egito);
        Cavaleiro cavaleiro2 = new Cavaleiro (pos, grecia);
        Elefante elefante = new Elefante (pos, egito);
        Elefante elefante2 = new Elefante (pos, grecia);
        Falange falange = new Falange (pos, grecia);
        Falange falange2 = new Falange (pos, egito);
        Guerreiro guerreiro = new Guerreiro (pos, egito);
        Guerreiro guerreiro2 = new Guerreiro (pos, grecia);
        Sacerdote sacerdote = new Sacerdote (pos, grecia);
        Sacerdote sacerdote2 = new Sacerdote (pos, egito);
        
        
        grecia.podeConstruir(Unidade.class);
        egito.podeConstruir(Unidade.class);
        
        grecia.adicionaUnidade(falange);
        grecia.adicionaUnidade(arqueiro);
        grecia.adicionaUnidade(campones);
        grecia.adicionaUnidade(cavaleiro);
        grecia.adicionaUnidade(elefante);
        grecia.adicionaUnidade(guerreiro);
        grecia.adicionaUnidade(sacerdote);
        
        egito.adicionaUnidade(falange2);
        egito.adicionaUnidade(arqueiro2);
        egito.adicionaUnidade(campones2);
        egito.adicionaUnidade(cavaleiro2);
        egito.adicionaUnidade(elefante2);
        egito.adicionaUnidade(guerreiro2);
        egito.adicionaUnidade(sacerdote2);
        
        grecia.adicionaEntidade(casa);
        grecia.adicionaEntidade(cd);
        grecia.adicionaEntidade(quartel);
        grecia.adicionaEntidade(templo);
        grecia.adicionaEntidade(torre);
        
        egito.adicionaEntidade(casa);
        egito.adicionaEntidade(cd);
        egito.adicionaEntidade(quartel);
        egito.adicionaEntidade(templo);
        egito.adicionaEntidade(torre);
        
        campones.constroi(pos, casa);        
        campones.constroi(pos, quartel);
        campones.constroi(pos, templo);
        campones.constroi(pos, torre);
        
        sacerdote.converteInimigo(elefante);
        
        
        Mapa mapa = new Mapa();
        mapa.moveUnidade(falange, Direcao.O, 1.2);
        mapa.moveUnidade(campones, Direcao.N, 2.0);
        mapa.moveUnidade(arqueiro, Direcao.S, 2.0);
        mapa.moveUnidade(cavaleiro, Direcao.L, 4.0);
        mapa.moveUnidade(elefante, Direcao.O, 1.0);
        mapa.moveUnidade(guerreiro, Direcao.N, 1.8);
        mapa.moveUnidade(sacerdote, Direcao.S, 1.0);
        
        Ataque ataque = new Ataque (13);
        AtaqueDeAlcance alcance = new AtaqueDeAlcance (5,7);
        ataque.podeAtacar(falange, templo);
        ataque.ataca(elefante2);
        alcance.podeAtacar(falange, templo);
        ataque.ataca(elefante2);
        
        
        
        
        
       
        
        
        
        cd.criaCampones();
        
        
        
        
   
    }*/
    
}
