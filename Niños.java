
public class Niños extends Personas {
	//atributo
	private String  juguete;
	private String torpeza;
	private String inociencia;
	//metodos
	boolean jugar;
	boolean dibujar;
	boolean pijamada;
	
	
	
	public Niños() {
		super();
	}

	public Niños(String nombre, boolean trespiracion, String treproduccion, String promvida, String talimentacion,String clasesocial,String continente, String religion,String juguete,String  torpeza,String  inociencia)
	{
		super(nombre,trespiracion,treproduccion,promvida,talimentacion,clasesocial,continente,religion);
		this.juguete=juguete;
		this.torpeza=torpeza;
		this.inociencia=inociencia;
	}
	
	//SETTERS
	public void setJuguete(String juguete)
	{
		this.juguete=juguete;
	}
	public void setTorpeza(String torpeza)
	{
		this.torpeza=torpeza;
	}
	public void setinociencia (String inociencia )
	{
		this.inociencia=inociencia;
	}

	//GETTERS
	
	public String  getJuguete()
	{
		return juguete ;
	}
	public String getTorpeza()
	{
		return torpeza;
	}
	public String  getInociencia()
	{
		return inociencia;
	}
	
	//Metodos jugar dibujar pijama
	
	public void setJugar(boolean jugar)
	{
		this.jugar=jugar;
		if(jugar== true)
		{
			System.out.println("El niño se esta divirtiendo");
			
		}
		else
		{
			System.out.println("El niño no se esta divirtiendo");
		}
	}
	
	
	public void setDibujar(boolean dibujar)
	{
		this.dibujar=dibujar;
		
		if(dibujar==true)
		{
			System.out.println("El niño esta dibujando");
		}
		else
		{
	
	    	System.out.println("El niño no esta dibujando ");
		}
		
	}
	public void setPijamada(boolean pijamada)
	{
		this.pijamada=pijamada;
		
		if(pijamada==true)
		{
			System.out.println("El niño esta con amigos");
		}
		else
		{
	
	    	System.out.println("El niño no esta con amigos ");
		}
		
	}

	
	public void  niñoimp() {
		System.out.println("juguete=" + juguete +
				" torpeza=" + torpeza + 
				" inociencia=" + inociencia +
				" jugar=" + jugar+
				" dibujar=" + dibujar + 
				" pijamada=" + pijamada + 
				" estudiar=" + estudiar + 
				" trabajar="	+ trabajar + 
				" comer=" + comer + 
				" dormir=" + dormir + 
				" getJuguete()=" + getJuguete()+
				" getTorpeza()=" + getTorpeza() + 
				" getInociencia()=" + getInociencia() +
				" getclasesocial()="+ getclasesocial() +
				" getContinente()=" + getContinente() + 
				" getReligion()=" + getReligion()	+ 
				" getTrespiracion()=" + getTrespiracion() + 
				" getTreproduccion()="	+ getTreproduccion() + 
				" getPromvida()=" + getPromvida() + 
				" getTalimentacion()=" + getTalimentacion());
	}
	
	

}
