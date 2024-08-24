package com.demo.animation

import android.animation.Animator
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.demo.animation.Constants.Companion.TAG
import com.demo.animation.databinding.ActivityLottieAnimBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class LottieAnimActivity : AppCompatActivity() {

    private var _binding : ActivityLottieAnimBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityLottieAnimBinding.inflate(layoutInflater)
        setContentView(binding.root)
        lifecycleScope.launch {
            delay(2000)
            binding.lottieAnim.visibility = View.VISIBLE
            binding.lottieAnim.playAnimation()
        }

        binding.lottieAnim.setOnClickListener {
            binding.lottieAnim.playAnimation()
        }

        binding.lottieAnim.addAnimatorListener(object: Animator.AnimatorListener{
            override fun onAnimationStart(animation: Animator) {
                Log.d(TAG, "onAnimationStart")
            }

            override fun onAnimationEnd(animation: Animator) {
                Log.d(TAG, "onAnimationEnd")
            }

            override fun onAnimationCancel(animation: Animator) {
                Log.d(TAG, "onAnimationCancel")
            }

            override fun onAnimationRepeat(animation: Animator) {
                Log.d(TAG, "onAnimationRepeat")
            }

        })
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}