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
import gui.SymbolsMirk;
import static gui.artifacts.Tree.factoryRandomTree;


/**
 *
 * @author Vando Miguel Pereira
 */
public class LayerTree extends MapLayer{
    
    public LayerTree() {
        super();
        
        generateTrees();
    }
    
    	public void generateTrees() {
            for (int i=0; i < TREECOUNT; i++){
		TerminalPosition tpos = new TerminalPosition(_Rand.nextInt(COLUMNS),_Rand.nextInt(LINES));
                
                        //objectos[_Rand.nextInt(COLUMNS)][_Rand.nextInt(LINES)] = new Tree();
                        //Tree.factoryRandomTree(COLUMNS, LINES)
	}
}
}


