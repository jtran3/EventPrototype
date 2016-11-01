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
        eventName = "";
        eventDate = "";
        startTime = "";
        endTime = "";
        guestList = null;
    }

    public Event (String eventName, String eventDate, String startTime, String endTime)
    {
        eventName = this.eventName;
        eventDate = this.eventDate;
        startTime = this.startTime;
        endTime = this.endTime;
        guestList = null;
    }

    public Event (String eventName, String eventDate, String startTime, String endTime, ArrayList<Contacts>guestList)
    {
        eventName = this.eventName;
        eventDate = this.eventDate;
        startTime = this.startTime;
        endTime = this.endTime;
        guestList = this.guestList;
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
}
