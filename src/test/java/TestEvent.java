import event_mechanism.Event;
import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;

public class TestEvent {
    private Event event;

    @Test
    public  void testGetEvent() throws ParseException {
        event = Event.newBuilder().build();
        switch (event.getEvent()){
            case "MORNING": break;
            case "DAY": break;
            case "EVENING":break;
            case "NIGHT": break;
            default:
                Assert.fail();
        }
    }

    @Test
    public void testNightFirst()throws ParseException{
        event = Event.newBuilder("23:00:00").build();
        Assert.assertEquals(event.getEvent(), "NIGHT");
    }

    @Test
    public void testNightSecond()throws ParseException{
        event = Event.newBuilder("05:59:59").build();
        Assert.assertEquals(event.getEvent(), "NIGHT");
    }

    @Test
    public void testNightThree()throws ParseException{
        event = Event.newBuilder("23:00:01").build();
        Assert.assertEquals(event.getEvent(), "NIGHT");
    }

    @Test
    public void testNightFour()throws ParseException{
        event = Event.newBuilder("02:00:00").build();
        Assert.assertEquals(event.getEvent(), "NIGHT");
    }

    @Test
    public void testMorningFirst()throws ParseException{
        event = Event.newBuilder("06:00:01").build();
        Assert.assertEquals(event.getEvent(), "MORNING");
    }

    @Test
    public void testMorningSecond()throws ParseException{
        event = Event.newBuilder("08:59:59").build();
        Assert.assertEquals(event.getEvent(), "MORNING");
    }

    @Test
    public void testMorningThree()throws ParseException{
        event = Event.newBuilder("07:25:01").build();
        Assert.assertEquals(event.getEvent(), "MORNING");
    }

    @Test
    public void testMorningFour()throws ParseException{
        event = Event.newBuilder("08:00:00").build();
        Assert.assertEquals(event.getEvent(), "MORNING");
    }
    @Test
    public void testDayFirst()throws ParseException{
        event = Event.newBuilder("09:00:01").build();
        Assert.assertEquals(event.getEvent(), "DAY");
    }

    @Test
    public void testDaySecond()throws ParseException{
        event = Event.newBuilder("18:59:59").build();
        Assert.assertEquals(event.getEvent(), "DAY");
    }

    @Test
    public void testDayThree()throws ParseException{
        event = Event.newBuilder("15:35:51").build();
        Assert.assertEquals(event.getEvent(), "DAY");
    }

    @Test
    public void testDayFour()throws ParseException{
        event = Event.newBuilder("16:53:15").build();
        Assert.assertEquals(event.getEvent(), "DAY");
    }

    @Test
    public void testEveningFirst()throws ParseException{
        event = Event.newBuilder("19:00:01").build();
        Assert.assertEquals(event.getEvent(), "EVENING");
    }

    @Test
    public void testEveningSecond()throws ParseException{
        event = Event.newBuilder("22:59:59").build();
        Assert.assertEquals(event.getEvent(), "EVENING");
    }

    @Test
    public void testEveningThree()throws ParseException{
        event = Event.newBuilder("21:25:01").build();
        Assert.assertEquals(event.getEvent(), "EVENING");
    }

    @Test
    public void testEveningFour()throws ParseException{
        event = Event.newBuilder("22:00:00").build();
        Assert.assertEquals(event.getEvent(), "EVENING");
    }



}