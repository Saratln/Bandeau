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
public abstract class EffetAnimation {
    public Bandeau bandeau;
    protected int repetition;
    protected String message;

    public EffetAnimation(Bandeau bandeau, int repetition, String message) {
        this.bandeau = bandeau;
        this.repetition = repetition;
        this.message = message;
    }
    
   public abstract void executer();
}
