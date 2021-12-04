package com.example.systeminventory.view.ui.activities
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.view.animation.Animation
import android.view.animation.LayoutAnimationController
import com.example.systeminventory.R
import com.example.systeminventory.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySplashScreenBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val animation = AnimationUtils.loadAnimation(this, R.anim.animation)
        binding.ivSplashScreen.startAnimation(animation)
        val intent= Intent(this,MainActivity::class.java)

        animation.setAnimationListener(object : Animation.AnimationListener{
            override fun onAnimationStart(p0: Animation?) {
            }

            override fun onAnimationEnd(p0: Animation?) {
                startActivity(intent)
                finish()
            }

            override fun onAnimationRepeat(p0: Animation?) {
            }
        })

    }
}