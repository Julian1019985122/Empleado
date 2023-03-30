package com.example.Empleado.Servicios;

import com.example.Empleado.Empleado.Empleado;

import java.util.ArrayList;

public class servicioEmpleado {


ArrayList<Empleado> lista=new ArrayList<>();


    public servicioEmpleado(){
        lista.add(new Empleado(1011153,"julian","ospina","jefe",100000.0f,new int[]{1, 3, 1},new int[]{1, 3, 1},new int[]{100000, 3000, 10000}));
        lista.add(new Empleado(1564654,"julia","uribe","contratista",100000.0f,new int[]{1, 3, 1},new int[]{1, 3, 1},new int[]{1000, 3822, 84652}));
        lista.add(new Empleado(1556434,"juan","unibio","ayudante",100000.0f,new int[]{1, 3, 1},new int[]{1, 3, 1},new int[]{4895, 46952, 3251}));
        lista.add(new Empleado(1477684,"juana","alimaña","jefe de maquinaria",100000.0f,new int[]{1, 3, 1},new int[]{1, 3, 1},new int[]{5846, 89563, 8745}));
        lista.add(new Empleado(2651611,"julio","tocasucha","secretario",100000.0f,new int[]{1, 3, 1},new int[]{1, 3, 1},new int[]{9856, 7811, 17871}));

    }

    public ArrayList<Empleado> listar(){
        return lista;
    }


    public String eliminarEmpleado(String cargo){
        String valor="No se encontró este Empleado";

        for (Empleado emp:lista){
            if (emp.getCargo().equals(cargo)){
                lista.remove(emp);
                valor="Empleado eliminado con exito";
            }
        }
        return valor;
    }


    public String total_ventas(){

        int venta1 = 0;
        int venta2 = 0;
        int venta3 = 0;
        int venta4 = 0;
        int venta5 = 0;
        double vent_final = 0;



        for (int i = 0; i < lista.size(); i++){
            venta1 = lista.get(1).getVentas()[0]+lista.get(1).getVentas()[1]+lista.get(1).getVentas()[2];
            venta2 = lista.get(1).getVentas()[0]+lista.get(1).getVentas()[1]+lista.get(1).getVentas()[2];
            venta3 = lista.get(1).getVentas()[0]+lista.get(1).getVentas()[1]+lista.get(1).getVentas()[2];
            venta4 = lista.get(1).getVentas()[0]+lista.get(1).getVentas()[1]+lista.get(1).getVentas()[2];
            venta5 = lista.get(1).getVentas()[0]+lista.get(1).getVentas()[1]+lista.get(1).getVentas()[2];



            vent_final=venta1;
            vent_final=venta2;
            vent_final=venta3;
            vent_final=venta4;
            vent_final=venta5;

            String respuesta = "";


            if (vent_final>vent_final){
                respuesta = "Proceso realizado con exito";
            }else{
                respuesta = "Proceso realizado sin exito";
            }

            return respuesta;




    }

    }
}
