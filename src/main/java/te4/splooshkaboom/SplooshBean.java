/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package te4.splooshkaboom;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.json.Json;
import javax.json.JsonObject;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 *
 * @author L
 * 
 * Plan:
 * @OnOpen, create two users & 3 ships.
 * Front end sends this coordinate (150,100) backend checks if it's a hit
 * If hit adds one point to user
 * if miss i++ to playercheck(); changes user.
 * Score is displayed on the site
 */
//Gör ship123 till json data
@ServerEndpoint("/endpoint")
public class SplooshBean {

    static Set<Session> sessions = new HashSet<>();

    @OnOpen
    public void open(Session user) {
        sessions.add(user);
        sessions.add(user);
        
        Ship test1 = new Ship(50, 100);
        Ship test2 = new Ship(250, 150);
        Ship test3 = new Ship(450, 300);
        
        
    }

    @OnMessage
    public void onMessage(String Ship, Session user) throws IOException {
        

    }

    static int setpos() {
        return (int) ((Math.floor(Math.random() * 10)) * 50);
    }
}

//}
