package experiment.royhill;

import java.awt.Color;
import java.math.BigDecimal;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

public class Main {

    public static void main(String[] args) {
        BigDecimal periodLength = new BigDecimal(7);

        DateTime date = DateTime.parse("01/01/2016 00:00:00",
                                       DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss"));

        TimePeriodProfileRow row = new TimePeriodProfileRow("", "", periodLength,BigDecimal.ZERO,new BigDecimal(3), date);
        row.resetPeriods();
        System.out.println(periodLength);
        for(TimePeriodRow r: row.getPeriods()){
            System.out.println(r.getPeriodStartDate()+" - " + r.getPeriodEndDate());
        }

        Color nColor = new Color(-14080);
        Color nqColor = new Color(-16711681);

    }
}
