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
public class Sacerdote extends Unidade {
    //tem pontos de ataque e de alcance.
    //pontosdevida = 25;
    //ataque = 0;
    //custo = 125 ouros;
    //alcance = 10;
    //armadura = 0;
    //velocidade = 1.0;
    public Sacerdote (Posicao posicao, Civilizacao civilizacao){
        super ("Sacerdote.jpg", new Dinheiro (0,125,0), true, 25, posicao, 
                civilizacao, 0, 1.0, new AtaqueDeAlcance(0, 10));        
    
}
    
public void converteInimigo (Entidade entidade){
    this.civilizacao.adicionaUnidade (entidade);
    entidade.civilizacao.removeUnidade (entidade);
    entidade.setCivilizacao(this.getCivilizacao());
            
    //implementar esse metodo
    //converte unidades e construcoes inimigas em sua civilizacao;
}
    
}
