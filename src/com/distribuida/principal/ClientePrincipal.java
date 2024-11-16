package com.distribuida.principal;

import com.distribuida.entities.Cliente;

public class ClientePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cliente = new Cliente(1,"170123456","juan","taipe","av.por ahi y mas alla.","0987654321","jtaipe@correo.com");
		Cliente cliente2 = new Cliente(2,"170123457","maria","moran","av. a la derecha e izquierda.","098765499","mmoran@correo.com");
		
		System.out.println(cliente.toString());
		System.out.println(cliente2.toString());
		
		
	}

}
