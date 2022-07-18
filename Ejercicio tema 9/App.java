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

    /*Aqui creamos la clase cliente la cual hereda varios atributos de la clase Persona */
    static class Cliente extends Persona{
        private int credito;

        public void setCredito(int credito){
            this.credito = credito;
        }
        public int getCredito(){
            return this.credito;
        }
    }

    /*La clase trabajador tambien hereda de Persona */
    static class Trabajador extends Persona{
        private int salario;

        public void setSalario(int salario){
            this.salario = salario;
        }
        public int getSalario(){
            return this.salario;
        }
    }


    public static void main(String[] args){

        /*Creamos y damos valores a nuesto objeto Cliente */
        Cliente NuevoCliente = new Cliente();
        NuevoCliente.setNombre("Alberto Cardenas");
        NuevoCliente.setEdad(23);
        NuevoCliente.setTelefono("1234567890");
        NuevoCliente.setCredito(20000);

        System.out.println(NuevoCliente.getNombre());
        System.out.println(NuevoCliente.getEdad());
        System.out.println(NuevoCliente.getTelefono());
        System.out.println(NuevoCliente.getCredito());

        /*Creamos y damos valores al objeto trabajador que creamos */
        Trabajador NuevoTrabajador = new Trabajador();
        NuevoTrabajador.setNombre("Roman Reyes");
        NuevoTrabajador.setEdad(25);
        NuevoTrabajador.setTelefono("0987654321");
        NuevoTrabajador.setSalario(50000);

        System.out.println(NuevoTrabajador.getNombre());
        System.out.println(NuevoTrabajador.getEdad());
        System.out.println(NuevoTrabajador.getTelefono());
        System.out.println(NuevoTrabajador.getSalario());

    }
}
