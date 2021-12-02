package com.example.addapp

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */


class ExampleUnitTest {
    @Test
    fun addition_isCorrect2() {
        val expected = 2 + 2
        val actual = 4
        assertEquals(expected,actual)
    }
    @Test
    fun addition_isCorrect() {
        val flag123 = true
        assertTrue(flag123)
    }
}