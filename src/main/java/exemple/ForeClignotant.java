/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Color;

/**
 *
 * @author Sara Toulon
 */
public class ForeClignotant extends EffetAnimation {

    public ForeClignotant(Bandeau bandeau, int repetition, String message) {
        super(bandeau, repetition, message);
    }

    @Override
    public void executer() {
        bandeau.setMessage(message);
        for(int r = 0; r < this.repetition; r++){
            for(int i = 0; i<40; i++){
                if(i%2==0){
                    this.bandeau.setForeground(Color.white);
                    this.bandeau.sleep(100);
                }
                if(i%2!=0){
                    this.bandeau.setForeground(Color.red);
                    this.bandeau.sleep(100);
                }
            }
        }
    }
}
