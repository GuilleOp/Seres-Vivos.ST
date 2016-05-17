
public class Plantas extends SeresVivosClass {
	
		//Atributos
	private int tamaño;
	private boolean comestibilidad;
	private String tcrec; //Se refiere al tipo de crecimiento
	private String tsuelo;//tipo de suelo 
	private String textura; 
		//Metodos
	String  fotosintesis; 
	boolean mata;
	boolean adornar;
	
	Plantas()			//Constructor por default
	{
		super();
		tamaño=0;
		comestibilidad=false;
		tcrec="Unknow";
		tsuelo="Tsuelo";
		textura="Unknow";
		
		
	}
		
	public Plantas (String nombre, boolean trespiracion, String treproduccion, String promvida, String talimentacion,int tamaño,boolean comestibilidad,String tcrec,String tsuelo,String textura)
	{
		super(nombre,trespiracion,treproduccion,promvida,talimentacion);
		
		this.tamaño=tamaño;
		this.comestibilidad=comestibilidad;
		this.tcrec=tcrec;
		this.tsuelo=tsuelo;
		this.textura=textura;
		
		
		
	}
		
	
	//SETTERS
	public void setTamaño(int tamaño)
	{
		this.tamaño=tamaño;
	}
	public void setComestibilidad(boolean comestibilidad)
	{
		this.comestibilidad= comestibilidad;
	}
	public void setTcrec(String tcrec)
	{
		this.tcrec=tcrec;
	}
	public void setTsuelo(String tsuelo)
	{
		this.tsuelo=tsuelo;
	}
	public void setTextura(String textura )
	{
		this.textura=textura;
	}
	//GETTERS
	
	public int getTamaño()
	{
		return tamaño;
	}
	public boolean getComestibilidad()
	{
		return comestibilidad;
	}
	public String getTcrec()
	{
		return tcrec;
	}
	public String getTsuelo()
	{
		return tsuelo;
	}
	public String getTextura()
	{
		return textura;
	}
	
	//METODOS  fotosintesis, mata , adornar
	
	public String getFotosintesis()
	{
		return "La planta " +getNombre()+ "tiene fotosintesis";
	}
	public void setMataa(boolean mata)
	{
		this.mata=mata;
		if(mata==true)
		{
			System.out.println("La planta de nombre "+ getNombre()+ " es una asesina");
		}
		else
		{
			System.out.println("La planta de nombre"+getNombre()+" no mata ");
		}
	}
	public void setAdornar(boolean adornar)
	{
		this.adornar=adornar;
		if(adornar== true)
		{
			System.out.println("Servirá de un bonito adorno para tu pecera");
		}
		else 
		{
			System.out.println("No será un bonito adorno");
		}
	}
	
	//IMPRIMIR 
}
