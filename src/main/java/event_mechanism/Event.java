package event_mechanism;

import org.apache.log4j.Logger;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Event {

    private static final Logger log = Logger.getLogger(Event.class);
    private Date currentDate = new Date();
    private Date current = null;
    private Date morning = null;
    private Date day = null;
    private Date evening = null;
    private Date night = null;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");

    private Event(){}

    public String  getEvent() {

        try {
            current = dateFormat.parse(dateFormat.format(currentDate));
            morning  = dateFormat.parse(BorderEvent.MORNING.toString());
            day  = dateFormat.parse(BorderEvent.DAY.toString());
            evening = dateFormat.parse(BorderEvent.EVENING.toString());
            night = dateFormat.parse(BorderEvent.NIGHT.toString());
        } catch (ParseException e) {
            log.error("Parse exception", e);
        }

        if(current.after(morning) && current.before(day)){
            log.info("Create  -> Good morning, World!");
            return "MORNING";
        }
        else if (current.after(day) && current.before(evening)){
            log.info("Create -> Good day, World!");
            return "DAY";
        }
        else if (current.after(evening) && current.before(night)){
            log.info("Create -> Good evening, World!");
            return "EVENING";
        }
        else
            log.info("Create -> Good night, World!");
            return "NIGHT";
}

    public static Builder newBuilder(){
        return new Event().new Builder();
    }

    public class Builder{

        public Builder() {

        }

        public Event build(){
            return Event.this;
        }

    }



}