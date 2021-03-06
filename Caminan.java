public class Caminan extends Viviparos {
    //Atributos 
    private Boolean patas;
    private Boolean pelo;
    private Boolean orejas;

    Caminan() { //	Constructor sin parametros
	patas = true;
	pelo = true ;
	orejas = true;
    }
    
    //Consttructor con parametros
    public Caminan(Boolean patas, Boolean pelo, Boolean orejas, boolean domestico, String habitat, boolean fertilidad, String nombre, Boolean trespiracion, String treproduccion, String promvida, String talimentacion, Boolean estructura_osea, Boolean jerarquia_cadal, Boolean sangre, Boolean cola) {
	super(domestico, habitat, fertilidad, nombre, trespiracion, treproduccion, promvida, talimentacion, estructura_osea, jerarquia_cadal, sangre, cola);
	this.patas = patas;
	this.pelo = pelo;
	this.orejas = orejas;
    }
    
    //Sets
    
    public void setPatas (Boolean patas){
	this.patas=patas;
    }
    
    public void setOrejas (Boolean orejas){
	this.orejas=orejas;
    }
    
    public void setPelo (Boolean pelo){
	this.pelo=pelo;
    }
    
    //Gets 
    
    public Boolean getPatas (){
	return patas;
    }
    
    public Boolean getOrejas (){
	return orejas;
    }
    
    public Boolean getPelo (){
	return pelo;
    }
    
    //	    Metodos
    public void Correr (){
	if (patas == true){
	    System.out.println(getNombre()+" tiene patas, puede correr.");
	}
	else 
	    System.out.println(getNombre()+" no tiene patas, no puede correr.");
    }
    
    public void Caminar (){
	if (patas == true){
	    System.out.println(getNombre()+" tiene patas, puede caminar.");
	}
	else 
	    System.out.println(getNombre()+" no tiene patas, no puede caminar.");
    }
    
    public void construir(){
	System.out.println(getNombre()+" esta construyendo, seguramente una presa, o su hogar.");
    }
}