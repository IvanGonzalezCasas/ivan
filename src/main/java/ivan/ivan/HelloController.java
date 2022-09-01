package ivan.ivan;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


   /*  @GetMapping("/{id}")
    public String leer(@PathVariable String id) {
        return id;
    } */

    @GetMapping("/obtenerCliente")
	public String getCliente() throws Exception {

        JSONObject jsonObject = (JSONObject) readJsonSimpleDemo("clientes.json");
        System.out.println(jsonObject);
       

		return "muestra datos";
	}

    
    public static Object readJsonSimpleDemo(String filename) throws Exception {
        FileReader reader = new FileReader(filename);
        JSONParser jsonParser = new JSONParser();
        return jsonParser.parse(reader);
    }
}



