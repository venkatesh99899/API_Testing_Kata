package com.booking.api.restassured.config;

import java.io.File;

public class Config {
	/*
	 * Config class contains all the system configuration settings
	 * Created By : Venkateswararao Machavarapu
	 * Created On : 24/06/2025
	 */
	public static String WORKING_DIRECTORY			=	"";
	public static String PROPERTY_FILE_PATH			=	"";
	public static String EXECUTION_ENVIRONMENT_NAME	=	"";
	
	/*
	 * This method sets the current working directory path
	 * 
	 */
	public static void setWorkingDirectory() {
		try {
			WORKING_DIRECTORY						=	System.getProperty("user.dir");
		}catch(NullPointerException npe) {
			npe.printStackTrace();
		}
	}
	/*
	 * This method sets the current execution environment
	 * 
	 */
	public static void setExecutionEnvironment(String ENV) {
		try {
			EXECUTION_ENVIRONMENT_NAME				=	ENV;
		}catch(NullPointerException npe) {
			npe.printStackTrace();
		}
	}
	/*
	 * This method sets the current execution environment property file path
	 * 
	 */
	public static void setPropertyFilePath() {
		try {
			PROPERTY_FILE_PATH						=	"PropertyFiles"+File.separator+"EnvironmentProperties"+File.separator;
		}catch(NullPointerException npe) {
			npe.printStackTrace();
		}
	}
	/*
	 * This method gets the current execution directory
	 * 
	 */
	public static String getWorkingDirectory() {
		return WORKING_DIRECTORY;
	}
	/*
	 * This method gets the current execution file path
	 * 
	 */
	public static String getPropertyFilePath() {
		return PROPERTY_FILE_PATH;
	}
	/*
	 * This method gets the current execution environment
	 * 
	 */
	public static String getExecutionEnvironment() {
		return EXECUTION_ENVIRONMENT_NAME;
	}
}
