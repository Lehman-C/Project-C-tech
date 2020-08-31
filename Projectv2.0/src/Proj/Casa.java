package Proj;

class Casa extends Construccion {
	String arb;
	
	public Casa(String[] numeros,double ancho,double alto,double profundidad,int cantambint,int cantpis,String Arb){
		super(numeros,ancho,alto,profundidad,cantambint,cantpis);
		this.arb=Arb;
	}
	
	
	public void caracterisCasa() {
		System.out.println(arb);
		
	
	}
	
	
	
	
	
	
	
	}
	
	
	
	
	


