package kg.tutorialapp.hw41

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), FragmentItemsListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setup()

    }

    private fun setup() {
        supportFragmentManager.beginTransaction()
            .add(R.id.container, FragmentItems())
            .addToBackStack(null)
            .commit()
    }
    override fun openFragmentItemDetails(id: Long) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container,FragmentDetails.newInstance(id))
            .addToBackStack(null)
            .commit()


    }


}