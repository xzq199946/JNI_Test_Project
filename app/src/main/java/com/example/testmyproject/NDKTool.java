package com.example.testmyproject;

public class NDKTool {
    public native String callNative(String string);

    public static void loadLibrary() throws RuntimeException {
        try {
            System.out.println("load  start");
            System.loadLibrary("NDKTool");
            System.out.println("load ndkTool.so end");
        } catch (UnsatisfiedLinkError e) {
            System.out.println("load ndkTool.so error");
            e.printStackTrace();
        }
    }


}
