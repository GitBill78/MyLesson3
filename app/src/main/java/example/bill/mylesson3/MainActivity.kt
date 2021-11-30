package example.bill.mylesson3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

private const val HELLO_KEY = "hello"
const val TAG = "MyTag"

class MainActivity : AppCompatActivity() {

    lateinit var nextActivityButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreat")
        nextActivityButton = findViewById(R.id.next_activity_button)



        nextActivityButton.setOnClickListener {
            val googleLink = Uri.parse("https://google.com")
            val openBrowserIntent = Intent(Intent.ACTION_VIEW, googleLink)
            startActivity(openBrowserIntent)
        }
    }
}