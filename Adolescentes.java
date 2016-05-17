
public class Adolescentes extends Personas {
	//atributos
	private String universidad;
	private String trabajo;
	private boolean novia;
	
	//metodos
	boolean deporte;
	boolean artistica;
	boolean fiesta;
	
	
	public Adolescentes(String nombre, boolean trespiracion, String treproduccion, String promvida, String talimentacion,String clasesocial,String continente, String religion,String universidad, String trabajo,boolean novia)
	{
		super(nombre,trespiracion,treproduccion,promvida,talimentacion,clasesocial,continente,religion);
		this.universidad=universidad;
		this.trabajo=trabajo;
		this.novia=novia;
	}

	//SETTERS
		public void setuniversidad(String universidad)
		{
			this.universidad=universidad;
		}
		public void setTrabajo(String trabajo)
		{
			this.trabajo=trabajo;
		}
		public void setNovia (boolean novia)
		{
			this.novia=novia;
		}

		//GETTERS
		
		public String  getUniversidad()
		{
			return universidad ;
		}
		public String getTrabajo()
		{
			return trabajo;
		}
		public boolean  getNovia()
		{
			return novia;
		}
		
		//Metodos deporte artistica fiesta 
		
		
		public void setDeporte(boolean deporte)
		{
			this.deporte=deporte;
			
			if(deporte==true)
			{
				System.out.println(getNombre()+"Hace ejercicio");
			}
			else
			{
		
		    	System.out.println(getNombre()+" No hace ejercicio");
			}
			
		}

		public void setArtistica(boolean artistica)
		{
			this.artistica=artistica;
			
			if(artistica==true)
			{
				System.out.println(getNombre()+"Es todo un artista");
			}
			else
			{
		
		    	System.out.println(getNombre()+"No es un artista ");
			}
			
		}

		public void setFiesta(boolean fiesta)
		{
			this.fiesta=fiesta;
			
			if(fiesta==true)
			{
				System.out.println(getNombre()+" Esta pasando un buen rato");
			}
			else
			{
		
		    	System.out.println(getNombre()+" se quedó en casa ");
			}
			
		}

		
		public void adoimp() {
			
			System.out.println("universidad=" + universidad + 
					"\n trabajo=" + trabajo +
					"\n novia=" + novia+
					"\n deporte=" + deporte +
					"\n artistica=" + artistica + 
					"\n fiesta=" + fiesta +
					"\n estudiar="+ estudiar + 
					"\n trabajar=" + trabajar +
					"\n comer=" + comer + 
					"\n dormir=" + dormir+
					"\n Universidad =" + getUniversidad() +
					"\n Trabajo =" + getTrabajo() +
					"\n Novia ="+ getNovia() + 
					"\n clasesocial =" + getclasesocial() + 
					"\n Continente =" + getContinente()+
					"\n Religion =" + getReligion() +
					"\n Trespiracion ="		+ getTrespiracion() +
					"\n Treproduccion =" + getTreproduccion() + 
					"\n Promvida ="+ getPromvida() + 
					"\n Talimentacion =" + getTalimentacion());
		}
		
		

		






	}

