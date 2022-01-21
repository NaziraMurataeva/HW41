package kg.tutorialapp.hw41

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var myAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setup()

    }
    private fun setup(){
        myAdapter = MyAdapter()
        val recyclerView = findViewById<RecyclerView>(R.id.rv)

        recyclerView.adapter = myAdapter

        myAdapter.setItems(Data.getlongListofItems())
    }
}