import com.fasterxml.jackson.databind.ObjectMapper;
import datatranserobject.Team;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


public abstract class CommonUtils {

    protected static ObjectMapper objectMapper;

    protected static Team dataRequest() throws IOException {
        objectMapper = new ObjectMapper();
        File resource = new File("F:\\RestAssured\\src\\test\\resources\\RCB.json");
        String jsonString = new String(Files.readAllBytes(resource.toPath()));
        return objectMapper.readValue(jsonString, Team.class);


    }

}
