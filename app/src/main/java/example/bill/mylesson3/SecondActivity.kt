package example.bill.mylesson3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

private const val HELLO_KEY = "hello"

class SecondActivity : AppCompatActivity() {

    lateinit var helloTextView:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)



        helloTextView = findViewById(R.id.hi_text_view)

         val helloValue:String? = intent.extras?.getString(HELLO_KEY,"picec")

         helloTextView.text = helloValue
    }
}