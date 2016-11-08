package edu.ggc.john.eventprototype;

import java.util.ArrayList;

/**
 * Created by Aaron on 11/1/2016.
 */
public class Event
{
    private String eventName;
    private String eventDate;
    private String startTime;
    private String endTime;
    private ArrayList<Contacts> guestList;

    public Event ()
    {
        super();
    }

    public Event (String eventName, String eventDate, String startTime, String endTime)
    {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.startTime = startTime;
        this.endTime = endTime;
        guestList = null;
    }

    public Event (String eventName, String eventDate, String startTime, String endTime, ArrayList<Contacts>guestList)
    {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.guestList = guestList;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public ArrayList<Contacts> getGuestList() {
        return guestList;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setGuestList(ArrayList<Contacts> guestList) {
        this.guestList = guestList;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    @Override
    public String toString() {
        return this.eventName + ". " + this.eventDate;
    }
}
