package com.vasifgumbatov.androidbootcamp.odev_6.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidbootcamp.R
import com.example.androidbootcamp.databinding.FragmentAppWithRecyclerViewBinding
import com.vasifgumbatov.androidbootcamp.odev_6.data.Film
import com.vasifgumbatov.androidbootcamp.odev_6.ui.adapter.FilmAdapter

class AppWithRecyclerView : Fragment() {
    private lateinit var binding: FragmentAppWithRecyclerViewBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var filmAdapter: FilmAdapter

//    private val filmList = listOf(
//        Film(1, "Example1", R.drawable.django, "100 $"),
//        Film(2, "Example2", R.drawable.interstellar, "100 $"),
//        Film(3, "Example3", R.drawable.inception, "100 $"),
//        Film(4, "Example4", R.drawable.hateful_eight, "100 $")
//    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentAppWithRecyclerViewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = binding.recyclerViewFilms
        recyclerView.adapter = filmAdapter
//        filmAdapter = FilmAdapter(filmList) { selectedFilm ->
//            val bundle = Bundle().apply {
//                putInt("filmId", selectedFilm.id)
//            }
//        }
    }

}