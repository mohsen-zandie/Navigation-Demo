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
import com.example.codingchallenge35.databinding.FragmentEmailBinding
import com.example.codingchallenge35.viewmodel.SharedViewModel


class EmailFragment : Fragment() {
    private lateinit var binding: FragmentEmailBinding
    private lateinit var model : SharedViewModel
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
        model = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        binding.viewModel = model
        binding.lifecycleOwner = requireActivity()
        return binding.root
    }

}