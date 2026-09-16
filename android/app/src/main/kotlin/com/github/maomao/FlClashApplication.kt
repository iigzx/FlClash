package com.github.maomao

import android.app.Application
import android.content.Context
import com.github.maomao.common.GlobalState

class FlClashApplication : Application() {
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        GlobalState.init(this)
    }
}
