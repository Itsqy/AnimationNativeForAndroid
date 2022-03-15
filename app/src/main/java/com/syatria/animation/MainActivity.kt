package com.syatria.animation

import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.syatria.animation.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar!!.hide()

        val splash = AnimationUtils.loadAnimation(this, R.anim.splash)
        val slideup = AnimationUtils.loadAnimation(this, R.anim.slide)
        val slidebottom = AnimationUtils.loadAnimation(this, R.anim.slide_bottom)

        binding.btnLogin.startAnimation(slidebottom)
        binding.tvLogin.startAnimation(slideup)
        binding.edtEmail.startAnimation(splash)

        binding.btnLogin.setOnClickListener {
            binding.btnLogin.startAnimation(slidebottom)

        }
        binding.tvLogin.setOnClickListener {
            binding.tvLogin.startAnimation(slideup)

        }
        binding.edtEmail.setOnClickListener {
            binding.edtEmail.startAnimation(splash)

        }


    }
}