package com.empleado.main.empleado;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class EmpleadoController {
	
	@Autowired
	private EmpleadoService empleadoService;

	@RequestMapping("/empleado")
	public List<Empleado> getAllEmpleados() {
		return 	empleadoService.getAllEmpleados();
	}
	
	@RequestMapping("/empleado/{id}")
	public Optional<Empleado> getEmpleado(@PathVariable long id) {
		return  empleadoService.getEmpleado(id);
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value="/empleado")
	public void addEmpleado(@RequestBody Empleado empleado) {
		empleadoService.addEmpleado(empleado);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/empleado/{id}")
	public void updateEmpleado(@RequestBody Empleado empleado, @PathVariable String id) {
		empleadoService.updateEmpleado(id, empleado);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/empleado/{id}")
	public void deleteEmpleado(@PathVariable long id) {
		empleadoService.deleteEmpleado(id);
	}
	
	
}
