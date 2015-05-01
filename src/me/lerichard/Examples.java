package me.lerichard;

import tester.Tester;

/**
 * This class is used to run tests
 * Created by richard on 4/29/15.
 */
public class Examples {
    Examples() {
    }


    /**
     * Runs the appropriate tests
     *
     * @param t
     */
    public void tests(Tester t) {
        testMobAddHP(t);
        testMobRemoveHP(t);
    }

    /**
     * Tests the addHP() method for Mob
     */
    public void testMobAddHP(Tester t) {
        int randInt1 = 1 + Math.abs(Main.RAND.nextInt());
        boolean randBool1 = Main.RAND.nextBoolean();
        Mob testMob1 = new Mob(randInt1, randInt1, randInt1, randBool1);
        Mob testExpect1 = new Mob(randInt1 * 2, randInt1, randInt1, false);
        t.checkExpect(testMob1.addHP(randInt1), testExpect1, "Mob addHP()");
    }

    /**
     * Test method for Mob removeHP()
     *
     * @param t
     */
    public void testMobRemoveHP(Tester t) {
        int randInt1 = 1 + Math.abs(Main.RAND.nextInt());
        int randInt2 = 1 + Main.RAND.nextInt(randInt1);
        int expectInt = randInt1 - randInt2;
        boolean randBool1 = Main.RAND.nextBoolean();
        Mob testMob1 = new Mob(randInt1, randInt1, randInt1, randBool1);
        Mob testExpect1 = new Mob(expectInt, randInt1, randInt1, false);
        t.checkExpect(testMob1.removeHP(randInt2), testExpect1, "Mob removeHP()");
    }

    /**
     * Test method for Mob isAlive()
     *
     * @param t
     */
    public void testMobIsAlive(Tester t) {
        int randInt1 = Main.RAND.nextInt();
        boolean randBool1 = true;
        if (randInt1 <= 0) {
            randBool1 = false;
        }
        Mob testMob1 = new Mob(randInt1, randInt1, randInt1, randBool1);
        t.checkExpect(testMob1.isAlive(), randBool1, "Mob isAlive()");
    }

    /**
     * Test method for Mob isDef()
     *
     * @param t
     */
    public void testMobIsDef(Tester t) {
        int randInt1 = 1 + Math.abs(Main.RAND.nextInt());
        boolean randBool1 = Main.RAND.nextBoolean();
        Mob testMob1 = new Mob(randInt1, randInt1, randInt1, randBool1);
        t.checkExpect(testMob1.isDef(), randBool1, "Mob isDef()");
    }

    /**
     * Tester method for Mob activateDefend()
     *
     * @param t
     */
    public void testMobActivateDefend(Tester t) {
        int randInt1 = 1 + Math.abs(Main.RAND.nextInt());
        boolean randBool1 = Main.RAND.nextBoolean();
        boolean expect = true;
        Mob testMob1 = new Mob(randInt1, randInt1, randInt1, randBool1);
        Mob testExpect = new Mob(randInt1, randInt1, randInt1, expect);
        t.checkExpect(testMob1.activateDefend(), testExpect, "Mob activateDefend()");
    }

    /**
     * Test method for Mob equals()
     *
     * @param t
     */
    public void testMobEquals(Tester t) {
        int randInt1 = 1 + Math.abs(Main.RAND.nextInt());
        boolean randBool1 = Main.RAND.nextBoolean();
        Mob testMob1 = new Mob(randInt1, randInt1, randInt1, randBool1);
        Mob testExpect = new Mob(randInt1, randInt1, randInt1, randBool1);
        Mob testExpect2 = new Mob(0, 0, 0, true);
        t.checkExpect(testMob1.equals(testExpect), true, "Mob equals()");
        t.checkExpect(testMob1.equals(testExpect2), false, "Mob equals() - expect false");
        t.checkExpect(testMob1.equals(null), false, "Mob equals() - null input");
    }


    //********************


    /**
     * Tests the addHP() method for Player
     */
    public void testPlayerAddHP(Tester t) {
        int randInt1 = 1 + Math.abs(Main.RAND.nextInt(FieldWorld.DEFAULT_HIT_POINTS_MAX));
        int healInt = 1 + Math.abs(Main.RAND.nextInt(FieldWorld.DEFAULT_HIT_POINTS_MAX));
        int expectHP = randInt1 + healInt;
        if (expectHP >= FieldWorld.DEFAULT_HIT_POINTS_MAX) {
            expectHP = FieldWorld.DEFAULT_HIT_POINTS_MAX;
        }
        boolean randBool1 = Main.RAND.nextBoolean();
        Player testPlayer1 = new Player(randInt1, randInt1, randInt1, randInt1, randBool1);
        Player testExpect1 = new Player(expectHP, randInt1, randInt1, randInt1 - 1, false);
        t.checkExpect(testPlayer1.addHP(healInt), testExpect1, "Player addHP()");
    }

    /**
     * Test method for Player removeHP()
     *
     * @param t
     */
    public void testPlayerRemoveHP(Tester t) {
        int randInt1 = 1 + Math.abs(Main.RAND.nextInt());
        int randInt2 = 1 + Main.RAND.nextInt(randInt1);
        int expectInt = randInt1 - randInt2;
        boolean randBool1 = Main.RAND.nextBoolean();
        Player testPlayer1 = new Player(randInt1, randInt1, randInt1, randInt1, randBool1);
        Player testExpect1 = new Player(expectInt, randInt1, randInt1, randInt1, false);
        t.checkExpect(testPlayer1.removeHP(randInt2), testExpect1, "Player removeHP()");
    }

    /**
     * Test method for Player isAlive()
     *
     * @param t
     */
    public void testPlayerIsAlive(Tester t) {
        int randInt1 = Main.RAND.nextInt();
        boolean randBool1 = true;
        if (randInt1 <= 0) {
            randBool1 = false;
        }
        Player testPlayer1 = new Player(randInt1, randInt1, randInt1, randInt1, randBool1);
        t.checkExpect(testPlayer1.isAlive(), randBool1, "Player isAlive()");
    }

    /**
     * Test method for Player isDef()
     *
     * @param t
     */
    public void testPlayerIsDef(Tester t) {
        int randInt1 = 1 + Math.abs(Main.RAND.nextInt());
        boolean randBool1 = Main.RAND.nextBoolean();
        Player testPlayer1 = new Player(randInt1, randInt1, randInt1, randInt1, randBool1);
        t.checkExpect(testPlayer1.isDef(), randBool1, "Player isDef()");
    }

    /**
     * Tester method for Player activateDefend()
     *
     * @param t
     */
    public void testPlayerActivateDefend(Tester t) {
        int randInt1 = 1 + Math.abs(Main.RAND.nextInt());
        boolean randBool1 = Main.RAND.nextBoolean();
        boolean expect = true;
        Player testPlayer1 = new Player(randInt1, randInt1, randInt1, randInt1, randBool1);
        Player testExpect = new Player(randInt1, randInt1, randInt1, randInt1, expect);
        t.checkExpect(testPlayer1.activateDefend(), testExpect, "Player activateDefend()");
    }

    /**
     * Test method for Player equals()
     *
     * @param t
     */
    public void testPlayerEquals(Tester t) {
        int randInt1 = 1 + Math.abs(Main.RAND.nextInt());
        boolean randBool1 = Main.RAND.nextBoolean();
        Player testPlayer1 = new Player(randInt1, randInt1, randInt1, randInt1, randBool1);
        Player testExpect = new Player(randInt1, randInt1, randInt1, randInt1, randBool1);
        Player testExpect2 = new Player(0, 0, 0, 0, true);
        t.checkExpect(testPlayer1.equals(testExpect), true, "Player equals()");
        t.checkExpect(testPlayer1.equals(testExpect2), false, "Player equals() - expect false");
        t.checkExpect(testPlayer1.equals(null), false, "Player equals() - null input");
    }


}