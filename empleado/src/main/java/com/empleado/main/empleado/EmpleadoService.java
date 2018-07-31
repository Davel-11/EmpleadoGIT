package com.empleado.main.empleado;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class EmpleadoService {
	
	@Autowired
	EmpleadoRepository empleadoRepository;
	
	public List<Empleado> getAllEmpleados(){		
		List<Empleado> empleado = new ArrayList<>();
		empleadoRepository.findAll().forEach(empleado::add);
		return empleado;
	}
	
	public Optional<Empleado> getEmpleado(Long id) {		
		return empleadoRepository.findById(id);
		
	}
	
	public void addEmpleado(Empleado empleado) {
		empleadoRepository.save(empleado);
	}
	
	public void updateEmpleado(String id, Empleado empleado) {
		empleadoRepository.save(empleado);
	}
	
	public void deleteEmpleado(long id) {
		empleadoRepository.deleteById(id);
	}
	
	
	

}
