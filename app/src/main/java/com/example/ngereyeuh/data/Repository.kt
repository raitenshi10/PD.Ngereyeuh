package com.example.ngereyeuh.data

import javax.inject.Inject

class Repository @Inject constructor(
    localDataSource: LocalDataSource
) {
    val local = localDataSource
}