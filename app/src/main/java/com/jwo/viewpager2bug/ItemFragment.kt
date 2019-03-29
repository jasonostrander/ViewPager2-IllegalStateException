package com.jwo.viewpager2bug

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.databinding.BindingAdapter
import androidx.fragment.app.Fragment
import com.jwo.viewpager2bug.databinding.FragmentItemBinding
import kotlinx.android.synthetic.main.fragment_item.*

class ItemFragment : Fragment() {
    private lateinit var binding: FragmentItemBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentItemBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lifecycleOwner = viewLifecycleOwner
        parent.setBackgroundColor(arguments?.getInt("color") ?: Color.WHITE)
    }

    companion object {
        fun newInstance(color: Int): ItemFragment {
            return ItemFragment()
                .apply { arguments = bundleOf("color" to color) }
        }

        @JvmStatic
        @BindingAdapter("binding:gone")
        fun gone(view: View, gone: Boolean) {
            view.visibility = if (gone) View.GONE else View.VISIBLE
        }
    }
}