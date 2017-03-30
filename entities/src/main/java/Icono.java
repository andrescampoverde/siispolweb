// default package
// Generated 30-mar-2017 11:07:53 by Hibernate Tools 5.2.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Icono generated by hbm2java
 */
@Entity
@Table(name = "icono", schema = "seguridad", catalog = "siisspolweb")
public class Icono implements java.io.Serializable {

	private int idIcono;
	private String icono;
	private String creacionUsuario;
	private Date creacionFecha;
	private String creacionEquipo;
	private String modificaUsuario;
	private Date modificaFecha;
	private String modificaEquipo;
	private Set<CarpetaOpcion> carpetaOpcions = new HashSet<CarpetaOpcion>(0);
	private Set<Opcion> opcions = new HashSet<Opcion>(0);

	public Icono() {
	}

	public Icono(int idIcono, String icono, String creacionUsuario, Date creacionFecha, String creacionEquipo,
			String modificaUsuario, Date modificaFecha, String modificaEquipo) {
		this.idIcono = idIcono;
		this.icono = icono;
		this.creacionUsuario = creacionUsuario;
		this.creacionFecha = creacionFecha;
		this.creacionEquipo = creacionEquipo;
		this.modificaUsuario = modificaUsuario;
		this.modificaFecha = modificaFecha;
		this.modificaEquipo = modificaEquipo;
	}

	public Icono(int idIcono, String icono, String creacionUsuario, Date creacionFecha, String creacionEquipo,
			String modificaUsuario, Date modificaFecha, String modificaEquipo, Set<CarpetaOpcion> carpetaOpcions,
			Set<Opcion> opcions) {
		this.idIcono = idIcono;
		this.icono = icono;
		this.creacionUsuario = creacionUsuario;
		this.creacionFecha = creacionFecha;
		this.creacionEquipo = creacionEquipo;
		this.modificaUsuario = modificaUsuario;
		this.modificaFecha = modificaFecha;
		this.modificaEquipo = modificaEquipo;
		this.carpetaOpcions = carpetaOpcions;
		this.opcions = opcions;
	}

	@Id

	@Column(name = "id_icono", unique = true, nullable = false)
	public int getIdIcono() {
		return this.idIcono;
	}

	public void setIdIcono(int idIcono) {
		this.idIcono = idIcono;
	}

	@Column(name = "icono", nullable = false, length = 50)
	public String getIcono() {
		return this.icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}

	@Column(name = "creacion_usuario", nullable = false, length = 20)
	public String getCreacionUsuario() {
		return this.creacionUsuario;
	}

	public void setCreacionUsuario(String creacionUsuario) {
		this.creacionUsuario = creacionUsuario;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creacion_fecha", nullable = false, length = 23)
	public Date getCreacionFecha() {
		return this.creacionFecha;
	}

	public void setCreacionFecha(Date creacionFecha) {
		this.creacionFecha = creacionFecha;
	}

	@Column(name = "creacion_equipo", nullable = false, length = 20)
	public String getCreacionEquipo() {
		return this.creacionEquipo;
	}

	public void setCreacionEquipo(String creacionEquipo) {
		this.creacionEquipo = creacionEquipo;
	}

	@Column(name = "modifica_usuario", nullable = false, length = 20)
	public String getModificaUsuario() {
		return this.modificaUsuario;
	}

	public void setModificaUsuario(String modificaUsuario) {
		this.modificaUsuario = modificaUsuario;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modifica_fecha", nullable = false, length = 23)
	public Date getModificaFecha() {
		return this.modificaFecha;
	}

	public void setModificaFecha(Date modificaFecha) {
		this.modificaFecha = modificaFecha;
	}

	@Column(name = "modifica_equipo", nullable = false, length = 20)
	public String getModificaEquipo() {
		return this.modificaEquipo;
	}

	public void setModificaEquipo(String modificaEquipo) {
		this.modificaEquipo = modificaEquipo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "icono")
	public Set<CarpetaOpcion> getCarpetaOpcions() {
		return this.carpetaOpcions;
	}

	public void setCarpetaOpcions(Set<CarpetaOpcion> carpetaOpcions) {
		this.carpetaOpcions = carpetaOpcions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "icono")
	public Set<Opcion> getOpcions() {
		return this.opcions;
	}

	public void setOpcions(Set<Opcion> opcions) {
		this.opcions = opcions;
	}

}
