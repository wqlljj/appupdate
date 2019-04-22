package com.wangqi.appbsdiff;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		String path ="C:\\Users\\cloud\\Desktop\\app";
		String oldPath=path+File.separator+"oldapk.apk";
		String newPath=path+File.separator+"newapk.apk";
		String patchPath=path+File.separator+"apk.patch";
		AppDiffUtil.appDiff(oldPath, newPath, patchPath);
		System.out.println("Patch build success!");
	}

}
