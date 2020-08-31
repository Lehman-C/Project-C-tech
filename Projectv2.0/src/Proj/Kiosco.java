package Proj;








class Kiosco extends Construccion {
	String cart;
	
	public Kiosco(String[] numeros,double ancho,double alto,double profundidad,int cantambint,int cantpis,String Cart){
		super(numeros,ancho,alto,profundidad,cantambint,cantpis);
		this.cart=Cart;
	}
	
	
	public void caracterisKiosco() {
		System.out.println(cart);
		
	
	}
	
	
	
	
	
	
	
	}
	
	
	