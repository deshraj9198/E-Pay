package com.example.paymentapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.paymentapplication.databinding.FragmentSpalshBinding


class SpalshFragment : Fragment() {
    private var _binding: FragmentSpalshBinding?= null
    private val binding get()= _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentSpalshBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //todo: main code here
    binding.btnContinue.setOnClickListener {
        findNavController().navigate(R.id.action_spalshFragment_to_homeFragment2)
    }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding =null
    }
}