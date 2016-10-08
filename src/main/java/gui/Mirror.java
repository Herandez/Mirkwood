package gui;

import java.io.IOException;
import java.util.Arrays;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.gui2.AnimatedLabel;
import com.googlecode.lanterna.gui2.BasicWindow;
import com.googlecode.lanterna.gui2.Border;
import com.googlecode.lanterna.gui2.Borders;
import com.googlecode.lanterna.gui2.DefaultWindowManager;
import com.googlecode.lanterna.gui2.Direction;
import com.googlecode.lanterna.gui2.EmptySpace;
import com.googlecode.lanterna.gui2.Label;
import com.googlecode.lanterna.gui2.LinearLayout;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.Panel;
import com.googlecode.lanterna.gui2.ScrollBar;
import com.googlecode.lanterna.gui2.Window;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

public class Mirror {
	Terminal terminal;
	Screen screen;
	Panel 	pStatus,
			pMap;
	Map		map;

	public Mirror() {
		try {
			init();
			
			buildPanels();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void init() throws IOException {
		terminal = new DefaultTerminalFactory().createTerminal();
		screen = new TerminalScreen(terminal);
		
		map = new Map();

		screen.startScreen();
	}

	public void draw() throws IOException {
		String s = "Hello World!";
		TextGraphics tGraphics = screen.newTextGraphics();

		screen.clear();

		tGraphics.putString(10, 10, s);
		screen.refresh();

		screen.readInput();
		screen.stopScreen();
	}
	
	private void buildPanels(){
	    BasicWindow window = new BasicWindow();
	    window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN, Window.Hint.NO_DECORATIONS));

	    Panel mainPanel = new Panel();
	    mainPanel.setLayoutManager(new LinearLayout(Direction.HORIZONTAL));

	    pStatus = new Status().getpStatus();
	    mainPanel.addComponent(pStatus.withBorder(Borders.singleLine("Status")));

	    pMap = new Panel(new LinearLayout(Direction.VERTICAL));
	    pMap.addComponent(map.getMap().withBorder(Borders.singleLine("Map")));
	    Panel pEvents = new Panel(new LinearLayout(Direction.VERTICAL));
	    pEvents.withBorder(Borders.singleLine("Events"));
	    pEvents.setPreferredSize(map.getMap().getPreferredSize());
	    
	    /*
	    AnimatedLabel lblE = new AnimatedLabel("It was getting dark...");
	    lblE.addFrame("And you still haven't found a place to rest.");
	    lblE.addFrame("The last fights have left you in poor shape");
	    lblE.addFrame("Now you're at your peak, and everyone in Mirkwood know you by your war name. ");
	    lblE.setPreferredSize(new TerminalSize(map.getMap().getPreferredSize().getColumns(),3));
	    
	    lblE.setPreferredSize(new TerminalSize(map.getMap().getPreferredSize().getColumns(),7));	    

	    ScrollBar sb = new ScrollBar(Direction.VERTICAL);
	    sb.addTo(pEvents);
	    sb.setPreferredSize(lblE.getPreferredSize());
	    sb.setViewSize(2);
	    
	    pEvents.addComponent(lblE);
	  
	    pEvents.setPreferredSize(new TerminalSize(map.getMap().getPreferredSize().getColumns(), 5));
	    */
	    PanelStory pstory = new PanelStory();
	    pstory.setPreferredSize(new TerminalSize(map.getMap().getPreferredSize().getColumns(), 5));
	    pMap.addComponent(pstory.withBorder(Borders.singleLine("Storyline")));
	    mainPanel.addComponent(pMap);

	    window.setComponent(mainPanel);

	    MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.BLUE));
	    
	    gui.addWindowAndWait(window);
	}

}
