
package Proj;
import Proj.Construccion;
import Proj.Casa;
import Proj.Kiosco;
import Proj.Departamento;
import Proj.EdificioOficinas;
public class Main {

	
    public static void main(String[] args) {
  
    	
    	
    	//Casa
    	String[] n = {"cocina,dormitorio y baño"};
    	Casa casa1 =new Casa(n,32.5,12.5,12.5,4,4,"La casa tiene un arbol en el Jardin, tambien tiene animales y un patio");
    	casa1.caracterisCasa();
    	
    	
    	
    	 System.out.println("los tipos de ambiente son:");
         casa1.obtenerTipoambientes();
         System.out.println("El ancho es:");
         casa1.obtenerAncho();
         System.out.println("El alto es:");
         casa1.obtenerAlto();
         System.out.println("La Profundidad es:");
         casa1.obtenerProfundidad();
         System.out.println("La cantidad de ambientes es:");
         casa1.obtenerCantamb();
         System.out.println("La cantidad de pisos es:");
         casa1.obtenerCantpis();
    	
    	
    	
    	
         casa1.estadoPuerta();
         casa1.abrirPuerta();
         
         
         casa1.estadoLucesext();
         casa1.encenderLucesext();
         
         casa1.estadoLucesint();
         casa1.encenderLucesint();
         
         casa1.estadoSistemadeseguridad();
         casa1.encenderSistemadeseguridad();
    	
    	
    	
    	
    	
    	//Kiosco
         String[] k = {"Kiosco"};
    	Kiosco kiosco1=new Kiosco(k,32.5,12.5,12.5,1,1,"El Kiosco tiene un Cartel publicitario Topline, tiene recarga sube y productos para la venta");
    	kiosco1.caracterisKiosco();
    	
    	   System.out.println("los tipos de ambiente son:");
           kiosco1.obtenerTipoambientes();
           System.out.println("El ancho es:");
           kiosco1.obtenerAncho();
           System.out.println("El alto es:");
           kiosco1.obtenerAlto();
           System.out.println("La Profundidad es:");
           kiosco1.obtenerProfundidad();
           System.out.println("La cantidad de ambientes es:");
           kiosco1.obtenerCantamb();
           System.out.println("La cantidad de pisos es:");
           kiosco1.obtenerCantpis();
           
    	
           
           kiosco1.estadoPuerta();
           kiosco1.abrirPuerta();
           
           
           kiosco1.estadoLucesext();
           kiosco1.encenderLucesext();
           
           kiosco1.estadoLucesint();
           kiosco1.encenderLucesint();
           
           kiosco1.estadoSistemadeseguridad();
           kiosco1.encenderSistemadeseguridad();   
           
    	
    	
    	
    	
    	//Departamento
           String[] d = {"baño,2 dormitorios"};
    	Departamento Departamento2ambientes =new Departamento(d,32.5,12.5,12.5,4,1,"Nuestro Departamento de 2 ambientes tiene balcon,recepcion y un ascensor");
    	Departamento2ambientes.caracterisDepartamento();
    	
    	  System.out.println("los tipos de ambiente son:");
          Departamento2ambientes.obtenerTipoambientes();
          System.out.println("El ancho es:");
          Departamento2ambientes.obtenerAncho();
          System.out.println("El alto es:");
          Departamento2ambientes.obtenerAlto();
          System.out.println("La Profundidad es:");
          Departamento2ambientes.obtenerProfundidad();
          System.out.println("La cantidad de ambientes es:");
          Departamento2ambientes.obtenerCantamb();
          System.out.println("La cantidad de pisos es:");
          Departamento2ambientes.obtenerCantpis();
          
    	
    	
          Departamento2ambientes.estadoPuerta();
          Departamento2ambientes.abrirPuerta();
          
          
          Departamento2ambientes.estadoLucesext();
          Departamento2ambientes.encenderLucesext();
          
          Departamento2ambientes.estadoLucesint();
          Departamento2ambientes.encenderLucesint();
          
          Departamento2ambientes.estadoSistemadeseguridad();
          Departamento2ambientes.encenderSistemadeseguridad();
          
          
    	
    	
    	
    	//edificio de oficinas
          String[] o = {"20 oficinas,40 baños"};
    	EdificioOficinas Edificio1 =new EdificioOficinas(o,32.5,100.5,20.5,60,20,"Nuestro edificio de oficinas tiene un ascensor,empleados y una sala de descanso para los empleados");
    	Edificio1.caracterisEdificio();
    	
    	  System.out.println("los tipos de ambiente son:");
          Edificio1.obtenerTipoambientes();
          System.out.println("El ancho es:");
          Edificio1.obtenerAncho();
          System.out.println("El alto es:");
          Edificio1.obtenerAlto();
          System.out.println("La Profundidad es:");
          Edificio1.obtenerProfundidad();
          System.out.println("La cantidad de ambientes es:");
          Edificio1.obtenerCantamb();
          System.out.println("La cantidad de pisos es:");
          Edificio1.obtenerCantpis();
          
          
          Edificio1.estadoPuerta();
          Edificio1.abrirPuerta();
          
          
          Edificio1.estadoLucesext();
          Edificio1.encenderLucesext();
          
          Edificio1.estadoLucesint();
          Edificio1.encenderLucesint();
          
          Edificio1.estadoSistemadeseguridad();
          Edificio1.encenderSistemadeseguridad();
    	
    	
    	
    }
}