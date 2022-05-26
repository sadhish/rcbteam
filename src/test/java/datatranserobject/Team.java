package datatranserobject;
import java.util.List;
import java.util.Map;
public class Team {
    private String name;
    private String location;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private List<Map<String,String>> player;

    public List<Map<String, String>> getPlayer() {
        return player;
    }
    public void setPlayer(List<Map<String, String>> player) {
        this.player = player;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}
