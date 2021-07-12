package com.example.ngereyeuh.data

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LocalDataSource @Inject constructor(
    private val ngereyeuhDao: NgereyeuhDao
) {
    fun readData(): Flow<List<NgereyeuhEntity>> {
        return ngereyeuhDao.readData()
    }

    suspend fun insertData(ngereyeuhEntity: NgereyeuhEntity) {
        ngereyeuhDao.insertData(ngereyeuhEntity)
    }

    fun searchQuery(searchQuery: String): Flow<List<NgereyeuhEntity>> {
       return ngereyeuhDao.searchQuery(searchQuery)
    }
}