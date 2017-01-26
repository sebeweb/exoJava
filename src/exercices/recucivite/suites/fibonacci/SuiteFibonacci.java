/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.recucivite.suites.fibonacci;

import exercices.core.Application;
import exercices.recucivite.suites.SuiteInterface;

/**
 *
 * @author sebastien-javary
 */
public class SuiteFibonacci extends Application implements SuiteInterface {

    @Override
    public void start() {
        suite(1);
    }

    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int max = 300;
    public int prc = 0;

    @Override
    public int suite(int n) {
//        on decremante max
        max--;
//        on print prc
        System.out.println(prc);
//        si max et superieur 0
        if (max > 0) {

            int temp = n + prc;

            prc = n;
            suite(temp);
        }
        return 0;
    }

}
