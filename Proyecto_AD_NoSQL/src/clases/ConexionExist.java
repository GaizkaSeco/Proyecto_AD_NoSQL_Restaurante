package clases;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.xmldb.api.DatabaseManager;
import org.xmldb.api.base.*;
import org.xmldb.api.modules.XPathQueryService;

import javax.swing.*;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConexionExist {
    static String driver = "org.exist.xmldb.DatabaseImpl"; //Driver para eXist
    static String URI = "xmldb:exist://localhost:8080/exist/xmlrpc/db/ProyectoAD"; //URI colección
    static String usu = "admin"; //Usuario
    static String usuPwd = "admin"; //Clave

    public ConexionExist() {
    }

    /**
     * Funcion encargada de conectarse a la bbdd
     * @return colleccion conectada a la bbdd
     */
    public static Collection conectar() {
        try {
            Class cl = Class.forName(driver); //Carga del driver
            Database database = (Database) cl.getDeclaredConstructor().newInstance(); //Instancia de la BD
            DatabaseManager.registerDatabase(database); //Registro del driver
            Collection col = DatabaseManager.getCollection(URI, usu, usuPwd);
            return col;
        } catch (XMLDBException e) {
            JOptionPane.showMessageDialog(null, "Error al inicializar la BD eXist.");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error en el driver.");
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                 NoSuchMethodException e) {
            JOptionPane.showMessageDialog(null, "Error al instanciar la BD.");
        }
        return null;
    }

    /**
     * Comprueba que los credenciales sean correctos
     * @param usuario el nobre de usuario que se introduzca
     * @param contrasena la contrasena que se intoduzca
     * @return devuelve un objeto usuario con la informacion necesaria
     */
    public Usuario login(String usuario, String contrasena) {
        Collection col = conectar();
        if (col != null) {
            try {
                XPathQueryService servicio;
                servicio = (XPathQueryService) col.getService("XPathQueryService", "1.0");
                //Preparamos la consulta
                ResourceSet result = servicio.query("for $user in /USUARIOS/USUARIO[NOMBRE = '" + usuario + "' and CONTRASENA = '" + contrasena + "'] return $user");
                // recorrer los datos del recurso.
                ResourceIterator i = result.getIterator();
                if (!i.hasMoreResources()) {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto.");
                }
                while (i.hasMoreResources()) {
                    Resource r = i.nextResource();
                    String campo = (String) r.getContent();
                    SAXBuilder saxBuilder = new SAXBuilder();
                    Document document = saxBuilder.build(new StringReader(campo));
                    Element root = document.getRootElement();
                    return new Usuario(Integer.parseInt(root.getAttribute("ID").getValue()), root.getChildren("NOMBRE").get(0).getText(), true);
                }
                col.close();
            } catch (XMLDBException e) {
                JOptionPane.showMessageDialog(null, "Error al consultar el documento.");
            } catch (IOException | JDOMException e) {
                JOptionPane.showMessageDialog(null, "Error intentalo de nuevo mas tarde");
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR en la conexion");
        }
        return new Usuario(false);
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
                    JOptionPane.showMessageDialog(null, "No hay empleados.");
                }
                while (i.hasMoreResources()) {
                    Resource r = i.nextResource();
                    String campo = (String) r.getContent();
                    SAXBuilder saxBuilder = new SAXBuilder();
                    Document document = saxBuilder.build(new StringReader(campo));
                    Element root = document.getRootElement();
                    Empleado empleado = new Empleado(Integer.parseInt(root.getAttribute("ID").getValue()), root.getChildren("NOMBRE").get(0).getText(), Double.parseDouble(root.getChildren("SALARIO").get(0).getText()), root.getChildren("FECHACON").get(0).getText(), Integer.parseInt(root.getChildren("TELEFONO").get(0).getText()), root.getChildren("EMAIL").get(0).getText());
                    empleados.add(empleado);
                }
                col.close();
            } catch (XMLDBException e) {
                JOptionPane.showMessageDialog(null, "Error al consultar el documento.");
            } catch (IOException | JDOMException e) {
                JOptionPane.showMessageDialog(null, "Error intentalo de nuevo mas tarde");
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR en la conexion");
        }
        return empleados;
    }

    public List<Cliente> cargarClientes() {
        Collection col = conectar();
        List<Cliente> clientes = new ArrayList<>();
        if (col != null) {
            try {
                XPathQueryService servicio;
                servicio = (XPathQueryService) col.getService("XPathQueryService", "1.0");
                //Preparamos la consulta
                ResourceSet result = servicio.query("for $emp in /CLIENTES/CLIENTE return $emp");
                // recorrer los datos del recurso.
                ResourceIterator i = result.getIterator();
                if (!i.hasMoreResources()) {
                    JOptionPane.showMessageDialog(null, "No hay clientes.");
                }
                while (i.hasMoreResources()) {
                    Resource r = i.nextResource();
                    String campo = (String) r.getContent();
                    SAXBuilder saxBuilder = new SAXBuilder();
                    Document document = saxBuilder.build(new StringReader(campo));
                    Element root = document.getRootElement();
                    Cliente cliente = new Cliente(Integer.parseInt(root.getAttribute("ID").getValue()), root.getChildren("NOMBRE").get(0).getText(), Integer.parseInt(root.getChildren("TELEFONO").get(0).getText()), root.getChildren("EMAIL").get(0).getText());
                    clientes.add(cliente);
                }
                col.close();
            } catch (XMLDBException e) {
                JOptionPane.showMessageDialog(null, "Error al consultar el documento.");
            } catch (IOException | JDOMException e) {
                JOptionPane.showMessageDialog(null, "Error intentalo de nuevo mas tarde");
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR en la conexion");
        }
        return clientes;
    }

    public List<Producto> cargarProductos() {
        Collection col = conectar();
        List<Producto> productos = new ArrayList<>();
        if (col != null) {
            try {
                XPathQueryService servicio;
                servicio = (XPathQueryService) col.getService("XPathQueryService", "1.0");
                //Preparamos la consulta
                ResourceSet result = servicio.query("for $emp in /ALMACEN/PRODUCTO return $emp");
                // recorrer los datos del recurso.
                ResourceIterator i = result.getIterator();
                if (!i.hasMoreResources()) {
                    JOptionPane.showMessageDialog(null, "No hay productos en el almacen.");
                }
                while (i.hasMoreResources()) {
                    Resource r = i.nextResource();
                    String campo = (String) r.getContent();
                    SAXBuilder saxBuilder = new SAXBuilder();
                    Document document = saxBuilder.build(new StringReader(campo));
                    Element root = document.getRootElement();
                    Producto producto = new Producto(Integer.parseInt(root.getAttribute("ID").getValue()), root.getChildren("NOMBRE").get(0).getText(), Integer.parseInt(root.getChildren("CANTIDAD").get(0).getText()));
                    productos.add(producto);
                }
                col.close();
            } catch (XMLDBException e) {
                JOptionPane.showMessageDialog(null, "Error al consultar el documento.");
            } catch (IOException | JDOMException e) {
                JOptionPane.showMessageDialog(null, "Error intentalo de nuevo mas tarde");
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR en la conexion");
        }
        return productos;
    }

    public List<Plato> cargarPlatos() {
        Collection col = conectar();
        List<Plato> platos = new ArrayList<>();
        if (col != null) {
            try {
                XPathQueryService servicio;
                servicio = (XPathQueryService) col.getService("XPathQueryService", "1.0");
                //Preparamos la consulta
                ResourceSet result = servicio.query("for $plato in /PLATOS/PLATO return $plato");
                // recorrer los datos del recurso.
                ResourceIterator i = result.getIterator();
                if (!i.hasMoreResources()) {
                    JOptionPane.showMessageDialog(null, "No hay platos existentes en la carta.");
                }
                while (i.hasMoreResources()) {
                    Resource r = i.nextResource();
                    String campo = (String) r.getContent();
                    SAXBuilder saxBuilder = new SAXBuilder();
                    Document document = saxBuilder.build(new StringReader(campo));
                    Element root = document.getRootElement();
                    Plato plato = new Plato(Integer.parseInt(root.getAttribute("ID").getValue()), root.getChildren("NOMBRE").get(0).getText(), root.getChildren("DESCRIPCION").get(0).getText(), Double.parseDouble(root.getChildren("PRECIO").get(0).getText()), Integer.parseInt(root.getChildren("CATEGORIA").get(0).getText()));
                    platos.add(plato);
                }
                col.close();
            } catch (XMLDBException e) {
                JOptionPane.showMessageDialog(null, "Error al consultar el documento.");
            } catch (IOException | JDOMException e) {
                JOptionPane.showMessageDialog(null, "Error intentalo de nuevo mas tarde");
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR en la conexion");
        }
        return platos;
    }

    public void anadirEmpleado(Empleado empNuevo, Usuario user) {
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
                String sentencia = "update insert " + nuevoemp + " into /EMPLEADOS";
                ResourceSet result = servicio.query(sentencia);
                System.out.println(result);
                registroCambios(user, sentencia);
                //cerramos
                col.close();
            } catch (XMLDBException e) {
                JOptionPane.showMessageDialog(null, "ERROR al consultar el documento.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR en la conexion");
        }
    }

    public void anadirCliente(Cliente cliNuevo) {
        Collection col = conectar();
        String nuevocli = "<CLIENTE ID='" + cliNuevo.getId() + "'>" +
                "<NOMBRE>" + cliNuevo.getNombre() + "</NOMBRE>" +
                "<TELEFONO>" + cliNuevo.getTelefono() + "</TELEFONO>" +
                "<EMAIL>" + cliNuevo.getEmail() + "</EMAIL>" +
                "</CLIENTE>";
        if (col != null) {
            try {
                XPathQueryService servicio;
                servicio = (XPathQueryService) col.getService("XPathQueryService", "1.0");
                //Preparamos la consulta
                ResourceSet result = servicio.query("update insert " + nuevocli + " into /CLIENTES");
                System.out.println(result);
                //cerramos
                col.close();
            } catch (XMLDBException e) {
                JOptionPane.showMessageDialog(null, "ERROR al consultar el documento.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR en la conexion");
        }
    }

    public void anadirProducto(Producto proNuevo) {
        Collection col = conectar();
        String nuevopro = "<PRODUCTO ID='" + proNuevo.getId() + "'>" +
                "<NOMBRE>" + proNuevo.getProducto() + "</NOMBRE>" +
                "<CANTIDAD>" + proNuevo.getCantidad() + "</CANTIDAD>" +
                "</PRODUCTO>";
        if (col != null) {
            try {
                XPathQueryService servicio;
                servicio = (XPathQueryService) col.getService("XPathQueryService", "1.0");
                //Preparamos la consulta
                ResourceSet result = servicio.query("update insert " + nuevopro + " into /ALMACEN");
                System.out.println(result);
                //cerramos
                col.close();
            } catch (XMLDBException e) {
                JOptionPane.showMessageDialog(null, "ERROR al consultar el documento.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR en la conexion");
        }
    }

    public void anadirPlato(Plato platoNuevo) {
        Collection col = conectar();
        String nuevocli = "<PLATO ID='" + platoNuevo.getId() + "'>" +
                "<NOMBRE>" + platoNuevo.getNombre() + "</NOMBRE>" +
                "<DESCRIPCION>" + platoNuevo.getDescripcion() + "</DESCRIPCION>" +
                "<PRECIO>" + platoNuevo.getPrecio() + "</PRECIO>" +
                "<CATEGORIA>" + platoNuevo.getCategoria() + "</CATEGORIA>" +
                "</PLATO>";
        if (col != null) {
            try {
                XPathQueryService servicio;
                servicio = (XPathQueryService) col.getService("XPathQueryService", "1.0");
                //Preparamos la consulta
                ResourceSet result = servicio.query("update insert " + nuevocli + " into /PLATOS");
                System.out.println(result);
                //cerramos
                col.close();
            } catch (XMLDBException e) {
                JOptionPane.showMessageDialog(null, "ERROR al consultar el documento.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR en la conexion.");
        }
    }

    public void eliminarEmpleado(int id) {
        Collection col = conectar();
        if (col != null) {
            try {
                XPathQueryService servicio = (XPathQueryService) col.getService("XPathQueryService", "1.0");
                //Consulta para borrar un empleado --> update delete
                servicio.query("update delete /EMPLEADOS/EMPLEADO[@ID='" + id + "']");
                col.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR al borrar.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR en la conexion.");
        }
    }

    public void eliminarPlato(int id) {
        Collection col = conectar();
        if (col != null) {
            try {
                XPathQueryService servicio = (XPathQueryService) col.getService("XPathQueryService", "1.0");
                //Consulta para borrar un plato --> update delete
                servicio.query("update delete /PLATOS/PLATO[@ID='" + id + "']");
                col.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR al borrar.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR en la conexion.");
        }
    }

    public void eliminarCliente(int id) {
        Collection col = conectar();
        if (col != null) {
            try {
                XPathQueryService servicio = (XPathQueryService) col.getService("XPathQueryService", "1.0");
                //Consulta para borrar un cliente --> update delete
                servicio.query("update delete /CLIENTES/CLIENTE[@ID='" + id + "']");
                col.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR al borrar.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR en la conexion.");
        }
    }

    public void eliminarProducto(int id) {
        Collection col = conectar();
        if (col != null) {
            try {
                XPathQueryService servicio = (XPathQueryService) col.getService("XPathQueryService", "1.0");
                //Consulta para borrar un producto --> update delete
                servicio.query("update delete /ALMACEN/PRODUCTO[@ID='" + id + "']");
                col.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR al borrar.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR en la conexion.");
        }
    }

    public void editarEmpleado(Empleado empleado) {
        Collection col = conectar();
        String updateEmp = "<EMPLEADO ID='" + empleado.getId() + "'>" +
                "<NOMBRE>" + empleado.getNombre() + "</NOMBRE>" +
                "<SALARIO>" + empleado.getSalario() + "</SALARIO>" +
                "<FECHACON>" + empleado.getFechaCon() + "</FECHACON>" +
                "<TELEFONO>" + empleado.getTelefono() + "</TELEFONO>" +
                "<EMAIL>" + empleado.getEmail() + "</EMAIL>" +
                "</EMPLEADO>";
        if (col != null) {
            try {
                XPathQueryService servicio = (XPathQueryService) col.getService("XPathQueryService", "1.0");
                //Consulta para borrar un producto --> update replace
                servicio.query("update replace /EMPLEADOS/EMPLEADO[@ID=" + empleado.getId() + "] with" + updateEmp);
                col.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR al borrar.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR en la conexion.");
        }
    }

    public void editarProducto(Producto producto) {
        Collection col = conectar();
        String updatePro = "<PRODUCTO ID='" + producto.getId() + "'>" +
                "<NOMBRE>" + producto.getProducto() + "</NOMBRE>" +
                "<CANTIDAD>" + producto.getCantidad() + "</CANTIDAD>" +
                "</PRODUCTO>";
        if (col != null) {
            try {
                XPathQueryService servicio = (XPathQueryService) col.getService("XPathQueryService", "1.0");
                //Consulta para borrar un producto --> update replace
                servicio.query("update replace /ALMACEN/PRODUCTO[@ID=" + producto.getId() + "] with" + updatePro);
                col.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR al borrar.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR en la conexion.");
        }
    }

    public void editarCliente(Cliente cliente) {
        Collection col = conectar();
        String updateCli = "<CLIENTE ID='" + cliente.getId() + "'>" +
                "<NOMBRE>" + cliente.getNombre() + "</NOMBRE>" +
                "<TELEFONO>" + cliente.getTelefono() + "</TELEFONO>" +
                "<EMAIL>" + cliente.getEmail() + "</EMAIL>" +
                "</CLIENTE>";
        if (col != null) {
            try {
                XPathQueryService servicio = (XPathQueryService) col.getService("XPathQueryService", "1.0");
                //Consulta para borrar un producto --> update replace
                servicio.query("update replace /CLIENTES/CLIENTE[@ID=" + cliente.getId() + "] with" + updateCli);
                col.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR al borrar.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR en la conexion.");
        }
    }

    public void registroLogin(Usuario user) {
        Collection col = conectar();
        if (col != null) {
            try {
                XPathQueryService servicio = (XPathQueryService) col.getService("XPathQueryService", "1.0");
                //recuperar el id mas alto del registro para añadirle el siguiente
                ResourceSet result = servicio.query("max(/LOGINS/REGISTRO/ID) + 1");
                // recorrer los datos del recurso.
                int id = 0;
                ResourceIterator i = result.getIterator();
                while (i.hasMoreResources()) {
                    Resource r = i.nextResource();
                    id = Integer.parseInt(r.getContent().toString());
                }
                String registro = "<REGISTRO>" +
                        "<ID>" + id + "</ID>" +
                        "<IDUSUARIO>" + user.getId() + "</IDUSUARIO>" +
                        "<USUARIO>" + user.getNombre() + "</USUARIO>" +
                        "<FECHA>" + new Date() + "</FECHA>" +
                        "</REGISTRO>";

                //insertar el registro de login
                servicio.query("update insert " + registro + " into /LOGINS");
                col.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR al registrar los datos.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR en la conexion.");
        }
    }

    public void registroCambios(Usuario user, String sentencia) {
        Collection col = conectar();
        if (col != null) {
            try {
                XPathQueryService servicio = (XPathQueryService) col.getService("XPathQueryService", "1.0");
                //recuperar el id mas alto del registro para añadirle el siguiente
                ResourceSet result = servicio.query("max(/REGISTROS/REGISTRO/ID) + 1");
                // recorrer los datos del recurso.
                int id = 0;
                ResourceIterator i = result.getIterator();
                while (i.hasMoreResources()) {
                    Resource r = i.nextResource();
                    id = Integer.parseInt(r.getContent().toString());
                }
                String registro = "<REGISTRO>" +
                        "<ID>" + id + "</ID>" +
                        "<IDUSUARIO>" + user.getId() + "</IDUSUARIO>" +
                        "<USUARIO>" + user.getNombre() + "</USUARIO>" +
                        "<FECHA>" + new Date() + "</FECHA>" +
                        "<SENTENCIA>'" + sentencia + "'</SENTENCIA>" +
                        "</REGISTRO>";

                //insertar el registro de login
                servicio.query("update insert " + registro + " into /REGISTROS");
                col.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR al registrar los datos.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR en la conexion.");
        }
    }

    public List<InicioSesion> cargarInicioSesiones() {
        Collection col = conectar();
        List<InicioSesion> sesiones = new ArrayList<>();
        if (col != null) {
            try {
                XPathQueryService servicio;
                servicio = (XPathQueryService) col.getService("XPathQueryService", "1.0");
                //Preparamos la consulta
                ResourceSet result = servicio.query("for $sesion in /LOGINS/REGISTRO return $sesion");
                // recorrer los datos del recurso.
                ResourceIterator i = result.getIterator();
                if (!i.hasMoreResources()) {
                    JOptionPane.showMessageDialog(null, "No hay registro de inicio de sesion.");
                }
                while (i.hasMoreResources()) {
                    Resource r = i.nextResource();
                    String campo = (String) r.getContent();
                    SAXBuilder saxBuilder = new SAXBuilder();
                    Document document = saxBuilder.build(new StringReader(campo));
                    Element root = document.getRootElement();
                    InicioSesion sesion = new InicioSesion(Integer.parseInt(root.getChildren("ID").get(0).getValue()), Integer.parseInt(root.getChildren("IDUSUARIO").get(0).getText()), root.getChildren("USUARIO").get(0).getText(), root.getChildren("FECHA").get(0).getText());
                    sesiones.add(sesion);
                }
                col.close();
            } catch (XMLDBException e) {
                JOptionPane.showMessageDialog(null, "Error al consultar el documento.");
            } catch (IOException | JDOMException e) {
                JOptionPane.showMessageDialog(null, "Error intentalo de nuevo mas tarde");
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR en la conexion");
        }
        return sesiones;
    }

    public List<ControlConsultas> cargarControlConsultas() {
        Collection col = conectar();
        List<ControlConsultas> consultas = new ArrayList<>();
        if (col != null) {
            try {
                XPathQueryService servicio;
                servicio = (XPathQueryService) col.getService("XPathQueryService", "1.0");
                //Preparamos la consulta
                ResourceSet result = servicio.query("for $registro in /REGISTROS/REGISTRO return $registro");
                // recorrer los datos del recurso.
                ResourceIterator i = result.getIterator();
                if (!i.hasMoreResources()) {
                    JOptionPane.showMessageDialog(null, "No hay registro de operaciones de consultas.");
                }
                while (i.hasMoreResources()) {
                    Resource r = i.nextResource();
                    String campo = (String) r.getContent();
                    SAXBuilder saxBuilder = new SAXBuilder();
                    Document document = saxBuilder.build(new StringReader(campo));
                    Element root = document.getRootElement();
                    ControlConsultas registro = new ControlConsultas(root.getChildren("USUARIO").get(0).getValue(), root.getChildren("FECHA").get(0).getText(), root.getChildren("SENTENCIA").get(0).getText());
                    consultas.add(registro);
                }
                col.close();
            } catch (XMLDBException e) {
                JOptionPane.showMessageDialog(null, "Error al consultar el documento.");
            } catch (IOException | JDOMException e) {
                JOptionPane.showMessageDialog(null, "Error intentalo de nuevo mas tarde");
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR en la conexion");
        }
        return consultas;
    }
}
