package org.hypermoto.launcher

import android.app.Activity
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView

/**
 * First visual prototype for HyperMoto Launcher.
 *
 * This is an ordinary Android app prototype, not a replacement for Android
 * SystemUI and not a complete custom ROM component.
 */
class MainActivity : Activity() {
    private val ink = Color.rgb(28, 38, 58)
    private val muted = Color.rgb(102, 116, 140)
    private val accent = Color.rgb(78, 119, 190)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = Color.rgb(224, 237, 250)
        window.navigationBarColor = Color.rgb(224, 237, 250)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(22), dp(24), dp(22), dp(18))
            background = GradientDrawable(
                GradientDrawable.Orientation.TL_BR,
                intArrayOf(
                    Color.rgb(224, 237, 250),
                    Color.rgb(239, 233, 250),
                    Color.rgb(230, 244, 246)
                )
            )
        }

        val header = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER_VERTICAL
        }
        header.addView(label("HyperMoto", 27f, ink, true), LinearLayout.LayoutParams(0, -2, 1f))
        header.addView(label("0.1 • CONCEPT", 11f, muted, true))

        root.addView(header)
        root.addView(space(22))
        root.addView(label("Good evening", 15f, muted, false))
        root.addView(label("Your phone, reimagined.", 25f, ink, true))
        root.addView(space(18))

        val glassCard = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(18), dp(18), dp(18), dp(18))
            background = rounded(Color.argb(175, 255, 255, 255), 28)
            elevation = dp(5).toFloat()
        }
        glassCard.addView(label("HYPERMOTO SPACE", 10f, accent, true))
        glassCard.addView(space(7))
        glassCard.addView(label("A calmer home for everything.", 18f, ink, true))
        glassCard.addView(label("Glass-inspired surfaces • Original Android design", 12f, muted, false))
        root.addView(glassCard)

        root.addView(space(24))
        root.addView(label("Favourites", 19f, ink, true))
        root.addView(space(12))

        val grid = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
        val firstRow = LinearLayout(this).apply { orientation = LinearLayout.HORIZONTAL }
        val secondRow = LinearLayout(this).apply { orientation = LinearLayout.HORIZONTAL }

        listOf("Phone" to "☎", "Messages" to "✉", "Camera" to "◉", "Gallery" to "▧").forEachIndexed { index, item ->
            val tile = appTile(item.first, item.second)
            val params = LinearLayout.LayoutParams(0, dp(92), 1f).apply {
                if (index % 2 == 0) marginEnd = dp(9) else marginStart = dp(9)
                bottomMargin = dp(12)
            }
            if (index < 2) firstRow.addView(tile, params) else secondRow.addView(tile, params)
        }
        grid.addView(firstRow)
        grid.addView(secondRow)
        root.addView(grid)

        root.addView(View(this), LinearLayout.LayoutParams(1, 0, 1f))

        val dock = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER
            setPadding(dp(10), dp(10), dp(10), dp(10))
            background = rounded(Color.argb(195, 255, 255, 255), 30)
            elevation = dp(8).toFloat()
        }
        listOf("☎", "✉", "◎", "⚙").forEach { glyph ->
            val item = TextView(this).apply {
                text = glyph
                textSize = 24f
                gravity = Gravity.CENTER
                setTextColor(ink)
                background = rounded(Color.argb(125, 220, 232, 248), 19)
            }
            dock.addView(item, LinearLayout.LayoutParams(0, dp(54), 1f).apply {
                marginStart = dp(5)
                marginEnd = dp(5)
            })
        }
        root.addView(dock)
        root.addView(space(9))
        root.addView(label("Launcher concept • App tiles are visual placeholders", 10f, muted, false).apply {
            gravity = Gravity.CENTER
        })

        setContentView(root)
    }

    private fun appTile(title: String, glyph: String): View {
        return LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            background = rounded(Color.argb(160, 255, 255, 255), 22)
            addView(TextView(this@MainActivity).apply {
                text = glyph
                textSize = 25f
                gravity = Gravity.CENTER
                setTextColor(accent)
                typeface = Typeface.DEFAULT_BOLD
            })
            addView(TextView(this@MainActivity).apply {
                text = title
                textSize = 12f
                gravity = Gravity.CENTER
                setTextColor(ink)
            })
        }
    }

    private fun label(text: String, size: Float, color: Int, bold: Boolean): TextView =
        TextView(this).apply {
            this.text = text
            textSize = size
            setTextColor(color)
            if (bold) typeface = Typeface.DEFAULT_BOLD
        }

    private fun space(heightDp: Int): View =
        View(this).apply { layoutParams = LinearLayout.LayoutParams(1, dp(heightDp)) }

    private fun rounded(color: Int, radiusDp: Int) = GradientDrawable().apply {
        setColor(color)
        cornerRadius = dp(radiusDp).toFloat()
        setStroke(dp(1), Color.argb(100, 255, 255, 255))
    }

    private fun dp(value: Int): Int = (value * resources.displayMetrics.density).toInt()
}
