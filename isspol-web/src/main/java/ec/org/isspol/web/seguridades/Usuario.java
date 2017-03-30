package ec.org.isspol.web.seguridades;

import ec.org.isspol.persistence.entities.security.Horario;
import ec.org.isspol.persistence.entities.security.OficinaSucursal;
import ec.org.isspol.route.client.UsuarioServiceClient;
import ec.org.isspol.route.client.context.ApplicartionContext;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by santiago.yacelga on 29/03/2017.
 */
public class Usuario implements Serializable {

    public List<Horario> obtenerHorarios (){
        UsuarioServiceClient client = (UsuarioServiceClient) ApplicartionContext.getBean("usuarioServiceClient");
        List<Horario> lstHorarios = client.getAllHorario();
        return lstHorarios;
    };


}
