package utn.disenio.tp;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import comprasPresupuestos.Compra;
import comprasPresupuestos.Criterio;
import comprasPresupuestos.Presupuesto;
import comprasPresupuestos.Producto;
import comprasPresupuestos.ProveedorMenorValor;
import validadorDeCompras.Usuario;
import validadorDeCompras.ValidadorCompras;

public class ValidadorCompraPresupuestoTest {

	
	@Test
	public void cantidadYEleccionTest() {
		fail("Not yet implemented");
		
		List<Producto> listaProducto = new ArrayList<Producto>();
		ArrayList<Presupuesto> presupuestos = new ArrayList<Presupuesto>();
		Presupuesto presupuesto1 = new Presupuesto(null,null,null);
		Presupuesto presupuesto2 = new Presupuesto(null,null,null);
		Presupuesto presupuesto3 = new Presupuesto(null,null,null);
		
		presupuestos.add(presupuesto1);
		presupuestos.add(presupuesto2);
		presupuestos.add(presupuesto3);
		
		Usuario usuario1 = new Usuario(null,null,null);
		Usuario usuario2 = new Usuario(null,null,null);
		Usuario usuario3 = new Usuario(null,null,null);
		Usuario usuario4 = new Usuario(null,null,null);
		
		
		
		ArrayList<Usuario> revisores = new ArrayList<Usuario>();
		revisores.add(usuario1);
		revisores.add(usuario2);
		revisores.add(usuario3);
		revisores.add(usuario4);
		ProveedorMenorValor criterio = new ProveedorMenorValor();
		
		
		Compra compra = new Compra(listaProducto, presupuestos,presupuesto1, 3,revisores, criterio);
		
//		ValidadorCompras.validar(compra);
//		assertTrue(ValidadorCompras.verificarCantidad(compra));
//		assertTrue(ValidadorCompras.verificarPresupuestoElegido(compra));
		
		
	}

}
