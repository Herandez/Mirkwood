/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.artifacts;
import com.googlecode.lanterna.TerminalPosition;
import static gui.Map.COLUMNS;
import static gui.Map.LINES;
import gui.artifacts.Gold;
import java.util.Random;

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
          Random _rand = new Random();
          TerminalPosition tpos = new TerminalPosition(_rand.nextInt(COLUMNS),_rand.nextInt(LINES));
          addObject(new Gold(tpos));
        }
    }
    
}
