package com.example.codingchallenge35.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.codingchallenge35.R
import com.example.codingchallenge35.databinding.FragmentEmailBinding


class EmailFragment : Fragment() {
    private lateinit var binding: FragmentEmailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_email, container, false)
        binding.submit.setOnClickListener {
            it.findNavController().navigate(R.id.action_emailFragment_to_welcomeFragment)
        }
        return binding.root
    }

}