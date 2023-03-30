package com.example.Empleado.Servicios;

import com.example.Empleado.Empleado.Empleado;

import java.util.ArrayList;

public class servicioEmpleado {


ArrayList<Empleado> lista=new ArrayList<>();


    public servicioEmpleado(){
        lista.add(new Empleado(1011153,"julian","ospina","jefe",100000.0f,new int[]{1, 3, 1},new int[]{1, 3, 1},new int[]{1, 3, 1}));
        lista.add(new Empleado(1564654,"julia","uribe","contratista",100000.0f,new int[]{1, 3, 1},new int[]{1, 3, 1},new int[]{1, 3, 1}));
        lista.add(new Empleado(1556434,"juan","unibio","ayudante",100000.0f,new int[]{1, 3, 1},new int[]{1, 3, 1},new int[]{1, 3, 1}));
        lista.add(new Empleado(1477684,"juana","alimaña","jefe de maquinaria",100000.0f,new int[]{1, 3, 1},new int[]{1, 3, 1},new int[]{1, 3, 1}));
        lista.add(new Empleado(2651611,"julio","tocasucha","secretario",100000.0f,new int[]{1, 3, 1},new int[]{1, 3, 1},new int[]{1, 3, 1}));

    }

    public ArrayList<Empleado> listar(){
        return lista;
    }

}
