import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant7 = dateTime4.toInstant();
        org.joda.time.DateTime.Property property8 = dateTime4.weekOfWeekyear();
        org.joda.time.DateTime dateTime9 = property8.roundHalfEvenCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant7", (dateTime4.compareTo(instant7) == 0) == dateTime4.equals(instant7));
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant7 = dateTime4.toInstant();
        org.joda.time.DateTime.Property property8 = dateTime4.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) '4', dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekOfWeekyear(10);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) '4', dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.withZoneRetainFields(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTime25.getZone();
        org.joda.time.DateTime dateTime27 = dateTime18.withZone(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime15.toMutableDateTime(dateTimeZone26);
        org.joda.time.DateTime dateTime30 = dateTime15.plusDays(292278993);
        long long31 = dateTime15.getMillis();
        org.joda.time.DateTime.Property property32 = dateTime15.weekyear();
        int int33 = dateTime15.getMillisOfDay();
        int int34 = property8.compareTo((org.joda.time.ReadableInstant) dateTime15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant7", (dateTime4.compareTo(instant7) == 0) == dateTime4.equals(instant7));
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant7 = dateTime4.toInstant();
        org.joda.time.DateTime.Property property8 = dateTime4.weekOfWeekyear();
        int int9 = property8.getMinimumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant7", (dateTime4.compareTo(instant7) == 0) == dateTime4.equals(instant7));
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant7 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime10 = dateTime4.withDurationAdded((long) (-136769231), 23609);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.withPeriodAdded(readablePeriod11, 356);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant7", (dateTime4.compareTo(instant7) == 0) == dateTime4.equals(instant7));
    }
}

