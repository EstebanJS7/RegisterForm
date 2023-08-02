package com.example.registerform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    private lateinit var estateInputLayout: TextInputLayout
    private lateinit var estateAutoCompleteTextView: AutoCompleteTextView

    private lateinit var genderInputLayout: TextInputLayout
    private lateinit var genderAutoCompleteTextView: AutoCompleteTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        estateInputLayout = findViewById(R.id.listEstateLayout)
        estateAutoCompleteTextView = findViewById(R.id.listEstate)

        genderInputLayout = findViewById(R.id.listGenderLayout)
        genderAutoCompleteTextView = findViewById(R.id.listGender)

        // Datos de ejemplo para el dropdown de estate
        val estateList = listOf("Casa", "Apartamento", "Chalet", "Piso", "Ático")

        // Datos de ejemplo para el dropdown de gender
        val genderList = listOf("Masculino", "Femenino")

        val estateAdapter =
            ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, estateList)
        estateAutoCompleteTextView.setAdapter(estateAdapter)

        val genderAdapter =
            ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, genderList)
        genderAutoCompleteTextView.setAdapter(genderAdapter)

        estateAutoCompleteTextView.setOnItemClickListener { parent, _, position, _ ->
            val selectedItem = parent.getItemAtPosition(position).toString()

        }

        genderAutoCompleteTextView.setOnItemClickListener { parent, _, position, _ ->
            val selectedItem = parent.getItemAtPosition(position).toString()

        }
    }
}
