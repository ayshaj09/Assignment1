package com.example.assignment1

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

class espresso {
    @get:Rule
    val activityRule = ActivityScenarioRule(Page2Activity::class.java)

    //move from login page to profile page
    @Test
    fun testLoginNavigatesToProfilePage() {
        onView(withId(R.id.loginbutton)).perform(click())

        onView(withId(R.id.pfp)).check(matches(isDisplayed()))
    }

    //sign up button takes to sign up page
    @Test
    fun testSignupNavigatesToSignupPage() {
        onView(withId(R.id.signuptext)).perform(click())

        onView(withId(R.id.username)).check(matches(isDisplayed()))
    }
}