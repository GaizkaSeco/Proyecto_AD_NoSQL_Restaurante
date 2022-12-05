package clases;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.xmldb.api.DatabaseManager;
import org.xmldb.api.base.*;
import org.xmldb.api.modules.XPathQueryService;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class ConexionExist {
    static String driver = "org.exist.xmldb.DatabaseImpl"; //Driver para eXist
    static String URI = "xmldb:exist://localhost:8080/exist/xmlrpc/db/ProyectoPrueba"; //URI colección
    static String usu = "admin"; //Usuario
    static String usuPwd = "admin"; //Clave

    public ConexionExist() {
    }

    public static Collection conectar() {
        try {
            Class cl = Class.forName(driver); //Carga del driver
            Database database = (Database) cl.getDeclaredConstructor().newInstance(); //Instancia de la BD
            DatabaseManager.registerDatabase(database); //Registro del driver
            Collection col = DatabaseManager.getCollection(URI, usu, usuPwd);
            return col;
        } catch (XMLDBException e) {
            System.out.println("Error al inicializar la BD eXist.");
            //e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Error en el driver.");
            //e.printStackTrace();
        } catch (InstantiationException e) {
            System.out.println("Error al instanciar la BD.");
            //e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.out.println("Error al instanciar la BD.");
            //e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Empleado> cargarEmpleados() {
        Collection col = conectar();
        List<Empleado> empleados = new ArrayList<>();
        if (col != null) {
            try {
                XPathQueryService servicio;
                servicio = (XPathQueryService) col.getService("XPathQueryService", "1.0");
                //Preparamos la consulta
                ResourceSet result = servicio.query("for $emp in /EMPLEADOS/EMPLEADO return $emp");
                // recorrer los datos del recurso.
                ResourceIterator i = result.getIterator();
                if (!i.hasMoreResources()) {
                    System.out.println(" LA CONSULTA NO DEVUELVE NADA O ESTÁ MAL ESCRITA");
                }
                while (i.hasMoreResources()) {
                    Resource r = i.nextResource();
                    String campo = (String) r.getContent();
                    SAXBuilder saxBuilder = new SAXBuilder();
                    Document document = saxBuilder.build(new StringReader(campo));
                    Element root = document.getRootElement();
                    Empleado empleado = new Empleado(Integer.parseInt(root.getAttribute("ID").getValue()), root.getChildren("NOMBRE").get(0).getText(), Double.parseDouble(root.getChildren("SALARIO").get(0).getText()), root.getChildren("FECHACON").get(0).getText(), Integer.parseInt(root.getChildren("TELEFONO").get(0).getText()), root.getChildren("EMAIL").get(0).getText() );
                    empleados.add(empleado);
                }
                col.close();
            } catch (XMLDBException e) {
                System.out.println(" ERROR AL CONSULTAR DOCUMENTO.");
                e.printStackTrace();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (JDOMException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Error en la conexión. Comprueba datos.");
        }
        return empleados;
    }

    public void anadirEmpleado(Empleado empNuevo) {
        Collection col = conectar();
        String nuevoemp = "<EMPLEADO ID='" + empNuevo.getId() + "'>" +
                "<NOMBRE>" + empNuevo.getNombre() + "</NOMBRE>" +
                "<SALARIO>" + empNuevo.getSalario() + "</SALARIO>" +
                "<FECHACON>" + empNuevo.getFechaCon() + "</FECHACON>" +
                "<TELEFONO>" + empNuevo.getTelefono() + "</TELEFONO>" +
                "<EMAIL>" + empNuevo.getEmail() + "</EMAIL>" +
                "</EMPLEADO>";
        if (col != null) {
            try {
                XPathQueryService servicio;
                servicio = (XPathQueryService) col.getService("XPathQueryService", "1.0");
                //Preparamos la consulta
                ResourceSet result = servicio.query("update insert " + nuevoemp + " into /EMPLEADOS");
                System.out.println(result);
                //cerramos
                col.close();
            } catch (XMLDBException e) {
                System.out.println(" ERROR AL CONSULTAR DOCUMENTO.");
                e.printStackTrace();
            }
        } else {
            System.out.println("Error en la conexión. Comprueba datos.");
        }
    }
}
