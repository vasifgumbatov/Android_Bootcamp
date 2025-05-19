package com.vasifgumbatov.androidbootcamp.odev_7.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.androidbootcamp.R
import com.example.androidbootcamp.databinding.ItemListMainBinding
import com.vasifgumbatov.androidbootcamp.odev_7.data.local.entity.ToDoEntity

class TodoAdapter(private val todoList: List<ToDoEntity>) :
    RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {

    inner class TodoViewHolder(private val binding: ItemListMainBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(todo: ToDoEntity) {
            binding.nameTxt.text = todo.name
            binding.descrTxt.text = todo.description
            binding.editImg.setOnClickListener {
                findNavController(it).navigate(R.id.action_mainFragment_to_detailFragment)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val binding =
            ItemListMainBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TodoViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return todoList.size
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.bind(todoList[position])
    }
}