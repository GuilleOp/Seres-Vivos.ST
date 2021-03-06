
public class Animales extends SeresVivosClass {
    
    //Atributos 
    private Boolean estructura_osea;
    private Boolean jerarquia_cadal;
    private Boolean sangre;
    private Boolean cola;
    private String nacimiento;
    
    Animales (){	 //Constructor  por default
	super();
	cola = false;
	sangre = false;
	estructura_osea= false;
	jerarquia_cadal = false;
    }
    
    Animales (String nombre, Boolean trespiracion, String treproduccion, String promvida, String talimentacion, Boolean estructura_osea, Boolean jerarquia_cadal, Boolean sangre, Boolean cola){	 //Constructor por default
	
	super( nombre, trespiracion, treproduccion, promvida, talimentacion);
	
	this.cola=cola;
	this.estructura_osea=estructura_osea;
	this.jerarquia_cadal=jerarquia_cadal;
	this.sangre=sangre;	
    }
    
    //SETS
    public void setEstructura_osea (Boolean estructura_osea){
	this.estructura_osea=estructura_osea;
    }
    
    public void setJerarquia_cadal (Boolean jerarquia_cadal){
	this.jerarquia_cadal=jerarquia_cadal;
    }
     
    public void setSangre (Boolean sangre){
	this.sangre=sangre;
    }
    
    public void setCola (Boolean cola){
	this.cola=cola;
    }
    
    public void setNacimiento (String nacimiento){
	this.nacimiento=nacimiento;
    }
    
    //Gets
    
    public Boolean getEstructura_osea(){
	return estructura_osea;
    }
    
    public Boolean getJerarquia_cadal(){
	return jerarquia_cadal;
    }
    
    public Boolean getSangre (){
	return sangre;
    }
    
    public Boolean getCola(){
	return cola;
    }
    
    public String getNacimiento (){
	return nacimiento;
    }
    
	    //Metodos
    
    public void Cazar (){
	if (jerarquia_cadal == true){	    //Si el valor es true, significa que son depredador
	    System.out.println(getNombre()+" es un depredador.");
	}
	
	else 
	    System.out.println(getNombre()+" es una presa.");	    //Caso contrario terminan siendo presas
    }

    public void Instinto () {
	if (jerarquia_cadal == true){
	    System.out.println("El instinto de "+getNombre()+" sera el de actuar hostil");
	} 
	
	else 
	    System.out.println("El instinto de "+getNombre()+" sera el de actuar de manera pacifica");
    }
    
    public void Nacimiento(){
	System.out.println("La fecha de nacimiento de "+getNombre()+" es la de "+getNacimiento());
    }
     
}
