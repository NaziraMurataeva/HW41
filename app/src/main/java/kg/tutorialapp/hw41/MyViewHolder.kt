package kg.tutorialapp.hw41

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MyViewHolder(itemView: View): BaseViewHolder<Any>(itemView) {

  override fun bind(item: Any) {
      item as Item

        itemView.run {
            val iv_icon = findViewById<ImageView>(R.id.iv_icon)
            val tv_name = findViewById<TextView>(R.id.tv_name)
            iv_icon.setImageResource(item.icon)
            tv_name.text = item.name
        }
    }
    companion object{
        fun create(parent : ViewGroup, listener : MyAdapter.OnClickListener): MyViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_my_view_holder, parent, false)
            val holder = MyViewHolder(view)


            holder.itemView.setOnClickListener {
                listener.onItemClick(holder.adapterPosition)
            }

            holder.itemView.findViewById<Button>(R.id.button).setOnClickListener {
                listener.onButtonClick(holder.adapterPosition)
            }

            return holder

        }
    }
}