package com.example.paymentapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.paymentapplication.databinding.FragmentViewBalanceBinding
import com.google.android.material.snackbar.Snackbar


class ViewBalanceFragment : Fragment() {
    private var _binding: FragmentViewBalanceBinding?= null
    private val binding get()= _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentViewBalanceBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //todo: main code here
        Snackbar.make(view, "Server down", Snackbar.LENGTH_INDEFINITE)
            .setAction("try again!", View.OnClickListener { Toast.makeText(activity, "Nothing Happened!", Toast.LENGTH_SHORT).show() })
            .show()

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding =null
    }
}