package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(_context : Context, _fontSize : Array<Int>) : BaseAdapter() {

    val context = _context
    val fontSize = _fontSize
    override fun getCount(): Int {
//        return fontSize.size
    }

    override fun getItem(position: Int): Any {
//        return fontSize[position]
    }

    override fun getItemId(position: Int): Long {
//        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
//        val textView = TextView(context)
//        textView.text = getItem(position).toString()
//        textView.textSize = position.toFloat()
//        textView.setPadding(5, 10, 0,10)
//        return textView
    }

}