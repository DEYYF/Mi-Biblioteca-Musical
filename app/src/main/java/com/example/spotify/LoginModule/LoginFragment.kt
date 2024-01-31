package com.example.spotify.LoginModule

import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputBinding
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.spotify.databinding.FragmentLoginBinding
import com.example.spotify.mainModule.MainActivity


class LoginFragment : Fragment() {
    private lateinit var mBinding: FragmentLoginBinding

    private var mActivity: MainActivity? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentLoginBinding.inflate(inflater, container, false)

        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Cargar Logo Spotify
        val url_logo = "https://i.pinimg.com/736x/93/1a/6d/931a6dd7c814effe6e238bbdf3e0197d.jpg"
        loadLogo(url_logo, mBinding.imgBtLogo)




    }

    private fun loadLogo(url: String, image: ImageView) {
        loadImage(url, image)
    }


    private fun loadImage(url: String, image: ImageView) {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .circleCrop()
            .into(image)
    }
}