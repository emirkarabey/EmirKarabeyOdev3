package com.emirk.emirkarabeyodev3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.emirk.emirkarabeyodev3.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnGoToAboutMe.setOnClickListener {
            goToAboutMe()
        }

        binding.btnGoToGallery.setOnClickListener {
            goToGallery()
        }

        binding.btnGoToContact.setOnClickListener {
            goToContact()
        }

        binding.btnGoToBlog.setOnClickListener {
            goToBlog()
        }
    }

    private fun goToAboutMe() {
        val action = HomeFragmentDirections.actionHomeFragmentToAboutMeFragment()
        findNavController().navigate(action)
    }

    private fun goToGallery() {
        val action = HomeFragmentDirections.actionHomeFragmentToGalleryFragment()
        findNavController().navigate(action)
    }

    private fun goToContact() {
        val action = HomeFragmentDirections.actionHomeFragmentToContactFragment()
        findNavController().navigate(action)
    }


    private fun goToBlog() {
        val action = HomeFragmentDirections.actionHomeFragmentToBlogFragment()
        findNavController().navigate(action)
    }
}