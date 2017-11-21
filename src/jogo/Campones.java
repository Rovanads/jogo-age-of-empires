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
public class Campones extends Unidade  {
    //pontosdevida = 50;
    //ataque = 3;
    //custo = 50 comidas;
    //alcance = 0;
    //armadura = 0;
    //velocidade = 2.0;

    
    public Campones (String imagem, Dinheiro custo, boolean estado, 
            int pontosvitais,Posicao posicao, Civilizacao civilizacao,
            int armadura, double velocidade, Atacante ataque){
        super (imagem, custo, estado, pontosvitais, posicao, civilizacao, 
                armadura, velocidade, ataque);
      
    
}
    public void Mover (String direcao){
        //aguardar a resposta do Valdir para essa implementação.
    }
    public Construcao Constroi (Posicao posicao, Construcao tipo){
        //cria uma construção do tipo desejado.
        //implementar o método
    }
    public void Colhe (){
        //gera uma unidade de comida para a civilização.
        custo.comida = custo.comida + 1;
    }
    public void Corta (){
        //gera uma unidade de madeira para a civilização.
        custo.madeira = custo.madeira + 1;
    }
    public void Minera (){
        //gera uma unidade de ouro para a civilização.
        custo.ouro = custo.ouro + 1;
    }
            

    
}
