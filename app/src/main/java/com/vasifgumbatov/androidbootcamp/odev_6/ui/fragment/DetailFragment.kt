package com.vasifgumbatov.androidbootcamp.odev_6.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidbootcamp.R
import com.example.androidbootcamp.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {
    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val args = DetayFragmentArgs.fromBundle(requireArguments())
//        binding.imageViewDetail.setImageResource(args.imageResId)
//        binding.textViewDetailPrice.text = args.price

//        imageView.setImageResource(args.imageResId)
//        textView.text = args.price
    }

}