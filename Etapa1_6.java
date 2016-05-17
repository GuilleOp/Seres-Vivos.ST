
public class Etapa1_6 extends Bebes{
	
	//atributos
	
	private String cant_lact;
	private String tiempo_lact;
	private String tiempo_comida;
	//metodos
	boolean girar;
	boolean sonidos;
	boolean despertar;
	
	public Etapa1_6(String nombre, boolean trespiracion, String treproduccion, String promvida, String talimentacion,String clasesocial,String continente, String religion, boolean prematuro,float medicion,float peso,String cant_lact,String tiempo_lact,String tiempo_comida)
	{
		super(nombre,trespiracion,treproduccion,promvida,talimentacion,clasesocial,continente,religion,prematuro,medicion,peso);
		this.cant_lact=cant_lact;
		this.tiempo_lact=tiempo_lact;
		this.tiempo_comida=tiempo_comida;
	}
	
	//SETTERS
	public void setCant_lact(String cant_lact)
	{
		this.cant_lact=cant_lact;
	}
	public void setTiempo_lact(String tiempo_lact)
	{
		this.tiempo_lact=tiempo_lact;
	}
	public void setTiempo_comida(String tiempo_comida )
	{
		this.tiempo_comida=tiempo_comida;
	}

	//GETTERS
	
	public String getCant_lact()
	{
		return cant_lact ;
	}
	public String getTiempo_lact()
	{
		return tiempo_lact;
	}
	public String getTiempo_comida()
	{
		return tiempo_comida;
	}
	
	//Metodos girar despertar sonidos
	
	public void setGirar(boolean girar)
	{
		this.girar=girar;
			if(girar==true)
			{
				System.out.println("El bebe corre peligro de caerse");
			}
			else
			{
				System.out.println("El bebe no corre peligro de caerse");
			}
	}
	public void setDespertar (boolean despertar)
	{
		this.despertar=despertar;
			if(despertar==true)
			{
				System.out.println("El bebe Se ha despertado");
			}
			else
			{
				System.out.println("El bebe No se ha despetado");
			}
	}
	public void setSonidos (boolean sonidos)
	{
		this.sonidos=sonidos;
			if(sonidos ==true)
			{
				System.out.println("El bebe Esta haciendo sonidos");
			}
			else
			{
				System.out.println("El bebe No esta haciendo sonidos  ");
			}
	}

	
	public void imp_bebe1() {
		System.out.println("cant_lact=" + cant_lact+
				"\n tiempo_lact=" + tiempo_lact +
				"\n tiempo_comida=" + tiempo_comida+
				"\n girar=" + girar + 
				"\n sonidos=" + sonidos + 
				"\n despertar=" + despertar + 
				"\n llorar=" + llorar+
				"\n nadar=" + nadar +
				"\n necesidades=" + necesidades + 
				"\n estudiar=" + estudiar +
				"\n trabajar="+ trabajar + 
				"\n comer=" + comer + 
				"\n dormir=" + dormir + 
				"\n getCant_lact ="+ getCant_lact()+ 
				"\n getTiempo_lact =" + getTiempo_lact() + 
				"\n getTiempo_comida =" + getTiempo_comida()+ 
				"\n getPrematuro =" + getPrematuro() + 
				"\n getMedicion =" + getMedicion() + 
				"\n getPeso =" + getPeso()+ 
				"\n getclasesocial =" + getclasesocial() + 
				"\n getContinente =" + getContinente() +
				"\n getReligion ="+ getReligion() + 
				"\n getTrespiracion =" + getTrespiracion()	+ 
				"\n getTreproduccion =" + getTreproduccion() + 
				"\n getPromvida =" + getPromvida()	+ 
				"\n getTalimentacion ="+ getTalimentacion());
				
	}


	


}


	
	
	


