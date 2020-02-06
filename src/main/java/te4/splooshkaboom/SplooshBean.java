/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package te4.splooshkaboom;

import javax.websocket.server.ServerEndpoint;

/**
 *
 * @author L
 */
@ServerEndpoint("splooshkaboom")
public class SplooshBean {

    public static void main(String[] args) {
        Ship ship1 = new Ship(setpos(), setpos());
        Ship ship2 = new Ship(setpos(), setpos());
        Ship ship3 = new Ship(setpos(), setpos());
        
//        Gör ship123 till json data
    }

    static int setpos() {
        return (int) ((Math.floor(Math.random() * 10)) * 50);
    }
}
