package com.gmail.brymher.retrofit

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val activity = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test
    fun onCreate() {
        onView(withId(R.id.activity_main))
    }
}