/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.heritage.animaux.entities;

import exercices.heritage.Tripotable;

/**
 *
 * @author sebastien-javary
 */
public abstract class Animaux implements Tripotable{
    public String son = "";
    public void emettreSon() {
        System.out.println("le "+this.getClass().getSimpleName()+son);
    }
}
