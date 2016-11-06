/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.artifacts;
import gui.artifacts.Gold;
/**
 *
 * @author Vando Miguel Pereira
 */
public class LayerGold extends MapLayer {
    
    private final int GOLD = 20;
    public LayerGold() {
        generateGold();
        
    }

    public void generateGold() {
        for (int i = 0; i < GOLD; i++) {
          addObject(new Gold());
        }
    }
    
}
