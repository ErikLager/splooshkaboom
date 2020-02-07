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
 */
//Gör ship123 till json data
@ServerEndpoint("/endpoint")
public class SplooshBean {

    static Set<Session> sessions = new HashSet<>();

    @OnOpen
    public void open(Session user) {
        sessions.add(user);
        sessions.add(user);
    }

    @OnMessage
    public void onMessage(String Ship, Session user) throws IOException {
        Ship ship1 = new Ship(setpos(), setpos());
        Ship ship2 = new Ship(setpos(), setpos());
        Ship ship3 = new Ship(setpos(), setpos());

    }

    static int setpos() {
        return (int) ((Math.floor(Math.random() * 10)) * 50);
    }
}

//}
