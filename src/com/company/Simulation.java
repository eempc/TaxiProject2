package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Run the simulation by asking a collection of actors to act.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class Simulation {
    private List<Actor> actors;
    private int step;
    private TaxiCompany company;
    private PassengerSource passenger;

    /**
     * Create the initial set of actors for the simulation.
     */
    public Simulation() {
        actors = new LinkedList<>();
        step = 0;
        City city = new City();
        company = new TaxiCompany(city);
        PassengerSource source = new PassengerSource(city, company);

        actors.addAll(company.getVehicles());
        actors.add(source);
        actors.add(new CityGUI(city));
    }

    /**
     * Run the simulation for a fixed number of steps.
     * Pause after each step to allow the GUI to keep up.
     */
    public void run() {
        for (int i = 0; i < 500; i++) {
            step++;
            step();
            wait(10);
        }

        System.out.println("Total number of steps is: " + step);

        // At the end of the simulation, go through the company's vehicles and retrieve the counts for the amount of
        // steps where the vehicle was (1) travelling to a passenger, (2) travelling to a destination, (and (3) when it
        // was idle)
        List<Vehicle> vehicles = company.getVehicles();
        for (Vehicle v : vehicles) {
            String vehicleDetails = v.toString();
            int travelToP = v.getTravelToPassengerCount();
            int travelToD = v.getTravelToDestinationCount();
            double timeSpentToP = (double) travelToP / step * 100;
            double timeSpentToD = (double) travelToD / step * 100;
            String meow = String.format("Taxi ID: %s, to passenger count: %s (%.1f%%), to destination count: %s (%.1f%%)",
                    vehicleDetails, travelToP, timeSpentToP, travelToD, timeSpentToD);
            System.out.println("total number of taxis:");
            System.out.println(TaxiCompany.getNumberOfTaxis());
            System.out.println("total missed pickups:");
            System.out.println(PassengerSource.getMissedPickups());
            System.out.println("total steps idle count:");
            System.out.println(v.getIdleCount());
            System.out.println(meow);
        }
    }

    /**
     * Take a single step of the simulation.
     */
    public void step() {
        for (Actor actor : actors) {
            actor.act();
        }
    }

    /**
     * Wait for a specified number of milliseconds before finishing.
     * This provides an easy way to cause a small delay.
     *
     * @param milliseconds The number of milliseconds to wait.
     */
    private void wait(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            // ignore the exception
        }
    }
}
