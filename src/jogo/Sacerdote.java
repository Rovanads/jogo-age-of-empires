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
                civilizacao, 0, 1.0, new Ataque());        
    
}
    @Override
public void mover (String direcao){
        //aguardar a resposta do Valdir para essa implementacao.
    }
public void converteInimigo (Entidade entidade){
    //implementar esse metodo
    //converte unidades e construcoes inimigas em sua civilizacao;
}
    
}
