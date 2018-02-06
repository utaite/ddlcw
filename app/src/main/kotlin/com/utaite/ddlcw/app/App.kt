package com.utaite.ddlcw.app

import android.app.Application
import com.utaite.ddlcw.R
import com.utaite.ddlcw.util.SettingUtil
import uk.co.chrisjenx.calligraphy.CalligraphyConfig


class App : Application() {

    override fun onCreate() {
        super.onCreate()

        val calligraphyConfig = CalligraphyConfig.Builder()
                .setDefaultFontPath(SettingUtil.FONT)
                .setFontAttrId(R.attr.fontPath)
                .build()
        CalligraphyConfig.initDefault(calligraphyConfig)
    }

}
