package com.github.maomao.core

import androidx.annotation.Keep

@Keep
interface InvokeInterface {
    fun onResult(result: String?)
}