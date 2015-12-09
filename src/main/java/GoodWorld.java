import event_mechanism.Event;
import org.apache.log4j.Logger;

import java.text.ParseException;
import java.util.Locale;
import java.util.ResourceBundle;

public class GoodWorld {

    private static final Logger log = Logger.getLogger(GoodWorld.class);

    public static void main(String[] args) throws ParseException {

        Locale.getDefault();
        ResourceBundle res = ResourceBundle.getBundle("bundle");

        Event event = Event.newBuilder().build();
        switch (event.getEvent()) {
            case "MORNING":
                System.out.println(res.getString("morning"));
                log.info("Print morning message");
                break;
            case "DAY":
                System.out.println(res.getString("day"));
                log.info("Print day message");
                break;
            case "EVENING":
                System.out.println(res.getString("evening"));
                log.info("Print evening message");
                break;
            case "NIGHT":
                System.out.println(res.getString("night"));
                log.info("Print night message");
                break;
        }
    }
}

