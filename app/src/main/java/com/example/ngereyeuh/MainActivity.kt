package com.example.ngereyeuh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ngereyeuh.data.NgereyeuhEntity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*

@AndroidEntryPoint
class MainActivity : AppCompatActivity(), SearchView.OnQueryTextListener {

    private val viewModel: MainViewModel by viewModels()
    private val mAdapter by lazy { NgereyehAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setRecyclerView()
        readData()
        fab_tambah_pengirim.setOnClickListener {
            startActivity(Intent(this, TambahDataActivity::class.java))
        }
    }



    private fun readData() {
        viewModel.readData.observe(this, { data ->
            mAdapter.setData(data)
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_tambah_pengirim, menu)
        val search = menu?.findItem(R.id.menu_search)
        val searchView = search?.actionView as? SearchView
        searchView?.isSubmitButtonEnabled = true
        searchView?.setOnQueryTextListener(this)
        return true
    }


    private fun setRecyclerView() {
        rv_pengirim.adapter = mAdapter
        rv_pengirim.layoutManager = LinearLayoutManager(this)
    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        if (query != null) {
            searchData(query)
        } else {
            viewModel.readData.observe(this, {
                mAdapter.setData(it)
            })
        }
        return true
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        if (newText.isNullOrBlank()) {
            viewModel.readData.observe(this, {
                mAdapter.setData(it)
            })
        }
        return true
    }

    private fun searchData(query: String) {
        val searchQuery = "%$query%"
        viewModel.searchDatabase(searchQuery).observe(this, {
            it.let {
                mAdapter.setData(it)
            }
        })

    }

}