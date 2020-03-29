package com.kspl.mykotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView

class Adaptor(
    val context: Context,
    var data: List<DataClass> = listOf<DataClass>()

) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            1 -> ViewHolder1(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.row_one,
                    parent,
                    false
                )
            )
            2 -> ViewHolder2(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.row_two,
                    parent,
                    false
                )
            )
            else -> ViewHolder2(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.row_two,
                    parent,
                    false
                )
            )
        }

    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when (getItemViewType(position)) {
            1 -> {
                val holder = holder as ViewHolder1
                if (data.get(position).position == 1)
                    holder.layout1.setBackgroundResource(R.drawable.white_rect)
                else
                    holder.layout1.setBackgroundResource(R.drawable.gray_rect)
            }
            2 -> {
                val holder = holder as ViewHolder2

                if (data.get(position).position == 2)
                    holder.layout2.setBackgroundResource(R.drawable.pink_rect)
                else if(data.get(position).position==3)
                    holder.layout2.setBackgroundResource(R.drawable.purple_rect)
                else
                    holder.layout2.setBackgroundResource(R.drawable.black_rect)



            }
        }


    }

    override fun getItemViewType(position: Int): Int = if (data.get(position).type == 1) 1 else 2


    inner class ViewHolder1(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val layout1: LinearLayout = itemView.findViewById(R.id.layout1)


    }

    inner class ViewHolder2(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val layout2: LinearLayout = itemView.findViewById(R.id.layout2)


    }

}