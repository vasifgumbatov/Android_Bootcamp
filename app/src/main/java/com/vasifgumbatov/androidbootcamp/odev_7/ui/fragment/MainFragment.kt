package com.vasifgumbatov.androidbootcamp.odev_7.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.androidbootcamp.R
import com.example.androidbootcamp.databinding.FragmentMainBinding
import com.vasifgumbatov.androidbootcamp.odev_7.ui.adapter.TodoAdapter
import com.vasifgumbatov.androidbootcamp.odev_7.ui.viewmodel.TodoViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private val viewModel: TodoViewModel by viewModels()
    private lateinit var adapter: TodoAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.addTaskFABtn.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_registrationFragment)
        }

        binding.taskRV.adapter = adapter

        viewModel.allTodos.observe(viewLifecycleOwner) {
            adapter = TodoAdapter(it)
        }
    }
}