package com.greenhackersinstitude.uitest

import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_scrolling.*

class ScrollingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrolling)
        setSupportActionBar(toolbar)


    }

    fun goToDetail(view: View) {
        supportFragmentManager.beginTransaction().add(R.id.frag_container,CityDetail()).addToBackStack(null).commit()
        Toast.makeText(this,"Hello",Toast.LENGTH_LONG).show()
    }
}
