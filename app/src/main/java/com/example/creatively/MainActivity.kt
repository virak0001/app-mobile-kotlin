package com.example.creatively

import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        initView()
    }

    private fun initView(){
        val menu: ImageView = findViewById(R.id.menuImageView)
        menu.setOnClickListener {
            this.findViewById<DrawerLayout>(R.id.drawer_layout).openDrawer(GravityCompat.START)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_notifications -> Toast.makeText(this, "Show notification", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}