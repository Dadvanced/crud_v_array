/*
*
* @author David León Galisteo
* Crud - Ratonleon versión array
*
*/
import java.util.Scanner; //importamos la clase Scanner con la que poder introucir datos

public class Ratonleon {
  public static void main(String[] args) {
    System.out.println("Bienvenido al programa de gestión de ratones, \"Ratonleon\".");
    System.out.println();
    
    int option = 0; //en ésta variable guardamos la opción escogida por el usuario.
    Scanner n = new Scanner(System.in); 
    
    String[] marca = new String[10];
    double[] precio = new double[10];
    String[] tipo = new String[10];
    
    for (int i = 0; i < marca.length; i++) {  //añadimos valores por defecto a los arrays
      marca[i] = "vacío";
      tipo[i] = "vacío";
      precio[i] = 0;
    }
    
    marca[0] = "Razer";
    precio[0] = 60;
    tipo[0] = "láser";
    
    marca[1] = "Logitech";
    precio[1] = 30;
    tipo[1] = "óptico";
    
    marca[2] = "Sharkoon";
    precio[2] = 25;
    tipo[2] = "inalámbrico";
    
    //////////////////////////////////////////////////////////////////////////////////
    boolean exit = false;
    while (!exit) {
      System.out.println("┌───────────────────────────────────────────────────────────────┐");
      System.out.println("│                       Elija una opción                        │");
      System.out.println("└───────────────────────────────────────────────────────────────┘");
      System.out.println("[1]: Visualizar los productos.");
      System.out.println("[2]: Añadir nuevos datos.");
      System.out.println("[3]: Modificar datos existentes.");
      System.out.println("[4]: Eliminar datos.");
      System.out.println("[5]: Salir.");
      System.out.println("────────────────────────────────────────────────────────────────┘");
      System.out.println();
      
      boolean opcionCorrecta = false; //comprueba si la opción escogida por el usuario es correcta
      while (!opcionCorrecta) {
        System.out.print("Opción: ");
        option = Integer.parseInt(n.nextLine());
        
        switch (option) {
          case 1:
          visualizar(marca, tipo, precio);
          opcionCorrecta = true;
          break;
          
          case 2:
          nuevosDatos(marca, tipo, precio);
          opcionCorrecta = true;
          break;
          
          case 3:
          modificaDatos(marca, tipo, precio);
          opcionCorrecta = true;
          break;
          
          case 4:
          eliminaDatos(marca,tipo, precio);
          opcionCorrecta = true;
          break;
          
          case 5:
          opcionCorrecta = true;
          exit = true;
          break;
          
          default:
          System.out.println("La opción elegida no existe, vuelva a introducir un número.");
        } //switch
      } //while
    } //while del menú
    
    
  }
  
  ////////////FUNCIONES//////////
    
  /**
  * Visualiza los productos que tenemos guardados
  * @param marca array de tipo string que indica la marca del producto
  * @param precio array de tipo double que indica el precio del producto
  * @param tipo array de tipo string que indica el tipo del producto
  */
  
  public static void visualizar(String marca[], String tipo[], double precio[]) {
    System.out.println("┌─────────────────┬─────────────────┬────────────────┐");
    System.out.println("│    Marca        │     Tipo        │      Precio    │");
    System.out.println("├─────────────────┼─────────────────┼────────────────┤");
    
    for (int i = 0; i < marca.length; i++) {
      System.out.printf("│ %-15s │ %-15s │ %14.2f │", marca[i], tipo[i], precio[i]);
      System.out.println();
    }
    
    System.out.println("└─────────────────┴─────────────────┴────────────────┘");
    System.out.println();
    System.out.println();
    
  }
  
  
  
  /**
  * Añade a los arrays <code>marca, tipo y precio</code> nuevos valores
  * @param marca usaremos éste array para encontrar un hueco libre para introducir datos.
  * @param tipo usaremos éste parámetro para modificar el array <code>tipo</code>
  * @param precio usaremos éste parámetro para modificar el array <code>precio</code>
  */
  
  public static void nuevosDatos(String marca[], String tipo[], double precio[]) {
    Scanner f = new Scanner(System.in);
    int espacioDisponible = 0;
    int repeticiones = marca.length - 1;
    int inicio = 0;
    boolean esEspacioLibre = false;
    
    while (repeticiones >= 0 && !esEspacioLibre) { //comprueba el hueco libre para añadir datos
      if (marca[inicio] == "vacío") {
        espacioDisponible = inicio;
        esEspacioLibre = true;
      }
      repeticiones--;
      inicio++;
    }
    
    if (esEspacioLibre) {
      System.out.print("Por favor introduzc la nueva marca: ");
      marca[espacioDisponible] = f.nextLine();
      System.out.println();
      System.out.print("Por favor introduzca el nuevo tipo: ");
      tipo[espacioDisponible] = f.nextLine();
      System.out.println();
      System.out.print("Por favor introduzca el precio: ");
      precio[espacioDisponible] = Double.parseDouble(f.nextLine());
      System.out.println();
      
      System.out.println();
      System.out.println("Se han añadido correctamente los nuevos valores.");
      System.out.println("Puede usted elegir la opción 1 del menú si desea visualiarlos.");
      System.out.println();
      System.out.println();
    } else {
      System.out.println();
      System.out.println("Lo siento, no hay espacio para nuevos datos.");
      System.out.println("Puede uster eleminar entradas para introducir nuevos datos.");
      System.out.println();
      System.out.println();
    }
  }
    
    
     
  /**
  * Modifica valores ya existentes de un registro.
  * @param marca usaremos éste array para encontrar un hueco libre para introducir datos.
  * @param tipo usaremos éste parámetro para modificar el array <code>tipo</code>
  * @param precio usaremos éste parámetro para modificar el array <code>precio</code>
  * @param indice es el número introducizo por el usuario para escoger índice a modificar.
  */
    
    
  public static void modificaDatos(String marca[], String tipo[], double precio[]) {
    Scanner f = new Scanner(System.in);
    
    int indice = 0;
    boolean esVacio = false;
    
    while (!esVacio) {
      System.out.print("Por favor, introduzca el número de registro que desee modificar: ");
      indice = Integer.parseInt(f.nextLine());
      if (marca[indice] == "vacío") {
        System.out.println("\nEse registro está vacío, seleccione uno que ya contenga valores.");
      } else {
        esVacio = true;
      }
    }
    
    if (indice < marca.length) {
      System.out.print("Por favor introduzc la nueva marca: ");
      marca[indice - 1] = f.nextLine();
      System.out.println();
      System.out.print("Por favor introduzca el nuevo tipo: ");
      tipo[indice - 1] = f.nextLine();
      System.out.println();
      System.out.print("Por favor introduzca el precio: ");
      precio[indice - 1] = Double.parseDouble(f.nextLine());
      System.out.println();
      
      System.out.println();
      System.out.println("Se han añadido correctamente los nuevos valores.");
      System.out.println("Puede usted elegir la opción 1 del menú si desea visualiarlos.");
      System.out.println();
      System.out.println();
    } else {
      System.out.println();
      System.out.println("Lo siento, el registro introducido no existe.");
      System.out.println("Vuelva a elegir la opción 2 en el menú.");
      System.out.println();
      System.out.println();
    }
        
  }
  
  
  /**
  * Elimina / reinicializa los datos de un registro
  * @param marca eliminamos / reinicializamos el array <code>marca</code>.
  * @param tipo eliminamos / reinicializamos el array <code>tipo</code>.
  * @param precio eliminamos / reinicializamos el array <code>precio</code>.
  */
  
  public static void eliminaDatos(String marca[], String tipo[], double precio[]) {
    Scanner f = new Scanner(System.in);
      
    System.out.print("Por favor, introduzca el número de registro que desee eliminar: ");
    int indice = Integer.parseInt(f.nextLine());
      
    if (indice < marca.length) {
      marca[indice - 1] = "vacío";
      tipo[indice - 1] = "vacío";
      precio[indice - 1] = 0;
      
      System.out.println();
      System.out.println("Se han eliminado correctamente los datos señalados.\033[37m");
      System.out.println();
      System.out.println();
    } else {
      System.out.println();
      System.out.println("Lo siento, el registro introducido no existe.");
      System.out.println("Vuelva a elegir la opción 2 en el menú.");
      System.out.println();
      System.out.println();
    }
        
  }
  
}
