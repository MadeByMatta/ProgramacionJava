package Inventarios;

import javax.swing.JOptionPane;

public class Uso_Inventarios {

	public static void main(String[] args) {
		
		int numProductos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos hay en el inventario?"));
	
        
        Inventario[] inventario = new Inventario[numProductos];

        
        for (int i = 0; i < numProductos; i++) {
           Inventario producto = new Inventario();

            producto.setNombre(JOptionPane.showInputDialog("Producto " + (i + 1) + ":"));
            producto.setCantidad(Integer.parseInt(JOptionPane.showInputDialog("Cantidad del producto " + (i + 1) + ":")));
            producto.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Precio del producto " + (i + 1) + ":")));

            inventario[i] = producto;
        }
        
        String resInv = "INVENTARIO \n";
        
        
        for (int i = 0; i < numProductos; i++) {
        	resInv += "Producto " + (i + 1) + ":"+
        "\nNombre: " + inventario[i].getNombre()+
        "\nCantidad: " + inventario[i].getCantidad()+
        "\nPrecio: " + inventario[i].getPrecio()+
        "\nPrecio total: " + inventario[i].calcularValorInventario()+
        "\n----------------------\n";
        
        }
        
        JOptionPane.showMessageDialog(null, resInv);
  
    }
		
	}


