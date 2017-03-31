package ec.org.isspol.web.seguridades;

import ec.org.isspol.persistence.entities.security.EstadoUsuario;
import ec.org.isspol.persistence.entities.security.Horario;
import ec.org.isspol.persistence.entities.security.OficinaSucursal;
import ec.org.isspol.route.client.UsuarioServiceClient;
import ec.org.isspol.route.client.context.ApplicartionContext;
import ec.org.isspol.persistence.entities.security.Usuario;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by santiago.yacelga on 29/03/2017.
 */
public class UsuarioDWR implements Serializable {


    public Usuario guardar(Usuario usuario){
        usuario.setNombre("Hola soy un nuevo usuario");
        return usuario;
    };

    public List<Horario> obtenerHorarios (){
        UsuarioServiceClient client = (UsuarioServiceClient) ApplicartionContext.getBean("usuarioServiceClient");
        List<Horario> lstHorarios = client.getAllHorario();
        return lstHorarios;
    };

    public Map<String, Object> obtenerCargos(){
        UsuarioServiceClient cargos = (UsuarioServiceClient) ApplicartionContext.getBean("usuarioServiceClient");
        Map<String, Object> mapCargos = cargos.getAllCargo();
        return mapCargos;
    }

    public List<EstadoUsuario> obtenerEstados (){
        UsuarioServiceClient client = (UsuarioServiceClient) ApplicartionContext.getBean("usuarioServiceClient");
        List<EstadoUsuario> lstEstadosUsuario = client.getAllEstadoUsuario();
        return lstEstadosUsuario;
    }

    public List<OficinaSucursal> obtenerOficinasSucursales(){
        UsuarioServiceClient client = (UsuarioServiceClient) ApplicartionContext.getBean("usuarioServiceClient");
        List<OficinaSucursal> lstOficinasSucursal = client.getAllOficinaSucursal();
        return lstOficinasSucursal;
    }
}
