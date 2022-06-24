package com.tomuchcoffee.whatsapp.ui.fragment

import android.app.Activity.RESULT_OK
import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tomuchcoffee.whatsapp.databinding.FragmentStatusBinding
import com.tomuchcoffee.whatsapp.model.DataDummy
import com.tomuchcoffee.whatsapp.model.UsersData
import com.tomuchcoffee.whatsapp.ui.adapter.StatusAdapter


class StatusFragment : Fragment() {

    private lateinit var binding: FragmentStatusBinding
    private lateinit var rvstatus: RecyclerView
    private var statusLis: ArrayList<UsersData> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =  FragmentStatusBinding.inflate(inflater, container, false)
        rvstatus = binding.rvStatus
        rvstatus.setHasFixedSize(true)
        statusLis.addAll(DataDummy.usersData)
        rvstatus.layoutManager = LinearLayoutManager(activity)
        val statusAdapter = StatusAdapter(statusLis)
        rvstatus.adapter = statusAdapter


        val btn_captur = binding.floatingActionButtonStatus

        btn_captur.setOnClickListener {
            openCamera()
        }


        return binding.root
    }

    private fun openCamera() {
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also {intent ->  
            activity?.packageManager?.let {
                intent?.resolveActivity(it).also {
                    startActivityForResult(intent, REQ_CAM)
                }
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQ_CAM && resultCode == RESULT_OK){

        }
    }


    companion object{
        const val REQ_CAM = 100
    }



}