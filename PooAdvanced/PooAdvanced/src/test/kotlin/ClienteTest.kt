import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

internal class ClienteTest {

    val cliente = Cliente("Bianca", "Av. Paulo Costa", "1122548")

    @BeforeEach
    fun addCompraTest() {
        cliente.addCompra("Maça")
        cliente.addCompra("Banana")
        cliente.addCompra("Laranja")
    }

    @Test

    fun addCompra() {
        assertEquals(3, cliente.lista.size)
    }
    @Test
    fun removeCompra() {
        cliente.removeCompra("Banana")

        assertEquals(2, cliente.lista.size)
    }

    @Test
    fun nova() {
        assertEquals("Maça",cliente.lista.elementAt(0))
    }

}