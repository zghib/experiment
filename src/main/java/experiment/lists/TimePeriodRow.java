package experiment.lists;



import org.joda.time.DateTime;

public class TimePeriodRow implements Cloneable, Comparable<TimePeriodRow> {

    private final DateTime periodStartDate;



    public TimePeriodRow(DateTime startDate) {
        periodStartDate = startDate;
    }


    public DateTime getPeriodStartDate() {
        return periodStartDate;
    }



    public int compareTo(TimePeriodRow o) {
        if (o.periodStartDate.isBefore(periodStartDate)) {
            return 1;
        }
        return -1;
    }
}
