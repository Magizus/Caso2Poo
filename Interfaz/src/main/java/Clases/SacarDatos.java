
package Clases;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Random;



public class SacarDatos {
    // Función para extraer información del archivo JSON y guardarla en variables
    private static void extraerInformacion(JsonNode rootNode) throws JsonProcessingException {
        // Obtener la lista de tipos de material del JSON
        JsonNode tiposMaterialNode = rootNode.get("tiposMaterial");
        
        // Verificar si la lista existe en el JSON
        if (tiposMaterialNode != null && tiposMaterialNode.isArray()) {
            // Convertir la lista de tipos de material en un arreglo de cadenas
            tiposMaterial = new ObjectMapper().treeToValue(tiposMaterialNode, String[].class);
            
            // Obtener los valores de capacidad del JSON
            minCapacidad = rootNode.get("PersonaCapacidad").get("minCapacidad").asInt();
            maxCapacidad = rootNode.get("PersonaCapacidad").get("maxCapacidad").asInt();
        } else {
            System.out.println("La lista 'tiposMaterial' no se encuentra en el JSON.");
        }
    }
    
    
    private static Persona generarPersonaAleatoria() {
        // Genera al azar un numero indice para la lista
        int index = new Random().nextInt(tiposMaterial.length);
        
        // Obtener el tipo de material aleatorio
        String tipoR = tiposMaterial[index];
        
        // Generar aleatoriamente la capacidad dentro del rango
        int capacidad = new Random().nextInt(maxCapacidad - minCapacidad + 1) + minCapacidad;
        
        // Crear una instancia de Persona con los valores generados
        Persona persona = new Persona();
        persona.setTipoR(tipoR);
        persona.setCapacidad(capacidad);
        
        return persona;
    }
    
    private static String[] tiposMaterial;
    private static int minCapacidad;
    private static int maxCapacidad;
    
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File archivo = new File("C:/Users/Jose/Desktop/Tec/Materia/Casos/Caso 2 POO/Interfaz/src/main/java/Clases/Datos.json");
        
        // Deserializar el JSON en un objeto JsonNode
        JsonNode rootNode = mapper.readTree(archivo);
        
        // Extraer la información del archivo JSON y guardarla en variables
        extraerInformacion(rootNode);
        
      
        Persona persona1 = generarPersonaAleatoria();
        System.out.println(persona1);
  
        Persona persona2 = generarPersonaAleatoria();
        
        // Imprimir la segunda instancia de Persona
        System.out.println(persona2);
    }
}