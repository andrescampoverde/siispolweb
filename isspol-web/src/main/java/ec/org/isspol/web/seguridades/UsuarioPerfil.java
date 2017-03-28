package ec.org.isspol.web.seguridades;

import ec.org.isspol.entities.security.OficinaSucursal;
import ec.org.isspol.route.client.UsuarioServiceClient;

import java.util.List;

/**
 * Created by santiago.yacelga on 27/03/2017.
 */
public class UsuarioPerfil {

    public List<OficinaSucursal> obtenerOficinasSucursales (){
        System.out.println("Hiol");
//        UsuarioServiceClient client = (UsuarioServiceClient) ApplicartionContext.getBean("usuarioServiceClient");
//        List<OficinaSucursal> oficinaSucursals = client.getAllOficinaSucursal();
//        return oficinaSucursals;
        return null;
    };
}
