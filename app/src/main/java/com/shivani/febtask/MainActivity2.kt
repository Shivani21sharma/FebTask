package com.shivani.febtask

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.shivani.febtask.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.fab.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Do you Want to Change number")
                .setCancelable(false)
                .setPositiveButton("Ok", {_,_->
                    Toast.makeText(this, "Increment", Toast.LENGTH_SHORT).show()
                })
                .setNegativeButton("Negative", {_,_->
                    Toast.makeText(this, "Decrement", Toast.LENGTH_SHORT).show()
                })
                .setNeutralButton("Neutral", {_,_->
                    Toast.makeText(this, "Cancel", Toast.LENGTH_SHORT).show()
                })
                .show()
        }
    }
}