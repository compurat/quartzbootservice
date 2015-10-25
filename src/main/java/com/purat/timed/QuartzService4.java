package com.purat.timed;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Calendar;

/**
 * Created by compurat on 10/25/15.
 */
@Component
public class QuartzService4 {
    @Scheduled(cron = "5-59/30 * * * * ?")
    public void timer() {
        WriteTimerData writeTimerData = new WriteTimerData(Calendar.getInstance().getTime() + " Running QuartService4");
        writeTimerData.write();
    }

}
