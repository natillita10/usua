public class Main{
    public static void main(String[]args){
        


        switch (opcion){
            case 1:
                System.out.print(".(ID: )");
                int id =sc.nextInt();
                sc.nextLine();
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                System.out.println("Email: ");
                String email = sc.nextLine();
                crud.crearUsuario(new Usuario(id, nombre, email)
                break;
        }
    }
}