package org.launchcode.techjobs_oo;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;



    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the   //  other five fields. The second constructor should also call the first in order to initialize the 'id' field.

    public Job() {      //this is a constructor
        id = nextId;
        nextId++;
    }


    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID and id.

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Employer getEmployer() {
        return employer;
    }
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }
    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    public PositionType getPositionType() {
        return positionType;
    }
    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }
    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }
    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }


    // TODO: HERE IS WHERE I AM CODING THE TOO STRING METHOD

    @Override
    public String toString() {

        String concatted = "";

        String zero;
        String one;
        String two;
        String three;
        String four;
        String five;

        if (true) {
           zero = "ID: " + id + "\n";
        }

        if (this.name.length() == 0 || this.name == null || this.name.equals("")) {
            one = "Name: Data Not Available" + "\n";
        } else {
          one = "Name: " + name + "\n";
        }

        if (getEmployer().toString().length() == 0 || this.employer == null || this.employer.equals("")) {
            two = "Employer: Data Not Available" + "\n";
        } else {
            two = "Employer: " + employer + "\n";
        }

        if (getLocation().toString().length() == 0 || this.location == null || this.location.equals("")) {
            three = "Location: Data Not Available" + "\n";
        } else {
            three = "Location: " + location + "\n";
        }

        if (getPositionType().toString().length() == 0 || this.positionType == null || this.positionType.equals("") ) {
            four = "Position: Data Not Available" + "\n";
        } else {
            four = "PositionType: " + positionType + "\n";
        }

        if (getCoreCompetency().toString().length() == 0 || this.coreCompetency == null || this.coreCompetency.equals("") ) {
            five = "Core Competency: Data Not Available" + "\n";
        } else {
            five = "CoreCompetency: " + coreCompetency + "\n";
        }

        return concatted.concat("   " + "\n").concat(zero).concat(one).concat(two).concat(three).concat(four).concat(five).concat("   ");
    }




}