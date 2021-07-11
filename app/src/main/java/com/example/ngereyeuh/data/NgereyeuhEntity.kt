package com.example.ngereyeuh.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.ngereyeuh.util.Constant.DATABASE_TABLE

@Entity(tableName = DATABASE_TABLE)
data class NgereyeuhEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int?,
    var nama: String?,
    var desa: String?,
    var kecamatan: String?,
    var noKendaraan: String?,
)