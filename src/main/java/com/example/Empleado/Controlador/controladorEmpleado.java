package com.example.Empleado.Controlador;
import com.example.Empleado.Empleado.Empleado;
import org.springframework.web.bind.annotation.*;
import com.example.Empleado.Servicios.servicioEmpleado;

import java.util.ArrayList;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class controladorEmpleado {

    servicioEmpleado servicio= new servicioEmpleado();

    @GetMapping("/listarEmpleados")
    public ArrayList<Empleado> listar(){return servicio.listar();}


    @DeleteMapping("/eliminarEmpleado/{cargo}")
    public String eliminarEmpleado(@PathVariable("cargo") String cargo){
        return servicio.eliminarEmpleado(cargo);
    }

}
