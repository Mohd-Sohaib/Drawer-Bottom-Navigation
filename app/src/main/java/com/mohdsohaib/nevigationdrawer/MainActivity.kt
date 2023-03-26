package com.mohdsohaib.nevigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.mohdsohaib.nevigationdrawer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var toggle: ActionBarDrawerToggle
    lateinit var bottom_toggle: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
           bottom_toggle = BottomNavigationView(this@MainActivity)
           navBottom.selectedItemId = R.id.bottom_home

           navBottom.setOnItemSelectedListener {
               when(it.itemId){
                   R.id.bottom_post -> {
                       Toast.makeText(this@MainActivity,"Post Clicked",Toast.LENGTH_SHORT).show()
                   }

                   R.id.bottom_search -> {
                       Toast.makeText(this@MainActivity,"Search Clicked",Toast.LENGTH_SHORT).show()
                   }

                   R.id.bottom_home -> {
                       Toast.makeText(this@MainActivity,"Home Clicked",Toast.LENGTH_SHORT).show()
                   }

                   R.id.bottom_favorite -> {
                       Toast.makeText(this@MainActivity,"Favorite Clicked",Toast.LENGTH_SHORT).show()
                   }

                   R.id.bottom_profile -> {
                       Toast.makeText(this@MainActivity,"Profile Clicked",Toast.LENGTH_SHORT).show()
                   }
               }
               true
           }

        }


        binding.apply {
            toggle = ActionBarDrawerToggle(this@MainActivity, drawerLayout, 0, 0)
            drawerLayout.addDrawerListener(toggle)
            toggle.syncState()

            supportActionBar?.setDisplayHomeAsUpEnabled(true)

            navView.setNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.home -> {
                        Toast.makeText(this@MainActivity, "Home Clicked", Toast.LENGTH_SHORT).show()
                    }
                    R.id.gallery -> {
                        Toast.makeText(this@MainActivity, "Gallery Clicked", Toast.LENGTH_SHORT)
                            .show()
                    }
                    R.id.tool -> {
                        Toast.makeText(this@MainActivity, "Tool Clicked", Toast.LENGTH_SHORT).show()
                    }
                    R.id.share -> {
                        Toast.makeText(this@MainActivity, "Share Clicked", Toast.LENGTH_SHORT)
                            .show()
                    }
                    R.id.send -> {
                        Toast.makeText(this@MainActivity, "Send Clicked", Toast.LENGTH_SHORT).show()
                    }
                }
                true
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            true
        }
        return super.onOptionsItemSelected(item)
    }
}
