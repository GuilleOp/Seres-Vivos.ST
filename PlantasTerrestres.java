
public class PlantasTerrestres extends Plantas  {
			//Atributos
	
	private String cuidado;
	private boolean cantluz;
	private boolean cantagua;
	
			//M�todos
	boolean fruto;
	boolean curativa;
	boolean intoxicar;
	
	public PlantasTerrestres(String nombre, boolean trespiracion, String treproduccion, String promvida, String talimentacion,
			int tama�o,boolean comestibilidad,String tcrec,String tsuelo,String textura,String cuidado, boolean cantluz, boolean cantagua)
	{
		super(nombre,trespiracion,treproduccion,promvida,talimentacion,tama�o,comestibilidad,tcrec,tsuelo,textura);
		
		this.cuidado=cuidado;
		this.cantluz=cantluz;
		this.cantagua=cantagua;
		
	}
	//SETTERS
			public void setCuidado(String cuidado)
			{
				this.cuidado=cuidado;
			}
			public void setCantluz(boolean cantluz)
			{
				this.cantluz=cantluz;
			}
			public void setCantagua(boolean cantagua )
			{
				this.cantagua=cantagua;
			}
		
			//GETTERS
			
			public String getCuidado()
			{
				return cuidado;
			}
			public boolean getCantluz()
			{
				return cantluz;
			}
			public boolean getcantagua()
			{
				return cantagua;
			}
			
			
		//M�TODOS
			public void setFruto(boolean fruto)
			{
				this.fruto=fruto;
				
				if(fruto==true)
				{
					System.out.println("Comer�s una rica fruta");
				}
				else
				{
			
			    	System.out.println("Te quedar�s con hambre ");
				}
			}
			
			public void setIntoxicar(boolean intoxicar)
			{
				this.intoxicar=intoxicar;
				
				if(intoxicar==true)
				{
					System.out.println("Sufrir�s una peque�a alergia");
				}
				else
				{
			
			    	System.out.println("No tienes nada de que preocuparte ");
				}
			}
			public void setCurativa(boolean curativa)
			{
				this.curativa=curativa;
				
				if(curativa==true)
				{
					System.out.println("Tendr�s una remedio natural");
				}
				else
				{
			
			    	System.out.println("No tiene caracteristicas curativas");
				}
			}
}

