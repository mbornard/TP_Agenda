package agenda;

import java.time.LocalDate;

import java.util.*;
/**
 * Description : An agenda that stores events
 */
public class Agenda {
    /**
     * Adds an event to this agenda
     *
     * @param e the event to add
     */
	private ArrayList<Event> theEvents = new ArrayList<Event>();

    public void addEvent(Event e) {
    	theEvents.add(e);
    }

    /**
     * Computes the events that occur on a given day
     *
     * @param day the day toi test
     * @return and iteraror to the events that occur on that day
     */
    public List<Event> eventsInDay(LocalDate day) {
    	List<Event> list = new ArrayList<Event> ();
    	for (Event e : theEvents) {
    		if(e.isInDay(day)) list.add(e);
    	}
    	return list;
    }
    
    /**
     * Trouver les événements de l'agenda en fonction de leur titre
     * @param title le titre à rechercher
     * @return les événements qui ont le même titre
     */
    public List<Event> findByTitle(String title) {
        List<Event> list = new ArrayList<>() ;
        for(Event e : theEvents) {
        	if(e.getTitle().equals(title)) list.add(e);
        }
        return list;
    }
    


}
