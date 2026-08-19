package io.legado.app.utils

import android.content.Context
import android.util.Log

object LogUtils {
    fun d(tag: String, msg: String) {
        Log.d(tag, msg)
    }

    fun i(tag: String, msg: String) {
        Log.i(tag, msg)
    }

    fun w(tag: String, msg: String) {
        Log.w(tag, msg)
    }

    fun e(tag: String, msg: String) {
        Log.e(tag, msg)
    }

    // 兼容 App.kt 中的调用
    fun init(context: Context) {
        // 可以在这里添加初始化逻辑，如果需要
    }

    // 兼容 App.kt 中的调用
    fun logDeviceInfo() {
        // 可以在这里添加设备信息日志，如果需要
    }
}
