package com.example.ngereyeuh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ngereyeuh.data.NgereyeuhEntity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()
    private val mAdapter by lazy { NgereyehAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setRecyclerView()
        readData()
    }

    private fun readData() {
        insertData()
        viewModel.readData.observe(this, { data ->
            mAdapter.setData(data)
        })
    }

    private fun insertData() {
        val data = NgereyeuhEntity(
            0,
            "Hengki",
            "Cimandiri",
            "Panggarangan",
            "F 8835 US"
        )
        viewModel.insertData(data)
    }

    private fun setRecyclerView() {
        rv_pengirim.adapter = mAdapter
        rv_pengirim.layoutManager = LinearLayoutManager(this)
    }
}