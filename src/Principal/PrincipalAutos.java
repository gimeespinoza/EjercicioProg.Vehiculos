package Principal;



import java.util.ArrayList;

import Automovil.Auto;
import Bicicleta.Bici;
import Camion.Camion;
import Motocicleta.Moto;

public class PrincipalAutos {

	public static void main(String[] args) {

//Caract. Motos
		
		Moto moto1 = new Moto("Kawasaki", "Modelo 1",2,"Rojo",2000,180,0, 200);
		Moto moto2 = new Moto("Ducati", "Modelo 2",4,"Verde",2000,160,0,0);
		Moto moto3 = new Moto("Suzuki", "Modelo 3",5,"Azul",2000,177,0,90);
				
//Caract. Automoviles
				
		Auto auto1 = new Auto ("Ferrari","California", 2,"Azul", 2017,0, 177,"Si", 120);
		Auto auto2 = new Auto ("Ford","Falcon", 4,"Verde", 1976,0, 150,"Si", 190 );
	    Auto auto3 = new Auto ("Crevrolet","Modelo 3", 6,"Rojo", 2020,0, 180,"Si",0);
				
//Caract. Bicis
		
		Bici bici1 = new Bici ("Marca 1", "Modelo 1",2, "Azul", 2010, 0,"Estilo 1",120);
		Bici bici2 = new Bici ("Marca 2", "Modelo 2",2, "Verde", 2014,0, "Estilo 2",100);
		Bici bici3 = new Bici ("Marca 3", "Modelo 3",2, "Rojo", 2010,0, "Estilo 3",0);
				
//Camiones
				
	    Camion cami1 = new Camion("Modelo 1","Marca 1",4,"R",2000,0,120,177,110);
	    Camion cami2 = new Camion("Modelo 2","Marca 2",4,"G",2010,0,210,180,100);
	    Camion cami3 = new Camion("Modelo 3","Marca 3",4,"B",2009,0,20,160,90);
			    
//Array de Auto,Bici, Moto, Camion
			    
	    ArrayList<Auto> autos = new ArrayList<Auto>();
		        autos.add(auto1);
		        autos.add(auto2);
		        autos.add(auto3);
		ArrayList<Bici> bicis = new ArrayList<Bici>();
				bicis.add(bici1);
				bicis.add(bici2);
				bicis.add(bici3);
		ArrayList<Moto> motos = new ArrayList<Moto>();
				motos.add(moto1);
				motos.add(moto2);
				motos.add(moto3);
		ArrayList<Camion> camiones = new ArrayList<Camion>();
				camiones.add(cami1);
				camiones.add(cami2);
				camiones.add(cami3);
		   System.out.print("> COCHES:");
				auto1.mostrarInfo();
				auto2.mostrarInfo();
				auto3.mostrarInfo();
		   System.out.print("---------");
		   System.out.print("> BICICLETAS:");
				bici1.mostrarInfo();
				bici2.mostrarInfo();
				bici3.mostrarInfo();
		   System.out.print("---------");
		   System.out.print("> MOTOS:");
				moto1.mostrarInfo();
				moto2.mostrarInfo();
				moto3.mostrarInfo();
		   System.out.println("---------");
		   System.out.println("> CAMIONES:");
				cami1.mostrarInfo();
				cami2.mostrarInfo();
				cami3.mostrarInfo();	
			}

		}

