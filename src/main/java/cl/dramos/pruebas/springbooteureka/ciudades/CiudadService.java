package cl.dramos.pruebas.springbooteureka.ciudades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CiudadService {
	
	@Autowired
	private CiudadesRepository ciudadesRepositorio;
	
	@GetMapping ("/ciudades")
	public List<Ciudad> obtenerCiudades(){
		return this.ciudadesRepositorio.findAll();
	}
	
	@PostMapping("/ciudades")
	public Ciudad crearCiudad(@RequestBody Ciudad ciudad) {
		return this.ciudadesRepositorio.save(ciudad);
	}

}
