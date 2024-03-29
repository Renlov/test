package com.pimenov.feature_products_impl.domain.domain_object

data class ProductInListDO(
    val guid: String,
    val image: String,
    val name: String,
    val price: String,
    val rating: Double,
    val isFavorite: Boolean,
    val isInCart: Boolean
)