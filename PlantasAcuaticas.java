import org.omg.Messaging.SyncScopeHelper;

public class PlantasAcuaticas extends Plantas {
		//Atributos
	private boolean hojaspequeñas;
	private boolean raicespequeñas;
	private boolean flotante;
	//Métodos
	boolean purificar;
	String alimentarse;
	boolean camuflaje;
	
	//constructor
	public PlantasAcuaticas(String nombre, boolean trespiracion, String treproduccion, String promvida, String talimentacion,int tamaño,boolean comestibilidad,String tcrec,String tsuelo,String textura,boolean hojaspequeñas,boolean raicespequeñas, boolean flotante)
	{
		super(nombre,trespiracion,treproduccion,promvida,talimentacion,tamaño,comestibilidad,tcrec,tsuelo,textura);
		this.hojaspequeñas=hojaspequeñas;
		this.raicespequeñas= raicespequeñas;
		this.flotante=flotante;
	}
	
	//SETTERS
		public void setHojaspequeñas(boolean hojaspequeñas)
		{
			this.hojaspequeñas=hojaspequeñas;
		}
		public void setRaicespequeñas(boolean raicespequeñas)
		{
			this.raicespequeñas=raicespequeñas;
		}
		public void setFlotante(boolean flotante )
		{
			this.flotante=flotante;
		}
	
		//GETTERS
		
		public boolean getHojaspequeñas()
		{
			return hojaspequeñas;
		}
		public boolean getRaicespequeñas()
		{
			return raicespequeñas;
		}
		public boolean getFlotante()
		{
			return flotante;
		}
	//Métodos		purificar alimentarse, camuflaje
		
		public void setPurificar(boolean purificar)
		{
			this.purificar=purificar;
			if(purificar == true)
			{
				System.out.println("Será de gran ayuda para el hogar de tus peces");
				
			}
			else
			{
				System.out.println("No purifica");
			}
		}
		public String Alimentarse()
	
		{
			return "Se alimenta de seres por debajo de su posicion en la cadena alimenticia";
		}
		
		public void setcamuflaje(boolean camufalje)
		{
			this.camuflaje=camuflaje;
			
			if(camuflaje==true)
			{
				System.out.println("será dificil que se lo coman los depredadores");
			}
			else
			{
		
		    	System.out.println("Será presa fácil ");
	
			}
		}
}



