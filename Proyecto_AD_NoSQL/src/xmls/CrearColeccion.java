package xmls;

import org.w3c.dom.*;
import org.xmldb.api.DatabaseManager;
import org.xmldb.api.base.Collection;
import org.xmldb.api.base.Database;
import org.xmldb.api.base.XMLDBException;
import org.xmldb.api.modules.CollectionManagementService;
import org.xmldb.api.modules.XMLResource;

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
    static String URI = "xmldb:exist://localhost:8080/exist/xmlrpc/db/"; //URI
    static String usu = "admin"; //Usuario
    static String usuPwd = "admin"; //Clave

    public static void main(String[] args) {
        crearAlmacen();
        crearEmpleados();
        crearClientes();
        crearPlatos();
        crearUsuarios();
        crearLogin();
        crearControlConsultas();
        try {
            Class cl = Class.forName(driver);
            Database database = (Database) cl.getDeclaredConstructor().newInstance();
            database.setProperty("create-database", "true");
            DatabaseManager.registerDatabase(database);

            Collection parent = DatabaseManager.getCollection(URI, usu, usuPwd);
            CollectionManagementService mgt = (CollectionManagementService) parent.getService("CollectionManagementService", "1.0");
            Collection col = mgt.createCollection("xmldb:exist://localhost:8080/exist/xmlrpc/db/ProyectoAD");
            col.close();
            parent.close();
            URI = "xmldb:exist://localhost:8080/exist/xmlrpc/db/ProyectoAD";
        } catch (XMLDBException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
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

            Source source = new DOMSource(document);
            Result result = new StreamResult(new java.io.File(".\\src\\xmls\\almacen.xml"));
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
            Result console = new StreamResult(System.out);
            transformer.transform(source, console);
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (TransformerConfigurationException e) {
            throw new RuntimeException(e);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
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
            crearElemento("SALARIO", "1000.0", empleado, document);
            crearElemento("FECHACON", "12/12/2021", empleado, document);
            crearElemento("TELEFONO", "123456789", empleado, document);
            crearElemento("EMAIL", "gaizka@gmail.com", empleado, document);

            Source source = new DOMSource(document);
            Result result = new StreamResult(new java.io.File(".\\src\\xmls\\empleados.xml"));
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
            Result console = new StreamResult(System.out);
            transformer.transform(source, console);
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (TransformerConfigurationException e) {
            throw new RuntimeException(e);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
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
            crearElemento("TELEFONO", "987654321", cliente, document);
            crearElemento("EMAIL", "jokin@gmail.com", cliente, document);

            Source source = new DOMSource(document);
            Result result = new StreamResult(new java.io.File(".\\src\\xmls\\clientes.xml"));
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
            Result console = new StreamResult(System.out);
            transformer.transform(source, console);
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (TransformerConfigurationException e) {
            throw new RuntimeException(e);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
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

            Source source = new DOMSource(document);
            Result result = new StreamResult(new java.io.File(".\\src\\xmls\\platos.xml"));
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
            Result console = new StreamResult(System.out);
            transformer.transform(source, console);
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (TransformerConfigurationException e) {
            throw new RuntimeException(e);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
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
            throw new RuntimeException(e);
        } catch (TransformerConfigurationException e) {
            throw new RuntimeException(e);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
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
            throw new RuntimeException(e);
        } catch (TransformerConfigurationException e) {
            throw new RuntimeException(e);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
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
            crearElemento("SENTECIA", "PRUEBA", registro, document);

            Source source = new DOMSource(document);
            Result result = new StreamResult(new java.io.File(".\\src\\xmls\\controlconsultas.xml"));
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
            Result console = new StreamResult(System.out);
            transformer.transform(source, console);
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (TransformerConfigurationException e) {
            throw new RuntimeException(e);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }
    }

    static void xmlToCollection() {
        try {
            Class cl = Class.forName(driver);
            Database database = (Database) cl.getDeclaredConstructor().newInstance();
            DatabaseManager.registerDatabase(database);
            Collection col = DatabaseManager.getCollection(URI, usu, usuPwd);
            if (col != null) {
                col.storeResource(crearResource("empleados.xml", ".\\src\\xmls\\empleados.xml", col));
                col.storeResource(crearResource("almacen.xml", ".\\src\\xmls\\almacen.xml", col));
                col.storeResource(crearResource("clientes.xml", ".\\src\\xmls\\clientes.xml", col));
                col.storeResource(crearResource("controlconsultas.xml", ".\\src\\xmls\\controlconsultas.xml", col));
                col.storeResource(crearResource("login.xml", ".\\src\\xmls\\login.xml", col));
                col.storeResource(crearResource("platos.xml", ".\\src\\xmls\\platos.xml", col));
                col.storeResource(crearResource("usuarios.xml", ".\\src\\xmls\\usuarios.xml", col));
                col.close();
            } else {
                //mostrar error
            }
        } catch (XMLDBException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    static XMLResource crearResource(String xmlNombre, String ruta, Collection col) {
        try {
            XMLResource res = (XMLResource) col.createResource(xmlNombre, "XMLResource");
            File f = new File(ruta);
            res.setContent(f);
            return res;
        } catch (XMLDBException e) {
            throw new RuntimeException(e);
        }
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
