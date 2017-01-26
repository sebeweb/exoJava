/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;

import exercices.core.Application;
import exercices.heritage.Heritage;
import exercices.recucivite.suites.entier.SuiteEntier;
import exercices.recucivite.suites.fibonacci.SuiteFibonacci;

/**
 *
 * @author sebastien-javary
 */
public class Exercices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application exo1 = new SuiteFibonacci();
        exo1.start();
    }
    
}
