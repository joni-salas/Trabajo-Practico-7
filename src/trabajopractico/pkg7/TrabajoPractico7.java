
package trabajopractico.pkg7;

public class TrabajoPractico7 {

    public static void main(String[] args) {
        DirectorioTelefonico dt = new DirectorioTelefonico();
        dt.agregarCliente(266503321, new Cliente("juan","rodriguez", "san luis","la punta",40595561));
        dt.agregarCliente(12, new Cliente("roberto","pascual", "san luis","merlo",40595561));
        dt.agregarCliente(20, new Cliente("jorge","lolo", "san luis","la punta",40595561));
        dt.agregarCliente(26, new Cliente("eze","lolo", "san luis","la punta",4059556));
        dt.agregarCliente(26, new Cliente("dani","mendez", "san luis","la punta",4059556));
        
        //busco cliente por numero de telefono(clave)
        System.out.println(dt.buscarCliente(266503321));
        //busco cliente por numero de telefono(clave)
        System.out.println(dt.buscarCliente(12));
        
        //muestro los telefonos registrados a nombre del apellido "lolo"
        System.out.println(dt.buscarTelefono("lolo"));
        
        //muestro los clientes que hay en la ciudad de san luis
        System.out.println(dt.buscarClientes("san luis"));
        //borro los clientes con el dni 40595561
        dt.borrarCliente(40595561);
        //vuelvo a mostrar los clientes que hay en san luis, solo muestra 1 por que los demas fueron borrados.
        System.out.println(dt.buscarClientes("san luis"));
        
        //devuelve null por que elimine el cliente.
        System.out.println(dt.buscarCliente(12));
    }
    
}
