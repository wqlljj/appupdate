package com.wangqi.appbsdiff;

public class AppDiffUtil {
	static {
		System.load("C:\\Users\\cloud\\Documents\\Visual Studio 2013\\Projects\\appdiff\\x64\\Debug\\appdiff.dll");
	}
	
	public static native void appDiff(String app_old,String app_new ,String app_patch);

}
