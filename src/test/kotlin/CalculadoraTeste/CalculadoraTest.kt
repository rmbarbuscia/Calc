import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class CalcTest {

    @Test
    fun somaTest() {

        assertEquals(3.0, Calc.soma(1.0, 2.0))

    }

    @Test
    fun subtracaoTest() {

        assertEquals(3.0, Calc.subtracao(4.0, 1.0))

    }

    @Test
    fun divisaoTest() {

        assertEquals(4.0, Calc.divisao(4.0, 1.0))

    }

    @Test
    fun mutiplicacaoTest() {

        assertEquals(8.0, Calc.mutiplicacao(4.0, 2.0))

    }

}
