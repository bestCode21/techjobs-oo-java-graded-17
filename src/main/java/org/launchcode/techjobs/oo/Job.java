package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    public Job(){
        id = nextId;
        nextId++;
    }
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this(); // Calls the first constructor to initialize the id field.
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


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




    @Override
    public String toString() {
        String nameString = (name == null || name.isEmpty()) ? "Data not available" : name;
        String employerString = (employer == null || employer.toString().isEmpty()) ? "Data not available" : employer.toString();
        String locationString = (location == null || location.toString().isEmpty()) ? "Data not available" : location.toString();
        String positionTypeString = (positionType == null || positionType.toString().isEmpty()) ? "Data not available" : positionType.toString();
        String coreCompetencyString = (coreCompetency == null || coreCompetency.toString().isEmpty()) ? "Data not available" : coreCompetency.toString();

        return System.lineSeparator() +
                "ID: " + id + System.lineSeparator() +
                "Name: " + nameString + System.lineSeparator() +
                "Employer: " + employerString + System.lineSeparator() +
                "Location: " + locationString + System.lineSeparator() +
                "Position Type: " + positionTypeString + System.lineSeparator() +
                "Core Competency: " + coreCompetencyString + System.lineSeparator();
    }


}
