package com.NewBellatrix.config;

import java.io.FileNotFoundException;

import com.NewBellatrix.Utilities.*;
public class Configuration {

	public String getAppUrl(String env) throws FileNotFoundException {
		FileUtil file = new FileUtil();
		return file.getProperty( "/src/main/resources/config.properties", "app.url");

	}
}
