package com.purat.timed;

/**
 * Created by compurat on 10/25/15.
 */
public class WriteTimerData {
    private String data = "";

    public WriteTimerData(String data) {
        this.data = data;
    }

    public void write() {
        synchronized (data) {
            System.out.println(data);
        }
    }
}
;