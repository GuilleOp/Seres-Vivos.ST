import java.util.Scanner;

public class Final {
	 
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		  Scanner entrada  = new Scanner(System.in);
		  Scanner entrada2= new Scanner(System.in);
		  Scanner entrada3= new Scanner(System.in);
		  Scanner entrada4= new Scanner(System.in);
		  Scanner entrada5= new Scanner(System.in);
		  Scanner entrada6= new Scanner(System.in);
		  Scanner entrada7= new Scanner(System.in);
		  Scanner entrada8= new Scanner(System.in);
		  
		  Scanner entrada9=new Scanner(System.in);
		  Scanner entrada11=new Scanner(System.in);
		  
		  
		  int respuesta;
		  int p;
		  int q;
		  int r;//plantas
		  int s;//animales
		  int x;
		  int y;
		  int z;
		  int a;
		  System.out.println("Que quieres hacer?");
		  System.out.println("1---Imprimir Datos");
		  System.out.println("2---Ingresar Datos");
		  a=entrada.nextInt();
		  switch(a)
		  {
case 1:
		 
		  System.out.println("Menu de Seres vivos");
		  System.out.println(" 1.Personas");
		  System.out.println(" 2.Animales");
		  System.out.println(" 3.Plantas");
		  
		  
		  
		 
		  
		  respuesta=entrada.nextInt();
				  
		switch(respuesta){
			  case 1://personas
				 
				  System.out.println("1.bebes");
				  System.out.println("2.Ni�os");
				  System.out.println("3.Adolescentes");
				  System.out.println("4.Adultos");
				  p= entrada2.nextInt();
				  switch(p)
				  {
				  case 1://bebes
					  System.out.println("1.Estapa1-6");
					  System.out.println("2.Bebes Etapa 2 ");
					  q= entrada3.nextInt();
					  	switch(q){
					  			case 1://Etapa1-6
					  				
					  		  Etapa1_6 bebe1= new Etapa1_6("Azul", true, "sexual", "75 a�os", "B�sica", "Alta", "America", "Cristiano", true, 100, 3," 1 litro"," 1 a�o"," 4 veces");
							  Etapa1_6 bebe2= new Etapa1_6("Lucrecio", true, "sexual", "70 a�os", "leche", "Alta", "Europa", "Catolico", false, 80, 2," 3 litro"," 2 a�o"," 3 veces");
							  
							  System.out.println("Las caracteristicas de "+ bebe1.getNombre()+ " son:");
							  System.out.println("\n");
							  
							  	bebe1.setDespertar(true);
								bebe1.setSonidos(false);
								bebe1.setGirar(false);
								bebe1.setRespirar(true);
								bebe1.setDormir(false);
								bebe1.setEstudiar(false);
								bebe1.setTrabajar(false);
								bebe1.setComer(true);
								bebe1.imp_bebe1();
								
							 System.out.println("\n\n\n\n");
							 System.out.println("Las caracteristicas de "+ bebe2.getNombre()+ " son:");
							 System.out.println("\n");
								
								bebe2.setDespertar(false);
								bebe2.setSonidos(true);
								bebe2.setGirar(true);
								bebe2.setRespirar(true);
								bebe2.setDormir(false);
								bebe2.setEstudiar(false);
								bebe2.setTrabajar(false);
								bebe2.setComer(true);
								bebe2.imp_bebe1();
								
							
					  		
									break;
					  		
					  			case 2://Etapa2
					  		
					  					Etapa2 bebote1= new Etapa2("Fernando", true , "sexual", "75 A�os", "Basica", "Media", "Oceania", "Budista", false, 70, 1, "poco","moderado", "mucho");
					  					Etapa2 bebote2= new Etapa2("Fabian",false,"sexual","70 a�os","Mayoria de los alimentos","alta","Africa","catolica",true,50,3,"mucho","poco","moderado");
							
					  					System.out.println("\n\n\n\n");
									    System.out.println("Las caracteristicas de "+ bebote1.getNombre()+ " son:");
									    System.out.println("\n");
										 
					  					bebote1.setGatear(true);	
					  					bebote1.setCaminar(false);
					  					bebote1.setPegarse(true);
					  					bebote1.setRespirar(true);
										bebote1.setDormir(false);
										bebote1.setEstudiar(false);
										bebote1.setTrabajar(false);
										bebote1.setComer(true);
										bebote1.impbb();
										
										System.out.println("\n\n\n\n");
									    System.out.println("Las caracteristicas de "+ bebote2.getNombre()+ " son:");
										System.out.println("\n");
							
					  					bebote2.setGatear(false);	
					  					bebote2.setCaminar(false);
					  					bebote2.setPegarse(true);
					  					bebote2.setRespirar(true);
										bebote2.setDormir(false);
										bebote2.setEstudiar(false);
										bebote2.setTrabajar(false);
										bebote2.setComer(true);
										bebote2.impbb();
					  					break;
					  			default:
							
					  					System.out.println("Intente de nuevo por favor ");
					  					break;
					 	
					  			}//switch de bebes y etapas
					  	break;
				  case 2: //Ni�os
					  
						Ni�os ni�o1=new Ni�os ("Javier",true,"sexual","60 a�os","piramide", "baja","Asia","Budista","Carro","moderado","inocente");
						Ni�os ni�o2=new Ni�os("Cristian",true,"secual","70 a�os","piramide","Media","America","cristiano","Monta�a rusa","Mucho","Inocente");
						
						
						
						System.out.println("\n\n\n\n");
					    System.out.println("Las caracteristicas de "+ ni�o1.getNombre()+ " son:");
						System.out.println("\n");
						
						ni�o1.setPijamada(true);
						ni�o1.setDibujar(false);
						ni�o1.setJugar(true);
						ni�o1.setRespirar(true);
						ni�o1.setDormir(false);
						ni�o1.setEstudiar(true);
						ni�o1.setTrabajar(false);
						ni�o1.setComer(true);
						ni�o1.ni�oimp();
						
						System.out.println("\n\n\n\n");
					    System.out.println("Las caracteristicas de "+ ni�o2.getNombre()+ " son:");
						System.out.println("\n");
						
						ni�o2.setPijamada(true);
						ni�o2.setDibujar(true);
						ni�o2.setJugar(true);	
						ni�o2.setRespirar(true);
						ni�o2.setDormir(false);
						ni�o2.setEstudiar(true);
						ni�o2.setTrabajar(false);
						ni�o2.setComer(true);
						ni�o2.ni�oimp();
						
						
						
							
				  case 3://Adolescentes
					    Adolescentes ado1 =new Adolescentes("Pepe",true,"sexual","90 a�os","Piramide", "alta","Europa","Catolica","Universidad del valle de M�xico","No trabaja",false);
						Adolescentes ado2=new Adolescentes("Ivan",true,"Sexual","80 a�os","Piramide","Media","America","Cristiano","UNAM","Trabaja",true);
						
						System.out.println("\n\n\n\n");
					    System.out.println("Las caracteristicas de "+ ado1.getNombre()+ " son:");
						System.out.println("\n");
						
						ado1.setDeporte(true);
						ado1.setArtistica(false);
						ado1.setFiesta(false);
						ado1.setRespirar(true);
						ado1.setDormir(false);
						ado1.setEstudiar(true);
						ado1.setTrabajar(false);
						ado1.setComer(true);
						ado1.adoimp();
						
						System.out.println("\n\n\n\n");
					    System.out.println("Las caracteristicas de "+ ado2.getNombre()+ " son:");
						System.out.println("\n");
						
						ado2.setArtistica(true);
						ado2.setDeporte(false);
						ado2.setFiesta(true);
						ado2.setRespirar(true);
						ado2.setDormir(false);
						ado2.setEstudiar(true);
						ado2.setTrabajar(false);
						ado2.setComer(true);
						ado2.adoimp();
					  break;
				  case 4://Adultos
					  
					    Adultos adu1= new Adultos("Cesar",true,"sexual","90 a�os","reducida","alta","Europeo","Catolica","3 Nietos","2 hijos",true);
						Adultos adu2=new Adultos("Haziel",true,"sexual","100 a�os","Completa","Baja","America","Cristiana","4 nuestis","3 hijos",true);
						
						System.out.println("\n\n\n\n");
					    System.out.println("Las caracteristicas de "+ adu1.getNombre()+ " son:");
						System.out.println("\n");
						
						adu1.setRelacionessexuales(true);
						adu1.setEnfermedad("Se encuentra sano");
						adu1.setReuniones(true);
						adu1.setRespirar(true);
						adu1.setDormir(false);
						adu1.setEstudiar(true);
						adu1.setTrabajar(false);
						adu1.setComer(true);
						adu1.aduimp();
						
					  
						System.out.println("\n\n\n\n");
					    System.out.println("Las caracteristicas de "+ adu2.getNombre()+ " son:");
						System.out.println("\n");
						
						adu2.setRelacionessexuales(false);
						adu2.setEnfermedad("Gastritis");
						adu2.setReuniones(false);
						adu2.setRespirar(true);
						adu2.setDormir(false);
						adu2.setEstudiar(true);
						adu2.setTrabajar(false);
						adu2.setComer(true);
						adu2.aduimp();
						
							break;
					  
				default:
			
				System.out.println("NO hay mas");
			
				break;
			 }//cierre personas
				  
				  
		 case 2://animales
			 		System.out.println("1. Oviparos");
			 		System.out.println("2. Viviparos");
			 		 s= entrada5.nextInt();
			 		 	switch(s)
			 		 	{
			 		 	case 1:
			 		 		
			 		 		System.out.println("1.Viven en Agua");
			 		 		System.err.println("2.Viven en Tierra");
			 		 		
			 		 		x=entrada6.nextInt();
			 		 			switch(x)
			 		 			{
			 		 			case 1:
			 		 				System.out.println("1.Talla Mediana");
			 		 				System.out.println("2.Talla Grande");
			 		 				System.out.println("3.Talla Chica");
			 		 				y=entrada6.nextInt();
			 		 				switch(y)
			 		 				{
			 		 				case 1:
			 		 					
			 		 					break;
			 		 				case 2:
			 		 					
			 		 					break;
			 		 				case 3:
			 		 					
			 		 					break;
			 		 					
			 		 				default:
			 		 					break;
			 		 				}
			 		 				break;
			 		 			case 2:
			 		 				VivenTierra pajaro= new VivenTierra(true, true, true,true,true ,false,false,"Pollo",true,"sexual","20 a�os","Maiz",true,true,true,true);
			 		 				
			 		 				break;
			 		 			}
			 		 				
			 		 		
			 		 		
			 		 	break;
			 		 	case 2://viviparos
			 		 		System.out.println("1.Vuelas");
			 		 		System.out.println("2.Caminan");
			 		 		System.out.println("3.Arrastran");
			 		 		z=entrada8.nextInt();
			 		 		switch(z)
			 		 		{
			 		 		case 1:
			 		 			
			 		 			break;
			 		 		case 2:
			 		 			break;
			 		 		case 3:
			 		 			break;
			 		 	     default:
			 		 	    	 
			 		 	     break;
			 		 		}
			 		 	
			 		 	break;
			 		 	
			 		 	default:
			 		 		break;
			 		 	}
			 		
		 
				  break;
		 case 3: //plantas
			 	System.out.println("1.Plantas Acuaticas");
			 	System.out.println("2.Pantas Terrestres");
			 	r= entrada4.nextInt();
			 		switch(r){
			 		case 1:
			 			 PlantasAcuaticas pa1= new PlantasAcuaticas("Algas", false,"Asexual", "20 a�os", "Minerales", 100, true,"semilla", "Marino","Babosa",false, false, true);
			 			 PlantasAcuaticas pa = new PlantasAcuaticas("Coral", false, "Asexual", "50 a�os","Minerales", 50, false, "Periodico", "Marino","Rasposa", false, false, false);
			 			 
			 			System.out.println("\n\n\n\n");
					    System.out.println("Las caracteristicas de "+ pa1.getNombre()+ " son:");
						System.out.println("\n");
						
			 			 pa1.setPurificar(false);
			 			 pa1.setcamuflaje(false);
			 			 pa1.Alimentarse();
			 			 
			 			System.out.println("\n\n\n\n");
					    System.out.println("Las caracteristicas de "+ pa.getNombre()+ " son:");
						System.out.println("\n");
			 			 
			 		   	 pa.setPurificar(false);
			 			 pa.Alimentarse();
			 			 pa.setcamuflaje(false);
			 			 
			 			 break;
			 		case 2: //plantas terrestres 
			 		
			 			PlantasTerrestres pt1= new PlantasTerrestres("Arbol", false, "Asexual", "100 a�os", "Minerales", 90, false,"Periodico", "humedo", "Lisa", "Poco", true, true);
			 			
			 			pt1.setCurativa(false);
			 			pt1.setIntoxicar(true);
			 			pt1.setFruto(true);
			 		}
			 break;
		  }//switch main
		break;
	
case 2:
			  
			  Ni�os ni�o3=new Ni�os ();
			  ni�o3.setNombre("Pepazo");
				ni�o3.setEstudiar(true);
				ni�o3.setreligion("Musulman");
				ni�o3.setcontcotininente("Asia");
					
				Scanner lectura=new Scanner(System.in);
				String nom;
				
					System.out.println("\n\n Desea modificar algun atributo del objeto?    <S/N>>");
					String kk=lectura.next();
					
				if(kk.equals("s"))
						{
					
					System.out.println("1. Nombre");
					System.out.println("2. Estudiar");
					System.out.println("3. Religion");
					System.out.println("4. Continente");
			  Scanner lectura1=new Scanner(System.in);
				int io;
				io=lectura1.nextInt();
				
				switch (io)
				{
				case 1: 
					System.out.println("Elegiste el atributo de nombre, su valor actual es "+ni�o3.getNombre());
					System.out.println("Ingresa el nuevo nombre");
					
					String g=lectura.next();
					ni�o3.setNombre(g);
					System.out.println("Se ha cambiado por: "+ ni�o3.getNombre() );
					break;
	
				case 2:
					System.out.println("Elegiste el atributo de Estudiar, su valor actual es"+ni�o3.getEstudiar());
					
					System.out.println("Ingresa el nuevo valor");
					System.out.println("inserta true o false");
					boolean  f=lectura.nextBoolean();
					ni�o3.setEstudiar(f);
					
					break;
					
				
				case 3:
					break;
				case 4:
					break;
					
				default:
				break;
				}//cierre switch
					}//cierre if
			else if (kk.equals("n"))
				
					{
					System.out.println("Mantendra el mismo valor");
					}
			else
			{
				System.out.println("Ha ocurrido un error");
			  }
			break;	
			 
		  //plantas acuaticas
	 
	}
	}//cierre super pinche main de switch
}