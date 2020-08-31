
//import javax.swing.JOptionPane;

// para leer de teclado necesitamos la clase Scanner
import java.util.Scanner;
public class main {
	// Declaracion Variable Global de Tipo Clase Perros
    public static Perros[] ListaPerros = new Perros[10];
    public static Integer n;
    public static  Scanner sc = new Scanner(System.in);

     public static void main(String[] args) {

// Menu de opciones
  Integer op;

   boolean bandera=false;
   op = 0;
   n=0;
    do{
        cls();
        System.out.println("COLEGIO DE PERROS CIUDAD BOGOTA");
        System.out.println("\n");


    System.out.println("1. Cargar Datos a Base de Datos ");
    System.out.println("2. Visualizar Datos a Base de Datos ");
    System.out.println("3. Ordenar Datos por Ubicación ");
    System.out.println("4. Buscar información por Ubicación ");
    System.out.println("5. Salir ");
    System.out.println("Ingrese opción ");
    op = sc.nextInt();
  //  op = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Opción : "));

    switch(op)
    {
        case 1: Llenardatos();
                break;
        case 2: if (n>0)
                 {   Llenardatos();
                  }
                else
                { //JOptionPane.showMessageDialog(null, "Debe ingresar primero los datos de la BD");
                  System.out.println("Debe ingresar primero los datos de la Base de Datos ");
                }
                break;
        case 3:  if( n > 0)
                { Llenardatos();
                   Llenardatos();
                }
               else
               {//JOptionPane.showMessageDialog(null, "Debe ingresar primero los datos de la BD");
                   System.out.println("Debe ingresar primero los datos de la Base de Datos ");
               }
                break;
        case 4: if(n>0)
                { Buscarlocalidad();
                }  
               else
               {// JOptionPane.showMessageDialog(null, "Debe ingresar primero los datos de la BD");
                  System.out.println("Debe ingresar primero los datos de la Base de Datos ");
               }
                break;
        case 5: bandera = true;
                break;


        default:
               System.out.println("Opción no válida");
               break;

    }


    } while (bandera != true);


     }

	private static void Buscarlocalidad() {
		// TODO Auto-generated method stub
		
	}

	private static void Llenardatos() {
		// TODO Auto-generated method stub
		
	}

	private static void cls() {
		// TODO Auto-generated method stub
		
	}

}
