
package org.launchcode.techjobs_oo.Tests;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

import org.launchcode.techjobs_oo.*;

import java.util.ArrayList;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertFalse;


public class JobTest {

//    Job new_job;
//
//    @Before
//    public void createJobObject() {
//        new_job = new Job("analyst", "bhg", "stl", "mid", "java");
//    }

    @Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }



    @Test
    public void testSettingJobID() {

//        Job job_One = new Job("Director", new Employer("OnionNews"), new Location("Chicago"), new PositionType("CameraMan"), new CoreCompetency("Cinema"));
//        Job job_Two = new Job("Writer", new Employer("IG"), new Location("Atlanta"), new PositionType("QualityControl"), new CoreCompetency("Scripting"));
//        System.out.println("Here is the first Job:  " + job_First.getId());
//        System.out.println("Here is the second Job:  " + job_Second.getId());

        Job job_First = new Job();
        Job job_Second = new Job();
        assertEquals((job_First.getId()+1), job_Second.getId(), .01);  // THIS SHOWS THAT THE ID FIELD IS WORKING, GIVING DIFF ID's
        assertFalse(job_First.getId() == job_Second.getId());       // THIS RETURNS FALSE, WHEN THEY ARE COMPARED AS EQUALS

    }

    @Override
    public String toString() {
        return "JobTest{}";
    }

    @Test
    public void testJobConstructorSetsAllFields() {

       Job job_Third = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

//        System.out.println("This is the value output:  " + job_Third.getEmployer());

        String employerToString = job_Third.getEmployer().toString();
        String locationToString = job_Third.getLocation().toString();
        String positionToString = job_Third.getPositionType().toString();
        String coreToString = job_Third.getCoreCompetency().toString();

        assertTrue(job_Third.getName() == "Product tester");
        assertTrue(employerToString == "ACME");
        assertTrue(locationToString == "Desert");
        assertTrue(positionToString == "Quality control");
        assertTrue(coreToString == "Persistence");
        assertEquals(5, job_Third.getId(), .01);

    }



    @Test
    public void testJobsForEquality() {

//        Job job_One = new Job("Director", new Employer("OnionNews"), new Location("Chicago"), new PositionType("CameraMan"), new CoreCompetency("Cinema"));
//        Job job_Two = new Job("Writer", new Employer("IG"), new Location("Atlanta"), new PositionType("QualityControl"), new CoreCompetency("Scripting"));
//        System.out.println("Here is the first Job:  " + job_First.getId());
//        System.out.println("Here is the second Job:  " + job_Second.getId());

        Job job_FirstOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job_SecondOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

//        System.out.println("Here is the first Job ID:  " + job_FirstOne.getId());
//        System.out.println("Here is the first Job ID:  " + job_SecondOne.getId());

        assertFalse(job_FirstOne.getId() == job_SecondOne.getId());

    }


    @Test
    public void theToStringTest() {

        Job job_forTest = new Job("Product Tester", new Employer("ACME"), new Location(""), new PositionType(""), new CoreCompetency("Persistence"));
        Job job_forTestTwo = job_forTest;

//        System.out.println(job_forTest);           // THESE TWO ARE THE EXACT SAME OBJECTS, BUT IF WE TRIM AND REMOVE SPACES ON ONE THEN EQUALITY WILL BE FALSE
//        System.out.println(job_forTestTwo);

// THIS TESTS THE SPACE, TAKE TWO OF THE SAME OBJECTS, TRIMS ONE, IF THERE WAS NO SPACE THEY WOULD STILL BE EQUAL BUT WITH SPACE THE TRIM MAKES THEM DIFF
        assertFalse(job_forTest.toString().trim() == job_forTestTwo.toString());

    }

    @Test
    public void doesItReturnValues() {

        Job job_forTest = new Job("Product Tester", new Employer("ACME"), new Location("St. Louis"), new PositionType("Manager"), new CoreCompetency("Electrical"));

        assertTrue(job_forTest.toString().contains("Product Tester"));
        assertTrue(job_forTest.toString().contains("ACME"));
        assertTrue(job_forTest.toString().contains("St. Louis"));
        assertTrue(job_forTest.toString().contains("Manager"));
        assertTrue(job_forTest.toString().contains("Electrical"));

    }




}
