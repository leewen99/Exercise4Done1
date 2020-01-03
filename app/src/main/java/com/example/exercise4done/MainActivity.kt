package com.example.exercise4_employeeprovidentfundepf_investmentschemeeligibilitycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exercise4done.DatePickerFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonPickDate.setOnClickListener{
            val dateFragment = DatePickerFragment()
            dateFragment.show(fragmentManager, "Date Picker")
        }
    }
}
