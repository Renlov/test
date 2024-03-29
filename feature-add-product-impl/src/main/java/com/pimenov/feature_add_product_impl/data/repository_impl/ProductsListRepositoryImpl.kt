package com.pimenov.feature_add_product_impl.data.repository_impl

import com.pimenov.core_network_api.ProductsListApi
import com.pimenov.feature_add_product_impl.domain.repository.ProductsListRepository
import javax.inject.Inject

class ProductsListRepositoryImpl @Inject constructor(private val productListApi: ProductsListApi) : ProductsListRepository {
    override fun getCountProductInList(): Int {
        return productListApi.getProducts().size
    }


    override fun addProduct() {
        return productListApi.addProduct()
    }
}