package br.com.victor.multitelas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_avancar.setOnClickListener {
            val intent = Intent(this, Main2Activity::class.java);
            startActivity(intent);
        }
    }
}
