import org.omg.Messaging.SyncScopeHelper;

public class PlantasAcuaticas extends Plantas {
		//Atributos
	private boolean hojaspeque�as;
	private boolean raicespeque�as;
	private boolean flotante;
	//M�todos
	boolean purificar;
	String alimentarse;
	boolean camuflaje;
	
	//constructor
	public PlantasAcuaticas(String nombre, boolean trespiracion, String treproduccion, String promvida, String talimentacion,int tama�o,boolean comestibilidad,String tcrec,String tsuelo,String textura,boolean hojaspeque�as,boolean raicespeque�as, boolean flotante)
	{
		super(nombre,trespiracion,treproduccion,promvida,talimentacion,tama�o,comestibilidad,tcrec,tsuelo,textura);
		this.hojaspeque�as=hojaspeque�as;
		this.raicespeque�as= raicespeque�as;
		this.flotante=flotante;
	}
	
	//SETTERS
		public void setHojaspeque�as(boolean hojaspeque�as)
		{
			this.hojaspeque�as=hojaspeque�as;
		}
		public void setRaicespeque�as(boolean raicespeque�as)
		{
			this.raicespeque�as=raicespeque�as;
		}
		public void setFlotante(boolean flotante )
		{
			this.flotante=flotante;
		}
	
		//GETTERS
		
		public boolean getHojaspeque�as()
		{
			return hojaspeque�as;
		}
		public boolean getRaicespeque�as()
		{
			return raicespeque�as;
		}
		public boolean getFlotante()
		{
			return flotante;
		}
	//M�todos		purificar alimentarse, camuflaje
		
		public void setPurificar(boolean purificar)
		{
			this.purificar=purificar;
			if(purificar == true)
			{
				System.out.println("Ser� de gran ayuda para el hogar de tus peces");
				
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
				System.out.println("ser� dificil que se lo coman los depredadores");
			}
			else
			{
		
		    	System.out.println("Ser� presa f�cil ");
	
			}
		}
}



