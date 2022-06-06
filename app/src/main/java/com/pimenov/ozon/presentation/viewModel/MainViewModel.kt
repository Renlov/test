package com.pimenov.ozon.presentation.viewModel

import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pimenov.ozon.domain.interactors.ProductsInteractorList
import com.pimenov.ozon.presentation.utils.CountPrefs
import com.pimenov.ozon.presentation.viewObject.ProductInListPresentation
import kotlinx.coroutines.launch
import java.lang.Exception

class MainViewModel(private val productInteractor : ProductsInteractorList) : ViewModel() {
    private val _productLD = MutableLiveData<List<ProductInListPresentation>>()
    val productLD: LiveData<List<ProductInListPresentation>> = _productLD

    fun getProducts(){
        _productLD.postValue(productInteractor.getProducts())
    }
}