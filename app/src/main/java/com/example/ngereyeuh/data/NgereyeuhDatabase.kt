package com.example.ngereyeuh.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [NgereyeuhEntity::class],
    version = 1,
    exportSchema = false
)
abstract class NgereyeuhDatabase: RoomDatabase() {
    abstract fun ngereyeuhDao(): NgereyeuhDao
}