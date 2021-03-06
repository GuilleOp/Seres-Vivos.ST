public class TallaMediana extends VivenAgua {
    //	Atributos
    Boolean aguja;
    String textura;
    int p_agua;
    
    //Constructor con parametros

    TallaMediana(Boolean aguja, String textura, int p_agua, Boolean caparazon, Boolean aletas, Boolean t_agua, Boolean comestible, Boolean veneno, Boolean reptiles, String nombre, Boolean trespiracion, String treproduccion, String promvida, String talimentacion, Boolean estructura_osea, Boolean jerarquia_cadal, Boolean sangre, Boolean cola) {
	super(caparazon, aletas, t_agua, comestible, veneno, reptiles, nombre, trespiracion, treproduccion, promvida, talimentacion, estructura_osea, jerarquia_cadal, sangre, cola);
	
	this.aguja = aguja;
	this.textura = textura;
	this.p_agua = p_agua;
    }
    
    //Constructor por default

    TallaMediana() {
	aguja = false;
	textura = "Unknow";
	p_agua = 0;
    }
    
    //Sets

    public void setAguja(Boolean aguja) {
	this.aguja = aguja;
    }

    public void setTextura(String textura) {
	this.textura = textura;
    }

    public void setP_agua(int p_agua) {
	this.p_agua = p_agua;
    }
    
    //Gets

    public Boolean getAguja() {
	return aguja;
    }

    public String getTextura() {
	return textura;
    }

    public int getP_agua() {
	return p_agua;
    }

    //		Metodos
    
    public void Clonarse (){
	if (getNombre().equals("Tiburon")){
	    System.out.println("El "+getNombre()+" es el unico animal con la capacidad de clonarse.");
	}
	
	else {
	    System.out.println("Debido a que "+getNombre()+" no es un tiburon, no puede clonarse");
	}
    }
    
    public void Rastrear (){
	if (getJerarquia_cadal() == true ){
	    System.out.println("Debido a que "+getNombre()+" es un depredador, puede rastrear mediante su olfato.");
	}
	
	else{
	    System.out.println("Debido a que "+getNombre()+" no es una depredador, no puede rastrear.");
	}
    }
    
    public void Electrocutar(){
	if(getNombre().equals("Anguila") || getNombre().equals("Medusa")){
	    System.out.println("Debido a que es un/a "+getNombre()+" puede electrocutar para defenderse o a cazar.");
	}
	else{
	    System.out.println("Debido a que "+getNombre()+" no es una Anguila o una Medusa, no puede electrocutar");
	}
    }
}
