package com.tomuchcoffee.whatsapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tomuchcoffee.whatsapp.databinding.FragmentChatBinding
import com.tomuchcoffee.whatsapp.model.DataDummy
import com.tomuchcoffee.whatsapp.model.UsersData
import com.tomuchcoffee.whatsapp.ui.adapter.ChatAdapter

class ChatFragment : Fragment() {

    private lateinit var binding: FragmentChatBinding
    private lateinit var rvChat: RecyclerView
    private var chatList: ArrayList<UsersData> = arrayListOf()


    companion object {
        private const val ARG_SECTION_NUMBER = "section_number"

        @JvmStatic
        fun newInstance(index: Int) =
            ChatFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, index)
                }
            }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentChatBinding.inflate(inflater, container,false)


        rvChat = binding.rvChat
        rvChat.setHasFixedSize(true)

        chatList.addAll(DataDummy.usersData)
        setupRv()



        return binding.root
    }


    private fun setupRv() {
        rvChat.layoutManager = LinearLayoutManager(activity)
        val chatAdapter = ChatAdapter(chatList)
        rvChat.adapter = chatAdapter
    }


}