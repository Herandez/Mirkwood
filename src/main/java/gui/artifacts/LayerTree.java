/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.artifacts;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor.RGB;
import static gui.Map.COLUMNS;
import static gui.Map.LINES;
import static gui.Map.TREECOUNT;
import java.util.Random;



/**
 *
 * @author Vando Miguel Pereira
 */
public class LayerTree extends MapLayer{
    
    Random _rand = new Random();
    public LayerTree() {
        super();
        
        generateTrees();
    }
    
    	public void generateTrees() {
            for (int i=0; i < TREECOUNT; i++){
                TerminalPosition tpos = new TerminalPosition(_rand.nextInt(COLUMNS),_rand.nextInt(LINES));
		addObject(new Tree(tpos));
                
                      
	}
}
}


