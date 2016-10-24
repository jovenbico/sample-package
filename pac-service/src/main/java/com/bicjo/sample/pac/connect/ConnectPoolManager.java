package com.bicjo.sample.pac.connect;

import java.sql.Connection;

public class ConnectPoolManager extends ConnectManager {

	@Override
	public Connection createConnection() {
		// TODO create connection from object pool
		System.out.println("create connection from object pool");
		return null;
	}

}
