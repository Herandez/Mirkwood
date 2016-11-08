/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.artifacts;

import com.googlecode.lanterna.TerminalPosition;
import static gui.Map.COLUMNS;
import static gui.Map.LINES;
import java.util.Random;

/**
 *
 * @author UserPL022Pc04
 */
public class LayerPotion extends MapLayer{
    
    private final int POTION = 12;
    public LayerPotion() {
        generatePotion();
        
    }

    public void generatePotion() {
        for (int i = 0; i < POTION; i++) {
          Random _rand = new Random();
          TerminalPosition tpos = new TerminalPosition(_rand.nextInt(COLUMNS),_rand.nextInt(LINES));
          addObject(new Potion(tpos));
        }
    }
    
}
