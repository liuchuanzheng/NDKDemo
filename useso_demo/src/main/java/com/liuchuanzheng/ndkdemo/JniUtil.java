package com.liuchuanzheng.ndkdemo;

/**
 * @author 刘传政
 * @date 2018/9/25 0025 16:29
 * QQ:1052374416
 * 电话:18501231486
 * 作用:
 * 注意事项:
 * 步骤：1拷贝so文件到项目的main/jniLibs目录
         2新建package，包名与类名以及方法名必须与生成so文件的类保持一致！
         3使用loadLibrary加载动态库，
         4声明native方法
         5调用native方法
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
