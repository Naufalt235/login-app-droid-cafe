package com.example.loginapp

import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class OrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)
    }

    fun onRadioButtonClicked(view: View) {
        val checked = (view as RadioButton).isChecked

        when (view.id) {
            R.id.sameday -> if (checked) {
                displayToast(getString(R.string.same_day_messenger_service))
            }
            R.id.nextday -> if (checked) {
                displayToast(getString(R.string.next_day_ground_delivery))
            }
            R.id.pickup -> if (checked) {
                displayToast(getString(R.string.pick_up))
            }
        }
    }

    fun displayToast(message: String?) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}