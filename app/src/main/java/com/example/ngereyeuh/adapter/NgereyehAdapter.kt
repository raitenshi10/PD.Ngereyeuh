package com.example.ngereyeuh.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.ngereyeuh.R
import com.example.ngereyeuh.data.NgereyeuhEntity
import com.example.ngereyeuh.util.MyDiffUtil
import kotlinx.android.synthetic.main.pengirim_row.view.*

class NgereyehAdapter : RecyclerView.Adapter<NgereyehAdapter.MyViewHolder>() {

    private var pengirim = emptyList<NgereyeuhEntity>()

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.pengirim_row, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.tv_nama.text = pengirim[position].nama
        holder.itemView.tv_desaa_pengirim.text = pengirim[position].desa
        holder.itemView.tv_kecamatan_pengirim.text = pengirim[position].kecamatan
        holder.itemView.tv_no_kendaraan.text = pengirim[position].noKendaraan
    }

    override fun getItemCount(): Int {
        return pengirim.size
    }

    fun setData(newPengirim: List<NgereyeuhEntity>) {
        val myDiffUtil = MyDiffUtil(pengirim, newPengirim)
        val diffutilResult = DiffUtil.calculateDiff(myDiffUtil)
        pengirim = newPengirim
        diffutilResult.dispatchUpdatesTo(this)
    }
}