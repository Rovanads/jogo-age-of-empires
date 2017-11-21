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
    public Sacerdote (String imagem, Dinheiro custo, boolean estado, 
            int pontosvitais,Posicao posicao, Civilizacao civilizacao,
            int armadura, double velocidade, Atacante ataque){
        super (imagem, custo, estado, pontosvitais, posicao, civilizacao, 
                armadura, velocidade, ataque);        
    
}
public void Mover (String direcao){
        //aguardar a resposta do Valdir para essa implementação.
    }
public void converteInimigo (Entidade entidade){
    //implementar esse método
    //converte unidades e construções inimigas em sua civilização;
}
    
}
