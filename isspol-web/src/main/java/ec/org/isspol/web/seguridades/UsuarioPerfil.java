package ec.org.isspol.web.seguridades;


import ec.org.isspol.persistence.entities.security.OficinaSucursal;
import ec.org.isspol.route.client.UsuarioServiceClient;
import ec.org.isspol.route.client.context.ApplicartionContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by santiago.yacelga on 27/03/2017.
 */
public class UsuarioPerfil {

    public List<OficinaSucursal> obtenerOficinasSucursales (Usuario usuario){
        List<OficinaSucursal> lstTest = new ArrayList<>();
      //  lstTest.add(oficinaSucursal);

        OficinaSucursal oficina = new OficinaSucursal("001","Latacunga","002","Pruebas");

        lstTest.add(oficina);

        oficina = new OficinaSucursal("002","Latacunga2","002","Pruebaws");
        lstTest.add(oficina);

        System.out.println("HOLA");
        UsuarioServiceClient client = (UsuarioServiceClient) ApplicartionContext.getBean("usuarioServiceClient");
        List<OficinaSucursal> oficinaSucursals = client.getAllOficinaSucursal();
        return oficinaSucursals;
    };
}
