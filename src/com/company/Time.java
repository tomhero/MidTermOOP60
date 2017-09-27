package com.company;

/**
 * Time
 */
public class Time {

    private int hr;
    private int min;

    public Time() {
    }

    /**
     * for 24 hr format
     * */
    public void setTime(int hr, int min) {
        if (hr >= 0 && hr <= 23) {
            this.hr = hr;
            this.min = min;
        } else {
            System.err.println("Invalid time pattern!!");
        }
    }

    /**
     * for 12 hr format
     * */
    public void setTime(int hr, int min, String apm) {
        this.hr = hr;
        this.min = min;
        if (apm.equals("P") && hr <= 12 && hr >= 1) {
            if (hr == 12) {
                this.hr = 12;
            } else {
                this.hr = hr + 12;
            }
        } else if (apm.equals("A") && hr <= 12 && hr >= 1) {
            if (hr == 12) {
                this.hr = 0;
            } else {
                this.hr = hr;
            }
        } else {
            System.err.println("Invalid time pattern!!");
        }
    }

    public void printTime() {
        // print time in 24 hr format
        System.out.printf("Time -> %02d : %02d\n", hr, min);
    }

    public void printTime(boolean apmOrNot) {
        if (apmOrNot) {
            // print time in 12 hr format
            if (hr == 0) {
                System.out.printf("Time -> %d : %02d AM\n", (hr + 12), min);
            } else if (hr < 12) {
                System.out.printf("Time -> %02d : %02d AM\n", hr, min);
            } else if (hr == 12) {
                System.out.printf("Time -> %02d : %02d PM\n", hr, min);
            } else {
                System.out.printf("Time -> %02d : %02d PM\n", (hr - 12), min);
            }
        } else {
            System.err.println("Please input true value");
        }
    }
}
