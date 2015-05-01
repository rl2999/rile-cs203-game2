package me.lerichard;

import tester.Tester;

import java.util.Random;

public class Main {
    public static final int SHOW_MESSAGE_FOR_N_TICKS = 1;
    public static Random RAND = new Random();

    // consoleMode enables a game logic testing version of the game
    // that does not rely on graphics.
    public static boolean consoleMode = true;

    public static void main(String[] args) {


        FieldWorld game = new FieldWorld();
        Examples e = new Examples();

        Tester.run(e);

        int windowWidth = FieldWorld.MAX_FIELD_WIDTH * FieldWorld.FIELD_OBJECT_RADIUS;
        int windowHeight = FieldWorld.MAX_FIELD_HEIGHT * FieldWorld.FIELD_OBJECT_RADIUS;
        game.bigBang(windowWidth, windowHeight, .15);

        if (Main.consoleMode) {
            Main.consolePrint("WELCOME TO");
            Main.consolePrint("==========================");
            Main.consolePrint("              FINITE FANTASY          ");
            Main.consolePrint("==========================");
        }
    }

    /**
     * Print to console only when consoleMode is enabled
     */
    public static void consolePrint(String msg) {
        if (Main.consoleMode) {
            System.out.println(msg);
        }
    }
}