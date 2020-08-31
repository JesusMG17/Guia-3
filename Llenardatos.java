
public class Llenardatos {
	private static final Perros[] ListaPerros = null;
	private static int n;

	public static void  Llenardatos()
    {   cls();
        System.out.println("COLEGIO DE PERROS CIUDAD BOGOTA");
        System.out.println("\n");

        //n =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero de Perros : "));
        System.out.println("Ingrese Numero de Perros : ");
        String nombre = null,localidad = null,raza = null,propietario = null,dia = null;
        Integer cedula = null, telefono = null;

    for(int i=0; i<n;i++)
       {
       ListaPerros[i] = new Perros();
       //ListaPerros[i].setNombre( JOptionPane.showInputDialog("Ingrese Nombre : "));
       System.out.println("Ingrese Nombre: ");

       ListaPerros[i].setNombre(nombre);

       System.out.println("Ingrese Cedula: ");
     
       ListaPerros[i].setCedula(cedula);

       System.out.println(" Ingrese Raza: ");
       
       ListaPerros[i].setRaza(raza);

      // ListaPerros[i].setRaza( JOptionPane.showInputDialog("Ingrese Raza : "));
       System.out.println(" Ingrese Localidad: ");
      

       ListaPerros[i].setLocalidad(localidad);
       //ListaPerros[i].setLocalidad( JOptionPane.showInputDialog("Ingrese Localidad : "));



       System.out.println("Ingrese Propietario: ");
     

        ListaPerros[i].setPropietario(propietario);




        System.out.println("Ingrese Telefono: ");
       
        ListaPerros[i].setTelefono(telefono);



       System.out.println("Ingrese Dia: ");
  
       ListaPerros[i].setDia(dia);

                }

     System.out.println("Presione x  y enter para continuar");
     

   }

	private static void cls() {
		// TODO Auto-generated method stub
		
	}
}
