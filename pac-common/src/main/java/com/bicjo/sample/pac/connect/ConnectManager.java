package com.bicjo.sample.pac.connect;

import java.sql.Connection;

import com.bicjo.sample.pac.ConnectManagerSetting;

public abstract class ConnectManager implements IConnectManager {

	private static ConnectManager connectManager = null;

	public abstract Connection createConnection();

	public static ConnectManager getConnectManager() {

		if (connectManager == null) {
			createInstanceConnectManager();
		}

		return connectManager;
	}

	public static void clearConnectManager() {
		connectManager = null;
	}

	private static void createInstanceConnectManager() {
		if (ConnectManagerSetting.isConnectionPoolEnabled()) {
			createInstanceConnectPoolManager();
		} else {
			connectManager = new ConnectLegacyManager();
		}
	}

	private static void createInstanceConnectPoolManager() {
		try {
			connectManager = (ConnectManager) Class.forName("com.bicjo.sample.pac.connect.ConnectPoolManager")
					.newInstance();
		} catch (InstantiationException e) {
			logError(e.getMessage());
		} catch (IllegalAccessException e) {
			logError(e.getMessage());
		} catch (ClassNotFoundException e) {
			logError(e.getMessage());
		}
	}

	private static void logError(String errMessage) {
		System.err.println(errMessage);
	}

}
