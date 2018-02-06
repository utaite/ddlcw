package com.utaite.ddlcw.util

import android.content.Context
import android.graphics.Typeface
import android.support.v7.app.ActionBar
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.utaite.ddlcw.R
import kotlinx.android.synthetic.main.common_action_bar.view.*


fun getView(context: Context, resId: Int): View =
        LayoutInflater.from(context).inflate(resId, null)

fun TextView.setFont(context: Context) {
    typeface = Typeface.createFromAsset(context.assets, SettingUtil.FONT)
}

fun ActionBar.setTitle(context: Context, title: Int) =
        setTitle(context, context.getString(title))

fun ActionBar.setTitle(context: Context, title: String) {
    customView = getView(context, R.layout.common_action_bar).apply {
        actionBarTitle.text = title
        actionBarTitle.setFont(context)
    }
    displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
}
