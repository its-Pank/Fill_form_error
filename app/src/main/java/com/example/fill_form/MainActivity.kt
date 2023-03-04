package com.example.fill_form

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.graphics.green
import androidx.core.view.get
import androidx.core.view.isEmpty
import androidx.databinding.DataBindingUtil
import com.example.fill_form.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bind: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bind = DataBindingUtil.setContentView(this, R.layout.activity_main)

        bind.btnId.setOnClickListener {


            if (bind.fnameId.editText!!.text.toString().isNotEmpty())
            {
                if (bind.lnameId.editText!!.text.toString().isNotEmpty())
                {
                    if (bind.pnNo.editText!!.text.toString().isNotEmpty())
                    {
                        if (bind.AlPhn.editText!!.text.toString().isNotEmpty())
                        {
                            if (bind.eMail.editText!!.text.toString().isNotEmpty())
                            {
                                if (bind.dob.editText!!.text.toString().isNotEmpty())
                                {
                                    bind.fullName.setText("Your name : "+ bind.fnameId.editText!!.text.toString() +" "+ bind.lnameId.editText!!.text.toString())
                                    bind.urPhn.setText("phone number : +91"+bind.pnNo.editText!!.text.toString())
                                    bind.urAlphn.setText("Alternative ph.no. : +91"+bind.AlPhn.editText!!.text.toString())
                                    bind.urEmail.setText("E-mail Address: "+bind.eMail.editText!!.text.toString() +"gmail.com")
                                    bind.urDob.setText("D.O.B :"+bind.dob.editText!!.text.toString())

                                } else {
                                    Toast.makeText(this, "Field cant be empty", Toast.LENGTH_SHORT)
                                        .show()
                                    bind.dob.requestFocus()
                                }
                            } else {
                                Toast.makeText(this, "Field cant be empty", Toast.LENGTH_SHORT)
                                    .show()
                                bind.eMail.requestFocus()
                            }
                        } else {
                            Toast.makeText(this, "Field cant be empty", Toast.LENGTH_SHORT).show()
                            bind.AlPhn.requestFocus()
                        }
                    } else {
                        Toast.makeText(this, "Field cant be empty", Toast.LENGTH_SHORT).show()
                        bind.pnNo.requestFocus()
                    }
                }
                else {
                    Toast.makeText(this, "Field cant be empty", Toast.LENGTH_SHORT).show()
                    bind.lnameId.requestFocus()
                }
            }
            else {
                Toast.makeText(this, "Field cant be empty", Toast.LENGTH_SHORT).show()
                bind.fnameId.requestFocus()
            }



        }

    }
}