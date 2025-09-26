import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Menu();
    }

    //MENU

    public static void Menu() {

        Scanner menu = new Scanner(System.in);
        Scanner datos = new Scanner(System.in);
        List<Libro> lstLista = new ArrayList<>();


        int opcion;
        do {
            Libro L1 = new Libro();
            System.out.println("1. Agregar libro");
            System.out.println("2. listar libros");
            System.out.println("3. buscar libro");
            System.out.println("4. prestar libro");
            System.out.println("5. devolver libro");
            System.out.println("6. Eliminar libro");
            System.out.println("7. Salir");


            opcion = menu.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el id del libro");
                    L1.setId(datos.nextInt());
                    System.out.println("Ingrese el titulo del libro");
                    L1.setTitulo(datos.next());
                    System.out.println("Ingrese el Autor");
                    L1.setAutor(datos.next());
                    System.out.println("Ingrese la cantidad que desea ingresar");
                    L1.setCantidad(datos.nextInt());
                    lstLista.add(L1);
                    break;

                case 2:
                    for (Libro l : lstLista) {
                        System.out.println(l);
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el ID del libro a buscar: ");
                    int idBuscar = datos.nextInt();
                    for (Libro l : lstLista) {
                        if (l.getId() == idBuscar) {
                            System.out.println("Libro encontrado: " + l);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el ID del libro a prestar: ");
                    int idPrestar = datos.nextInt();
                    for (Libro l : lstLista) {
                        if (l.getId() == idPrestar) {
                            if (l.getCantidad() > 0) {
                                l.setCantidad(l.getCantidad() - 1);
                                System.out.println("Se prestó el libro: " + l.getTitulo());
                            } else {
                                System.out.println("No hay ejemplares disponibles.");
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Ingrese el ID del libro que desea devolver");
                    int idDevolver = datos.nextInt();
                    for (Libro l : lstLista) {
                        if (l.getId() == idDevolver) {
                            if (l.getCantidad() > 0) {
                                l.setCantidad(l.getCantidad() + 1);
                                System.out.println("Se devolvio el libro: "  + l.getTitulo());
                            }
                        }
                    }
                    break;
            }
        }
            while (opcion != 5);


    }
}

