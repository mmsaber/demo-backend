package com.example.demo.web.rest;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Server;

@RestController
public class ServerResource {

	@GetMapping("/server/ip")
	public ResponseEntity<Server> retrieveServerDetails() throws UnknownHostException{
        Server server = new Server();
        server.setIp(InetAddress.getLocalHost().toString());
        server.setHostName(InetAddress.getLocalHost().getHostName());
		return ResponseEntity.ok(server);
	}

}
