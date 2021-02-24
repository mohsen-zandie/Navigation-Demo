package com.komozan.navigationlibdemo.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.komozan.navigationlibdemo.R
import com.komozan.navigationlibdemo.databinding.FragmentEmailBinding
import com.komozan.navigationlibdemo.viewmodel.SharedViewModel


class EmailFragment : Fragment() {
    private lateinit var binding: FragmentEmailBinding
    private lateinit var model: SharedViewModel
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