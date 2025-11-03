package caso1;

/**  Trabajo Práctico N°6: Caso 1 (Inventario - Producto)
 *  Se debe desarrollar un sistema de stock que permita gestionar productos en una tienda, 
 *  controlando su disponibilidad, precios y categorías. La información se modelará 
 *  utilizando clases, colecciones dinámicas y enumeraciones en Java.
 *  @author Bruno Giuliano Vapore
 */

public class Principal {

    public static void main(String[] args) {

        //Instanciamos inventario de la tienda
        Inventario tiendaInventario = new Inventario();

        // 1. Crear al menos cinco productos con diferentes categorías y agregarlos al inventario.
        
        Producto p1 = new Producto("A123", "Arroz", 1800, 120, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("E001", "Notebook", 500000, 5, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("H456", "Pava", 25000.5, 10, CategoriaProducto.HOGAR);
        Producto p4 = new Producto("RP12", "Remera", 29.900, 20, CategoriaProducto.ROPA);
        Producto p5 = new Producto("A124", "Fideos", 2699.99, 200, CategoriaProducto.ALIMENTOS);
        
        tiendaInventario.agregarProducto(p1);
        tiendaInventario.agregarProducto(p2);
        tiendaInventario.agregarProducto(p3);
        tiendaInventario.agregarProducto(p4);
        tiendaInventario.agregarProducto(p5);
        
        
        // 2. Listar todos los productos mostrando su información y categoría.
        
        System.out.println("-------Inventario-------");
        tiendaInventario.listarProductos();
        System.out.println("-------FIN-------");
        // 3. Buscar un producto por ID y mostrar su información.
        
        System.out.println("--------------------------");
        System.out.println("BUSCADOR DE PRODUCTO POR ID: ");
        System.out.println(tiendaInventario.buscarProductoPorId("RP12"));
        
        // 4. Filtrar y mostrar productos que pertenezcan a una categoría específica.
        
        System.out.println("--------------------------");
        System.out.println("FILTRO POR CATEGORIA: ");
        System.out.println(tiendaInventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS));
        
        // 5. Eliminar un producto por su ID y listar los productos restantes.
        
        System.out.println("--------------------------");
        System.out.println("Eliminando producto.....");
        tiendaInventario.eliminarProducto("E001");
        System.out.println("PRODUCTO ELIMINADO");
        tiendaInventario.listarProductos();
                
        // 6. Actualizar el stock de un producto existente.
        
        System.out.println("--------------------------");
        System.out.println("Actualizando Stock.....");
        System.out.println(tiendaInventario.buscarProductoPorId("RP12"));
        tiendaInventario.actualizarStock("RP12", 10);
        System.out.println("STOCK ACTUALIZADO:");
        System.out.println(tiendaInventario.buscarProductoPorId("RP12"));
        
        // 7. Mostrar el total de stock disponible.
        
        System.out.println("--------------------------");
        System.out.println("STOCK TOTAL:");
        System.out.println(tiendaInventario.obtenerTotalStock());
        
        // 8. Obtener y mostrar el producto con mayor stock.
        
        System.out.println("--------------------------");
        System.out.println("PRODUCTO CON MAYOR STOCK:");
        System.out.println(tiendaInventario.obtenerProductoConMayorStock());
        
        // 9. Filtrar productos con precios entre $1000 y $3000.
        
        System.out.println("--------------------------");
        System.out.println("Filtrando productos por precios.....");
        System.out.println(tiendaInventario.filtrarProductosPorPrecio(1000, 3000));
        System.out.println("(Se muestran los productos entre $1000 y $3000)");
        
        // 10. Mostrar las categorías disponibles con sus descripciones.
        
        System.out.println("--------------------------");
        System.out.println("CATEGORIAS DE PRODUCTOS:");
        tiendaInventario.mostrarCategoriasDisponibles();
        
    }
    
}
