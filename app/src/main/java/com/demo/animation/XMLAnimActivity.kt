package com.demo.animation

import android.os.Bundle
import android.util.Log
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.demo.animation.databinding.ActivityXmlanimBinding

class XMLAnimActivity : AppCompatActivity() {

    private var _binding : ActivityXmlanimBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityXmlanimBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Zoom Scale animation
        binding.btnZoomIn.setOnClickListener {
            val zoomIn = AnimationUtils.loadAnimation(this, R.anim.zoom_in).apply {
                setAnimationListener(object : Animation.AnimationListener{
                    override fun onAnimationStart(animation: Animation?) {
                        Log.d(Constants.TAG, "onAnimationStart")
                    }
                    override fun onAnimationEnd(animation: Animation?) {
                        Log.d(Constants.TAG, "onAnimationEnd")
                    }
                    override fun onAnimationRepeat(animation: Animation?) {
                        Log.d(Constants.TAG, "onAnimationRepeat")
                    }
                })
            }
            binding.imgLogo.startAnimation(zoomIn)
        }
        binding.btnZoomOut.setOnClickListener {
            binding.imgLogo.startAnimation(AnimationUtils.loadAnimation(this, R.anim.zoom_out))
        }
        binding.btnScale.setOnClickListener {
            binding.imgLogo.startAnimation(AnimationUtils.loadAnimation(this, R.anim.scale))
        }

        // Fade alpha animation
        binding.btnFadeIn.setOnClickListener {
            binding.imgLogo.startAnimation(AnimationUtils.loadAnimation(this, R.anim.fade_in))
        }
        binding.btnFadeOut.setOnClickListener {
            binding.imgLogo.startAnimation(AnimationUtils.loadAnimation(this, R.anim.fade_out))
        }
        binding.btnAlpha.setOnClickListener {
            binding.imgLogo.startAnimation(AnimationUtils.loadAnimation(this, R.anim.alpha))
        }

        // Slide animation
        binding.btnSlideLeft.setOnClickListener {
            binding.imgLogo.startAnimation(AnimationUtils.loadAnimation(this, R.anim.slide_left))
        }
        binding.btnSlideRight.setOnClickListener {
            binding.imgLogo.startAnimation(AnimationUtils.loadAnimation(this, R.anim.slide_right))
        }
        binding.btnSlideUp.setOnClickListener {
            binding.imgLogo.startAnimation(AnimationUtils.loadAnimation(this, R.anim.slide_up))
        }
        binding.btnSlideDown.setOnClickListener {
            binding.imgLogo.startAnimation(AnimationUtils.loadAnimation(this, R.anim.slide_down))
        }

        // Zoom with Fade animation
        binding.btnZoomInFadeIn.setOnClickListener {
            binding.imgLogo.startAnimation(AnimationUtils.loadAnimation(this, R.anim.zoom_in_fade_in))
        }
        binding.btnZoomOutFadeOut.setOnClickListener {
            binding.imgLogo.startAnimation(AnimationUtils.loadAnimation(this, R.anim.zoom_out_fade_out))
        }

        // Translate and move animation
        binding.btnMove.setOnClickListener {
            binding.imgLogo.startAnimation(AnimationUtils.loadAnimation(this, R.anim.move))
        }
        binding.btnTranslate.setOnClickListener {
            binding.imgLogo.startAnimation(AnimationUtils.loadAnimation(this, R.anim.translate))
        }

        // Rotate and zoom animation
        binding.btnRotate.setOnClickListener {
            binding.imgLogo.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotate))
        }
        binding.btnScaleRotate.setOnClickListener {
            binding.imgLogo.startAnimation(AnimationUtils.loadAnimation(this, R.anim.scale_rotate))
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}