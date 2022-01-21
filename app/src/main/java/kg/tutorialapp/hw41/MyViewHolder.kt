package kg.tutorialapp.hw41

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    fun bind(item: Item) {
        itemView.run {
            val iv_icon = findViewById<ImageView>(R.id.iv_icon)
            val tv_name = findViewById<TextView>(R.id.tv_name)
            iv_icon.setImageResource(item.icon)
            tv_name.text = item.name
        }
    }
    companion object{
        fun create(parent:ViewGroup): MyViewHolder{
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_my_view_holder,parent,false)
            return MyViewHolder(view)
        }
    }


}