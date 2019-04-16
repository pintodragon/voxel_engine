package com.vertinog.gaming;

import static com.vertinog.gaming.render_engine.DisplayManager.getWindowId;
import static org.lwjgl.glfw.GLFW.*;

public class InputManager {
    public static void init() {
        // Setup a key callback. It will be called every time a key is pressed, repeated or released.
        glfwSetKeyCallback(getWindowId(), (window, key, scancode, action, mods) -> {
            if ( key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE ) {
                glfwSetWindowShouldClose(window, true); // We will detect this in the rendering loop
            }
        });
    }
}
