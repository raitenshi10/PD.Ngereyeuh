package com.example.ngereyeuh.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface NgereyeuhDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertData(ngereyeuhEntity: NgereyeuhEntity)

    @Query("SELECT * FROM tb_ngereyeuh ORDER BY id ASC")
    fun readData(): Flow<List<NgereyeuhEntity>>

    @Query("SELECT * FROM tb_ngereyeuh WHERE nama                                                                   LIKE :searchQuery  ")
    fun searchQuery(searchQuery: String): Flow<List<NgereyeuhEntity>>
}