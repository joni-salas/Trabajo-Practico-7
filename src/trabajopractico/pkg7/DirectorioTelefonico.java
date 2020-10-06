
package trabajopractico.pkg7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DirectorioTelefonico {
    private TreeMap<Long, Cliente> listaClientes = new TreeMap<>();
    
    
    public void agregarCliente(long tel, Cliente cliente){
        if(listaClientes.containsKey(tel)){
            System.out.println("No pudo agregar el cliente, El numero ya esta registrado.");}
        else{
            listaClientes.put(tel, cliente);
            System.out.println("Cliente agregado.");}
    }
    
    public Cliente buscarCliente(long tel){
        if(listaClientes.get(tel)==null)
            return null;
        else{
            return listaClientes.get(tel);} 
    }
    
    public Set<Long> buscarTelefono(String apellido) {
        Set<Long> nTel = new HashSet<>();
       /* for(Map.Entry<Long,Cliente> cl: listaClientes.entrySet()){
            long clave = cl.getKey();
            String ape = cl.getValue().getApellido();  // otra forma de buscar telefono, donde obtengo clave y valor.
            if(apellido.equals(ape)){
                nTel.add(clave);
            }
        }*/
         for(Long cl: listaClientes.keySet()){
            String ape = listaClientes.get(cl).getApellido();
            if(apellido.equals(ape)){
                nTel.add(cl);
            }
        }
        return nTel;
    }
    
    public List <Cliente> buscarClientes(String ciudad){
        List <Cliente> clientes = new ArrayList<Cliente>();

        for(Long cl: listaClientes.keySet()){
            String ciu = listaClientes.get(cl).getCiudad();
            if(ciu.equals(ciudad))
                clientes.add(listaClientes.get(cl));
        }
        
        return clientes;
    }
    
    public void borrarCliente(long dni){    
        Iterator<Cliente> it = listaClientes.values().iterator();
        
        while (it.hasNext()) {
            Cliente nombre= it.next();
            long documento = nombre.getDni();
            if(documento == dni) {
                System.out.println("Cliente "+ nombre.toString()+ " borrado");
                it.remove();}
        }
    } 
}
