package com.shivani.febtask.JetpackNavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.shivani.febtask.R

class JetpackActivity : AppCompatActivity() {
    var controller : NavController?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jet_pack)
        controller = findNavController(R.id.controller)
    }
}