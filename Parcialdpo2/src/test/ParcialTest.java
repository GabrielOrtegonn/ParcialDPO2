package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.Parcial;

public class ParcialTest {
	private Parcial parcial;

	@BeforeEach
	public void setUp() {
		this.parcial = new Parcial();
	}

	@Test
	public void raicesTest1() throws Exception {
		assertEquals("x=3.0, x=2.0", this.parcial.raices(1, -5, 6));
	}

	@Test
	public void raicesTest2() throws Exception {
		assertEquals("x=-1.0, x=-1.0", this.parcial.raices(1, 2, 1));
	}

	@Test
	public void raicesTest3() throws Exception {
		Exception excepcion = assertThrows(
				Exception.class,
				() -> this.parcial.raices(0, 2, 1)
				);

		assertEquals("a no puede ser 0", excepcion.getMessage());
	}

	@Test
	public void raicesTest4() throws Exception {
		Exception excepcion = assertThrows(
				Exception.class,
				() -> this.parcial.raices(1, 0, 1)
				);

		assertEquals("No tiene raices reales", excepcion.getMessage());
	}
}