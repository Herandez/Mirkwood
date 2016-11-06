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
 * @author Vando Miguel Pereira
 */
public class Bridge extends MapObject {
    
    public Bridge(TerminalPosition position) {
        super(null, true, true);
        
        setSymbol(SymbolsMirk.BRIDGE);
        setForegroundColor(new TextColor.RGB(160,82,45));
        setBackgroundColor(new TextColor.RGB(139, 69, 19));
    }
    
    /* A Ponte têm de ter a sua propria layer, deve ser gerada depois da agua, e de alguma forma têm de ir buscar a posição 
    identica a agua 
    */
}
