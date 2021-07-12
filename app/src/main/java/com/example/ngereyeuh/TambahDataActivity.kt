package com.example.ngereyeuh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import com.example.ngereyeuh.data.NgereyeuhEntity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_tambah_data.*

@AndroidEntryPoint
class TambahDataActivity : AppCompatActivity(), View.OnClickListener {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tambah_data)

        btn_batal.setOnClickListener(this)
        btn_simpan.setOnClickListener(this)
    }

    fun insertData() {
        val nama = et_nama_pengirim.text.toString()
        val desa = et_desa_pengirim.text.toString()
        val kecamatan = et_kecamatan_pengirim.text.toString()
        val noPol = et_nopol.text.toString()
        val data = NgereyeuhEntity(
            0, nama, desa, kecamatan, noPol
        )
        data.let {
            viewModel.insertData(data)
            Toast.makeText(this, "Data ditambahkan", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_simpan -> insertData()
            R.id.btn_batal -> startActivity(Intent(this, MainActivity::class.java))
        }
    }
}