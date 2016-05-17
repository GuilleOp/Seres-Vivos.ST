
public class SeresVivosClass {
	
	 //Atributos de la clase
	  private String nombre;
      private Boolean trespiracion;
      private String treproduccion;
      private String promvida;
      private String talimentacion;
      Boolean dormir;
    
    SeresVivosClass(){	//Constructor por default
        nombre = "Unknow";
        trespiracion= true;
        treproduccion= "Unknow";
        promvida= "Unknow";
        talimentacion = "Unknow";
    }
    
    SeresVivosClass(String nombre, boolean trespiracion, String treproduccion, String promvida, String talimentacion){ //Constructores con parametros 
	this.nombre=nombre;
	this.trespiracion= true;
	this.treproduccion=treproduccion;
	this.promvida=promvida;
	this.talimentacion=talimentacion;
    }
    
    //Sets
    
    public void setNombre(String nombre){
	this.nombre=nombre;
    }
    
    public void setTrespiracion (Boolean trespiracion){
	this.trespiracion=trespiracion;
    }
    
    public void setTreproduccion (String treproduccion){
	this.treproduccion=treproduccion;
    }
    
    public void setPromvida (String promvida){
	this.promvida=promvida;
    }
    
    public void setTalimentacion (String talimentacion){
	this.talimentacion=talimentacion;
    }
    
    //Gets
    public String getNombre(){
    	
	return nombre;
	
    }
     
    public Boolean getTrespiracion(){
	return trespiracion;
    }
    
    public String getTreproduccion(){
	return treproduccion;
    }
   
    public String getPromvida(){
	return promvida;
    }
    
    public String getTalimentacion(){
	return talimentacion;
    }
    

	    //Metodos 
    public void setRespirar (Boolean trespiracion){    //Metodo para determinar su tipo de respiracion
	this.trespiracion=trespiracion;
	
	if (trespiracion == true){
	    System.out.println("El tiene un tipo de respiracion pulmonar");
	}
	
	if (trespiracion == false){
	    System.out.println("El tiene un tipo de respiracion mediante branqueas");
	}
    }
    
    public void setDormir	(Boolean dormir){
	this.dormir=dormir;
	
	if (dormir == true){
	    System.out.println("Esta durmiendo");
	}
	
	if (dormir == false){
	    System.out.println("Esta despierto");
	}
	
    }
    
    public void Comunicacion (){
	//Pendiente
    }
}
