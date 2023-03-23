package com.example.aviles_gomez_parcial_2;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aviles_gomez_parcial_2.entity.Empleado;
import com.example.aviles_gomez_parcial_2.entity.EmpleadosAdapter;

import java.util.ArrayList;
import java.util.List;

public class ListaDatos extends AppCompatActivity {

    private List<Empleado> listaEmpleado;
    private ListView lvData;

    public ListaDatos(){
        this.listaEmpleado = new ArrayList<>();

        this.listaEmpleado.add(new Empleado("Alexander Pierrot", "CEO", "Insures S.O.", R.drawable.lead_photo_1));
        this.listaEmpleado.add(new Empleado("Carlos Lopez", "Asistente", "Hospital Blue", R.drawable.lead_photo_2));
        this.listaEmpleado.add(new Empleado("Sara Bonz", "Directora de Marketing", "Electrical Parts Itd", R.drawable.lead_photo_3));
        this.listaEmpleado.add(new Empleado("Liliana Clarence", "Diseñadora de Producto", "Creativa App", R.drawable.lead_photo_4));
        this.listaEmpleado.add(new Empleado("Benito Peralta", "Supervisor de ventas", "Neumáticos Press", R.drawable.lead_photo_5));
        this.listaEmpleado.add(new Empleado("Juan Jaramillo", "CEO", "Banco Nacional", R.drawable.lead_photo_6));
        this.listaEmpleado.add(new Empleado("Christian Steps", "CTO", "Cooperativa Verde", R.drawable.lead_photo_7));
        this.listaEmpleado.add(new Empleado("Alexa Giraldo", "Lead Programmer", "Flutisofy", R.drawable.lead_photo_8));
        this.listaEmpleado.add(new Empleado("Linda Murillo", "Directora de Marketing", "Seguros Boliver", R.drawable.lead_photo_9));
        this.listaEmpleado.add(new Empleado("Lizeth Astrada", "CEO", "Concesionario Motolox", R.drawable.lead_photo_10));
        this.listaEmpleado.add(new Empleado("Janeth Gomez", "CEO", "Delivery-go", R.drawable.lead_photo_11));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_empleados);
        this.lvData = findViewById(R.id.lvData);

        EmpleadosAdapter ea = new EmpleadosAdapter(this, (ArrayList<Empleado>) this.listaEmpleado);

        this.lvData.setAdapter(ea);
    }
}
