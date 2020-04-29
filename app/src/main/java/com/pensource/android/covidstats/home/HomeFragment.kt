package com.pensource.android.covidstats.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.pensource.android.covidstats.R

class HomeFragment : Fragment() {

    private lateinit var mView: View

    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mView = layoutInflater.inflate(R.layout.fragment_home, container, false)

        recyclerView = mView.findViewById(R.id.recyclerView)

        return mView
    }

}
