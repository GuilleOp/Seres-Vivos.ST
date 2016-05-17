
public class Adultos extends Personas {
	//atributos
	private String nietos;
	private String  hijos;
	private boolean esposa;
	//metodos
	boolean relacionessexuales;
	String enfermedad;
	boolean reuniones;
	
	public Adultos(String nombre, boolean trespiracion, String treproduccion, String promvida, String talimentacion,String clasesocial,String continente, String religion,String  nietos,String  hijos,boolean esposa)
	{
		super(nombre,trespiracion,treproduccion,promvida,talimentacion,clasesocial,continente,religion);
		this.nietos=nietos;
		this.hijos=hijos;
		this.esposa=esposa;
	}
	//SETTERS
			public void serNietos(String nietos)
			{
				this.nietos=nietos;
			}
			public void setHijos(String hijos)
			{
				this.hijos=hijos;
			}
			public void setEsposa(boolean esposa)
			{
				this.esposa=esposa;
			}

			//GETTERS
			
			public String  getNietos()
			{
				return nietos ;
			}
			public String getHijos()
			{
				return hijos;
			}
			public boolean  getEsposa()
			{
				return esposa;
			}
			
			//Metodos  
			public void setEnfermedad(String  enfermedad)
			{
				this.enfermedad=enfermedad;
				
			}
			public String  getEnfermedad()
			{
				return enfermedad;
			}
			
			public void setRelacionessexuales(boolean relacionessexuales)
			{
				this.relacionessexuales=relacionessexuales;
				
				if(relacionessexuales==true)
				{
					System.out.println(getNombre()+" tiene una vida sexual placentera");
				}
				else
				{
			
			    	System.out.println(getNombre()+" no tiene una vida sexual placentera");
				}
				
			}

			public void setReuniones(boolean reuniones)
			{
				this.reuniones=reuniones;
				
				if(reuniones==true)
				{
					System.out.println(getNombre()+" esta en una reunion");
				}
				else
				{
			
			    	System.out.println(getNombre()+" no esta en una reunion ");
				}
				
			}
			
			
			public void aduimp() {
				System.out.println("nietos=" + nietos + 
						"\n hijos=" + hijos + 
						"\n esposa=" + esposa + 
						"\n relacionessexuales="+ relacionessexuales +
						"\n enfermedad=" + enfermedad + 
						"\n reuniones=" + reuniones + 
						"\n estudiar="+ estudiar + 
						"\n trabajar=" + trabajar +
						"\n comer =" + comer + 
						"\n dormir =" + dormir+ 
						"\n Nietos =" + getNietos() +
						"\n Hijos =" + getHijos() + 
						"\n Esposa =" + getEsposa()+ 
						"\n Enfermedad =" + getEnfermedad() +
						"\n clasesocial =" + getclasesocial()+
						"\n Continente =" + getContinente() + 
						"\n Religion =" + getReligion() + 
						"\n Trespiracion =" + getTrespiracion() + 
						"\n Treproduccion ="+ getTreproduccion() + 
						"\n Promvida =" + getPromvida() + 
						"\n Talimentacion ="+ getTalimentacion() );
			}
			
			
}
