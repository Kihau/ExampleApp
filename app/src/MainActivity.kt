package exampleapp

import android.os.Bundle
import android.app.Activity
import android.widget.Button

import exampleapp.databinding.MainActivityBinding

class MainActivity : Activity() {
    private var click_counter = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = MainActivityBinding.inflate(this.layoutInflater)
        this.setContentView(binding.root)
        val button = binding.mybutton

        // ALTERNATIVE: No automatic binding generation.
        // this.setContentView(R.layout.main_activity)
        // val button = this.findViewById<Button>(R.id.mybutton)

        button.setOnClickListener { 
            button.text = "You clicked $click_counter times!"
            click_counter += 1
        }
    }
}
