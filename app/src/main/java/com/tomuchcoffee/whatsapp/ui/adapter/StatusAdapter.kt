package com.tomuchcoffee.whatsapp.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.tomuchcoffee.whatsapp.databinding.CallListItemBinding
import com.tomuchcoffee.whatsapp.databinding.StatusListItemBinding
import com.tomuchcoffee.whatsapp.model.UsersData

class StatusAdapter(val lishStatus: ArrayList<UsersData>) :
    RecyclerView.Adapter<StatusAdapter.ViewHolde>()  {
    inner class ViewHolde(val binding: StatusListItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolde {
        return ViewHolde(
            StatusListItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolde, position: Int) {
        with(holder) {
            with(lishStatus[position]) {
                val contex = itemView.context
                binding.tvNameStatus.text = this.userName
                binding.tvStatusTime.text = this.chatTimeStatus
                Glide
                    .with(contex)
                    .load(this.userPhoto)
                    .apply(RequestOptions().override(350, 550))
                    .into(binding.ivStatus)
            }
        }

    }

    override fun getItemCount(): Int {
       return lishStatus.size
    }


}