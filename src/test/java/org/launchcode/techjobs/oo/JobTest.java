package org.launchcode.techjobs.oo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


import org.junit.Test;

public class JobTest {
    //TODO: Create your unit tests here


    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();


        assertNotEquals(job1.getId(), job2.getId());
    }

    //TODO: Create your unit tests here
    @Test
    public void testJobConstructorSetsAllFields(){
        Job JobCheck = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
                //
                assertTrue(JobCheck instanceof Job);
                assertEquals("Product tester",JobCheck.getName());

                assertTrue(JobCheck.getEmployer() instanceof Employer);
                assertEquals("ACME",JobCheck.getEmployer().getValue());

                assertTrue(JobCheck.getLocation() instanceof Location);
                assertEquals("Desert",JobCheck.getLocation().getValue());

                assertTrue(JobCheck.getPositionType() instanceof PositionType);
                assertEquals("Quality control",JobCheck.getPositionType().getValue());

                assertTrue(JobCheck.getCoreCompetency() instanceof CoreCompetency);
                assertEquals("Persistence",JobCheck.getCoreCompetency().getValue());
    }

    //TODO: Create your unit tests here
    @Test
    public void testJobsForEquality(){
        Job JobCheck1 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        Job JobCheck2 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        // Check that job1 and job2 are not equal, even if their other fields match
        assertFalse(JobCheck1.equals(JobCheck2));

    }
    //TODO: Create your unit tests here

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job(); // Create a Job object

        // Get the output of the toString method
        String jobString = job.toString();

        // Check if the string starts and ends with a new line using System.lineSeparator()
        String newline = System.lineSeparator();
        assertEquals(newline, jobString.substring(0, newline.length()));
        assertEquals(newline, jobString.substring(jobString.length() - newline.length()));
    }
    //TODO: Create your unit tests here
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        // Get the output of the toString method
        String jobString = job.toString();

        // Check if the string contains the correct labels and data
        assertTrue(jobString.contains("ID: "));
        assertTrue(jobString.contains("Name: Product tester"));
        assertTrue(jobString.contains("Employer: ACME"));
        assertTrue(jobString.contains("Location: Desert"));
        assertTrue(jobString.contains("Position Type: Quality control"));
        assertTrue(jobString.contains("Core Competency: Persistence"));
    }


    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job("", null, null, null, null); // All fields empty

        // Get the output of the toString method
        String jobString = job.toString();

        // Check if the string indicates that the fields are empty
        assertTrue(jobString.contains("Name: Data not available"));
        assertTrue(jobString.contains("Employer: Data not available"));
        assertTrue(jobString.contains("Location: Data not available"));
        assertTrue(jobString.contains("Position Type: Data not available"));
        assertTrue(jobString.contains("Core Competency: Data not available"));

    }

}
