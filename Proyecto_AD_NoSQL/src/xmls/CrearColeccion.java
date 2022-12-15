package xmls;

import org.w3c.dom.*;
import org.xmldb.api.DatabaseManager;
import org.xmldb.api.base.Collection;
import org.xmldb.api.base.Database;
import org.xmldb.api.base.XMLDBException;
import org.xmldb.api.modules.CollectionManagementService;
import org.xmldb.api.modules.XMLResource;

import javax.swing.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

public class CrearColeccion {
    static String driver = "org.exist.xmldb.DatabaseImpl"; //Driver para eXist
    static String URI = "xmldb:exist://localhost:8080/exist/xmlrpc/db"; //URI
    static String usu = "admin"; //Usuario
    static String usuPwd = "admin"; //Clave

    public static void main(String[] args) {
        //creacion de los xml atraves de funciones
        crearAlmacen();
        crearEmpleados();
        crearClientes();
        crearPlatos();
        crearUsuarios();
        crearLogin();
        crearControlConsultas();
        //Creacion de la coleccion en exist
        try {
            Class cl = Class.forName(driver);
            Database database = (Database) cl.getDeclaredConstructor().newInstance();
            database.setProperty("create-database", "true");
            DatabaseManager.registerDatabase(database);

            Collection parent = DatabaseManager.getCollection(URI, usu, usuPwd);
            CollectionManagementService mgt = (CollectionManagementService) parent.getService("CollectionManagementService", "1.0");
            Collection col = mgt.createCollection(URI + "/ProyectoAD");
            col.close();
            parent.close();
            URI = URI + "/ProyectoAD";
        } catch (XMLDBException e) {
            JOptionPane.showMessageDialog(null, "Error al instanciar la BD.");
        } catch (ClassNotFoundException | InvocationTargetException | InstantiationException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido encontrar la base de datos.");
        } catch (IllegalAccessException e) {
            JOptionPane.showMessageDialog(null, "No tienes permisos sobre la base de datos.");
        } catch (NoSuchMethodException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido encontrar el metodo para conectarse a al base de datos.");
        }
        //Traslado de los xml a la coleccion creada en exist
        xmlToCollection();
    }

    public static void crearAlmacen() {
        try {
            //creamos el documento con DOM
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            Document document = implementation.createDocument(null, "ALMACEN", null);
            document.setXmlVersion("1.0");

            //Creamos cada elemento
            Element producto = document.createElement("PRODUCTO");
            document.getDocumentElement().appendChild(producto);
            crearAtributo("ID", "0", producto, document);
            crearElemento("NOMBRE", "Tomate", producto, document);
            crearElemento("CANTIDAD", "100", producto, document);

            Element producto2 = document.createElement("PRODUCTO");
            document.getDocumentElement().appendChild(producto2);
            crearAtributo("ID", "1", producto2, document);
            crearElemento("NOMBRE", "Mararrones", producto2, document);
            crearElemento("CANTIDAD", "200", producto2, document);

            Element producto3 = document.createElement("PRODUCTO");
            document.getDocumentElement().appendChild(producto3);
            crearAtributo("ID", "2", producto3, document);
            crearElemento("NOMBRE", "Lechuga", producto3, document);
            crearElemento("CANTIDAD", "100", producto3, document);

            Element producto4 = document.createElement("PRODUCTO");
            document.getDocumentElement().appendChild(producto4);
            crearAtributo("ID", "3", producto4, document);
            crearElemento("NOMBRE", "Carne de vaca", producto4, document);
            crearElemento("CANTIDAD", "54", producto4, document);

            Element producto5 = document.createElement("PRODUCTO");
            document.getDocumentElement().appendChild(producto5);
            crearAtributo("ID", "4", producto5, document);
            crearElemento("NOMBRE", "Pollos", producto5, document);
            crearElemento("CANTIDAD", "79", producto5, document);

            Element producto6 = document.createElement("PRODUCTO");
            document.getDocumentElement().appendChild(producto6);
            crearAtributo("ID", "5", producto6, document);
            crearElemento("NOMBRE", "Chocholate", producto6, document);
            crearElemento("CANTIDAD", "100", producto6, document);

            Element producto7 = document.createElement("PRODUCTO");
            document.getDocumentElement().appendChild(producto7);
            crearAtributo("ID", "6", producto7, document);
            crearElemento("NOMBRE", "Leche", producto7, document);
            crearElemento("CANTIDAD", "380", producto7, document);

            Source source = new DOMSource(document);
            Result result = new StreamResult(new java.io.File(".\\src\\xmls\\almacen.xml"));
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
            Result console = new StreamResult(System.out);
            transformer.transform(source, console);
        } catch (ParserConfigurationException e) {
            JOptionPane.showMessageDialog(null, "ERROR al pasar datos");
        } catch (TransformerException e) {
            JOptionPane.showMessageDialog(null, "ERROR al cargar los datos de los xml");
        }
    }

    public static void crearEmpleados() {
        try {
            //creamos el documento con DOM
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            Document document = implementation.createDocument(null, "EMPLEADOS", null);
            document.setXmlVersion("1.0");

            //Creamos cada elemento
            Element empleado = document.createElement("EMPLEADO");
            document.getDocumentElement().appendChild(empleado);
            crearAtributo("ID", "0", empleado, document);
            crearElemento("NOMBRE", "Gaizka", empleado, document);
            crearElemento("SALARIO", "2000.0", empleado, document);
            crearElemento("FECHACON", "12/12/2021", empleado, document);
            crearElemento("TELEFONO", "123456789", empleado, document);
            crearElemento("EMAIL", "gaizka@snorlax.com", empleado, document);

            Element empleado2 = document.createElement("EMPLEADO");
            document.getDocumentElement().appendChild(empleado2);
            crearAtributo("ID", "1", empleado2, document);
            crearElemento("NOMBRE", "Leire", empleado2, document);
            crearElemento("SALARIO", "2000.0", empleado2, document);
            crearElemento("FECHACON", "12/12/2021", empleado2, document);
            crearElemento("TELEFONO", "546789987", empleado2, document);
            crearElemento("EMAIL", "leire@snorlax.com", empleado2, document);

            Element empleado3 = document.createElement("EMPLEADO");
            document.getDocumentElement().appendChild(empleado3);
            crearAtributo("ID", "2", empleado3, document);
            crearElemento("NOMBRE", "Alexander", empleado3, document);
            crearElemento("SALARIO", "1200.0", empleado3, document);
            crearElemento("FECHACON", "12/12/2021", empleado3, document);
            crearElemento("TELEFONO", "745896632", empleado3, document);
            crearElemento("EMAIL", "alex@snorlax.com", empleado3, document);

            Element empleado4 = document.createElement("EMPLEADO");
            document.getDocumentElement().appendChild(empleado4);
            crearAtributo("ID", "3", empleado4, document);
            crearElemento("NOMBRE", "Egoitz", empleado4, document);
            crearElemento("SALARIO", "1200.0", empleado4, document);
            crearElemento("FECHACON", "12/12/2021", empleado4, document);
            crearElemento("TELEFONO", "896552147", empleado4, document);
            crearElemento("EMAIL", "egoitz@snorlax.com", empleado4, document);

            Element empleado5 = document.createElement("EMPLEADO");
            document.getDocumentElement().appendChild(empleado5);
            crearAtributo("ID", "4", empleado5, document);
            crearElemento("NOMBRE", "Javier", empleado5, document);
            crearElemento("SALARIO", "1000.0", empleado5, document);
            crearElemento("FECHACON", "12/12/2021", empleado5, document);
            crearElemento("TELEFONO", "567432211", empleado5, document);
            crearElemento("EMAIL", "javier@snorlax.com", empleado5, document);

            Source source = new DOMSource(document);
            Result result = new StreamResult(new java.io.File(".\\src\\xmls\\empleados.xml"));
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
            Result console = new StreamResult(System.out);
            transformer.transform(source, console);
        } catch (ParserConfigurationException e) {
            JOptionPane.showMessageDialog(null, "ERROR al pasar datos");
        } catch (TransformerException e) {
            JOptionPane.showMessageDialog(null, "ERROR al cargar los datos de los xml");
        }
    }

    public static void crearClientes() {
        try {
            //creamos el documento con DOM
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            Document document = implementation.createDocument(null, "CLIENTES", null);
            document.setXmlVersion("1.0");

            //Creamos cada elemento
            Element cliente = document.createElement("CLIENTE");
            document.getDocumentElement().appendChild(cliente);
            crearAtributo("ID", "0", cliente, document);
            crearElemento("NOMBRE", "Jokin", cliente, document);
            crearElemento("TELEFONO", "654890755", cliente, document);
            crearElemento("EMAIL", "jokin@gmail.com", cliente, document);

            Element cliente2 = document.createElement("CLIENTE");
            document.getDocumentElement().appendChild(cliente2);
            crearAtributo("ID", "1", cliente2, document);
            crearElemento("NOMBRE", "Eider", cliente2, document);
            crearElemento("TELEFONO", "556677889", cliente2, document);
            crearElemento("EMAIL", "eider@gmail.com", cliente2, document);

            Element cliente3 = document.createElement("CLIENTE");
            document.getDocumentElement().appendChild(cliente3);
            crearAtributo("ID", "2", cliente3, document);
            crearElemento("NOMBRE", "Roxana", cliente3, document);
            crearElemento("TELEFONO", "123445432", cliente3, document);
            crearElemento("EMAIL", "roxana@gmail.com", cliente3, document);

            Element cliente4 = document.createElement("CLIENTE");
            document.getDocumentElement().appendChild(cliente4);
            crearAtributo("ID", "3", cliente4, document);
            crearElemento("NOMBRE", "Ivan", cliente4, document);
            crearElemento("TELEFONO", "526042789", cliente4, document);
            crearElemento("EMAIL", "ivan@gmail.com", cliente4, document);

            Source source = new DOMSource(document);
            Result result = new StreamResult(new java.io.File(".\\src\\xmls\\clientes.xml"));
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
            Result console = new StreamResult(System.out);
            transformer.transform(source, console);
        } catch (ParserConfigurationException e) {
            JOptionPane.showMessageDialog(null, "ERROR al pasar datos");
        } catch (TransformerException e) {
            JOptionPane.showMessageDialog(null, "ERROR al cargar los datos de los xml");
        }
    }

    public static void crearPlatos() {
        try {
            //creamos el documento con DOM
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            Document document = implementation.createDocument(null, "PLATOS", null);
            document.setXmlVersion("1.0");

            //Creamos cada elemento
            Element plato = document.createElement("PLATO");
            document.getDocumentElement().appendChild(plato);
            crearAtributo("ID", "0", plato, document);
            crearElemento("NOMBRE", "Macarrones con tomate", plato, document);
            crearElemento("DESCRIPCION", "Macarrones con tomate", plato, document);
            crearElemento("PRECIO", "4.95", plato, document);
            crearElemento("CATEGORIA", "1", plato, document);

            Element plato2 = document.createElement("PLATO");
            document.getDocumentElement().appendChild(plato2);
            crearAtributo("ID", "1", plato2, document);
            crearElemento("NOMBRE", "Ensalada de vegetales", plato2, document);
            crearElemento("DESCRIPCION", "Ensalada para un dia caluroso", plato2, document);
            crearElemento("PRECIO", "4.95", plato2, document);
            crearElemento("CATEGORIA", "1", plato2, document);

            Element plato3 = document.createElement("PLATO");
            document.getDocumentElement().appendChild(plato3);
            crearAtributo("ID", "2", plato3, document);
            crearElemento("NOMBRE", "Chuleton de vaca", plato3, document);
            crearElemento("DESCRIPCION", "Rico chuleton de 2kg", plato3, document);
            crearElemento("PRECIO", "4.95", plato3, document);
            crearElemento("CATEGORIA", "2", plato3, document);

            Element plato4 = document.createElement("PLATO");
            document.getDocumentElement().appendChild(plato4);
            crearAtributo("ID", "3", plato4, document);
            crearElemento("NOMBRE", "Pollo asado con patatas", plato4, document);
            crearElemento("DESCRIPCION", "Rico pollo asado acompañado de patatas.", plato4, document);
            crearElemento("PRECIO", "4.95", plato4, document);
            crearElemento("CATEGORIA", "2", plato4, document);

            Element plato5 = document.createElement("PLATO");
            document.getDocumentElement().appendChild(plato5);
            crearAtributo("ID", "4", plato5, document);
            crearElemento("NOMBRE", "Volcan de chocolate", plato5, document);
            crearElemento("DESCRIPCION", "Bizcocho de chocolate relleno de chocolate.", plato5, document);
            crearElemento("PRECIO", "4.95", plato5, document);
            crearElemento("CATEGORIA", "3", plato5, document);

            Element plato6 = document.createElement("PLATO");
            document.getDocumentElement().appendChild(plato6);
            crearAtributo("ID", "5", plato6, document);
            crearElemento("NOMBRE", "Tarta de queso", plato6, document);
            crearElemento("DESCRIPCION", "Tarta de queso de la casa.", plato6, document);
            crearElemento("PRECIO", "4.95", plato6, document);
            crearElemento("CATEGORIA", "3", plato6, document);

            Source source = new DOMSource(document);
            Result result = new StreamResult(new java.io.File(".\\src\\xmls\\platos.xml"));
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
            Result console = new StreamResult(System.out);
            transformer.transform(source, console);
        } catch (ParserConfigurationException e) {
            JOptionPane.showMessageDialog(null, "ERROR al pasar datos");
        } catch (TransformerException e) {
            JOptionPane.showMessageDialog(null, "ERROR al cargar los datos de los xml");
        }
    }

    public static void crearUsuarios() {
        try {
            //creamos el documento con DOM
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            Document document = implementation.createDocument(null, "USUARIOS", null);
            document.setXmlVersion("1.0");

            //Creamos cada elemento
            Element usuario = document.createElement("USUARIO");
            document.getDocumentElement().appendChild(usuario);
            crearAtributo("ID", "0", usuario, document);
            crearElemento("NOMBRE", "admin", usuario, document);
            crearElemento("CONTRASENA", "12345", usuario, document);

            Source source = new DOMSource(document);
            Result result = new StreamResult(new java.io.File(".\\src\\xmls\\usuarios.xml"));
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
            Result console = new StreamResult(System.out);
            transformer.transform(source, console);
        } catch (ParserConfigurationException e) {
            JOptionPane.showMessageDialog(null, "ERROR al pasar datos");
        } catch (TransformerException e) {
            JOptionPane.showMessageDialog(null, "ERROR al cargar los datos de los xml");
        }
    }

    public static void crearLogin() {
        try {
            //creamos el documento con DOM
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            Document document = implementation.createDocument(null, "LOGINS", null);
            document.setXmlVersion("1.0");

            Element producto = document.createElement("REGISTRO");
            document.getDocumentElement().appendChild(producto);
            crearElemento("ID", "1", producto, document);
            crearElemento("IDUSUARIO", "1", producto, document);
            crearElemento("USUARIO", "Prueba", producto, document);
            crearElemento("FECHA", new Date().toString(), producto, document);

            Source source = new DOMSource(document);
            Result result = new StreamResult(new java.io.File(".\\src\\xmls\\login.xml"));
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
            Result console = new StreamResult(System.out);
            transformer.transform(source, console);
        } catch (ParserConfigurationException e) {
            JOptionPane.showMessageDialog(null, "ERROR al pasar datos");
        } catch (TransformerException e) {
            JOptionPane.showMessageDialog(null, "ERROR al cargar los datos de los xml");
        }
    }

    public static void crearControlConsultas() {
        try {
            //creamos el documento con DOM
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            Document document = implementation.createDocument(null, "REGISTROS", null);
            document.setXmlVersion("1.0");

            //Creamos cada elemento
            Element registro = document.createElement("REGISTRO");
            document.getDocumentElement().appendChild(registro);
            crearElemento("ID", "0", registro, document);
            crearElemento("IDUSUARIO", "0", registro, document);
            crearElemento("USUARIO", "prueba", registro, document);
            crearElemento("FECHA", new Date().toString(), registro, document);
            crearElemento("SENTENCIA", "PRUEBA", registro, document);

            Source source = new DOMSource(document);
            Result result = new StreamResult(new File(".\\src\\xmls\\controlconsultas.xml"));
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
            Result console = new StreamResult(System.out);
            transformer.transform(source, console);
        } catch (ParserConfigurationException e) {
            JOptionPane.showMessageDialog(null, "ERROR al pasar datos");
        } catch (TransformerException e) {
            JOptionPane.showMessageDialog(null, "ERROR al cargar los datos de los xml");
        }
    }

    static void xmlToCollection() {
        try {
            //Nos conectamos a exist
            Class cl = Class.forName(driver);
            Database database = (Database) cl.getDeclaredConstructor().newInstance();
            DatabaseManager.registerDatabase(database);
            Collection col = DatabaseManager.getCollection(URI, usu, usuPwd);
            //Comprobamos si se ha establecido conexion y en el caso de que sea que si añadimos los xml a la coleccion
            if (col != null) {
                col.storeResource(crearResource("empleados.xml", ".\\src\\xmls\\empleados.xml", col));
                col.storeResource(crearResource("almacen.xml", ".\\src\\xmls\\almacen.xml", col));
                col.storeResource(crearResource("clientes.xml", ".\\src\\xmls\\clientes.xml", col));
                col.storeResource(crearResource("controlconsultas.xml", ".\\src\\xmls\\controlconsultas.xml", col));
                col.storeResource(crearResource("login.xml", ".\\src\\xmls\\login.xml", col));
                col.storeResource(crearResource("platos.xml", ".\\src\\xmls\\platos.xml", col));
                col.storeResource(crearResource("usuarios.xml", ".\\src\\xmls\\usuarios.xml", col));
                col.close();
                JOptionPane.showMessageDialog(null, "Los XML y la coleccion se han creado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "ERROR al conectarse con la BD.");
            }
        } catch (XMLDBException e) {
            JOptionPane.showMessageDialog(null, "Error al instanciar la BD.");
        } catch (ClassNotFoundException | InvocationTargetException | InstantiationException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido encontrar la base de datos.");
        } catch (IllegalAccessException e) {
            JOptionPane.showMessageDialog(null, "No tienes permisos sobre la base de datos.");
        } catch (NoSuchMethodException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido encontrar el metodo para conectarse a al base de datos.");
        }
    }

    static XMLResource crearResource(String xmlNombre, String ruta, Collection col) {
        XMLResource res = null;
        try {
            res = (XMLResource) col.createResource(xmlNombre, "XMLResource");
            File f = new File(ruta);
            res.setContent(f);

        } catch (XMLDBException e) {
            JOptionPane.showMessageDialog(null, "ERROR no se a podido conectar con la base de datos.");
        }
        return res;
    }

    static void crearElemento(String datoPlato, String valor, Element raiz, Document document) {
        Element elem = document.createElement(datoPlato);
        Text text = document.createTextNode(valor);
        raiz.appendChild(elem);
        elem.appendChild(text);
    }

    static void crearAtributo(String datoPlato, String valor, Element raiz, Document document) {
        Attr atribute = document.createAttribute(datoPlato);
        Text text = document.createTextNode(valor);
        raiz.setAttributeNode(atribute);
        atribute.appendChild(text);
    }
}
