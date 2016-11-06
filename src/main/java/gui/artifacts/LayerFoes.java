/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.artifacts;

import com.googlecode.lanterna.TerminalPosition;
import static gui.Map.COLUMNS;
import static gui.Map.LINES;
import script.Orc;
import script.Spider;

/**
 *
 * @author Vando Miguel Pereira
 */

public class LayerFoes extends MapLayer {
    private final int ORCS = 10;
    private final int SPIDERS = 10;

    public LayerFoes() {
        generateOrcs();
        generateSpiders();
    }

    public void generateOrcs() {
        for (int i = 0; i < ORCS; i++) {
          addObject(new Orc());
        }
    }

    public void generateSpiders() {
        for (int i = 0; i < SPIDERS; i++) {
            addObject(new Spider());
           
        }
    }

}
 
