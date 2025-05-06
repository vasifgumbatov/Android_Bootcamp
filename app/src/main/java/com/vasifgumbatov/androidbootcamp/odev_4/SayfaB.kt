package com.vasifgumbatov.androidbootcamp.odev_4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.androidbootcamp.R
import com.example.androidbootcamp.databinding.FragmentSayfaBBinding

class SayfaB : Fragment() {
    private lateinit var binding: FragmentSayfaBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentSayfaBBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.gitSayfaY.setOnClickListener {
            findNavController().navigate(R.id.action_sayfaB_to_sayfaY)
        }
    }
}