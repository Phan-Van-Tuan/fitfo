package com.example.fitfo

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fitfo.Login_Register_ForgotPass.LoginActivity
import com.example.fitfo.Login_Register_ForgotPass.RegisterActivity
import com.example.fitfo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var sharedPreferences: SharedPreferences

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sharedPreferences =this.getSharedPreferences("data",Context.MODE_PRIVATE)
        val id: String= sharedPreferences.getString("MY_ID","").toString()
        if (id==""){
            }else{
            var intent = Intent(this,MainActivity_Logged_in::class.java)
            startActivity(intent)
        }
        binding.btnToRegister.setOnClickListener {
            var intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        binding.btnToLogin.setOnClickListener {
            var intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }



    }


}