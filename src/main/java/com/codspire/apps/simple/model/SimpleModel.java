package com.codspire.apps.simple.model;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

public class SimpleModel {
	private String currentHost;
	private Date currentTime;

	public SimpleModel() {
		this.currentHost = findCurrentHost();
		this.currentTime = new Date();
	}

	private String findCurrentHost() {
		try {
			return InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}

	public String getCurrentHost() {
		return currentHost;
	}

	public Date getCurrentTime() {
		return currentTime;
	}
}
