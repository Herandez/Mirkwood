/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.artifacts;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import static gui.Map.COLUMNS;
import static gui.Map.LINES;
import gui.SymbolsMirk;
import java.util.Random;

/**
 *
 * @author Vando Miguel Pereira
 */
public class Gold extends MapObject{
    
    public Gold(TerminalPosition pos) {
        super(pos, true, false); //O gold está invisivel com o parametro isVisible em false
        
        //Random _rand = new Random();
        
        setSymbol(SymbolsMirk.GOLD);
        setBackgroundColor(new TextColor.RGB(165, 127, 61));
        setForegroundColor(new TextColor.RGB(250, 250, 0));
    }
    
    
}
