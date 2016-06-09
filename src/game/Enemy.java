package game;

/**
 * Created by Yahima on 08.06.16.
 */
public class Enemy {

    private int atk;
    private int def;
    private String mag;
    private int lp;

    Enemy(int atk, int def, String mag, int lp){
        this.atk = atk;
        this.def = def;
        this.mag = mag;
        this.lp = lp;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public String getMag() {
        return mag;
    }

    public int getLp() {
        return lp;
    }

    public void setLp(int lp) {
        this.lp = lp;
    }
}
