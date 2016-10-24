package com.bicjo.sample.pac;

public class ConnectManagerSetting {

	private static boolean ENABLE_CONNECTION_POOL = false;

	public static void disabledConnectionPool() {
		ENABLE_CONNECTION_POOL = false;
	}

	public static void enabledConnectionPool() {
		ENABLE_CONNECTION_POOL = true;
	}

	public static boolean isConnectionPoolEnabled() {
		return ENABLE_CONNECTION_POOL;
	}

}
