/*
 * This file is part of lanterna (http://code.google.com/p/lanterna/).
 *
 * lanterna is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright (C) 2010-2016 Martin
 */

import java.io.IOException;
import java.util.EnumSet;

import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.gui2.ComponentRenderer;
import com.googlecode.lanterna.gui2.EmptySpace;
import com.googlecode.lanterna.gui2.TextGUIGraphics;
import com.googlecode.lanterna.gui2.WindowBasedTextGUI;
import com.googlecode.lanterna.gui2.dialogs.MessageDialogBuilder;

/**
 * Created to supply us with a screenshot for the Github page
 */
public class WelcomeSplashTest extends TestBase {
    public static void main(String[] args) throws IOException, InterruptedException {
        new WelcomeSplashTest().run(args);
    }

    @Override
    public void init(WindowBasedTextGUI textGUI) {
        textGUI.getBackgroundPane().setComponent(new EmptySpace(TextColor.ANSI.BLUE) {
            @Override
            protected ComponentRenderer<EmptySpace> createDefaultRenderer() {
                return new ComponentRenderer<EmptySpace>() {
                    public TerminalSize getPreferredSize(EmptySpace component) {
                        return TerminalSize.ONE;
                    }

                    public void drawComponent(TextGUIGraphics graphics, EmptySpace component) {
                        graphics.setForegroundColor(TextColor.ANSI.CYAN);
                        graphics.setBackgroundColor(TextColor.ANSI.BLUE);
                        graphics.setModifiers(EnumSet.of(SGR.BOLD));
                        graphics.fill(' ');
                        graphics.putString(3, 0, "Text GUI in 100% Java");
                    }
                };
            }
        });
    }

    @Override
    public void afterGUIThreadStarted(WindowBasedTextGUI textGUI) {
        new MessageDialogBuilder()
                .setTitle("Information")
                .setText("Welcome to Lanterna!")
                .build()
                .showDialog(textGUI);
    }
}
