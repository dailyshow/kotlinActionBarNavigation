package com.cis.kotlinactionbarnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val action = supportActionBar
        action?.setHomeButtonEnabled(true)
        action?.setDisplayHomeAsUpEnabled(true)
        // 임의의 아이콘으로 변경할 수도 있다.
        // action?.setHomeAsUpIndicator(android.R.drawable.ic_menu_directions)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // home 이라는 id가 자동으로 들어간다.
        when (item.itemId) {
            android.R.id.home -> {
                finish()
            }
        }

        return super.onOptionsItemSelected(item)
    }
}
