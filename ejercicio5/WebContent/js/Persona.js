function Persona(_nombre, _apellido, _fechaNacimiento, _sexo) {
	var id;
	var nombre = _nombre;
	var apellido = _apellido; 
	var fechaNacimiento = _fechaNacimiento;
	var sexo = _sexo;

	this.setId = function(i) {
		id = i;
	};
	this.getId = function() {
		return id;
	};
	this.setNombre = function(n) {
		nombre = n;
	};
	this.getNombre = function() {
		return nombre;
	};
	this.setApellido = function(a) {
		apellido = a;
	};
	this.getApellido = function() {
		return apellido;
	};
	this.setFechaNacimiento = function(fn) {
		fechaNacimiento = fn;
	};
	this.getFechaNacimiento = function() {
		return fechaNacimiento;
	};
	this.setSexo = function(s) {
		sexo = s;
	};
	this.getSexo = function() {
		return sexo;
	};
	this.toString = function() {
		return "[ id = " + id + 
			", nombre = " + nombre + 
			", apellido = " + apellido + 
			", fechaNacimiento = " + fechaNacimiento + 
			", sexo = " + sexo + " ]";
	};
}
