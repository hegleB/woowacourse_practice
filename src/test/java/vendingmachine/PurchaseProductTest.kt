package vendingmachine

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import vendingmachine.domain.PurchaseProduct

class PurchaseProductTest {
    @Test
    fun `구입 상품명을 잘못 입력한 경우 예외가 발생한다`() {
        assertThrows<IllegalArgumentException> {
            PurchaseProduct("")
        }
    }
}