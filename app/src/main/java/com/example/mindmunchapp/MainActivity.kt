import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.anew.R
import com.example.mindmunchapp.MainActivity2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openMainActivity2(view: View) {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}