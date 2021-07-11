package com.example.ngereyeuh.data

import javax.inject.Inject

class Repository @Inject constructor(
    local: LocalDataSource
) {
    val localRepository = local
}