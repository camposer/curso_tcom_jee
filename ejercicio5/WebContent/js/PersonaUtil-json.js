function PersonaUtil() {
	var personas = [];
	var contador = 1;
	
	this.agregar = function(p) {
		p.id = contador++;
		personas[personas.length] = p; 
	};
	
	this.obtenerTodos = function() {
		return personas;
	};

	var obtenerPos = function(id) {
		for (var i in personas)
			if (personas[i].id == id)
				return i;
	};
	
	this.obtener = function(id) {
		var pos = obtenerPos(id);
		if (pos) 
			return personas[pos];
	};
	
	this.modificar = function(p) {
		var pos = obtenerPos(p.id);
		if (pos) 
			personas[pos] = p;
	};

	this.eliminar = function(id) {
		var pos = obtenerPos(id);
		if (pos) 
			personas.splice(pos, 1);
	};

}

