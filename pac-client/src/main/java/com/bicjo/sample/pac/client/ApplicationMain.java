package com.bicjo.sample.pac.client;

import com.bicjo.sample.pac.ConnectMain;

public class ApplicationMain {

	public static void main(String[] args) {
		ApplicationMain appMain = new ApplicationMain();
		appMain.doSomething();
	}

	public void doSomething() {
		ConnectMain.createConnection();
	}

}
