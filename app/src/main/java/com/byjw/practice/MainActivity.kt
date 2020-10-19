package com.byjw.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = this.game_list
        
        // 더미 데이터
        val items = mutableListOf<GameData>().apply {
            this.add(GameData("The Last Of Us", "Adventure", R.drawable.the_last_of_us, "45", 5.0f))
            this.add(GameData("Super Mario Odyssey", "Adventure", R.drawable.mario, "55", 4.5f))
            this.add(GameData("Zelda, Breath of the wild", "Adventure", R.drawable.zelda, "65", 5.0f))
            this.add(GameData("Spider Man", "Action", R.drawable.spider_man, "50", 4.0f))
            this.add(GameData("Persona5", "RPG", R.drawable.persona, "36", 3.0f))
            this.add(GameData("Animal Crossing", "Life", R.drawable.animal_crossing, "60", 4.5f))
            this.add(GameData("Pokemon Let's go Pikachu", "RPG", R.drawable.pokemon, "52", 3.0f))
        }

        list.adapter = GameAdapter(items)

    }
}