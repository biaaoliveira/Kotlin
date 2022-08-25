import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ClienteTest {

    val cliente = Cliente("Bianca", "Av. Paulo Costa", "1122548")

    @Test
    fun addCompraTest() {
        cliente.addCompra("Maça")
        cliente.addCompra("Banana")
        cliente.addCompra("Laranja")
    }
    @Test

    fun addCompra() {
        assertEquals(3, cliente.exibirCompras().size)
    }

    @Test
    fun removeCompra() {
        cliente.removeCompra("Banana")

        assertEquals(2, cliente.exibirCompras().size)
    }

    @Test
    fun nova() {
        assertEquals("Maça",cliente.exibirCompras().elementAt(2))
    }
}