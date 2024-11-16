package com.distribuida.principal;

import java.util.Date;

import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;

public class FacturaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cliente = new Cliente(1,"170123456","juan","taipe","av.por ahi y mas alla.","0987654321","jtaipe@correo.com");
		Cliente cliente2 = new Cliente(2,"170123457","maria","moran","av. a la derecha e izquierda.","098765499","mmoran@correo.com");
		
		Factura factura = new Factura();
		
		factura.setIdFactura(1);
		factura.setNumFactura("FAC-0001");
		factura.setFecha(new Date());
		factura.setTotalNeto(100.50);
		factura.setIva(15.30);
		factura.setTotal(116.20);
		// inyección de dependencias
		factura.setCliente(cliente2);
		
		
		System.out.println(factura.toString());
		
	}

}
