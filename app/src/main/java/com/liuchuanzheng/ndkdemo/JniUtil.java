package com.liuchuanzheng.ndkdemo;

/**
 * @author 刘传政
 * @date 2018/9/25 0025 15:41
 * QQ:1052374416
 * 电话:18501231486
 * 作用:
 * 注意事项:
 */
public class JniUtil {
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }
    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public static native String stringFromJNI();

    public static native String stringFromJNI2();
}
