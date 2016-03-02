package experiment.royhill;

import java.awt.Color;

import org.joda.time.DateTime;

public class TimePeriodRow implements Cloneable, Comparable<TimePeriodRow> {

    private Color color;
    private final DateTime periodStartDate;
    private final DateTime periodEndDate;


    public TimePeriodRow(DateTime startDate, DateTime endDate, Color color) {
        periodStartDate = startDate;
        periodEndDate = endDate;
        this.color = color;
    }


    public Color getColor() {
        return color;
    }


    public DateTime getPeriodStartDate() {
        return periodStartDate;
    }


    public DateTime getPeriodEndDate() {
        return periodEndDate;
    }


    public void setColor(Color color) {
        this.color = color;
    }

    public int compareTo(TimePeriodRow o) {
        if (o.periodStartDate.isBefore(periodStartDate)) {
            return 1;
        }
        return -1;
    }
}
