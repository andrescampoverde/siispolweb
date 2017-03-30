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
 * TipoOficina generated by hbm2java
 */
@Entity
@Table(name = "tipo_oficina", schema = "seguridad", catalog = "siisspolweb")
public class TipoOficina implements java.io.Serializable {

	private int idTipoOficina;
	private String nombre;
	private String creacionUsuario;
	private Date creacionFecha;
	private String creacionEquipo;
	private String modificaUsuario;
	private Date modificaFecha;
	private String modificaEquipo;
	private Set<Oficina> oficinas = new HashSet<Oficina>(0);

	public TipoOficina() {
	}

	public TipoOficina(int idTipoOficina, String creacionUsuario, Date creacionFecha, String creacionEquipo,
			String modificaUsuario, Date modificaFecha, String modificaEquipo) {
		this.idTipoOficina = idTipoOficina;
		this.creacionUsuario = creacionUsuario;
		this.creacionFecha = creacionFecha;
		this.creacionEquipo = creacionEquipo;
		this.modificaUsuario = modificaUsuario;
		this.modificaFecha = modificaFecha;
		this.modificaEquipo = modificaEquipo;
	}

	public TipoOficina(int idTipoOficina, String nombre, String creacionUsuario, Date creacionFecha,
			String creacionEquipo, String modificaUsuario, Date modificaFecha, String modificaEquipo,
			Set<Oficina> oficinas) {
		this.idTipoOficina = idTipoOficina;
		this.nombre = nombre;
		this.creacionUsuario = creacionUsuario;
		this.creacionFecha = creacionFecha;
		this.creacionEquipo = creacionEquipo;
		this.modificaUsuario = modificaUsuario;
		this.modificaFecha = modificaFecha;
		this.modificaEquipo = modificaEquipo;
		this.oficinas = oficinas;
	}

	@Id

	@Column(name = "id_tipo_oficina", unique = true, nullable = false)
	public int getIdTipoOficina() {
		return this.idTipoOficina;
	}

	public void setIdTipoOficina(int idTipoOficina) {
		this.idTipoOficina = idTipoOficina;
	}

	@Column(name = "nombre", length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoOficina")
	public Set<Oficina> getOficinas() {
		return this.oficinas;
	}

	public void setOficinas(Set<Oficina> oficinas) {
		this.oficinas = oficinas;
	}

}
