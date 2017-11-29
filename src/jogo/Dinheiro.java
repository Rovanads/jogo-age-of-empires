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
public class Dinheiro {
    //quanto custa para construir um objeto.
    int madeira = 500;
    int ouro = 500;
    int comida = 500;
    
    public Dinheiro (int comida, int ouro, int madeira){
        this.comida = comida;
        this.ouro = ouro;
        this.madeira = madeira;
    }
    public void soma (Dinheiro dinheiro){
        //olhar emailsvaldir
        
    }
    public void subtrai (Dinheiro dinheiro){
        madeira = madeira - 1;
        ouro = ouro - 1;
        comida = comida - 1;
    }
    public boolean checaNegativo (Dinheiro d){
        return this.madeira - d.madeira < 0 || this.ouro - d.ouro < 0 || 
                this.comida - d.comida < 0;
    }
}
