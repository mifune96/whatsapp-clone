package com.tomuchcoffee.whatsapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tomuchcoffee.whatsapp.databinding.FragmentCallsBinding
import com.tomuchcoffee.whatsapp.model.DataDummy
import com.tomuchcoffee.whatsapp.model.UsersData
import com.tomuchcoffee.whatsapp.ui.adapter.CallAdapter


class CallsFragment : Fragment() {

    private lateinit var binding: FragmentCallsBinding
    private lateinit var rvcall: RecyclerView
    private var callList: ArrayList<UsersData> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =  FragmentCallsBinding.inflate(inflater,container, false)

        rvcall = binding.rvCall
        rvcall.setHasFixedSize(true)
        callList.addAll(DataDummy.usersData)
        rvcall.layoutManager = LinearLayoutManager(activity)
        val callAdapter = CallAdapter(callList)
        rvcall.adapter = callAdapter


        return binding.root
    }




}