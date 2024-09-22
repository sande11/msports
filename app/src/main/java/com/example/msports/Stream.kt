package com.example.msports

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import androidx.fragment.app.Fragment

class Stream : Fragment() {

    private lateinit var iconSearch: ImageView
    private lateinit var searchField: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_stream, container, false)

        iconSearch = view.findViewById(R.id.iconsearch)
        searchField = view.findViewById(R.id.searchField)

        iconSearch.setOnClickListener {
            if (searchField.visibility == View.GONE) {
                searchField.visibility = View.VISIBLE
            } else {
                searchField.visibility = View.GONE
            }
        }

        return view
    }
}
