package experiment.royhill;

import java.awt.Color;
import java.math.BigDecimal;
import java.util.List;
import java.util.Random;

import org.joda.time.DateTime;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;

public class TimePeriodProfileRow implements Cloneable {

    private String entityId;
    private String name;
    private BigDecimal periodLength;
    private BigDecimal startOffset;
    private BigDecimal numberOfPeriods;
    private final DateTime scenarioStartDate;
    private final List<TimePeriodRow> timePeriods = Lists.newArrayList();
    private final List<BigDecimal> colors = Lists.newArrayList();


    public TimePeriodProfileRow(String entityId, String name, BigDecimal periodLength, BigDecimal startOffset, BigDecimal numberOfPeriods,
                                DateTime scenarioStartDate) {
        this.entityId = entityId;
        this.name = name;
        this.periodLength = periodLength;
        this.startOffset = startOffset;
        this.numberOfPeriods = numberOfPeriods;
        this.scenarioStartDate = scenarioStartDate;
    }


    public TimePeriodProfileRow(DateTime scenarioStartDate) {
        this.scenarioStartDate = scenarioStartDate;
    }


    public String getName() {
        return name;
    }


    public BigDecimal getStartDateOffset() {
        return startOffset;
    }


    public BigDecimal getNumberOfPeriods() {
        return numberOfPeriods;
    }


    public BigDecimal getPeriodLength() {
        return periodLength;
    }


    @Override
    public TimePeriodProfileRow clone() {
        try {
            return (TimePeriodProfileRow)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TimePeriodProfileRow that = (TimePeriodProfileRow)o;
        return Objects.equal(name, that.name);
    }


    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }


    public String getEntityId() {
        return entityId;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setStartDateOffset(BigDecimal startDateOffset) {
        this.startOffset = startDateOffset;
    }


    public void setNumberOfPeriods(BigDecimal numberOfPeriods) {
        this.numberOfPeriods = numberOfPeriods;
    }


    public void setPeriodLength(BigDecimal periodLength) {
        this.periodLength = periodLength;
    }


    public List<TimePeriodRow> getPeriods() {
        return timePeriods;
    }


    public void resetPeriods() {
        timePeriods.clear();
        for (int i = 0; i < numberOfPeriods.intValue(); i++) {
            int start = startOffset.intValue() + i * (periodLength.intValue());
            DateTime startDate = scenarioStartDate.plusDays(start);
            DateTime endDate = startDate.plusDays(periodLength.intValue()).minusMillis(1);
            TimePeriodRow row = new TimePeriodRow(startDate, endDate, getColor(i));
            timePeriods.add(row);
        }
    }


    private Color getColor(int i) {
        try {
            BigDecimal colorRgb = colors.get(i);
            if (colorRgb != null) {
                return new Color(colorRgb.intValue());
            }
        } catch (IndexOutOfBoundsException ex) {
            // means that period "i" disappeared and need to return Random Color.
        }
        return getRandomColor();
    }


    private Color getRandomColor() {
        Random rand = new Random();
        int redValue = rand.nextInt(255);
        int greenValue = rand.nextInt(255);
        int blueValue = rand.nextInt(255);
        return new Color(redValue, greenValue, blueValue);
    }


    public void setPeriodColors(List<BigDecimal> colors) {
        this.colors.clear();
        this.colors.addAll(colors);
        resetPeriods();
    }
}
