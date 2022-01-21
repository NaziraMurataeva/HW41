package kg.tutorialapp.hw41

import android.annotation.SuppressLint
import android.util.Log
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kg.tutorialapp.hw41.Data.items

class MyAdapter: RecyclerView.Adapter<MyViewHolder>() {

    private val items = arrayListOf<Item>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        Log.i(MyAdapter.tag, "onCreateViewHolder")
        return MyViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Log.i(MyAdapter.tag, "onBindViewHolder")
        holder.bind(items[position])
    }

    override fun getItemCount() = items.count()

    @SuppressLint("NotifyDataSetChanged")
    fun setItems(newItems: List<Item>){
        items.clear()
        items.addAll(newItems)
        notifyDataSetChanged()
    }

    companion object{
        const val tag = "ADAPTER"
    }
}