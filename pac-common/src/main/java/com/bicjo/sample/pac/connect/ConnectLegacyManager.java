package com.bicjo.sample.pac.connect;

import java.sql.Connection;

public class ConnectLegacyManager extends ConnectManager {

	public Connection createConnection() {
		// TODO create legacy connection
		System.out.println("create legacy connection");
		return null;
	}

}
