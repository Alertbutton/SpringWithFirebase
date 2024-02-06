package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class Ventana extends JFrame{
    private JButton btnGuardar;
    private JButton btnActualizar;
    private JButton btnEliminar;
    private JButton btnLimpiar;
    private JTable tlbPersona;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtEdad;
    private JTextField txtEmail;
    private JPanel miPanel;

    public Ventana(){
        this.setLocationRelativeTo(null);
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = 1;
                try {
                    Map<String, Object> datos = new HashMap<>();
                    datos.put("nombre",txtNombre.getText());
                    datos.put("apellido",txtApellido.getText());
                    datos.put("edad",txtEdad.getText());
                    datos.put("email",txtEmail.getText());
                    personaProvider.guardarPersona("persona",String.valueOf(id),datos);
                    JOptionPane.showMessageDialog(null,"Guardado con exito");

                } catch (Exception e1){
                    System.err.println("Error: "+ e1.getMessage());
                    JOptionPane.showMessageDialog(null,"Error al guardar");
                }
            }
        });
    }
}
