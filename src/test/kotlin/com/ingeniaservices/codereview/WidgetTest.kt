package com.ingeniaservices.codereview

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

internal class WidgetTest {

    @Test
    fun `Widget a() works correctly`() {
        // Given
        val s = """""Hello World.
            How are you doing?"""

        // When
        val s2 = Widget().a(s)

        // Then
        assertThat(s2).isEqualTo("There are 2 lines, 17 words, and 24 letters.")
    }
}
