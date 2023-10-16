
package Clases;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class SacarDatos {
    private static String[] tiposMaterial;
    private static int minCapacidadP;
    private static int maxCapacidadP;
    private static int minCapacidadS;
    private static int maxCapacidadS;
    private static int minTiempoReciclado;
    private static int maxTiempoReciclado;

    // Función para extraer información del archivo JSON y guardarla en variables
    private static void extraerInformacion(JsonNode rootNode) throws JsonProcessingException {
        // Obtener la lista de tipos de material del JSON
        JsonNode tiposMaterialNode = rootNode.get("tiposMaterial");
        
        // Convertir la lista de tipos de material en un arreglo de cadenas
        tiposMaterial = new ObjectMapper().treeToValue(tiposMaterialNode, String[].class);
            
        // Obtener los valores de capacidad del JSON
        minCapacidadP = rootNode.get("PersonaCapacidad").get("minCapacidadP").asInt();
        maxCapacidadP = rootNode.get("PersonaCapacidad").get("maxCapacidadP").asInt();

        // Obtener la información de CapacidadSede
        JsonNode capacidadSedeNode = rootNode.get("CapacidadSede");
        minCapacidadS = capacidadSedeNode.get("minCapacidadS").asInt();
        maxCapacidadS = capacidadSedeNode.get("maxCapacidadS").asInt();

        // Obtener la información de tiempoReciclado
        JsonNode tiempoRecicladoNode = rootNode.get("tiempoReciclado");
        minTiempoReciclado = tiempoRecicladoNode.get("minimoTiempo").asInt();
        maxTiempoReciclado = tiempoRecicladoNode.get("maximoTiempo").asInt();
    }
    
    private static Persona generarPersona() {
        // Genera al azar un número índice para la lista
        int index = new Random().nextInt(tiposMaterial.length);
        
        // Obtener el tipo de material aleatorio
        String tipoR = tiposMaterial[index];
        
        // Generar aleatoriamente la capacidad dentro del rango
        int capacidad = new Random().nextInt(maxCapacidadP - minCapacidadP + 1) + minCapacidadP;
        
        // Crear una instancia de Persona con los valores generados
        Persona persona = new Persona();
        persona.setTipoR(tipoR);
        persona.setCapacidad(capacidad);
        
        return persona;
    }
    
    
    private static Compañia generarCompañia(int sedeNumero) {
    // Genera aleatoriamente la capacidad dentro del rango
    int capacidad = new Random().nextInt(maxCapacidadS - minCapacidadS + 1) + minCapacidadS;
    
    // Genera aleatoriamente los tiempos de reciclado dentro de los rangos
    int tiempoReciclado = new Random().nextInt(maxTiempoReciclado - minTiempoReciclado + 1) + minTiempoReciclado;

    // Determina el tipo de material para esta sede
    String tipoMaterial = tiposMaterial[sedeNumero - 1]; // Usamos sedeNumero - 1 como índice

    // Crea una instancia de Sede con los valores generados
    Compañia sede = new Compañia();
    sede.setCapacidad(capacidad);
    sede.setTreciclado(tiempoReciclado);
    sede.setTipo(tipoMaterial);

    return sede;
   }

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File archivo = new File("C:/Users/Jose/Desktop/Tec/Materia/Casos/Caso 2 POO/Interfaz/src/main/java/Clases/Datos.json");
        // Deserializar el JSON en un objeto JsonNode
        JsonNode rootNode = mapper.readTree(archivo);
        // Extraer la información del archivo JSON y guardarla en variables
        extraerInformacion(rootNode);

        // Generar las dos compañías (sedes)
        Compañia compañia1 = generarCompañia(1); 
        Compañia compañia2 = generarCompañia(2); 
        Persona persona1 = generarPersona();
       
        System.out.println("Material de persona"+persona1.getTipoR());
        System.out.println("Cantidad de kg que lleva : " +persona1.getCapacidad());

        // Imprimir la información de las compañías
        System.out.println("Compañía 1:");
        System.out.println("Tipo: " + compañia1.getTipo());


        System.out.println("\nCompañía 2:");
        System.out.println("Tipo: " + compañia2.getTipo());

    }
}
