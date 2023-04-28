package com.emirk.emirkarabeyodev3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.emirk.emirkarabeyodev3.databinding.FragmentGalleryBinding
import com.emirk.emirkarabeyodev3.databinding.FragmentHomeBinding

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        Glide.with(binding.iv1)
            .load(R.drawable.me)
            .into(binding.iv1)

        Glide.with(binding.iv2)
            .load(R.drawable.me)
            .into(binding.iv2)

        Glide.with(binding.iv3)
            .load(R.drawable.me)
            .into(binding.iv3)

        Glide.with(binding.iv4)
            .load(R.drawable.me)
            .into(binding.iv4)

        Glide.with(binding.iv5)
            .load(R.drawable.me)
            .into(binding.iv5)

        Glide.with(binding.iv6)
            .load(R.drawable.me)
            .into(binding.iv6)

        Glide.with(binding.iv7)
            .load(R.drawable.me)
            .into(binding.iv7)

        Glide.with(binding.iv8)
            .load(R.drawable.me)
            .into(binding.iv8)

        Glide.with(binding.iv9)
            .load(R.drawable.me)
            .into(binding.iv9)

        Glide.with(binding.iv10)
            .load(R.drawable.me)
            .into(binding.iv10)

        Glide.with(binding.iv11)
            .load(R.drawable.me)
            .into(binding.iv11)

        Glide.with(binding.iv12)
            .load(R.drawable.me)
            .into(binding.iv12)

        Glide.with(binding.iv13)
            .load(R.drawable.me)
            .into(binding.iv13)

        Glide.with(binding.iv14)
            .load(R.drawable.me)
            .into(binding.iv14)

        return binding.root
    }

}