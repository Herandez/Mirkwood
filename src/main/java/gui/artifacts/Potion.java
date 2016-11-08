/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.artifacts;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import gui.SymbolsMirk;

/**
 *
 * @author UserPL022Pc04
 */
public class Potion extends MapObject{
    
    public Potion(TerminalPosition pos) {
        super(pos, true, true);
       
        setSymbol(SymbolsMirk.POTION);
        setForegroundColor(new TextColor.RGB(255, 0, 0));
        setBackgroundColor(new TextColor.RGB(165, 127, 61));
        
        
    }
}
