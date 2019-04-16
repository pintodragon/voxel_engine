/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.vertinog.gaming;

import com.vertinog.gaming.render_engine.DisplayManager;

public class App {
    public static void main(String[] args) {
        App app = new App();

        app.startGame();
    }

    private void startGame() {
        init();

        DisplayManager.updateDisplay();

        DisplayManager.destroyDisplay();
    }

    private void init() {
        DisplayManager.createDisplay();
        InputManager.init();
    }
}
