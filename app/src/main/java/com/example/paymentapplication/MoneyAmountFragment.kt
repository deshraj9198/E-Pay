package com.example.paymentapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.text.isDigitsOnly
import androidx.navigation.fragment.findNavController
import com.example.paymentapplication.databinding.FragmentMoneyAmountBinding
import com.google.android.material.snackbar.Snackbar


class MoneyAmountFragment : Fragment() {
    private var _binding: FragmentMoneyAmountBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMoneyAmountBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //todo: main code here
        val args = MoneyAmountFragmentArgs.fromBundle(requireArguments())
        binding.textPerasonName.text = args.personName

        binding.btnConfirm.setOnClickListener {
            val amtstr = binding.editAmount.text.toString()
            val amt = amtstr.toFloatOrNull()
            if (amt == null || amt == 0.00F) {
                val dir = MoneyAmountFragmentDirections.actionMoneyAmountFragmentToStatusFragment2(
                    args.personName,
                    0.00F
                )
                findNavController().navigate(dir)
                return@setOnClickListener
            }
            val dir = MoneyAmountFragmentDirections.actionMoneyAmountFragmentToStatusFragment2(
                args.personName,
                amt
            )
            findNavController().navigate(dir)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}