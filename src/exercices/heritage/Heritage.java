/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.heritage;

import exercices.core.Application;
import exercices.heritage.animaux.entities.Animaux;
import exercices.heritage.animaux.entities.Trippoteur;
import exercices.heritage.animaux.entities.impl.Chat;
import exercices.heritage.animaux.entities.impl.Chien;

/**
 *
 * @author sebastien-javary
 */
public class Heritage extends Application {

    @Override
    public void start() {
        Animaux chien = new Chien();
        Animaux chat = new Chat();
        Trippoteur t = new Trippoteur();

        chien.emettreSon();
        t.tripote(chien);
        chien.emettreSon();
        chat.emettreSon();
        t.tripote(chat);
        chat.emettreSon();
    }

    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
