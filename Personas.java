
public class Personas extends SeresVivosClass{
		//ATRIBUTOS
	private String clasesocial;
	private String continente;
	private String religion;
	
		//METODOS
	boolean estudiar;
	boolean trabajar;
	boolean comer;
	
	Personas()
	{
		clasesocial="";
		continente="";
		religion=" ";
	}
	
	public Personas(String nombre, boolean trespiracion, String treproduccion, String promvida, String talimentacion,String clasesocial,String continente, String religion)
	{
		super(nombre,trespiracion,treproduccion,promvida, talimentacion);
		this.clasesocial=clasesocial;
		this.continente=continente;
		this.religion=religion;
	}
	
	//Setters 
	   public void setclasesocial(String clasesocial)
	   		{
			this.clasesocial=clasesocial;
		    }
		    
		    public void setcontcotininente (String continente){
			this.continente=continente;
		    }
		    
		    public void setreligion (String  religion){
			this.religion=religion;
		    }
		    
		    
		    //Gets
		    public String getclasesocial(){
			return clasesocial;
		    }
		     
		    public String getContinente(){
			return continente;
		    }
		    
		    public String getReligion(){
			return religion;
		    }
		    
		  //metodos estudiar comer trabajar
		    
		    public void setEstudiar(boolean estudiar)
		    {
		    	this.estudiar=estudiar;
		    	
		    	if(estudiar==true)
		    	{
		    		System.out.println("Es estudiante");
		    	}
		    	else
		    	{
		    		System.out.println("No es un estudiante ");
		    	}
		    }
		    	public boolean getEstudiar()
		    	{
		    		return estudiar;
		    	}
		    
		    	
		    public void setTrabajar(boolean trabajar)
		    	{
		    		this.trabajar=trabajar;
		    		if(trabajar==true)
		    		{
		    			System.out.println("Tiene un trabajo");
		    		}
		    		else
		    		{
		    			System.out.println("No tiene un trabajo");
		    		}
		    		
		    	}
		    	
		    public void setComer(boolean comer)
		    {
		    	this.comer=comer;
		    	if(comer=true)
		    	{
		    		System.out.println("Tenía hambre");
		    		
		    	}
		    	else
		    	{
		    		System.out.println("Por el momento no tiene hambre");
		    	}
		    	
		    	
		    }
}
		    
		    
		    
		   
		   
	

