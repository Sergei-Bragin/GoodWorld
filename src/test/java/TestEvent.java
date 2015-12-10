import event_mechanism.Event;
import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;

public class TestEvent {

    @Test
    public  void testGetEvent() throws ParseException {
        Event event = Event.newBuilder().build();
        switch (event.getEvent()){
            case "MORNING": break;
            case "DAY": break;
            case "EVENING":break;
            case "NIGHT": break;
            default:
                Assert.fail();
        }
    }

}