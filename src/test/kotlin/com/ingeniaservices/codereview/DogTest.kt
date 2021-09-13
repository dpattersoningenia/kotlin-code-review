package com.ingeniaservices.codereview

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class DogTest {
    @Test
    fun `Dog should bark`() {
        // Given
        val d = Dog()

        // When
        val s = d.s()

        // Then
        assertThat(s).isEqualTo("*bark*")
    }
}
