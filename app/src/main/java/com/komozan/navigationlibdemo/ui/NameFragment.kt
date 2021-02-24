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
import com.komozan.navigationlibdemo.databinding.FragmentNameBinding
import com.komozan.navigationlibdemo.viewmodel.SharedViewModel

class NameFragment : Fragment() {
    private lateinit var binding: FragmentNameBinding
    private lateinit var model: SharedViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_name, container, false)
        binding.next.setOnClickListener {
            it.findNavController().navigate(R.id.action_nameFragment_to_emailFragment)
        }
        model = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        binding.viewModel = model
        binding.lifecycleOwner = requireActivity()
        return binding.root
    }

}