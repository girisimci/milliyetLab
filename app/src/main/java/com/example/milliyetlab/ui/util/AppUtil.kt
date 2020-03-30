package com.example.milliyetlab.ui.util

import android.content.Context
import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Build
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AppCompatActivity

infix fun <T : AppCompatActivity> AppCompatActivity.extStartActivity(className: Class<T>) {

    startActivity(Intent(this, className))
}

fun Context.extGetDrawable(@DrawableRes drawableId: Int): Drawable =
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        resources.getDrawable(drawableId, theme)
    } else {
        resources.getDrawable(drawableId)
    }