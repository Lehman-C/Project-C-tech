package Proj;




class Departamento extends Construccion {
	String bal;
	
	public Departamento(String[] numeros,double ancho,double alto,double profundidad,int cantambint,int cantpis,String Bal){
		super(numeros,ancho,alto,profundidad,cantambint,cantpis);
		this.bal=Bal;
	}
	
	
	public void caracterisDepartamento() {
		System.out.println(bal);
		
	
	}
	
	
	
	
	
	
	
	}
	
	