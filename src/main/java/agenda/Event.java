package agenda;

import java.time.*;

public class Event {

    /**
     * The myTitle of this event
     */
    private String myTitle;
    
    /**
     * The starting time of the event
     */
    private LocalDateTime myStart;

    /**
     * The durarion of the event 
     */
    private Duration myDuration;


    /**
     * Constructs an event
     *
     * @param title the title of this event
     * @param start the start time of this event
     * @param duration the duration of this event
     */
    public Event(String title, LocalDateTime start, Duration duration) {
        this.myTitle = title;
        this.myStart = start;
        this.myDuration = duration;
    }

    /**
     * Tests if an event occurs on a given day
     *
     * @param aDay the day to test
     * @return true if the event occurs on that day, false otherwise
     */
    public boolean isInDay(LocalDate aDay) {
    	return ((this.myStart.getDayOfYear() == aDay.getDayOfYear() 
    			&& this.myStart.getYear() == aDay.getYear()) 
    			|| (aDay.isBefore(ChronoLocalDate.from(this.getStart().plus(getDuration())))
    					&& aDay.isAfter(ChronoLocalDate.from(this.getStart()))) || (this.getStart().plus(getDuration()).getDayOfYear() == aDay.getDayOfYear() && this.getStart().plus(getDuration()).getYear() == aDay.getYear()));
    	//return (this.getStart().getYear() ==  aDay.getYear()) && (this.getStart().getDayOfYear() == aDay.getDayOfYear());
        // TODO : implémenter cette méthode
        //throw new UnsupportedOperationException("Pas encore implémenté");
    }
   
    /**
     * @return the myTitle
     */
    public String getTitle() {
        return myTitle;
    }

    /**
     * @return the myStart
     */
    public LocalDateTime getStart() {
        return myStart;
    }


    /**
     * @return the myDuration
     */
    public Duration getDuration() {
        return myDuration;
    }

   
    
}
