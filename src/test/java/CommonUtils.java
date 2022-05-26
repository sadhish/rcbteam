import com.fasterxml.jackson.databind.ObjectMapper;
import datatranserobject.RcbPojo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


public abstract class CommonUtils {

    protected static ObjectMapper objectMapper;

    protected static RcbPojo dataRequest() throws IOException {
        objectMapper = new ObjectMapper();
        File resource = new File("F:\\RestAssured\\src\\test\\resources\\RCB.json");
        String jsonString = new String(Files.readAllBytes(resource.toPath()));
        return objectMapper.readValue(jsonString, RcbPojo.class);


    }

}
