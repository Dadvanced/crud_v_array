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
    
    String[] marca = new String[50];
    double[] precio = new double[50];
    String[] tipo = new String[50];
    
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
      
      boolean opcionCorrecta = false; //comprueba si la opción escogida por el usuario es correcta
      while (!opcionCorrecta) {
        option = Integer.parseInt(n.nextLine());
        
        switch (option) {
          case 1:
          opcionCorrecta = true;
          
          break;
          
          case 2:
          opcionCorrecta = true;
          
          break;
          
          case 3:
          opcionCorrecta = true;
          
          break;
          
          case 4:
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
  
  ////////////FUNCIONES//////////7
  
  
}
    
    
    
    
