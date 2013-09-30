package alecta;

import java.sql.Time;

/*
 * Keeps the daily attendance details of the employee
 */

public class DailyAttendance {
    private Time arrival;
    private Time departure;
    private double hours;
    private boolean leave;
    private boolean present;

    public boolean isLeave() {
        return leave;
    }

    public boolean isPresent() {
        return present;
    }

    public double getHours() {
        hours = (departure.getTime() - arrival.getTime()) / 3600.00;
        return hours;
    }       
}
