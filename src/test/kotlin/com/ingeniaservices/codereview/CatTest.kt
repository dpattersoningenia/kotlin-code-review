package com.ingeniaservices.codereview

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class CatTest {
    @Test
    fun `Cat should meow`() {
        // Given
        val c = Cat()

        // When
        val s = c.s()

        // Then
        assertThat(s).isEqualTo("*meow*")
    }
}
