package com.smu.sangmyung.quiz.login

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import com.smu.sangmyung.quiz.BaseActivity
import com.smu.sangmyung.quiz.MainActivity
import com.smu.sangmyung.quiz.R
import kotlinx.android.synthetic.main.activity_splash.*


class SplashActivity : BaseActivity() {
    var login: Runnable = Runnable {
        val intent = Intent(applicationContext, GoogleSignInActivity::class.java)
        startActivity(intent)
        finish()
    }
    var main: Runnable = Runnable {
        val intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        val anim = AnimationUtils.loadAnimation(applicationContext, R.anim.splash)
        ivSplash.startAnimation(anim)

        var handler = Handler()

        if (getUserEmail().isEmpty()) {

            handler.postDelayed(login, 3000)
            }
        else{
            handler.postDelayed(main,4000)


        }
    }
}
