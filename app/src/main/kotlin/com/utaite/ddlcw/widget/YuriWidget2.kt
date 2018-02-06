package com.utaite.ddlcw.widget

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.widget.RemoteViews
import com.utaite.ddlcw.R

class YuriWidget2 : AppWidgetProvider() {

    override fun onUpdate(context: Context, appWidgetManager: AppWidgetManager, appWidgetIds: IntArray) {
        for (appWidgetId in appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId)
        }
    }

    override fun onEnabled(context: Context) {}

    override fun onDisabled(context: Context) {}

    companion object {

        internal fun updateAppWidget(context: Context, appWidgetManager: AppWidgetManager, appWidgetId: Int) {
            val views = RemoteViews(context.packageName, R.layout.yuri_widget)
            views.setImageViewResource(R.id.yuri_image, R.drawable.yuri_2)
            appWidgetManager.updateAppWidget(appWidgetId, views)
        }

    }

}