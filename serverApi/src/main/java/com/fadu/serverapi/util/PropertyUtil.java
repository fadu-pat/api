package com.fadu.serverapi.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtil {
	public final static String MODE_REAL = "real";
	public final static String MODE_DEV = "dev";

	private static String mode = "";

	private final static String PATH_PREFIX = PropertyUtil.class.getResource("").getPath().substring(0,
			PropertyUtil.class.getResource("").getPath().lastIndexOf("com"));

	public static String getMode() {
		// 모드 초기?��
		if ("".equals(mode)) {
			initMode();
		}
		return mode;
	}

	private static void initMode() {
		if ("".equals(mode)) {
			Properties props = new Properties();
			FileInputStream fis = null;
			try {
				fis = new FileInputStream(PATH_PREFIX + "conf" + System.getProperty("file.separator") + "property"
						+ System.getProperty("file.separator") + "service.properties");
				props.load(new java.io.BufferedInputStream(fis));
				mode = props.getProperty("service.mode").trim();
			} catch (FileNotFoundException fne) {
				fne.printStackTrace();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (fis != null)
						fis.close();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
	}

	private static String changeKeyName(String keyName) {
		if ("".equals(mode)) {
			initMode();
		}
		if (MODE_REAL.equals(mode)) {
			return keyName + "." + MODE_REAL;
		} else {
			return keyName + "." + MODE_DEV;
		}
	}

	public static String getProperty(String propName, String keyName) {
		return getProperty(propName, keyName, false);
	}

	public static String getProperty(String propName, String keyName, boolean isMode) {

		if (isMode) {
			keyName = changeKeyName(keyName);
		}

		String value = "";
		Properties props = new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(PATH_PREFIX + "conf" + System.getProperty("file.separator") + "property"
					+ System.getProperty("file.separator") + propName + ".properties");
			props.load(new java.io.BufferedInputStream(fis));
			value = props.getProperty(keyName).trim();
		} catch (FileNotFoundException fne) {
			fne.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return value;
	}

	public static int getPropertyInt(String propName, String keyName, int defaultVal) {
		return getPropertyInt(propName, keyName, defaultVal, false);
	}

	public static int getPropertyInt(String propName, String keyName, int defaultVal, boolean isMode) {
		try {
			return Integer.parseInt(getProperty(propName, keyName, isMode));
		} catch (NumberFormatException e) {
			return defaultVal;
		}
	}

	public static boolean getPropertyBoolean(String propName, String keyName, boolean defaultVal) {
		return getPropertyBoolean(propName, keyName, defaultVal, false);
	}

	public static boolean getPropertyBoolean(String propName, String keyName, boolean defaultVal, boolean isMode) {
		try {
			return Boolean.parseBoolean(getProperty(propName, keyName, isMode));
		} catch (Exception e) {
			return defaultVal;
		}
	}
}
