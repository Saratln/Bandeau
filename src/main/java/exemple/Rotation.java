/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;

/**
 *
 * @author Sara Toulon
 */
public class Rotation extends EffetAnimation {

    public Rotation(Bandeau bandeau, int repetition, String message) {
        super(bandeau, repetition, message);
    }

    @Override
    public void executer() {
        bandeau.setMessage(message);
        for (int r = 0; r < this.repetition; r++) {
            for (int i = 0; i <= 100; i++) {
                this.bandeau.setRotation(2 * Math.PI * i / 100);
                this.bandeau.sleep(100);

            }
        }
    }
}
