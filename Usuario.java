public class Usuario{
private int id;
private String name;
private String email;
public int getId(){
    return id;
}
public String setNombre(String nuevoNombre){
    return name;
}
public String setEmail(String nuevoEmail){
    this.email = nuevoEmail;
    return email;
}
public Usuario(int id, String nombre, String email){
    this.id=id;
    this.name=name;
    this.email=email;
}
@Override
public String toString(){
    return("id: "+id+ "name: "+ name +"email: " +email);
}
}

