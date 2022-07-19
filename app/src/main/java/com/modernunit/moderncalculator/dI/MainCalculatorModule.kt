package com.modernunit.moderncalculator.dI

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface MainCalculatorModule {
    //todo add dependencies here
}