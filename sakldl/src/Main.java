import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String args[]){

        var consola = new Scanner(System.in);


        List<String> listaCaracteres = new ArrayList<String>(){};
        String caracter = "";

        for (int i =1 ; i <= 5; i++){

            if (listaCaracteres.contains(caracter)){
                System.out.println("El caracter ya existe asi que no se agregara");

            }else{
                listaCaracteres.add(caracter);
                System.out.println("el caracter se ha agregado correctamente a la lista");
            }
            System.out.println("Ingresa un caracter: ");
            caracter =consola.nextLine();






        }
        System.out.println("lista de caracteres: ");
        listaCaracteres.stream().forEach(System.out::println);

    }
}

