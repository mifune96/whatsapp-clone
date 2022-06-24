package com.tomuchcoffee.whatsapp.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.tomuchcoffee.whatsapp.R
import com.tomuchcoffee.whatsapp.databinding.ActivityDetailChatBinding
import com.tomuchcoffee.whatsapp.databinding.AppbarDetailchatBinding

class DetailChatActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityDetailChatBinding
    private lateinit var binds: AppbarDetailchatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailChatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binds.toolbarDetailchat)

        val navController = findNavController(R.id.nav_host_fragment_content_detail_chat)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)


    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_detail_chat)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}