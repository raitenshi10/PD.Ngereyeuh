package com.example.ngereyeuh.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.ngereyeuh.util.Constant.DATABASE_TABLE

@Entity(tableName = DATABASE_TABLE)
data class NgereyeuhEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var nama: String?,
    var desa: String?,
    var kecamatan: String?,
    var noKendaraan: String?,
)
//    companion object {
//        val listData = listOf(
//            NgereyeuhEntity(
//                0,
//                "Juki",
//                "Cimandiri",
//                "Panggarangan",
//                "F 8525 WX & F 8856 WX"
//            ),
//            NgereyeuhEntity(
//                1,
//                "Ade",
//                "Cimandiri",
//                "Panggarangan",
//                "F 8612 UV"
//            ),
//            NgereyeuhEntity(
//                2,
//                "Hengki",
//                "Cimandiri",
//                "Panggarangan",
//                "F 8429 TP"
//            ),
//            NgereyeuhEntity(
//                3,
//                "Iwing",
//                "Satong",
//                "Panggarangan",
//                "F 9107 UC"
//            ),
//            NgereyeuhEntity(
//                4,
//                "Karis",
//                "Satong",
//                "Panggarangan",
//                "F 8251 VD"
//            ),
//            NgereyeuhEntity(
//                5,
//                "Mahuk",
//                "Satong",
//                "Panggarangan",
//                "F 8864 VA"
//            ),
//            NgereyeuhEntity(
//                6,
//                "Suhedin/Utis",
//                "Sogong",
//                "Panggarangan",
//                "F 8215 UQ"
//            ),
//            NgereyeuhEntity(
//                7,
//                "Suandar",
//                "Sogong",
//                "Panggarangan",
//                "F 8525 UV"
//            ),
//            NgereyeuhEntity(
//                8,
//                "Atok",
//                "Sogong",
//                "Panggarangan",
//                "F 8233 US"
//            ),
//            NgereyeuhEntity(
//                9,
//                "Sudin",
//                "Cimandiri",
//                "Panggarangan",
//                "F 8297 PB"
//            ),
//            NgereyeuhEntity(
//                10,
//                "Sukira",
//                "Serdang",
//                "Panggarangan",
//                "F 8803 VC"
//            ),
//            NgereyeuhEntity(
//                11,
//                "Tomi",
//                "Cimandiri",
//                "Panggarangan",
//                "F 8760 SC"
//            ),
//            NgereyeuhEntity(
//                12,
//                "Boang",
//                "Cikatomas",
//                "Cilograng",
//                "F 8908 TP"
//            ),
//            NgereyeuhEntity(
//                13,
//                "Isro",
//                "Cikatomas",
//                "Cilograng",
//                "F 8041 VD"
//            ),
//            NgereyeuhEntity(
//                14,
//                "Jono",
//                "Cikatomas",
//                "Cilograng",
//                "F 8079 TD"
//            ),
//            NgereyeuhEntity(
//                15,
//                "Yani",
//                "Jatake",
//                "Panggarangan",
//                "F 9541 WA"
//            ),
//            NgereyeuhEntity(
//                16,
//                "Karis",
//                "Jatake",
//                "Panggarangan",
//                "F 8769 WZ & F 8368 WW"
//            ),
//            NgereyeuhEntity(
//                17,
//                "Kasim",
//                "Sogong",
//                "Panggarangan",
//                "F 8098 VA"
//            ),
//            NgereyeuhEntity(
//                18,
//                "Ujang Jadul",
//                "Malingping",
//                "Malingping",
//                "F 8498 ZA"
//            ),
//            NgereyeuhEntity(
//                19,
//                "Judin",
//                "Cipancur",
//                "Panggarangan",
//                "F 8040 UT"
//            ),
//            NgereyeuhEntity(
//                20,
//                "Karim",
//                "Cihara",
//                "Cihara",
//                "F 9517 WA"
//            ),
//            NgereyeuhEntity(
//                21,
//                "Cucum",
//                "Cidikit",
//                "Bayah",
//                "F 8810 US"
//            ),
//            NgereyeuhEntity(
//                22,
//                "Dede",
//                "Cimandiri",
//                "Panggarangan",
//                "F 8187 WS"
//            ),
//            NgereyeuhEntity(
//                23,
//                "Ugun",
//                "Cimandiri",
//                "Panggarangan",
//                "F 8642 WW"
//            )
//        )
//    }
//}