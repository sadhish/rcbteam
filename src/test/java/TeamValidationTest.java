import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

public class TeamValidationTest extends CommonUtils {
    protected static final Logger logger = LogManager.getLogger(TeamValidationTest.class);
    @Test(description = "test validates that team has equal or less than four foreign players")

    void testForeignPlayersCount() throws IOException {
        boolean foreignPlayerCount = dataRequest().getPlayer()
                .stream()
                .filter(e -> !e.get("country").equalsIgnoreCase("India"))
                .count() <=4?true:false;


        Assert.assertEquals(true, foreignPlayerCount, "Foreign Players should be less than or equal to 4");
        logger.info("Team consists of four or less than four foriegn players");

    }

    @Test(description = "test validates that team has atleast one wicket keeper")
    void testAtleastOneWicketKeeperExist() throws IOException {
        boolean wicketKeeperCount = dataRequest().getPlayer()
                .stream()
                .filter(e -> e.get("role").equalsIgnoreCase("Wicket-keeper"))
                .count() > 0 ? true : false;
        Assert.assertEquals(true, wicketKeeperCount, "One Wicket Keeper should be in the Team");
        logger.info("Team consists of atleast on wicketkeeper");
    }

}
