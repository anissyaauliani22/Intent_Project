package lat.pam.intentproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {
    val EXTRA_MESSAGE = "com.example.android.twoactivities.extra.MESSAGE"
    val EXTRA_REPLY = "com.example.android.twoactivities.extra.REPLY"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val mReply = findViewById<EditText>(R.id.editText_second)
        val btnKirimSecond = findViewById<Button>(R.id.button_second)

        val intent = intent
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        val textView = findViewById<TextView>(R.id.text_message)
        textView.text = message

        btnKirimSecond.setOnClickListener(View.OnClickListener {
            val reply = mReply?.text.toString()
            val replyIntent = Intent()
            replyIntent.putExtra(EXTRA_REPLY, reply)
            setResult(RESULT_OK, replyIntent)
            finish()
        })
    }
}

