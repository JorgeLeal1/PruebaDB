package cl.clases.pruebadb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.clases.pruebadb.dao.PruebaDao;

@Controller
@RequestMapping("/prueba")
public class PruebaDBController {

	@Autowired
	private PruebaDao pruebaDao;
	
	@GetMapping("/hola")
	
	//creando metodo, devuelve respuesta 200
	private ResponseEntity<String> hola(){
		pruebaDao.insertar("Jorge");
		return new ResponseEntity<String>("ok", HttpStatus.OK);
	}
	
}
