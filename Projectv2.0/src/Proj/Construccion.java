
package Proj;
public class Construccion {
	//var
    public String[] num;
    double ancho;
    double alto;
    double profundidad;
    int cantamb;
    int cantpis;
    //var 2
    boolean puertaabier = false;
    boolean lucesExt=false;
    boolean lucesInt=false;
    boolean sistseg=false;
    
    
    
    //cons
    public Construccion (String[] numeros,double Ancho,double Alto,double Profundidad,int Cantamb,int Cantpis){
        num = numeros;
        ancho=Ancho;
        alto=Alto;
        profundidad=Profundidad;
        cantamb=Cantamb;
        cantpis=Cantpis;
        		
    }
    //met
    public void obtenerTipoambientes() {
        for (String n : num) {
            System.out.println(n);
        }
    }
    
  
    //tenia problemas en el metodo, me decia que no estaba definido el metodo , nada que ver
    public void obtenerAncho() {
        System.out.println(ancho);
    }
    
    public void obtenerAlto() {
        System.out.println(alto);
    }
    
    public void obtenerProfundidad() {
        System.out.println(profundidad);
    }
    
    public void obtenerCantamb() {
        System.out.println(cantamb);
    }
    
    public void obtenerCantpis() {
        System.out.println(cantpis);
    }
    
    //met2
    
    
    public void abrirPuerta() { 
    		this.puertaabier=true;
    		System.out.println("Abrimos la puerta principal");		
    		
    	}
    
    
    
public void cerrarPuerta() {
		
		this.puertaabier=false;
		
		System.out.println("Cerramos la puerta principal");
	}
    
    

public void estadoPuerta() {
	
	if(this.puertaabier==true) {
		
		
		System.out.println("La puerta principal esta abierta");
		
	}else {
		
		System.out.println("La puerta principal esta cerrada");
		
	}   
}
   

//luces exteriores



public void encenderLucesext() { 
	this.lucesExt=true;
	System.out.println("Encendimos las luces exteriores");
	
}



public void apagarLucesext() {
	
	this.lucesExt=false;
	
	System.out.println("Apagamos las luces exteriores");
}


public void estadoLucesext() {	
	if(this.lucesExt==true) {
		System.out.println("Las luces exteriores estan encendidas");
	}else {
		System.out.println("Las luces exteriores estan Apagadas");
	}   
}

//luces interiores

public void encenderLucesint() { 
	this.lucesInt=true;
	System.out.println("Encendimos las luces interiores");
	
}

public void apagarLucesint() {
	
	this.lucesInt=false;
	
	System.out.println("Apagamos las luces interiores");
}

public void estadoLucesint() {	
	if(this.lucesInt==true) {
		System.out.println("Las luces interiores estan encendidas");
	}else {
		System.out.println("Las luces interiores estan Apagadas");
	}   
}

//sistema de seguridad

public void encenderSistemadeseguridad() { 
	this.sistseg=true;
	System.out.println("Encendimos el sistema de seguridad");

}
   

public void apagarSistemadeseguridad() {
	
	this.sistseg=false;
	
	System.out.println("Apagamos el sistema de seguridad");
}



	public void estadoSistemadeseguridad() {	
		if(this.sistseg==true) {
			System.out.println("El sistema de seguridad esta encendido");
		}else {
			System.out.println("el sistema de seguridad esta Apagado");
		}   
	}











}
    
