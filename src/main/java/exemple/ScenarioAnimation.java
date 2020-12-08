/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.util.List;
import java.util.LinkedList;

/**
 *
 * @author Sara Toulon
 */
public class ScenarioAnimation {
    List<EffetAnimation> enchainementEffet = new LinkedList();
    private final Bandeau bandeau;

    public ScenarioAnimation(Bandeau bandeau) {
        this.bandeau = bandeau;
    }
    
    public void ajouteEffet(EffetAnimation e){
        enchainementEffet.add(e);
    }
    public void lancementDuScenario(){
        for(EffetAnimation e : enchainementEffet){
            e.executer();
            bandeau.sleep(2000);
        }
        bandeau.close();
    }

    
    
}
