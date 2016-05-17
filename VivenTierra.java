
public class VivenTierra extends Oviparos {
    //Atributos
    Boolean pico;
    Boolean u�as;
    Boolean nido;
    Boolean patas;
    
    //Constructor

    VivenTierra() {
    pico = false;
    u�as = false;
    nido = false;
    patas = false;
    }
    
    //Constructor con parametros

    VivenTierra(Boolean pico, Boolean patas, Boolean u�as, Boolean nido, Boolean comestible, Boolean veneno, Boolean reptiles, String nombre, Boolean trespiracion, String treproduccion, String promvida, String talimentacion, Boolean estructura_osea, Boolean jerarquia_cadal, Boolean sangre, Boolean cola) {
	super(comestible, veneno, reptiles, nombre, trespiracion, treproduccion, promvida, talimentacion, estructura_osea, jerarquia_cadal, sangre, cola);
	this.pico = pico;
	this.u�as = u�as;
	this.nido = nido;
	this.patas = patas;
    }
    
    //Sets

    public void setPico(Boolean pico) {
	this.pico = pico;
    }

    public void setU�as(Boolean u�as) {
	this.u�as = u�as;
    }

    public void setNido(Boolean nido) {
	this.nido = nido;
    }
    
    //Gets

    public Boolean getPico() {
	return pico;
    }

    public Boolean getU�as() {
	return u�as;
    }

    public Boolean getNido() {
	return nido;
    }
    
    //	   Metodos
    
    public void CNidos(){
	if (u�as == true || pico == true){
	    System.out.println(getNombre()+" puede construir nidos debido a que posee pico y u�as que se lo permiten.");
	}
	else{
	    System.out.println("Debido a que "+getNombre()+" no posee ni pico ni garras no puede construir un nido.");
	}
	    
    }
    
    public void Crecer(){
	System.out.println(getNombre()+" puede crecer.");
    }
    
    public void Correr(){
	if (patas == true){
	    System.out.println(getNombre()+" es una especie que puede correr.");
	}
	else{
	    System.out.println(getNombre()+" no es una especie que pueda correr");
	}
    }
    
    
}
