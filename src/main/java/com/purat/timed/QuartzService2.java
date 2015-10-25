package com.purat.timed;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Calendar;

/**
 * Created by compurat on 10/23/15.
 */
@Component
public class QuartzService2 {
    @Scheduled(cron = "5-59/20 * * * * ?")
    public void timer() {
        WriteTimerData writeTimerData = new WriteTimerData(Calendar.getInstance().getTime() + " Running QuartService2");
        writeTimerData.write();
    }
}
