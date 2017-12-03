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
public class Campones extends Unidade {
    //pontosdevida = 50;
    //ataque = 3;
    //custo = 50 comidas;
    //alcance = 0;
    //armadura = 0;
    //velocidade = 2.0;

    
    public Campones (Posicao posicao, Civilizacao civilizacao){
        super ("Campones.jpg", new Dinheiro (50,0,0), true, 50, posicao, civilizacao, 
                0, 2.0, new Ataque(3));
}    
    public Construcao constroi (Posicao posicao, Construcao tipo){
        //cria uma construcao do tipo desejado.
        //implementar o metodo, por isso nao ta compilando.
    }
    public void colhe (){
        //gera uma unidade de comida para a civilizacao.
        this.getCivilizacao().getDinheiro().soma (new Dinheiro (1,0,0));
    }
    public void corta (){
        //gera uma unidade de madeira para a civilizacao.
        this.getCivilizacao().getDinheiro().soma(new Dinheiro (0, 0, 1));
    }
    public void minera (){
        //gera uma unidade de ouro para a civilizacao.
        this.getCivilizacao().getDinheiro().soma(new Dinheiro (0, 1, 0));
    }
         

    
}
