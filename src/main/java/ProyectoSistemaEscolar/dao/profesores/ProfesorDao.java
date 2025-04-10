package ProyectoSistemaEscolar.dao.profesores;

public class ProfesorDao {
        private int id_profesor;
	private String nombres;
	private String apellido_paterno;
        private String apellido_materno;
	private int telefono;
	private String correo;

	public ProfesorDao() {
		id_profesor = 0;
		nombres = "";
		apellido_paterno = "";
                apellido_materno = "";
		telefono = 0;
		correo = "";
	}

	public ProfesorDao crearObjeto(int id, String[] datos, int tel) {
		ProfesorDao cliente = new ProfesorDao();
		cliente.id_profesor = id;
		cliente.nombres = datos[0];
		cliente.apellido_paterno = datos[1];
                cliente.apellido_materno = datos[2];
		cliente.telefono = tel;
		cliente.correo = datos[3];
		return cliente;
	}

	// Getters y Setters
	public int getId_profesor() {
		return id_profesor;
	}

	public void setId_profesor(int id_profesor) {
		this.id_profesor = id_profesor;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellido_paterno() {
		return apellido_paterno;
	}

	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

        public String getApellido_materno() {
		return apellido_materno;
	}

	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}    
        
	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(String[] telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
}
