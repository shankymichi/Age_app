package com.example.first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
/*// the below function will work same as getagefn
        findage.setOnClickListener {
            //fire when button is clicked by shanky
            var yob:Int =yeardob.text.toString().toInt()
            var presentyear:Int = Calendar.getInstance().get(Calendar.YEAR)
            val myage = presentyear - yob
            showage.text= "Your Age is $myage years "
        }

 */
    }

    fun getagefn(view: View) {
        //fire when button is clicked by shanky
        var yob:Int =yeardob.text.toString().toInt()
        var presentyear:Int = Calendar.getInstance().get(Calendar.YEAR)
        if(yob.toInt()<=0 || yob.toInt()>presentyear){
            showage.text="Don't be too smart..."
            return
        }
        val myage = presentyear - yob
        showage.text= "Your Age is $myage years "
    }
}