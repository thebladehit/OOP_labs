package com.example.lab4.shapes
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.DashPathEffect
import android.graphics.Paint

class LineShape (x: Float, y: Float) : Shape(x, y) {
    override fun onDraw(canvas: Canvas, paint: Paint) {
        if (!isDrawing) {
            paint.color = Color.RED
            paint.pathEffect = null
        }
        canvas.drawLine(startX, startY, endX, endY, paint)
    }
}