package com.example.khajatest508;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)


public class uiTest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testShapeInsert(){
        Espresso.onView(ViewMatchers.withId(R.id.ShapeEditText))
                .perform(ViewActions.typeText("Circle"));
        Espresso.onView(ViewMatchers.withId(R.id.ColorEditText))
                .perform(ViewActions.typeText("Red"));

        Espresso.onView(ViewMatchers.withId(R.id.button))
                .perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.ShapeTextView))
                .check(ViewAssertions.matches(ViewMatchers.withText("The shape is Circle\nArea is 78.5\nPerimeter is 31.4\n")));

        Espresso.onView(ViewMatchers.withId(R.id.ColorTextView))
                .check(ViewAssertions.matches(ViewMatchers.withText("The color is Red\n")));
    }


}