package com.tomuchcoffee.whatsapp.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.tomuchcoffee.whatsapp.databinding.ChatListItemBinding
import com.tomuchcoffee.whatsapp.model.UsersData

class ChatAdapter(val listChat: ArrayList<UsersData>) :
    RecyclerView.Adapter<ChatAdapter.ViewHolde>()  {
    inner class ViewHolde(val binding: ChatListItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolde {
        return ViewHolde(
            ChatListItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolde, position: Int) {
        with(holder) {
            with(listChat[position]) {
                val contex = itemView.context
                binding.tvName.text = this.userName
                binding.lastChat.text = this.message
                binding.tvTime.text = this.time
                binding.tvAngka.text = this.unSeenMsg.toString()
                if(this.unSeenMsg != 0){
                    binding.divAngka.visibility = View.VISIBLE
                }
                Glide
                    .with(contex)
                    .load(this.userPhoto)
                    .apply(RequestOptions().override(350, 550))
                    .into(binding.ivPhoto)


//                itemView.setOnClickListener {
//                    val intentDetail = Intent(contex, DetailChatActivity::class.java)
//                    intentDetail.putExtra(DetailChatActivity., this.name)
//                    intentDetail.putExtra(DetailActivity.CHAR_DETAIL, this.info)
//                    intentDetail.putExtra(DetailActivity.CHAR_SWORDSMANSHIP, this.Swordsmanship)
//                    intentDetail.putExtra(DetailActivity.CHAR_PHOTO, this.photo.toString())
//                    contex.startActivities(arrayOf(intentDetail))
//                }
            }
        }

    }

    override fun getItemCount(): Int {
       return listChat.size
    }


}