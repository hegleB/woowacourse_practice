package bridge

import bridge.domain.Movement
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class MovementTest {
    @ParameterizedTest
    @ValueSource(strings = ["Q", "T"])
    fun `이동 방향이 U 또는 D가 아닌 경우 에러가 발생한다`(direction: String) {
        assertThrows<IllegalArgumentException> {
            Movement(direction)
        }
    }
}