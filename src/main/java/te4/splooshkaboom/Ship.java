/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package te4.splooshkaboom;

/**
 *
 * @author L
 */
public class Ship {
    private int xpos;
    private int ypos;

    public Ship(int xpos, int ypos) {
        this.xpos = xpos;
        this.ypos = ypos;
    }

    public int getYpos() {
        return ypos;
    }

    public void setYpos(int ypos) {
        this.ypos = ypos;
    }

    public int getXpos() {
        return xpos;
    }

    public void setXpos(int xpos) {
        this.xpos = xpos;
    }
}
