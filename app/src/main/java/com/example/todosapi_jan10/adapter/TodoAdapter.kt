package com.example.todosapi_jan10.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.todosapi_jan10.databinding.TodoItemBinding
import com.example.todosapi_jan10.model.network.models.Todo

class TodoAdapter(
    private val todoList: List<Todo>
): RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoAdapter.TodoViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = TodoItemBinding.inflate(inflater, parent, false)
        return TodoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.bind(todoList[position])
    }

    // size of item
    override fun getItemCount(): Int {
        return todoList.size
    }

    // Attaches data to xml of our item.
    class TodoViewHolder(private val binding: TodoItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(todo: Todo) {
            with(binding) {
                todoTv.text = todo.toString()
            }
        }
    }
}