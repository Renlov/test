package com.pimenov.feature_products_impl.di

import com.pimenov.core_network_api.NetworkApi
import com.pimenov.core_utils.di.PerFeature
import com.pimenov.feature_products_api.ProductNavigationApi
import com.pimenov.feature_products_impl.presentation.view.MainFragment
import dagger.Component


@Component(
    modules = [InteractorModule::class, RepositoryModule::class],
    dependencies = [ProductFeatureDependencies::class])
@PerFeature
abstract class ProductFeatureComponent {

    companion object {
        @Volatile
        var productFeatureComponent: ProductFeatureComponent? = null
            private set

        fun initAndGet(productFeatureDependencies: ProductFeatureDependencies): ProductFeatureComponent? {
            if (productFeatureComponent == null) {
                synchronized(ProductFeatureComponent::class) {
                    productFeatureComponent = DaggerProductFeatureComponent.builder()
                        .productFeatureDependencies(productFeatureDependencies)
                        .build()
                }
            }
            return productFeatureComponent
        }

        fun get(): ProductFeatureComponent? {
            if (productFeatureComponent == null) {
                throw RuntimeException("You must call 'initAndGet(productFeatureDependencies: ProductFeatureDependencies)' method")
            }
            return productFeatureComponent
        }

        fun resetComponent() {
            productFeatureComponent = null
        }
    }

    abstract fun inject(fragment: MainFragment)

    @PerFeature
    @Component(dependencies = [NetworkApi::class, ProductNavigationApi::class])
    interface ProductFeatureDependenciesComponent : ProductFeatureDependencies
}
