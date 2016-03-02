package experiment.lists;

import java.util.Collections;
import java.util.List;

import com.google.common.collect.Lists;
import org.joda.time.DateTime;

public class CompareList {
    public static void main(String [] a){
        List<TimePeriodRow> rows = Lists.newArrayList();
        TimePeriodRow row1 = new TimePeriodRow(DateTime.now().plusDays(2));
        TimePeriodRow row2 = new TimePeriodRow(DateTime.now().plusDays(-2));
        TimePeriodRow row3 = new TimePeriodRow(DateTime.now().plusDays(-2));
        rows.add(row1);
        rows.add(row2);
        rows.add(row3);
        TimePeriodRow row6 = rows.get(3);
        Collections.sort(rows);
        for(TimePeriodRow row: rows){
            System.out.println(row.getPeriodStartDate());
        }
    }
}
