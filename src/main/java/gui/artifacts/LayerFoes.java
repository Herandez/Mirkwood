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
import script.Orc;
import script.Spider;

/**
 *
 * @author Vando Miguel Pereira
 */

public class LayerFoes extends MapLayer {
    private final int ORCS = 13;
    private final int SPIDERS = 10;

    Random _rand = new Random();
    public LayerFoes() {
        generateOrcs();
        generateSpiders();
        
        generateOrcs2();
    }

    public void generateOrcs() {
        for (int i = 0; i < ORCS; i++) {
          TerminalPosition tpos = new TerminalPosition(_rand.nextInt(COLUMNS),_rand.nextInt(LINES));
          addObject(new Orc(tpos));
        }
    }
    /*
        Gera a Fila de Orcs
    */
    public void generateOrcs2(){
        int col=4;
        for (int i = 0; i < LINES; i++) {
          if(i%2==0){
          TerminalPosition tpos = new TerminalPosition(col+1 ,i);
          addObject(new Orc(tpos));
          }
          else {
              TerminalPosition tpos = new TerminalPosition(col,i);
              addObject(new Orc(tpos));
          }
          //addObject(new Orc(tpos));
        }
        
    }
    public void generateSpiders() {
        for (int i = 0; i < SPIDERS; i++) {
            TerminalPosition tpos = new TerminalPosition(_rand.nextInt(COLUMNS),_rand.nextInt(LINES));
            addObject(new Spider(tpos));
           
        }
    }
    

}
 
