package com.vasifgumbatov.androidbootcamp.odev_4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.androidbootcamp.R
import com.example.androidbootcamp.databinding.FragmentAnaSayfaBinding

class AnaSayfa : Fragment() {

    private lateinit var binding: FragmentAnaSayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentAnaSayfaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.gitSayfaA.setOnClickListener {
            findNavController().navigate(R.id.action_anaSayfa_to_sayfaA)
        }

        binding.gitSayfaX.setOnClickListener {
            findNavController().navigate(R.id.action_anaSayfa_to_sayfaX)
        }

    }
}