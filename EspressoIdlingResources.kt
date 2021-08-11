package com.muramsyah.latihan.academy.utils

import androidx.test.espresso.idling.CountingIdlingResource

object EspressoIdlingResources {
    private const val RESOURCES = "GLOBAL"
    val idlingResource = CountingIdlingResource(RESOURCES)

    fun increment() {
        idlingResource.increment()
    }

    fun decrement() {
        idlingResource.decrement()
    }
}