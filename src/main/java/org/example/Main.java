package org.example;

import org.lwjgl.opengl.Display;

public class Main {
    public static void main(String[] args) {

        DisplayManager.createDisplay();
        Loader loader = new Loader();
        Render render = new Render();

        float[] vertices = {
                 // First triangle X, Y, Z
                -0.5f,  0.5f, 0f,  // Top left vertex
                -0.5f, -0.5f, 0f,  // Bottom left vertex
                 0.5f, -0.5f, 0f,  // Bottom right vertex
                 0.5f,  0.5f, 0f   // Top right vertex
        };

        int[] indices = {
                0, 1, 3, // First triangle
                3, 1, 2  // Second triangle
        };

        RawModel model = loader.loadToVAO(vertices, indices);

        while (!Display.isCloseRequested()) {
            render.init();

            render.render(model);

            DisplayManager.updateDisplay();
        }

        loader.clean();
        DisplayManager.closeDisplay();

    }
}