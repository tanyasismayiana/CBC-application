package dev.tanya.cbcapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.tanya.cbcapplication.databinding.ActivityParentsSupportBinding
import dev.tanya.cbcapplication.databinding.ActivityTeamWorkBinding
import java.util.zip.Inflater

class Parents_support : AppCompatActivity() {
    lateinit var binding: ActivityParentsSupportBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityParentsSupportBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imgSkipParent.setOnClickListener {
            var intent = Intent(this, teamWorkActivity::class.java)
        }
        setContentView(R.layout.activity_parents_support)

    }
}