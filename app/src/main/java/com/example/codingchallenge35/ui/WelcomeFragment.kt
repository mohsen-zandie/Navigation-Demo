package com.example.codingchallenge35.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.codingchallenge35.R
import com.example.codingchallenge35.databinding.FragmentWelcomeBinding
import com.example.codingchallenge35.viewmodel.SharedViewModel

class WelcomeFragment : Fragment() {
    private lateinit var binding: FragmentWelcomeBinding
    private lateinit var model: SharedViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_welcome, container, false)
        binding.viewTerms.setOnClickListener {
            it.findNavController().navigate(R.id.action_welcomeFragment_to_termsFragment)
        }
        model = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        binding.viewModel = model
        binding.lifecycleOwner = requireActivity()
        return binding.root
    }
}