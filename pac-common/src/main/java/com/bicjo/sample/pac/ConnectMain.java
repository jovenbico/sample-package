package com.bicjo.sample.pac;

import java.sql.Connection;

import com.bicjo.sample.pac.connect.ConnectManager;

public class ConnectMain {

	public static Connection createConnection() {

		Connection newConnection = ConnectManager.getConnectManager().createConnection();

		return newConnection;
	}

}
