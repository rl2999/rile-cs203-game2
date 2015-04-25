package me.lerichard;

/**
 * Created by richard on 4/15/15.
 */
public class Player implements Actor {
    int hitPoints = FieldWorld.DEFAULT_HIT_POINTS_MAX;
    int atkLevel = FieldWorld.ATTACK_LEVEL;
    int defPower = FieldWorld.DEFENSE_LEVEL;
    boolean isDef = false;

    public Player(int hp, int atk, int def, boolean isDef) {
        this.hitPoints = hp;
        this.atkLevel = atk;
        this.defPower = def;
        this.isDef = isDef;
    }

    /**
     * Adds HP to the player
     *
     * @param p HP to add
     * @return a new Actor with added HP
     */
    public Actor addHP(int p) {
        return new Player(this.hitPoints + p, this.atkLevel, this.defPower, false);
    }

    /**
     * String representation of Player state
     *
     * @return String representing Player state
     */
    public String toString() {
        return "Player{" +
                "hitPoints=" + hitPoints +
                ", atkLevel=" + atkLevel +
                ", defPower=" + defPower +
                '}';
    }

    /**
     * Removes HP from the player
     *
     * @return a new Actor with removed HP
     */
    public Actor removeHP(int p) {
        if (this.isDef) {
            return new Player(this.hitPoints - (int) (p * FieldWorld.DEFENSE_LEVEL), this.atkLevel, this.defPower, false);
        }
        return new Player(this.hitPoints - p, this.atkLevel, this.defPower, this.isDef);
    }

    /**
     * Returns
     *
     * @return a dead player
     */
    public Actor kill() {
        return new Player(0, this.atkLevel, this.defPower, false);
    }

    /**
     * Returns true if the player is alive or dead
     *
     * @return true if player is alive
     */
    public boolean isAlive() {
        return (this.hitPoints > 0);
    }

    /**
     * Returns true if the player is currently in defense mode
     *
     * @return Returns true if the player is currently in defense mode
     */
    public boolean isDef() {
        return this.isDef;
    }

    /**
     * Return a Player that is in defense mode
     *
     * @return
     */
    public Actor activateDefend() {
        return new Actor(this.hitPoints, this.atkLevel, this.defPower, true);
    }
}