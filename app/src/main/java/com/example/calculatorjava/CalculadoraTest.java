package com.example.calculatorjava;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class CalculadoraTest {

    @Test
    public void sumarDosNumeros() {
        Espresso.onView(ViewMatchers.withId(R.id.num1))
                .perform(ViewActions.typeText("1"));
        Espresso.onView(ViewMatchers.withId(R.id.num2))
                .perform(ViewActions.typeText("2"));
        Espresso.onView(ViewMatchers.withId(R.id.btnSumar))
                .perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.Resultado12))
                .check(ViewAssertions.matches(ViewMatchers.withText("3")));
    }
}
