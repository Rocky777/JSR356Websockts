package com.rocky.endpoint;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/WebsocketEndpoint")
public class WebsocketServerEndpoint {


	static Set<Session> sessions = new HashSet<Session>(); 

	@OnOpen
	public void onOpen(Session session){
		sessions.add(session);
	}

	@OnClose
	public void onClose(Session session){
		sessions.remove(session);
	}


	@OnMessage
	public void onMessage(String message , Session peer) throws IOException{

		for(Session client : sessions){
			client.getBasicRemote().sendText(message);
		}
	}

}
