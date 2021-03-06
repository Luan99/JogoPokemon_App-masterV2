package com.example.logonrmlocal.jogopokemon_app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Glide.with(this)
                .load(R.drawable.pokemon_loading) // aqui é teu gif
                .asGif()
                .into(ivLoading)
    }
}
