public class App {
    /*Dentro de App debemos meter todo lo que queremos compilar */

    /*Aqui creamos nuestra clase Persona */
    static class Persona{
        private int edad;
        private String nombre;
        private String telefono;

        /*Gets y sets para la edad */
        public void setEdad(int edad){
            this.edad = edad;
        }
        public int getEdad(){
            return this.edad;
        }

        /*Gets y sets para el nombre */
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public String getNombre(){
            return this.nombre;
        }

        /*Gets y sets para el telefono */
        public void setTelefono(String telefono){
            this.telefono = telefono;
        }
        public String getTelefono(){
            return this.telefono;
        }

    }
    public static void main(String[] args){
        /*Creamos uno bjeto llamado Yo */
        Persona Yo = new Persona();

        /*Le damos valor a cada parametro */
        Yo.setEdad(27);
        Yo.setNombre("Alejandro");
        Yo.setTelefono("1234567890");

        /*Imprimimos cada propiedad */
        System.out.println(Yo.getEdad());
        System.out.println(Yo.getNombre());
        System.out.println(Yo.getTelefono());
    }
}
