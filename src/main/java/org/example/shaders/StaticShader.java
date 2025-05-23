package org.example.shaders;

public class StaticShader extends ShaderProgram {

    private static final String VERTEX_FILE = "src/main/java/org/example/shaders/Vertex.glsl";
    private static final String FRAGMENT_FILE = "src/main/java/org/example/shaders/Fragment.glsl";

    public StaticShader() {
        super(VERTEX_FILE, FRAGMENT_FILE);
    }

    @Override
    protected void bindAttributes() {
        super.bindAttribute(0, "position");
    }
}
