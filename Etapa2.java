
public class Etapa2 extends Bebes {
	
		//atributos
	private String dientes;
	private String uñas;
	private String cabello;
		//metodos
	boolean gatear;
	boolean caminar;
	boolean pegarse;
	
	public Etapa2(String nombre, boolean trespiracion, String treproduccion, String promvida, String talimentacion,String clasesocial,String continente, String religion, boolean prematuro,float medicion,float peso,String dientes,String uñas,String cabello)
	{
		super(nombre,trespiracion,treproduccion,promvida,talimentacion,clasesocial,continente,religion,prematuro,medicion,peso);
		this.dientes=dientes;
		this.uñas=uñas;
		this.cabello=cabello;
	}
	
	//SETTERS
		public void setDientes(String dientes)
		{
			this.dientes=dientes;
		}
		public void setUñas(String uñas)
		{
			this.uñas=uñas;
		}
		public void setCabello(String cabello )
		{
			this.cabello=cabello;
		}

		//GETTERS
		
		public String getDientes()
		{
			return dientes ;
		}
		public String getUñas()
		{
			return uñas;
		}
		public String getCabello()
		{
			return cabello;
		}
		
		//Metodos gatear camunar egarse
		
		public void setGatear(boolean gatear)
		{
			this.gatear=gatear;
				if(gatear==true)
				{
					System.out.println("El bebe pronto caminara");
				}
				else
				{
					System.out.println("El bebe tomara mas tiempo para que camine ");
				}
		}
		public void setCaminar (boolean caminar)
		{
			this.caminar=caminar;
				if(caminar==true)
				{
					System.out.println("El bebe si camina ");
				}
				else
				{
					System.out.println("El bebe no camina");
				}
		}
		public void setPegarse (boolean pegarse)
		{
			this.pegarse=pegarse;
				if(pegarse ==true)
				{
					System.out.println("El bebe se puede hacer daño");
				}
				else
				{
					System.out.println("El bebe no se puede hacer daño");
				}
		}

		
		public void impbb() {
					System.out.println("dientes=" + dientes + 
					"\n uñas=" + uñas +
					"\n cabello=" + cabello + 
					"\n gatear=" + gatear+
					"\n caminar=" + caminar +
					"\n pegarse=" + pegarse +
					"\n llorar=" + llorar +
					"\n nadar=" + nadar+
					"\n necesidades=" + necesidades +
					"\n estudiar=" + estudiar +
					"\n trabajar=" + trabajar +
					"\n comer="+ comer + 
					"\n dormir =" + dormir + 
					"\n Dientes =" + getDientes() +
					"\n Uñas =" + getUñas()	+
					"\n Cabello =" + getCabello() + 
					"\n Prematuro =" + getPrematuro() +
					"\n Medicion = "+ getMedicion() + 
					"\n Peso =" + getPeso() + 
					"\n clasesocial =" + getclasesocial()+
					"\n Continente =" + getContinente() + 
					"\n Religion =" + getReligion() + 
					"\n Nombre ="+ getNombre() +
					"\n Trespiracion =" + getTrespiracion() + 
					"\n Treproduccion ="+ getTreproduccion() +
					"\n Promvida =" + getPromvida() + 
					"\n Talimentacion ="+ getTalimentacion() );
		}
}