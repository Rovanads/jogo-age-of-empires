/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import java.util.ArrayList;

/**
 *
 * @author Rovana
 */
public class Campones extends Unidade {
    ArrayList <Campones> adicionaCampones = new ArrayList<>();
    Egito egito;
    //pontosdevida = 50;
    //ataque = 3;
    //custo = 50 comidas;
    //alcance = 0;
    //armadura = 0;
    //velocidade = 2.0;

    
    public Campones (Posicao posicao, Civilizacao civilizacao){
        super ("Campones.jpg", new Dinheiro (50,0,0), true, 50, posicao, civilizacao, 
                0, 2.0, new Ataque(3));
        civilizacao.getUnidades().add(this);
        adicionaCampones.add(this);        
        
        
}    
    public Construcao constroi (Posicao posicao, Construcao tipo){
        if (tipo instanceof Casa){           
            System.out.println("Casa construída, posicão: " + posicao.x + "," +
                    posicao.y);
        }
        if (tipo instanceof CentroDaCidade){
            System.out.println("Centro da cidade construído na posicão: " + 
                    posicao.x + "," + posicao.y);            
        }
        if (tipo instanceof Quartel){
            System.out.println("Quartel construído na posicão: " + 
                    posicao.x + "," + posicao.y);            
        }
        if (tipo instanceof Templo){
            System.out.println("Templo construído na posicão: " + 
                    posicao.x + "," + posicao.y);            
        }
        if (tipo instanceof Torre) {
            System.out.println("Torre construída na posicão: "
                    + posicao.x + "," + posicao.y);
        }       
        return tipo;
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
