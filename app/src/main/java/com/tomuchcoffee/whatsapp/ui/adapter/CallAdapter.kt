package com.tomuchcoffee.whatsapp.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.tomuchcoffee.whatsapp.databinding.CallListItemBinding
import com.tomuchcoffee.whatsapp.model.UsersData

class CallAdapter(val lishCall: ArrayList<UsersData>) :
    RecyclerView.Adapter<CallAdapter.ViewHolde>()  {
    inner class ViewHolde(val binding: CallListItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolde {
        return ViewHolde(
            CallListItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolde, position: Int) {
        with(holder) {
            with(lishCall[position]) {
                val contex = itemView.context
                binding.tvNamecall.text = this.userName
                binding.tvTimecall.text = this.chatTimeCall
                Glide
                    .with(contex)
                    .load(this.userPhoto)
                    .apply(RequestOptions().override(350, 550))
                    .into(binding.ivCall)
            }
        }

    }

    override fun getItemCount(): Int {
       return lishCall.size
    }


}