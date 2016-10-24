package com.bicjo.sample.pac;

import java.sql.Connection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.bicjo.sample.pac.connect.ConnectManager;

public class ConnectMainTest {

	@Before
	public void before_test() {
		ConnectManager.clearConnectManager();
	}

	@Test
	public void createConnection_ConnectPoolManager() {
		ConnectManagerSetting.enabledConnectionPool();
		Connection connection = ConnectMain.createConnection();

		Assert.assertNotNull(connection);

	}

	@Test
	public void createConnection_ConnectLegacyManager() {
		ConnectManagerSetting.disabledConnectionPool();
		Connection connection = ConnectMain.createConnection();

		Assert.assertNotNull(connection);

	}

}
