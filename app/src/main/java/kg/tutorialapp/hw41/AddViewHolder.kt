package kg.tutorialapp.hw41

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

class AddViewHolder (itemView: View):BaseViewHolder<Any>(itemView) {

   override fun bind(item: Any){
       item as String

      //val tv_url = findViewById<TextView>(R.id.tv_url)
     // itemView.tv_url.text = item

    }
    companion object{
        fun create(parent: ViewGroup, listener: MyAdapter.OnClickListener): AddViewHolder{
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_add_view_holder,parent,false)
            return AddViewHolder(view)
            }
        }


}