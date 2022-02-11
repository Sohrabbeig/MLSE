import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime5 = dateTime2.minusDays((int) (byte) 10);
        org.joda.time.DateTime.Property property6 = dateTime5.weekyear();
        int int7 = dateTime5.getDayOfWeek();
        org.joda.time.DateTime dateTime9 = dateTime5.withMillisOfSecond(53);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime8 = property7.getDateTime();
        org.joda.time.DateTime dateTime9 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime10 = dateTime8.withEarlierOffsetAtOverlap();
        int int11 = dateTime10.getDayOfMonth();
        org.joda.time.DateTime dateTime13 = dateTime10.withCenturyOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.plus(readablePeriod14);
        org.joda.time.LocalDate localDate16 = dateTime10.toLocalDate();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime10.minus(readableDuration17);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime8 = property7.withMinimumValue();
        org.joda.time.DateTime.Property property9 = dateTime8.centuryOfEra();
        org.joda.time.DateTime.Property property10 = dateTime8.era();
        boolean boolean11 = dateTime8.isEqualNow();
        org.joda.time.Chronology chronology12 = dateTime8.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTime8.withTime(15, (int) (byte) -1, 600052, 15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        int int4 = property3.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) '4', dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.withZoneRetainFields(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime14.getZone();
        org.joda.time.DateTime dateTime16 = dateTime7.withZone(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '4', dateTimeZone18);
        org.joda.time.LocalDate localDate20 = dateTime19.toLocalDate();
        org.joda.time.DateTime dateTime21 = dateTime16.withFields((org.joda.time.ReadablePartial) localDate20);
        int int22 = property3.compareTo((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.DateTime dateTime23 = property3.withMaximumValue();
        org.joda.time.DurationField durationField24 = property3.getDurationField();
        org.joda.time.DateTime dateTime25 = property3.roundFloorCopy();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime8.monthOfYear();
        boolean boolean11 = dateTime8.isAfter((long) (-1));
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime8 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (-1));
        boolean boolean11 = dateTime6.isAfter((org.joda.time.ReadableInstant) dateTime10);
        int int12 = dateTime10.getHourOfDay();
        org.joda.time.DateTime.Property property13 = dateTime10.secondOfDay();
        org.joda.time.DateTime dateTime15 = dateTime10.withYear(6000052);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTime10.withHourOfDay((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 23 + "'", int12 == 23);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime5 = dateTime2.minusDays((int) (byte) 10);
        org.joda.time.DateTime dateTime7 = dateTime5.withSecondOfMinute(10);
        org.joda.time.DateTime dateTime8 = dateTime5.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMonths(1970);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = dateTime11.toString(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2134-02-22T00:00:00.000Z" + "'", str13, "2134-02-22T00:00:00.000Z");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        int int9 = dateTime8.getDayOfWeek();
        org.joda.time.DateTime.Property property10 = dateTime8.year();
        org.joda.time.LocalDateTime localDateTime11 = dateTime8.toLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) '4', dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = dateTime14.withZoneRetainFields(dateTimeZone17);
        org.joda.time.DateTime.Property property19 = dateTime18.millisOfSecond();
        org.joda.time.DateTime dateTime20 = property19.getDateTime();
        org.joda.time.DateTime dateTime21 = dateTime20.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology22 = dateTime21.getChronology();
        org.joda.time.DateTime dateTime23 = dateTime8.toDateTime(chronology22);
        org.joda.time.DateTime.Property property24 = dateTime23.year();
        org.joda.time.DateTime dateTime26 = dateTime23.minusMillis(1972);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime5 = dateTime2.minusDays((int) (byte) 10);
        org.joda.time.DateTime.Property property6 = dateTime5.weekyear();
        int int7 = dateTime5.getDayOfWeek();
        org.joda.time.DateTime dateTime9 = dateTime5.withDayOfYear((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime12 = dateTime5.withPeriodAdded(readablePeriod10, 244);
        org.joda.time.DateTime.Property property13 = dateTime12.centuryOfEra();
        org.joda.time.DateTime dateTime14 = property13.roundHalfFloorCopy();
        org.joda.time.DurationField durationField15 = property13.getLeapDurationField();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) '4', dateTimeZone17);
        org.joda.time.DateTime.Property property19 = dateTime18.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) '4', dateTimeZone21);
        org.joda.time.DateTime dateTime23 = dateTime22.withEarlierOffsetAtOverlap();
        long long24 = property19.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (byte) -1, chronology27);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) '4', dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = dateTime31.withZoneRetainFields(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) '4', dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = dateTime38.withZoneRetainFields(dateTimeZone41);
        org.joda.time.DateTime.Property property43 = dateTime42.millisOfSecond();
        org.joda.time.DateTime dateTime44 = property43.withMinimumValue();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = dateTime44.toMutableDateTime(chronology45);
        boolean boolean47 = dateTime35.isEqual((org.joda.time.ReadableInstant) dateTime44);
        boolean boolean48 = dateTime28.equals((java.lang.Object) dateTime35);
        org.joda.time.DateTime dateTime50 = dateTime35.minusMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) '4', dateTimeZone52);
        org.joda.time.DateTime dateTime55 = dateTime53.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateTime dateTime57 = dateTime53.withZoneRetainFields(dateTimeZone56);
        org.joda.time.DateTime.Property property58 = dateTime57.millisOfSecond();
        org.joda.time.DateTime dateTime59 = property58.getDateTime();
        org.joda.time.DateTime dateTime60 = dateTime59.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology61 = dateTime60.getChronology();
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((java.lang.Object) dateTime35, chronology61);
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) (short) 0, chronology61);
        boolean boolean64 = dateTime22.equals((java.lang.Object) chronology61);
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime((java.lang.Object) durationField15, chronology61);
        java.lang.String str67 = dateTime65.toString("1965");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNull(durationField15);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "1965" + "'", str67, "1965");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTime8.getZone();
        org.joda.time.DateTime dateTime11 = dateTime8.minusDays((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '4', dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = dateTime15.withZoneRetainFields(dateTimeZone18);
        org.joda.time.DateTime.Property property20 = dateTime19.millisOfSecond();
        org.joda.time.DateTime dateTime21 = property20.getDateTime();
        org.joda.time.DateTime dateTime22 = dateTime21.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology23 = dateTime22.getChronology();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 0, chronology23);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime11.toMutableDateTime(chronology23);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(58990464000000L, chronology23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(5, 65, 999, 1965, 35, chronology23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1965 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(mutableDateTime25);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        int int9 = dateTime8.getDayOfWeek();
        org.joda.time.DateTime.Property property10 = dateTime8.year();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) '4', dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = dateTime13.withZoneRetainFields(dateTimeZone16);
        org.joda.time.DateTime.Property property18 = dateTime17.millisOfSecond();
        org.joda.time.DateTime dateTime19 = property18.withMinimumValue();
        org.joda.time.DateTime dateTime21 = dateTime19.plusMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) '4', dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = dateTime24.withZoneRetainFields(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime24.minusMonths((int) '4');
        org.joda.time.DateTime.Property property31 = dateTime24.dayOfYear();
        int int32 = dateTime24.getYear();
        org.joda.time.DateTime dateTime34 = dateTime24.withWeekOfWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) '4', dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = dateTime37.withZoneRetainFields(dateTimeZone40);
        org.joda.time.DateTime.Property property42 = dateTime41.millisOfSecond();
        org.joda.time.DateTime dateTime43 = property42.withMinimumValue();
        org.joda.time.DateTime.Property property44 = dateTime43.centuryOfEra();
        org.joda.time.DateTime.Property property45 = dateTime43.era();
        boolean boolean46 = dateTime43.isEqualNow();
        org.joda.time.Chronology chronology47 = dateTime43.getChronology();
        org.joda.time.DateTime dateTime48 = dateTime24.toDateTime(chronology47);
        org.joda.time.DateTime dateTime49 = dateTime19.withChronology(chronology47);
        org.joda.time.DateTime dateTime50 = dateTime8.withChronology(chronology47);
        org.joda.time.DateTime.Property property51 = dateTime50.dayOfWeek();
        org.joda.time.DateTime dateTime53 = dateTime50.withCenturyOfEra(999);
        org.joda.time.DateTime.Property property54 = dateTime50.minuteOfDay();
        long long55 = property54.remainder();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1970 + "'", int32 == 1970);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 52L + "'", long55 == 52L);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.plus(readablePeriod9);
        org.joda.time.DateTime.Property property11 = dateTime10.dayOfWeek();
        org.joda.time.DateTime dateTime13 = dateTime10.plusMonths(31);
        int int14 = dateTime10.getSecondOfDay();
        org.joda.time.TimeOfDay timeOfDay15 = dateTime10.toTimeOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(timeOfDay15);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        int int9 = dateTime8.getDayOfWeek();
        org.joda.time.DateTime.Property property10 = dateTime8.year();
        org.joda.time.DateTime dateTime12 = dateTime8.withWeekyear((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '4', dateTimeZone14);
        org.joda.time.DateTime dateTime16 = dateTime15.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime18 = dateTime16.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) '4', dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = dateTime21.withZoneRetainFields(dateTimeZone24);
        org.joda.time.DateTime.Property property26 = dateTime25.millisOfSecond();
        boolean boolean27 = dateTime16.isEqual((org.joda.time.ReadableInstant) dateTime25);
        boolean boolean28 = dateTime8.isBefore((org.joda.time.ReadableInstant) dateTime16);
        int int29 = dateTime16.getEra();
        org.joda.time.DateTime.Property property30 = dateTime16.minuteOfHour();
        org.joda.time.DateTime dateTime32 = dateTime16.plusDays(50);
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.plus(readableDuration33);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekOfWeekyear(10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = dateTime6.toString(dateTimeFormatter7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) -1, chronology10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) '4', dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = dateTime14.withZoneRetainFields(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) '4', dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = dateTime21.withZoneRetainFields(dateTimeZone24);
        org.joda.time.DateTime.Property property26 = dateTime25.millisOfSecond();
        org.joda.time.DateTime dateTime27 = property26.withMinimumValue();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime27.toMutableDateTime(chronology28);
        boolean boolean30 = dateTime18.isEqual((org.joda.time.ReadableInstant) dateTime27);
        boolean boolean31 = dateTime11.equals((java.lang.Object) dateTime18);
        org.joda.time.DateTime dateTime33 = dateTime18.minusMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) '4', dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime36.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = dateTime36.withZoneRetainFields(dateTimeZone39);
        org.joda.time.DateTime.Property property41 = dateTime40.millisOfSecond();
        org.joda.time.DateTime dateTime42 = property41.getDateTime();
        org.joda.time.DateTime dateTime43 = dateTime42.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology44 = dateTime43.getChronology();
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((java.lang.Object) dateTime18, chronology44);
        org.joda.time.MutableDateTime mutableDateTime46 = dateTime6.toMutableDateTime(chronology44);
        org.joda.time.DateTime dateTime48 = dateTime6.withYearOfEra(70);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) '4', dateTimeZone50);
        org.joda.time.DateTime.Property property52 = dateTime51.dayOfYear();
        int int53 = dateTime51.getEra();
        boolean boolean54 = dateTime51.isEqualNow();
        org.joda.time.LocalDateTime localDateTime55 = dateTime51.toLocalDateTime();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) (byte) -1, chronology57);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((long) '4', dateTimeZone60);
        org.joda.time.DateTime dateTime63 = dateTime61.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateTime dateTime65 = dateTime61.withZoneRetainFields(dateTimeZone64);
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime((long) '4', dateTimeZone67);
        org.joda.time.DateTime dateTime70 = dateTime68.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateTime dateTime72 = dateTime68.withZoneRetainFields(dateTimeZone71);
        org.joda.time.DateTime.Property property73 = dateTime72.millisOfSecond();
        org.joda.time.DateTime dateTime74 = property73.withMinimumValue();
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.MutableDateTime mutableDateTime76 = dateTime74.toMutableDateTime(chronology75);
        boolean boolean77 = dateTime65.isEqual((org.joda.time.ReadableInstant) dateTime74);
        boolean boolean78 = dateTime58.equals((java.lang.Object) dateTime65);
        org.joda.time.DateTime dateTime80 = dateTime65.minusMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone81 = null;
        org.joda.time.DateTime dateTime82 = dateTime80.withZone(dateTimeZone81);
        org.joda.time.DateTimeZone dateTimeZone84 = null;
        org.joda.time.DateTime dateTime85 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone84);
        org.joda.time.DateTimeZone dateTimeZone86 = dateTime85.getZone();
        org.joda.time.DateTime dateTime88 = dateTime85.minusDays((int) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar89 = dateTime85.toGregorianCalendar();
        org.joda.time.DateTime.Property property90 = dateTime85.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType91 = property90.getFieldType();
        boolean boolean92 = dateTime82.isSupported(dateTimeFieldType91);
        org.joda.time.DateTime.Property property93 = dateTime51.property(dateTimeFieldType91);
        org.joda.time.DateTime.Property property94 = dateTime48.property(dateTimeFieldType91);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-03-05T01:40:00.052Z" + "'", str8, "1970-03-05T01:40:00.052Z");
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(mutableDateTime76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(dateTimeZone86);
        org.junit.Assert.assertNotNull(dateTime88);
        org.junit.Assert.assertNotNull(gregorianCalendar89);
        org.junit.Assert.assertNotNull(property90);
        org.junit.Assert.assertNotNull(dateTimeFieldType91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(property93);
        org.junit.Assert.assertNotNull(property94);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime3 = dateTime2.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime5 = dateTime3.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) '4', dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfSecond();
        boolean boolean14 = dateTime3.isEqual((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime.Property property15 = dateTime12.weekyear();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (byte) -1, chronology17);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) '4', dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = dateTime21.withZoneRetainFields(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) '4', dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = dateTime28.withZoneRetainFields(dateTimeZone31);
        org.joda.time.DateTime.Property property33 = dateTime32.millisOfSecond();
        org.joda.time.DateTime dateTime34 = property33.withMinimumValue();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = dateTime34.toMutableDateTime(chronology35);
        boolean boolean37 = dateTime25.isEqual((org.joda.time.ReadableInstant) dateTime34);
        boolean boolean38 = dateTime18.equals((java.lang.Object) dateTime25);
        org.joda.time.DateTime dateTime40 = dateTime25.minusMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = dateTime40.withZone(dateTimeZone41);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone46 = dateTime45.getZone();
        org.joda.time.DateTime dateTime48 = dateTime45.minusDays((int) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar49 = dateTime45.toGregorianCalendar();
        org.joda.time.DateTime.Property property50 = dateTime45.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = property50.getFieldType();
        boolean boolean52 = dateTime42.isSupported(dateTimeFieldType51);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime54 = dateTime12.withField(dateTimeFieldType51, 1965);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1965 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(gregorianCalendar49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(dateTimeZone3);
        int int6 = dateTime5.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.withZoneRetainFields(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime9.minusMonths((int) '4');
        int int16 = dateTime15.getDayOfWeek();
        org.joda.time.DateTime.Property property17 = dateTime15.year();
        long long18 = property17.remainder();
        java.util.Locale locale20 = null;
        org.joda.time.DateTime dateTime21 = property17.setCopy("65", locale20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) -1, chronology23);
        org.joda.time.LocalDateTime localDateTime25 = dateTime24.toLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) '4', dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = dateTime28.withZoneRetainFields(dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime28.minusMonths((int) '4');
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.plus(readablePeriod35);
        org.joda.time.DateTime.Property property37 = dateTime34.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTime40.getZone();
        org.joda.time.DateTime dateTime43 = dateTime40.minusDays((int) (byte) 10);
        org.joda.time.DateTime dateTime45 = dateTime43.withSecondOfMinute(10);
        java.util.Locale locale46 = null;
        java.util.Calendar calendar47 = dateTime45.toCalendar(locale46);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) '4', dateTimeZone49);
        org.joda.time.DateTime dateTime51 = dateTime50.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime53 = dateTime51.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) '4', dateTimeZone55);
        org.joda.time.DateTime dateTime58 = dateTime56.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = dateTime56.withZoneRetainFields(dateTimeZone59);
        org.joda.time.DateTime dateTime62 = dateTime56.minusMonths((int) '4');
        org.joda.time.DateTime.Property property63 = dateTime56.centuryOfEra();
        org.joda.time.DateTime dateTime64 = property63.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = property63.getFieldType();
        int int66 = dateTime51.get(dateTimeFieldType65);
        org.joda.time.DateTime.Property property67 = dateTime45.property(dateTimeFieldType65);
        org.joda.time.DateTime dateTime68 = property67.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime((long) '4', dateTimeZone70);
        org.joda.time.DateTime dateTime73 = dateTime71.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.DateTime dateTime75 = dateTime71.withZoneRetainFields(dateTimeZone74);
        org.joda.time.DateTimeZone dateTimeZone77 = null;
        org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone77);
        org.joda.time.DateTimeZone dateTimeZone79 = dateTime78.getZone();
        org.joda.time.DateTime dateTime80 = dateTime71.withZone(dateTimeZone79);
        org.joda.time.DateTime dateTime81 = dateTime68.withZone(dateTimeZone79);
        org.joda.time.DateTime dateTime82 = dateTime34.toDateTime(dateTimeZone79);
        org.joda.time.MutableDateTime mutableDateTime83 = dateTime24.toMutableDateTime(dateTimeZone79);
        org.joda.time.DateTime dateTime84 = dateTime21.withZoneRetainFields(dateTimeZone79);
        org.joda.time.MutableDateTime mutableDateTime85 = dateTime5.toMutableDateTime(dateTimeZone79);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 23656 + "'", int6 == 23656);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 20995200052L + "'", long18 == 20995200052L);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(calendar47);
        org.junit.Assert.assertEquals(calendar47.toString(), "java.util.GregorianCalendar[time=-863990000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=52,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=356,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=10,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTimeFieldType65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 19 + "'", int66 == 19);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(dateTimeZone79);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(mutableDateTime83);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(mutableDateTime85);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) -1, chronology1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) '4', dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime5.withZoneRetainFields(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) '4', dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = dateTime12.withZoneRetainFields(dateTimeZone15);
        org.joda.time.DateTime.Property property17 = dateTime16.millisOfSecond();
        org.joda.time.DateTime dateTime18 = property17.withMinimumValue();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime18.toMutableDateTime(chronology19);
        boolean boolean21 = dateTime9.isEqual((org.joda.time.ReadableInstant) dateTime18);
        boolean boolean22 = dateTime2.equals((java.lang.Object) dateTime9);
        org.joda.time.DateTime dateTime24 = dateTime9.minusMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) '4', dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = dateTime27.withZoneRetainFields(dateTimeZone30);
        org.joda.time.DateTime.Property property32 = dateTime31.millisOfSecond();
        org.joda.time.DateTime dateTime33 = property32.getDateTime();
        org.joda.time.DateTime dateTime34 = dateTime33.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology35 = dateTime34.getChronology();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((java.lang.Object) dateTime9, chronology35);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime36.toMutableDateTimeISO();
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(mutableDateTime37);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime3 = dateTime2.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime5 = dateTime3.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) '4', dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime8.minusMonths((int) '4');
        org.joda.time.DateTime.Property property15 = dateTime8.centuryOfEra();
        org.joda.time.DateTime dateTime16 = property15.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property15.getFieldType();
        int int18 = dateTime3.get(dateTimeFieldType17);
        org.joda.time.DateTime.Property property19 = dateTime3.millisOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = dateTime3.toString(dateTimeFormatter20);
        org.joda.time.DateTime dateTime22 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property23 = dateTime3.secondOfMinute();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19 + "'", int18 == 19);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str21, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime8 = property7.withMinimumValue();
        org.joda.time.DateTime.Property property9 = dateTime8.centuryOfEra();
        org.joda.time.DateTime.Property property10 = dateTime8.era();
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime8.toMutableDateTime();
        org.joda.time.DateTime.Property property12 = dateTime8.year();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime2.dayOfYear();
        int int10 = dateTime2.getYear();
        org.joda.time.DateTime dateTime12 = dateTime2.withWeekOfWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '4', dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = dateTime15.withZoneRetainFields(dateTimeZone18);
        org.joda.time.DateTime.Property property20 = dateTime19.millisOfSecond();
        org.joda.time.DateTime dateTime21 = property20.withMinimumValue();
        org.joda.time.DateTime.Property property22 = dateTime21.centuryOfEra();
        org.joda.time.DateTime.Property property23 = dateTime21.era();
        boolean boolean24 = dateTime21.isEqualNow();
        org.joda.time.Chronology chronology25 = dateTime21.getChronology();
        org.joda.time.DateTime dateTime26 = dateTime2.toDateTime(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime2.minusSeconds(244);
        java.util.GregorianCalendar gregorianCalendar29 = dateTime2.toGregorianCalendar();
        java.lang.String str30 = dateTime2.toString();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(gregorianCalendar29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str30, "1970-01-01T00:00:00.052Z");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime5 = dateTime2.minusDays((int) (byte) 10);
        org.joda.time.DateTime dateTime7 = dateTime5.withSecondOfMinute(10);
        java.util.Locale locale8 = null;
        java.util.Calendar calendar9 = dateTime7.toCalendar(locale8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) '4', dateTimeZone11);
        org.joda.time.DateTime dateTime13 = dateTime12.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime15 = dateTime13.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) '4', dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.withZoneRetainFields(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime18.minusMonths((int) '4');
        org.joda.time.DateTime.Property property25 = dateTime18.centuryOfEra();
        org.joda.time.DateTime dateTime26 = property25.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property25.getFieldType();
        int int28 = dateTime13.get(dateTimeFieldType27);
        org.joda.time.DateTime.Property property29 = dateTime7.property(dateTimeFieldType27);
        org.joda.time.DateTime dateTime30 = property29.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime32 = dateTime30.withYearOfEra(19);
        int int33 = dateTime32.getWeekyear();
        org.joda.time.DateTime.Property property34 = dateTime32.dayOfYear();
        org.joda.time.DateTime dateTime35 = property34.roundFloorCopy();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(calendar9);
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=-863990000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=52,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=356,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=10,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 19 + "'", int28 == 19);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 19 + "'", int33 == 19);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime35);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime2.centuryOfEra();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = property9.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) '4', dateTimeZone13);
        org.joda.time.DateTime.Property property15 = dateTime14.dayOfYear();
        int int16 = property9.compareTo((org.joda.time.ReadableInstant) dateTime14);
        java.lang.String str17 = property9.getAsShortText();
        org.joda.time.DateTime dateTime18 = property9.getDateTime();
        org.joda.time.DateTime.Property property19 = dateTime18.millisOfDay();
        org.joda.time.DateTime.Property property20 = dateTime18.dayOfYear();
        java.util.Locale locale22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = dateTime18.toString("0999-01-03T00:00:00.052Z", locale22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "19" + "'", str17, "19");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime5 = dateTime2.minusDays((int) (byte) 10);
        org.joda.time.DateTime.Property property6 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime8 = property6.addWrapFieldToCopy((-136771200));
        int int9 = dateTime8.getYear();
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime8.toMutableDateTime();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-136769231) + "'", int9 == (-136769231));
        org.junit.Assert.assertNotNull(mutableDateTime10);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) '4', dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime6.withEarlierOffsetAtOverlap();
        long long8 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime dateTime9 = property3.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) '4', dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime16 = dateTime14.withWeekOfWeekyear(10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = dateTime16.toString(dateTimeFormatter17);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) '4', dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = dateTime21.withZoneRetainFields(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime21.minusMonths((int) '4');
        org.joda.time.DateTime.Property property28 = dateTime21.centuryOfEra();
        org.joda.time.DateTime dateTime29 = property28.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property28.getFieldType();
        int int31 = dateTime16.get(dateTimeFieldType30);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) '4', dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = dateTime34.withZoneRetainFields(dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone42 = dateTime41.getZone();
        org.joda.time.DateTime dateTime43 = dateTime34.withZone(dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) '4', dateTimeZone45);
        org.joda.time.LocalDate localDate47 = dateTime46.toLocalDate();
        org.joda.time.DateTime dateTime48 = dateTime43.withFields((org.joda.time.ReadablePartial) localDate47);
        org.joda.time.DateTime dateTime49 = dateTime16.withFields((org.joda.time.ReadablePartial) localDate47);
        org.joda.time.DateTime dateTime50 = dateTime9.withFields((org.joda.time.ReadablePartial) localDate47);
        int int51 = dateTime50.getDayOfYear();
        org.joda.time.YearMonthDay yearMonthDay52 = dateTime50.toYearMonthDay();
        int int53 = dateTime50.getYearOfEra();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-03-05T01:40:00.052Z" + "'", str18, "1970-03-05T01:40:00.052Z");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 19 + "'", int31 == 19);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(yearMonthDay52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1970 + "'", int53 == 1970);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime9.getZone();
        org.joda.time.DateTime dateTime11 = dateTime2.withZone(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) '4', dateTimeZone13);
        org.joda.time.LocalDate localDate15 = dateTime14.toLocalDate();
        org.joda.time.DateTime dateTime16 = dateTime11.withFields((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.DateTime.Property property17 = dateTime16.weekyear();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((int) (byte) 0, 85, (int) (short) 100, 394, 23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 394 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime3 = dateTime2.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime5 = dateTime3.withCenturyOfEra(3);
        org.joda.time.DateTime dateTime7 = dateTime3.minusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = dateTime10.withZoneRetainFields(dateTimeZone13);
        org.joda.time.DateTime.Property property15 = dateTime14.millisOfSecond();
        org.joda.time.DateTime dateTime16 = dateTime14.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (-1));
        boolean boolean19 = dateTime14.isAfter((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime20 = dateTime14.toDateTimeISO();
        boolean boolean21 = dateTime7.isEqual((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTime24.getZone();
        org.joda.time.DateTime dateTime27 = dateTime24.minusDays((int) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar28 = dateTime24.toGregorianCalendar();
        boolean boolean29 = dateTime20.isAfter((org.joda.time.ReadableInstant) dateTime24);
        int int30 = dateTime24.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) '4', dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = dateTime33.withZoneRetainFields(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime33.minusMonths((int) '4');
        org.joda.time.DateTime.Property property40 = dateTime33.centuryOfEra();
        org.joda.time.DateTime dateTime41 = property40.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property40.getFieldType();
        boolean boolean43 = dateTime24.isSupported(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(gregorianCalendar28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        int int9 = dateTime8.getDayOfWeek();
        org.joda.time.DateTime.Property property10 = dateTime8.year();
        org.joda.time.DateTime dateTime12 = dateTime8.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime14 = dateTime8.plusDays((int) (short) 0);
        org.joda.time.DateTime.Property property15 = dateTime8.secondOfDay();
        org.joda.time.DateTime.Property property16 = dateTime8.centuryOfEra();
        org.joda.time.DateTime dateTime18 = dateTime8.minusMillis(10);
        org.joda.time.DateTime.Property property19 = dateTime8.secondOfDay();
        org.joda.time.DateTime.Property property20 = dateTime8.minuteOfHour();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime5 = dateTime2.minusDays((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.withZoneRetainFields(dateTimeZone12);
        org.joda.time.DateTime.Property property14 = dateTime13.millisOfSecond();
        org.joda.time.DateTime dateTime15 = property14.getDateTime();
        org.joda.time.DateTime dateTime16 = dateTime15.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology17 = dateTime16.getChronology();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (byte) 0, chronology17);
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime5.toMutableDateTime(chronology17);
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(chronology17);
        org.joda.time.DateTime dateTime22 = dateTime20.withCenturyOfEra(18);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTimeISO();
        org.joda.time.DateTime.Property property10 = dateTime8.secondOfDay();
        org.joda.time.DateTime dateTime11 = property10.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime12 = property10.roundHalfEvenCopy();
        org.joda.time.Interval interval13 = property10.toInterval();
        org.joda.time.DurationField durationField14 = property10.getLeapDurationField();
        java.util.Locale locale15 = null;
        java.lang.String str16 = property10.getAsShortText(locale15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '4', dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = dateTime19.withZoneRetainFields(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime19.minusMonths((int) '4');
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.plus(readablePeriod26);
        org.joda.time.DateTime.Property property28 = dateTime27.dayOfWeek();
        org.joda.time.DateTime.Property property29 = dateTime27.hourOfDay();
        org.joda.time.DateTime dateTime30 = dateTime27.withTimeAtStartOfDay();
        boolean boolean31 = dateTime27.isBeforeNow();
        org.joda.time.DateTime dateTime32 = dateTime27.withEarlierOffsetAtOverlap();
        long long33 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime27);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNull(durationField14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime8 = property7.getDateTime();
        org.joda.time.DateTimeField dateTimeField9 = property7.getField();
        java.lang.String str10 = property7.getAsString();
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = property7.setCopy("1969-12-31T23:59:08.052Z", locale12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1969-12-31T23:59:08.052Z\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "52" + "'", str10, "52");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime8 = property7.withMinimumValue();
        org.joda.time.DateTime dateTime9 = property7.getDateTime();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) '4', dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = dateTime12.withZoneRetainFields(dateTimeZone15);
        org.joda.time.DateTime.Property property17 = dateTime16.millisOfSecond();
        org.joda.time.DateTime dateTime18 = dateTime16.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (-1));
        boolean boolean21 = dateTime16.isAfter((org.joda.time.ReadableInstant) dateTime20);
        int int22 = dateTime20.getHourOfDay();
        org.joda.time.LocalTime localTime23 = dateTime20.toLocalTime();
        int int24 = property7.compareTo((org.joda.time.ReadableInstant) dateTime20);
        java.util.Locale locale25 = null;
        int int26 = property7.getMaximumShortTextLength(locale25);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 23 + "'", int22 == 23);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        int int3 = dateTime2.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) '4', dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime14 = dateTime12.withWeekOfWeekyear(10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = dateTime14.toString(dateTimeFormatter15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (byte) -1, chronology18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) '4', dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = dateTime22.withZoneRetainFields(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) '4', dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = dateTime29.withZoneRetainFields(dateTimeZone32);
        org.joda.time.DateTime.Property property34 = dateTime33.millisOfSecond();
        org.joda.time.DateTime dateTime35 = property34.withMinimumValue();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime35.toMutableDateTime(chronology36);
        boolean boolean38 = dateTime26.isEqual((org.joda.time.ReadableInstant) dateTime35);
        boolean boolean39 = dateTime19.equals((java.lang.Object) dateTime26);
        org.joda.time.DateTime dateTime41 = dateTime26.minusMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) '4', dateTimeZone43);
        org.joda.time.DateTime dateTime46 = dateTime44.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = dateTime44.withZoneRetainFields(dateTimeZone47);
        org.joda.time.DateTime.Property property49 = dateTime48.millisOfSecond();
        org.joda.time.DateTime dateTime50 = property49.getDateTime();
        org.joda.time.DateTime dateTime51 = dateTime50.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology52 = dateTime51.getChronology();
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((java.lang.Object) dateTime26, chronology52);
        org.joda.time.MutableDateTime mutableDateTime54 = dateTime14.toMutableDateTime(chronology52);
        org.joda.time.DateTime dateTime55 = dateTime6.toDateTime(chronology52);
        org.joda.time.DateTime dateTime56 = dateTime2.withChronology(chronology52);
        org.joda.time.DateTime.Property property57 = dateTime2.dayOfMonth();
        java.lang.String str58 = property57.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-03-05T01:40:00.052Z" + "'", str16, "1970-03-05T01:40:00.052Z");
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(mutableDateTime54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "dayOfMonth" + "'", str58, "dayOfMonth");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.plus(readablePeriod9);
        org.joda.time.DateTime dateTime12 = dateTime8.plusSeconds((int) 'a');
        org.joda.time.DateTime.Property property13 = dateTime8.dayOfWeek();
        org.joda.time.DateTime dateTime15 = dateTime8.withSecondOfMinute(0);
        int int16 = dateTime8.getEra();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime9.getZone();
        org.joda.time.DateTime dateTime11 = dateTime2.withZone(dateTimeZone10);
        int int12 = dateTime2.getYear();
        org.joda.time.DateTime dateTime14 = dateTime2.plusWeeks(12);
        boolean boolean16 = dateTime2.isEqual(100L);
        org.joda.time.DateTime dateTime18 = dateTime2.withDayOfMonth(6);
        org.joda.time.DateTime.Property property19 = dateTime2.weekOfWeekyear();
        org.joda.time.DateTime dateTime21 = dateTime2.withWeekyear(23);
        org.joda.time.DateTime dateTime23 = dateTime21.minusMinutes(12);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime5 = dateTime2.minusDays((int) (byte) 10);
        org.joda.time.DateTime.Property property6 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime7 = property6.roundFloorCopy();
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfWeek();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime9.getZone();
        org.joda.time.DateTime dateTime11 = dateTime2.withZone(dateTimeZone10);
        int int12 = dateTime2.getYear();
        org.joda.time.DateTime dateTime14 = dateTime2.withYearOfEra((int) ' ');
        org.joda.time.DateTime dateTime16 = dateTime2.plusMinutes(0);
        int int17 = dateTime16.getMillisOfDay();
        org.joda.time.DateTime dateTime19 = dateTime16.minusDays((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = dateTime19.withDayOfWeek(1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime8 = property7.roundHalfCeilingCopy();
        org.joda.time.DateTimeField dateTimeField9 = property7.getField();
        org.joda.time.DateTime dateTime11 = property7.addToCopy((long) 85);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) '4', dateTimeZone13);
        org.joda.time.DateTime.Property property15 = dateTime14.dayOfYear();
        int int16 = dateTime14.getEra();
        boolean boolean17 = dateTime14.isEqualNow();
        org.joda.time.LocalDateTime localDateTime18 = dateTime14.toLocalDateTime();
        org.joda.time.DateTime dateTime20 = dateTime14.minus((long) (-1));
        org.joda.time.DateTime dateTime22 = dateTime20.withMillisOfDay(50);
        org.joda.time.DateTime dateTime24 = dateTime20.plusDays((-1));
        org.joda.time.LocalDateTime localDateTime25 = dateTime24.toLocalDateTime();
        int int26 = property7.compareTo((org.joda.time.ReadablePartial) localDateTime25);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.plusMillis(1);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime4.minus(readablePeriod7);
        org.joda.time.DateTime dateTime10 = dateTime4.withWeekyear(9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime10.withWeekOfWeekyear((-4));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -4 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) '4', dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime6.withEarlierOffsetAtOverlap();
        long long8 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime dateTime9 = property3.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime11 = property3.setCopy(50);
        org.joda.time.DateTime dateTime13 = dateTime11.plusMonths(292278993);
        org.joda.time.DateTime.Property property14 = dateTime13.centuryOfEra();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) '4', dateTimeZone2);
        org.joda.time.LocalDate localDate4 = dateTime3.toLocalDate();
        org.joda.time.DateTime dateTime6 = dateTime3.plusWeeks((int) (short) 10);
        org.joda.time.DateTime dateTime7 = dateTime6.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime10.getZone();
        org.joda.time.DateTime dateTime13 = dateTime10.minusDays((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) '4', dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime17.withZoneRetainFields(dateTimeZone20);
        org.joda.time.DateTime.Property property22 = dateTime21.millisOfSecond();
        org.joda.time.DateTime dateTime23 = property22.getDateTime();
        org.joda.time.DateTime dateTime24 = dateTime23.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 0, chronology25);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime13.toMutableDateTime(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime7.toDateTime(chronology25);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (short) 100, chronology25);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime5 = dateTime2.minusDays((int) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar6 = dateTime2.toGregorianCalendar();
        org.joda.time.DateTime.Property property7 = dateTime2.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property7.getFieldType();
        java.util.Locale locale9 = null;
        int int10 = property7.getMaximumShortTextLength(locale9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) '4', dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = dateTime13.withZoneRetainFields(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime13.minusMonths((int) '4');
        org.joda.time.DateTime.Property property20 = dateTime13.centuryOfEra();
        org.joda.time.DateTime dateTime21 = property20.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property20.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) '4', dateTimeZone24);
        org.joda.time.DateTime.Property property26 = dateTime25.dayOfYear();
        int int27 = property20.compareTo((org.joda.time.ReadableInstant) dateTime25);
        java.lang.String str28 = property20.getAsShortText();
        org.joda.time.DateTime dateTime29 = property20.getDateTime();
        org.joda.time.LocalTime localTime30 = dateTime29.toLocalTime();
        long long31 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime dateTime32 = property7.roundHalfEvenCopy();
        java.lang.String str33 = property7.getAsShortText();
        org.joda.time.DateTime dateTime34 = property7.getDateTime();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "19" + "'", str28, "19");
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0" + "'", str33, "0");
        org.junit.Assert.assertNotNull(dateTime34);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime5 = dateTime2.minusDays((int) (byte) 10);
        org.joda.time.DateTime dateTime7 = dateTime5.withSecondOfMinute(10);
        org.joda.time.DateTime dateTime8 = dateTime5.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property9 = dateTime8.yearOfEra();
        org.joda.time.DateTime dateTime11 = property9.addWrapFieldToCopy(1965);
        int int12 = property9.get();
        java.lang.String str13 = property9.getAsShortText();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1969 + "'", int12 == 1969);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1969" + "'", str13, "1969");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime8.monthOfYear();
        org.joda.time.DateTime dateTime10 = property9.roundFloorCopy();
        org.joda.time.DateTime dateTime11 = dateTime10.toDateTimeISO();
        int int12 = dateTime10.getWeekyear();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1965 + "'", int12 == 1965);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withSecondOfMinute(35);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.plus(readablePeriod9);
        org.joda.time.DateTime dateTime12 = dateTime8.plusSeconds((int) 'a');
        org.joda.time.DateTime dateTime14 = dateTime12.minusHours((int) (short) 10);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((int) (short) 0, (int) (byte) 10, (int) (byte) 10, 0, (int) (byte) 0, 10, chronology21);
        org.joda.time.Chronology chronology23 = dateTime22.getChronology();
        org.joda.time.DateTime dateTime24 = dateTime12.withChronology(chronology23);
        boolean boolean26 = dateTime12.isEqual(5449200052L);
        org.joda.time.DateTime dateTime28 = dateTime12.plusYears((int) (short) 100);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime28);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime2.centuryOfEra();
        int int10 = property9.getMinimumValue();
        org.joda.time.DateTime dateTime12 = property9.addToCopy((long) '#');
        org.joda.time.Interval interval13 = property9.toInterval();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(interval13);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime3 = dateTime2.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime5 = dateTime3.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) '4', dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfSecond();
        boolean boolean14 = dateTime3.isEqual((org.joda.time.ReadableInstant) dateTime12);
        boolean boolean16 = dateTime3.isAfter(259200052L);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTime3.getZone();
        org.joda.time.DateTime.Property property18 = dateTime3.hourOfDay();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        int int9 = dateTime8.getDayOfWeek();
        org.joda.time.DateTime.Property property10 = dateTime8.year();
        org.joda.time.LocalDateTime localDateTime11 = dateTime8.toLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) '4', dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = dateTime14.withZoneRetainFields(dateTimeZone17);
        org.joda.time.DateTime.Property property19 = dateTime18.millisOfSecond();
        org.joda.time.DateTime dateTime20 = property19.getDateTime();
        org.joda.time.DateTime dateTime21 = dateTime20.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology22 = dateTime21.getChronology();
        org.joda.time.DateTime dateTime23 = dateTime8.toDateTime(chronology22);
        int int24 = dateTime23.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime26 = dateTime23.withMonthOfYear(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.plus(readablePeriod9);
        org.joda.time.DateTime dateTime12 = dateTime8.plusSeconds((int) 'a');
        org.joda.time.DateTime.Property property13 = dateTime8.dayOfWeek();
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = property13.setCopy("1965", locale15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1965\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        int int4 = dateTime2.getEra();
        org.joda.time.DateTime.Property property5 = dateTime2.weekOfWeekyear();
        org.joda.time.DateTime dateTime6 = property5.withMaximumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.weekOfWeekyear();
        org.joda.time.DateTime dateTime8 = property7.withMinimumValue();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        int int9 = dateTime8.getDayOfWeek();
        org.joda.time.DateTime.Property property10 = dateTime8.year();
        org.joda.time.DateTime dateTime12 = dateTime8.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime14 = dateTime8.plusDays((int) (short) 0);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime17 = dateTime8.withDurationAdded(readableDuration15, 292278970);
        boolean boolean19 = dateTime17.isBefore((long) 244);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime17.plus(readableDuration20);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTimeISO();
        org.joda.time.DateTime.Property property10 = dateTime8.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) '4', dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = dateTime13.withZoneRetainFields(dateTimeZone16);
        org.joda.time.DateTime.Property property18 = dateTime17.millisOfSecond();
        org.joda.time.DateTime dateTime19 = property18.getDateTime();
        org.joda.time.DateTime dateTime20 = dateTime19.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology21 = dateTime20.getChronology();
        int int22 = property10.compareTo((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime.Property property23 = dateTime20.secondOfMinute();
        org.joda.time.DateTime dateTime25 = dateTime20.plusWeeks(1969);
        java.util.GregorianCalendar gregorianCalendar26 = dateTime20.toGregorianCalendar();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(gregorianCalendar26);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime2.dayOfYear();
        int int10 = dateTime2.getYear();
        int int11 = dateTime2.getYearOfCentury();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 70 + "'", int11 == 70);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) '4', dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear(10);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = dateTime10.withZoneRetainFields(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTime17.getZone();
        org.joda.time.DateTime dateTime19 = dateTime10.withZone(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime7.toMutableDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (short) 100, dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) '4', dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) '4', dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.plusMinutes((int) (short) 100);
        int int30 = dateTime24.compareTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime dateTime32 = dateTime27.withSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) '4', dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = dateTime35.withZoneRetainFields(dateTimeZone38);
        long long40 = dateTime39.getMillis();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) '4', dateTimeZone43);
        org.joda.time.DateTime dateTime46 = dateTime44.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = dateTime44.withZoneRetainFields(dateTimeZone47);
        org.joda.time.DateTime.Property property49 = dateTime48.millisOfSecond();
        org.joda.time.DateTime dateTime50 = property49.getDateTime();
        org.joda.time.DateTime dateTime51 = dateTime50.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology52 = dateTime51.getChronology();
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) (byte) 0, chronology52);
        org.joda.time.DateTime dateTime54 = org.joda.time.DateTime.now(chronology52);
        org.joda.time.MutableDateTime mutableDateTime55 = dateTime39.toMutableDateTime(chronology52);
        org.joda.time.DateTime dateTime56 = dateTime32.toDateTime(chronology52);
        boolean boolean57 = dateTime21.isEqual((org.joda.time.ReadableInstant) dateTime32);
        int int58 = dateTime32.getMillisOfSecond();
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 52L + "'", long40 == 52L);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(mutableDateTime55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 52 + "'", int58 == 52);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTimeISO();
        org.joda.time.DateTime.Property property10 = dateTime8.secondOfDay();
        org.joda.time.DateTime dateTime12 = property10.setCopy((int) (byte) 100);
        org.joda.time.DateTime dateTime14 = dateTime12.plusDays(70);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTime17.getZone();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime14.toMutableDateTime(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) '4', dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime27 = dateTime25.withWeekOfWeekyear(10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = dateTime27.toString(dateTimeFormatter28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) '4', dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime32.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = dateTime32.withZoneRetainFields(dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime32.minusMonths((int) '4');
        org.joda.time.DateTime.Property property39 = dateTime32.centuryOfEra();
        org.joda.time.DateTime dateTime40 = property39.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property39.getFieldType();
        int int42 = dateTime27.get(dateTimeFieldType41);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime44 = dateTime14.withField(dateTimeFieldType41, 292278970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278970 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-03-05T01:40:00.052Z" + "'", str29, "1970-03-05T01:40:00.052Z");
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 19 + "'", int42 == 19);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.withZoneRetainFields(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime9.minusMonths((int) '4');
        org.joda.time.DateTime.Property property16 = dateTime15.monthOfYear();
        org.joda.time.DateTime dateTime17 = property16.roundFloorCopy();
        org.joda.time.DateTime.Property property18 = dateTime17.era();
        org.joda.time.DateTime dateTime20 = dateTime17.plusMinutes(0);
        java.lang.String str21 = dateTime20.toString();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) '4', dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = dateTime24.withZoneRetainFields(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) '4', dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTime33.getZone();
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime28.toMutableDateTime(dateTimeZone34);
        org.joda.time.DateTime dateTime36 = dateTime20.toDateTime(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) '4', dateTimeZone38);
        org.joda.time.DateTime dateTime41 = dateTime39.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = dateTime39.withZoneRetainFields(dateTimeZone42);
        org.joda.time.DateTime dateTime45 = dateTime43.minusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime47 = dateTime45.withHourOfDay((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) '4', dateTimeZone49);
        org.joda.time.DateTime dateTime52 = dateTime50.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = dateTime50.withZoneRetainFields(dateTimeZone53);
        org.joda.time.DateTime dateTime56 = dateTime50.minusMonths((int) '4');
        int int57 = dateTime56.getDayOfWeek();
        org.joda.time.DateTime.Property property58 = dateTime56.year();
        org.joda.time.DateTime dateTime60 = dateTime56.withWeekyear((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) '4', dateTimeZone62);
        org.joda.time.DateTime dateTime64 = dateTime63.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime66 = dateTime64.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime((long) '4', dateTimeZone68);
        org.joda.time.DateTime dateTime71 = dateTime69.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.DateTime dateTime73 = dateTime69.withZoneRetainFields(dateTimeZone72);
        org.joda.time.DateTime.Property property74 = dateTime73.millisOfSecond();
        boolean boolean75 = dateTime64.isEqual((org.joda.time.ReadableInstant) dateTime73);
        boolean boolean76 = dateTime56.isBefore((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.DateTime dateTime78 = dateTime64.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone81 = null;
        org.joda.time.DateTime dateTime82 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone81);
        org.joda.time.DateTimeZone dateTimeZone83 = dateTime82.getZone();
        org.joda.time.DateTime dateTime84 = new org.joda.time.DateTime(0L, dateTimeZone83);
        org.joda.time.DateTime dateTime85 = dateTime78.toDateTime(dateTimeZone83);
        org.joda.time.DateTime dateTime86 = dateTime47.withZoneRetainFields(dateTimeZone83);
        org.joda.time.DateTime dateTime87 = dateTime36.toDateTime(dateTimeZone83);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime88 = new org.joda.time.DateTime((-328697), 35, (int) (byte) 100, 50, 6, 1970, 70, dateTimeZone83);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 50 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1965-09-01T00:00:00.000Z" + "'", str21, "1965-09-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(dateTimeZone83);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertNotNull(dateTime86);
        org.junit.Assert.assertNotNull(dateTime87);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime9.getZone();
        org.joda.time.DateTime dateTime11 = dateTime2.withZone(dateTimeZone10);
        int int12 = dateTime2.getYear();
        org.joda.time.DateTime dateTime14 = dateTime2.plusWeeks(12);
        boolean boolean16 = dateTime2.isEqual(100L);
        org.joda.time.DateTime dateTime18 = dateTime2.withDayOfMonth(6);
        org.joda.time.DateTime dateTime20 = dateTime18.minusMonths((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) '4', dateTimeZone22);
        org.joda.time.DateTime.Property property24 = dateTime23.dayOfYear();
        int int25 = dateTime23.getEra();
        boolean boolean26 = dateTime23.isEqualNow();
        org.joda.time.LocalDateTime localDateTime27 = dateTime23.toLocalDateTime();
        org.joda.time.DateTime dateTime29 = dateTime23.minus((long) (-1));
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(chronology30);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime20.toMutableDateTime(chronology30);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime5 = dateTime2.minusDays((int) (byte) 10);
        org.joda.time.DateTime dateTime7 = dateTime5.withSecondOfMinute(10);
        java.util.Locale locale8 = null;
        java.util.Calendar calendar9 = dateTime7.toCalendar(locale8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) '4', dateTimeZone11);
        org.joda.time.DateTime dateTime13 = dateTime12.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime15 = dateTime13.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) '4', dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.withZoneRetainFields(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime18.minusMonths((int) '4');
        org.joda.time.DateTime.Property property25 = dateTime18.centuryOfEra();
        org.joda.time.DateTime dateTime26 = property25.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property25.getFieldType();
        int int28 = dateTime13.get(dateTimeFieldType27);
        org.joda.time.DateTime.Property property29 = dateTime7.property(dateTimeFieldType27);
        org.joda.time.DateTime dateTime30 = property29.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime32 = dateTime30.withYearOfEra(19);
        org.joda.time.DateTime dateTime34 = dateTime32.minus((long) 50);
        int int35 = dateTime34.getHourOfDay();
        org.joda.time.LocalDate localDate36 = dateTime34.toLocalDate();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(calendar9);
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=-863990000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=52,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=356,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=10,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 19 + "'", int28 == 19);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 23 + "'", int35 == 23);
        org.junit.Assert.assertNotNull(localDate36);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime5 = dateTime2.minusDays((int) (byte) 10);
        org.joda.time.DateTime.Property property6 = dateTime5.weekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime9.getZone();
        org.joda.time.DateTime dateTime12 = dateTime9.minusDays((int) (byte) 10);
        org.joda.time.DateTime dateTime14 = dateTime12.withSecondOfMinute(10);
        java.util.Locale locale15 = null;
        java.util.Calendar calendar16 = dateTime14.toCalendar(locale15);
        boolean boolean17 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime14);
        boolean boolean19 = dateTime14.isEqual((long) 244);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) '4', dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = dateTime22.withZoneRetainFields(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime29.getZone();
        org.joda.time.DateTime dateTime31 = dateTime22.withZone(dateTimeZone30);
        int int32 = dateTime22.getYear();
        org.joda.time.DateTime dateTime34 = dateTime22.plusWeeks(12);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) '4', dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = dateTime37.withZoneRetainFields(dateTimeZone40);
        org.joda.time.DateTime dateTime43 = dateTime37.minusMonths((int) '4');
        org.joda.time.DateTime.Property property44 = dateTime37.centuryOfEra();
        org.joda.time.DateTime dateTime45 = property44.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = property44.getFieldType();
        org.joda.time.DateTime dateTime48 = dateTime34.withField(dateTimeFieldType46, 10);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone50);
        org.joda.time.DateTimeZone dateTimeZone52 = dateTime51.getZone();
        org.joda.time.DateTime dateTime53 = org.joda.time.DateTime.now(dateTimeZone52);
        org.joda.time.DateTime dateTime54 = dateTime34.withZone(dateTimeZone52);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((java.lang.Object) dateTime14, dateTimeZone52);
        boolean boolean56 = dateTime55.isEqualNow();
        org.joda.time.DateTime.Property property57 = dateTime55.dayOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(calendar16);
        org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=-863990000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=52,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=356,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=10,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1970 + "'", int32 == 1970);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(property57);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime5 = dateTime2.minusDays((int) (byte) 10);
        org.joda.time.DateTime dateTime7 = dateTime5.withSecondOfMinute(10);
        java.util.Locale locale8 = null;
        java.util.Calendar calendar9 = dateTime7.toCalendar(locale8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) '4', dateTimeZone11);
        org.joda.time.DateTime dateTime13 = dateTime12.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime15 = dateTime13.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) '4', dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.withZoneRetainFields(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime18.minusMonths((int) '4');
        org.joda.time.DateTime.Property property25 = dateTime18.centuryOfEra();
        org.joda.time.DateTime dateTime26 = property25.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property25.getFieldType();
        int int28 = dateTime13.get(dateTimeFieldType27);
        org.joda.time.DateTime.Property property29 = dateTime7.property(dateTimeFieldType27);
        org.joda.time.DateTime dateTime30 = property29.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime32 = dateTime30.withYearOfEra(19);
        org.joda.time.DateTime dateTime34 = dateTime32.minus((long) 50);
        int int35 = dateTime34.getHourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime37 = dateTime34.withSecondOfMinute(600052);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 600052 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(calendar9);
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=-863990000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=52,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=356,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=10,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 19 + "'", int28 == 19);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 23 + "'", int35 == 23);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime8 = property7.getDateTime();
        int int9 = dateTime8.getYearOfEra();
        java.util.Locale locale10 = null;
        java.util.Calendar calendar11 = dateTime8.toCalendar(locale10);
        org.joda.time.DateTime.Property property12 = dateTime8.monthOfYear();
        org.joda.time.DurationField durationField13 = property12.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) '4', dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '4', dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.plusMinutes((int) (short) 100);
        int int22 = dateTime16.compareTo((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime24 = dateTime19.withSecondOfMinute((int) (short) 0);
        org.joda.time.DateTime dateTime25 = dateTime19.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime27 = dateTime25.minusDays(356);
        int int28 = property12.compareTo((org.joda.time.ReadableInstant) dateTime25);
        java.util.Date date29 = dateTime25.toDate();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=52,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=52,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime9.getZone();
        org.joda.time.DateTime dateTime11 = dateTime2.withZone(dateTimeZone10);
        int int12 = dateTime2.getYear();
        org.joda.time.DateTime dateTime14 = dateTime2.plusWeeks(12);
        int int15 = dateTime14.getYearOfEra();
        org.joda.time.DateTime dateTime17 = dateTime14.minusWeeks(69);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        int int4 = property3.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) '4', dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.withZoneRetainFields(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime14.getZone();
        org.joda.time.DateTime dateTime16 = dateTime7.withZone(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '4', dateTimeZone18);
        org.joda.time.LocalDate localDate20 = dateTime19.toLocalDate();
        org.joda.time.DateTime dateTime21 = dateTime16.withFields((org.joda.time.ReadablePartial) localDate20);
        int int22 = property3.compareTo((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.DateTime dateTime23 = property3.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime25 = dateTime23.minusMonths(1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfEra();
        org.joda.time.DateTime dateTime9 = property7.addToCopy((long) 'a');
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTime.Property property5 = dateTime4.secondOfMinute();
        org.joda.time.DateTime.Property property6 = dateTime4.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime4.withDayOfMonth(842);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 842 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime3 = dateTime2.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime5 = dateTime3.withCenturyOfEra(3);
        org.joda.time.DateTime dateTime7 = dateTime3.minusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = dateTime10.withZoneRetainFields(dateTimeZone13);
        org.joda.time.DateTime.Property property15 = dateTime14.millisOfSecond();
        org.joda.time.DateTime dateTime16 = dateTime14.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (-1));
        boolean boolean19 = dateTime14.isAfter((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime20 = dateTime14.toDateTimeISO();
        boolean boolean21 = dateTime7.isEqual((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime.Property property22 = dateTime7.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) '4', dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) '4', dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.plusMinutes((int) (short) 100);
        int int31 = dateTime25.compareTo((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTime dateTime33 = dateTime28.withSecondOfMinute((int) (short) 0);
        int int34 = dateTime28.getDayOfMonth();
        org.joda.time.DateTime dateTime36 = dateTime28.minusWeeks((int) '4');
        boolean boolean37 = dateTime7.isEqual((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTime.Property property38 = dateTime28.weekOfWeekyear();
        org.joda.time.DateTime.Property property39 = dateTime28.centuryOfEra();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(property39);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTime5.getZone();
        int int7 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime9 = dateTime2.plusMonths((int) '#');
        org.joda.time.DateTime dateTime11 = dateTime2.withMillisOfSecond((int) (short) 100);
        int int12 = dateTime2.getDayOfYear();
        org.joda.time.DateTime.Property property13 = dateTime2.era();
        org.joda.time.YearMonthDay yearMonthDay14 = dateTime2.toYearMonthDay();
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(yearMonthDay14);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime8 = property7.getDateTime();
        org.joda.time.DateTimeField dateTimeField9 = property7.getField();
        java.lang.String str10 = property7.getAsString();
        int int11 = property7.getMaximumValue();
        int int12 = property7.getMaximumValueOverall();
        org.joda.time.DateTime dateTime14 = property7.addToCopy(0L);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) '4', dateTimeZone16);
        org.joda.time.LocalDate localDate18 = dateTime17.toLocalDate();
        int int19 = dateTime17.getCenturyOfEra();
        org.joda.time.DateTime dateTime21 = dateTime17.minusSeconds(52);
        int int22 = property7.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.Interval interval23 = property7.toInterval();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "52" + "'", str10, "52");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 999 + "'", int11 == 999);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 999 + "'", int12 == 999);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 19 + "'", int19 == 19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(interval23);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime9.getZone();
        org.joda.time.DateTime dateTime11 = dateTime2.withZone(dateTimeZone10);
        org.joda.time.DateTime.Property property12 = dateTime11.centuryOfEra();
        org.joda.time.DateTime.Property property13 = dateTime11.minuteOfDay();
        org.joda.time.DateTime dateTime14 = property13.getDateTime();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.plus(readablePeriod15);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.plus(readablePeriod9);
        org.joda.time.YearMonthDay yearMonthDay11 = dateTime8.toYearMonthDay();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime13 = dateTime8.minus(readablePeriod12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusDays(70);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfEra();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        int int4 = property3.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) '4', dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.withZoneRetainFields(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime14.getZone();
        org.joda.time.DateTime dateTime16 = dateTime7.withZone(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '4', dateTimeZone18);
        org.joda.time.LocalDate localDate20 = dateTime19.toLocalDate();
        org.joda.time.DateTime dateTime21 = dateTime16.withFields((org.joda.time.ReadablePartial) localDate20);
        int int22 = property3.compareTo((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) '4', dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) '4', dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.plusMinutes((int) (short) 100);
        int int31 = dateTime25.compareTo((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTime.Property property32 = dateTime25.yearOfEra();
        org.joda.time.DateTime dateTime34 = dateTime25.minus((long) 0);
        org.joda.time.DateTime dateTime36 = dateTime34.withMinuteOfHour(9);
        long long37 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime dateTime39 = property3.addToCopy((long) 292278970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(dateTime39);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        int int9 = dateTime8.getDayOfWeek();
        org.joda.time.DateTime.Property property10 = dateTime8.year();
        org.joda.time.DateTime dateTime12 = dateTime8.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime14 = dateTime8.plusDays((int) (short) 0);
        org.joda.time.DateTime.Property property15 = dateTime8.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property15.getFieldType();
        org.joda.time.DateTime dateTime17 = property15.withMaximumValue();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime2.dayOfYear();
        int int10 = dateTime2.getYear();
        org.joda.time.DateTime dateTime12 = dateTime2.withWeekOfWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '4', dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = dateTime15.withZoneRetainFields(dateTimeZone18);
        org.joda.time.DateTime.Property property20 = dateTime19.millisOfSecond();
        org.joda.time.DateTime dateTime21 = property20.withMinimumValue();
        org.joda.time.DateTime.Property property22 = dateTime21.centuryOfEra();
        org.joda.time.DateTime.Property property23 = dateTime21.era();
        boolean boolean24 = dateTime21.isEqualNow();
        org.joda.time.Chronology chronology25 = dateTime21.getChronology();
        org.joda.time.DateTime dateTime26 = dateTime2.toDateTime(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime2.minus((long) (byte) 10);
        org.joda.time.DateTime dateTime30 = dateTime2.minusDays(53);
        long long31 = dateTime2.getMillis();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 52L + "'", long31 == 52L);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime3 = dateTime2.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime5 = dateTime3.withCenturyOfEra(3);
        org.joda.time.DateTime dateTime7 = dateTime3.minusWeeks((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime7.withHourOfDay((-328697));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -328697 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.LocalDate localDate3 = dateTime2.toLocalDate();
        org.joda.time.DateTime dateTime5 = dateTime2.plusWeeks((int) (short) 10);
        org.joda.time.DateTime.Property property6 = dateTime2.minuteOfDay();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime5 = dateTime2.minusDays((int) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar6 = dateTime2.toGregorianCalendar();
        org.joda.time.DateTime.Property property7 = dateTime2.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property7.getFieldType();
        java.util.Locale locale9 = null;
        int int10 = property7.getMaximumShortTextLength(locale9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) '4', dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = dateTime13.withZoneRetainFields(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime13.minusMonths((int) '4');
        org.joda.time.DateTime.Property property20 = dateTime13.centuryOfEra();
        org.joda.time.DateTime dateTime21 = property20.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property20.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) '4', dateTimeZone24);
        org.joda.time.DateTime.Property property26 = dateTime25.dayOfYear();
        int int27 = property20.compareTo((org.joda.time.ReadableInstant) dateTime25);
        java.lang.String str28 = property20.getAsShortText();
        org.joda.time.DateTime dateTime29 = property20.getDateTime();
        org.joda.time.LocalTime localTime30 = dateTime29.toLocalTime();
        long long31 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime dateTime33 = dateTime29.withWeekyear(23609);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "19" + "'", str28, "19");
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(dateTime33);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) '4', dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMinutes((int) (short) 100);
        int int8 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime10 = dateTime5.withSecondOfMinute((int) (short) 0);
        org.joda.time.DateTime dateTime11 = dateTime5.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) '4', dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = dateTime14.withZoneRetainFields(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime14.minusMonths((int) '4');
        int int21 = dateTime20.getDayOfWeek();
        org.joda.time.DateTime.Property property22 = dateTime20.year();
        org.joda.time.DateTime dateTime24 = dateTime20.withWeekyear((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) '4', dateTimeZone26);
        org.joda.time.DateTime dateTime28 = dateTime27.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime30 = dateTime28.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) '4', dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = dateTime33.withZoneRetainFields(dateTimeZone36);
        org.joda.time.DateTime.Property property38 = dateTime37.millisOfSecond();
        boolean boolean39 = dateTime28.isEqual((org.joda.time.ReadableInstant) dateTime37);
        boolean boolean40 = dateTime20.isBefore((org.joda.time.ReadableInstant) dateTime28);
        int int41 = dateTime11.compareTo((org.joda.time.ReadableInstant) dateTime28);
        int int42 = dateTime28.getMillisOfSecond();
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 52 + "'", int42 == 52);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime2.centuryOfEra();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = property9.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) '4', dateTimeZone13);
        org.joda.time.DateTime.Property property15 = dateTime14.dayOfYear();
        int int16 = property9.compareTo((org.joda.time.ReadableInstant) dateTime14);
        java.lang.String str17 = property9.getAsShortText();
        org.joda.time.DateTime dateTime18 = property9.getDateTime();
        org.joda.time.DateTime.Property property19 = dateTime18.millisOfDay();
        org.joda.time.DateTime.Property property20 = dateTime18.dayOfYear();
        org.joda.time.DurationField durationField21 = property20.getRangeDurationField();
        org.joda.time.Interval interval22 = property20.toInterval();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) '4', dateTimeZone24);
        org.joda.time.DateTime.Property property26 = dateTime25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) '4', dateTimeZone28);
        org.joda.time.DateTime dateTime30 = dateTime29.withEarlierOffsetAtOverlap();
        long long31 = property26.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime dateTime32 = property26.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) '4', dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime39 = dateTime37.withWeekOfWeekyear(10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = null;
        java.lang.String str41 = dateTime39.toString(dateTimeFormatter40);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) '4', dateTimeZone43);
        org.joda.time.DateTime dateTime46 = dateTime44.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = dateTime44.withZoneRetainFields(dateTimeZone47);
        org.joda.time.DateTime dateTime50 = dateTime44.minusMonths((int) '4');
        org.joda.time.DateTime.Property property51 = dateTime44.centuryOfEra();
        org.joda.time.DateTime dateTime52 = property51.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = property51.getFieldType();
        int int54 = dateTime39.get(dateTimeFieldType53);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) '4', dateTimeZone56);
        org.joda.time.DateTime dateTime59 = dateTime57.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.DateTime dateTime61 = dateTime57.withZoneRetainFields(dateTimeZone60);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone63);
        org.joda.time.DateTimeZone dateTimeZone65 = dateTime64.getZone();
        org.joda.time.DateTime dateTime66 = dateTime57.withZone(dateTimeZone65);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime((long) '4', dateTimeZone68);
        org.joda.time.LocalDate localDate70 = dateTime69.toLocalDate();
        org.joda.time.DateTime dateTime71 = dateTime66.withFields((org.joda.time.ReadablePartial) localDate70);
        org.joda.time.DateTime dateTime72 = dateTime39.withFields((org.joda.time.ReadablePartial) localDate70);
        org.joda.time.DateTime dateTime73 = dateTime32.withFields((org.joda.time.ReadablePartial) localDate70);
        org.joda.time.DateTime dateTime75 = dateTime32.minusYears(4);
        org.joda.time.MutableDateTime mutableDateTime76 = dateTime32.toMutableDateTime();
        boolean boolean77 = property20.equals((java.lang.Object) mutableDateTime76);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "19" + "'", str17, "19");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1970-03-05T01:40:00.052Z" + "'", str41, "1970-03-05T01:40:00.052Z");
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 19 + "'", int54 == 19);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(localDate70);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(mutableDateTime76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime3 = dateTime2.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime5 = dateTime3.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) '4', dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime8.minusMonths((int) '4');
        org.joda.time.DateTime.Property property15 = dateTime8.centuryOfEra();
        org.joda.time.DateTime dateTime16 = property15.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property15.getFieldType();
        int int18 = dateTime3.get(dateTimeFieldType17);
        org.joda.time.DateTime.Property property19 = dateTime3.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) '4', dateTimeZone21);
        org.joda.time.DateTime.Property property23 = dateTime22.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) '4', dateTimeZone25);
        org.joda.time.DateTime dateTime27 = dateTime26.withEarlierOffsetAtOverlap();
        long long28 = property23.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime dateTime30 = dateTime26.withMinuteOfHour((int) (short) 10);
        org.joda.time.DateTime dateTime32 = dateTime26.withWeekyear(999);
        int int33 = property19.getDifference((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.DateTime dateTime36 = dateTime26.withPeriodAdded(readablePeriod34, 8);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) '4', dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) '4', dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.plusMinutes((int) (short) 100);
        int int45 = dateTime39.compareTo((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime dateTime46 = dateTime42.toDateTimeISO();
        int int47 = dateTime46.getDayOfYear();
        org.joda.time.DateTime dateTime49 = dateTime46.plusSeconds(85);
        org.joda.time.DateTime dateTime51 = dateTime49.withYearOfCentury(0);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) '4', dateTimeZone53);
        org.joda.time.DateTime.Property property55 = dateTime54.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) '4', dateTimeZone57);
        org.joda.time.DateTime dateTime59 = dateTime58.withEarlierOffsetAtOverlap();
        long long60 = property55.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DateTime dateTime62 = dateTime58.withMinuteOfHour((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone64);
        boolean boolean66 = dateTime62.equals((java.lang.Object) dateTimeZone64);
        org.joda.time.DateTime dateTime68 = dateTime62.withMillis(20995200052L);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime((long) '4', dateTimeZone71);
        org.joda.time.DateTime dateTime74 = dateTime72.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.DateTime dateTime76 = dateTime72.withZoneRetainFields(dateTimeZone75);
        org.joda.time.DateTime.Property property77 = dateTime76.millisOfSecond();
        org.joda.time.DateTime dateTime78 = property77.getDateTime();
        org.joda.time.DateTime dateTime79 = dateTime78.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology80 = dateTime79.getChronology();
        org.joda.time.DateTime dateTime81 = new org.joda.time.DateTime((long) (byte) 0, chronology80);
        org.joda.time.MutableDateTime mutableDateTime82 = dateTime62.toMutableDateTime(chronology80);
        org.joda.time.DateTime dateTime83 = dateTime51.withChronology(chronology80);
        org.joda.time.DateTime dateTime84 = dateTime36.toDateTime(chronology80);
        boolean boolean85 = dateTime84.isAfterNow();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19 + "'", int18 == 19);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(chronology80);
        org.junit.Assert.assertNotNull(mutableDateTime82);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime5 = dateTime2.minusDays((int) (byte) 10);
        org.joda.time.DateTime dateTime7 = dateTime5.withSecondOfMinute(10);
        java.util.Locale locale8 = null;
        java.util.Calendar calendar9 = dateTime7.toCalendar(locale8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) '4', dateTimeZone11);
        org.joda.time.DateTime dateTime13 = dateTime12.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime15 = dateTime13.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) '4', dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.withZoneRetainFields(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime18.minusMonths((int) '4');
        org.joda.time.DateTime.Property property25 = dateTime18.centuryOfEra();
        org.joda.time.DateTime dateTime26 = property25.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property25.getFieldType();
        int int28 = dateTime13.get(dateTimeFieldType27);
        org.joda.time.DateTime.Property property29 = dateTime7.property(dateTimeFieldType27);
        org.joda.time.DateTime dateTime30 = property29.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime32 = dateTime30.withYearOfEra(19);
        int int33 = dateTime32.getWeekyear();
        org.joda.time.DateTime dateTime35 = dateTime32.plusYears(6);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(calendar9);
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=-863990000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=52,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=356,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=10,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 19 + "'", int28 == 19);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 19 + "'", int33 == 19);
        org.junit.Assert.assertNotNull(dateTime35);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("1972-12-01T00:00:00.052Z");
        org.joda.time.DateTime dateTime2 = dateTime1.withTimeAtStartOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = dateTime1.withWeekOfWeekyear(86399);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime8 = property7.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime10 = property7.addToCopy((int) '4');
        org.joda.time.DateTime dateTime11 = property7.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime12 = property7.roundCeilingCopy();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) '4', dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime10 = dateTime8.withWeekOfWeekyear(10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = dateTime10.toString(dateTimeFormatter11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) -1, chronology14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) '4', dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.withZoneRetainFields(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) '4', dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = dateTime25.withZoneRetainFields(dateTimeZone28);
        org.joda.time.DateTime.Property property30 = dateTime29.millisOfSecond();
        org.joda.time.DateTime dateTime31 = property30.withMinimumValue();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime31.toMutableDateTime(chronology32);
        boolean boolean34 = dateTime22.isEqual((org.joda.time.ReadableInstant) dateTime31);
        boolean boolean35 = dateTime15.equals((java.lang.Object) dateTime22);
        org.joda.time.DateTime dateTime37 = dateTime22.minusMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) '4', dateTimeZone39);
        org.joda.time.DateTime dateTime42 = dateTime40.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = dateTime40.withZoneRetainFields(dateTimeZone43);
        org.joda.time.DateTime.Property property45 = dateTime44.millisOfSecond();
        org.joda.time.DateTime dateTime46 = property45.getDateTime();
        org.joda.time.DateTime dateTime47 = dateTime46.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology48 = dateTime47.getChronology();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((java.lang.Object) dateTime22, chronology48);
        org.joda.time.MutableDateTime mutableDateTime50 = dateTime10.toMutableDateTime(chronology48);
        org.joda.time.DateTime dateTime51 = dateTime2.toDateTime(chronology48);
        org.joda.time.DateMidnight dateMidnight52 = dateTime2.toDateMidnight();
        int int53 = dateTime2.getWeekyear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-03-05T01:40:00.052Z" + "'", str12, "1970-03-05T01:40:00.052Z");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateMidnight52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1970 + "'", int53 == 1970);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        int int3 = dateTime2.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) '4', dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime14 = dateTime12.withWeekOfWeekyear(10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = dateTime14.toString(dateTimeFormatter15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (byte) -1, chronology18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) '4', dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = dateTime22.withZoneRetainFields(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) '4', dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = dateTime29.withZoneRetainFields(dateTimeZone32);
        org.joda.time.DateTime.Property property34 = dateTime33.millisOfSecond();
        org.joda.time.DateTime dateTime35 = property34.withMinimumValue();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime35.toMutableDateTime(chronology36);
        boolean boolean38 = dateTime26.isEqual((org.joda.time.ReadableInstant) dateTime35);
        boolean boolean39 = dateTime19.equals((java.lang.Object) dateTime26);
        org.joda.time.DateTime dateTime41 = dateTime26.minusMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) '4', dateTimeZone43);
        org.joda.time.DateTime dateTime46 = dateTime44.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = dateTime44.withZoneRetainFields(dateTimeZone47);
        org.joda.time.DateTime.Property property49 = dateTime48.millisOfSecond();
        org.joda.time.DateTime dateTime50 = property49.getDateTime();
        org.joda.time.DateTime dateTime51 = dateTime50.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology52 = dateTime51.getChronology();
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((java.lang.Object) dateTime26, chronology52);
        org.joda.time.MutableDateTime mutableDateTime54 = dateTime14.toMutableDateTime(chronology52);
        org.joda.time.DateTime dateTime55 = dateTime6.toDateTime(chronology52);
        org.joda.time.DateTime dateTime56 = dateTime2.withChronology(chronology52);
        org.joda.time.DateTime dateTime57 = org.joda.time.DateTime.now(chronology52);
        org.joda.time.DateTime dateTime59 = dateTime57.minus(0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-03-05T01:40:00.052Z" + "'", str16, "1970-03-05T01:40:00.052Z");
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(mutableDateTime54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime59);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withMinuteOfHour(0);
        org.joda.time.DateTime dateTime7 = dateTime6.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime8 = dateTime7.withTimeAtStartOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime8 = property7.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime10 = property7.addToCopy((int) '4');
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours((int) (short) -1);
        org.joda.time.DateTime dateTime14 = dateTime12.withWeekyear(100);
        int int15 = dateTime12.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime18 = dateTime12.withDurationAdded((long) 0, (-136769231));
        org.joda.time.DateTime.Property property19 = dateTime18.secondOfMinute();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("1969");
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfYear();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) '4', dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = dateTime6.withZoneRetainFields(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime6.minusMonths((int) '4');
        int int13 = dateTime12.getDayOfWeek();
        org.joda.time.DateTime.Property property14 = dateTime12.year();
        org.joda.time.DateTime dateTime16 = dateTime12.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime18 = dateTime12.plusDays((int) (short) 0);
        org.joda.time.DateTime.Property property19 = dateTime12.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property19.getFieldType();
        org.joda.time.DateTime dateTime22 = dateTime3.withField(dateTimeFieldType20, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime26 = dateTime3.withDate(15, (-292275054), 85800020);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) '4', dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime6.withEarlierOffsetAtOverlap();
        long long8 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime dateTime9 = property3.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) '4', dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime16 = dateTime14.withWeekOfWeekyear(10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = dateTime16.toString(dateTimeFormatter17);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) '4', dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = dateTime21.withZoneRetainFields(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime21.minusMonths((int) '4');
        org.joda.time.DateTime.Property property28 = dateTime21.centuryOfEra();
        org.joda.time.DateTime dateTime29 = property28.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property28.getFieldType();
        int int31 = dateTime16.get(dateTimeFieldType30);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) '4', dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = dateTime34.withZoneRetainFields(dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone42 = dateTime41.getZone();
        org.joda.time.DateTime dateTime43 = dateTime34.withZone(dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) '4', dateTimeZone45);
        org.joda.time.LocalDate localDate47 = dateTime46.toLocalDate();
        org.joda.time.DateTime dateTime48 = dateTime43.withFields((org.joda.time.ReadablePartial) localDate47);
        org.joda.time.DateTime dateTime49 = dateTime16.withFields((org.joda.time.ReadablePartial) localDate47);
        org.joda.time.DateTime dateTime50 = dateTime9.withFields((org.joda.time.ReadablePartial) localDate47);
        org.joda.time.DateTime dateTime52 = dateTime9.minusYears(4);
        org.joda.time.DateTime dateTime54 = dateTime9.plusSeconds(31);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone56);
        org.joda.time.DateTimeZone dateTimeZone58 = dateTime57.getZone();
        org.joda.time.DateTime dateTime60 = dateTime57.minusDays((int) (byte) 10);
        org.joda.time.DateTime.Property property61 = dateTime60.weekyear();
        int int62 = dateTime60.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone64);
        org.joda.time.DateTimeZone dateTimeZone66 = dateTime65.getZone();
        org.joda.time.MutableDateTime mutableDateTime67 = dateTime60.toMutableDateTime(dateTimeZone66);
        boolean boolean68 = dateTime9.isAfter((org.joda.time.ReadableInstant) mutableDateTime67);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-03-05T01:40:00.052Z" + "'", str18, "1970-03-05T01:40:00.052Z");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 19 + "'", int31 == 19);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone66);
        org.junit.Assert.assertNotNull(mutableDateTime67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime5 = dateTime2.minusDays((int) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar6 = dateTime2.toGregorianCalendar();
        org.joda.time.DateTime.Property property7 = dateTime2.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property7.getFieldType();
        java.util.Locale locale9 = null;
        int int10 = property7.getMaximumShortTextLength(locale9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) '4', dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = dateTime13.withZoneRetainFields(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime13.minusMonths((int) '4');
        org.joda.time.DateTime.Property property20 = dateTime13.centuryOfEra();
        org.joda.time.DateTime dateTime21 = property20.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property20.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) '4', dateTimeZone24);
        org.joda.time.DateTime.Property property26 = dateTime25.dayOfYear();
        int int27 = property20.compareTo((org.joda.time.ReadableInstant) dateTime25);
        java.lang.String str28 = property20.getAsShortText();
        org.joda.time.DateTime dateTime29 = property20.getDateTime();
        org.joda.time.LocalTime localTime30 = dateTime29.toLocalTime();
        long long31 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime dateTime32 = property7.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime34 = dateTime32.plusYears((int) '#');
        boolean boolean36 = dateTime32.isBefore((long) (-1));
        org.joda.time.DateTime dateTime38 = dateTime32.minus(3393199361L);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTime32.getZone();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "19" + "'", str28, "19");
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime3 = dateTime2.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime5 = dateTime3.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) '4', dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime8.minusMonths((int) '4');
        org.joda.time.DateTime.Property property15 = dateTime8.centuryOfEra();
        org.joda.time.DateTime dateTime16 = property15.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property15.getFieldType();
        int int18 = dateTime3.get(dateTimeFieldType17);
        org.joda.time.DateTime.Property property19 = dateTime3.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) '4', dateTimeZone21);
        org.joda.time.DateTime.Property property23 = dateTime22.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) '4', dateTimeZone25);
        org.joda.time.DateTime dateTime27 = dateTime26.withEarlierOffsetAtOverlap();
        long long28 = property23.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime dateTime30 = dateTime26.withMinuteOfHour((int) (short) 10);
        org.joda.time.DateTime dateTime32 = dateTime26.withWeekyear(999);
        int int33 = property19.getDifference((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.DateTime dateTime36 = dateTime26.withPeriodAdded(readablePeriod34, 8);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) '4', dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) '4', dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.plusMinutes((int) (short) 100);
        int int45 = dateTime39.compareTo((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime dateTime46 = dateTime42.toDateTimeISO();
        int int47 = dateTime46.getDayOfYear();
        org.joda.time.DateTime dateTime49 = dateTime46.plusSeconds(85);
        org.joda.time.DateTime dateTime51 = dateTime49.withYearOfCentury(0);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) '4', dateTimeZone53);
        org.joda.time.DateTime.Property property55 = dateTime54.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) '4', dateTimeZone57);
        org.joda.time.DateTime dateTime59 = dateTime58.withEarlierOffsetAtOverlap();
        long long60 = property55.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DateTime dateTime62 = dateTime58.withMinuteOfHour((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone64);
        boolean boolean66 = dateTime62.equals((java.lang.Object) dateTimeZone64);
        org.joda.time.DateTime dateTime68 = dateTime62.withMillis(20995200052L);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime((long) '4', dateTimeZone71);
        org.joda.time.DateTime dateTime74 = dateTime72.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.DateTime dateTime76 = dateTime72.withZoneRetainFields(dateTimeZone75);
        org.joda.time.DateTime.Property property77 = dateTime76.millisOfSecond();
        org.joda.time.DateTime dateTime78 = property77.getDateTime();
        org.joda.time.DateTime dateTime79 = dateTime78.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology80 = dateTime79.getChronology();
        org.joda.time.DateTime dateTime81 = new org.joda.time.DateTime((long) (byte) 0, chronology80);
        org.joda.time.MutableDateTime mutableDateTime82 = dateTime62.toMutableDateTime(chronology80);
        org.joda.time.DateTime dateTime83 = dateTime51.withChronology(chronology80);
        org.joda.time.DateTime dateTime84 = dateTime36.toDateTime(chronology80);
        org.joda.time.DateTime dateTime85 = org.joda.time.DateTime.now(chronology80);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19 + "'", int18 == 19);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(chronology80);
        org.junit.Assert.assertNotNull(mutableDateTime82);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(dateTime85);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(12, 35, 1, 6, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime8 = property7.roundHalfCeilingCopy();
        org.joda.time.DateTimeField dateTimeField9 = property7.getField();
        org.joda.time.DateTime dateTime11 = property7.addToCopy((long) 85);
        long long12 = property7.remainder();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime9.getZone();
        org.joda.time.DateTime dateTime11 = dateTime2.withZone(dateTimeZone10);
        int int12 = dateTime2.getYear();
        org.joda.time.DateTime dateTime14 = dateTime2.plusWeeks(12);
        boolean boolean16 = dateTime2.isEqual(100L);
        org.joda.time.DateTime dateTime18 = dateTime2.withDayOfMonth(6);
        org.joda.time.DateTime.Property property19 = dateTime2.weekOfWeekyear();
        long long20 = property19.remainder();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 259200052L + "'", long20 == 259200052L);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.plus(readablePeriod9);
        org.joda.time.DateTime.Property property11 = dateTime8.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime14.getZone();
        org.joda.time.DateTime dateTime17 = dateTime14.minusDays((int) (byte) 10);
        org.joda.time.DateTime dateTime19 = dateTime17.withSecondOfMinute(10);
        java.util.Locale locale20 = null;
        java.util.Calendar calendar21 = dateTime19.toCalendar(locale20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) '4', dateTimeZone23);
        org.joda.time.DateTime dateTime25 = dateTime24.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime27 = dateTime25.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) '4', dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = dateTime30.withZoneRetainFields(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime30.minusMonths((int) '4');
        org.joda.time.DateTime.Property property37 = dateTime30.centuryOfEra();
        org.joda.time.DateTime dateTime38 = property37.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = property37.getFieldType();
        int int40 = dateTime25.get(dateTimeFieldType39);
        org.joda.time.DateTime.Property property41 = dateTime19.property(dateTimeFieldType39);
        org.joda.time.DateTime dateTime42 = property41.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) '4', dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime45.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateTime dateTime49 = dateTime45.withZoneRetainFields(dateTimeZone48);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone51);
        org.joda.time.DateTimeZone dateTimeZone53 = dateTime52.getZone();
        org.joda.time.DateTime dateTime54 = dateTime45.withZone(dateTimeZone53);
        org.joda.time.DateTime dateTime55 = dateTime42.withZone(dateTimeZone53);
        org.joda.time.DateTime dateTime56 = dateTime8.toDateTime(dateTimeZone53);
        org.joda.time.DateTime dateTime57 = org.joda.time.DateTime.now(dateTimeZone53);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=-863990000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=52,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=356,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=10,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 19 + "'", int40 == 19);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime57);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime9.getZone();
        org.joda.time.DateTime dateTime11 = dateTime2.withZone(dateTimeZone10);
        int int12 = dateTime2.getYear();
        org.joda.time.DateTime dateTime14 = dateTime2.withYearOfEra((int) ' ');
        org.joda.time.DateTime dateTime16 = dateTime2.plusMinutes(0);
        int int17 = dateTime16.getMillisOfDay();
        org.joda.time.DateTime dateTime19 = dateTime16.minusDays((int) (short) 100);
        org.joda.time.Chronology chronology20 = dateTime19.getChronology();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTime5.getZone();
        int int7 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime9 = dateTime2.plusMonths((int) '#');
        org.joda.time.DateTime dateTime11 = dateTime9.withYearOfCentury(0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) '4', dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = dateTime14.withZoneRetainFields(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime21.getZone();
        org.joda.time.DateTime dateTime23 = dateTime14.withZone(dateTimeZone22);
        int int24 = dateTime14.getYear();
        org.joda.time.DateTime dateTime26 = dateTime14.plusWeeks(12);
        int int27 = dateTime26.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTime30.getZone();
        org.joda.time.DateTime dateTime33 = dateTime30.minusDays((int) (byte) 10);
        org.joda.time.DateTime dateTime35 = dateTime33.plusDays((int) '#');
        org.joda.time.DateTime dateTime37 = dateTime35.withMillisOfSecond((int) ' ');
        org.joda.time.DateTime dateTime38 = dateTime35.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime40 = dateTime35.withMinuteOfHour((int) (byte) 0);
        int int41 = dateTime26.compareTo((org.joda.time.ReadableInstant) dateTime40);
        boolean boolean42 = dateTime9.isAfter((org.joda.time.ReadableInstant) dateTime40);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1970 + "'", int24 == 1970);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1970 + "'", int27 == 1970);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime3 = dateTime2.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime5 = dateTime3.withCenturyOfEra(3);
        org.joda.time.DateTime dateTime7 = dateTime3.minusHours((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime9 = dateTime3.plus(readablePeriod8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.minus(readablePeriod10);
        long long12 = dateTime9.getMillis();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = dateTime9.toString(dateTimeFormatter13);
        long long15 = dateTime9.getMillis();
        org.joda.time.DateTime dateTime17 = dateTime9.minusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime21.getZone();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(0L, dateTimeZone22);
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime9.withZoneRetainFields(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str14, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime3 = dateTime2.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime5 = dateTime3.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) '4', dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfSecond();
        boolean boolean14 = dateTime3.isEqual((org.joda.time.ReadableInstant) dateTime12);
        boolean boolean16 = dateTime3.isAfter(259200052L);
        java.util.Date date17 = dateTime3.toDate();
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime3.toMutableDateTimeISO();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(mutableDateTime18);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (byte) 100);
        int int2 = dateTime1.getDayOfYear();
        org.joda.time.LocalTime localTime3 = dateTime1.toLocalTime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.LocalDate localDate3 = dateTime2.toLocalDate();
        org.joda.time.DateTime dateTime5 = dateTime2.minusMillis((int) (short) 1);
        org.joda.time.DateTime dateTime6 = dateTime2.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime9.getZone();
        org.joda.time.DateTime dateTime11 = dateTime2.withZone(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) '4', dateTimeZone13);
        org.joda.time.LocalDate localDate15 = dateTime14.toLocalDate();
        org.joda.time.DateTime dateTime16 = dateTime11.withFields((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '4', dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = dateTime19.withZoneRetainFields(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime19.minusMonths((int) '4');
        org.joda.time.DateTime.Property property26 = dateTime19.centuryOfEra();
        org.joda.time.DateTime dateTime27 = property26.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = property26.getFieldType();
        org.joda.time.DateTime dateTime30 = dateTime16.withField(dateTimeFieldType28, 10);
        org.joda.time.DateTime dateTime31 = dateTime30.withTimeAtStartOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.plus(readablePeriod9);
        org.joda.time.DateTime dateTime12 = dateTime8.plusSeconds((int) 'a');
        org.joda.time.DateTime.Property property13 = dateTime8.dayOfWeek();
        org.joda.time.DateTime dateTime14 = property13.getDateTime();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime5 = dateTime2.minusDays((int) (byte) 10);
        org.joda.time.DateTime dateTime7 = dateTime5.withSecondOfMinute(10);
        org.joda.time.DateTime dateTime8 = dateTime5.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekyear((int) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime9.getZone();
        org.joda.time.DateTime dateTime11 = dateTime2.withZone(dateTimeZone10);
        int int12 = dateTime2.getYear();
        org.joda.time.DateTime dateTime14 = dateTime2.plusWeeks(12);
        int int15 = dateTime14.getYearOfEra();
        org.joda.time.TimeOfDay timeOfDay16 = dateTime14.toTimeOfDay();
        org.joda.time.DateTime dateTime17 = dateTime14.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.withZoneRetainFields(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime9.minusMonths((int) '4');
        int int16 = dateTime15.getDayOfWeek();
        org.joda.time.DateTime.Property property17 = dateTime15.year();
        org.joda.time.DateTime dateTime19 = dateTime15.withWeekyear((int) (short) 100);
        java.util.Locale locale20 = null;
        java.util.Calendar calendar21 = dateTime19.toCalendar(locale20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) '4', dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = dateTime24.withZoneRetainFields(dateTimeZone27);
        org.joda.time.DateTime.Property property29 = dateTime28.millisOfSecond();
        org.joda.time.DateTime dateTime30 = property29.withMinimumValue();
        org.joda.time.DateTime.Property property31 = dateTime30.centuryOfEra();
        org.joda.time.DateTime.Property property32 = dateTime30.era();
        boolean boolean33 = dateTime30.isEqualNow();
        org.joda.time.Chronology chronology34 = dateTime30.getChronology();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((java.lang.Object) calendar21, chronology34);
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(chronology34);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((-136769231), (-328697), 2022, (-23880), 5, 9, 0, chronology34);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -23880 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=-58990463999948,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=8,WEEK_OF_YEAR=36,WEEK_OF_MONTH=1,DAY_OF_MONTH=2,DAY_OF_YEAR=246,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=52,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTime36);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime9.getZone();
        org.joda.time.DateTime dateTime11 = dateTime2.withZone(dateTimeZone10);
        org.joda.time.DateTime.Property property12 = dateTime11.centuryOfEra();
        org.joda.time.DateTime dateTime14 = dateTime11.minusHours((int) (short) 100);
        boolean boolean16 = dateTime14.isBefore(52L);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withPeriodAdded(readablePeriod17, (int) ' ');
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) '4', dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear(10);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = dateTime10.withZoneRetainFields(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTime17.getZone();
        org.joda.time.DateTime dateTime19 = dateTime10.withZone(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime7.toMutableDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (short) 100, dateTimeZone18);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.YearMonthDay yearMonthDay23 = dateTime22.toYearMonthDay();
        org.joda.time.DateTime dateTime25 = dateTime22.plusMonths(356);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekOfWeekyear(10);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.withZoneRetainFields(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTime16.getZone();
        org.joda.time.DateTime dateTime18 = dateTime9.withZone(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime6.toMutableDateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime21 = dateTime6.plusDays(292278993);
        long long22 = dateTime6.getMillis();
        org.joda.time.DateTime.Property property23 = dateTime6.weekyear();
        int int24 = dateTime6.getMillisOfDay();
        org.joda.time.DateTime.Property property25 = dateTime6.weekyear();
        org.joda.time.DateTime dateTime27 = dateTime6.plusMillis(53);
        org.joda.time.DateTime.Property property28 = dateTime6.secondOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5449200052L + "'", long22 == 5449200052L);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6000052 + "'", int24 == 6000052);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.plus(readablePeriod9);
        org.joda.time.DateTime dateTime12 = dateTime8.plusSeconds((int) 'a');
        org.joda.time.DateTime dateTime14 = dateTime12.minusHours((int) (short) 10);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((int) (short) 0, (int) (byte) 10, (int) (byte) 10, 0, (int) (byte) 0, 10, chronology21);
        org.joda.time.Chronology chronology23 = dateTime22.getChronology();
        org.joda.time.DateTime dateTime24 = dateTime12.withChronology(chronology23);
        org.joda.time.DateTime dateTime25 = dateTime24.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime27 = dateTime24.minusYears(35);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime8 = property7.getDateTime();
        org.joda.time.DateTimeField dateTimeField9 = property7.getField();
        java.lang.String str10 = property7.getAsString();
        int int11 = property7.getMinimumValueOverall();
        int int12 = property7.getMaximumValue();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "52" + "'", str10, "52");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 999 + "'", int12 == 999);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime8 = property7.withMinimumValue();
        java.lang.String str9 = property7.getAsShortText();
        org.joda.time.DateTime dateTime11 = property7.setCopy(999);
        java.lang.String str12 = property7.getAsText();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "52" + "'", str9, "52");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "52" + "'", str12, "52");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime3 = dateTime2.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime5 = dateTime3.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) '4', dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime8.minusMonths((int) '4');
        org.joda.time.DateTime.Property property15 = dateTime8.centuryOfEra();
        org.joda.time.DateTime dateTime16 = property15.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property15.getFieldType();
        int int18 = dateTime3.get(dateTimeFieldType17);
        org.joda.time.DateTime dateTime20 = dateTime3.withYear((int) (byte) 0);
        org.joda.time.DateTime.Property property21 = dateTime20.minuteOfHour();
        int int22 = property21.get();
        int int23 = property21.getLeapAmount();
        java.util.Locale locale24 = null;
        int int25 = property21.getMaximumTextLength(locale24);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19 + "'", int18 == 19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime8 = property7.getDateTime();
        org.joda.time.DateTime.Property property9 = dateTime8.minuteOfDay();
        org.joda.time.DateTime.Property property10 = dateTime8.hourOfDay();
        org.joda.time.DateTime.Property property11 = dateTime8.secondOfMinute();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) -1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) '4', dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = dateTime6.withZoneRetainFields(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) '4', dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = dateTime13.withZoneRetainFields(dateTimeZone16);
        org.joda.time.DateTime.Property property18 = dateTime17.millisOfSecond();
        org.joda.time.DateTime dateTime19 = property18.withMinimumValue();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime19.toMutableDateTime(chronology20);
        boolean boolean22 = dateTime10.isEqual((org.joda.time.ReadableInstant) dateTime19);
        boolean boolean23 = dateTime3.equals((java.lang.Object) dateTime10);
        org.joda.time.DateTime dateTime25 = dateTime10.minusMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) '4', dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = dateTime28.withZoneRetainFields(dateTimeZone31);
        org.joda.time.DateTime.Property property33 = dateTime32.millisOfSecond();
        org.joda.time.DateTime dateTime34 = property33.getDateTime();
        org.joda.time.DateTime dateTime35 = dateTime34.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology36 = dateTime35.getChronology();
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((java.lang.Object) dateTime10, chronology36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (short) 0, chronology36);
        org.joda.time.DateTime dateTime40 = dateTime38.plusHours(23);
        org.joda.time.DateTime dateTime42 = dateTime38.minus((long) (-136771200));
        int int43 = dateTime42.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant7 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime10 = dateTime4.withDurationAdded((long) (-136769231), 23609);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime5 = dateTime2.minusDays((int) (byte) 10);
        org.joda.time.DateTime.Property property6 = dateTime5.weekyear();
        int int7 = property6.getMaximumValueOverall();
        int int8 = property6.getMinimumValue();
        int int9 = property6.getMinimumValue();
        org.joda.time.DateTime dateTime10 = property6.withMaximumValue();
        org.joda.time.DateTime dateTime11 = property6.roundCeilingCopy();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 292278993 + "'", int7 == 292278993);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-292275054) + "'", int8 == (-292275054));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-292275054) + "'", int9 == (-292275054));
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) -1, chronology1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) '4', dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime5.withZoneRetainFields(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) '4', dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = dateTime12.withZoneRetainFields(dateTimeZone15);
        org.joda.time.DateTime.Property property17 = dateTime16.millisOfSecond();
        org.joda.time.DateTime dateTime18 = property17.withMinimumValue();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime18.toMutableDateTime(chronology19);
        boolean boolean21 = dateTime9.isEqual((org.joda.time.ReadableInstant) dateTime18);
        boolean boolean22 = dateTime2.equals((java.lang.Object) dateTime9);
        org.joda.time.DateTime dateTime24 = dateTime9.minusMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) '4', dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = dateTime27.withZoneRetainFields(dateTimeZone30);
        org.joda.time.DateTime.Property property32 = dateTime31.millisOfSecond();
        org.joda.time.DateTime dateTime33 = property32.getDateTime();
        org.joda.time.DateTime dateTime34 = dateTime33.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology35 = dateTime34.getChronology();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((java.lang.Object) dateTime9, chronology35);
        org.joda.time.DateTimeZone dateTimeZone37 = dateTime36.getZone();
        java.util.GregorianCalendar gregorianCalendar38 = dateTime36.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = dateTime36.toDateTime(dateTimeZone39);
        org.joda.time.DateTime dateTime42 = dateTime40.withDayOfMonth(7);
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.DateTime dateTime44 = dateTime40.minus(readableDuration43);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(gregorianCalendar38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.plus(readablePeriod9);
        org.joda.time.YearMonthDay yearMonthDay11 = dateTime8.toYearMonthDay();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime13 = dateTime8.minus(readablePeriod12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime13.withTime(3, 18, 6000052, 6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6000052 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 85);
        org.joda.time.DateTime dateTime3 = dateTime1.minusSeconds((int) '#');
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTime5.getZone();
        int int7 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime9 = dateTime2.plusMonths((int) '#');
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime12 = dateTime9.withYearOfCentury(52);
        org.joda.time.DateTime dateTime14 = dateTime12.withHourOfDay(0);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime17 = dateTime12.withDurationAdded(readableDuration15, (-23880));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime9.getZone();
        org.joda.time.DateTime dateTime12 = dateTime9.minusDays((int) (byte) 10);
        org.joda.time.DateTime dateTime14 = dateTime12.plusDays((int) '#');
        org.joda.time.DateTime dateTime16 = dateTime14.withMillisOfSecond((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) '4', dateTimeZone19);
        int int21 = dateTime20.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) '4', dateTimeZone23);
        org.joda.time.DateTime.Property property25 = dateTime24.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) '4', dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime32 = dateTime30.withWeekOfWeekyear(10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = dateTime32.toString(dateTimeFormatter33);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (byte) -1, chronology36);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) '4', dateTimeZone39);
        org.joda.time.DateTime dateTime42 = dateTime40.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = dateTime40.withZoneRetainFields(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) '4', dateTimeZone46);
        org.joda.time.DateTime dateTime49 = dateTime47.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = dateTime47.withZoneRetainFields(dateTimeZone50);
        org.joda.time.DateTime.Property property52 = dateTime51.millisOfSecond();
        org.joda.time.DateTime dateTime53 = property52.withMinimumValue();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = dateTime53.toMutableDateTime(chronology54);
        boolean boolean56 = dateTime44.isEqual((org.joda.time.ReadableInstant) dateTime53);
        boolean boolean57 = dateTime37.equals((java.lang.Object) dateTime44);
        org.joda.time.DateTime dateTime59 = dateTime44.minusMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((long) '4', dateTimeZone61);
        org.joda.time.DateTime dateTime64 = dateTime62.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateTime dateTime66 = dateTime62.withZoneRetainFields(dateTimeZone65);
        org.joda.time.DateTime.Property property67 = dateTime66.millisOfSecond();
        org.joda.time.DateTime dateTime68 = property67.getDateTime();
        org.joda.time.DateTime dateTime69 = dateTime68.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology70 = dateTime69.getChronology();
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime((java.lang.Object) dateTime44, chronology70);
        org.joda.time.MutableDateTime mutableDateTime72 = dateTime32.toMutableDateTime(chronology70);
        org.joda.time.DateTime dateTime73 = dateTime24.toDateTime(chronology70);
        org.joda.time.DateTime dateTime74 = dateTime20.withChronology(chronology70);
        org.joda.time.DateTime dateTime75 = org.joda.time.DateTime.now(chronology70);
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime((long) (byte) 100, chronology70);
        org.joda.time.DateTime dateTime77 = org.joda.time.DateTime.now(chronology70);
        org.joda.time.DateTime dateTime78 = dateTime16.withChronology(chronology70);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime(0, 0, 365, 18, (-4), 69, (int) (short) 10, chronology70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -4 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1970-03-05T01:40:00.052Z" + "'", str34, "1970-03-05T01:40:00.052Z");
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(mutableDateTime55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(chronology70);
        org.junit.Assert.assertNotNull(mutableDateTime72);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(dateTime78);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        int int4 = dateTime2.getEra();
        boolean boolean5 = dateTime2.isEqualNow();
        org.joda.time.LocalDateTime localDateTime6 = dateTime2.toLocalDateTime();
        org.joda.time.DateTime dateTime8 = dateTime2.minus((long) (-1));
        boolean boolean9 = dateTime2.isAfterNow();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime5 = dateTime2.minusDays((int) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar6 = dateTime2.toGregorianCalendar();
        org.joda.time.DateTime.Property property7 = dateTime2.secondOfMinute();
        org.joda.time.DateTime dateTime9 = dateTime2.plusMonths(100);
        int int10 = dateTime2.getSecondOfMinute();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime2.centuryOfEra();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = property9.getFieldType();
        org.joda.time.DateTime dateTime13 = property9.setCopy((int) ' ');
        org.joda.time.DateTime dateTime14 = property9.withMinimumValue();
        org.joda.time.DateTime dateTime16 = dateTime14.plusYears(0);
        org.joda.time.Instant instant17 = dateTime16.toInstant();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(instant17);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime8 = property7.withMinimumValue();
        org.joda.time.DateTime.Property property9 = dateTime8.centuryOfEra();
        org.joda.time.DateTime.Property property10 = dateTime8.era();
        boolean boolean11 = dateTime8.isEqualNow();
        org.joda.time.DateTime dateTime13 = dateTime8.withMillis((long) 999);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime13.withEra(86300052);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86300052 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTime5.getZone();
        int int7 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime9 = dateTime2.plusSeconds(292278993);
        org.joda.time.DateTime dateTime11 = dateTime2.withDayOfWeek((int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime2.toMutableDateTimeISO();
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime9.getZone();
        org.joda.time.DateTime dateTime11 = dateTime2.withZone(dateTimeZone10);
        int int12 = dateTime2.getYear();
        org.joda.time.DateTime dateTime14 = dateTime2.plusWeeks(12);
        int int15 = dateTime14.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime18.getZone();
        org.joda.time.DateTime dateTime21 = dateTime18.minusDays((int) (byte) 10);
        org.joda.time.DateTime dateTime23 = dateTime21.plusDays((int) '#');
        org.joda.time.DateTime dateTime25 = dateTime23.withMillisOfSecond((int) ' ');
        org.joda.time.DateTime dateTime26 = dateTime23.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime28 = dateTime23.withMinuteOfHour((int) (byte) 0);
        int int29 = dateTime14.compareTo((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTime dateTime31 = dateTime14.plusYears(10);
        org.joda.time.DateTime dateTime33 = dateTime14.withMillis((long) 11);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) '4', dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.withZoneRetainFields(dateTimeZone10);
        org.joda.time.DateTime.Property property12 = dateTime11.millisOfSecond();
        org.joda.time.DateTime dateTime13 = property12.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime15 = property12.addToCopy((int) '4');
        org.joda.time.DateTime dateTime17 = dateTime15.minusHours((int) (short) -1);
        org.joda.time.DateTime dateTime19 = dateTime17.withWeekyear(100);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTime19.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(20, 65, 1972, 6000052, 23, dateTimeZone20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6000052 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) '4', dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMinutes((int) (short) 100);
        int int8 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime10 = dateTime5.withSecondOfMinute((int) (short) 0);
        boolean boolean11 = dateTime5.isAfterNow();
        org.joda.time.DateTime dateTime13 = dateTime5.withWeekyear(0);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime13.toMutableDateTime();
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime3 = dateTime2.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime5 = dateTime3.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) '4', dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfSecond();
        boolean boolean14 = dateTime3.isEqual((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime16 = dateTime12.plusMillis(0);
        int int17 = dateTime12.getHourOfDay();
        java.lang.String str18 = dateTime12.toString();
        org.joda.time.DateTime dateTime20 = dateTime12.withSecondOfMinute(7);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str18, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(22, (-52), (-292275054), 335, 292278970, 86300052, 842, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 335 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.DateTime dateTime10 = dateTime2.minusMillis(4);
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime10.toMutableDateTimeISO();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) -1, chronology13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) '4', dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime17.withZoneRetainFields(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) '4', dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = dateTime24.withZoneRetainFields(dateTimeZone27);
        org.joda.time.DateTime.Property property29 = dateTime28.millisOfSecond();
        org.joda.time.DateTime dateTime30 = property29.withMinimumValue();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime30.toMutableDateTime(chronology31);
        boolean boolean33 = dateTime21.isEqual((org.joda.time.ReadableInstant) dateTime30);
        boolean boolean34 = dateTime14.equals((java.lang.Object) dateTime21);
        org.joda.time.DateTime dateTime36 = dateTime21.minusMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) '4', dateTimeZone38);
        org.joda.time.DateTime dateTime41 = dateTime39.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = dateTime39.withZoneRetainFields(dateTimeZone42);
        org.joda.time.DateTime.Property property44 = dateTime43.millisOfSecond();
        org.joda.time.DateTime dateTime45 = property44.getDateTime();
        org.joda.time.DateTime dateTime46 = dateTime45.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology47 = dateTime46.getChronology();
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((java.lang.Object) dateTime21, chronology47);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) '4', dateTimeZone52);
        org.joda.time.DateTime dateTime55 = dateTime53.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateTime dateTime57 = dateTime53.withZoneRetainFields(dateTimeZone56);
        org.joda.time.DateTime.Property property58 = dateTime57.millisOfSecond();
        org.joda.time.DateTime dateTime59 = property58.withMinimumValue();
        org.joda.time.DateTime.Property property60 = dateTime59.centuryOfEra();
        org.joda.time.DateTime.Property property61 = dateTime59.era();
        boolean boolean62 = dateTime59.isEqualNow();
        org.joda.time.Chronology chronology63 = dateTime59.getChronology();
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((java.lang.Object) dateTime50, chronology63);
        org.joda.time.DateTime dateTime65 = dateTime21.withChronology(chronology63);
        org.joda.time.DateTime dateTime66 = dateTime10.withChronology(chronology63);
        org.joda.time.Chronology chronology67 = dateTime10.getChronology();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(chronology67);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime9.getZone();
        org.joda.time.DateTime dateTime11 = dateTime2.withZone(dateTimeZone10);
        org.joda.time.DateTime.Property property12 = dateTime11.centuryOfEra();
        org.joda.time.DateTime.Property property13 = dateTime11.minuteOfDay();
        org.joda.time.DateTime dateTime14 = property13.roundHalfFloorCopy();
        int int15 = dateTime14.getHourOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.LocalDate localDate3 = dateTime2.toLocalDate();
        org.joda.time.DateTime dateTime5 = dateTime2.plusWeeks((int) (short) 10);
        org.joda.time.DateTime dateTime6 = dateTime5.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime8 = dateTime5.minusYears(365);
        org.joda.time.DateTime.Property property9 = dateTime8.minuteOfHour();
        int int10 = property9.getLeapAmount();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        int int9 = dateTime8.getDayOfWeek();
        org.joda.time.DateTime.Property property10 = dateTime8.year();
        java.lang.String str11 = property10.toString();
        org.joda.time.Interval interval12 = property10.toInterval();
        org.joda.time.DateTime dateTime13 = property10.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) '4', dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = dateTime16.withZoneRetainFields(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime16.minusMonths((int) '4');
        int int23 = dateTime22.getDayOfWeek();
        org.joda.time.DateTime.Property property24 = dateTime22.year();
        org.joda.time.DateTime dateTime26 = dateTime22.withWeekyear((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) '4', dateTimeZone28);
        org.joda.time.DateTime dateTime30 = dateTime29.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime32 = dateTime30.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) '4', dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = dateTime35.withZoneRetainFields(dateTimeZone38);
        org.joda.time.DateTime.Property property40 = dateTime39.millisOfSecond();
        boolean boolean41 = dateTime30.isEqual((org.joda.time.ReadableInstant) dateTime39);
        boolean boolean42 = dateTime22.isBefore((org.joda.time.ReadableInstant) dateTime30);
        int int43 = dateTime30.getWeekyear();
        org.joda.time.LocalTime localTime44 = dateTime30.toLocalTime();
        org.joda.time.DateTime dateTime45 = dateTime13.withFields((org.joda.time.ReadablePartial) localTime44);
        int int46 = dateTime45.getMinuteOfHour();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Property[year]" + "'", str11, "Property[year]");
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1970 + "'", int43 == 1970);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) '4', dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime6.withEarlierOffsetAtOverlap();
        long long8 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime dateTime10 = dateTime6.withMinuteOfHour((int) (short) 10);
        boolean boolean11 = dateTime6.isBeforeNow();
        org.joda.time.DateTime.Property property12 = dateTime6.dayOfYear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime9.getZone();
        org.joda.time.DateTime dateTime11 = dateTime2.withZone(dateTimeZone10);
        int int12 = dateTime2.getYear();
        org.joda.time.DateTime dateTime14 = dateTime2.plusWeeks(12);
        boolean boolean16 = dateTime2.isEqual(100L);
        org.joda.time.DateTime dateTime18 = dateTime2.withDayOfMonth(6);
        org.joda.time.DateTime.Property property19 = dateTime2.weekOfWeekyear();
        int int20 = dateTime2.getYear();
        int int21 = dateTime2.getHourOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekOfWeekyear(10);
        boolean boolean7 = dateTime4.isAfterNow();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime8 = property7.withMinimumValue();
        org.joda.time.DateTime.Property property9 = dateTime8.centuryOfEra();
        org.joda.time.DateTime.Property property10 = dateTime8.era();
        boolean boolean11 = dateTime8.isEqualNow();
        org.joda.time.DateTime dateTime13 = dateTime8.withMillis((long) 999);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) '4', dateTimeZone15);
        org.joda.time.DateTime.Property property17 = dateTime16.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) '4', dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime24 = dateTime22.withWeekOfWeekyear(10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = dateTime24.toString(dateTimeFormatter25);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (byte) -1, chronology28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) '4', dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime32.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = dateTime32.withZoneRetainFields(dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) '4', dateTimeZone38);
        org.joda.time.DateTime dateTime41 = dateTime39.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = dateTime39.withZoneRetainFields(dateTimeZone42);
        org.joda.time.DateTime.Property property44 = dateTime43.millisOfSecond();
        org.joda.time.DateTime dateTime45 = property44.withMinimumValue();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = dateTime45.toMutableDateTime(chronology46);
        boolean boolean48 = dateTime36.isEqual((org.joda.time.ReadableInstant) dateTime45);
        boolean boolean49 = dateTime29.equals((java.lang.Object) dateTime36);
        org.joda.time.DateTime dateTime51 = dateTime36.minusMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) '4', dateTimeZone53);
        org.joda.time.DateTime dateTime56 = dateTime54.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = dateTime54.withZoneRetainFields(dateTimeZone57);
        org.joda.time.DateTime.Property property59 = dateTime58.millisOfSecond();
        org.joda.time.DateTime dateTime60 = property59.getDateTime();
        org.joda.time.DateTime dateTime61 = dateTime60.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology62 = dateTime61.getChronology();
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((java.lang.Object) dateTime36, chronology62);
        org.joda.time.MutableDateTime mutableDateTime64 = dateTime24.toMutableDateTime(chronology62);
        org.joda.time.DateTime dateTime65 = dateTime16.toDateTime(chronology62);
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime(chronology62);
        org.joda.time.DateTime dateTime67 = dateTime13.toDateTime(chronology62);
        org.joda.time.ReadableDuration readableDuration68 = null;
        org.joda.time.DateTime dateTime69 = dateTime13.minus(readableDuration68);
        org.joda.time.ReadableDuration readableDuration70 = null;
        org.joda.time.DateTime dateTime72 = dateTime69.withDurationAdded(readableDuration70, 356);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-03-05T01:40:00.052Z" + "'", str26, "1970-03-05T01:40:00.052Z");
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(mutableDateTime64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(dateTime72);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime9 = dateTime6.plusMillis(23609);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime9.getZone();
        org.joda.time.DateTime dateTime11 = dateTime2.withZone(dateTimeZone10);
        int int12 = dateTime2.getYear();
        org.joda.time.DateTime dateTime14 = dateTime2.plusWeeks(12);
        boolean boolean16 = dateTime2.isEqual(100L);
        boolean boolean17 = dateTime2.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) '4', dateTimeZone19);
        org.joda.time.DateTime dateTime21 = dateTime20.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime23 = dateTime21.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) '4', dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = dateTime26.withZoneRetainFields(dateTimeZone29);
        org.joda.time.DateTime.Property property31 = dateTime30.millisOfSecond();
        boolean boolean32 = dateTime21.isEqual((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTime.Property property33 = dateTime30.weekyear();
        org.joda.time.DateTime dateTime35 = property33.addWrapFieldToCopy(1969);
        boolean boolean36 = dateTime2.isBefore((org.joda.time.ReadableInstant) dateTime35);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) '4', dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMinutes((int) (short) 100);
        int int8 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime10 = dateTime5.withSecondOfMinute((int) (short) 0);
        org.joda.time.DateTime dateTime11 = dateTime5.withLaterOffsetAtOverlap();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.plus(readableDuration12);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant7 = dateTime4.toInstant();
        org.joda.time.DateTime.Property property8 = dateTime4.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) '4', dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = dateTime11.withZoneRetainFields(dateTimeZone14);
        org.joda.time.DateTime.Property property16 = dateTime15.millisOfSecond();
        org.joda.time.DateTime dateTime17 = property16.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) '4', dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime24 = dateTime22.withWeekOfWeekyear(10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = dateTime24.toString(dateTimeFormatter25);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (byte) -1, chronology28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) '4', dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime32.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = dateTime32.withZoneRetainFields(dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) '4', dateTimeZone38);
        org.joda.time.DateTime dateTime41 = dateTime39.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = dateTime39.withZoneRetainFields(dateTimeZone42);
        org.joda.time.DateTime.Property property44 = dateTime43.millisOfSecond();
        org.joda.time.DateTime dateTime45 = property44.withMinimumValue();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = dateTime45.toMutableDateTime(chronology46);
        boolean boolean48 = dateTime36.isEqual((org.joda.time.ReadableInstant) dateTime45);
        boolean boolean49 = dateTime29.equals((java.lang.Object) dateTime36);
        org.joda.time.DateTime dateTime51 = dateTime36.minusMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) '4', dateTimeZone53);
        org.joda.time.DateTime dateTime56 = dateTime54.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = dateTime54.withZoneRetainFields(dateTimeZone57);
        org.joda.time.DateTime.Property property59 = dateTime58.millisOfSecond();
        org.joda.time.DateTime dateTime60 = property59.getDateTime();
        org.joda.time.DateTime dateTime61 = dateTime60.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology62 = dateTime61.getChronology();
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((java.lang.Object) dateTime36, chronology62);
        org.joda.time.MutableDateTime mutableDateTime64 = dateTime24.toMutableDateTime(chronology62);
        org.joda.time.MutableDateTime mutableDateTime65 = dateTime17.toMutableDateTime(chronology62);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((java.lang.Object) property8, chronology62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-03-05T01:40:00.052Z" + "'", str26, "1970-03-05T01:40:00.052Z");
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(mutableDateTime64);
        org.junit.Assert.assertNotNull(mutableDateTime65);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = dateTime3.getZone();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(0L, dateTimeZone4);
        org.joda.time.LocalTime localTime6 = dateTime5.toLocalTime();
        org.joda.time.Chronology chronology7 = dateTime5.getChronology();
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTimeISO();
        org.joda.time.DateTime.Property property10 = dateTime8.secondOfDay();
        org.joda.time.DateTime dateTime11 = property10.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime12 = property10.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime12.withEra(50);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 50 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.TimeOfDay timeOfDay5 = dateTime2.toTimeOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(timeOfDay5);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTimeISO();
        org.joda.time.DateTime.Property property10 = dateTime8.secondOfDay();
        org.joda.time.DateTime dateTime11 = property10.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime12 = property10.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime14 = property10.addToCopy((int) '4');
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime14.getZone();
        org.joda.time.DateTime dateTime17 = dateTime14.plusMillis((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = dateTime17.withDayOfMonth((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekOfWeekyear(10);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.withZoneRetainFields(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTime16.getZone();
        org.joda.time.DateTime dateTime18 = dateTime9.withZone(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime6.toMutableDateTime(dateTimeZone17);
        org.joda.time.DateTime.Property property20 = dateTime6.secondOfDay();
        org.joda.time.DateTime dateTime22 = dateTime6.minusWeeks(11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime24 = dateTime6.withHourOfDay((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime3 = dateTime2.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime5 = dateTime3.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) '4', dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime8.minusMonths((int) '4');
        org.joda.time.DateTime.Property property15 = dateTime8.centuryOfEra();
        org.joda.time.DateTime dateTime16 = property15.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property15.getFieldType();
        int int18 = dateTime3.get(dateTimeFieldType17);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) '4', dateTimeZone20);
        org.joda.time.DateTime dateTime22 = dateTime21.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime24 = dateTime22.withCenturyOfEra(3);
        org.joda.time.DateTime dateTime26 = dateTime22.minusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) '4', dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = dateTime29.withZoneRetainFields(dateTimeZone32);
        org.joda.time.DateTime.Property property34 = dateTime33.millisOfSecond();
        org.joda.time.DateTime dateTime35 = dateTime33.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (-1));
        boolean boolean38 = dateTime33.isAfter((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime39 = dateTime33.toDateTimeISO();
        boolean boolean40 = dateTime26.isEqual((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTime.Property property41 = dateTime26.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) '4', dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) '4', dateTimeZone46);
        org.joda.time.DateTime dateTime49 = dateTime47.plusMinutes((int) (short) 100);
        int int50 = dateTime44.compareTo((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime dateTime52 = dateTime47.withSecondOfMinute((int) (short) 0);
        int int53 = dateTime47.getDayOfMonth();
        org.joda.time.DateTime dateTime55 = dateTime47.minusWeeks((int) '4');
        boolean boolean56 = dateTime26.isEqual((org.joda.time.ReadableInstant) dateTime47);
        boolean boolean57 = dateTime3.isBefore((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.DateTime dateTime60 = dateTime3.withDurationAdded(readableDuration58, 10);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone62);
        org.joda.time.DateTimeZone dateTimeZone64 = dateTime63.getZone();
        org.joda.time.DateTime dateTime66 = dateTime63.minusDays((int) (byte) 10);
        org.joda.time.DateTime dateTime68 = dateTime66.withSecondOfMinute(10);
        java.util.Locale locale69 = null;
        java.util.Calendar calendar70 = dateTime68.toCalendar(locale69);
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime((long) '4', dateTimeZone72);
        org.joda.time.DateTime dateTime74 = dateTime73.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime76 = dateTime74.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime((long) '4', dateTimeZone78);
        org.joda.time.DateTime dateTime81 = dateTime79.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone82 = null;
        org.joda.time.DateTime dateTime83 = dateTime79.withZoneRetainFields(dateTimeZone82);
        org.joda.time.DateTime dateTime85 = dateTime79.minusMonths((int) '4');
        org.joda.time.DateTime.Property property86 = dateTime79.centuryOfEra();
        org.joda.time.DateTime dateTime87 = property86.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType88 = property86.getFieldType();
        int int89 = dateTime74.get(dateTimeFieldType88);
        org.joda.time.DateTime.Property property90 = dateTime68.property(dateTimeFieldType88);
        org.joda.time.DateTime dateTime92 = dateTime60.withField(dateTimeFieldType88, 23);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19 + "'", int18 == 19);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTimeZone64);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(calendar70);
        org.junit.Assert.assertEquals(calendar70.toString(), "java.util.GregorianCalendar[time=-863990000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=52,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=356,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=10,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertNotNull(property86);
        org.junit.Assert.assertNotNull(dateTime87);
        org.junit.Assert.assertNotNull(dateTimeFieldType88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 19 + "'", int89 == 19);
        org.junit.Assert.assertNotNull(property90);
        org.junit.Assert.assertNotNull(dateTime92);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.plus(readablePeriod9);
        org.joda.time.YearMonthDay yearMonthDay11 = dateTime8.toYearMonthDay();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime13 = dateTime8.minus(readablePeriod12);
        org.joda.time.DateTime dateTime15 = dateTime13.minusMinutes(292278993);
        org.joda.time.DateTime dateTime17 = dateTime13.plusYears((int) 'a');
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime8.monthOfYear();
        org.joda.time.DateTime.Property property10 = dateTime8.weekyear();
        org.joda.time.DateTime dateTime13 = dateTime8.withDurationAdded((-1583L), (int) (byte) -1);
        org.joda.time.DateTime dateTime15 = dateTime8.withDayOfYear(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTime8.withWeekOfWeekyear(842);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 842 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) '4', dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear(10);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = dateTime10.withZoneRetainFields(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTime17.getZone();
        org.joda.time.DateTime dateTime19 = dateTime10.withZone(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime7.toMutableDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (short) 100, dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) '4', dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) '4', dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.plusMinutes((int) (short) 100);
        int int30 = dateTime24.compareTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime dateTime32 = dateTime27.withSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) '4', dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = dateTime35.withZoneRetainFields(dateTimeZone38);
        long long40 = dateTime39.getMillis();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) '4', dateTimeZone43);
        org.joda.time.DateTime dateTime46 = dateTime44.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = dateTime44.withZoneRetainFields(dateTimeZone47);
        org.joda.time.DateTime.Property property49 = dateTime48.millisOfSecond();
        org.joda.time.DateTime dateTime50 = property49.getDateTime();
        org.joda.time.DateTime dateTime51 = dateTime50.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology52 = dateTime51.getChronology();
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) (byte) 0, chronology52);
        org.joda.time.DateTime dateTime54 = org.joda.time.DateTime.now(chronology52);
        org.joda.time.MutableDateTime mutableDateTime55 = dateTime39.toMutableDateTime(chronology52);
        org.joda.time.DateTime dateTime56 = dateTime32.toDateTime(chronology52);
        boolean boolean57 = dateTime21.isEqual((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTime.Property property58 = dateTime21.weekyear();
        java.lang.String str59 = property58.getAsString();
        org.joda.time.DateTime dateTime61 = property58.addWrapFieldToCopy(31);
        org.joda.time.DateTime dateTime63 = dateTime61.minusMillis(999);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str65 = dateTime61.toString("1965-09-01T00:00:00.052Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 52L + "'", long40 == 52L);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(mutableDateTime55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "1970" + "'", str59, "1970");
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime63);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) '4', dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime6.withEarlierOffsetAtOverlap();
        long long8 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime dateTime9 = property3.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) '4', dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime16 = dateTime14.withWeekOfWeekyear(10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = dateTime16.toString(dateTimeFormatter17);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) '4', dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = dateTime21.withZoneRetainFields(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime21.minusMonths((int) '4');
        org.joda.time.DateTime.Property property28 = dateTime21.centuryOfEra();
        org.joda.time.DateTime dateTime29 = property28.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property28.getFieldType();
        int int31 = dateTime16.get(dateTimeFieldType30);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) '4', dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = dateTime34.withZoneRetainFields(dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone42 = dateTime41.getZone();
        org.joda.time.DateTime dateTime43 = dateTime34.withZone(dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) '4', dateTimeZone45);
        org.joda.time.LocalDate localDate47 = dateTime46.toLocalDate();
        org.joda.time.DateTime dateTime48 = dateTime43.withFields((org.joda.time.ReadablePartial) localDate47);
        org.joda.time.DateTime dateTime49 = dateTime16.withFields((org.joda.time.ReadablePartial) localDate47);
        org.joda.time.DateTime dateTime50 = dateTime9.withFields((org.joda.time.ReadablePartial) localDate47);
        int int51 = dateTime50.getDayOfYear();
        org.joda.time.YearMonthDay yearMonthDay52 = dateTime50.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) '4', dateTimeZone54);
        org.joda.time.DateTime dateTime57 = dateTime55.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone58 = dateTime57.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((java.lang.Object) yearMonthDay52, dateTimeZone58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.YearMonthDay");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-03-05T01:40:00.052Z" + "'", str18, "1970-03-05T01:40:00.052Z");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 19 + "'", int31 == 19);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(yearMonthDay52);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTimeZone58);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) '4', dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime6.withEarlierOffsetAtOverlap();
        long long8 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime dateTime10 = dateTime6.withMinuteOfHour((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone12);
        boolean boolean14 = dateTime10.equals((java.lang.Object) dateTimeZone12);
        org.joda.time.DateTime dateTime16 = dateTime10.withMillis(20995200052L);
        int int17 = dateTime10.getMillisOfDay();
        org.joda.time.DateTime.Property property18 = dateTime10.weekOfWeekyear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 600052 + "'", int17 == 600052);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime8 = property7.getDateTime();
        org.joda.time.DateTime dateTime9 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = dateTime8.toString(dateTimeFormatter10);
        org.joda.time.DateTime.Property property12 = dateTime8.hourOfDay();
        java.util.Locale locale13 = null;
        java.util.Calendar calendar14 = dateTime8.toCalendar(locale13);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str11, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(calendar14);
        org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=52,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=52,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime3 = dateTime2.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) '4', dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime8.minusMonths((int) '4');
        int int15 = dateTime14.getDayOfWeek();
        org.joda.time.DateTime.Property property16 = dateTime14.year();
        org.joda.time.DateTime dateTime18 = dateTime14.withWeekyear((int) (short) 100);
        java.util.Locale locale19 = null;
        java.util.Calendar calendar20 = dateTime18.toCalendar(locale19);
        org.joda.time.DateTime dateTime22 = dateTime18.minus(10L);
        org.joda.time.DateTime dateTime24 = dateTime18.plusWeeks(0);
        boolean boolean25 = dateTime5.isAfter((org.joda.time.ReadableInstant) dateTime24);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(calendar20);
        org.junit.Assert.assertEquals(calendar20.toString(), "java.util.GregorianCalendar[time=-58990463999948,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=8,WEEK_OF_YEAR=36,WEEK_OF_MONTH=1,DAY_OF_MONTH=2,DAY_OF_YEAR=246,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=52,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime9.getZone();
        org.joda.time.DateTime dateTime11 = dateTime2.withZone(dateTimeZone10);
        int int12 = dateTime2.getYear();
        org.joda.time.DateTime dateTime14 = dateTime2.plusWeeks(12);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) '4', dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime17.withZoneRetainFields(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime17.minusMonths((int) '4');
        org.joda.time.DateTime.Property property24 = dateTime17.centuryOfEra();
        org.joda.time.DateTime dateTime25 = property24.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property24.getFieldType();
        org.joda.time.DateTime dateTime28 = dateTime14.withField(dateTimeFieldType26, 10);
        org.joda.time.DateTime dateTime30 = dateTime14.withMillisOfSecond(0);
        org.joda.time.DateTime dateTime32 = dateTime14.withYear(8);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTimeISO();
        org.joda.time.DateTime.Property property10 = dateTime8.secondOfDay();
        org.joda.time.DateTime dateTime11 = property10.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime12 = property10.roundHalfEvenCopy();
        org.joda.time.Interval interval13 = property10.toInterval();
        org.joda.time.DurationField durationField14 = property10.getLeapDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property10.getFieldType();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime8 = property7.getDateTime();
        int int9 = dateTime8.getYearOfEra();
        java.util.Locale locale10 = null;
        java.util.Calendar calendar11 = dateTime8.toCalendar(locale10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime15.getZone();
        org.joda.time.DateTime dateTime18 = dateTime15.minusDays((int) (byte) 10);
        org.joda.time.DateTime.Property property19 = dateTime18.weekyear();
        int int20 = dateTime18.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTime23.getZone();
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime18.toMutableDateTime(dateTimeZone24);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) 365, dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime8.withZoneRetainFields(dateTimeZone24);
        org.joda.time.DateTime.Property property28 = dateTime8.monthOfYear();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=52,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=52,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime5 = dateTime2.minusDays((int) (byte) 10);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMillis(10);
        org.joda.time.DateTime.Property property8 = dateTime5.secondOfMinute();
        java.lang.String str9 = property8.getAsString();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) '4', dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = dateTime12.withZoneRetainFields(dateTimeZone15);
        org.joda.time.DateTime.Property property17 = dateTime16.millisOfSecond();
        org.joda.time.DateTime dateTime18 = property17.withMinimumValue();
        org.joda.time.DateTime dateTime19 = property17.getDateTime();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) '4', dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = dateTime22.withZoneRetainFields(dateTimeZone25);
        org.joda.time.DateTime.Property property27 = dateTime26.millisOfSecond();
        org.joda.time.DateTime dateTime28 = property27.withMinimumValue();
        org.joda.time.DateTime.Property property29 = dateTime28.centuryOfEra();
        org.joda.time.DateTime.Property property30 = dateTime28.era();
        boolean boolean31 = dateTime28.isEqualNow();
        org.joda.time.Chronology chronology32 = dateTime28.getChronology();
        org.joda.time.DateTime dateTime33 = dateTime19.toDateTime(chronology32);
        int int34 = property8.compareTo((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime36 = dateTime19.minusDays(4);
        org.joda.time.DateTime dateTime37 = dateTime19.withLaterOffsetAtOverlap();
        int int38 = dateTime37.getHourOfDay();
        org.joda.time.DateTime dateTime40 = dateTime37.withMillisOfDay(0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(dateTime40);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime3 = dateTime2.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTime7.getZone();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(0L, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) '4', dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = dateTime12.withZoneRetainFields(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime12.minusMonths((int) '4');
        org.joda.time.DateTime.Property property19 = dateTime12.centuryOfEra();
        org.joda.time.DateTime dateTime20 = property19.withMaximumValue();
        org.joda.time.DateTime dateTime21 = property19.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime22 = dateTime21.toLocalTime();
        org.joda.time.DateTime dateTime23 = dateTime9.withTime(localTime22);
        org.joda.time.DateTime dateTime24 = dateTime3.withTime(localTime22);
        org.joda.time.DateTime dateTime26 = dateTime24.withYearOfCentury(0);
        int int27 = dateTime24.getYear();
        org.joda.time.DateTime dateTime29 = dateTime24.plusMillis(292278970);
        org.joda.time.DateTime dateTime30 = dateTime29.toDateTime();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1970 + "'", int27 == 1970);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime3 = dateTime2.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime5 = dateTime3.withCenturyOfEra(3);
        org.joda.time.DateTime dateTime7 = dateTime3.minusHours((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime9 = dateTime3.plus(readablePeriod8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.minus(readablePeriod10);
        org.joda.time.DateTime.Property property12 = dateTime11.dayOfWeek();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.minus(readableDuration9);
        org.joda.time.DateTime dateTime12 = dateTime10.plusHours(6);
        int int13 = dateTime12.getSecondOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 21600 + "'", int13 == 21600);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime5 = dateTime2.minusDays((int) (byte) 10);
        org.joda.time.DateTime dateTime7 = dateTime5.withSecondOfMinute(10);
        java.util.Date date8 = dateTime5.toDate();
        org.joda.time.DateTime dateTime10 = dateTime5.plusSeconds(50);
        org.joda.time.DateTime dateTime12 = dateTime10.minusSeconds(50);
        int int13 = dateTime12.getDayOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Mon Dec 22 00:00:00 UTC 1969");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 356 + "'", int13 == 356);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekOfWeekyear(10);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = dateTime4.toDateTime(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime8.monthOfYear();
        org.joda.time.DateTime dateTime10 = property9.roundFloorCopy();
        long long11 = property9.remainder();
        org.joda.time.DateTime dateTime12 = property9.roundCeilingCopy();
        org.joda.time.DateTime dateTime14 = dateTime12.minusDays(0);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) '4', dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMinutes((int) (short) 100);
        int int8 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime10 = dateTime5.plusMonths((int) (short) 100);
        boolean boolean12 = dateTime5.isAfter((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '4', dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = dateTime15.withZoneRetainFields(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) '4', dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = dateTime22.withZoneRetainFields(dateTimeZone25);
        org.joda.time.DateTime.Property property27 = dateTime26.millisOfSecond();
        org.joda.time.DateTime dateTime28 = property27.withMinimumValue();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime28.toMutableDateTime(chronology29);
        boolean boolean31 = dateTime19.isEqual((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime34 = dateTime28.withDurationAdded(readableDuration32, 356);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) '4', dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTime40.getZone();
        int int42 = dateTime37.compareTo((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTime dateTime44 = dateTime37.plusMonths((int) '#');
        org.joda.time.DateTime dateTime46 = dateTime37.plusMillis((int) ' ');
        org.joda.time.DateTime dateTime48 = dateTime46.plusYears((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) '4', dateTimeZone50);
        org.joda.time.DateTime dateTime53 = dateTime51.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = dateTime51.withZoneRetainFields(dateTimeZone54);
        org.joda.time.DateTime dateTime57 = dateTime51.minusMonths((int) '4');
        org.joda.time.DateTime.Property property58 = dateTime51.centuryOfEra();
        org.joda.time.DateTime dateTime59 = property58.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = property58.getFieldType();
        int int61 = dateTime46.get(dateTimeFieldType60);
        boolean boolean62 = dateTime34.isSupported(dateTimeFieldType60);
        org.joda.time.DateTime.Property property63 = dateTime5.property(dateTimeFieldType60);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTimeFieldType60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 19 + "'", int61 == 19);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(property63);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime2.dayOfYear();
        int int10 = dateTime2.getYear();
        org.joda.time.DateTime dateTime12 = dateTime2.withWeekOfWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '4', dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = dateTime15.withZoneRetainFields(dateTimeZone18);
        org.joda.time.DateTime.Property property20 = dateTime19.millisOfSecond();
        org.joda.time.DateTime dateTime21 = property20.withMinimumValue();
        org.joda.time.DateTime.Property property22 = dateTime21.centuryOfEra();
        org.joda.time.DateTime.Property property23 = dateTime21.era();
        boolean boolean24 = dateTime21.isEqualNow();
        org.joda.time.Chronology chronology25 = dateTime21.getChronology();
        org.joda.time.DateTime dateTime26 = dateTime2.toDateTime(chronology25);
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(chronology25);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime3 = dateTime2.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime5 = dateTime3.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) '4', dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfSecond();
        boolean boolean14 = dateTime3.isEqual((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime16 = dateTime12.plusMillis(0);
        org.joda.time.DateTime.Property property17 = dateTime12.millisOfDay();
        java.lang.String str18 = property17.getName();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime21.getZone();
        org.joda.time.DateTime dateTime24 = dateTime21.minusDays((int) (byte) 10);
        org.joda.time.DateTime dateTime26 = dateTime24.plusMillis(10);
        org.joda.time.DateTime.Property property27 = dateTime24.secondOfMinute();
        java.lang.String str28 = property27.getAsString();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) '4', dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = dateTime31.withZoneRetainFields(dateTimeZone34);
        org.joda.time.DateTime.Property property36 = dateTime35.millisOfSecond();
        org.joda.time.DateTime dateTime37 = property36.withMinimumValue();
        org.joda.time.DateTime dateTime38 = property36.getDateTime();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) '4', dateTimeZone40);
        org.joda.time.DateTime dateTime43 = dateTime41.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = dateTime41.withZoneRetainFields(dateTimeZone44);
        org.joda.time.DateTime.Property property46 = dateTime45.millisOfSecond();
        org.joda.time.DateTime dateTime47 = property46.withMinimumValue();
        org.joda.time.DateTime.Property property48 = dateTime47.centuryOfEra();
        org.joda.time.DateTime.Property property49 = dateTime47.era();
        boolean boolean50 = dateTime47.isEqualNow();
        org.joda.time.Chronology chronology51 = dateTime47.getChronology();
        org.joda.time.DateTime dateTime52 = dateTime38.toDateTime(chronology51);
        int int53 = property27.compareTo((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTime dateTime55 = dateTime38.minusDays(4);
        int int56 = property17.getDifference((org.joda.time.ReadableInstant) dateTime38);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "millisOfDay" + "'", str18, "millisOfDay");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0" + "'", str28, "0");
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTime5.getZone();
        int int7 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime5);
        int int8 = dateTime2.getYearOfEra();
        org.joda.time.DateTime dateTime10 = dateTime2.withCenturyOfEra(100);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        int int9 = dateTime8.getDayOfWeek();
        org.joda.time.DateTime.Property property10 = dateTime8.year();
        org.joda.time.DateTime dateTime12 = dateTime8.withWeekyear((int) (short) 100);
        java.util.Locale locale13 = null;
        java.util.Calendar calendar14 = dateTime12.toCalendar(locale13);
        org.joda.time.DateTime dateTime16 = dateTime12.minus(10L);
        org.joda.time.DateTime dateTime18 = dateTime12.withMillis((long) 12);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) '4', dateTimeZone20);
        org.joda.time.DateTime dateTime22 = dateTime21.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime24 = dateTime22.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) '4', dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = dateTime27.withZoneRetainFields(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime27.minusMonths((int) '4');
        org.joda.time.DateTime.Property property34 = dateTime27.centuryOfEra();
        org.joda.time.DateTime dateTime35 = property34.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property34.getFieldType();
        int int37 = dateTime22.get(dateTimeFieldType36);
        org.joda.time.DateTime.Property property38 = dateTime18.property(dateTimeFieldType36);
        org.joda.time.DateTime dateTime40 = org.joda.time.DateTime.parse("1969");
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime40.toMutableDateTimeISO();
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.DateTime dateTime44 = dateTime40.withPeriodAdded(readablePeriod42, 0);
        int int45 = property38.compareTo((org.joda.time.ReadableInstant) dateTime44);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(calendar14);
        org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=-58990463999948,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=8,WEEK_OF_YEAR=36,WEEK_OF_MONTH=1,DAY_OF_MONTH=2,DAY_OF_YEAR=246,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=52,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 19 + "'", int37 == 19);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime5 = dateTime2.minusDays((int) (byte) 10);
        org.joda.time.DateTime dateTime7 = dateTime5.plusDays((int) '#');
        org.joda.time.DateTime dateTime9 = dateTime7.withMillisOfSecond((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) '4', dateTimeZone12);
        int int14 = dateTime13.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) '4', dateTimeZone16);
        org.joda.time.DateTime.Property property18 = dateTime17.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) '4', dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime25 = dateTime23.withWeekOfWeekyear(10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = dateTime25.toString(dateTimeFormatter26);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (byte) -1, chronology29);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) '4', dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = dateTime33.withZoneRetainFields(dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) '4', dateTimeZone39);
        org.joda.time.DateTime dateTime42 = dateTime40.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = dateTime40.withZoneRetainFields(dateTimeZone43);
        org.joda.time.DateTime.Property property45 = dateTime44.millisOfSecond();
        org.joda.time.DateTime dateTime46 = property45.withMinimumValue();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = dateTime46.toMutableDateTime(chronology47);
        boolean boolean49 = dateTime37.isEqual((org.joda.time.ReadableInstant) dateTime46);
        boolean boolean50 = dateTime30.equals((java.lang.Object) dateTime37);
        org.joda.time.DateTime dateTime52 = dateTime37.minusMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) '4', dateTimeZone54);
        org.joda.time.DateTime dateTime57 = dateTime55.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = dateTime55.withZoneRetainFields(dateTimeZone58);
        org.joda.time.DateTime.Property property60 = dateTime59.millisOfSecond();
        org.joda.time.DateTime dateTime61 = property60.getDateTime();
        org.joda.time.DateTime dateTime62 = dateTime61.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology63 = dateTime62.getChronology();
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((java.lang.Object) dateTime37, chronology63);
        org.joda.time.MutableDateTime mutableDateTime65 = dateTime25.toMutableDateTime(chronology63);
        org.joda.time.DateTime dateTime66 = dateTime17.toDateTime(chronology63);
        org.joda.time.DateTime dateTime67 = dateTime13.withChronology(chronology63);
        org.joda.time.DateTime dateTime68 = org.joda.time.DateTime.now(chronology63);
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime((long) (byte) 100, chronology63);
        org.joda.time.DateTime dateTime70 = org.joda.time.DateTime.now(chronology63);
        org.joda.time.DateTime dateTime71 = dateTime9.withChronology(chronology63);
        org.joda.time.DateTime dateTime73 = dateTime71.plus((long) 3);
        org.joda.time.DateTime dateTime75 = dateTime71.withYearOfCentury((int) '#');
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-03-05T01:40:00.052Z" + "'", str27, "1970-03-05T01:40:00.052Z");
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(mutableDateTime65);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(dateTime75);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        long long7 = dateTime6.getMillis();
        org.joda.time.DateMidnight dateMidnight8 = dateTime6.toDateMidnight();
        org.joda.time.DateTime.Property property9 = dateTime6.dayOfWeek();
        org.joda.time.DurationField durationField10 = property9.getLeapDurationField();
        org.joda.time.DateTime dateTime12 = property9.addWrapFieldToCopy(70);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime8 = property7.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime10 = property7.addToCopy((int) '4');
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours((int) (short) -1);
        org.joda.time.DateTime dateTime14 = dateTime12.withWeekyear(100);
        int int15 = dateTime12.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property16 = dateTime12.monthOfYear();
        org.joda.time.DateTime dateTime17 = property16.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) '4', dateTimeZone19);
        int int21 = dateTime20.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) '4', dateTimeZone23);
        org.joda.time.DateTime.Property property25 = dateTime24.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) '4', dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime32 = dateTime30.withWeekOfWeekyear(10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = dateTime32.toString(dateTimeFormatter33);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (byte) -1, chronology36);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) '4', dateTimeZone39);
        org.joda.time.DateTime dateTime42 = dateTime40.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = dateTime40.withZoneRetainFields(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) '4', dateTimeZone46);
        org.joda.time.DateTime dateTime49 = dateTime47.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = dateTime47.withZoneRetainFields(dateTimeZone50);
        org.joda.time.DateTime.Property property52 = dateTime51.millisOfSecond();
        org.joda.time.DateTime dateTime53 = property52.withMinimumValue();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = dateTime53.toMutableDateTime(chronology54);
        boolean boolean56 = dateTime44.isEqual((org.joda.time.ReadableInstant) dateTime53);
        boolean boolean57 = dateTime37.equals((java.lang.Object) dateTime44);
        org.joda.time.DateTime dateTime59 = dateTime44.minusMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((long) '4', dateTimeZone61);
        org.joda.time.DateTime dateTime64 = dateTime62.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateTime dateTime66 = dateTime62.withZoneRetainFields(dateTimeZone65);
        org.joda.time.DateTime.Property property67 = dateTime66.millisOfSecond();
        org.joda.time.DateTime dateTime68 = property67.getDateTime();
        org.joda.time.DateTime dateTime69 = dateTime68.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology70 = dateTime69.getChronology();
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime((java.lang.Object) dateTime44, chronology70);
        org.joda.time.MutableDateTime mutableDateTime72 = dateTime32.toMutableDateTime(chronology70);
        org.joda.time.DateTime dateTime73 = dateTime24.toDateTime(chronology70);
        org.joda.time.DateTime dateTime74 = dateTime20.withChronology(chronology70);
        org.joda.time.DateTime dateTime75 = org.joda.time.DateTime.now(chronology70);
        long long76 = property16.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime75);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1970-03-05T01:40:00.052Z" + "'", str34, "1970-03-05T01:40:00.052Z");
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(mutableDateTime55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(chronology70);
        org.junit.Assert.assertNotNull(mutableDateTime72);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + (-625L) + "'", long76 == (-625L));
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime9.getZone();
        org.joda.time.DateTime dateTime11 = dateTime2.withZone(dateTimeZone10);
        int int12 = dateTime2.getYear();
        org.joda.time.DateTime dateTime14 = dateTime2.plusWeeks(12);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) '4', dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime17.withZoneRetainFields(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime17.minusMonths((int) '4');
        org.joda.time.DateTime.Property property24 = dateTime17.centuryOfEra();
        org.joda.time.DateTime dateTime25 = property24.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property24.getFieldType();
        org.joda.time.DateTime dateTime28 = dateTime14.withField(dateTimeFieldType26, 10);
        org.joda.time.DateTime dateTime30 = dateTime14.withMillisOfSecond(0);
        org.joda.time.DateTime.Property property31 = dateTime30.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) '4', dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = dateTime34.withZoneRetainFields(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime34.minusMonths((int) '4');
        org.joda.time.DateTime.Property property41 = dateTime34.centuryOfEra();
        org.joda.time.DateTime dateTime42 = property41.withMaximumValue();
        org.joda.time.DateTime dateTime43 = property41.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime44 = dateTime43.toLocalTime();
        org.joda.time.DateTime dateTime45 = dateTime30.withTime(localTime44);
        org.joda.time.DateTime dateTime47 = dateTime45.plus((long) 8);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTimeISO();
        org.joda.time.DateTime.Property property10 = dateTime8.secondOfDay();
        org.joda.time.DateTime dateTime11 = property10.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime12 = property10.roundHalfEvenCopy();
        java.util.Locale locale13 = null;
        java.lang.String str14 = property10.getAsShortText(locale13);
        org.joda.time.DateTime dateTime15 = property10.getDateTime();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) '4', dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime6.withEarlierOffsetAtOverlap();
        long long8 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime dateTime10 = property3.addWrapFieldToCopy(3);
        java.util.Locale locale11 = null;
        int int12 = property3.getMaximumTextLength(locale11);
        org.joda.time.DateTime dateTime14 = property3.addToCopy(356);
        boolean boolean15 = dateTime14.isAfterNow();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        int int9 = dateTime8.getDayOfWeek();
        org.joda.time.DateTime.Property property10 = dateTime8.year();
        org.joda.time.DateTime dateTime12 = dateTime8.withWeekyear((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '4', dateTimeZone14);
        org.joda.time.DateTime dateTime16 = dateTime15.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime18 = dateTime16.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) '4', dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = dateTime21.withZoneRetainFields(dateTimeZone24);
        org.joda.time.DateTime.Property property26 = dateTime25.millisOfSecond();
        boolean boolean27 = dateTime16.isEqual((org.joda.time.ReadableInstant) dateTime25);
        boolean boolean28 = dateTime8.isBefore((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime30 = dateTime8.withSecondOfMinute(20);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        int int9 = dateTime8.getDayOfWeek();
        org.joda.time.DateTime.Property property10 = dateTime8.year();
        org.joda.time.DateTime dateTime12 = dateTime8.withWeekyear((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '4', dateTimeZone14);
        org.joda.time.DateTime dateTime16 = dateTime15.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime18 = dateTime16.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) '4', dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = dateTime21.withZoneRetainFields(dateTimeZone24);
        org.joda.time.DateTime.Property property26 = dateTime25.millisOfSecond();
        boolean boolean27 = dateTime16.isEqual((org.joda.time.ReadableInstant) dateTime25);
        boolean boolean28 = dateTime8.isBefore((org.joda.time.ReadableInstant) dateTime16);
        int int29 = dateTime16.getEra();
        org.joda.time.DateTime.Property property30 = dateTime16.minuteOfHour();
        org.joda.time.DateTime dateTime32 = property30.setCopy(1);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) '4', dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime36.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime40 = dateTime38.withWeekOfWeekyear(10);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) '4', dateTimeZone42);
        org.joda.time.DateTime dateTime45 = dateTime43.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = dateTime43.withZoneRetainFields(dateTimeZone46);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone49);
        org.joda.time.DateTimeZone dateTimeZone51 = dateTime50.getZone();
        org.joda.time.DateTime dateTime52 = dateTime43.withZone(dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime53 = dateTime40.toMutableDateTime(dateTimeZone51);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) (short) 100, dateTimeZone51);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) '4', dateTimeZone56);
        org.joda.time.DateTime dateTime59 = dateTime57.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.DateTime dateTime61 = dateTime57.withZoneRetainFields(dateTimeZone60);
        org.joda.time.DateTime.Property property62 = dateTime61.millisOfSecond();
        org.joda.time.DateTime dateTime63 = property62.getDateTime();
        org.joda.time.DateTimeField dateTimeField64 = property62.getField();
        int int65 = dateTime54.get(dateTimeField64);
        org.joda.time.DateTime dateTime67 = dateTime54.plusHours(292278993);
        int int68 = dateTime67.getDayOfYear();
        org.joda.time.DateMidnight dateMidnight69 = dateTime67.toDateMidnight();
        java.lang.String str70 = dateMidnight69.toString();
        long long71 = property30.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight69);
        boolean boolean72 = dateMidnight69.isAfterNow();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(mutableDateTime53);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 11 + "'", int68 == 11);
        org.junit.Assert.assertNotNull(dateMidnight69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "35313-01-11T00:00:00.000Z" + "'", str70, "35313-01-11T00:00:00.000Z");
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + (-17536739039L) + "'", long71 == (-17536739039L));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime3 = dateTime2.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime5 = dateTime3.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) '4', dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime8.minusMonths((int) '4');
        org.joda.time.DateTime.Property property15 = dateTime8.centuryOfEra();
        org.joda.time.DateTime dateTime16 = property15.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property15.getFieldType();
        int int18 = dateTime3.get(dateTimeFieldType17);
        org.joda.time.DateTime.Property property19 = dateTime3.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) '4', dateTimeZone21);
        org.joda.time.DateTime.Property property23 = dateTime22.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) '4', dateTimeZone25);
        org.joda.time.DateTime dateTime27 = dateTime26.withEarlierOffsetAtOverlap();
        long long28 = property23.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime dateTime30 = dateTime26.withMinuteOfHour((int) (short) 10);
        org.joda.time.DateTime dateTime32 = dateTime26.withWeekyear(999);
        int int33 = property19.getDifference((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.DateTime dateTime36 = dateTime26.withPeriodAdded(readablePeriod34, 8);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) '4', dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) '4', dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.plusMinutes((int) (short) 100);
        int int45 = dateTime39.compareTo((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime dateTime46 = dateTime42.toDateTimeISO();
        int int47 = dateTime46.getDayOfYear();
        org.joda.time.DateTime dateTime49 = dateTime46.plusSeconds(85);
        org.joda.time.DateTime dateTime51 = dateTime49.withYearOfCentury(0);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) '4', dateTimeZone53);
        org.joda.time.DateTime.Property property55 = dateTime54.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) '4', dateTimeZone57);
        org.joda.time.DateTime dateTime59 = dateTime58.withEarlierOffsetAtOverlap();
        long long60 = property55.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DateTime dateTime62 = dateTime58.withMinuteOfHour((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone64);
        boolean boolean66 = dateTime62.equals((java.lang.Object) dateTimeZone64);
        org.joda.time.DateTime dateTime68 = dateTime62.withMillis(20995200052L);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime((long) '4', dateTimeZone71);
        org.joda.time.DateTime dateTime74 = dateTime72.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.DateTime dateTime76 = dateTime72.withZoneRetainFields(dateTimeZone75);
        org.joda.time.DateTime.Property property77 = dateTime76.millisOfSecond();
        org.joda.time.DateTime dateTime78 = property77.getDateTime();
        org.joda.time.DateTime dateTime79 = dateTime78.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology80 = dateTime79.getChronology();
        org.joda.time.DateTime dateTime81 = new org.joda.time.DateTime((long) (byte) 0, chronology80);
        org.joda.time.MutableDateTime mutableDateTime82 = dateTime62.toMutableDateTime(chronology80);
        org.joda.time.DateTime dateTime83 = dateTime51.withChronology(chronology80);
        org.joda.time.DateTime dateTime84 = dateTime36.toDateTime(chronology80);
        org.joda.time.DateTime.Property property85 = dateTime84.minuteOfDay();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19 + "'", int18 == 19);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(chronology80);
        org.junit.Assert.assertNotNull(mutableDateTime82);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(property85);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        int int4 = dateTime2.getEra();
        boolean boolean5 = dateTime2.isEqualNow();
        org.joda.time.LocalDateTime localDateTime6 = dateTime2.toLocalDateTime();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) -1, chronology8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) '4', dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = dateTime12.withZoneRetainFields(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '4', dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = dateTime19.withZoneRetainFields(dateTimeZone22);
        org.joda.time.DateTime.Property property24 = dateTime23.millisOfSecond();
        org.joda.time.DateTime dateTime25 = property24.withMinimumValue();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime25.toMutableDateTime(chronology26);
        boolean boolean28 = dateTime16.isEqual((org.joda.time.ReadableInstant) dateTime25);
        boolean boolean29 = dateTime9.equals((java.lang.Object) dateTime16);
        org.joda.time.DateTime dateTime31 = dateTime16.minusMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = dateTime31.withZone(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone37 = dateTime36.getZone();
        org.joda.time.DateTime dateTime39 = dateTime36.minusDays((int) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar40 = dateTime36.toGregorianCalendar();
        org.joda.time.DateTime.Property property41 = dateTime36.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property41.getFieldType();
        boolean boolean43 = dateTime33.isSupported(dateTimeFieldType42);
        org.joda.time.DateTime.Property property44 = dateTime2.property(dateTimeFieldType42);
        org.joda.time.DateTime dateTime46 = dateTime2.plusYears((-4));
        org.joda.time.DateTime dateTime48 = dateTime2.withWeekyear(8);
        int int49 = dateTime2.getMillisOfDay();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(gregorianCalendar40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 52 + "'", int49 == 52);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        int int9 = dateTime8.getDayOfWeek();
        org.joda.time.DateTime.Property property10 = dateTime8.year();
        long long11 = property10.remainder();
        java.util.Locale locale13 = null;
        org.joda.time.DateTime dateTime14 = property10.setCopy("65", locale13);
        org.joda.time.DateTime dateTime15 = property10.getDateTime();
        long long16 = property10.remainder();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 20995200052L + "'", long11 == 20995200052L);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 20995200052L + "'", long16 == 20995200052L);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) '4', dateTimeZone6);
        org.joda.time.LocalDate localDate8 = dateTime7.toLocalDate();
        int int9 = dateTime7.getCenturyOfEra();
        org.joda.time.DateTime dateTime11 = dateTime7.minusSeconds(52);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = dateTime11.toString(dateTimeFormatter12);
        org.joda.time.DateTime dateTime15 = dateTime11.minusMinutes(4);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) '4', dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.withZoneRetainFields(dateTimeZone21);
        org.joda.time.DateTime.Property property23 = dateTime22.millisOfSecond();
        org.joda.time.DateTime dateTime24 = property23.withMinimumValue();
        org.joda.time.DateTime dateTime26 = dateTime24.withHourOfDay((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) '4', dateTimeZone28);
        org.joda.time.DateTime.Property property30 = dateTime29.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) '4', dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime37 = dateTime35.withWeekOfWeekyear(10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = dateTime37.toString(dateTimeFormatter38);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) (byte) -1, chronology41);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) '4', dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime45.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateTime dateTime49 = dateTime45.withZoneRetainFields(dateTimeZone48);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) '4', dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime52.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateTime dateTime56 = dateTime52.withZoneRetainFields(dateTimeZone55);
        org.joda.time.DateTime.Property property57 = dateTime56.millisOfSecond();
        org.joda.time.DateTime dateTime58 = property57.withMinimumValue();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = dateTime58.toMutableDateTime(chronology59);
        boolean boolean61 = dateTime49.isEqual((org.joda.time.ReadableInstant) dateTime58);
        boolean boolean62 = dateTime42.equals((java.lang.Object) dateTime49);
        org.joda.time.DateTime dateTime64 = dateTime49.minusMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime((long) '4', dateTimeZone66);
        org.joda.time.DateTime dateTime69 = dateTime67.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.DateTime dateTime71 = dateTime67.withZoneRetainFields(dateTimeZone70);
        org.joda.time.DateTime.Property property72 = dateTime71.millisOfSecond();
        org.joda.time.DateTime dateTime73 = property72.getDateTime();
        org.joda.time.DateTime dateTime74 = dateTime73.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology75 = dateTime74.getChronology();
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime((java.lang.Object) dateTime49, chronology75);
        org.joda.time.MutableDateTime mutableDateTime77 = dateTime37.toMutableDateTime(chronology75);
        org.joda.time.DateTime dateTime78 = dateTime29.toDateTime(chronology75);
        org.joda.time.MutableDateTime mutableDateTime79 = dateTime24.toMutableDateTime(chronology75);
        org.joda.time.DateTime dateTime80 = dateTime11.toDateTime(chronology75);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime81 = new org.joda.time.DateTime(31, 600052, 365, 0, 9, chronology75);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 600052 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 19 + "'", int9 == 19);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1969-12-31T23:59:08.052Z" + "'", str13, "1969-12-31T23:59:08.052Z");
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1970-03-05T01:40:00.052Z" + "'", str39, "1970-03-05T01:40:00.052Z");
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(mutableDateTime60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertNotNull(mutableDateTime77);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(mutableDateTime79);
        org.junit.Assert.assertNotNull(dateTime80);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekOfWeekyear(10);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.withZoneRetainFields(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTime16.getZone();
        org.joda.time.DateTime dateTime18 = dateTime9.withZone(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime6.toMutableDateTime(dateTimeZone17);
        org.joda.time.DateTime.Property property20 = dateTime6.secondOfDay();
        org.joda.time.DateTime dateTime22 = dateTime6.minusWeeks(11);
        org.joda.time.DateTime dateTime24 = dateTime22.withYearOfCentury(8);
        java.lang.String str25 = dateTime22.toString();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1969-12-18T01:40:00.052Z" + "'", str25, "1969-12-18T01:40:00.052Z");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime5 = dateTime2.minusDays((int) (byte) 10);
        org.joda.time.DateTime.Property property6 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime8 = property6.addWrapFieldToCopy((-136771200));
        org.joda.time.DateTime dateTime10 = property6.setCopy(1970);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTime5.getZone();
        int int7 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime9 = dateTime2.plusMonths((int) '#');
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime12 = dateTime9.withYearOfCentury(52);
        org.joda.time.DateTime.Property property13 = dateTime9.millisOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(12, 335, (int) ' ', (-136771200), 0, 3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -136771200 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) '4', dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime6.withEarlierOffsetAtOverlap();
        long long8 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime dateTime10 = dateTime6.withMinuteOfHour((int) (short) 10);
        org.joda.time.DateTime dateTime12 = dateTime6.withYearOfCentury(5);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTime5.getZone();
        int int7 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime9 = dateTime2.plusSeconds(292278993);
        org.joda.time.DateTime dateTime11 = dateTime2.withDayOfWeek((int) (short) 1);
        org.joda.time.DateTime dateTime13 = dateTime2.minusDays((int) '#');
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime3 = dateTime2.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime5 = dateTime3.withCenturyOfEra(3);
        org.joda.time.DateTime dateTime7 = dateTime3.minusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = dateTime10.withZoneRetainFields(dateTimeZone13);
        org.joda.time.DateTime.Property property15 = dateTime14.millisOfSecond();
        org.joda.time.DateTime dateTime16 = dateTime14.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (-1));
        boolean boolean19 = dateTime14.isAfter((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime20 = dateTime14.toDateTimeISO();
        boolean boolean21 = dateTime7.isEqual((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime.Property property22 = dateTime7.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) '4', dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) '4', dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.plusMinutes((int) (short) 100);
        int int31 = dateTime25.compareTo((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTime dateTime33 = dateTime28.withSecondOfMinute((int) (short) 0);
        int int34 = dateTime28.getDayOfMonth();
        org.joda.time.DateTime dateTime36 = dateTime28.minusWeeks((int) '4');
        boolean boolean37 = dateTime7.isEqual((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) '4', dateTimeZone39);
        org.joda.time.DateTime dateTime42 = dateTime40.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = dateTime40.withZoneRetainFields(dateTimeZone43);
        org.joda.time.DateTime dateTime46 = dateTime40.minusMonths((int) '4');
        org.joda.time.DateTime.Property property47 = dateTime40.dayOfYear();
        int int48 = dateTime40.getYear();
        org.joda.time.DateTime dateTime50 = dateTime40.withWeekOfWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) '4', dateTimeZone52);
        org.joda.time.DateTime dateTime55 = dateTime53.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateTime dateTime57 = dateTime53.withZoneRetainFields(dateTimeZone56);
        org.joda.time.DateTime.Property property58 = dateTime57.millisOfSecond();
        org.joda.time.DateTime dateTime59 = property58.withMinimumValue();
        org.joda.time.DateTime.Property property60 = dateTime59.centuryOfEra();
        org.joda.time.DateTime.Property property61 = dateTime59.era();
        boolean boolean62 = dateTime59.isEqualNow();
        org.joda.time.Chronology chronology63 = dateTime59.getChronology();
        org.joda.time.DateTime dateTime64 = dateTime40.toDateTime(chronology63);
        org.joda.time.Chronology chronology65 = dateTime40.getChronology();
        org.joda.time.MutableDateTime mutableDateTime66 = dateTime28.toMutableDateTime(chronology65);
        org.joda.time.DateTime dateTime68 = dateTime28.withYearOfEra(69);
        int int69 = dateTime28.getCenturyOfEra();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1970 + "'", int48 == 1970);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(mutableDateTime66);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 19 + "'", int69 == 19);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime3 = dateTime2.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime5 = dateTime3.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) '4', dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfSecond();
        boolean boolean14 = dateTime3.isEqual((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime16 = dateTime12.plusMillis(0);
        org.joda.time.DateTime.Property property17 = dateTime12.millisOfDay();
        java.lang.String str18 = property17.getName();
        java.util.Locale locale19 = null;
        java.lang.String str20 = property17.getAsText(locale19);
        java.lang.String str21 = property17.getAsString();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "millisOfDay" + "'", str18, "millisOfDay");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "52" + "'", str20, "52");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "52" + "'", str21, "52");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) '4', dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = dateTime4.withZoneRetainFields(dateTimeZone7);
        org.joda.time.DateTime.Property property9 = dateTime8.millisOfSecond();
        org.joda.time.DateTime dateTime10 = property9.withMinimumValue();
        org.joda.time.DateTime.Property property11 = dateTime10.centuryOfEra();
        org.joda.time.DateTime.Property property12 = dateTime10.era();
        boolean boolean13 = dateTime10.isEqualNow();
        org.joda.time.Chronology chronology14 = dateTime10.getChronology();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((java.lang.Object) dateTime1, chronology14);
        boolean boolean17 = dateTime15.isBefore((long) 100);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        int int3 = dateTime2.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) '4', dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime14 = dateTime12.withWeekOfWeekyear(10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = dateTime14.toString(dateTimeFormatter15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (byte) -1, chronology18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) '4', dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = dateTime22.withZoneRetainFields(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) '4', dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = dateTime29.withZoneRetainFields(dateTimeZone32);
        org.joda.time.DateTime.Property property34 = dateTime33.millisOfSecond();
        org.joda.time.DateTime dateTime35 = property34.withMinimumValue();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime35.toMutableDateTime(chronology36);
        boolean boolean38 = dateTime26.isEqual((org.joda.time.ReadableInstant) dateTime35);
        boolean boolean39 = dateTime19.equals((java.lang.Object) dateTime26);
        org.joda.time.DateTime dateTime41 = dateTime26.minusMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) '4', dateTimeZone43);
        org.joda.time.DateTime dateTime46 = dateTime44.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = dateTime44.withZoneRetainFields(dateTimeZone47);
        org.joda.time.DateTime.Property property49 = dateTime48.millisOfSecond();
        org.joda.time.DateTime dateTime50 = property49.getDateTime();
        org.joda.time.DateTime dateTime51 = dateTime50.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology52 = dateTime51.getChronology();
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((java.lang.Object) dateTime26, chronology52);
        org.joda.time.MutableDateTime mutableDateTime54 = dateTime14.toMutableDateTime(chronology52);
        org.joda.time.DateTime dateTime55 = dateTime6.toDateTime(chronology52);
        org.joda.time.DateTime dateTime56 = dateTime2.withChronology(chronology52);
        org.joda.time.DateTime.Property property57 = dateTime2.centuryOfEra();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-03-05T01:40:00.052Z" + "'", str16, "1970-03-05T01:40:00.052Z");
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(mutableDateTime54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(property57);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.minus(readableDuration9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) -1, chronology12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) '4', dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = dateTime16.withZoneRetainFields(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) '4', dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = dateTime23.withZoneRetainFields(dateTimeZone26);
        org.joda.time.DateTime.Property property28 = dateTime27.millisOfSecond();
        org.joda.time.DateTime dateTime29 = property28.withMinimumValue();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime29.toMutableDateTime(chronology30);
        boolean boolean32 = dateTime20.isEqual((org.joda.time.ReadableInstant) dateTime29);
        boolean boolean33 = dateTime13.equals((java.lang.Object) dateTime20);
        org.joda.time.DateTime dateTime35 = dateTime20.minusMinutes(10);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.DateTime dateTime38 = dateTime20.withPeriodAdded(readablePeriod36, 1);
        org.joda.time.DateTime.Property property39 = dateTime38.secondOfMinute();
        int int40 = dateTime10.compareTo((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTime.Property property41 = dateTime10.millisOfDay();
        java.util.Date date42 = dateTime10.toDate();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Wed Sep 01 00:00:00 UTC 1965");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) '4', dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime6.withEarlierOffsetAtOverlap();
        long long8 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime dateTime9 = property3.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime11 = property3.setCopy(50);
        int int12 = dateTime11.getSecondOfMinute();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime5 = dateTime2.minusDays((int) (byte) 10);
        org.joda.time.DateTime dateTime7 = dateTime5.withSecondOfMinute(10);
        org.joda.time.DateTime dateTime8 = dateTime5.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMonths(1970);
        org.joda.time.DateTime dateTime13 = dateTime11.plus((long) 292278970);
        org.joda.time.DateTime dateTime14 = dateTime13.withLaterOffsetAtOverlap();
        int int15 = dateTime13.getEra();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        int int4 = property3.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) '4', dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.withZoneRetainFields(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime14.getZone();
        org.joda.time.DateTime dateTime16 = dateTime7.withZone(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '4', dateTimeZone18);
        org.joda.time.LocalDate localDate20 = dateTime19.toLocalDate();
        org.joda.time.DateTime dateTime21 = dateTime16.withFields((org.joda.time.ReadablePartial) localDate20);
        int int22 = property3.compareTo((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.DateTime dateTime23 = property3.withMaximumValue();
        org.joda.time.DateTime dateTime24 = property3.getDateTime();
        org.joda.time.DurationField durationField25 = property3.getRangeDurationField();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(durationField25);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) '4', dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime6.withEarlierOffsetAtOverlap();
        long long8 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime dateTime9 = property3.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekyear(3);
        org.joda.time.DateTime dateTime13 = dateTime9.plusMonths((int) (byte) -1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) '4', dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZoneRetainFields(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime3.minusMonths((int) '4');
        org.joda.time.DateTime.Property property10 = dateTime3.centuryOfEra();
        org.joda.time.DateTime dateTime11 = property10.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property10.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '4', dateTimeZone14);
        org.joda.time.DateTime.Property property16 = dateTime15.dayOfYear();
        int int17 = property10.compareTo((org.joda.time.ReadableInstant) dateTime15);
        java.lang.String str18 = property10.getAsShortText();
        org.joda.time.DateTime dateTime19 = property10.getDateTime();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) '4', dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = dateTime22.withZoneRetainFields(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime22.minusMonths((int) '4');
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime28.toMutableDateTimeISO();
        org.joda.time.DateTime.Property property30 = dateTime28.secondOfDay();
        org.joda.time.DateTime dateTime31 = property30.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTime35.getZone();
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(0L, dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime31.toMutableDateTime(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((java.lang.Object) dateTime19, dateTimeZone36);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) 600052, dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "19" + "'", str18, "19");
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(mutableDateTime38);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime2.centuryOfEra();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        java.lang.String str11 = property9.getName();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) -1, chronology14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) '4', dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.withZoneRetainFields(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) '4', dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = dateTime25.withZoneRetainFields(dateTimeZone28);
        org.joda.time.DateTime.Property property30 = dateTime29.millisOfSecond();
        org.joda.time.DateTime dateTime31 = property30.withMinimumValue();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime31.toMutableDateTime(chronology32);
        boolean boolean34 = dateTime22.isEqual((org.joda.time.ReadableInstant) dateTime31);
        boolean boolean35 = dateTime15.equals((java.lang.Object) dateTime22);
        org.joda.time.DateTime dateTime37 = dateTime22.minusMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) '4', dateTimeZone39);
        org.joda.time.DateTime dateTime42 = dateTime40.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = dateTime40.withZoneRetainFields(dateTimeZone43);
        org.joda.time.DateTime.Property property45 = dateTime44.millisOfSecond();
        org.joda.time.DateTime dateTime46 = property45.getDateTime();
        org.joda.time.DateTime dateTime47 = dateTime46.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology48 = dateTime47.getChronology();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((java.lang.Object) dateTime22, chronology48);
        org.joda.time.DateTimeZone dateTimeZone50 = dateTime49.getZone();
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) 10, dateTimeZone50);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) '4', dateTimeZone54);
        org.joda.time.DateTime dateTime57 = dateTime55.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime59 = dateTime57.withWeekOfWeekyear(10);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((long) '4', dateTimeZone61);
        org.joda.time.DateTime dateTime64 = dateTime62.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateTime dateTime66 = dateTime62.withZoneRetainFields(dateTimeZone65);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone68);
        org.joda.time.DateTimeZone dateTimeZone70 = dateTime69.getZone();
        org.joda.time.DateTime dateTime71 = dateTime62.withZone(dateTimeZone70);
        org.joda.time.MutableDateTime mutableDateTime72 = dateTime59.toMutableDateTime(dateTimeZone70);
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime((long) (short) 100, dateTimeZone70);
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime((long) '4', dateTimeZone75);
        org.joda.time.DateTime dateTime78 = dateTime76.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone79 = null;
        org.joda.time.DateTime dateTime80 = dateTime76.withZoneRetainFields(dateTimeZone79);
        org.joda.time.DateTime.Property property81 = dateTime80.millisOfSecond();
        org.joda.time.DateTime dateTime82 = property81.getDateTime();
        org.joda.time.DateTimeField dateTimeField83 = property81.getField();
        int int84 = dateTime73.get(dateTimeField83);
        int int85 = dateTime51.get(dateTimeField83);
        boolean boolean86 = dateTime51.isBeforeNow();
        boolean boolean87 = property9.equals((java.lang.Object) dateTime51);
        java.util.Locale locale88 = null;
        int int89 = property9.getMaximumTextLength(locale88);
        org.joda.time.DateTime dateTime90 = property9.withMaximumValue();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "centuryOfEra" + "'", str11, "centuryOfEra");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTimeZone70);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(mutableDateTime72);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertNotNull(property81);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(dateTimeField83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 100 + "'", int84 == 100);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 10 + "'", int85 == 10);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 7 + "'", int89 == 7);
        org.junit.Assert.assertNotNull(dateTime90);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTime5.getZone();
        int int7 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime9 = dateTime5.minusWeeks((int) (byte) 100);
        org.joda.time.LocalTime localTime10 = dateTime5.toLocalTime();
        org.joda.time.DurationFieldType durationFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime5.withFieldAdded(durationFieldType11, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime3 = dateTime2.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime5 = dateTime3.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) '4', dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfSecond();
        boolean boolean14 = dateTime3.isEqual((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.Chronology chronology15 = dateTime12.getChronology();
        boolean boolean16 = dateTime12.isBeforeNow();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        int int4 = dateTime2.getEra();
        boolean boolean5 = dateTime2.isEqualNow();
        org.joda.time.LocalDateTime localDateTime6 = dateTime2.toLocalDateTime();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) -1, chronology8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) '4', dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = dateTime12.withZoneRetainFields(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '4', dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = dateTime19.withZoneRetainFields(dateTimeZone22);
        org.joda.time.DateTime.Property property24 = dateTime23.millisOfSecond();
        org.joda.time.DateTime dateTime25 = property24.withMinimumValue();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime25.toMutableDateTime(chronology26);
        boolean boolean28 = dateTime16.isEqual((org.joda.time.ReadableInstant) dateTime25);
        boolean boolean29 = dateTime9.equals((java.lang.Object) dateTime16);
        org.joda.time.DateTime dateTime31 = dateTime16.minusMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = dateTime31.withZone(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone37 = dateTime36.getZone();
        org.joda.time.DateTime dateTime39 = dateTime36.minusDays((int) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar40 = dateTime36.toGregorianCalendar();
        org.joda.time.DateTime.Property property41 = dateTime36.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property41.getFieldType();
        boolean boolean43 = dateTime33.isSupported(dateTimeFieldType42);
        org.joda.time.DateTime.Property property44 = dateTime2.property(dateTimeFieldType42);
        org.joda.time.DateTime dateTime46 = property44.addToCopy(2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(gregorianCalendar40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(dateTime46);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekOfWeekyear(10);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.withZoneRetainFields(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTime16.getZone();
        org.joda.time.DateTime dateTime18 = dateTime9.withZone(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime6.toMutableDateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime21 = dateTime6.plusDays(292278993);
        long long22 = dateTime6.getMillis();
        org.joda.time.DateTime.Property property23 = dateTime6.weekyear();
        org.joda.time.DateTime dateTime25 = dateTime6.plusYears((int) '4');
        int int26 = dateTime6.getMinuteOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5449200052L + "'", long22 == 5449200052L);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime8 = property7.getDateTime();
        org.joda.time.DurationField durationField9 = property7.getLeapDurationField();
        org.joda.time.DateTime dateTime11 = property7.addToCopy((long) 9);
        org.joda.time.DateTime dateTime14 = dateTime11.withDurationAdded((long) 18, (int) (byte) 10);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        int int9 = dateTime8.getDayOfWeek();
        org.joda.time.DateTime.Property property10 = dateTime8.year();
        org.joda.time.LocalDateTime localDateTime11 = dateTime8.toLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) '4', dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = dateTime14.withZoneRetainFields(dateTimeZone17);
        org.joda.time.DateTime.Property property19 = dateTime18.millisOfSecond();
        org.joda.time.DateTime dateTime20 = property19.getDateTime();
        org.joda.time.DateTime dateTime21 = dateTime20.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology22 = dateTime21.getChronology();
        org.joda.time.DateTime dateTime23 = dateTime8.toDateTime(chronology22);
        org.joda.time.DateTime.Property property24 = dateTime23.year();
        org.joda.time.DateTime dateTime26 = property24.setCopy(4);
        org.joda.time.DateTime dateTime28 = property24.addWrapFieldToCopy(0);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.minus(readablePeriod29);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime9.getZone();
        org.joda.time.DateTime dateTime11 = dateTime2.withZone(dateTimeZone10);
        int int12 = dateTime2.getYear();
        org.joda.time.DateTime dateTime14 = dateTime2.plusWeeks(12);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) '4', dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime17.withZoneRetainFields(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime17.minusMonths((int) '4');
        org.joda.time.DateTime.Property property24 = dateTime17.centuryOfEra();
        org.joda.time.DateTime dateTime25 = property24.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property24.getFieldType();
        org.joda.time.DateTime dateTime28 = dateTime14.withField(dateTimeFieldType26, 10);
        org.joda.time.DateTime dateTime30 = dateTime14.withMillisOfSecond(0);
        org.joda.time.DateTime dateTime32 = dateTime14.plusSeconds((int) (short) 0);
        int int33 = dateTime32.getYearOfCentury();
        org.joda.time.DateTime dateTime35 = dateTime32.withWeekyear(2);
        int int36 = dateTime32.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) '4', dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone41);
        org.joda.time.DateTimeZone dateTimeZone43 = dateTime42.getZone();
        int int44 = dateTime39.compareTo((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime dateTime46 = dateTime42.minusWeeks((int) (byte) 100);
        org.joda.time.LocalTime localTime47 = dateTime42.toLocalTime();
        org.joda.time.DateTime dateTime48 = dateTime32.withFields((org.joda.time.ReadablePartial) localTime47);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 70 + "'", int33 == 70);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(dateTime48);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.withZoneRetainFields(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) '4', dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = dateTime16.withZoneRetainFields(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime16.minusMonths((int) '4');
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime22.toMutableDateTimeISO();
        org.joda.time.DateTime.Property property24 = dateTime22.secondOfDay();
        org.joda.time.DateTime dateTime25 = property24.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime29.getZone();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(0L, dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime25.toMutableDateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime35 = dateTime13.toDateTime(dateTimeZone30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(23, 335, 4, (-136769231), 292278970, 4, 65, dateTimeZone30);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -136769231 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(dateTime35);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime5 = dateTime2.minusDays((int) (byte) 10);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMillis(10);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime5.minus(readableDuration8);
        org.joda.time.DateTime dateTime11 = dateTime5.plusMinutes(52);
        org.joda.time.DateTime.Property property12 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime14 = dateTime5.withYear(8);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime3 = dateTime2.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime5 = dateTime3.withCenturyOfEra(3);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.withPeriodAdded(readablePeriod6, 4);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMonths(10);
        int int5 = dateTime2.getWeekyear();
        org.joda.time.DateTime.Property property6 = dateTime2.dayOfMonth();
        org.joda.time.DateTime dateTime8 = dateTime2.plusSeconds(4);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) '4', dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMinutes((int) (short) 100);
        int int8 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime10 = dateTime5.withSecondOfMinute((int) (short) 0);
        org.joda.time.DateTime dateTime12 = dateTime5.withWeekyear(86399);
        org.joda.time.DateTime dateTime14 = dateTime5.withMonthOfYear(10);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        int int9 = dateTime8.getDayOfWeek();
        org.joda.time.DateTime.Property property10 = dateTime8.year();
        org.joda.time.DateTime dateTime12 = dateTime8.withWeekyear((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '4', dateTimeZone14);
        org.joda.time.DateTime dateTime16 = dateTime15.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime18 = dateTime16.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) '4', dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = dateTime21.withZoneRetainFields(dateTimeZone24);
        org.joda.time.DateTime.Property property26 = dateTime25.millisOfSecond();
        boolean boolean27 = dateTime16.isEqual((org.joda.time.ReadableInstant) dateTime25);
        boolean boolean28 = dateTime8.isBefore((org.joda.time.ReadableInstant) dateTime16);
        int int29 = dateTime16.getEra();
        org.joda.time.DateTime.Property property30 = dateTime16.minuteOfHour();
        org.joda.time.DateTime dateTime32 = dateTime16.withCenturyOfEra(2022);
        org.joda.time.YearMonthDay yearMonthDay33 = dateTime16.toYearMonthDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(yearMonthDay33);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime5 = dateTime2.minusDays((int) (byte) 10);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMillis(10);
        org.joda.time.DateTime.Property property8 = dateTime5.secondOfMinute();
        org.joda.time.DateTime.Property property9 = dateTime5.year();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) '4', dateTimeZone11);
        org.joda.time.DateTime dateTime13 = dateTime12.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime15 = dateTime13.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) '4', dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.withZoneRetainFields(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime18.minusMonths((int) '4');
        org.joda.time.DateTime.Property property25 = dateTime18.centuryOfEra();
        org.joda.time.DateTime dateTime26 = property25.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property25.getFieldType();
        int int28 = dateTime13.get(dateTimeFieldType27);
        org.joda.time.DateTime.Property property29 = dateTime13.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) '4', dateTimeZone31);
        org.joda.time.DateTime.Property property33 = dateTime32.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) '4', dateTimeZone35);
        org.joda.time.DateTime dateTime37 = dateTime36.withEarlierOffsetAtOverlap();
        long long38 = property33.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTime dateTime40 = dateTime36.withMinuteOfHour((int) (short) 10);
        org.joda.time.DateTime dateTime42 = dateTime36.withWeekyear(999);
        int int43 = property29.getDifference((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.DateTime dateTime46 = dateTime36.withPeriodAdded(readablePeriod44, 8);
        int int47 = property9.compareTo((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTimeField dateTimeField48 = property9.getField();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 19 + "'", int28 == 19);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(dateTimeField48);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.minus(readableDuration9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) -1, chronology12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) '4', dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = dateTime16.withZoneRetainFields(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) '4', dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = dateTime23.withZoneRetainFields(dateTimeZone26);
        org.joda.time.DateTime.Property property28 = dateTime27.millisOfSecond();
        org.joda.time.DateTime dateTime29 = property28.withMinimumValue();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime29.toMutableDateTime(chronology30);
        boolean boolean32 = dateTime20.isEqual((org.joda.time.ReadableInstant) dateTime29);
        boolean boolean33 = dateTime13.equals((java.lang.Object) dateTime20);
        org.joda.time.DateTime dateTime35 = dateTime20.minusMinutes(10);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.DateTime dateTime38 = dateTime20.withPeriodAdded(readablePeriod36, 1);
        org.joda.time.DateTime.Property property39 = dateTime38.secondOfMinute();
        int int40 = dateTime10.compareTo((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTime.Property property41 = dateTime38.minuteOfDay();
        int int42 = property41.getMinimumValue();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 85);
        org.joda.time.DateTime dateTime3 = dateTime1.withCenturyOfEra(8);
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime8 = property7.withMinimumValue();
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) '4', dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = dateTime13.withZoneRetainFields(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime13.minusMonths((int) '4');
        org.joda.time.DateTime.Property property20 = dateTime13.dayOfYear();
        int int21 = dateTime13.getYear();
        org.joda.time.DateTime dateTime23 = dateTime13.withWeekOfWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) '4', dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = dateTime26.withZoneRetainFields(dateTimeZone29);
        org.joda.time.DateTime.Property property31 = dateTime30.millisOfSecond();
        org.joda.time.DateTime dateTime32 = property31.withMinimumValue();
        org.joda.time.DateTime.Property property33 = dateTime32.centuryOfEra();
        org.joda.time.DateTime.Property property34 = dateTime32.era();
        boolean boolean35 = dateTime32.isEqualNow();
        org.joda.time.Chronology chronology36 = dateTime32.getChronology();
        org.joda.time.DateTime dateTime37 = dateTime13.toDateTime(chronology36);
        org.joda.time.DateTime dateTime38 = dateTime8.withChronology(chronology36);
        int int39 = dateTime38.getMillisOfSecond();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1970 + "'", int21 == 1970);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.plus(readablePeriod9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime(chronology11);
        int int13 = dateTime12.getMillisOfSecond();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTimeISO();
        org.joda.time.DateTime.Property property10 = dateTime8.secondOfDay();
        org.joda.time.DateTime dateTime12 = dateTime8.minusYears(1);
        org.joda.time.DateTime dateTime14 = dateTime8.plusMinutes((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime8.withDate(2022, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime8.secondOfMinute();
        org.joda.time.DateTime dateTime11 = dateTime8.withMillis((long) 1970);
        int int12 = dateTime11.getWeekyear();
        org.joda.time.DateTime dateTime14 = dateTime11.minusMonths(4);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime8 = property7.withMinimumValue();
        org.joda.time.DateTime dateTime9 = property7.getDateTime();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) '4', dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = dateTime12.withZoneRetainFields(dateTimeZone15);
        org.joda.time.DateTime.Property property17 = dateTime16.millisOfSecond();
        org.joda.time.DateTime dateTime18 = dateTime16.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (-1));
        boolean boolean21 = dateTime16.isAfter((org.joda.time.ReadableInstant) dateTime20);
        int int22 = dateTime20.getHourOfDay();
        org.joda.time.LocalTime localTime23 = dateTime20.toLocalTime();
        int int24 = property7.compareTo((org.joda.time.ReadableInstant) dateTime20);
        int int25 = dateTime20.getDayOfMonth();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 23 + "'", int22 == 23);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 31 + "'", int25 == 31);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime5 = dateTime2.minusDays((int) (byte) 10);
        org.joda.time.DateTime dateTime7 = dateTime5.withSecondOfMinute(10);
        org.joda.time.DateTime dateTime8 = dateTime5.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property9 = dateTime8.yearOfEra();
        org.joda.time.DateTime dateTime11 = property9.addWrapFieldToCopy(1965);
        int int12 = property9.get();
        int int13 = property9.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1969 + "'", int12 == 1969);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTimeISO();
        org.joda.time.DateTime.Property property10 = dateTime8.secondOfDay();
        org.joda.time.DateTime dateTime11 = property10.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime12 = property10.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime14 = property10.addToCopy((int) '4');
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime14.getZone();
        org.joda.time.DateTime dateTime16 = dateTime14.withLaterOffsetAtOverlap();
        int int17 = dateTime14.getEra();
        int int18 = dateTime14.getCenturyOfEra();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19 + "'", int18 == 19);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime8 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (-1));
        boolean boolean11 = dateTime6.isAfter((org.joda.time.ReadableInstant) dateTime10);
        int int12 = dateTime10.getHourOfDay();
        org.joda.time.DateTime.Property property13 = dateTime10.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = property13.getFieldType();
        boolean boolean15 = property13.isLeap();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 23 + "'", int12 == 23);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) '4', dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime10 = dateTime8.withWeekOfWeekyear(10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = dateTime10.toString(dateTimeFormatter11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) -1, chronology14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) '4', dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.withZoneRetainFields(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) '4', dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = dateTime25.withZoneRetainFields(dateTimeZone28);
        org.joda.time.DateTime.Property property30 = dateTime29.millisOfSecond();
        org.joda.time.DateTime dateTime31 = property30.withMinimumValue();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime31.toMutableDateTime(chronology32);
        boolean boolean34 = dateTime22.isEqual((org.joda.time.ReadableInstant) dateTime31);
        boolean boolean35 = dateTime15.equals((java.lang.Object) dateTime22);
        org.joda.time.DateTime dateTime37 = dateTime22.minusMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) '4', dateTimeZone39);
        org.joda.time.DateTime dateTime42 = dateTime40.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = dateTime40.withZoneRetainFields(dateTimeZone43);
        org.joda.time.DateTime.Property property45 = dateTime44.millisOfSecond();
        org.joda.time.DateTime dateTime46 = property45.getDateTime();
        org.joda.time.DateTime dateTime47 = dateTime46.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology48 = dateTime47.getChronology();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((java.lang.Object) dateTime22, chronology48);
        org.joda.time.MutableDateTime mutableDateTime50 = dateTime10.toMutableDateTime(chronology48);
        org.joda.time.DateTime dateTime51 = dateTime2.toDateTime(chronology48);
        org.joda.time.DateTime dateTime56 = dateTime51.withTime((int) (short) 1, 12, (int) (short) 10, (int) 'a');
        org.joda.time.DateTime.Property property57 = dateTime51.dayOfWeek();
        java.lang.String str58 = property57.getAsString();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-03-05T01:40:00.052Z" + "'", str12, "1970-03-05T01:40:00.052Z");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "4" + "'", str58, "4");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime5 = dateTime2.minusDays((int) (byte) 10);
        org.joda.time.DateTime dateTime7 = dateTime5.withSecondOfMinute(10);
        java.util.Locale locale8 = null;
        java.util.Calendar calendar9 = dateTime7.toCalendar(locale8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) '4', dateTimeZone11);
        org.joda.time.DateTime dateTime13 = dateTime12.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime15 = dateTime13.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) '4', dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.withZoneRetainFields(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime18.minusMonths((int) '4');
        org.joda.time.DateTime.Property property25 = dateTime18.centuryOfEra();
        org.joda.time.DateTime dateTime26 = property25.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property25.getFieldType();
        int int28 = dateTime13.get(dateTimeFieldType27);
        org.joda.time.DateTime.Property property29 = dateTime7.property(dateTimeFieldType27);
        org.joda.time.DateTime dateTime30 = property29.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime32 = dateTime30.withYearOfEra(19);
        int int33 = dateTime32.getWeekyear();
        org.joda.time.DateTime.Property property34 = dateTime32.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) '4', dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime42 = dateTime40.withWeekOfWeekyear(10);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) '4', dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime45.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateTime dateTime49 = dateTime45.withZoneRetainFields(dateTimeZone48);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone51);
        org.joda.time.DateTimeZone dateTimeZone53 = dateTime52.getZone();
        org.joda.time.DateTime dateTime54 = dateTime45.withZone(dateTimeZone53);
        org.joda.time.MutableDateTime mutableDateTime55 = dateTime42.toMutableDateTime(dateTimeZone53);
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) (short) 100, dateTimeZone53);
        org.joda.time.DateTime dateTime58 = dateTime56.minusMonths(1);
        org.joda.time.DateTime.Property property59 = dateTime58.centuryOfEra();
        org.joda.time.DateTime dateTime61 = dateTime58.minusYears(1972);
        org.joda.time.MutableDateTime mutableDateTime62 = dateTime61.toMutableDateTime();
        org.joda.time.DateTime.Property property63 = dateTime61.dayOfYear();
        boolean boolean64 = property34.equals((java.lang.Object) property63);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(calendar9);
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=-863990000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=52,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=356,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=10,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 19 + "'", int28 == 19);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 19 + "'", int33 == 19);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(mutableDateTime55);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(mutableDateTime62);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekOfWeekyear(10);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.withZoneRetainFields(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTime16.getZone();
        org.joda.time.DateTime dateTime18 = dateTime9.withZone(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime6.toMutableDateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime21 = dateTime6.plusDays(292278993);
        long long22 = dateTime6.getMillis();
        org.joda.time.DateTime.Property property23 = dateTime6.weekyear();
        int int24 = dateTime6.getMillisOfDay();
        org.joda.time.DateTime.Property property25 = dateTime6.weekyear();
        org.joda.time.DateTime dateTime27 = dateTime6.plusMillis(53);
        org.joda.time.DateTime dateTime29 = dateTime6.withYear((int) (byte) 10);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5449200052L + "'", long22 == 5449200052L);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6000052 + "'", int24 == 6000052);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) '4', dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime6.withEarlierOffsetAtOverlap();
        long long8 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime dateTime10 = dateTime6.withMinuteOfHour((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone12);
        boolean boolean14 = dateTime10.equals((java.lang.Object) dateTimeZone12);
        org.joda.time.DateTime dateTime16 = dateTime10.withMillis(20995200052L);
        org.joda.time.DateTime dateTime18 = dateTime16.withYearOfEra(5);
        org.joda.time.DateTime dateTime20 = dateTime16.plusMinutes(0);
        org.joda.time.DateTime.Property property21 = dateTime20.secondOfMinute();
        org.joda.time.DateTime dateTime23 = dateTime20.plusSeconds(86399999);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.minus(readableDuration9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) -1, chronology12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) '4', dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = dateTime16.withZoneRetainFields(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) '4', dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = dateTime23.withZoneRetainFields(dateTimeZone26);
        org.joda.time.DateTime.Property property28 = dateTime27.millisOfSecond();
        org.joda.time.DateTime dateTime29 = property28.withMinimumValue();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime29.toMutableDateTime(chronology30);
        boolean boolean32 = dateTime20.isEqual((org.joda.time.ReadableInstant) dateTime29);
        boolean boolean33 = dateTime13.equals((java.lang.Object) dateTime20);
        org.joda.time.DateTime dateTime35 = dateTime20.minusMinutes(10);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.DateTime dateTime38 = dateTime20.withPeriodAdded(readablePeriod36, 1);
        org.joda.time.DateTime.Property property39 = dateTime38.secondOfMinute();
        int int40 = dateTime10.compareTo((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTime.Property property41 = dateTime38.minuteOfDay();
        org.joda.time.DateTime dateTime42 = dateTime38.withTimeAtStartOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTime42);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfEra();
        org.joda.time.DateTime dateTime8 = dateTime6.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime6.minusDays((int) (byte) 1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime8.secondOfMinute();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) dateTime8);
        org.joda.time.DateTime.Property property11 = dateTime8.era();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime2.centuryOfEra();
        int int10 = property9.getMinimumValue();
        java.lang.String str11 = property9.toString();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Property[centuryOfEra]" + "'", str11, "Property[centuryOfEra]");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        int int9 = dateTime8.getDayOfWeek();
        org.joda.time.DateTime.Property property10 = dateTime8.year();
        org.joda.time.DateTime dateTime12 = dateTime8.withWeekyear((int) (short) 100);
        java.util.Locale locale13 = null;
        java.util.Calendar calendar14 = dateTime12.toCalendar(locale13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) '4', dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime17.withZoneRetainFields(dateTimeZone20);
        org.joda.time.DateTime.Property property22 = dateTime21.millisOfSecond();
        org.joda.time.DateTime dateTime23 = property22.withMinimumValue();
        org.joda.time.DateTime.Property property24 = dateTime23.centuryOfEra();
        org.joda.time.DateTime.Property property25 = dateTime23.era();
        boolean boolean26 = dateTime23.isEqualNow();
        org.joda.time.Chronology chronology27 = dateTime23.getChronology();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((java.lang.Object) calendar14, chronology27);
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(chronology27);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) '4', dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime37 = dateTime35.withWeekOfWeekyear(10);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) '4', dateTimeZone39);
        org.joda.time.DateTime dateTime42 = dateTime40.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = dateTime40.withZoneRetainFields(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone46);
        org.joda.time.DateTimeZone dateTimeZone48 = dateTime47.getZone();
        org.joda.time.DateTime dateTime49 = dateTime40.withZone(dateTimeZone48);
        org.joda.time.MutableDateTime mutableDateTime50 = dateTime37.toMutableDateTime(dateTimeZone48);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) (short) 100, dateTimeZone48);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) '4', dateTimeZone53);
        org.joda.time.DateTime dateTime56 = dateTime54.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = dateTime54.withZoneRetainFields(dateTimeZone57);
        org.joda.time.DateTime.Property property59 = dateTime58.millisOfSecond();
        org.joda.time.DateTime dateTime60 = property59.getDateTime();
        org.joda.time.DateTimeField dateTimeField61 = property59.getField();
        int int62 = dateTime51.get(dateTimeField61);
        org.joda.time.DateTime dateTime64 = dateTime51.plusHours(292278993);
        int int65 = dateTime64.getDayOfYear();
        org.joda.time.LocalTime localTime66 = dateTime64.toLocalTime();
        org.joda.time.DateTime dateTime67 = dateTime29.withTime(localTime66);
        int int68 = dateTime67.getDayOfMonth();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(calendar14);
        org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=-58990463999948,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=8,WEEK_OF_YEAR=36,WEEK_OF_MONTH=1,DAY_OF_MONTH=2,DAY_OF_YEAR=246,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=52,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 11 + "'", int65 == 11);
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 11 + "'", int68 == 11);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(2, 6000052, 65, (int) '4', 52, dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) '4', dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) '4', dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusMinutes((int) (short) 100);
        int int9 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime dateTime11 = dateTime6.withSecondOfMinute((int) (short) 0);
        org.joda.time.DateTime dateTime12 = dateTime6.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '4', dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) '4', dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.plusMinutes((int) (short) 100);
        int int21 = dateTime15.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime23 = dateTime18.plusMonths((int) (short) 100);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (byte) -1, chronology26);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) '4', dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = dateTime30.withZoneRetainFields(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) '4', dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = dateTime37.withZoneRetainFields(dateTimeZone40);
        org.joda.time.DateTime.Property property42 = dateTime41.millisOfSecond();
        org.joda.time.DateTime dateTime43 = property42.withMinimumValue();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = dateTime43.toMutableDateTime(chronology44);
        boolean boolean46 = dateTime34.isEqual((org.joda.time.ReadableInstant) dateTime43);
        boolean boolean47 = dateTime27.equals((java.lang.Object) dateTime34);
        org.joda.time.DateTime dateTime49 = dateTime34.minusMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) '4', dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime52.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateTime dateTime56 = dateTime52.withZoneRetainFields(dateTimeZone55);
        org.joda.time.DateTime.Property property57 = dateTime56.millisOfSecond();
        org.joda.time.DateTime dateTime58 = property57.getDateTime();
        org.joda.time.DateTime dateTime59 = dateTime58.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology60 = dateTime59.getChronology();
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((java.lang.Object) dateTime34, chronology60);
        org.joda.time.DateTimeZone dateTimeZone62 = dateTime61.getZone();
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) 10, dateTimeZone62);
        org.joda.time.DateTime dateTime64 = dateTime23.withZoneRetainFields(dateTimeZone62);
        org.joda.time.MutableDateTime mutableDateTime65 = dateTime12.toMutableDateTime(dateTimeZone62);
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) 69, dateTimeZone62);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(dateTimeZone62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(mutableDateTime65);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime2.centuryOfEra();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = property9.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) '4', dateTimeZone13);
        org.joda.time.DateTime.Property property15 = dateTime14.dayOfYear();
        int int16 = property9.compareTo((org.joda.time.ReadableInstant) dateTime14);
        int int17 = dateTime14.getDayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.minus(readablePeriod18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) '4', dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) '4', dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.plusMinutes((int) (short) 100);
        int int28 = dateTime22.compareTo((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime30 = dateTime25.withSecondOfMinute((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = dateTime30.toString(dateTimeFormatter31);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) '4', dateTimeZone34);
        org.joda.time.DateTime.Property property36 = dateTime35.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) '4', dateTimeZone38);
        org.joda.time.DateTime dateTime40 = dateTime39.withEarlierOffsetAtOverlap();
        long long41 = property36.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTime dateTime42 = property36.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) '4', dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime45.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime49 = dateTime47.withWeekOfWeekyear(10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = null;
        java.lang.String str51 = dateTime49.toString(dateTimeFormatter50);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) '4', dateTimeZone53);
        org.joda.time.DateTime dateTime56 = dateTime54.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = dateTime54.withZoneRetainFields(dateTimeZone57);
        org.joda.time.DateTime dateTime60 = dateTime54.minusMonths((int) '4');
        org.joda.time.DateTime.Property property61 = dateTime54.centuryOfEra();
        org.joda.time.DateTime dateTime62 = property61.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = property61.getFieldType();
        int int64 = dateTime49.get(dateTimeFieldType63);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime((long) '4', dateTimeZone66);
        org.joda.time.DateTime dateTime69 = dateTime67.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.DateTime dateTime71 = dateTime67.withZoneRetainFields(dateTimeZone70);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone73);
        org.joda.time.DateTimeZone dateTimeZone75 = dateTime74.getZone();
        org.joda.time.DateTime dateTime76 = dateTime67.withZone(dateTimeZone75);
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime((long) '4', dateTimeZone78);
        org.joda.time.LocalDate localDate80 = dateTime79.toLocalDate();
        org.joda.time.DateTime dateTime81 = dateTime76.withFields((org.joda.time.ReadablePartial) localDate80);
        org.joda.time.DateTime dateTime82 = dateTime49.withFields((org.joda.time.ReadablePartial) localDate80);
        org.joda.time.DateTime dateTime83 = dateTime42.withFields((org.joda.time.ReadablePartial) localDate80);
        org.joda.time.DateTime dateTime84 = dateTime30.withFields((org.joda.time.ReadablePartial) localDate80);
        org.joda.time.DateTime dateTime85 = dateTime14.withDate(localDate80);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970-01-01T00:00:00.052Z" + "'", str32, "1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1970-03-05T01:40:00.052Z" + "'", str51, "1970-03-05T01:40:00.052Z");
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTimeFieldType63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 19 + "'", int64 == 19);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(dateTimeZone75);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(localDate80);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(dateTime85);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime2.centuryOfEra();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = property9.getFieldType();
        org.joda.time.DateTime dateTime13 = property9.setCopy((int) ' ');
        org.joda.time.DateTime dateTime14 = property9.withMinimumValue();
        int int15 = property9.getMaximumValue();
        org.joda.time.DateTime dateTime16 = property9.withMinimumValue();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2922789 + "'", int15 == 2922789);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime8 = property7.withMinimumValue();
        org.joda.time.DateTime dateTime10 = dateTime8.withHourOfDay((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) '4', dateTimeZone12);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) '4', dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime21 = dateTime19.withWeekOfWeekyear(10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = dateTime21.toString(dateTimeFormatter22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) -1, chronology25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) '4', dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = dateTime29.withZoneRetainFields(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) '4', dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime36.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = dateTime36.withZoneRetainFields(dateTimeZone39);
        org.joda.time.DateTime.Property property41 = dateTime40.millisOfSecond();
        org.joda.time.DateTime dateTime42 = property41.withMinimumValue();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime42.toMutableDateTime(chronology43);
        boolean boolean45 = dateTime33.isEqual((org.joda.time.ReadableInstant) dateTime42);
        boolean boolean46 = dateTime26.equals((java.lang.Object) dateTime33);
        org.joda.time.DateTime dateTime48 = dateTime33.minusMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) '4', dateTimeZone50);
        org.joda.time.DateTime dateTime53 = dateTime51.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = dateTime51.withZoneRetainFields(dateTimeZone54);
        org.joda.time.DateTime.Property property56 = dateTime55.millisOfSecond();
        org.joda.time.DateTime dateTime57 = property56.getDateTime();
        org.joda.time.DateTime dateTime58 = dateTime57.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology59 = dateTime58.getChronology();
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((java.lang.Object) dateTime33, chronology59);
        org.joda.time.MutableDateTime mutableDateTime61 = dateTime21.toMutableDateTime(chronology59);
        org.joda.time.DateTime dateTime62 = dateTime13.toDateTime(chronology59);
        org.joda.time.MutableDateTime mutableDateTime63 = dateTime8.toMutableDateTime(chronology59);
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) '4', dateTimeZone65);
        org.joda.time.DateTime dateTime67 = dateTime66.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime69 = dateTime67.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime((long) '4', dateTimeZone71);
        org.joda.time.DateTime dateTime74 = dateTime72.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.DateTime dateTime76 = dateTime72.withZoneRetainFields(dateTimeZone75);
        org.joda.time.DateTime dateTime78 = dateTime72.minusMonths((int) '4');
        org.joda.time.DateTime.Property property79 = dateTime72.centuryOfEra();
        org.joda.time.DateTime dateTime80 = property79.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType81 = property79.getFieldType();
        int int82 = dateTime67.get(dateTimeFieldType81);
        org.joda.time.DateTime.Property property83 = dateTime8.property(dateTimeFieldType81);
        org.joda.time.DateTime.Property property84 = dateTime8.yearOfEra();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-03-05T01:40:00.052Z" + "'", str23, "1970-03-05T01:40:00.052Z");
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(mutableDateTime61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(mutableDateTime63);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertNotNull(dateTimeFieldType81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 19 + "'", int82 == 19);
        org.junit.Assert.assertNotNull(property83);
        org.junit.Assert.assertNotNull(property84);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime5 = dateTime2.minusDays((int) (byte) 10);
        org.joda.time.DateTime.Property property6 = dateTime5.weekyear();
        int int7 = dateTime5.getDayOfWeek();
        org.joda.time.DateTime dateTime9 = dateTime5.withDayOfYear((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime12 = dateTime5.withPeriodAdded(readablePeriod10, 244);
        org.joda.time.DateTime.Property property13 = dateTime12.centuryOfEra();
        org.joda.time.DateTime dateTime14 = property13.roundHalfFloorCopy();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.plus(readableDuration15);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime2.centuryOfEra();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        int int11 = dateTime10.getDayOfWeek();
        org.joda.time.DateTime dateTime13 = dateTime10.withDayOfWeek(1);
        org.joda.time.DateTime dateTime15 = dateTime10.minusYears(0);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) '4', dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.withZoneRetainFields(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime18.minusMonths((int) '4');
        org.joda.time.DateTime.Property property25 = dateTime18.centuryOfEra();
        org.joda.time.DateTime dateTime26 = property25.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property25.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) '4', dateTimeZone29);
        org.joda.time.DateTime.Property property31 = dateTime30.dayOfYear();
        int int32 = property25.compareTo((org.joda.time.ReadableInstant) dateTime30);
        java.lang.String str33 = property25.getAsShortText();
        org.joda.time.DateTime dateTime34 = property25.getDateTime();
        org.joda.time.DateTime.Property property35 = dateTime34.millisOfDay();
        org.joda.time.DateTime.Property property36 = dateTime34.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property36.getFieldType();
        boolean boolean38 = dateTime15.isSupported(dateTimeFieldType37);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "19" + "'", str33, "19");
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekOfWeekyear(10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = dateTime6.toString(dateTimeFormatter7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) '4', dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = dateTime11.withZoneRetainFields(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime11.minusMonths((int) '4');
        org.joda.time.DateTime.Property property18 = dateTime11.centuryOfEra();
        org.joda.time.DateTime dateTime19 = property18.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property18.getFieldType();
        int int21 = dateTime6.get(dateTimeFieldType20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) '4', dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = dateTime24.withZoneRetainFields(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone32 = dateTime31.getZone();
        org.joda.time.DateTime dateTime33 = dateTime24.withZone(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) '4', dateTimeZone35);
        org.joda.time.LocalDate localDate37 = dateTime36.toLocalDate();
        org.joda.time.DateTime dateTime38 = dateTime33.withFields((org.joda.time.ReadablePartial) localDate37);
        org.joda.time.DateTime dateTime39 = dateTime6.withFields((org.joda.time.ReadablePartial) localDate37);
        org.joda.time.DateTime.Property property40 = dateTime39.monthOfYear();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-03-05T01:40:00.052Z" + "'", str8, "1970-03-05T01:40:00.052Z");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19 + "'", int21 == 19);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(property40);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.minusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime10 = dateTime6.minus(52L);
        org.joda.time.DateTime dateTime12 = dateTime10.withDayOfYear((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '4', dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime18.getZone();
        int int20 = dateTime15.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime22 = dateTime18.minusWeeks((int) (byte) 100);
        org.joda.time.LocalTime localTime23 = dateTime18.toLocalTime();
        org.joda.time.DateTime dateTime24 = dateTime12.withFields((org.joda.time.ReadablePartial) localTime23);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(dateTime24);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.plus(readablePeriod9);
        org.joda.time.YearMonthDay yearMonthDay11 = dateTime8.toYearMonthDay();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime13 = dateTime8.minus(readablePeriod12);
        int int14 = dateTime8.getMillisOfSecond();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime3 = dateTime2.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes((int) (short) -1);
        int int6 = dateTime3.getDayOfYear();
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime3.minus(readablePeriod9);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime2.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime11 = dateTime2.minus(readablePeriod10);
        org.joda.time.DateTime.Property property12 = dateTime2.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime2.minus(readablePeriod13);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) '4', dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime8.minusMonths((int) '4');
        int int15 = dateTime14.getDayOfWeek();
        org.joda.time.DateTime.Property property16 = dateTime14.year();
        org.joda.time.DateTime dateTime18 = dateTime14.withWeekyear((int) (short) 100);
        java.util.Locale locale19 = null;
        java.util.Calendar calendar20 = dateTime18.toCalendar(locale19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) '4', dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = dateTime23.withZoneRetainFields(dateTimeZone26);
        org.joda.time.DateTime.Property property28 = dateTime27.millisOfSecond();
        org.joda.time.DateTime dateTime29 = property28.withMinimumValue();
        org.joda.time.DateTime.Property property30 = dateTime29.centuryOfEra();
        org.joda.time.DateTime.Property property31 = dateTime29.era();
        boolean boolean32 = dateTime29.isEqualNow();
        org.joda.time.Chronology chronology33 = dateTime29.getChronology();
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((java.lang.Object) calendar20, chronology33);
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(chronology33);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(chronology33);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(1972, 18, (int) (short) 100, (int) (byte) 10, 85800020, 53, chronology33);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 85800020 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(calendar20);
        org.junit.Assert.assertEquals(calendar20.toString(), "java.util.GregorianCalendar[time=-58990463999948,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=8,WEEK_OF_YEAR=36,WEEK_OF_MONTH=1,DAY_OF_MONTH=2,DAY_OF_YEAR=246,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=52,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTime35);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) '4', dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = dateTime4.withZoneRetainFields(dateTimeZone7);
        org.joda.time.DateTime.Property property9 = dateTime8.millisOfSecond();
        org.joda.time.DateTime dateTime10 = property9.withMinimumValue();
        org.joda.time.DateTime.Property property11 = dateTime10.centuryOfEra();
        org.joda.time.DateTime.Property property12 = dateTime10.era();
        boolean boolean13 = dateTime10.isEqualNow();
        org.joda.time.Chronology chronology14 = dateTime10.getChronology();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((java.lang.Object) dateTime1, chronology14);
        org.joda.time.LocalDate localDate16 = dateTime1.toLocalDate();
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        int int9 = dateTime8.getDayOfWeek();
        org.joda.time.DateTime.Property property10 = dateTime8.year();
        org.joda.time.DateTime dateTime12 = dateTime8.withWeekyear((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '4', dateTimeZone14);
        org.joda.time.DateTime dateTime16 = dateTime15.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime18 = dateTime16.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) '4', dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = dateTime21.withZoneRetainFields(dateTimeZone24);
        org.joda.time.DateTime.Property property26 = dateTime25.millisOfSecond();
        boolean boolean27 = dateTime16.isEqual((org.joda.time.ReadableInstant) dateTime25);
        boolean boolean28 = dateTime8.isBefore((org.joda.time.ReadableInstant) dateTime16);
        int int29 = dateTime16.getEra();
        org.joda.time.DateTime.Property property30 = dateTime16.minuteOfHour();
        org.joda.time.DateTime dateTime31 = property30.roundFloorCopy();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime31);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        int int9 = dateTime8.getDayOfWeek();
        org.joda.time.DateTime.Property property10 = dateTime8.year();
        org.joda.time.DateTime dateTime12 = dateTime8.withWeekyear((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '4', dateTimeZone14);
        org.joda.time.DateTime dateTime16 = dateTime15.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime18 = dateTime16.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) '4', dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = dateTime21.withZoneRetainFields(dateTimeZone24);
        org.joda.time.DateTime.Property property26 = dateTime25.millisOfSecond();
        boolean boolean27 = dateTime16.isEqual((org.joda.time.ReadableInstant) dateTime25);
        boolean boolean28 = dateTime8.isBefore((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime30 = dateTime16.withMonthOfYear(10);
        boolean boolean31 = dateTime30.isAfterNow();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 100);
        java.util.GregorianCalendar gregorianCalendar2 = dateTime1.toGregorianCalendar();
        org.junit.Assert.assertNotNull(gregorianCalendar2);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) '4', dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear(10);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = dateTime10.withZoneRetainFields(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTime17.getZone();
        org.joda.time.DateTime dateTime19 = dateTime10.withZone(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime7.toMutableDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (short) 100, dateTimeZone18);
        org.joda.time.DateTime dateTime23 = dateTime21.plusMillis((int) (byte) 1);
        org.joda.time.DateTime.Property property24 = dateTime23.minuteOfHour();
        org.joda.time.DateTime dateTime27 = dateTime23.withDurationAdded((long) 70, (int) '4');
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) '4', dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.withWeekOfWeekyear(10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '4', dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = dateTime15.withZoneRetainFields(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTime22.getZone();
        org.joda.time.DateTime dateTime24 = dateTime15.withZone(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime12.toMutableDateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (short) 100, dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) '4', dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) '4', dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime32.plusMinutes((int) (short) 100);
        int int35 = dateTime29.compareTo((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTime dateTime37 = dateTime32.withSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) '4', dateTimeZone39);
        org.joda.time.DateTime dateTime42 = dateTime40.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = dateTime40.withZoneRetainFields(dateTimeZone43);
        long long45 = dateTime44.getMillis();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) '4', dateTimeZone48);
        org.joda.time.DateTime dateTime51 = dateTime49.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = dateTime49.withZoneRetainFields(dateTimeZone52);
        org.joda.time.DateTime.Property property54 = dateTime53.millisOfSecond();
        org.joda.time.DateTime dateTime55 = property54.getDateTime();
        org.joda.time.DateTime dateTime56 = dateTime55.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology57 = dateTime56.getChronology();
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) (byte) 0, chronology57);
        org.joda.time.DateTime dateTime59 = org.joda.time.DateTime.now(chronology57);
        org.joda.time.MutableDateTime mutableDateTime60 = dateTime44.toMutableDateTime(chronology57);
        org.joda.time.DateTime dateTime61 = dateTime37.toDateTime(chronology57);
        boolean boolean62 = dateTime26.isEqual((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime.Property property63 = dateTime26.weekyear();
        java.lang.String str64 = property63.getAsString();
        org.joda.time.DateTime dateTime66 = property63.addWrapFieldToCopy(31);
        org.joda.time.DateTime dateTime68 = dateTime66.minusMillis(999);
        java.util.Locale locale69 = null;
        java.util.Calendar calendar70 = dateTime66.toCalendar(locale69);
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime((long) '4', dateTimeZone72);
        org.joda.time.DateTime dateTime75 = dateTime73.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.DateTime dateTime77 = dateTime73.withZoneRetainFields(dateTimeZone76);
        org.joda.time.DateTime.Property property78 = dateTime77.millisOfSecond();
        org.joda.time.DateTime dateTime79 = property78.getDateTime();
        org.joda.time.DateTime dateTime80 = dateTime79.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology81 = dateTime80.getChronology();
        org.joda.time.DateTime dateTime82 = org.joda.time.DateTime.now(chronology81);
        org.joda.time.DateTimeZone dateTimeZone83 = dateTime82.getZone();
        org.joda.time.DateTime dateTime84 = org.joda.time.DateTime.now(dateTimeZone83);
        org.joda.time.DateTime dateTime85 = dateTime66.toDateTime(dateTimeZone83);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime86 = new org.joda.time.DateTime(85, (int) (byte) 10, (-292275054), 86300052, (int) 'a', dateTimeZone83);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86300052 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 52L + "'", long45 == 52L);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(mutableDateTime60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "1970" + "'", str64, "1970");
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(calendar70);
        org.junit.Assert.assertEquals(calendar70.toString(), "java.util.GregorianCalendar[time=978566400100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2001,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=4,DAY_OF_YEAR=4,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertNotNull(chronology81);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(dateTimeZone83);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(dateTime85);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) -1, chronology1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) '4', dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime5.withZoneRetainFields(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime5.minusMonths((int) '4');
        org.joda.time.DateTime.Property property12 = dateTime5.centuryOfEra();
        org.joda.time.DateTime dateTime13 = property12.withMaximumValue();
        boolean boolean14 = dateTime2.equals((java.lang.Object) dateTime13);
        int int15 = dateTime13.getWeekyear();
        int int16 = dateTime13.getDayOfMonth();
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 292278970 + "'", int15 == 292278970);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTimeISO();
        org.joda.time.DateTime.Property property10 = dateTime8.secondOfDay();
        org.joda.time.DateTime dateTime12 = property10.setCopy((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '4', dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime18.getZone();
        int int20 = dateTime15.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime22 = dateTime15.plusMonths((int) '#');
        org.joda.time.DateTime dateTime24 = dateTime15.plusMillis((int) ' ');
        int int25 = property10.getDifference((org.joda.time.ReadableInstant) dateTime24);
        java.lang.String str26 = property10.getAsString();
        int int27 = property10.getMaximumValueOverall();
        org.joda.time.DateTime dateTime29 = property10.setCopy(7);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-136771200) + "'", int25 == (-136771200));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 86399 + "'", int27 == 86399);
        org.junit.Assert.assertNotNull(dateTime29);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime8 = property7.getDateTime();
        org.joda.time.DateTimeField dateTimeField9 = property7.getField();
        java.lang.String str10 = property7.getAsString();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) '4', dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTime16.getZone();
        int int18 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime16);
        long long19 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime dateTime21 = property7.addToCopy(0);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) '4', dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = dateTime24.withZoneRetainFields(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime24.minusMonths((int) '4');
        int int31 = dateTime30.getDayOfWeek();
        org.joda.time.DateTime.Property property32 = dateTime30.year();
        org.joda.time.LocalDateTime localDateTime33 = dateTime30.toLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) '4', dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime36.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = dateTime36.withZoneRetainFields(dateTimeZone39);
        org.joda.time.DateTime.Property property41 = dateTime40.millisOfSecond();
        org.joda.time.DateTime dateTime42 = property41.getDateTime();
        org.joda.time.DateTime dateTime43 = dateTime42.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology44 = dateTime43.getChronology();
        org.joda.time.DateTime dateTime45 = dateTime30.toDateTime(chronology44);
        org.joda.time.DateTime dateTime47 = dateTime45.withEra((int) (short) 0);
        long long48 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime45);
        java.lang.String str49 = property7.getName();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "52" + "'", str10, "52");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 136771200000L + "'", long48 == 136771200000L);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "millisOfSecond" + "'", str49, "millisOfSecond");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime3 = dateTime2.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime5 = dateTime3.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) '4', dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfSecond();
        boolean boolean14 = dateTime3.isEqual((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime16 = dateTime12.plusMillis(0);
        org.joda.time.DateTime.Property property17 = dateTime12.millisOfDay();
        java.lang.String str18 = property17.getName();
        java.util.Locale locale19 = null;
        java.lang.String str20 = property17.getAsText(locale19);
        java.util.Locale locale21 = null;
        java.lang.String str22 = property17.getAsShortText(locale21);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "millisOfDay" + "'", str18, "millisOfDay");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "52" + "'", str20, "52");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "52" + "'", str22, "52");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime2.dayOfYear();
        int int10 = dateTime2.getYear();
        org.joda.time.DateTime dateTime12 = dateTime2.withWeekOfWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '4', dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = dateTime15.withZoneRetainFields(dateTimeZone18);
        org.joda.time.DateTime.Property property20 = dateTime19.millisOfSecond();
        org.joda.time.DateTime dateTime21 = property20.withMinimumValue();
        org.joda.time.DateTime.Property property22 = dateTime21.centuryOfEra();
        org.joda.time.DateTime.Property property23 = dateTime21.era();
        boolean boolean24 = dateTime21.isEqualNow();
        org.joda.time.Chronology chronology25 = dateTime21.getChronology();
        org.joda.time.DateTime dateTime26 = dateTime2.toDateTime(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime2.minus((long) (byte) 10);
        org.joda.time.DateTime dateTime30 = dateTime2.minusDays(53);
        org.joda.time.Instant instant31 = dateTime2.toInstant();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(instant31);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime5 = dateTime2.minusDays((int) (byte) 10);
        org.joda.time.DateTime dateTime7 = dateTime5.withSecondOfMinute(10);
        org.joda.time.DateTime dateTime8 = dateTime5.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property9 = dateTime8.yearOfEra();
        org.joda.time.DateTime dateTime11 = property9.addWrapFieldToCopy(1965);
        boolean boolean13 = property9.equals((java.lang.Object) (-17536739039L));
        org.joda.time.DateTime dateTime15 = property9.addWrapFieldToCopy((int) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime8 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (-1));
        boolean boolean11 = dateTime6.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime.Property property12 = dateTime6.weekyear();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime8 = property7.getDateTime();
        org.joda.time.DateTimeField dateTimeField9 = property7.getField();
        java.lang.String str10 = property7.getAsString();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) '4', dateTimeZone12);
        org.joda.time.DateTime dateTime14 = dateTime13.withEarlierOffsetAtOverlap();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime13.plus(readableDuration15);
        org.joda.time.DateTime.Property property17 = dateTime16.year();
        boolean boolean18 = property7.equals((java.lang.Object) dateTime16);
        java.util.Locale locale19 = null;
        java.util.Calendar calendar20 = dateTime16.toCalendar(locale19);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "52" + "'", str10, "52");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(calendar20);
        org.junit.Assert.assertEquals(calendar20.toString(), "java.util.GregorianCalendar[time=52,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=52,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime2.centuryOfEra();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        int int11 = dateTime10.getDayOfWeek();
        org.joda.time.DateTime dateTime13 = dateTime10.withDayOfWeek(1);
        int int14 = dateTime13.getDayOfMonth();
        org.joda.time.DateTime.Property property15 = dateTime13.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime18.getZone();
        org.joda.time.DateTime dateTime21 = dateTime18.minusDays((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) '4', dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = dateTime25.withZoneRetainFields(dateTimeZone28);
        org.joda.time.DateTime.Property property30 = dateTime29.millisOfSecond();
        org.joda.time.DateTime dateTime31 = property30.getDateTime();
        org.joda.time.DateTime dateTime32 = dateTime31.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology33 = dateTime32.getChronology();
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (byte) 0, chronology33);
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime21.toMutableDateTime(chronology33);
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(chronology33);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((java.lang.Object) dateTime13, chronology33);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) '4', dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime10 = dateTime8.withWeekOfWeekyear(10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = dateTime10.toString(dateTimeFormatter11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) -1, chronology14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) '4', dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.withZoneRetainFields(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) '4', dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = dateTime25.withZoneRetainFields(dateTimeZone28);
        org.joda.time.DateTime.Property property30 = dateTime29.millisOfSecond();
        org.joda.time.DateTime dateTime31 = property30.withMinimumValue();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime31.toMutableDateTime(chronology32);
        boolean boolean34 = dateTime22.isEqual((org.joda.time.ReadableInstant) dateTime31);
        boolean boolean35 = dateTime15.equals((java.lang.Object) dateTime22);
        org.joda.time.DateTime dateTime37 = dateTime22.minusMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) '4', dateTimeZone39);
        org.joda.time.DateTime dateTime42 = dateTime40.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = dateTime40.withZoneRetainFields(dateTimeZone43);
        org.joda.time.DateTime.Property property45 = dateTime44.millisOfSecond();
        org.joda.time.DateTime dateTime46 = property45.getDateTime();
        org.joda.time.DateTime dateTime47 = dateTime46.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology48 = dateTime47.getChronology();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((java.lang.Object) dateTime22, chronology48);
        org.joda.time.MutableDateTime mutableDateTime50 = dateTime10.toMutableDateTime(chronology48);
        org.joda.time.DateTime dateTime51 = dateTime2.toDateTime(chronology48);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(chronology48);
        org.joda.time.DateTime dateTime53 = org.joda.time.DateTime.now(chronology48);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((java.lang.Object) dateTime53);
        org.joda.time.DateTime dateTime56 = dateTime53.withYear(394);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-03-05T01:40:00.052Z" + "'", str12, "1970-03-05T01:40:00.052Z");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime56);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime3 = dateTime2.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes((int) (short) -1);
        int int6 = dateTime3.getDayOfYear();
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) '4', dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) '4', dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMinutes((int) (short) 100);
        int int17 = dateTime11.compareTo((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime dateTime19 = dateTime14.withSecondOfMinute((int) (short) 0);
        org.joda.time.DateTime dateTime20 = dateTime14.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) '4', dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) '4', dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.plusMinutes((int) (short) 100);
        int int29 = dateTime23.compareTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime dateTime31 = dateTime26.plusMonths((int) (short) 100);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (byte) -1, chronology34);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) '4', dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = dateTime38.withZoneRetainFields(dateTimeZone41);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) '4', dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime45.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateTime dateTime49 = dateTime45.withZoneRetainFields(dateTimeZone48);
        org.joda.time.DateTime.Property property50 = dateTime49.millisOfSecond();
        org.joda.time.DateTime dateTime51 = property50.withMinimumValue();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = dateTime51.toMutableDateTime(chronology52);
        boolean boolean54 = dateTime42.isEqual((org.joda.time.ReadableInstant) dateTime51);
        boolean boolean55 = dateTime35.equals((java.lang.Object) dateTime42);
        org.joda.time.DateTime dateTime57 = dateTime42.minusMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) '4', dateTimeZone59);
        org.joda.time.DateTime dateTime62 = dateTime60.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.DateTime dateTime64 = dateTime60.withZoneRetainFields(dateTimeZone63);
        org.joda.time.DateTime.Property property65 = dateTime64.millisOfSecond();
        org.joda.time.DateTime dateTime66 = property65.getDateTime();
        org.joda.time.DateTime dateTime67 = dateTime66.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology68 = dateTime67.getChronology();
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime((java.lang.Object) dateTime42, chronology68);
        org.joda.time.DateTimeZone dateTimeZone70 = dateTime69.getZone();
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime((long) 10, dateTimeZone70);
        org.joda.time.DateTime dateTime72 = dateTime31.withZoneRetainFields(dateTimeZone70);
        org.joda.time.MutableDateTime mutableDateTime73 = dateTime20.toMutableDateTime(dateTimeZone70);
        org.joda.time.DateTime dateTime74 = dateTime8.toDateTime(dateTimeZone70);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(mutableDateTime53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(chronology68);
        org.junit.Assert.assertNotNull(dateTimeZone70);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(mutableDateTime73);
        org.junit.Assert.assertNotNull(dateTime74);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) -1, chronology1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) '4', dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime5.withZoneRetainFields(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) '4', dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = dateTime12.withZoneRetainFields(dateTimeZone15);
        org.joda.time.DateTime.Property property17 = dateTime16.millisOfSecond();
        org.joda.time.DateTime dateTime18 = property17.withMinimumValue();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime18.toMutableDateTime(chronology19);
        boolean boolean21 = dateTime9.isEqual((org.joda.time.ReadableInstant) dateTime18);
        boolean boolean22 = dateTime2.equals((java.lang.Object) dateTime9);
        org.joda.time.DateTime dateTime24 = dateTime9.minusMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) '4', dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = dateTime27.withZoneRetainFields(dateTimeZone30);
        org.joda.time.DateTime.Property property32 = dateTime31.millisOfSecond();
        org.joda.time.DateTime dateTime33 = property32.getDateTime();
        org.joda.time.DateTime dateTime34 = dateTime33.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology35 = dateTime34.getChronology();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((java.lang.Object) dateTime9, chronology35);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) '4', dateTimeZone40);
        org.joda.time.DateTime dateTime43 = dateTime41.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = dateTime41.withZoneRetainFields(dateTimeZone44);
        org.joda.time.DateTime.Property property46 = dateTime45.millisOfSecond();
        org.joda.time.DateTime dateTime47 = property46.withMinimumValue();
        org.joda.time.DateTime.Property property48 = dateTime47.centuryOfEra();
        org.joda.time.DateTime.Property property49 = dateTime47.era();
        boolean boolean50 = dateTime47.isEqualNow();
        org.joda.time.Chronology chronology51 = dateTime47.getChronology();
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((java.lang.Object) dateTime38, chronology51);
        org.joda.time.DateTime dateTime53 = dateTime9.withChronology(chronology51);
        org.joda.time.DateTime dateTime54 = org.joda.time.DateTime.now(chronology51);
        org.joda.time.DateTime dateTime56 = dateTime54.withWeekyear(12);
        org.joda.time.DateTime dateTime58 = dateTime54.minusYears(65);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime58);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekOfWeekyear(10);
        org.joda.time.DateTime dateTime8 = dateTime6.withMillis((long) (byte) -1);
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
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) '4', dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = dateTime33.withZoneRetainFields(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime33.minusMonths((int) '4');
        int int40 = dateTime39.getDayOfWeek();
        org.joda.time.DateTime.Property property41 = dateTime39.year();
        org.joda.time.DateTime dateTime43 = dateTime39.withWeekyear((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) '4', dateTimeZone45);
        org.joda.time.DateTime dateTime47 = dateTime46.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime49 = dateTime47.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) '4', dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime52.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateTime dateTime56 = dateTime52.withZoneRetainFields(dateTimeZone55);
        org.joda.time.DateTime.Property property57 = dateTime56.millisOfSecond();
        boolean boolean58 = dateTime47.isEqual((org.joda.time.ReadableInstant) dateTime56);
        boolean boolean59 = dateTime39.isBefore((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime.Property property60 = dateTime47.yearOfCentury();
        boolean boolean61 = dateTime30.isBefore((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime dateTime63 = dateTime47.minus((long) 12);
        int int64 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime47);
        int int65 = dateTime6.getYear();
        org.joda.time.DateTime.Property property66 = dateTime6.secondOfMinute();
        int int67 = dateTime6.getMonthOfYear();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1970 + "'", int65 == 1970);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 3 + "'", int67 == 3);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime5 = dateTime2.minusDays((int) (byte) 10);
        org.joda.time.DateTime dateTime7 = dateTime5.withSecondOfMinute(10);
        java.util.Date date8 = dateTime5.toDate();
        org.joda.time.DateTime dateTime10 = dateTime5.plusSeconds(50);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime14.getZone();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(0L, dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '4', dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = dateTime19.withZoneRetainFields(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime19.minusMonths((int) '4');
        org.joda.time.DateTime.Property property26 = dateTime19.centuryOfEra();
        org.joda.time.DateTime dateTime27 = property26.withMaximumValue();
        org.joda.time.DateTime dateTime28 = property26.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime29 = dateTime28.toLocalTime();
        org.joda.time.DateTime dateTime30 = dateTime16.withTime(localTime29);
        org.joda.time.DateTime dateTime31 = dateTime5.withTime(localTime29);
        org.joda.time.DateTime dateTime32 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.LocalTime localTime33 = dateTime32.toLocalTime();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Mon Dec 22 00:00:00 UTC 1969");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(localTime33);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(136771200000L);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime8 = property7.getDateTime();
        org.joda.time.DateTime dateTime9 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime8.secondOfDay();
        org.joda.time.DateTime dateTime12 = property10.addToCopy((-1L));
        org.joda.time.DateTime dateTime13 = property10.roundCeilingCopy();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime2.centuryOfEra();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = property9.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) '4', dateTimeZone13);
        org.joda.time.DateTime.Property property15 = dateTime14.dayOfYear();
        int int16 = property9.compareTo((org.joda.time.ReadableInstant) dateTime14);
        java.lang.String str17 = property9.getAsShortText();
        org.joda.time.DateTime dateTime18 = property9.getDateTime();
        org.joda.time.DateTime.Property property19 = dateTime18.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) '4', dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = dateTime22.withZoneRetainFields(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.minusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime30 = dateTime28.withHourOfDay((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) '4', dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = dateTime33.withZoneRetainFields(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime33.minusMonths((int) '4');
        int int40 = dateTime39.getDayOfWeek();
        org.joda.time.DateTime.Property property41 = dateTime39.year();
        org.joda.time.DateTime dateTime43 = dateTime39.withWeekyear((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) '4', dateTimeZone45);
        org.joda.time.DateTime dateTime47 = dateTime46.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime49 = dateTime47.withCenturyOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) '4', dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime52.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateTime dateTime56 = dateTime52.withZoneRetainFields(dateTimeZone55);
        org.joda.time.DateTime.Property property57 = dateTime56.millisOfSecond();
        boolean boolean58 = dateTime47.isEqual((org.joda.time.ReadableInstant) dateTime56);
        boolean boolean59 = dateTime39.isBefore((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime dateTime61 = dateTime47.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone64);
        org.joda.time.DateTimeZone dateTimeZone66 = dateTime65.getZone();
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime(0L, dateTimeZone66);
        org.joda.time.DateTime dateTime68 = dateTime61.toDateTime(dateTimeZone66);
        org.joda.time.DateTime dateTime69 = dateTime30.withZoneRetainFields(dateTimeZone66);
        org.joda.time.DateTime dateTime71 = dateTime30.plusMillis(31);
        int int72 = property19.compareTo((org.joda.time.ReadableInstant) dateTime71);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "19" + "'", str17, "19");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTimeZone66);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '4', dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMonths((int) '4');
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.plus(readablePeriod9);
        org.joda.time.YearMonthDay yearMonthDay11 = dateTime8.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) '4', dateTimeZone13);
        org.joda.time.LocalDate localDate15 = dateTime14.toLocalDate();
        int int16 = dateTime14.getCenturyOfEra();
        org.joda.time.DateTime dateTime18 = dateTime14.withCenturyOfEra((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime14.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) '4', dateTimeZone21);
        int int23 = dateTime22.getMonthOfYear();
        org.joda.time.DateTime dateTime25 = dateTime22.minusSeconds((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) '4', dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.plusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = dateTime28.withZoneRetainFields(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTime35.getZone();
        org.joda.time.DateTime dateTime37 = dateTime28.withZone(dateTimeZone36);
        org.joda.time.DateTime dateTime38 = dateTime22.toDateTime(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime14.withZoneRetainFields(dateTimeZone36);
        org.joda.time.DateTime dateTime40 = dateTime8.withZone(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 19 + "'", int16 == 19);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime40);
    }
}
