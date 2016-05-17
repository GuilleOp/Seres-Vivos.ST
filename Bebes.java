
public class Bebes extends Personas {
		//atributos 
	private boolean prematuro;
	private float medicion;
	private float peso;
		//metodos
	
	boolean llorar;
	boolean nadar;
	boolean necesidades;
	
	public Bebes( String nombre, boolean trespiracion, String treproduccion, String promvida, String talimentacion,String clasesocial,String continente, String religion, boolean prematuro,float medicion,float peso)
	
	{
		super(nombre,trespiracion,treproduccion,promvida,talimentacion,clasesocial,continente,religion);
		
		this.prematuro=prematuro;
		this.medicion=medicion;
		this.peso=peso;
	}
	
	//SETTERS
			public void setPrematuro(boolean prematuro)
			{
				this.prematuro=prematuro;
			}
			public void setMedicion(float medicion)
			{
				this.medicion=medicion;
			}
			public void setPeso(float peso )
			{
				this.peso=peso;
			}
		
			//GETTERS
			
			public boolean getPrematuro()
			{
				return prematuro ;
			}
			public float getMedicion()
			{
				return medicion;
			}
			public float getPeso()
			{
				return peso;
			}
			
			//Metodos
			
		public void setLlorar (boolean llorar)
		{
			this.llorar=llorar;
				if(llorar==true)
				{
					System.out.println("El bebe tiene algo que lo aqueja");
				}
				else
				{
					System.out.println("El bebe no esta llorando ");
				}
		}
		public void setNadar (boolean nadar)
		{
			this.nadar=nadar;
				if(nadar==true)
				{
					System.out.println("El bebe sabe nadar");
				}
				else
				{
					System.out.println("El bebe no sabe nada");
				}
		}
		public void setNecesidades (boolean necesidades)
		{
			this.necesidades=necesidades;
				if(necesidades==true)
				{
					System.out.println("El bebe se ha hecho de la pipi o de la popo");
				}
				else
				{
					System.out.println("El bebe esta limpio ");
				}
		}
}

