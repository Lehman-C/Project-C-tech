package Proj;




class EdificioOficinas extends Construccion {
	String asc;
	
	public EdificioOficinas(String[] numeros,double ancho,double alto,double profundidad,int cantambint,int cantpis,String Asc){
		super(numeros,ancho,alto,profundidad,cantambint,cantpis);
		this.asc=Asc;
	}
	
	
	public void caracterisEdificio() {
		System.out.println(asc);
		
	
	}
	
	
	
	
	
	
	
	}
	