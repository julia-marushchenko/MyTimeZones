/**
 *  Java program to demonstrate using TimeZone.
 */

package com.mycallendar;
import java.util.TimeZone;

/**
 *  Main class.
 */
public class Main {

    // Main method to start java program.
    public static void main(String[] args) {

        // Getting all the timezones.
        String[] availableTimeZones = TimeZone.getAvailableIDs();

        // Printing time zones to console.
        for (int index = 0; index < availableTimeZones.length; index++) {

            System.out.println("Time Zone: " + availableTimeZones[index]);

        }

        // Printing total number of available time zones.
        System.out.println("Available number of time zones: " + availableTimeZones.length); // Output: 632

    }
}