package com.example.ngereyeuh

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.ngereyeuh.data.NgereyeuhEntity
import com.example.ngereyeuh.data.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    application: Application,
    private val repository: Repository
) :
    AndroidViewModel(application) {

    val readData: LiveData<List<NgereyeuhEntity>> = repository.local.readData().asLiveData()

    fun insertData(ngereyeuhEntity: NgereyeuhEntity) {
        viewModelScope.launch {
            repository.local.insertData(ngereyeuhEntity)
        }
    }

    fun searchDatabase(searchQuery: String): LiveData<List<NgereyeuhEntity>> {
        return repository.local.searchQuery(searchQuery).asLiveData()
    }
}