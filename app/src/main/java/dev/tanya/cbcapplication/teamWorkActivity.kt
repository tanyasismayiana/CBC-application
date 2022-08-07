package dev.tanya.cbcapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.tanya.cbcapplication.databinding.ActivityParentsSupportBinding
import dev.tanya.cbcapplication.databinding.ActivityTeamWorkBinding

class teamWorkActivity : AppCompatActivity() {
    lateinit var binding: ActivityTeamWorkBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityTeamWorkBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imgSkipTeam.setOnClickListener {
            var intent = Intent(this, Mainbuttons::class.java)
        }
    }
}