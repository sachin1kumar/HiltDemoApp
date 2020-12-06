package com.doctor.hiltdemoapp

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
object MyModule {

    @Provides
    @Singleton
    fun getCustomObject() : CustomObject {
        return CustomObject("My custom object")
    }

}