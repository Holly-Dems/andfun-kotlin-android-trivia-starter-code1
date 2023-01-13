package com.example.android.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.android.navigation.databinding.FragmentTitleBinding


class TitleFragement : Fragment() {
    // TODO: Rename and change types of parameters


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? { val binding :FragmentTitleBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_title,container,false)
        // Inflate the layout for this fragment
        binding.playButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_titleFragement_to_gameFragment2)
        )

        return binding.root
    }


}