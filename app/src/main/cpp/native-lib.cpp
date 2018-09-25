#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring

JNICALL
Java_com_liuchuanzheng_ndkdemo_JniUtil_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "刘传政 from C++";
    return env->NewStringUTF(hello.c_str());
}
extern "C"
JNIEXPORT jstring JNICALL
Java_com_liuchuanzheng_ndkdemo_JniUtil_stringFromJNI2(JNIEnv *env, jobject instance) {

    std::string hello = "刘传政2 from C++";
    return env->NewStringUTF(hello.c_str());
}