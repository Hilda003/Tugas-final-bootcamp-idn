package hildatul.wardah.tugas_final_bootcamp_idn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hildatul.wardah.tugas_final_bootcamp_idn.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_detail)

    }
}