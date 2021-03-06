/**
 * This class stores an aggregate of visits to a particular place. It stores the name of the place
 * and the total time spent at that duration.
 * */

package com.andela.movit.models;

public class Visit {

    private String placeName;

    private long duration;

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }
}
