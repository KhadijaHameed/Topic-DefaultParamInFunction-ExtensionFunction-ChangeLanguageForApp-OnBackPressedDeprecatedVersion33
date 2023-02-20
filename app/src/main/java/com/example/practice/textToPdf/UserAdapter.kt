package com.example.practice.textToPdf

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.practice.databinding.TtpItemBinding

class UserAdapter :
    ListAdapter<User, UserAdapter.UserViewHolder>(UserCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = TtpItemBinding.inflate(layoutInflater, parent, false)
        return UserViewHolder(binding)
    }

    inner class UserViewHolder(private val binding: TtpItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: User) {
            with(binding) {
                user = item
                executePendingBindings()
            }
        }
    }

    override fun onBindViewHolder(
        holder: UserViewHolder,
        position: Int
    ) {
        holder.bind(getItem(position))
    }
}

class UserCallback : DiffUtil.ItemCallback<User>() {
    override fun areItemsTheSame(
        oldItem: User,
        newItem: User
    ): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(
        oldItem: User,
        newItem: User
    ): Boolean {
        return oldItem == newItem
    }

}