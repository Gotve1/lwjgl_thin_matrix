package org.example;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.*;
import org.lwjgl.opengl.DisplayMode;

import java.awt.*;

public class DisplayManager {

    private static final int WIDTH = 600;
    private static final int HEIGHT = 400;
    private static final int FPS = 60;
    private static final String TITLE = "Display";

    public static void createDisplay() {

        ContextAttribs attribs = new ContextAttribs(3,2);
        attribs.withForwardCompatible(true);
        attribs.withProfileCore(true);

        try {
            Display.setDisplayMode(new DisplayMode(WIDTH, HEIGHT));
            Display.create(new PixelFormat(), attribs);
            Display.setTitle(TITLE);
        } catch (LWJGLException e) {
            throw new RuntimeException(e);
        }

        GL11.glViewport(0, 0, WIDTH, HEIGHT);
    }

    public static void updateDisplay() {

        Display.sync(FPS);
        Display.update();

    }

    public static void closeDisplay() {

        Display.destroy();

    }

}
