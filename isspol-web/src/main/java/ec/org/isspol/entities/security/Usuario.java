package ec.org.isspol.entities.security;


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by mauchilan on 20/3/17.
 */

public class Usuario implements Serializable {
    private int idUsuario;
    private String usuario;
    //private Integer idOficina;
    private String oficina;
    private String nombre;
    //private int idEstadoUsuario;
    private String estado;
    private String email;
    private byte[] clave;
    private Timestamp fechaUltCambPwd;
    private boolean cambiarPwdPrxLogon;
    private boolean noPuedeCambiarPwd;
    private boolean pwdNuncaExpira;
    private boolean bloqueada;
    private String identificacion;
    private boolean cualquierEstacion;
    private int tiempoInactividad;
    //private int idHorario;
    //private Integer idEstructura;
    private String usuarioSuperior;
    private int idDashboardInicio;
    private byte[] foto;
    private String cargo;
    private String creacionUsuario;
    private Timestamp creacionFecha;
    private String modificaUsuario;
    private Timestamp modificaFecha;
    private Collection<EstacionUsuario> estacionUsuariosByIdUsuario;
    private Collection<GrupoUsuario> grupoUsuariosByIdUsuario;
    private Collection<HistClave> histClavesByIdUsuario;
    private Collection<OpcionUso> opcionUsosByIdUsuario;
    private Collection<Permiso> permisosByIdUsuario;
    private Oficina oficinaByIdOficina;
    private EstadoUsuario estadoUsuarioByIdEstadoUsuario;
    private Horario horarioByIdHorario;
    private EstructuraOrganizacional estructuraOrganizacionalByIdEstructura;
    private Collection<UsuarioCambio> usuarioCambiosByIdUsuario;
    private Collection<UsuarioUbicacionGeografica> usuarioUbicacionGeograficasByIdUsuario;


    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /*@Basic
    @Column(name = "IdOficina", nullable = true)
    public Integer getIdOficina() {
        return idOficina;
    }

    public void setIdOficina(Integer idOficina) {
        this.idOficina = idOficina;
    }*/


    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*@Basic
    @Column(name = "IdEstadoUsuario", nullable = false)
    public int getIdEstadoUsuario() {
        return idEstadoUsuario;
    }

    public void setIdEstadoUsuario(int idEstadoUsuario) {
        this.idEstadoUsuario = idEstadoUsuario;
    }*/


    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public byte[] getClave() {
        return clave;
    }

    public void setClave(byte[] clave) {
        this.clave = clave;
    }


    public Timestamp getFechaUltCambPwd() {
        return fechaUltCambPwd;
    }

    public void setFechaUltCambPwd(Timestamp fechaUltCambPwd) {
        this.fechaUltCambPwd = fechaUltCambPwd;
    }


    public boolean isCambiarPwdPrxLogon() {
        return cambiarPwdPrxLogon;
    }

    public void setCambiarPwdPrxLogon(boolean cambiarPwdPrxLogon) {
        this.cambiarPwdPrxLogon = cambiarPwdPrxLogon;
    }


    public boolean isNoPuedeCambiarPwd() {
        return noPuedeCambiarPwd;
    }

    public void setNoPuedeCambiarPwd(boolean noPuedeCambiarPwd) {
        this.noPuedeCambiarPwd = noPuedeCambiarPwd;
    }


    public boolean isPwdNuncaExpira() {
        return pwdNuncaExpira;
    }

    public void setPwdNuncaExpira(boolean pwdNuncaExpira) {
        this.pwdNuncaExpira = pwdNuncaExpira;
    }


    public boolean isBloqueada() {
        return bloqueada;
    }

    public void setBloqueada(boolean bloqueada) {
        this.bloqueada = bloqueada;
    }


    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }


    public boolean isCualquierEstacion() {
        return cualquierEstacion;
    }

    public void setCualquierEstacion(boolean cualquierEstacion) {
        this.cualquierEstacion = cualquierEstacion;
    }


    public int getTiempoInactividad() {
        return tiempoInactividad;
    }

    public void setTiempoInactividad(int tiempoInactividad) {
        this.tiempoInactividad = tiempoInactividad;
    }

    /*@Basic
    @Column(name = "IdHorario", nullable = false)
    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }*/

    /*@Basic
    @Column(name = "IdEstructura", nullable = true)
    public Integer getIdEstructura() {
        return idEstructura;
    }

    public void setIdEstructura(Integer idEstructura) {
        this.idEstructura = idEstructura;
    }*/


    public String getUsuarioSuperior() {
        return usuarioSuperior;
    }

    public void setUsuarioSuperior(String usuarioSuperior) {
        this.usuarioSuperior = usuarioSuperior;
    }


    public int getIdDashboardInicio() {
        return idDashboardInicio;
    }

    public void setIdDashboardInicio(int idDashboardInicio) {
        this.idDashboardInicio = idDashboardInicio;
    }


    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    public String getCreacionUsuario() {
        return creacionUsuario;
    }

    public void setCreacionUsuario(String creacionUsuario) {
        this.creacionUsuario = creacionUsuario;
    }


    public Timestamp getCreacionFecha() {
        return creacionFecha;
    }

    public void setCreacionFecha(Timestamp creacionFecha) {
        this.creacionFecha = creacionFecha;
    }


    public String getModificaUsuario() {
        return modificaUsuario;
    }

    public void setModificaUsuario(String modificaUsuario) {
        this.modificaUsuario = modificaUsuario;
    }


    public Timestamp getModificaFecha() {
        return modificaFecha;
    }

    public void setModificaFecha(Timestamp modificaFecha) {
        this.modificaFecha = modificaFecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario1 = (Usuario) o;

        if (idUsuario != usuario1.idUsuario) return false;
        //if (idEstadoUsuario != usuario1.idEstadoUsuario) return false;
        if (cambiarPwdPrxLogon != usuario1.cambiarPwdPrxLogon) return false;
        if (noPuedeCambiarPwd != usuario1.noPuedeCambiarPwd) return false;
        if (pwdNuncaExpira != usuario1.pwdNuncaExpira) return false;
        if (bloqueada != usuario1.bloqueada) return false;
        if (cualquierEstacion != usuario1.cualquierEstacion) return false;
        if (tiempoInactividad != usuario1.tiempoInactividad) return false;
        //if (idHorario != usuario1.idHorario) return false;
        if (idDashboardInicio != usuario1.idDashboardInicio) return false;
        if (usuario != null ? !usuario.equals(usuario1.usuario) : usuario1.usuario != null) return false;
        //if (idOficina != null ? !idOficina.equals(usuario1.idOficina) : usuario1.idOficina != null) return false;
        if (oficina != null ? !oficina.equals(usuario1.oficina) : usuario1.oficina != null) return false;
        if (nombre != null ? !nombre.equals(usuario1.nombre) : usuario1.nombre != null) return false;
        if (estado != null ? !estado.equals(usuario1.estado) : usuario1.estado != null) return false;
        if (email != null ? !email.equals(usuario1.email) : usuario1.email != null) return false;
        if (!Arrays.equals(clave, usuario1.clave)) return false;
        if (fechaUltCambPwd != null ? !fechaUltCambPwd.equals(usuario1.fechaUltCambPwd) : usuario1.fechaUltCambPwd != null)
            return false;
        if (identificacion != null ? !identificacion.equals(usuario1.identificacion) : usuario1.identificacion != null)
            return false;
        //if (idEstructura != null ? !idEstructura.equals(usuario1.idEstructura) : usuario1.idEstructura != null)
            //return false;
        if (usuarioSuperior != null ? !usuarioSuperior.equals(usuario1.usuarioSuperior) : usuario1.usuarioSuperior != null)
            return false;
        if (!Arrays.equals(foto, usuario1.foto)) return false;
        if (cargo != null ? !cargo.equals(usuario1.cargo) : usuario1.cargo != null) return false;
        if (creacionUsuario != null ? !creacionUsuario.equals(usuario1.creacionUsuario) : usuario1.creacionUsuario != null)
            return false;
        if (creacionFecha != null ? !creacionFecha.equals(usuario1.creacionFecha) : usuario1.creacionFecha != null)
            return false;
        if (modificaUsuario != null ? !modificaUsuario.equals(usuario1.modificaUsuario) : usuario1.modificaUsuario != null)
            return false;
        if (modificaFecha != null ? !modificaFecha.equals(usuario1.modificaFecha) : usuario1.modificaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUsuario;
        result = 31 * result + (usuario != null ? usuario.hashCode() : 0);
        //result = 31 * result + (idOficina != null ? idOficina.hashCode() : 0);
        result = 31 * result + (oficina != null ? oficina.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        //result = 31 * result + idEstadoUsuario;
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(clave);
        result = 31 * result + (fechaUltCambPwd != null ? fechaUltCambPwd.hashCode() : 0);
        result = 31 * result + (cambiarPwdPrxLogon ? 1 : 0);
        result = 31 * result + (noPuedeCambiarPwd ? 1 : 0);
        result = 31 * result + (pwdNuncaExpira ? 1 : 0);
        result = 31 * result + (bloqueada ? 1 : 0);
        result = 31 * result + (identificacion != null ? identificacion.hashCode() : 0);
        result = 31 * result + (cualquierEstacion ? 1 : 0);
        result = 31 * result + tiempoInactividad;
        //result = 31 * result + idHorario;
        //result = 31 * result + (idEstructura != null ? idEstructura.hashCode() : 0);
        result = 31 * result + (usuarioSuperior != null ? usuarioSuperior.hashCode() : 0);
        result = 31 * result + idDashboardInicio;
        result = 31 * result + Arrays.hashCode(foto);
        result = 31 * result + (cargo != null ? cargo.hashCode() : 0);
        result = 31 * result + (creacionUsuario != null ? creacionUsuario.hashCode() : 0);
        result = 31 * result + (creacionFecha != null ? creacionFecha.hashCode() : 0);
        result = 31 * result + (modificaUsuario != null ? modificaUsuario.hashCode() : 0);
        result = 31 * result + (modificaFecha != null ? modificaFecha.hashCode() : 0);
        return result;
    }


    public Collection<EstacionUsuario> getEstacionUsuariosByIdUsuario() {
        return estacionUsuariosByIdUsuario;
    }

    public void setEstacionUsuariosByIdUsuario(Collection<EstacionUsuario> estacionUsuariosByIdUsuario) {
        this.estacionUsuariosByIdUsuario = estacionUsuariosByIdUsuario;
    }


    public Collection<GrupoUsuario> getGrupoUsuariosByIdUsuario() {
        return grupoUsuariosByIdUsuario;
    }

    public void setGrupoUsuariosByIdUsuario(Collection<GrupoUsuario> grupoUsuariosByIdUsuario) {
        this.grupoUsuariosByIdUsuario = grupoUsuariosByIdUsuario;
    }


    public Collection<HistClave> getHistClavesByIdUsuario() {
        return histClavesByIdUsuario;
    }

    public void setHistClavesByIdUsuario(Collection<HistClave> histClavesByIdUsuario) {
        this.histClavesByIdUsuario = histClavesByIdUsuario;
    }


    public Collection<OpcionUso> getOpcionUsosByIdUsuario() {
        return opcionUsosByIdUsuario;
    }

    public void setOpcionUsosByIdUsuario(Collection<OpcionUso> opcionUsosByIdUsuario) {
        this.opcionUsosByIdUsuario = opcionUsosByIdUsuario;
    }


    public Collection<Permiso> getPermisosByIdUsuario() {
        return permisosByIdUsuario;
    }

    public void setPermisosByIdUsuario(Collection<Permiso> permisosByIdUsuario) {
        this.permisosByIdUsuario = permisosByIdUsuario;
    }


    public Oficina getOficinaByIdOficina() {
        return oficinaByIdOficina;
    }

    public void setOficinaByIdOficina(Oficina oficinaByIdOficina) {
        this.oficinaByIdOficina = oficinaByIdOficina;
    }


    public EstadoUsuario getEstadoUsuarioByIdEstadoUsuario() {
        return estadoUsuarioByIdEstadoUsuario;
    }

    public void setEstadoUsuarioByIdEstadoUsuario(EstadoUsuario estadoUsuarioByIdEstadoUsuario) {
        this.estadoUsuarioByIdEstadoUsuario = estadoUsuarioByIdEstadoUsuario;
    }


    public Horario getHorarioByIdHorario() {
        return horarioByIdHorario;
    }

    public void setHorarioByIdHorario(Horario horarioByIdHorario) {
        this.horarioByIdHorario = horarioByIdHorario;
    }


    public EstructuraOrganizacional getEstructuraOrganizacionalByIdEstructura() {
        return estructuraOrganizacionalByIdEstructura;
    }

    public void setEstructuraOrganizacionalByIdEstructura(EstructuraOrganizacional estructuraOrganizacionalByIdEstructura) {
        this.estructuraOrganizacionalByIdEstructura = estructuraOrganizacionalByIdEstructura;
    }


    public Collection<UsuarioCambio> getUsuarioCambiosByIdUsuario() {
        return usuarioCambiosByIdUsuario;
    }

    public void setUsuarioCambiosByIdUsuario(Collection<UsuarioCambio> usuarioCambiosByIdUsuario) {
        this.usuarioCambiosByIdUsuario = usuarioCambiosByIdUsuario;
    }


    public Collection<UsuarioUbicacionGeografica> getUsuarioUbicacionGeograficasByIdUsuario() {
        return usuarioUbicacionGeograficasByIdUsuario;
    }

    public void setUsuarioUbicacionGeograficasByIdUsuario(Collection<UsuarioUbicacionGeografica> usuarioUbicacionGeograficasByIdUsuario) {
        this.usuarioUbicacionGeograficasByIdUsuario = usuarioUbicacionGeograficasByIdUsuario;
    }
}
