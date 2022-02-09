import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        MyInteger myInteger3 = new MyInteger((int) (short) -1);
        java.lang.String str4 = myInteger3.toString();
        MyInteger myInteger5 = myInteger1.add(myInteger3);
        java.lang.Class<?> wildcardClass6 = myInteger3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger5", myInteger1.equals(myInteger5) ? myInteger1.hashCode() == myInteger5.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        MyInteger myInteger3 = new MyInteger((int) (short) -1);
        java.lang.String str4 = myInteger3.toString();
        MyInteger myInteger5 = myInteger1.add(myInteger3);
        MyInteger myInteger7 = new MyInteger((int) 'a');
        boolean boolean8 = myInteger1.equals((java.lang.Object) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger7", myInteger3.equals(myInteger7) ? myInteger3.hashCode() == myInteger7.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        MyInteger myInteger4 = new MyInteger((int) (short) 0);
        boolean boolean6 = myInteger4.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger15 = myInteger8.multiply(myInteger12);
        int int16 = myInteger8.getIntValue();
        int int17 = myInteger8.getIntValue();
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        MyInteger myInteger27 = myInteger8.add(myInteger19);
        MyInteger myInteger28 = myInteger4.multiply(myInteger27);
        MyInteger myInteger29 = myInteger1.add(myInteger28);
        java.lang.String str30 = myInteger1.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger4 and myInteger29", myInteger4.equals(myInteger29) ? myInteger4.hashCode() == myInteger29.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        MyInteger myInteger1 = new MyInteger((int) 'a');
        int int2 = myInteger1.getIntValue();
        int int3 = myInteger1.getIntValue();
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        java.lang.String str14 = myInteger5.toString();
        boolean boolean16 = myInteger5.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger17 = myInteger1.multiply(myInteger5);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        MyInteger myInteger21 = new MyInteger((int) (short) -1);
        java.lang.String str22 = myInteger21.toString();
        MyInteger myInteger23 = myInteger19.add(myInteger21);
        MyInteger myInteger24 = myInteger1.multiply(myInteger21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger5 and myInteger23", myInteger5.equals(myInteger23) ? myInteger5.hashCode() == myInteger23.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        MyInteger myInteger1 = new MyInteger((int) (byte) 1);
        MyInteger myInteger3 = new MyInteger((int) 'a');
        MyInteger myInteger4 = myInteger1.multiply(myInteger3);
        int int5 = myInteger4.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger3", myInteger1.equals(myInteger3) ? myInteger1.hashCode() == myInteger3.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        int int2 = myInteger1.getIntValue();
        MyInteger myInteger4 = new MyInteger((int) 'a');
        int int5 = myInteger4.getIntValue();
        int int6 = myInteger4.getIntValue();
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger15 = myInteger8.multiply(myInteger12);
        int int16 = myInteger8.getIntValue();
        java.lang.String str17 = myInteger8.toString();
        boolean boolean19 = myInteger8.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger20 = myInteger4.multiply(myInteger8);
        MyInteger myInteger21 = myInteger1.multiply(myInteger8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger4 and myInteger12", myInteger4.equals(myInteger12) ? myInteger4.hashCode() == myInteger12.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        MyInteger myInteger1 = new MyInteger((int) 'a');
        int int2 = myInteger1.getIntValue();
        int int3 = myInteger1.getIntValue();
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        java.lang.String str14 = myInteger5.toString();
        boolean boolean16 = myInteger5.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger17 = myInteger1.multiply(myInteger5);
        java.lang.Class<?> wildcardClass18 = myInteger5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger9", myInteger1.equals(myInteger9) ? myInteger1.hashCode() == myInteger9.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        MyInteger myInteger1 = new MyInteger((int) 'a');
        int int2 = myInteger1.getIntValue();
        int int3 = myInteger1.getIntValue();
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        java.lang.String str14 = myInteger5.toString();
        boolean boolean16 = myInteger5.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger17 = myInteger1.multiply(myInteger5);
        java.lang.String str18 = myInteger5.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger9", myInteger1.equals(myInteger9) ? myInteger1.hashCode() == myInteger9.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        int int2 = myInteger1.getIntValue();
        MyInteger myInteger4 = new MyInteger((int) (short) -1);
        java.lang.String str5 = myInteger4.toString();
        MyInteger myInteger6 = myInteger1.add(myInteger4);
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger15 = myInteger8.multiply(myInteger12);
        int int16 = myInteger8.getIntValue();
        int int17 = myInteger8.getIntValue();
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        MyInteger myInteger27 = myInteger8.add(myInteger19);
        boolean boolean28 = myInteger6.equals((java.lang.Object) myInteger8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger12", myInteger1.equals(myInteger12) ? myInteger1.hashCode() == myInteger12.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        MyInteger myInteger4 = new MyInteger((int) (short) 0);
        boolean boolean6 = myInteger4.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger15 = myInteger8.multiply(myInteger12);
        int int16 = myInteger8.getIntValue();
        int int17 = myInteger8.getIntValue();
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        MyInteger myInteger27 = myInteger8.add(myInteger19);
        MyInteger myInteger28 = myInteger4.multiply(myInteger27);
        MyInteger myInteger29 = myInteger1.add(myInteger28);
        int int30 = myInteger1.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger4 and myInteger29", myInteger4.equals(myInteger29) ? myInteger4.hashCode() == myInteger29.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        MyInteger myInteger1 = new MyInteger((int) (byte) 1);
        MyInteger myInteger3 = new MyInteger((int) 'a');
        MyInteger myInteger4 = myInteger1.multiply(myInteger3);
        java.lang.String str5 = myInteger4.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger3", myInteger1.equals(myInteger3) ? myInteger1.hashCode() == myInteger3.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger14 = myInteger7.multiply(myInteger11);
        int int15 = myInteger7.getIntValue();
        int int16 = myInteger7.getIntValue();
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = myInteger18.multiply(myInteger22);
        MyInteger myInteger26 = myInteger7.add(myInteger18);
        MyInteger myInteger27 = myInteger3.multiply(myInteger26);
        MyInteger myInteger28 = myInteger1.add(myInteger27);
        int int29 = myInteger28.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger3", myInteger1.equals(myInteger3) ? myInteger1.hashCode() == myInteger3.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        MyInteger myInteger1 = new MyInteger((int) 'a');
        int int2 = myInteger1.getIntValue();
        int int3 = myInteger1.getIntValue();
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        java.lang.String str14 = myInteger5.toString();
        boolean boolean16 = myInteger5.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger17 = myInteger1.multiply(myInteger5);
        int int18 = myInteger5.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger9", myInteger1.equals(myInteger9) ? myInteger1.hashCode() == myInteger9.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        java.lang.String str9 = myInteger1.toString();
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger18 = myInteger11.multiply(myInteger15);
        int int19 = myInteger11.getIntValue();
        MyInteger myInteger21 = new MyInteger((int) '#');
        MyInteger myInteger22 = myInteger11.add(myInteger21);
        MyInteger myInteger23 = myInteger1.add(myInteger11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger5 and myInteger21", myInteger5.equals(myInteger21) ? myInteger5.hashCode() == myInteger21.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        MyInteger myInteger1 = new MyInteger((int) 'a');
        int int2 = myInteger1.getIntValue();
        int int3 = myInteger1.getIntValue();
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        java.lang.String str14 = myInteger5.toString();
        boolean boolean16 = myInteger5.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger17 = myInteger1.multiply(myInteger5);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger30 = myInteger23.multiply(myInteger27);
        int int31 = myInteger23.getIntValue();
        int int32 = myInteger23.getIntValue();
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger38 = new MyInteger((int) (short) 0);
        boolean boolean40 = myInteger38.equals((java.lang.Object) 1.0f);
        MyInteger myInteger41 = myInteger34.multiply(myInteger38);
        MyInteger myInteger42 = myInteger23.add(myInteger34);
        MyInteger myInteger43 = myInteger19.multiply(myInteger42);
        java.lang.String str44 = myInteger19.toString();
        MyInteger myInteger45 = myInteger17.multiply(myInteger19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger5", myInteger1.equals(myInteger5) ? myInteger1.hashCode() == myInteger5.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        int int9 = myInteger1.getIntValue();
        java.lang.String str10 = myInteger1.toString();
        boolean boolean12 = myInteger1.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger14 = new MyInteger((int) 'a');
        int int15 = myInteger14.getIntValue();
        int int16 = myInteger14.getIntValue();
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = myInteger18.multiply(myInteger22);
        int int26 = myInteger18.getIntValue();
        java.lang.String str27 = myInteger18.toString();
        boolean boolean29 = myInteger18.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger30 = myInteger14.multiply(myInteger18);
        boolean boolean31 = myInteger1.equals((java.lang.Object) myInteger14);
        java.lang.Class<?> wildcardClass32 = myInteger1.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger5 and myInteger14", myInteger5.equals(myInteger14) ? myInteger5.hashCode() == myInteger14.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        int int9 = myInteger1.getIntValue();
        MyInteger myInteger11 = new MyInteger((int) '#');
        MyInteger myInteger12 = myInteger1.add(myInteger11);
        java.lang.String str13 = myInteger12.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger11", myInteger1.equals(myInteger11) ? myInteger1.hashCode() == myInteger11.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        int int9 = myInteger1.getIntValue();
        MyInteger myInteger11 = new MyInteger((int) '#');
        MyInteger myInteger12 = myInteger1.add(myInteger11);
        MyInteger myInteger14 = new MyInteger((int) (short) 0);
        boolean boolean16 = myInteger14.equals((java.lang.Object) 1.0f);
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger21 = myInteger14.multiply(myInteger18);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        MyInteger myInteger24 = myInteger14.multiply(myInteger23);
        MyInteger myInteger25 = myInteger11.multiply(myInteger14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger12", myInteger1.equals(myInteger12) ? myInteger1.hashCode() == myInteger12.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.multiply(myInteger5);
        MyInteger myInteger15 = new MyInteger((int) (short) -1);
        java.lang.String str16 = myInteger15.toString();
        java.lang.String str17 = myInteger15.toString();
        MyInteger myInteger18 = myInteger5.multiply(myInteger15);
        java.lang.String str19 = myInteger5.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger15", myInteger1.equals(myInteger15) ? myInteger1.hashCode() == myInteger15.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger14 = myInteger7.multiply(myInteger11);
        int int15 = myInteger7.getIntValue();
        int int16 = myInteger7.getIntValue();
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = myInteger18.multiply(myInteger22);
        MyInteger myInteger26 = myInteger7.add(myInteger18);
        MyInteger myInteger27 = myInteger3.multiply(myInteger26);
        MyInteger myInteger28 = myInteger1.add(myInteger27);
        MyInteger myInteger30 = new MyInteger((int) (short) 0);
        boolean boolean32 = myInteger30.equals((java.lang.Object) 1.0f);
        int int33 = myInteger30.getIntValue();
        boolean boolean34 = myInteger1.equals((java.lang.Object) int33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger28", myInteger3.equals(myInteger28) ? myInteger3.hashCode() == myInteger28.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger14 = myInteger7.multiply(myInteger11);
        int int15 = myInteger7.getIntValue();
        int int16 = myInteger7.getIntValue();
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = myInteger18.multiply(myInteger22);
        MyInteger myInteger26 = myInteger7.add(myInteger18);
        MyInteger myInteger27 = myInteger3.multiply(myInteger26);
        MyInteger myInteger28 = myInteger1.add(myInteger27);
        java.lang.Class<?> wildcardClass29 = myInteger28.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger3", myInteger1.equals(myInteger3) ? myInteger1.hashCode() == myInteger3.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        MyInteger myInteger11 = myInteger1.multiply(myInteger10);
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = myInteger13.multiply(myInteger17);
        int int21 = myInteger13.getIntValue();
        MyInteger myInteger23 = new MyInteger((int) '#');
        MyInteger myInteger24 = myInteger13.add(myInteger23);
        MyInteger myInteger25 = myInteger11.multiply(myInteger13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger23", myInteger1.equals(myInteger23) ? myInteger1.hashCode() == myInteger23.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        int int9 = myInteger1.getIntValue();
        MyInteger myInteger11 = new MyInteger((int) '#');
        MyInteger myInteger12 = myInteger1.add(myInteger11);
        int int13 = myInteger12.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger11", myInteger1.equals(myInteger11) ? myInteger1.hashCode() == myInteger11.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        MyInteger myInteger11 = myInteger1.multiply(myInteger10);
        boolean boolean13 = myInteger1.equals((java.lang.Object) '4');
        MyInteger myInteger15 = new MyInteger((int) 'a');
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        MyInteger myInteger19 = new MyInteger((int) (short) -1);
        java.lang.String str20 = myInteger19.toString();
        MyInteger myInteger21 = myInteger17.add(myInteger19);
        boolean boolean22 = myInteger15.equals((java.lang.Object) myInteger17);
        MyInteger myInteger23 = myInteger1.multiply(myInteger15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger5 and myInteger19", myInteger5.equals(myInteger19) ? myInteger5.hashCode() == myInteger19.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        int int2 = myInteger1.getIntValue();
        MyInteger myInteger4 = new MyInteger((int) (short) -1);
        java.lang.String str5 = myInteger4.toString();
        MyInteger myInteger6 = myInteger1.add(myInteger4);
        MyInteger myInteger8 = new MyInteger((int) (short) -1);
        MyInteger myInteger9 = myInteger6.multiply(myInteger8);
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        MyInteger myInteger13 = new MyInteger((int) (short) -1);
        java.lang.String str14 = myInteger13.toString();
        MyInteger myInteger15 = myInteger11.add(myInteger13);
        boolean boolean16 = myInteger6.equals((java.lang.Object) myInteger11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger9", myInteger1.equals(myInteger9) ? myInteger1.hashCode() == myInteger9.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        MyInteger myInteger1 = new MyInteger((int) 'a');
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        MyInteger myInteger5 = new MyInteger((int) (short) -1);
        java.lang.String str6 = myInteger5.toString();
        MyInteger myInteger7 = myInteger3.add(myInteger5);
        boolean boolean8 = myInteger1.equals((java.lang.Object) myInteger3);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        MyInteger myInteger11 = myInteger3.add(myInteger10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger5", myInteger1.equals(myInteger5) ? myInteger1.hashCode() == myInteger5.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        MyInteger myInteger1 = new MyInteger((int) 'a');
        int int2 = myInteger1.getIntValue();
        int int3 = myInteger1.getIntValue();
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        java.lang.String str14 = myInteger5.toString();
        boolean boolean16 = myInteger5.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger17 = myInteger1.multiply(myInteger5);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger30 = myInteger23.multiply(myInteger27);
        MyInteger myInteger31 = myInteger19.multiply(myInteger23);
        boolean boolean32 = myInteger17.equals((java.lang.Object) myInteger31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger5", myInteger1.equals(myInteger5) ? myInteger1.hashCode() == myInteger5.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        int int2 = myInteger1.getIntValue();
        MyInteger myInteger4 = new MyInteger((int) (short) -1);
        java.lang.String str5 = myInteger4.toString();
        MyInteger myInteger6 = myInteger1.add(myInteger4);
        java.lang.String str7 = myInteger4.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger6", myInteger1.equals(myInteger6) ? myInteger1.hashCode() == myInteger6.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        MyInteger myInteger3 = new MyInteger((int) (short) -1);
        java.lang.String str4 = myInteger3.toString();
        MyInteger myInteger5 = myInteger1.add(myInteger3);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger14 = myInteger7.multiply(myInteger11);
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        MyInteger myInteger17 = myInteger7.multiply(myInteger16);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger30 = myInteger23.multiply(myInteger27);
        int int31 = myInteger23.getIntValue();
        int int32 = myInteger23.getIntValue();
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger38 = new MyInteger((int) (short) 0);
        boolean boolean40 = myInteger38.equals((java.lang.Object) 1.0f);
        MyInteger myInteger41 = myInteger34.multiply(myInteger38);
        MyInteger myInteger42 = myInteger23.add(myInteger34);
        int int43 = myInteger42.getIntValue();
        boolean boolean44 = myInteger19.equals((java.lang.Object) myInteger42);
        MyInteger myInteger45 = myInteger16.multiply(myInteger19);
        MyInteger myInteger46 = myInteger3.add(myInteger19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger5", myInteger1.equals(myInteger5) ? myInteger1.hashCode() == myInteger5.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        MyInteger myInteger3 = new MyInteger((int) (short) -1);
        java.lang.String str4 = myInteger3.toString();
        MyInteger myInteger5 = myInteger1.add(myInteger3);
        int int6 = myInteger5.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger3", myInteger1.equals(myInteger3) ? myInteger1.hashCode() == myInteger3.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        MyInteger myInteger3 = new MyInteger((int) (short) -1);
        java.lang.String str4 = myInteger3.toString();
        MyInteger myInteger5 = myInteger1.add(myInteger3);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger14 = myInteger7.multiply(myInteger11);
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        MyInteger myInteger17 = myInteger7.multiply(myInteger16);
        java.lang.String str18 = myInteger7.toString();
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger24 = new MyInteger((int) (short) 0);
        boolean boolean26 = myInteger24.equals((java.lang.Object) 1.0f);
        MyInteger myInteger27 = myInteger20.multiply(myInteger24);
        int int28 = myInteger20.getIntValue();
        java.lang.String str29 = myInteger20.toString();
        boolean boolean31 = myInteger20.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger32 = myInteger7.multiply(myInteger20);
        MyInteger myInteger33 = myInteger1.add(myInteger32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger7", myInteger3.equals(myInteger7) ? myInteger3.hashCode() == myInteger7.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        MyInteger myInteger1 = new MyInteger((int) 'a');
        int int2 = myInteger1.getIntValue();
        int int3 = myInteger1.getIntValue();
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        java.lang.String str14 = myInteger5.toString();
        boolean boolean16 = myInteger5.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger17 = myInteger1.multiply(myInteger5);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        int int27 = myInteger19.getIntValue();
        int int28 = myInteger19.getIntValue();
        boolean boolean29 = myInteger17.equals((java.lang.Object) int28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger5", myInteger1.equals(myInteger5) ? myInteger1.hashCode() == myInteger5.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        int int14 = myInteger5.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        MyInteger myInteger24 = myInteger5.add(myInteger16);
        MyInteger myInteger25 = myInteger1.multiply(myInteger24);
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = myInteger27.multiply(myInteger31);
        java.lang.Class<?> wildcardClass35 = myInteger31.getClass();
        boolean boolean36 = myInteger25.equals((java.lang.Object) wildcardClass35);
        MyInteger myInteger38 = new MyInteger((int) '#');
        boolean boolean39 = myInteger25.equals((java.lang.Object) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger38", myInteger1.equals(myInteger38) ? myInteger1.hashCode() == myInteger38.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.multiply(myInteger5);
        MyInteger myInteger15 = new MyInteger((int) (short) -1);
        java.lang.String str16 = myInteger15.toString();
        java.lang.String str17 = myInteger15.toString();
        MyInteger myInteger18 = myInteger5.multiply(myInteger15);
        int int19 = myInteger18.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger15", myInteger1.equals(myInteger15) ? myInteger1.hashCode() == myInteger15.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        int int9 = myInteger1.getIntValue();
        java.lang.String str10 = myInteger1.toString();
        boolean boolean12 = myInteger1.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger14 = new MyInteger((int) 'a');
        int int15 = myInteger14.getIntValue();
        int int16 = myInteger14.getIntValue();
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = myInteger18.multiply(myInteger22);
        int int26 = myInteger18.getIntValue();
        java.lang.String str27 = myInteger18.toString();
        boolean boolean29 = myInteger18.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger30 = myInteger14.multiply(myInteger18);
        boolean boolean31 = myInteger1.equals((java.lang.Object) myInteger14);
        MyInteger myInteger33 = new MyInteger((int) (byte) 0);
        boolean boolean34 = myInteger1.equals((java.lang.Object) myInteger33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger5 and myInteger14", myInteger5.equals(myInteger14) ? myInteger5.hashCode() == myInteger14.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        MyInteger myInteger1 = new MyInteger((int) 'a');
        int int2 = myInteger1.getIntValue();
        int int3 = myInteger1.getIntValue();
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        java.lang.String str14 = myInteger5.toString();
        boolean boolean16 = myInteger5.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger17 = myInteger1.multiply(myInteger5);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        boolean boolean28 = myInteger23.equals((java.lang.Object) (byte) -1);
        int int29 = myInteger23.getIntValue();
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger38 = myInteger31.multiply(myInteger35);
        int int39 = myInteger31.getIntValue();
        java.lang.String str40 = myInteger31.toString();
        java.lang.String str41 = myInteger31.toString();
        MyInteger myInteger42 = myInteger23.add(myInteger31);
        int int43 = myInteger31.getIntValue();
        MyInteger myInteger44 = myInteger5.add(myInteger31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger9", myInteger1.equals(myInteger9) ? myInteger1.hashCode() == myInteger9.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger14 = myInteger7.multiply(myInteger11);
        int int15 = myInteger7.getIntValue();
        int int16 = myInteger7.getIntValue();
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = myInteger18.multiply(myInteger22);
        MyInteger myInteger26 = myInteger7.add(myInteger18);
        MyInteger myInteger27 = myInteger3.multiply(myInteger26);
        MyInteger myInteger28 = myInteger1.add(myInteger27);
        java.lang.Class<?> wildcardClass29 = myInteger1.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger28", myInteger3.equals(myInteger28) ? myInteger3.hashCode() == myInteger28.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        int int2 = myInteger1.getIntValue();
        MyInteger myInteger4 = new MyInteger((int) (short) -1);
        java.lang.String str5 = myInteger4.toString();
        MyInteger myInteger6 = myInteger1.add(myInteger4);
        MyInteger myInteger8 = new MyInteger((int) (short) -1);
        MyInteger myInteger9 = myInteger6.multiply(myInteger8);
        int int10 = myInteger9.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger6", myInteger1.equals(myInteger6) ? myInteger1.hashCode() == myInteger6.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        int int9 = myInteger1.getIntValue();
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger18 = myInteger11.multiply(myInteger15);
        int int19 = myInteger11.getIntValue();
        MyInteger myInteger21 = new MyInteger((int) '#');
        MyInteger myInteger22 = myInteger11.add(myInteger21);
        MyInteger myInteger23 = myInteger1.add(myInteger21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger5 and myInteger22", myInteger5.equals(myInteger22) ? myInteger5.hashCode() == myInteger22.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        boolean boolean4 = myInteger1.equals((java.lang.Object) (-1));
        MyInteger myInteger6 = new MyInteger((int) (short) 0);
        boolean boolean8 = myInteger6.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        boolean boolean12 = myInteger10.equals((java.lang.Object) 1.0f);
        MyInteger myInteger13 = myInteger6.multiply(myInteger10);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        MyInteger myInteger16 = myInteger6.multiply(myInteger15);
        java.lang.String str17 = myInteger6.toString();
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        int int27 = myInteger19.getIntValue();
        java.lang.String str28 = myInteger19.toString();
        boolean boolean30 = myInteger19.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger31 = myInteger6.multiply(myInteger19);
        boolean boolean32 = myInteger1.equals((java.lang.Object) myInteger19);
        MyInteger myInteger34 = new MyInteger((int) (short) -1);
        java.lang.String str35 = myInteger34.toString();
        MyInteger myInteger37 = new MyInteger((int) (short) 0);
        boolean boolean39 = myInteger37.equals((java.lang.Object) 1.0f);
        MyInteger myInteger41 = new MyInteger((int) (short) 0);
        boolean boolean43 = myInteger41.equals((java.lang.Object) 1.0f);
        MyInteger myInteger45 = new MyInteger((int) (short) 0);
        boolean boolean47 = myInteger45.equals((java.lang.Object) 1.0f);
        MyInteger myInteger48 = myInteger41.multiply(myInteger45);
        int int49 = myInteger41.getIntValue();
        int int50 = myInteger41.getIntValue();
        MyInteger myInteger52 = new MyInteger((int) (short) 0);
        boolean boolean54 = myInteger52.equals((java.lang.Object) 1.0f);
        MyInteger myInteger56 = new MyInteger((int) (short) 0);
        boolean boolean58 = myInteger56.equals((java.lang.Object) 1.0f);
        MyInteger myInteger59 = myInteger52.multiply(myInteger56);
        MyInteger myInteger60 = myInteger41.add(myInteger52);
        MyInteger myInteger61 = myInteger37.multiply(myInteger60);
        MyInteger myInteger62 = myInteger34.add(myInteger61);
        MyInteger myInteger63 = myInteger1.multiply(myInteger61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger6 and myInteger34", myInteger6.equals(myInteger34) ? myInteger6.hashCode() == myInteger34.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        int int14 = myInteger5.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        MyInteger myInteger24 = myInteger5.add(myInteger16);
        int int25 = myInteger24.getIntValue();
        boolean boolean26 = myInteger1.equals((java.lang.Object) myInteger24);
        int int27 = myInteger24.getIntValue();
        MyInteger myInteger29 = new MyInteger((int) (byte) 10);
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger38 = myInteger31.multiply(myInteger35);
        MyInteger myInteger40 = new MyInteger((int) (short) 0);
        MyInteger myInteger41 = myInteger31.multiply(myInteger40);
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger47 = new MyInteger((int) (short) 0);
        boolean boolean49 = myInteger47.equals((java.lang.Object) 1.0f);
        MyInteger myInteger51 = new MyInteger((int) (short) 0);
        boolean boolean53 = myInteger51.equals((java.lang.Object) 1.0f);
        MyInteger myInteger54 = myInteger47.multiply(myInteger51);
        int int55 = myInteger47.getIntValue();
        int int56 = myInteger47.getIntValue();
        MyInteger myInteger58 = new MyInteger((int) (short) 0);
        boolean boolean60 = myInteger58.equals((java.lang.Object) 1.0f);
        MyInteger myInteger62 = new MyInteger((int) (short) 0);
        boolean boolean64 = myInteger62.equals((java.lang.Object) 1.0f);
        MyInteger myInteger65 = myInteger58.multiply(myInteger62);
        MyInteger myInteger66 = myInteger47.add(myInteger58);
        int int67 = myInteger66.getIntValue();
        boolean boolean68 = myInteger43.equals((java.lang.Object) myInteger66);
        MyInteger myInteger69 = myInteger40.multiply(myInteger43);
        MyInteger myInteger70 = myInteger29.multiply(myInteger69);
        MyInteger myInteger71 = myInteger24.add(myInteger70);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger29", myInteger1.equals(myInteger29) ? myInteger1.hashCode() == myInteger29.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        int int14 = myInteger5.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        MyInteger myInteger24 = myInteger5.add(myInteger16);
        MyInteger myInteger25 = myInteger1.multiply(myInteger24);
        java.lang.String str26 = myInteger1.toString();
        MyInteger myInteger28 = new MyInteger((int) (short) 0);
        boolean boolean30 = myInteger28.equals((java.lang.Object) 1.0f);
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        boolean boolean34 = myInteger32.equals((java.lang.Object) 1.0f);
        MyInteger myInteger36 = new MyInteger((int) (short) 0);
        boolean boolean38 = myInteger36.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = myInteger32.multiply(myInteger36);
        int int40 = myInteger32.getIntValue();
        int int41 = myInteger32.getIntValue();
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger47 = new MyInteger((int) (short) 0);
        boolean boolean49 = myInteger47.equals((java.lang.Object) 1.0f);
        MyInteger myInteger50 = myInteger43.multiply(myInteger47);
        MyInteger myInteger51 = myInteger32.add(myInteger43);
        MyInteger myInteger52 = myInteger28.multiply(myInteger51);
        MyInteger myInteger53 = myInteger1.multiply(myInteger52);
        MyInteger myInteger55 = new MyInteger((int) (short) 0);
        MyInteger myInteger57 = new MyInteger((int) (short) -1);
        java.lang.String str58 = myInteger57.toString();
        MyInteger myInteger59 = myInteger55.add(myInteger57);
        java.lang.String str60 = myInteger55.toString();
        MyInteger myInteger61 = myInteger52.multiply(myInteger55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger57", myInteger1.equals(myInteger57) ? myInteger1.hashCode() == myInteger57.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        boolean boolean10 = myInteger5.equals((java.lang.Object) (byte) -1);
        int int11 = myInteger5.getIntValue();
        MyInteger myInteger13 = new MyInteger((int) (byte) 10);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        int int27 = myInteger19.getIntValue();
        int int28 = myInteger19.getIntValue();
        MyInteger myInteger30 = new MyInteger((int) (short) 0);
        boolean boolean32 = myInteger30.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = myInteger30.multiply(myInteger34);
        MyInteger myInteger38 = myInteger19.add(myInteger30);
        MyInteger myInteger39 = myInteger15.multiply(myInteger38);
        MyInteger myInteger40 = myInteger13.add(myInteger39);
        boolean boolean41 = myInteger5.equals((java.lang.Object) myInteger40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger13", myInteger1.equals(myInteger13) ? myInteger1.hashCode() == myInteger13.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        MyInteger myInteger3 = new MyInteger((int) (short) -1);
        java.lang.String str4 = myInteger3.toString();
        MyInteger myInteger5 = myInteger1.add(myInteger3);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger14 = myInteger7.multiply(myInteger11);
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        MyInteger myInteger17 = myInteger7.multiply(myInteger16);
        java.lang.String str18 = myInteger7.toString();
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger24 = new MyInteger((int) (short) 0);
        boolean boolean26 = myInteger24.equals((java.lang.Object) 1.0f);
        MyInteger myInteger27 = myInteger20.multiply(myInteger24);
        int int28 = myInteger20.getIntValue();
        java.lang.String str29 = myInteger20.toString();
        boolean boolean31 = myInteger20.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger32 = myInteger7.multiply(myInteger20);
        MyInteger myInteger33 = myInteger5.add(myInteger7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger3", myInteger1.equals(myInteger3) ? myInteger1.hashCode() == myInteger3.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        int int2 = myInteger1.getIntValue();
        java.lang.String str3 = myInteger1.toString();
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        MyInteger myInteger15 = new MyInteger((int) '#');
        MyInteger myInteger16 = myInteger5.add(myInteger15);
        MyInteger myInteger17 = myInteger1.multiply(myInteger16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger5 and myInteger15", myInteger5.equals(myInteger15) ? myInteger5.hashCode() == myInteger15.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.add(myInteger9);
        MyInteger myInteger15 = new MyInteger((int) (byte) 10);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger21 = new MyInteger((int) (short) 0);
        boolean boolean23 = myInteger21.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = new MyInteger((int) (short) 0);
        boolean boolean27 = myInteger25.equals((java.lang.Object) 1.0f);
        MyInteger myInteger28 = myInteger21.multiply(myInteger25);
        int int29 = myInteger21.getIntValue();
        int int30 = myInteger21.getIntValue();
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        boolean boolean34 = myInteger32.equals((java.lang.Object) 1.0f);
        MyInteger myInteger36 = new MyInteger((int) (short) 0);
        boolean boolean38 = myInteger36.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = myInteger32.multiply(myInteger36);
        MyInteger myInteger40 = myInteger21.add(myInteger32);
        MyInteger myInteger41 = myInteger17.multiply(myInteger40);
        MyInteger myInteger42 = myInteger15.add(myInteger41);
        MyInteger myInteger43 = myInteger1.multiply(myInteger42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger5 and myInteger15", myInteger5.equals(myInteger15) ? myInteger5.hashCode() == myInteger15.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        MyInteger myInteger4 = new MyInteger((int) (short) 0);
        boolean boolean6 = myInteger4.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger15 = myInteger8.multiply(myInteger12);
        int int16 = myInteger8.getIntValue();
        int int17 = myInteger8.getIntValue();
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        MyInteger myInteger27 = myInteger8.add(myInteger19);
        MyInteger myInteger28 = myInteger4.multiply(myInteger27);
        MyInteger myInteger29 = myInteger1.add(myInteger28);
        MyInteger myInteger31 = new MyInteger(97);
        MyInteger myInteger32 = myInteger28.add(myInteger31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger4", myInteger1.equals(myInteger4) ? myInteger1.hashCode() == myInteger4.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.multiply(myInteger5);
        MyInteger myInteger15 = new MyInteger((int) (short) -1);
        java.lang.String str16 = myInteger15.toString();
        java.lang.String str17 = myInteger15.toString();
        MyInteger myInteger18 = myInteger5.multiply(myInteger15);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger24 = new MyInteger((int) (short) 0);
        boolean boolean26 = myInteger24.equals((java.lang.Object) 1.0f);
        MyInteger myInteger27 = myInteger20.multiply(myInteger24);
        MyInteger myInteger29 = new MyInteger((int) (short) 0);
        MyInteger myInteger30 = myInteger20.multiply(myInteger29);
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        boolean boolean34 = myInteger32.equals((java.lang.Object) 1.0f);
        MyInteger myInteger36 = new MyInteger((int) (short) 0);
        boolean boolean38 = myInteger36.equals((java.lang.Object) 1.0f);
        MyInteger myInteger40 = new MyInteger((int) (short) 0);
        boolean boolean42 = myInteger40.equals((java.lang.Object) 1.0f);
        MyInteger myInteger43 = myInteger36.multiply(myInteger40);
        int int44 = myInteger36.getIntValue();
        int int45 = myInteger36.getIntValue();
        MyInteger myInteger47 = new MyInteger((int) (short) 0);
        boolean boolean49 = myInteger47.equals((java.lang.Object) 1.0f);
        MyInteger myInteger51 = new MyInteger((int) (short) 0);
        boolean boolean53 = myInteger51.equals((java.lang.Object) 1.0f);
        MyInteger myInteger54 = myInteger47.multiply(myInteger51);
        MyInteger myInteger55 = myInteger36.add(myInteger47);
        int int56 = myInteger55.getIntValue();
        boolean boolean57 = myInteger32.equals((java.lang.Object) myInteger55);
        MyInteger myInteger58 = myInteger29.multiply(myInteger32);
        MyInteger myInteger60 = new MyInteger((int) (short) 0);
        boolean boolean62 = myInteger60.equals((java.lang.Object) 1.0f);
        MyInteger myInteger64 = new MyInteger((int) (short) 0);
        boolean boolean66 = myInteger64.equals((java.lang.Object) 1.0f);
        MyInteger myInteger67 = myInteger60.multiply(myInteger64);
        MyInteger myInteger69 = new MyInteger((int) (short) 0);
        MyInteger myInteger70 = myInteger60.multiply(myInteger69);
        java.lang.String str71 = myInteger60.toString();
        MyInteger myInteger73 = new MyInteger((int) (short) 0);
        boolean boolean75 = myInteger73.equals((java.lang.Object) 1.0f);
        MyInteger myInteger77 = new MyInteger((int) (short) 0);
        boolean boolean79 = myInteger77.equals((java.lang.Object) 1.0f);
        MyInteger myInteger80 = myInteger73.multiply(myInteger77);
        int int81 = myInteger73.getIntValue();
        java.lang.String str82 = myInteger73.toString();
        boolean boolean84 = myInteger73.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger85 = myInteger60.multiply(myInteger73);
        MyInteger myInteger86 = myInteger29.add(myInteger73);
        MyInteger myInteger87 = myInteger5.multiply(myInteger73);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger15", myInteger1.equals(myInteger15) ? myInteger1.hashCode() == myInteger15.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        MyInteger myInteger3 = new MyInteger((int) (short) -1);
        java.lang.String str4 = myInteger3.toString();
        MyInteger myInteger5 = myInteger1.add(myInteger3);
        MyInteger myInteger7 = new MyInteger((int) ' ');
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger16 = myInteger9.multiply(myInteger13);
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        MyInteger myInteger19 = myInteger9.multiply(myInteger18);
        java.lang.String str20 = myInteger9.toString();
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = new MyInteger((int) (short) 0);
        boolean boolean28 = myInteger26.equals((java.lang.Object) 1.0f);
        MyInteger myInteger29 = myInteger22.multiply(myInteger26);
        int int30 = myInteger22.getIntValue();
        java.lang.String str31 = myInteger22.toString();
        boolean boolean33 = myInteger22.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger34 = myInteger9.multiply(myInteger22);
        MyInteger myInteger35 = myInteger7.add(myInteger34);
        boolean boolean36 = myInteger3.equals((java.lang.Object) myInteger34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger5", myInteger1.equals(myInteger5) ? myInteger1.hashCode() == myInteger5.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        int int9 = myInteger1.getIntValue();
        MyInteger myInteger11 = new MyInteger((int) (byte) 1);
        MyInteger myInteger12 = myInteger1.multiply(myInteger11);
        int int13 = myInteger12.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger11", myInteger1.equals(myInteger11) ? myInteger1.hashCode() == myInteger11.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        int int2 = myInteger1.getIntValue();
        MyInteger myInteger4 = new MyInteger((int) (short) -1);
        java.lang.String str5 = myInteger4.toString();
        MyInteger myInteger6 = myInteger1.add(myInteger4);
        MyInteger myInteger8 = new MyInteger((int) (short) -1);
        MyInteger myInteger9 = myInteger6.multiply(myInteger8);
        java.lang.String str10 = myInteger8.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger6", myInteger1.equals(myInteger6) ? myInteger1.hashCode() == myInteger6.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        int int2 = myInteger1.getIntValue();
        MyInteger myInteger4 = new MyInteger((int) (short) -1);
        java.lang.String str5 = myInteger4.toString();
        MyInteger myInteger6 = myInteger1.add(myInteger4);
        MyInteger myInteger8 = new MyInteger((int) (short) -1);
        MyInteger myInteger9 = myInteger6.multiply(myInteger8);
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = myInteger15.multiply(myInteger19);
        int int23 = myInteger15.getIntValue();
        int int24 = myInteger15.getIntValue();
        MyInteger myInteger26 = new MyInteger((int) (short) 0);
        boolean boolean28 = myInteger26.equals((java.lang.Object) 1.0f);
        MyInteger myInteger30 = new MyInteger((int) (short) 0);
        boolean boolean32 = myInteger30.equals((java.lang.Object) 1.0f);
        MyInteger myInteger33 = myInteger26.multiply(myInteger30);
        MyInteger myInteger34 = myInteger15.add(myInteger26);
        int int35 = myInteger34.getIntValue();
        boolean boolean36 = myInteger11.equals((java.lang.Object) myInteger34);
        int int37 = myInteger34.getIntValue();
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger46 = myInteger39.multiply(myInteger43);
        int int47 = myInteger43.getIntValue();
        MyInteger myInteger48 = myInteger34.multiply(myInteger43);
        java.lang.String str49 = myInteger43.toString();
        MyInteger myInteger50 = myInteger9.add(myInteger43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger6", myInteger1.equals(myInteger6) ? myInteger1.hashCode() == myInteger6.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        MyInteger myInteger1 = new MyInteger((int) 'a');
        int int2 = myInteger1.getIntValue();
        int int3 = myInteger1.getIntValue();
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        java.lang.String str14 = myInteger5.toString();
        boolean boolean16 = myInteger5.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger17 = myInteger1.multiply(myInteger5);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        int int27 = myInteger19.getIntValue();
        MyInteger myInteger29 = new MyInteger((int) (byte) 1);
        MyInteger myInteger30 = myInteger19.multiply(myInteger29);
        MyInteger myInteger31 = myInteger5.multiply(myInteger29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger9", myInteger1.equals(myInteger9) ? myInteger1.hashCode() == myInteger9.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        MyInteger myInteger1 = new MyInteger((int) (short) 10);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = myInteger3.multiply(myInteger7);
        int int11 = myInteger3.getIntValue();
        MyInteger myInteger13 = new MyInteger((int) (byte) 1);
        MyInteger myInteger14 = myInteger3.multiply(myInteger13);
        MyInteger myInteger15 = myInteger1.multiply(myInteger3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger7 and myInteger13", myInteger7.equals(myInteger13) ? myInteger7.hashCode() == myInteger13.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        int int14 = myInteger5.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        MyInteger myInteger24 = myInteger5.add(myInteger16);
        int int25 = myInteger24.getIntValue();
        boolean boolean26 = myInteger1.equals((java.lang.Object) myInteger24);
        java.lang.String str27 = myInteger1.toString();
        MyInteger myInteger29 = new MyInteger((int) (short) 0);
        MyInteger myInteger31 = new MyInteger((int) (short) -1);
        java.lang.String str32 = myInteger31.toString();
        MyInteger myInteger33 = myInteger29.add(myInteger31);
        java.lang.String str34 = myInteger29.toString();
        MyInteger myInteger35 = myInteger1.multiply(myInteger29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger5 and myInteger31", myInteger5.equals(myInteger31) ? myInteger5.hashCode() == myInteger31.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        MyInteger myInteger4 = new MyInteger((int) (short) 0);
        boolean boolean6 = myInteger4.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger15 = myInteger8.multiply(myInteger12);
        int int16 = myInteger8.getIntValue();
        int int17 = myInteger8.getIntValue();
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        MyInteger myInteger27 = myInteger8.add(myInteger19);
        MyInteger myInteger28 = myInteger4.multiply(myInteger27);
        MyInteger myInteger29 = myInteger1.add(myInteger28);
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger38 = myInteger31.multiply(myInteger35);
        MyInteger myInteger40 = new MyInteger((int) (short) 0);
        MyInteger myInteger41 = myInteger31.multiply(myInteger40);
        boolean boolean42 = myInteger28.equals((java.lang.Object) myInteger40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger4", myInteger1.equals(myInteger4) ? myInteger1.hashCode() == myInteger4.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        java.lang.String str3 = myInteger1.toString();
        int int4 = myInteger1.getIntValue();
        MyInteger myInteger6 = new MyInteger((int) (short) 0);
        boolean boolean8 = myInteger6.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        boolean boolean12 = myInteger10.equals((java.lang.Object) 1.0f);
        MyInteger myInteger13 = myInteger6.multiply(myInteger10);
        int int14 = myInteger6.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (byte) 1);
        MyInteger myInteger17 = myInteger6.multiply(myInteger16);
        MyInteger myInteger18 = myInteger1.add(myInteger6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger10 and myInteger16", myInteger10.equals(myInteger16) ? myInteger10.hashCode() == myInteger16.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        MyInteger myInteger1 = new MyInteger((int) ' ');
        MyInteger myInteger3 = new MyInteger((int) 'a');
        int int4 = myInteger3.getIntValue();
        MyInteger myInteger5 = myInteger1.multiply(myInteger3);
        MyInteger myInteger7 = new MyInteger((int) (short) -1);
        java.lang.String str8 = myInteger7.toString();
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        boolean boolean12 = myInteger10.equals((java.lang.Object) 1.0f);
        MyInteger myInteger14 = new MyInteger((int) (short) 0);
        boolean boolean16 = myInteger14.equals((java.lang.Object) 1.0f);
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger21 = myInteger14.multiply(myInteger18);
        int int22 = myInteger14.getIntValue();
        int int23 = myInteger14.getIntValue();
        MyInteger myInteger25 = new MyInteger((int) (short) 0);
        boolean boolean27 = myInteger25.equals((java.lang.Object) 1.0f);
        MyInteger myInteger29 = new MyInteger((int) (short) 0);
        boolean boolean31 = myInteger29.equals((java.lang.Object) 1.0f);
        MyInteger myInteger32 = myInteger25.multiply(myInteger29);
        MyInteger myInteger33 = myInteger14.add(myInteger25);
        MyInteger myInteger34 = myInteger10.multiply(myInteger33);
        MyInteger myInteger35 = myInteger7.add(myInteger34);
        MyInteger myInteger36 = myInteger1.multiply(myInteger7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger5", myInteger3.equals(myInteger5) ? myInteger3.hashCode() == myInteger5.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.multiply(myInteger5);
        MyInteger myInteger15 = new MyInteger((int) (short) -1);
        java.lang.String str16 = myInteger15.toString();
        java.lang.String str17 = myInteger15.toString();
        MyInteger myInteger18 = myInteger5.multiply(myInteger15);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger24 = new MyInteger((int) (short) 0);
        boolean boolean26 = myInteger24.equals((java.lang.Object) 1.0f);
        MyInteger myInteger28 = new MyInteger((int) (short) 0);
        boolean boolean30 = myInteger28.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = myInteger24.multiply(myInteger28);
        MyInteger myInteger32 = myInteger20.multiply(myInteger24);
        MyInteger myInteger33 = myInteger15.multiply(myInteger20);
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger46 = myInteger39.multiply(myInteger43);
        MyInteger myInteger47 = myInteger35.add(myInteger43);
        MyInteger myInteger49 = new MyInteger((int) (short) 0);
        boolean boolean51 = myInteger49.equals((java.lang.Object) 1.0f);
        MyInteger myInteger53 = new MyInteger((int) (short) 0);
        boolean boolean55 = myInteger53.equals((java.lang.Object) 1.0f);
        MyInteger myInteger57 = new MyInteger((int) (short) 0);
        boolean boolean59 = myInteger57.equals((java.lang.Object) 1.0f);
        MyInteger myInteger60 = myInteger53.multiply(myInteger57);
        int int61 = myInteger53.getIntValue();
        int int62 = myInteger53.getIntValue();
        MyInteger myInteger64 = new MyInteger((int) (short) 0);
        boolean boolean66 = myInteger64.equals((java.lang.Object) 1.0f);
        MyInteger myInteger68 = new MyInteger((int) (short) 0);
        boolean boolean70 = myInteger68.equals((java.lang.Object) 1.0f);
        MyInteger myInteger71 = myInteger64.multiply(myInteger68);
        MyInteger myInteger72 = myInteger53.add(myInteger64);
        int int73 = myInteger72.getIntValue();
        boolean boolean74 = myInteger49.equals((java.lang.Object) myInteger72);
        int int75 = myInteger72.getIntValue();
        MyInteger myInteger77 = new MyInteger((int) (short) 0);
        boolean boolean79 = myInteger77.equals((java.lang.Object) 1.0f);
        MyInteger myInteger81 = new MyInteger((int) (short) 0);
        boolean boolean83 = myInteger81.equals((java.lang.Object) 1.0f);
        MyInteger myInteger84 = myInteger77.multiply(myInteger81);
        int int85 = myInteger81.getIntValue();
        MyInteger myInteger86 = myInteger72.multiply(myInteger81);
        boolean boolean88 = myInteger81.equals((java.lang.Object) "97");
        MyInteger myInteger89 = myInteger43.multiply(myInteger81);
        MyInteger myInteger90 = myInteger33.add(myInteger43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger15", myInteger1.equals(myInteger15) ? myInteger1.hashCode() == myInteger15.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        MyInteger myInteger1 = new MyInteger((int) ' ');
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = myInteger3.multiply(myInteger7);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        MyInteger myInteger13 = myInteger3.multiply(myInteger12);
        java.lang.String str14 = myInteger3.toString();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        int int24 = myInteger16.getIntValue();
        java.lang.String str25 = myInteger16.toString();
        boolean boolean27 = myInteger16.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger28 = myInteger3.multiply(myInteger16);
        MyInteger myInteger29 = myInteger1.add(myInteger28);
        java.lang.Class<?> wildcardClass30 = myInteger28.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger3", myInteger1.equals(myInteger3) ? myInteger1.hashCode() == myInteger3.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        MyInteger myInteger1 = new MyInteger((int) ' ');
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = myInteger3.multiply(myInteger7);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        MyInteger myInteger13 = myInteger3.multiply(myInteger12);
        java.lang.String str14 = myInteger3.toString();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        int int24 = myInteger16.getIntValue();
        java.lang.String str25 = myInteger16.toString();
        boolean boolean27 = myInteger16.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger28 = myInteger3.multiply(myInteger16);
        MyInteger myInteger29 = myInteger1.add(myInteger28);
        java.lang.String str30 = myInteger1.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger29", myInteger3.equals(myInteger29) ? myInteger3.hashCode() == myInteger29.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger14 = myInteger7.multiply(myInteger11);
        int int15 = myInteger7.getIntValue();
        int int16 = myInteger7.getIntValue();
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = myInteger18.multiply(myInteger22);
        MyInteger myInteger26 = myInteger7.add(myInteger18);
        MyInteger myInteger27 = myInteger3.multiply(myInteger26);
        MyInteger myInteger28 = myInteger1.add(myInteger27);
        MyInteger myInteger30 = new MyInteger((int) (short) 0);
        boolean boolean32 = myInteger30.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger38 = new MyInteger((int) (short) 0);
        boolean boolean40 = myInteger38.equals((java.lang.Object) 1.0f);
        MyInteger myInteger41 = myInteger34.multiply(myInteger38);
        int int42 = myInteger34.getIntValue();
        int int43 = myInteger34.getIntValue();
        MyInteger myInteger45 = new MyInteger((int) (short) 0);
        boolean boolean47 = myInteger45.equals((java.lang.Object) 1.0f);
        MyInteger myInteger49 = new MyInteger((int) (short) 0);
        boolean boolean51 = myInteger49.equals((java.lang.Object) 1.0f);
        MyInteger myInteger52 = myInteger45.multiply(myInteger49);
        MyInteger myInteger53 = myInteger34.add(myInteger45);
        MyInteger myInteger54 = myInteger30.multiply(myInteger53);
        MyInteger myInteger56 = new MyInteger((int) (short) 0);
        boolean boolean58 = myInteger56.equals((java.lang.Object) 1.0f);
        MyInteger myInteger60 = new MyInteger((int) (short) 0);
        boolean boolean62 = myInteger60.equals((java.lang.Object) 1.0f);
        MyInteger myInteger63 = myInteger56.multiply(myInteger60);
        java.lang.Class<?> wildcardClass64 = myInteger60.getClass();
        boolean boolean65 = myInteger54.equals((java.lang.Object) wildcardClass64);
        boolean boolean66 = myInteger1.equals((java.lang.Object) wildcardClass64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger28", myInteger3.equals(myInteger28) ? myInteger3.hashCode() == myInteger28.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        MyInteger myInteger3 = new MyInteger((int) (short) -1);
        java.lang.String str4 = myInteger3.toString();
        MyInteger myInteger5 = myInteger1.add(myInteger3);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger14 = myInteger7.multiply(myInteger11);
        int int15 = myInteger7.getIntValue();
        java.lang.String str16 = myInteger7.toString();
        java.lang.String str17 = myInteger7.toString();
        MyInteger myInteger18 = myInteger1.multiply(myInteger7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger11", myInteger3.equals(myInteger11) ? myInteger3.hashCode() == myInteger11.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        MyInteger myInteger1 = new MyInteger((int) ' ');
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = myInteger3.multiply(myInteger7);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        MyInteger myInteger13 = myInteger3.multiply(myInteger12);
        java.lang.String str14 = myInteger3.toString();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        int int24 = myInteger16.getIntValue();
        java.lang.String str25 = myInteger16.toString();
        boolean boolean27 = myInteger16.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger28 = myInteger3.multiply(myInteger16);
        MyInteger myInteger29 = myInteger1.add(myInteger28);
        MyInteger myInteger31 = new MyInteger((int) (byte) 1);
        MyInteger myInteger33 = new MyInteger((int) (short) -1);
        java.lang.String str34 = myInteger33.toString();
        int int35 = myInteger33.getIntValue();
        boolean boolean36 = myInteger31.equals((java.lang.Object) myInteger33);
        boolean boolean37 = myInteger29.equals((java.lang.Object) myInteger31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger3", myInteger1.equals(myInteger3) ? myInteger1.hashCode() == myInteger3.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        MyInteger myInteger1 = new MyInteger(1);
        java.lang.String str2 = myInteger1.toString();
        MyInteger myInteger4 = new MyInteger((int) (short) 0);
        boolean boolean6 = myInteger4.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = myInteger4.multiply(myInteger8);
        boolean boolean13 = myInteger8.equals((java.lang.Object) (byte) -1);
        int int14 = myInteger8.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        int int24 = myInteger16.getIntValue();
        java.lang.String str25 = myInteger16.toString();
        java.lang.String str26 = myInteger16.toString();
        MyInteger myInteger27 = myInteger8.add(myInteger16);
        MyInteger myInteger28 = myInteger1.add(myInteger8);
        int int29 = myInteger8.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger4", myInteger1.equals(myInteger4) ? myInteger1.hashCode() == myInteger4.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        MyInteger myInteger3 = new MyInteger((int) (short) -1);
        java.lang.String str4 = myInteger3.toString();
        MyInteger myInteger5 = myInteger1.add(myInteger3);
        java.lang.String str6 = myInteger3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger5", myInteger1.equals(myInteger5) ? myInteger1.hashCode() == myInteger5.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        int int4 = myInteger1.getIntValue();
        MyInteger myInteger6 = new MyInteger((int) (short) -1);
        java.lang.String str7 = myInteger6.toString();
        boolean boolean9 = myInteger6.equals((java.lang.Object) (-1));
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger18 = myInteger11.multiply(myInteger15);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        MyInteger myInteger21 = myInteger11.multiply(myInteger20);
        java.lang.String str22 = myInteger11.toString();
        MyInteger myInteger24 = new MyInteger((int) (short) 0);
        boolean boolean26 = myInteger24.equals((java.lang.Object) 1.0f);
        MyInteger myInteger28 = new MyInteger((int) (short) 0);
        boolean boolean30 = myInteger28.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = myInteger24.multiply(myInteger28);
        int int32 = myInteger24.getIntValue();
        java.lang.String str33 = myInteger24.toString();
        boolean boolean35 = myInteger24.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger36 = myInteger11.multiply(myInteger24);
        boolean boolean37 = myInteger6.equals((java.lang.Object) myInteger24);
        boolean boolean38 = myInteger1.equals((java.lang.Object) myInteger24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger6 and myInteger11", myInteger6.equals(myInteger11) ? myInteger6.hashCode() == myInteger11.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.multiply(myInteger5);
        MyInteger myInteger15 = new MyInteger((int) (short) -1);
        java.lang.String str16 = myInteger15.toString();
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = new MyInteger((int) (short) 0);
        boolean boolean28 = myInteger26.equals((java.lang.Object) 1.0f);
        MyInteger myInteger29 = myInteger22.multiply(myInteger26);
        int int30 = myInteger22.getIntValue();
        int int31 = myInteger22.getIntValue();
        MyInteger myInteger33 = new MyInteger((int) (short) 0);
        boolean boolean35 = myInteger33.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = new MyInteger((int) (short) 0);
        boolean boolean39 = myInteger37.equals((java.lang.Object) 1.0f);
        MyInteger myInteger40 = myInteger33.multiply(myInteger37);
        MyInteger myInteger41 = myInteger22.add(myInteger33);
        MyInteger myInteger42 = myInteger18.multiply(myInteger41);
        MyInteger myInteger43 = myInteger15.add(myInteger42);
        MyInteger myInteger44 = myInteger5.add(myInteger43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger15", myInteger1.equals(myInteger15) ? myInteger1.hashCode() == myInteger15.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        MyInteger myInteger1 = new MyInteger(0);
        MyInteger myInteger3 = new MyInteger((int) ' ');
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger14 = new MyInteger((int) (short) 0);
        MyInteger myInteger15 = myInteger5.multiply(myInteger14);
        java.lang.String str16 = myInteger5.toString();
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = myInteger18.multiply(myInteger22);
        int int26 = myInteger18.getIntValue();
        java.lang.String str27 = myInteger18.toString();
        boolean boolean29 = myInteger18.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger30 = myInteger5.multiply(myInteger18);
        MyInteger myInteger31 = myInteger3.add(myInteger30);
        MyInteger myInteger32 = myInteger1.multiply(myInteger3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger5 and myInteger31", myInteger5.equals(myInteger31) ? myInteger5.hashCode() == myInteger31.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = myInteger3.multiply(myInteger7);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        MyInteger myInteger13 = myInteger3.multiply(myInteger12);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        int int27 = myInteger19.getIntValue();
        int int28 = myInteger19.getIntValue();
        MyInteger myInteger30 = new MyInteger((int) (short) 0);
        boolean boolean32 = myInteger30.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = myInteger30.multiply(myInteger34);
        MyInteger myInteger38 = myInteger19.add(myInteger30);
        int int39 = myInteger38.getIntValue();
        boolean boolean40 = myInteger15.equals((java.lang.Object) myInteger38);
        MyInteger myInteger41 = myInteger12.multiply(myInteger15);
        MyInteger myInteger42 = myInteger1.multiply(myInteger41);
        MyInteger myInteger44 = new MyInteger((int) (byte) 1);
        MyInteger myInteger46 = new MyInteger((int) (short) -1);
        java.lang.String str47 = myInteger46.toString();
        int int48 = myInteger46.getIntValue();
        boolean boolean49 = myInteger44.equals((java.lang.Object) myInteger46);
        MyInteger myInteger50 = myInteger1.add(myInteger46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger44", myInteger3.equals(myInteger44) ? myInteger3.hashCode() == myInteger44.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        MyInteger myInteger1 = new MyInteger((int) ' ');
        MyInteger myInteger3 = new MyInteger((int) 'a');
        int int4 = myInteger3.getIntValue();
        MyInteger myInteger5 = myInteger1.multiply(myInteger3);
        java.lang.Class<?> wildcardClass6 = myInteger5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger3", myInteger1.equals(myInteger3) ? myInteger1.hashCode() == myInteger3.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        MyInteger myInteger1 = new MyInteger((int) ' ');
        MyInteger myInteger3 = new MyInteger((int) 'a');
        int int4 = myInteger3.getIntValue();
        MyInteger myInteger5 = myInteger1.multiply(myInteger3);
        java.lang.String str6 = myInteger3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger5", myInteger1.equals(myInteger5) ? myInteger1.hashCode() == myInteger5.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.add(myInteger9);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        int int27 = myInteger19.getIntValue();
        int int28 = myInteger19.getIntValue();
        MyInteger myInteger30 = new MyInteger((int) (short) 0);
        boolean boolean32 = myInteger30.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = myInteger30.multiply(myInteger34);
        MyInteger myInteger38 = myInteger19.add(myInteger30);
        int int39 = myInteger38.getIntValue();
        boolean boolean40 = myInteger15.equals((java.lang.Object) myInteger38);
        int int41 = myInteger38.getIntValue();
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger47 = new MyInteger((int) (short) 0);
        boolean boolean49 = myInteger47.equals((java.lang.Object) 1.0f);
        MyInteger myInteger50 = myInteger43.multiply(myInteger47);
        int int51 = myInteger47.getIntValue();
        MyInteger myInteger52 = myInteger38.multiply(myInteger47);
        boolean boolean54 = myInteger47.equals((java.lang.Object) "97");
        MyInteger myInteger55 = myInteger9.multiply(myInteger47);
        MyInteger myInteger57 = new MyInteger((int) (short) -1);
        java.lang.String str58 = myInteger57.toString();
        MyInteger myInteger60 = new MyInteger((int) (short) 0);
        boolean boolean62 = myInteger60.equals((java.lang.Object) 1.0f);
        MyInteger myInteger64 = new MyInteger((int) (short) 0);
        boolean boolean66 = myInteger64.equals((java.lang.Object) 1.0f);
        MyInteger myInteger68 = new MyInteger((int) (short) 0);
        boolean boolean70 = myInteger68.equals((java.lang.Object) 1.0f);
        MyInteger myInteger71 = myInteger64.multiply(myInteger68);
        int int72 = myInteger64.getIntValue();
        int int73 = myInteger64.getIntValue();
        MyInteger myInteger75 = new MyInteger((int) (short) 0);
        boolean boolean77 = myInteger75.equals((java.lang.Object) 1.0f);
        MyInteger myInteger79 = new MyInteger((int) (short) 0);
        boolean boolean81 = myInteger79.equals((java.lang.Object) 1.0f);
        MyInteger myInteger82 = myInteger75.multiply(myInteger79);
        MyInteger myInteger83 = myInteger64.add(myInteger75);
        MyInteger myInteger84 = myInteger60.multiply(myInteger83);
        MyInteger myInteger85 = myInteger57.add(myInteger84);
        MyInteger myInteger86 = myInteger47.multiply(myInteger84);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger57", myInteger1.equals(myInteger57) ? myInteger1.hashCode() == myInteger57.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        java.lang.String str3 = myInteger1.toString();
        int int4 = myInteger1.getIntValue();
        MyInteger myInteger6 = new MyInteger((int) 'a');
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        MyInteger myInteger10 = new MyInteger((int) (short) -1);
        java.lang.String str11 = myInteger10.toString();
        MyInteger myInteger12 = myInteger8.add(myInteger10);
        boolean boolean13 = myInteger6.equals((java.lang.Object) myInteger8);
        boolean boolean14 = myInteger1.equals((java.lang.Object) myInteger8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger6 and myInteger10", myInteger6.equals(myInteger10) ? myInteger6.hashCode() == myInteger10.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        int int9 = myInteger1.getIntValue();
        java.lang.String str10 = myInteger1.toString();
        boolean boolean12 = myInteger1.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger14 = new MyInteger(10);
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        MyInteger myInteger25 = new MyInteger((int) (short) 0);
        MyInteger myInteger26 = myInteger16.multiply(myInteger25);
        java.lang.String str27 = myInteger16.toString();
        MyInteger myInteger29 = new MyInteger((int) (short) 0);
        boolean boolean31 = myInteger29.equals((java.lang.Object) 1.0f);
        MyInteger myInteger33 = new MyInteger((int) (short) 0);
        boolean boolean35 = myInteger33.equals((java.lang.Object) 1.0f);
        MyInteger myInteger36 = myInteger29.multiply(myInteger33);
        int int37 = myInteger29.getIntValue();
        java.lang.String str38 = myInteger29.toString();
        boolean boolean40 = myInteger29.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger41 = myInteger16.multiply(myInteger29);
        MyInteger myInteger42 = myInteger14.add(myInteger16);
        MyInteger myInteger43 = myInteger1.add(myInteger16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger5 and myInteger14", myInteger5.equals(myInteger14) ? myInteger5.hashCode() == myInteger14.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        MyInteger myInteger1 = new MyInteger((int) 'a');
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        MyInteger myInteger5 = new MyInteger((int) (short) -1);
        java.lang.String str6 = myInteger5.toString();
        MyInteger myInteger7 = myInteger3.add(myInteger5);
        boolean boolean8 = myInteger1.equals((java.lang.Object) myInteger3);
        java.lang.Class<?> wildcardClass9 = myInteger3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger5", myInteger1.equals(myInteger5) ? myInteger1.hashCode() == myInteger5.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.add(myInteger9);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        MyInteger myInteger27 = myInteger15.multiply(myInteger19);
        MyInteger myInteger29 = new MyInteger((int) (short) -1);
        java.lang.String str30 = myInteger29.toString();
        java.lang.String str31 = myInteger29.toString();
        MyInteger myInteger32 = myInteger19.multiply(myInteger29);
        MyInteger myInteger33 = myInteger1.multiply(myInteger29);
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger42 = myInteger35.multiply(myInteger39);
        int int43 = myInteger35.getIntValue();
        java.lang.String str44 = myInteger35.toString();
        java.lang.String str45 = myInteger35.toString();
        MyInteger myInteger46 = myInteger29.add(myInteger35);
        int int47 = myInteger35.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger29", myInteger1.equals(myInteger29) ? myInteger1.hashCode() == myInteger29.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        MyInteger myInteger11 = myInteger1.multiply(myInteger10);
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger21 = new MyInteger((int) (short) 0);
        boolean boolean23 = myInteger21.equals((java.lang.Object) 1.0f);
        MyInteger myInteger24 = myInteger17.multiply(myInteger21);
        int int25 = myInteger17.getIntValue();
        int int26 = myInteger17.getIntValue();
        MyInteger myInteger28 = new MyInteger((int) (short) 0);
        boolean boolean30 = myInteger28.equals((java.lang.Object) 1.0f);
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        boolean boolean34 = myInteger32.equals((java.lang.Object) 1.0f);
        MyInteger myInteger35 = myInteger28.multiply(myInteger32);
        MyInteger myInteger36 = myInteger17.add(myInteger28);
        int int37 = myInteger36.getIntValue();
        boolean boolean38 = myInteger13.equals((java.lang.Object) myInteger36);
        MyInteger myInteger39 = myInteger10.multiply(myInteger13);
        MyInteger myInteger41 = new MyInteger(1);
        java.lang.String str42 = myInteger41.toString();
        MyInteger myInteger44 = new MyInteger((int) (short) 0);
        boolean boolean46 = myInteger44.equals((java.lang.Object) 1.0f);
        MyInteger myInteger48 = new MyInteger((int) (short) 0);
        boolean boolean50 = myInteger48.equals((java.lang.Object) 1.0f);
        MyInteger myInteger51 = myInteger44.multiply(myInteger48);
        boolean boolean53 = myInteger48.equals((java.lang.Object) (byte) -1);
        int int54 = myInteger48.getIntValue();
        MyInteger myInteger56 = new MyInteger((int) (short) 0);
        boolean boolean58 = myInteger56.equals((java.lang.Object) 1.0f);
        MyInteger myInteger60 = new MyInteger((int) (short) 0);
        boolean boolean62 = myInteger60.equals((java.lang.Object) 1.0f);
        MyInteger myInteger63 = myInteger56.multiply(myInteger60);
        int int64 = myInteger56.getIntValue();
        java.lang.String str65 = myInteger56.toString();
        java.lang.String str66 = myInteger56.toString();
        MyInteger myInteger67 = myInteger48.add(myInteger56);
        MyInteger myInteger68 = myInteger41.add(myInteger48);
        MyInteger myInteger69 = myInteger10.add(myInteger48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger41", myInteger1.equals(myInteger41) ? myInteger1.hashCode() == myInteger41.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        int int2 = myInteger1.getIntValue();
        java.lang.String str3 = myInteger1.toString();
        MyInteger myInteger5 = new MyInteger((int) (short) -1);
        java.lang.String str6 = myInteger5.toString();
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = myInteger12.multiply(myInteger16);
        int int20 = myInteger12.getIntValue();
        int int21 = myInteger12.getIntValue();
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger30 = myInteger23.multiply(myInteger27);
        MyInteger myInteger31 = myInteger12.add(myInteger23);
        MyInteger myInteger32 = myInteger8.multiply(myInteger31);
        MyInteger myInteger33 = myInteger5.add(myInteger32);
        MyInteger myInteger34 = myInteger1.multiply(myInteger32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger5 and myInteger8", myInteger5.equals(myInteger8) ? myInteger5.hashCode() == myInteger8.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        int int4 = myInteger1.getIntValue();
        java.lang.String str5 = myInteger1.toString();
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger18 = myInteger11.multiply(myInteger15);
        MyInteger myInteger19 = myInteger7.add(myInteger15);
        MyInteger myInteger21 = new MyInteger((int) (short) 0);
        boolean boolean23 = myInteger21.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = new MyInteger((int) (short) 0);
        boolean boolean27 = myInteger25.equals((java.lang.Object) 1.0f);
        MyInteger myInteger29 = new MyInteger((int) (short) 0);
        boolean boolean31 = myInteger29.equals((java.lang.Object) 1.0f);
        MyInteger myInteger32 = myInteger25.multiply(myInteger29);
        MyInteger myInteger33 = myInteger21.multiply(myInteger25);
        MyInteger myInteger35 = new MyInteger((int) (short) -1);
        java.lang.String str36 = myInteger35.toString();
        java.lang.String str37 = myInteger35.toString();
        MyInteger myInteger38 = myInteger25.multiply(myInteger35);
        MyInteger myInteger39 = myInteger7.multiply(myInteger35);
        MyInteger myInteger40 = myInteger1.multiply(myInteger39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger7 and myInteger35", myInteger7.equals(myInteger35) ? myInteger7.hashCode() == myInteger35.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        int int9 = myInteger1.getIntValue();
        MyInteger myInteger11 = new MyInteger((int) (byte) 1);
        MyInteger myInteger12 = myInteger1.multiply(myInteger11);
        MyInteger myInteger14 = new MyInteger((int) (short) 0);
        boolean boolean16 = myInteger14.equals((java.lang.Object) 1.0f);
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger21 = myInteger14.multiply(myInteger18);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        MyInteger myInteger24 = myInteger14.multiply(myInteger23);
        MyInteger myInteger25 = myInteger1.multiply(myInteger23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger5 and myInteger11", myInteger5.equals(myInteger11) ? myInteger5.hashCode() == myInteger11.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.multiply(myInteger5);
        MyInteger myInteger15 = new MyInteger((int) ' ');
        MyInteger myInteger16 = myInteger13.multiply(myInteger15);
        java.lang.Class<?> wildcardClass17 = myInteger13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger15", myInteger1.equals(myInteger15) ? myInteger1.hashCode() == myInteger15.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.multiply(myInteger5);
        MyInteger myInteger15 = new MyInteger((int) (short) -1);
        java.lang.String str16 = myInteger15.toString();
        java.lang.String str17 = myInteger15.toString();
        MyInteger myInteger18 = myInteger5.multiply(myInteger15);
        MyInteger myInteger20 = new MyInteger((int) (byte) 10);
        int int21 = myInteger20.getIntValue();
        java.lang.String str22 = myInteger20.toString();
        int int23 = myInteger20.getIntValue();
        boolean boolean24 = myInteger5.equals((java.lang.Object) int23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger15", myInteger1.equals(myInteger15) ? myInteger1.hashCode() == myInteger15.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.add(myInteger9);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        MyInteger myInteger27 = myInteger15.multiply(myInteger19);
        MyInteger myInteger29 = new MyInteger((int) (short) -1);
        java.lang.String str30 = myInteger29.toString();
        java.lang.String str31 = myInteger29.toString();
        MyInteger myInteger32 = myInteger19.multiply(myInteger29);
        MyInteger myInteger33 = myInteger1.multiply(myInteger29);
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger42 = myInteger35.multiply(myInteger39);
        int int43 = myInteger35.getIntValue();
        java.lang.String str44 = myInteger35.toString();
        java.lang.String str45 = myInteger35.toString();
        MyInteger myInteger46 = myInteger29.add(myInteger35);
        MyInteger myInteger48 = new MyInteger((int) (short) 0);
        boolean boolean50 = myInteger48.equals((java.lang.Object) 1.0f);
        MyInteger myInteger52 = new MyInteger((int) (short) 0);
        boolean boolean54 = myInteger52.equals((java.lang.Object) 1.0f);
        MyInteger myInteger55 = myInteger48.multiply(myInteger52);
        MyInteger myInteger57 = new MyInteger((int) (short) 0);
        MyInteger myInteger58 = myInteger48.multiply(myInteger57);
        java.lang.String str59 = myInteger48.toString();
        boolean boolean60 = myInteger35.equals((java.lang.Object) str59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger29", myInteger1.equals(myInteger29) ? myInteger1.hashCode() == myInteger29.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        boolean boolean10 = myInteger5.equals((java.lang.Object) (byte) -1);
        int int11 = myInteger5.getIntValue();
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = myInteger13.multiply(myInteger17);
        int int21 = myInteger13.getIntValue();
        java.lang.String str22 = myInteger13.toString();
        java.lang.String str23 = myInteger13.toString();
        MyInteger myInteger24 = myInteger5.add(myInteger13);
        MyInteger myInteger26 = new MyInteger((int) ' ');
        MyInteger myInteger28 = new MyInteger((int) 'a');
        int int29 = myInteger28.getIntValue();
        MyInteger myInteger30 = myInteger26.multiply(myInteger28);
        boolean boolean31 = myInteger24.equals((java.lang.Object) myInteger26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger28", myInteger1.equals(myInteger28) ? myInteger1.hashCode() == myInteger28.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        MyInteger myInteger1 = new MyInteger(10);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = myInteger3.multiply(myInteger7);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        MyInteger myInteger13 = myInteger3.multiply(myInteger12);
        java.lang.String str14 = myInteger3.toString();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        int int24 = myInteger16.getIntValue();
        java.lang.String str25 = myInteger16.toString();
        boolean boolean27 = myInteger16.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger28 = myInteger3.multiply(myInteger16);
        MyInteger myInteger29 = myInteger1.add(myInteger3);
        MyInteger myInteger31 = new MyInteger((int) ' ');
        MyInteger myInteger33 = new MyInteger((int) 'a');
        int int34 = myInteger33.getIntValue();
        MyInteger myInteger35 = myInteger31.multiply(myInteger33);
        boolean boolean36 = myInteger1.equals((java.lang.Object) myInteger31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger29", myInteger3.equals(myInteger29) ? myInteger3.hashCode() == myInteger29.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        MyInteger myInteger11 = myInteger1.multiply(myInteger10);
        boolean boolean13 = myInteger1.equals((java.lang.Object) '4');
        MyInteger myInteger15 = new MyInteger((int) (byte) 100);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = myInteger15.multiply(myInteger17);
        boolean boolean21 = myInteger1.equals((java.lang.Object) myInteger20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger5 and myInteger15", myInteger5.equals(myInteger15) ? myInteger5.hashCode() == myInteger15.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        MyInteger myInteger1 = new MyInteger((int) 'a');
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        MyInteger myInteger5 = new MyInteger((int) (short) -1);
        java.lang.String str6 = myInteger5.toString();
        MyInteger myInteger7 = myInteger3.add(myInteger5);
        boolean boolean8 = myInteger1.equals((java.lang.Object) myInteger3);
        MyInteger myInteger10 = new MyInteger((int) (short) -1);
        java.lang.String str11 = myInteger10.toString();
        java.lang.String str12 = myInteger10.toString();
        int int13 = myInteger10.getIntValue();
        MyInteger myInteger15 = new MyInteger(1);
        java.lang.String str16 = myInteger15.toString();
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = new MyInteger((int) (short) 0);
        boolean boolean28 = myInteger26.equals((java.lang.Object) 1.0f);
        MyInteger myInteger29 = myInteger22.multiply(myInteger26);
        int int30 = myInteger22.getIntValue();
        int int31 = myInteger22.getIntValue();
        MyInteger myInteger33 = new MyInteger((int) (short) 0);
        boolean boolean35 = myInteger33.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = new MyInteger((int) (short) 0);
        boolean boolean39 = myInteger37.equals((java.lang.Object) 1.0f);
        MyInteger myInteger40 = myInteger33.multiply(myInteger37);
        MyInteger myInteger41 = myInteger22.add(myInteger33);
        MyInteger myInteger42 = myInteger18.multiply(myInteger41);
        java.lang.String str43 = myInteger18.toString();
        MyInteger myInteger45 = new MyInteger((int) (short) 0);
        boolean boolean47 = myInteger45.equals((java.lang.Object) 1.0f);
        MyInteger myInteger49 = new MyInteger((int) (short) 0);
        boolean boolean51 = myInteger49.equals((java.lang.Object) 1.0f);
        MyInteger myInteger53 = new MyInteger((int) (short) 0);
        boolean boolean55 = myInteger53.equals((java.lang.Object) 1.0f);
        MyInteger myInteger56 = myInteger49.multiply(myInteger53);
        int int57 = myInteger49.getIntValue();
        int int58 = myInteger49.getIntValue();
        MyInteger myInteger60 = new MyInteger((int) (short) 0);
        boolean boolean62 = myInteger60.equals((java.lang.Object) 1.0f);
        MyInteger myInteger64 = new MyInteger((int) (short) 0);
        boolean boolean66 = myInteger64.equals((java.lang.Object) 1.0f);
        MyInteger myInteger67 = myInteger60.multiply(myInteger64);
        MyInteger myInteger68 = myInteger49.add(myInteger60);
        MyInteger myInteger69 = myInteger45.multiply(myInteger68);
        MyInteger myInteger70 = myInteger18.multiply(myInteger69);
        MyInteger myInteger71 = myInteger15.multiply(myInteger70);
        MyInteger myInteger72 = myInteger10.add(myInteger15);
        MyInteger myInteger73 = myInteger1.multiply(myInteger10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger5", myInteger3.equals(myInteger5) ? myInteger3.hashCode() == myInteger5.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        int int9 = myInteger1.getIntValue();
        int int10 = myInteger1.getIntValue();
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = myInteger12.multiply(myInteger16);
        MyInteger myInteger20 = myInteger1.add(myInteger12);
        MyInteger myInteger22 = new MyInteger((int) (short) -1);
        java.lang.String str23 = myInteger22.toString();
        boolean boolean25 = myInteger22.equals((java.lang.Object) (-1));
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = myInteger27.multiply(myInteger31);
        MyInteger myInteger36 = new MyInteger((int) (short) 0);
        MyInteger myInteger37 = myInteger27.multiply(myInteger36);
        java.lang.String str38 = myInteger27.toString();
        MyInteger myInteger40 = new MyInteger((int) (short) 0);
        boolean boolean42 = myInteger40.equals((java.lang.Object) 1.0f);
        MyInteger myInteger44 = new MyInteger((int) (short) 0);
        boolean boolean46 = myInteger44.equals((java.lang.Object) 1.0f);
        MyInteger myInteger47 = myInteger40.multiply(myInteger44);
        int int48 = myInteger40.getIntValue();
        java.lang.String str49 = myInteger40.toString();
        boolean boolean51 = myInteger40.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger52 = myInteger27.multiply(myInteger40);
        boolean boolean53 = myInteger22.equals((java.lang.Object) myInteger40);
        int int54 = myInteger22.getIntValue();
        MyInteger myInteger56 = new MyInteger((int) (short) 0);
        boolean boolean58 = myInteger56.equals((java.lang.Object) 1.0f);
        MyInteger myInteger60 = new MyInteger((int) (short) 0);
        boolean boolean62 = myInteger60.equals((java.lang.Object) 1.0f);
        MyInteger myInteger64 = new MyInteger((int) (short) 0);
        boolean boolean66 = myInteger64.equals((java.lang.Object) 1.0f);
        MyInteger myInteger67 = myInteger60.multiply(myInteger64);
        MyInteger myInteger68 = myInteger56.add(myInteger64);
        int int69 = myInteger68.getIntValue();
        MyInteger myInteger70 = myInteger22.add(myInteger68);
        MyInteger myInteger71 = myInteger1.multiply(myInteger22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger5 and myInteger70", myInteger5.equals(myInteger70) ? myInteger5.hashCode() == myInteger70.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.multiply(myInteger5);
        MyInteger myInteger15 = new MyInteger((int) ' ');
        MyInteger myInteger16 = myInteger13.multiply(myInteger15);
        MyInteger myInteger18 = new MyInteger((int) (short) -1);
        java.lang.String str19 = myInteger18.toString();
        java.lang.String str20 = myInteger18.toString();
        int int21 = myInteger18.getIntValue();
        MyInteger myInteger22 = myInteger16.multiply(myInteger18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger15", myInteger1.equals(myInteger15) ? myInteger1.hashCode() == myInteger15.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.add(myInteger9);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        MyInteger myInteger27 = myInteger15.multiply(myInteger19);
        MyInteger myInteger29 = new MyInteger((int) (short) -1);
        java.lang.String str30 = myInteger29.toString();
        java.lang.String str31 = myInteger29.toString();
        MyInteger myInteger32 = myInteger19.multiply(myInteger29);
        MyInteger myInteger33 = myInteger1.multiply(myInteger29);
        MyInteger myInteger35 = new MyInteger((int) (short) 100);
        MyInteger myInteger36 = myInteger33.add(myInteger35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger29", myInteger1.equals(myInteger29) ? myInteger1.hashCode() == myInteger29.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        MyInteger myInteger1 = new MyInteger((int) ' ');
        MyInteger myInteger3 = new MyInteger((int) 'a');
        int int4 = myInteger3.getIntValue();
        MyInteger myInteger5 = myInteger1.multiply(myInteger3);
        java.lang.Class<?> wildcardClass6 = myInteger1.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger5", myInteger3.equals(myInteger5) ? myInteger3.hashCode() == myInteger5.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        MyInteger myInteger1 = new MyInteger((int) (byte) -1);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger14 = myInteger7.multiply(myInteger11);
        MyInteger myInteger15 = myInteger3.add(myInteger11);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger21 = new MyInteger((int) (short) 0);
        boolean boolean23 = myInteger21.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = new MyInteger((int) (short) 0);
        boolean boolean27 = myInteger25.equals((java.lang.Object) 1.0f);
        MyInteger myInteger28 = myInteger21.multiply(myInteger25);
        MyInteger myInteger29 = myInteger17.multiply(myInteger21);
        MyInteger myInteger31 = new MyInteger((int) (short) -1);
        java.lang.String str32 = myInteger31.toString();
        java.lang.String str33 = myInteger31.toString();
        MyInteger myInteger34 = myInteger21.multiply(myInteger31);
        MyInteger myInteger35 = myInteger3.multiply(myInteger31);
        boolean boolean36 = myInteger1.equals((java.lang.Object) myInteger3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger7 and myInteger31", myInteger7.equals(myInteger31) ? myInteger7.hashCode() == myInteger31.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger14 = myInteger7.multiply(myInteger11);
        int int15 = myInteger7.getIntValue();
        int int16 = myInteger7.getIntValue();
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = myInteger18.multiply(myInteger22);
        MyInteger myInteger26 = myInteger7.add(myInteger18);
        MyInteger myInteger27 = myInteger3.multiply(myInteger26);
        MyInteger myInteger28 = myInteger1.add(myInteger27);
        MyInteger myInteger30 = new MyInteger((int) (short) 10);
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        boolean boolean34 = myInteger32.equals((java.lang.Object) 1.0f);
        MyInteger myInteger36 = new MyInteger((int) (short) 0);
        boolean boolean38 = myInteger36.equals((java.lang.Object) 1.0f);
        MyInteger myInteger40 = new MyInteger((int) (short) 0);
        boolean boolean42 = myInteger40.equals((java.lang.Object) 1.0f);
        MyInteger myInteger43 = myInteger36.multiply(myInteger40);
        MyInteger myInteger44 = myInteger32.multiply(myInteger36);
        boolean boolean45 = myInteger30.equals((java.lang.Object) myInteger32);
        MyInteger myInteger46 = myInteger1.multiply(myInteger30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger28", myInteger3.equals(myInteger28) ? myInteger3.hashCode() == myInteger28.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        MyInteger myInteger1 = new MyInteger((int) '4');
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = myInteger3.multiply(myInteger7);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        MyInteger myInteger13 = myInteger3.multiply(myInteger12);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        int int27 = myInteger19.getIntValue();
        int int28 = myInteger19.getIntValue();
        MyInteger myInteger30 = new MyInteger((int) (short) 0);
        boolean boolean32 = myInteger30.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = myInteger30.multiply(myInteger34);
        MyInteger myInteger38 = myInteger19.add(myInteger30);
        int int39 = myInteger38.getIntValue();
        boolean boolean40 = myInteger15.equals((java.lang.Object) myInteger38);
        MyInteger myInteger41 = myInteger12.multiply(myInteger15);
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger47 = new MyInteger((int) (short) 0);
        boolean boolean49 = myInteger47.equals((java.lang.Object) 1.0f);
        MyInteger myInteger50 = myInteger43.multiply(myInteger47);
        MyInteger myInteger52 = new MyInteger((int) (short) 0);
        MyInteger myInteger53 = myInteger43.multiply(myInteger52);
        java.lang.String str54 = myInteger43.toString();
        MyInteger myInteger56 = new MyInteger((int) (short) 0);
        boolean boolean58 = myInteger56.equals((java.lang.Object) 1.0f);
        MyInteger myInteger60 = new MyInteger((int) (short) 0);
        boolean boolean62 = myInteger60.equals((java.lang.Object) 1.0f);
        MyInteger myInteger63 = myInteger56.multiply(myInteger60);
        int int64 = myInteger56.getIntValue();
        java.lang.String str65 = myInteger56.toString();
        boolean boolean67 = myInteger56.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger68 = myInteger43.multiply(myInteger56);
        MyInteger myInteger69 = myInteger12.add(myInteger56);
        MyInteger myInteger70 = myInteger1.add(myInteger56);
        MyInteger myInteger72 = new MyInteger((int) ' ');
        MyInteger myInteger74 = new MyInteger((int) 'a');
        int int75 = myInteger74.getIntValue();
        MyInteger myInteger76 = myInteger72.multiply(myInteger74);
        boolean boolean77 = myInteger1.equals((java.lang.Object) myInteger72);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger70", myInteger3.equals(myInteger70) ? myInteger3.hashCode() == myInteger70.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        MyInteger myInteger1 = new MyInteger((int) ' ');
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = myInteger3.multiply(myInteger7);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        MyInteger myInteger13 = myInteger3.multiply(myInteger12);
        java.lang.String str14 = myInteger3.toString();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        int int24 = myInteger16.getIntValue();
        java.lang.String str25 = myInteger16.toString();
        boolean boolean27 = myInteger16.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger28 = myInteger3.multiply(myInteger16);
        MyInteger myInteger29 = myInteger1.add(myInteger28);
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger42 = myInteger35.multiply(myInteger39);
        MyInteger myInteger43 = myInteger31.multiply(myInteger35);
        MyInteger myInteger45 = new MyInteger((int) (short) -1);
        java.lang.String str46 = myInteger45.toString();
        java.lang.String str47 = myInteger45.toString();
        MyInteger myInteger48 = myInteger35.multiply(myInteger45);
        boolean boolean49 = myInteger1.equals((java.lang.Object) myInteger35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger29", myInteger3.equals(myInteger29) ? myInteger3.hashCode() == myInteger29.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        MyInteger myInteger1 = new MyInteger(10);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = myInteger3.multiply(myInteger7);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        MyInteger myInteger13 = myInteger3.multiply(myInteger12);
        java.lang.String str14 = myInteger3.toString();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        int int24 = myInteger16.getIntValue();
        java.lang.String str25 = myInteger16.toString();
        boolean boolean27 = myInteger16.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger28 = myInteger3.multiply(myInteger16);
        MyInteger myInteger29 = myInteger1.add(myInteger3);
        java.lang.String str30 = myInteger1.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger29", myInteger3.equals(myInteger29) ? myInteger3.hashCode() == myInteger29.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        boolean boolean4 = myInteger1.equals((java.lang.Object) (-1));
        MyInteger myInteger6 = new MyInteger((int) (short) 0);
        boolean boolean8 = myInteger6.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        boolean boolean12 = myInteger10.equals((java.lang.Object) 1.0f);
        MyInteger myInteger13 = myInteger6.multiply(myInteger10);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        MyInteger myInteger16 = myInteger6.multiply(myInteger15);
        java.lang.String str17 = myInteger6.toString();
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        int int27 = myInteger19.getIntValue();
        java.lang.String str28 = myInteger19.toString();
        boolean boolean30 = myInteger19.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger31 = myInteger6.multiply(myInteger19);
        boolean boolean32 = myInteger1.equals((java.lang.Object) myInteger19);
        int int33 = myInteger1.getIntValue();
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger46 = myInteger39.multiply(myInteger43);
        MyInteger myInteger47 = myInteger35.add(myInteger43);
        int int48 = myInteger47.getIntValue();
        MyInteger myInteger49 = myInteger1.add(myInteger47);
        int int50 = myInteger49.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger6", myInteger1.equals(myInteger6) ? myInteger1.hashCode() == myInteger6.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        int int2 = myInteger1.getIntValue();
        int int3 = myInteger1.getIntValue();
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger14 = new MyInteger((int) (short) 0);
        MyInteger myInteger15 = myInteger5.multiply(myInteger14);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger21 = new MyInteger((int) (short) 0);
        boolean boolean23 = myInteger21.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = new MyInteger((int) (short) 0);
        boolean boolean27 = myInteger25.equals((java.lang.Object) 1.0f);
        MyInteger myInteger28 = myInteger21.multiply(myInteger25);
        int int29 = myInteger21.getIntValue();
        int int30 = myInteger21.getIntValue();
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        boolean boolean34 = myInteger32.equals((java.lang.Object) 1.0f);
        MyInteger myInteger36 = new MyInteger((int) (short) 0);
        boolean boolean38 = myInteger36.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = myInteger32.multiply(myInteger36);
        MyInteger myInteger40 = myInteger21.add(myInteger32);
        int int41 = myInteger40.getIntValue();
        boolean boolean42 = myInteger17.equals((java.lang.Object) myInteger40);
        MyInteger myInteger43 = myInteger14.multiply(myInteger17);
        MyInteger myInteger45 = new MyInteger((int) (short) 0);
        boolean boolean47 = myInteger45.equals((java.lang.Object) 1.0f);
        MyInteger myInteger49 = new MyInteger((int) (short) 0);
        boolean boolean51 = myInteger49.equals((java.lang.Object) 1.0f);
        MyInteger myInteger52 = myInteger45.multiply(myInteger49);
        MyInteger myInteger54 = new MyInteger((int) (short) 0);
        MyInteger myInteger55 = myInteger45.multiply(myInteger54);
        java.lang.String str56 = myInteger45.toString();
        MyInteger myInteger58 = new MyInteger((int) (short) 0);
        boolean boolean60 = myInteger58.equals((java.lang.Object) 1.0f);
        MyInteger myInteger62 = new MyInteger((int) (short) 0);
        boolean boolean64 = myInteger62.equals((java.lang.Object) 1.0f);
        MyInteger myInteger65 = myInteger58.multiply(myInteger62);
        int int66 = myInteger58.getIntValue();
        java.lang.String str67 = myInteger58.toString();
        boolean boolean69 = myInteger58.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger70 = myInteger45.multiply(myInteger58);
        MyInteger myInteger71 = myInteger14.add(myInteger58);
        MyInteger myInteger72 = myInteger1.add(myInteger58);
        int int73 = myInteger72.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger5", myInteger1.equals(myInteger5) ? myInteger1.hashCode() == myInteger5.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        boolean boolean12 = myInteger10.equals((java.lang.Object) 1.0f);
        MyInteger myInteger14 = new MyInteger((int) (short) 0);
        boolean boolean16 = myInteger14.equals((java.lang.Object) 1.0f);
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger21 = myInteger14.multiply(myInteger18);
        MyInteger myInteger22 = myInteger10.multiply(myInteger14);
        java.lang.Class<?> wildcardClass23 = myInteger10.getClass();
        boolean boolean24 = myInteger1.equals((java.lang.Object) wildcardClass23);
        int int25 = myInteger1.getIntValue();
        MyInteger myInteger27 = new MyInteger((int) (short) -1);
        java.lang.String str28 = myInteger27.toString();
        java.lang.String str29 = myInteger27.toString();
        int int30 = myInteger27.getIntValue();
        MyInteger myInteger32 = new MyInteger(1);
        java.lang.String str33 = myInteger32.toString();
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger46 = myInteger39.multiply(myInteger43);
        int int47 = myInteger39.getIntValue();
        int int48 = myInteger39.getIntValue();
        MyInteger myInteger50 = new MyInteger((int) (short) 0);
        boolean boolean52 = myInteger50.equals((java.lang.Object) 1.0f);
        MyInteger myInteger54 = new MyInteger((int) (short) 0);
        boolean boolean56 = myInteger54.equals((java.lang.Object) 1.0f);
        MyInteger myInteger57 = myInteger50.multiply(myInteger54);
        MyInteger myInteger58 = myInteger39.add(myInteger50);
        MyInteger myInteger59 = myInteger35.multiply(myInteger58);
        java.lang.String str60 = myInteger35.toString();
        MyInteger myInteger62 = new MyInteger((int) (short) 0);
        boolean boolean64 = myInteger62.equals((java.lang.Object) 1.0f);
        MyInteger myInteger66 = new MyInteger((int) (short) 0);
        boolean boolean68 = myInteger66.equals((java.lang.Object) 1.0f);
        MyInteger myInteger70 = new MyInteger((int) (short) 0);
        boolean boolean72 = myInteger70.equals((java.lang.Object) 1.0f);
        MyInteger myInteger73 = myInteger66.multiply(myInteger70);
        int int74 = myInteger66.getIntValue();
        int int75 = myInteger66.getIntValue();
        MyInteger myInteger77 = new MyInteger((int) (short) 0);
        boolean boolean79 = myInteger77.equals((java.lang.Object) 1.0f);
        MyInteger myInteger81 = new MyInteger((int) (short) 0);
        boolean boolean83 = myInteger81.equals((java.lang.Object) 1.0f);
        MyInteger myInteger84 = myInteger77.multiply(myInteger81);
        MyInteger myInteger85 = myInteger66.add(myInteger77);
        MyInteger myInteger86 = myInteger62.multiply(myInteger85);
        MyInteger myInteger87 = myInteger35.multiply(myInteger86);
        MyInteger myInteger88 = myInteger32.multiply(myInteger87);
        MyInteger myInteger89 = myInteger27.add(myInteger32);
        MyInteger myInteger90 = myInteger1.multiply(myInteger32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger5 and myInteger27", myInteger5.equals(myInteger27) ? myInteger5.hashCode() == myInteger27.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        int int2 = myInteger1.getIntValue();
        MyInteger myInteger4 = new MyInteger((int) (short) -1);
        java.lang.String str5 = myInteger4.toString();
        MyInteger myInteger6 = myInteger1.add(myInteger4);
        MyInteger myInteger8 = new MyInteger((int) (short) -1);
        MyInteger myInteger9 = myInteger6.multiply(myInteger8);
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger18 = myInteger11.multiply(myInteger15);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        MyInteger myInteger21 = myInteger11.multiply(myInteger20);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = myInteger27.multiply(myInteger31);
        int int35 = myInteger27.getIntValue();
        int int36 = myInteger27.getIntValue();
        MyInteger myInteger38 = new MyInteger((int) (short) 0);
        boolean boolean40 = myInteger38.equals((java.lang.Object) 1.0f);
        MyInteger myInteger42 = new MyInteger((int) (short) 0);
        boolean boolean44 = myInteger42.equals((java.lang.Object) 1.0f);
        MyInteger myInteger45 = myInteger38.multiply(myInteger42);
        MyInteger myInteger46 = myInteger27.add(myInteger38);
        int int47 = myInteger46.getIntValue();
        boolean boolean48 = myInteger23.equals((java.lang.Object) myInteger46);
        MyInteger myInteger49 = myInteger20.multiply(myInteger23);
        int int50 = myInteger49.getIntValue();
        MyInteger myInteger51 = myInteger9.multiply(myInteger49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger6", myInteger1.equals(myInteger6) ? myInteger1.hashCode() == myInteger6.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        MyInteger myInteger1 = new MyInteger(1);
        java.lang.String str2 = myInteger1.toString();
        MyInteger myInteger4 = new MyInteger((int) (short) 0);
        boolean boolean6 = myInteger4.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = myInteger4.multiply(myInteger8);
        boolean boolean13 = myInteger8.equals((java.lang.Object) (byte) -1);
        int int14 = myInteger8.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        int int24 = myInteger16.getIntValue();
        java.lang.String str25 = myInteger16.toString();
        java.lang.String str26 = myInteger16.toString();
        MyInteger myInteger27 = myInteger8.add(myInteger16);
        MyInteger myInteger28 = myInteger1.add(myInteger8);
        MyInteger myInteger30 = new MyInteger((int) (short) 0);
        boolean boolean32 = myInteger30.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger38 = new MyInteger((int) (short) 0);
        boolean boolean40 = myInteger38.equals((java.lang.Object) 1.0f);
        MyInteger myInteger41 = myInteger34.multiply(myInteger38);
        MyInteger myInteger42 = myInteger30.multiply(myInteger34);
        MyInteger myInteger44 = new MyInteger((int) ' ');
        MyInteger myInteger45 = myInteger42.multiply(myInteger44);
        MyInteger myInteger46 = myInteger8.multiply(myInteger45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger4", myInteger1.equals(myInteger4) ? myInteger1.hashCode() == myInteger4.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        int int4 = myInteger1.getIntValue();
        MyInteger myInteger6 = new MyInteger((int) (short) -1);
        int int7 = myInteger6.getIntValue();
        MyInteger myInteger9 = new MyInteger((int) (short) -1);
        java.lang.String str10 = myInteger9.toString();
        MyInteger myInteger11 = myInteger6.add(myInteger9);
        int int12 = myInteger11.getIntValue();
        boolean boolean13 = myInteger1.equals((java.lang.Object) int12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger6 and myInteger11", myInteger6.equals(myInteger11) ? myInteger6.hashCode() == myInteger11.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        MyInteger myInteger3 = new MyInteger((int) (short) -1);
        java.lang.String str4 = myInteger3.toString();
        MyInteger myInteger5 = myInteger1.add(myInteger3);
        int int6 = myInteger3.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger5", myInteger1.equals(myInteger5) ? myInteger1.hashCode() == myInteger5.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        MyInteger myInteger4 = new MyInteger((int) (short) 0);
        boolean boolean6 = myInteger4.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = myInteger4.multiply(myInteger8);
        int int12 = myInteger8.getIntValue();
        MyInteger myInteger13 = myInteger1.multiply(myInteger8);
        java.lang.String str14 = myInteger8.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger4", myInteger1.equals(myInteger4) ? myInteger1.hashCode() == myInteger4.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        int int2 = myInteger1.getIntValue();
        java.lang.String str3 = myInteger1.toString();
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger16 = myInteger9.multiply(myInteger13);
        MyInteger myInteger17 = myInteger5.multiply(myInteger9);
        MyInteger myInteger18 = myInteger1.multiply(myInteger17);
        java.lang.String str19 = myInteger17.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger5", myInteger1.equals(myInteger5) ? myInteger1.hashCode() == myInteger5.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        MyInteger myInteger1 = new MyInteger((int) '4');
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = myInteger3.multiply(myInteger7);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        MyInteger myInteger13 = myInteger3.multiply(myInteger12);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        int int27 = myInteger19.getIntValue();
        int int28 = myInteger19.getIntValue();
        MyInteger myInteger30 = new MyInteger((int) (short) 0);
        boolean boolean32 = myInteger30.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = myInteger30.multiply(myInteger34);
        MyInteger myInteger38 = myInteger19.add(myInteger30);
        int int39 = myInteger38.getIntValue();
        boolean boolean40 = myInteger15.equals((java.lang.Object) myInteger38);
        MyInteger myInteger41 = myInteger12.multiply(myInteger15);
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger47 = new MyInteger((int) (short) 0);
        boolean boolean49 = myInteger47.equals((java.lang.Object) 1.0f);
        MyInteger myInteger50 = myInteger43.multiply(myInteger47);
        MyInteger myInteger52 = new MyInteger((int) (short) 0);
        MyInteger myInteger53 = myInteger43.multiply(myInteger52);
        java.lang.String str54 = myInteger43.toString();
        MyInteger myInteger56 = new MyInteger((int) (short) 0);
        boolean boolean58 = myInteger56.equals((java.lang.Object) 1.0f);
        MyInteger myInteger60 = new MyInteger((int) (short) 0);
        boolean boolean62 = myInteger60.equals((java.lang.Object) 1.0f);
        MyInteger myInteger63 = myInteger56.multiply(myInteger60);
        int int64 = myInteger56.getIntValue();
        java.lang.String str65 = myInteger56.toString();
        boolean boolean67 = myInteger56.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger68 = myInteger43.multiply(myInteger56);
        MyInteger myInteger69 = myInteger12.add(myInteger56);
        MyInteger myInteger70 = myInteger1.add(myInteger56);
        java.lang.String str71 = myInteger1.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger70", myInteger3.equals(myInteger70) ? myInteger3.hashCode() == myInteger70.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        MyInteger myInteger1 = new MyInteger(10);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = myInteger3.multiply(myInteger7);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        MyInteger myInteger13 = myInteger3.multiply(myInteger12);
        java.lang.String str14 = myInteger3.toString();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        int int24 = myInteger16.getIntValue();
        java.lang.String str25 = myInteger16.toString();
        boolean boolean27 = myInteger16.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger28 = myInteger3.multiply(myInteger16);
        MyInteger myInteger29 = myInteger1.add(myInteger3);
        java.lang.Class<?> wildcardClass30 = myInteger1.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger29", myInteger3.equals(myInteger29) ? myInteger3.hashCode() == myInteger29.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        MyInteger myInteger1 = new MyInteger((int) 'a');
        int int2 = myInteger1.getIntValue();
        int int3 = myInteger1.getIntValue();
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        java.lang.String str14 = myInteger5.toString();
        boolean boolean16 = myInteger5.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger17 = myInteger1.multiply(myInteger5);
        MyInteger myInteger19 = new MyInteger((int) ' ');
        boolean boolean20 = myInteger17.equals((java.lang.Object) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger5", myInteger1.equals(myInteger5) ? myInteger1.hashCode() == myInteger5.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        MyInteger myInteger1 = new MyInteger((int) ' ');
        MyInteger myInteger3 = new MyInteger((int) 'a');
        int int4 = myInteger3.getIntValue();
        MyInteger myInteger5 = myInteger1.multiply(myInteger3);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger14 = myInteger7.multiply(myInteger11);
        boolean boolean16 = myInteger11.equals((java.lang.Object) (byte) -1);
        int int17 = myInteger11.getIntValue();
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        int int27 = myInteger19.getIntValue();
        java.lang.String str28 = myInteger19.toString();
        java.lang.String str29 = myInteger19.toString();
        MyInteger myInteger30 = myInteger11.add(myInteger19);
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        boolean boolean34 = myInteger32.equals((java.lang.Object) 1.0f);
        int int35 = myInteger32.getIntValue();
        java.lang.String str36 = myInteger32.toString();
        MyInteger myInteger37 = myInteger11.add(myInteger32);
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger46 = myInteger39.multiply(myInteger43);
        MyInteger myInteger48 = new MyInteger((int) (short) 0);
        MyInteger myInteger49 = myInteger39.multiply(myInteger48);
        int int50 = myInteger39.getIntValue();
        MyInteger myInteger51 = myInteger11.multiply(myInteger39);
        MyInteger myInteger53 = new MyInteger((int) (short) 0);
        boolean boolean55 = myInteger53.equals((java.lang.Object) 1.0f);
        MyInteger myInteger57 = new MyInteger((int) (short) 0);
        boolean boolean59 = myInteger57.equals((java.lang.Object) 1.0f);
        MyInteger myInteger60 = myInteger53.multiply(myInteger57);
        MyInteger myInteger62 = new MyInteger((int) (short) 0);
        MyInteger myInteger63 = myInteger53.multiply(myInteger62);
        java.lang.String str64 = myInteger53.toString();
        MyInteger myInteger66 = new MyInteger((int) (short) 0);
        boolean boolean68 = myInteger66.equals((java.lang.Object) 1.0f);
        MyInteger myInteger70 = new MyInteger((int) (short) 0);
        boolean boolean72 = myInteger70.equals((java.lang.Object) 1.0f);
        MyInteger myInteger73 = myInteger66.multiply(myInteger70);
        int int74 = myInteger66.getIntValue();
        java.lang.String str75 = myInteger66.toString();
        boolean boolean77 = myInteger66.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger78 = myInteger53.multiply(myInteger66);
        java.lang.String str79 = myInteger78.toString();
        MyInteger myInteger80 = myInteger51.add(myInteger78);
        MyInteger myInteger81 = myInteger1.multiply(myInteger78);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger5", myInteger3.equals(myInteger5) ? myInteger3.hashCode() == myInteger5.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        MyInteger myInteger1 = new MyInteger((int) 'a');
        java.lang.String str2 = myInteger1.toString();
        MyInteger myInteger4 = new MyInteger((int) (short) 0);
        boolean boolean6 = myInteger4.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = myInteger4.multiply(myInteger8);
        int int12 = myInteger4.getIntValue();
        MyInteger myInteger14 = new MyInteger((int) (byte) 1);
        MyInteger myInteger15 = myInteger4.multiply(myInteger14);
        MyInteger myInteger16 = myInteger1.multiply(myInteger14);
        java.lang.String str17 = myInteger16.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger4", myInteger1.equals(myInteger4) ? myInteger1.hashCode() == myInteger4.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        int int14 = myInteger5.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        MyInteger myInteger24 = myInteger5.add(myInteger16);
        int int25 = myInteger24.getIntValue();
        boolean boolean26 = myInteger1.equals((java.lang.Object) myInteger24);
        java.lang.String str27 = myInteger1.toString();
        MyInteger myInteger29 = new MyInteger((int) (byte) 10);
        MyInteger myInteger30 = myInteger1.add(myInteger29);
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        boolean boolean34 = myInteger32.equals((java.lang.Object) 1.0f);
        MyInteger myInteger36 = new MyInteger((int) (short) 0);
        boolean boolean38 = myInteger36.equals((java.lang.Object) 1.0f);
        MyInteger myInteger40 = new MyInteger((int) (short) 0);
        boolean boolean42 = myInteger40.equals((java.lang.Object) 1.0f);
        MyInteger myInteger43 = myInteger36.multiply(myInteger40);
        int int44 = myInteger36.getIntValue();
        int int45 = myInteger36.getIntValue();
        MyInteger myInteger47 = new MyInteger((int) (short) 0);
        boolean boolean49 = myInteger47.equals((java.lang.Object) 1.0f);
        MyInteger myInteger51 = new MyInteger((int) (short) 0);
        boolean boolean53 = myInteger51.equals((java.lang.Object) 1.0f);
        MyInteger myInteger54 = myInteger47.multiply(myInteger51);
        MyInteger myInteger55 = myInteger36.add(myInteger47);
        MyInteger myInteger56 = myInteger32.multiply(myInteger55);
        java.lang.String str57 = myInteger56.toString();
        java.lang.Class<?> wildcardClass58 = myInteger56.getClass();
        boolean boolean59 = myInteger30.equals((java.lang.Object) myInteger56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger29", myInteger1.equals(myInteger29) ? myInteger1.hashCode() == myInteger29.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.add(myInteger9);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        MyInteger myInteger27 = myInteger15.multiply(myInteger19);
        MyInteger myInteger29 = new MyInteger((int) (short) -1);
        java.lang.String str30 = myInteger29.toString();
        java.lang.String str31 = myInteger29.toString();
        MyInteger myInteger32 = myInteger19.multiply(myInteger29);
        MyInteger myInteger33 = myInteger1.multiply(myInteger29);
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger42 = myInteger35.multiply(myInteger39);
        int int43 = myInteger35.getIntValue();
        java.lang.String str44 = myInteger35.toString();
        java.lang.String str45 = myInteger35.toString();
        MyInteger myInteger46 = myInteger29.add(myInteger35);
        int int47 = myInteger46.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger29", myInteger1.equals(myInteger29) ? myInteger1.hashCode() == myInteger29.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        MyInteger myInteger4 = new MyInteger((int) (short) 0);
        boolean boolean6 = myInteger4.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger15 = myInteger8.multiply(myInteger12);
        int int16 = myInteger8.getIntValue();
        int int17 = myInteger8.getIntValue();
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        MyInteger myInteger27 = myInteger8.add(myInteger19);
        MyInteger myInteger28 = myInteger4.multiply(myInteger27);
        MyInteger myInteger29 = myInteger1.add(myInteger28);
        MyInteger myInteger31 = new MyInteger((int) (short) 10);
        MyInteger myInteger33 = new MyInteger((int) (short) 0);
        boolean boolean35 = myInteger33.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = new MyInteger((int) (short) 0);
        boolean boolean39 = myInteger37.equals((java.lang.Object) 1.0f);
        MyInteger myInteger41 = new MyInteger((int) (short) 0);
        boolean boolean43 = myInteger41.equals((java.lang.Object) 1.0f);
        MyInteger myInteger44 = myInteger37.multiply(myInteger41);
        MyInteger myInteger45 = myInteger33.multiply(myInteger37);
        boolean boolean46 = myInteger31.equals((java.lang.Object) myInteger33);
        MyInteger myInteger47 = myInteger29.multiply(myInteger31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger4", myInteger1.equals(myInteger4) ? myInteger1.hashCode() == myInteger4.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        MyInteger myInteger1 = new MyInteger(10);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = myInteger3.multiply(myInteger7);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        MyInteger myInteger13 = myInteger3.multiply(myInteger12);
        java.lang.String str14 = myInteger3.toString();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        int int24 = myInteger16.getIntValue();
        java.lang.String str25 = myInteger16.toString();
        boolean boolean27 = myInteger16.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger28 = myInteger3.multiply(myInteger16);
        MyInteger myInteger29 = myInteger1.add(myInteger3);
        int int30 = myInteger29.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger3", myInteger1.equals(myInteger3) ? myInteger1.hashCode() == myInteger3.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        int int14 = myInteger5.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        MyInteger myInteger24 = myInteger5.add(myInteger16);
        MyInteger myInteger25 = myInteger1.multiply(myInteger24);
        MyInteger myInteger27 = new MyInteger((int) (short) -1);
        java.lang.String str28 = myInteger27.toString();
        java.lang.String str29 = myInteger27.toString();
        int int30 = myInteger27.getIntValue();
        MyInteger myInteger31 = myInteger1.multiply(myInteger27);
        java.lang.Class<?> wildcardClass32 = myInteger31.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger27", myInteger1.equals(myInteger27) ? myInteger1.hashCode() == myInteger27.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        int int4 = myInteger1.getIntValue();
        boolean boolean6 = myInteger1.equals((java.lang.Object) 100.0f);
        MyInteger myInteger8 = new MyInteger((int) (byte) 10);
        int int9 = myInteger8.getIntValue();
        int int10 = myInteger8.getIntValue();
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = myInteger12.multiply(myInteger16);
        MyInteger myInteger21 = new MyInteger((int) (short) 0);
        MyInteger myInteger22 = myInteger12.multiply(myInteger21);
        MyInteger myInteger24 = new MyInteger((int) (short) 0);
        boolean boolean26 = myInteger24.equals((java.lang.Object) 1.0f);
        MyInteger myInteger28 = new MyInteger((int) (short) 0);
        boolean boolean30 = myInteger28.equals((java.lang.Object) 1.0f);
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        boolean boolean34 = myInteger32.equals((java.lang.Object) 1.0f);
        MyInteger myInteger35 = myInteger28.multiply(myInteger32);
        int int36 = myInteger28.getIntValue();
        int int37 = myInteger28.getIntValue();
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger46 = myInteger39.multiply(myInteger43);
        MyInteger myInteger47 = myInteger28.add(myInteger39);
        int int48 = myInteger47.getIntValue();
        boolean boolean49 = myInteger24.equals((java.lang.Object) myInteger47);
        MyInteger myInteger50 = myInteger21.multiply(myInteger24);
        MyInteger myInteger52 = new MyInteger((int) (short) 0);
        boolean boolean54 = myInteger52.equals((java.lang.Object) 1.0f);
        MyInteger myInteger56 = new MyInteger((int) (short) 0);
        boolean boolean58 = myInteger56.equals((java.lang.Object) 1.0f);
        MyInteger myInteger59 = myInteger52.multiply(myInteger56);
        MyInteger myInteger61 = new MyInteger((int) (short) 0);
        MyInteger myInteger62 = myInteger52.multiply(myInteger61);
        java.lang.String str63 = myInteger52.toString();
        MyInteger myInteger65 = new MyInteger((int) (short) 0);
        boolean boolean67 = myInteger65.equals((java.lang.Object) 1.0f);
        MyInteger myInteger69 = new MyInteger((int) (short) 0);
        boolean boolean71 = myInteger69.equals((java.lang.Object) 1.0f);
        MyInteger myInteger72 = myInteger65.multiply(myInteger69);
        int int73 = myInteger65.getIntValue();
        java.lang.String str74 = myInteger65.toString();
        boolean boolean76 = myInteger65.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger77 = myInteger52.multiply(myInteger65);
        MyInteger myInteger78 = myInteger21.add(myInteger65);
        MyInteger myInteger79 = myInteger8.add(myInteger65);
        MyInteger myInteger80 = myInteger1.multiply(myInteger8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger12 and myInteger79", myInteger12.equals(myInteger79) ? myInteger12.hashCode() == myInteger79.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        int int2 = myInteger1.getIntValue();
        int int3 = myInteger1.getIntValue();
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger14 = new MyInteger((int) (short) 0);
        MyInteger myInteger15 = myInteger5.multiply(myInteger14);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger21 = new MyInteger((int) (short) 0);
        boolean boolean23 = myInteger21.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = new MyInteger((int) (short) 0);
        boolean boolean27 = myInteger25.equals((java.lang.Object) 1.0f);
        MyInteger myInteger28 = myInteger21.multiply(myInteger25);
        int int29 = myInteger21.getIntValue();
        int int30 = myInteger21.getIntValue();
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        boolean boolean34 = myInteger32.equals((java.lang.Object) 1.0f);
        MyInteger myInteger36 = new MyInteger((int) (short) 0);
        boolean boolean38 = myInteger36.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = myInteger32.multiply(myInteger36);
        MyInteger myInteger40 = myInteger21.add(myInteger32);
        int int41 = myInteger40.getIntValue();
        boolean boolean42 = myInteger17.equals((java.lang.Object) myInteger40);
        MyInteger myInteger43 = myInteger14.multiply(myInteger17);
        MyInteger myInteger45 = new MyInteger((int) (short) 0);
        boolean boolean47 = myInteger45.equals((java.lang.Object) 1.0f);
        MyInteger myInteger49 = new MyInteger((int) (short) 0);
        boolean boolean51 = myInteger49.equals((java.lang.Object) 1.0f);
        MyInteger myInteger52 = myInteger45.multiply(myInteger49);
        MyInteger myInteger54 = new MyInteger((int) (short) 0);
        MyInteger myInteger55 = myInteger45.multiply(myInteger54);
        java.lang.String str56 = myInteger45.toString();
        MyInteger myInteger58 = new MyInteger((int) (short) 0);
        boolean boolean60 = myInteger58.equals((java.lang.Object) 1.0f);
        MyInteger myInteger62 = new MyInteger((int) (short) 0);
        boolean boolean64 = myInteger62.equals((java.lang.Object) 1.0f);
        MyInteger myInteger65 = myInteger58.multiply(myInteger62);
        int int66 = myInteger58.getIntValue();
        java.lang.String str67 = myInteger58.toString();
        boolean boolean69 = myInteger58.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger70 = myInteger45.multiply(myInteger58);
        MyInteger myInteger71 = myInteger14.add(myInteger58);
        MyInteger myInteger72 = myInteger1.add(myInteger58);
        java.lang.Class<?> wildcardClass73 = myInteger58.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger5", myInteger1.equals(myInteger5) ? myInteger1.hashCode() == myInteger5.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        int int9 = myInteger1.getIntValue();
        java.lang.String str10 = myInteger1.toString();
        boolean boolean12 = myInteger1.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger14 = new MyInteger((int) 'a');
        int int15 = myInteger14.getIntValue();
        int int16 = myInteger14.getIntValue();
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = myInteger18.multiply(myInteger22);
        int int26 = myInteger18.getIntValue();
        java.lang.String str27 = myInteger18.toString();
        boolean boolean29 = myInteger18.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger30 = myInteger14.multiply(myInteger18);
        boolean boolean31 = myInteger1.equals((java.lang.Object) myInteger14);
        MyInteger myInteger33 = new MyInteger(1);
        java.lang.String str34 = myInteger33.toString();
        MyInteger myInteger36 = new MyInteger((int) (short) 0);
        boolean boolean38 = myInteger36.equals((java.lang.Object) 1.0f);
        MyInteger myInteger40 = new MyInteger((int) (short) 0);
        boolean boolean42 = myInteger40.equals((java.lang.Object) 1.0f);
        MyInteger myInteger44 = new MyInteger((int) (short) 0);
        boolean boolean46 = myInteger44.equals((java.lang.Object) 1.0f);
        MyInteger myInteger47 = myInteger40.multiply(myInteger44);
        int int48 = myInteger40.getIntValue();
        int int49 = myInteger40.getIntValue();
        MyInteger myInteger51 = new MyInteger((int) (short) 0);
        boolean boolean53 = myInteger51.equals((java.lang.Object) 1.0f);
        MyInteger myInteger55 = new MyInteger((int) (short) 0);
        boolean boolean57 = myInteger55.equals((java.lang.Object) 1.0f);
        MyInteger myInteger58 = myInteger51.multiply(myInteger55);
        MyInteger myInteger59 = myInteger40.add(myInteger51);
        MyInteger myInteger60 = myInteger36.multiply(myInteger59);
        java.lang.String str61 = myInteger36.toString();
        MyInteger myInteger63 = new MyInteger((int) (short) 0);
        boolean boolean65 = myInteger63.equals((java.lang.Object) 1.0f);
        MyInteger myInteger67 = new MyInteger((int) (short) 0);
        boolean boolean69 = myInteger67.equals((java.lang.Object) 1.0f);
        MyInteger myInteger71 = new MyInteger((int) (short) 0);
        boolean boolean73 = myInteger71.equals((java.lang.Object) 1.0f);
        MyInteger myInteger74 = myInteger67.multiply(myInteger71);
        int int75 = myInteger67.getIntValue();
        int int76 = myInteger67.getIntValue();
        MyInteger myInteger78 = new MyInteger((int) (short) 0);
        boolean boolean80 = myInteger78.equals((java.lang.Object) 1.0f);
        MyInteger myInteger82 = new MyInteger((int) (short) 0);
        boolean boolean84 = myInteger82.equals((java.lang.Object) 1.0f);
        MyInteger myInteger85 = myInteger78.multiply(myInteger82);
        MyInteger myInteger86 = myInteger67.add(myInteger78);
        MyInteger myInteger87 = myInteger63.multiply(myInteger86);
        MyInteger myInteger88 = myInteger36.multiply(myInteger87);
        MyInteger myInteger89 = myInteger33.multiply(myInteger88);
        MyInteger myInteger90 = myInteger1.add(myInteger88);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger5 and myInteger14", myInteger5.equals(myInteger14) ? myInteger5.hashCode() == myInteger14.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        MyInteger myInteger3 = new MyInteger((int) (short) -1);
        java.lang.String str4 = myInteger3.toString();
        MyInteger myInteger5 = myInteger1.add(myInteger3);
        int int6 = myInteger1.getIntValue();
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger15 = myInteger8.multiply(myInteger12);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        MyInteger myInteger18 = myInteger8.multiply(myInteger17);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger24 = new MyInteger((int) (short) 0);
        boolean boolean26 = myInteger24.equals((java.lang.Object) 1.0f);
        MyInteger myInteger28 = new MyInteger((int) (short) 0);
        boolean boolean30 = myInteger28.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = myInteger24.multiply(myInteger28);
        int int32 = myInteger24.getIntValue();
        int int33 = myInteger24.getIntValue();
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger42 = myInteger35.multiply(myInteger39);
        MyInteger myInteger43 = myInteger24.add(myInteger35);
        int int44 = myInteger43.getIntValue();
        boolean boolean45 = myInteger20.equals((java.lang.Object) myInteger43);
        MyInteger myInteger46 = myInteger17.multiply(myInteger20);
        MyInteger myInteger47 = myInteger1.multiply(myInteger46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger8", myInteger3.equals(myInteger8) ? myInteger3.hashCode() == myInteger8.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        int int3 = myInteger1.getIntValue();
        MyInteger myInteger5 = new MyInteger((int) (short) 10);
        MyInteger myInteger6 = myInteger1.multiply(myInteger5);
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = myInteger12.multiply(myInteger16);
        MyInteger myInteger20 = myInteger8.add(myInteger16);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = new MyInteger((int) (short) 0);
        boolean boolean28 = myInteger26.equals((java.lang.Object) 1.0f);
        MyInteger myInteger29 = myInteger22.multiply(myInteger26);
        boolean boolean31 = myInteger26.equals((java.lang.Object) (byte) -1);
        int int32 = myInteger26.getIntValue();
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger38 = new MyInteger((int) (short) 0);
        boolean boolean40 = myInteger38.equals((java.lang.Object) 1.0f);
        MyInteger myInteger41 = myInteger34.multiply(myInteger38);
        int int42 = myInteger34.getIntValue();
        java.lang.String str43 = myInteger34.toString();
        java.lang.String str44 = myInteger34.toString();
        MyInteger myInteger45 = myInteger26.add(myInteger34);
        MyInteger myInteger47 = new MyInteger((int) (short) 0);
        boolean boolean49 = myInteger47.equals((java.lang.Object) 1.0f);
        int int50 = myInteger47.getIntValue();
        java.lang.String str51 = myInteger47.toString();
        MyInteger myInteger52 = myInteger26.add(myInteger47);
        MyInteger myInteger53 = myInteger16.multiply(myInteger52);
        MyInteger myInteger54 = myInteger5.add(myInteger53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger6", myInteger1.equals(myInteger6) ? myInteger1.hashCode() == myInteger6.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        MyInteger myInteger3 = new MyInteger((int) (short) -1);
        java.lang.String str4 = myInteger3.toString();
        MyInteger myInteger5 = myInteger1.add(myInteger3);
        java.lang.String str6 = myInteger1.toString();
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger15 = myInteger8.multiply(myInteger12);
        MyInteger myInteger16 = myInteger1.add(myInteger15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger8", myInteger3.equals(myInteger8) ? myInteger3.hashCode() == myInteger8.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.add(myInteger9);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        MyInteger myInteger27 = myInteger15.add(myInteger23);
        MyInteger myInteger29 = new MyInteger((int) (short) 0);
        boolean boolean31 = myInteger29.equals((java.lang.Object) 1.0f);
        MyInteger myInteger33 = new MyInteger((int) (short) 0);
        boolean boolean35 = myInteger33.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = new MyInteger((int) (short) 0);
        boolean boolean39 = myInteger37.equals((java.lang.Object) 1.0f);
        MyInteger myInteger40 = myInteger33.multiply(myInteger37);
        MyInteger myInteger41 = myInteger29.multiply(myInteger33);
        MyInteger myInteger43 = new MyInteger((int) (short) -1);
        java.lang.String str44 = myInteger43.toString();
        java.lang.String str45 = myInteger43.toString();
        MyInteger myInteger46 = myInteger33.multiply(myInteger43);
        MyInteger myInteger47 = myInteger15.multiply(myInteger43);
        MyInteger myInteger48 = myInteger9.multiply(myInteger47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger43", myInteger1.equals(myInteger43) ? myInteger1.hashCode() == myInteger43.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        MyInteger myInteger1 = new MyInteger((int) (byte) 1);
        MyInteger myInteger3 = new MyInteger((int) (short) -1);
        java.lang.String str4 = myInteger3.toString();
        int int5 = myInteger3.getIntValue();
        boolean boolean6 = myInteger1.equals((java.lang.Object) myInteger3);
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = myInteger12.multiply(myInteger16);
        MyInteger myInteger20 = myInteger8.multiply(myInteger12);
        MyInteger myInteger22 = new MyInteger((int) (short) -1);
        java.lang.String str23 = myInteger22.toString();
        java.lang.String str24 = myInteger22.toString();
        MyInteger myInteger25 = myInteger12.multiply(myInteger22);
        MyInteger myInteger26 = myInteger1.multiply(myInteger12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger8", myInteger3.equals(myInteger8) ? myInteger3.hashCode() == myInteger8.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.add(myInteger9);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        MyInteger myInteger27 = myInteger15.multiply(myInteger19);
        MyInteger myInteger29 = new MyInteger((int) (short) -1);
        java.lang.String str30 = myInteger29.toString();
        java.lang.String str31 = myInteger29.toString();
        MyInteger myInteger32 = myInteger19.multiply(myInteger29);
        MyInteger myInteger33 = myInteger1.multiply(myInteger29);
        int int34 = myInteger29.getIntValue();
        MyInteger myInteger36 = new MyInteger((int) (short) -1);
        java.lang.String str37 = myInteger36.toString();
        java.lang.String str38 = myInteger36.toString();
        int int39 = myInteger36.getIntValue();
        MyInteger myInteger41 = new MyInteger(1);
        java.lang.String str42 = myInteger41.toString();
        MyInteger myInteger44 = new MyInteger((int) (short) 0);
        boolean boolean46 = myInteger44.equals((java.lang.Object) 1.0f);
        MyInteger myInteger48 = new MyInteger((int) (short) 0);
        boolean boolean50 = myInteger48.equals((java.lang.Object) 1.0f);
        MyInteger myInteger52 = new MyInteger((int) (short) 0);
        boolean boolean54 = myInteger52.equals((java.lang.Object) 1.0f);
        MyInteger myInteger55 = myInteger48.multiply(myInteger52);
        int int56 = myInteger48.getIntValue();
        int int57 = myInteger48.getIntValue();
        MyInteger myInteger59 = new MyInteger((int) (short) 0);
        boolean boolean61 = myInteger59.equals((java.lang.Object) 1.0f);
        MyInteger myInteger63 = new MyInteger((int) (short) 0);
        boolean boolean65 = myInteger63.equals((java.lang.Object) 1.0f);
        MyInteger myInteger66 = myInteger59.multiply(myInteger63);
        MyInteger myInteger67 = myInteger48.add(myInteger59);
        MyInteger myInteger68 = myInteger44.multiply(myInteger67);
        java.lang.String str69 = myInteger44.toString();
        MyInteger myInteger71 = new MyInteger((int) (short) 0);
        boolean boolean73 = myInteger71.equals((java.lang.Object) 1.0f);
        MyInteger myInteger75 = new MyInteger((int) (short) 0);
        boolean boolean77 = myInteger75.equals((java.lang.Object) 1.0f);
        MyInteger myInteger79 = new MyInteger((int) (short) 0);
        boolean boolean81 = myInteger79.equals((java.lang.Object) 1.0f);
        MyInteger myInteger82 = myInteger75.multiply(myInteger79);
        int int83 = myInteger75.getIntValue();
        int int84 = myInteger75.getIntValue();
        MyInteger myInteger86 = new MyInteger((int) (short) 0);
        boolean boolean88 = myInteger86.equals((java.lang.Object) 1.0f);
        MyInteger myInteger90 = new MyInteger((int) (short) 0);
        boolean boolean92 = myInteger90.equals((java.lang.Object) 1.0f);
        MyInteger myInteger93 = myInteger86.multiply(myInteger90);
        MyInteger myInteger94 = myInteger75.add(myInteger86);
        MyInteger myInteger95 = myInteger71.multiply(myInteger94);
        MyInteger myInteger96 = myInteger44.multiply(myInteger95);
        MyInteger myInteger97 = myInteger41.multiply(myInteger96);
        MyInteger myInteger98 = myInteger36.add(myInteger41);
        MyInteger myInteger99 = myInteger29.add(myInteger36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger41", myInteger1.equals(myInteger41) ? myInteger1.hashCode() == myInteger41.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        boolean boolean12 = myInteger10.equals((java.lang.Object) 1.0f);
        MyInteger myInteger14 = new MyInteger((int) (short) 0);
        boolean boolean16 = myInteger14.equals((java.lang.Object) 1.0f);
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger21 = myInteger14.multiply(myInteger18);
        MyInteger myInteger22 = myInteger10.multiply(myInteger14);
        java.lang.Class<?> wildcardClass23 = myInteger10.getClass();
        boolean boolean24 = myInteger1.equals((java.lang.Object) wildcardClass23);
        MyInteger myInteger26 = new MyInteger((int) (short) 0);
        boolean boolean28 = myInteger26.equals((java.lang.Object) 1.0f);
        MyInteger myInteger30 = new MyInteger((int) (short) 0);
        boolean boolean32 = myInteger30.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = myInteger30.multiply(myInteger34);
        MyInteger myInteger38 = myInteger26.multiply(myInteger30);
        MyInteger myInteger40 = new MyInteger((int) (short) -1);
        java.lang.String str41 = myInteger40.toString();
        java.lang.String str42 = myInteger40.toString();
        MyInteger myInteger43 = myInteger30.multiply(myInteger40);
        MyInteger myInteger45 = new MyInteger((int) (short) 0);
        boolean boolean47 = myInteger45.equals((java.lang.Object) 1.0f);
        MyInteger myInteger49 = new MyInteger((int) (short) 0);
        boolean boolean51 = myInteger49.equals((java.lang.Object) 1.0f);
        MyInteger myInteger53 = new MyInteger((int) (short) 0);
        boolean boolean55 = myInteger53.equals((java.lang.Object) 1.0f);
        MyInteger myInteger56 = myInteger49.multiply(myInteger53);
        MyInteger myInteger57 = myInteger45.multiply(myInteger49);
        MyInteger myInteger58 = myInteger40.multiply(myInteger45);
        MyInteger myInteger59 = myInteger1.multiply(myInteger45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger5 and myInteger40", myInteger5.equals(myInteger40) ? myInteger5.hashCode() == myInteger40.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        MyInteger myInteger11 = myInteger1.multiply(myInteger10);
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger21 = new MyInteger((int) (short) 0);
        boolean boolean23 = myInteger21.equals((java.lang.Object) 1.0f);
        MyInteger myInteger24 = myInteger17.multiply(myInteger21);
        int int25 = myInteger17.getIntValue();
        int int26 = myInteger17.getIntValue();
        MyInteger myInteger28 = new MyInteger((int) (short) 0);
        boolean boolean30 = myInteger28.equals((java.lang.Object) 1.0f);
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        boolean boolean34 = myInteger32.equals((java.lang.Object) 1.0f);
        MyInteger myInteger35 = myInteger28.multiply(myInteger32);
        MyInteger myInteger36 = myInteger17.add(myInteger28);
        int int37 = myInteger36.getIntValue();
        boolean boolean38 = myInteger13.equals((java.lang.Object) myInteger36);
        MyInteger myInteger39 = myInteger10.multiply(myInteger13);
        MyInteger myInteger41 = new MyInteger((int) (byte) 100);
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger46 = myInteger41.multiply(myInteger43);
        boolean boolean47 = myInteger39.equals((java.lang.Object) myInteger41);
        int int48 = myInteger41.getIntValue();
        MyInteger myInteger50 = new MyInteger((int) (short) -1);
        java.lang.String str51 = myInteger50.toString();
        boolean boolean53 = myInteger50.equals((java.lang.Object) (-1));
        int int54 = myInteger50.getIntValue();
        MyInteger myInteger55 = myInteger41.multiply(myInteger50);
        MyInteger myInteger57 = new MyInteger((int) (short) 1);
        boolean boolean58 = myInteger55.equals((java.lang.Object) myInteger57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger41", myInteger1.equals(myInteger41) ? myInteger1.hashCode() == myInteger41.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        int int2 = myInteger1.getIntValue();
        int int3 = myInteger1.getIntValue();
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger14 = new MyInteger((int) (short) 0);
        MyInteger myInteger15 = myInteger5.multiply(myInteger14);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger21 = new MyInteger((int) (short) 0);
        boolean boolean23 = myInteger21.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = new MyInteger((int) (short) 0);
        boolean boolean27 = myInteger25.equals((java.lang.Object) 1.0f);
        MyInteger myInteger28 = myInteger21.multiply(myInteger25);
        int int29 = myInteger21.getIntValue();
        int int30 = myInteger21.getIntValue();
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        boolean boolean34 = myInteger32.equals((java.lang.Object) 1.0f);
        MyInteger myInteger36 = new MyInteger((int) (short) 0);
        boolean boolean38 = myInteger36.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = myInteger32.multiply(myInteger36);
        MyInteger myInteger40 = myInteger21.add(myInteger32);
        int int41 = myInteger40.getIntValue();
        boolean boolean42 = myInteger17.equals((java.lang.Object) myInteger40);
        MyInteger myInteger43 = myInteger14.multiply(myInteger17);
        MyInteger myInteger45 = new MyInteger((int) (short) 0);
        boolean boolean47 = myInteger45.equals((java.lang.Object) 1.0f);
        MyInteger myInteger49 = new MyInteger((int) (short) 0);
        boolean boolean51 = myInteger49.equals((java.lang.Object) 1.0f);
        MyInteger myInteger52 = myInteger45.multiply(myInteger49);
        MyInteger myInteger54 = new MyInteger((int) (short) 0);
        MyInteger myInteger55 = myInteger45.multiply(myInteger54);
        java.lang.String str56 = myInteger45.toString();
        MyInteger myInteger58 = new MyInteger((int) (short) 0);
        boolean boolean60 = myInteger58.equals((java.lang.Object) 1.0f);
        MyInteger myInteger62 = new MyInteger((int) (short) 0);
        boolean boolean64 = myInteger62.equals((java.lang.Object) 1.0f);
        MyInteger myInteger65 = myInteger58.multiply(myInteger62);
        int int66 = myInteger58.getIntValue();
        java.lang.String str67 = myInteger58.toString();
        boolean boolean69 = myInteger58.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger70 = myInteger45.multiply(myInteger58);
        MyInteger myInteger71 = myInteger14.add(myInteger58);
        MyInteger myInteger72 = myInteger1.add(myInteger58);
        java.lang.Class<?> wildcardClass73 = myInteger72.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger5", myInteger1.equals(myInteger5) ? myInteger1.hashCode() == myInteger5.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.multiply(myInteger5);
        MyInteger myInteger15 = new MyInteger((int) ' ');
        MyInteger myInteger16 = myInteger13.multiply(myInteger15);
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = new MyInteger((int) (short) 0);
        boolean boolean28 = myInteger26.equals((java.lang.Object) 1.0f);
        MyInteger myInteger29 = myInteger22.multiply(myInteger26);
        int int30 = myInteger22.getIntValue();
        int int31 = myInteger22.getIntValue();
        MyInteger myInteger33 = new MyInteger((int) (short) 0);
        boolean boolean35 = myInteger33.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = new MyInteger((int) (short) 0);
        boolean boolean39 = myInteger37.equals((java.lang.Object) 1.0f);
        MyInteger myInteger40 = myInteger33.multiply(myInteger37);
        MyInteger myInteger41 = myInteger22.add(myInteger33);
        MyInteger myInteger42 = myInteger18.multiply(myInteger41);
        java.lang.String str43 = myInteger18.toString();
        MyInteger myInteger45 = new MyInteger((int) (short) 0);
        boolean boolean47 = myInteger45.equals((java.lang.Object) 1.0f);
        MyInteger myInteger49 = new MyInteger((int) (short) 0);
        boolean boolean51 = myInteger49.equals((java.lang.Object) 1.0f);
        MyInteger myInteger53 = new MyInteger((int) (short) 0);
        boolean boolean55 = myInteger53.equals((java.lang.Object) 1.0f);
        MyInteger myInteger56 = myInteger49.multiply(myInteger53);
        int int57 = myInteger49.getIntValue();
        int int58 = myInteger49.getIntValue();
        MyInteger myInteger60 = new MyInteger((int) (short) 0);
        boolean boolean62 = myInteger60.equals((java.lang.Object) 1.0f);
        MyInteger myInteger64 = new MyInteger((int) (short) 0);
        boolean boolean66 = myInteger64.equals((java.lang.Object) 1.0f);
        MyInteger myInteger67 = myInteger60.multiply(myInteger64);
        MyInteger myInteger68 = myInteger49.add(myInteger60);
        MyInteger myInteger69 = myInteger45.multiply(myInteger68);
        MyInteger myInteger70 = myInteger18.multiply(myInteger69);
        MyInteger myInteger71 = myInteger16.add(myInteger69);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger15", myInteger1.equals(myInteger15) ? myInteger1.hashCode() == myInteger15.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        int int14 = myInteger5.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        MyInteger myInteger24 = myInteger5.add(myInteger16);
        MyInteger myInteger25 = myInteger1.multiply(myInteger24);
        MyInteger myInteger27 = new MyInteger((int) (short) -1);
        java.lang.String str28 = myInteger27.toString();
        java.lang.String str29 = myInteger27.toString();
        int int30 = myInteger27.getIntValue();
        MyInteger myInteger31 = myInteger1.multiply(myInteger27);
        MyInteger myInteger33 = new MyInteger((int) (byte) 1);
        MyInteger myInteger34 = myInteger1.add(myInteger33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger5 and myInteger27", myInteger5.equals(myInteger27) ? myInteger5.hashCode() == myInteger27.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = myInteger3.multiply(myInteger7);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        MyInteger myInteger24 = myInteger12.multiply(myInteger16);
        java.lang.Class<?> wildcardClass25 = myInteger12.getClass();
        boolean boolean26 = myInteger3.equals((java.lang.Object) wildcardClass25);
        int int27 = myInteger3.getIntValue();
        MyInteger myInteger29 = new MyInteger((int) (short) 0);
        boolean boolean31 = myInteger29.equals((java.lang.Object) 1.0f);
        MyInteger myInteger33 = new MyInteger((int) (short) 0);
        boolean boolean35 = myInteger33.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = new MyInteger((int) (short) 0);
        boolean boolean39 = myInteger37.equals((java.lang.Object) 1.0f);
        MyInteger myInteger40 = myInteger33.multiply(myInteger37);
        int int41 = myInteger33.getIntValue();
        int int42 = myInteger33.getIntValue();
        MyInteger myInteger44 = new MyInteger((int) (short) 0);
        boolean boolean46 = myInteger44.equals((java.lang.Object) 1.0f);
        MyInteger myInteger48 = new MyInteger((int) (short) 0);
        boolean boolean50 = myInteger48.equals((java.lang.Object) 1.0f);
        MyInteger myInteger51 = myInteger44.multiply(myInteger48);
        MyInteger myInteger52 = myInteger33.add(myInteger44);
        MyInteger myInteger53 = myInteger29.multiply(myInteger52);
        java.lang.String str54 = myInteger29.toString();
        MyInteger myInteger56 = new MyInteger((int) (short) 0);
        boolean boolean58 = myInteger56.equals((java.lang.Object) 1.0f);
        MyInteger myInteger60 = new MyInteger((int) (short) 0);
        boolean boolean62 = myInteger60.equals((java.lang.Object) 1.0f);
        MyInteger myInteger64 = new MyInteger((int) (short) 0);
        boolean boolean66 = myInteger64.equals((java.lang.Object) 1.0f);
        MyInteger myInteger67 = myInteger60.multiply(myInteger64);
        int int68 = myInteger60.getIntValue();
        int int69 = myInteger60.getIntValue();
        MyInteger myInteger71 = new MyInteger((int) (short) 0);
        boolean boolean73 = myInteger71.equals((java.lang.Object) 1.0f);
        MyInteger myInteger75 = new MyInteger((int) (short) 0);
        boolean boolean77 = myInteger75.equals((java.lang.Object) 1.0f);
        MyInteger myInteger78 = myInteger71.multiply(myInteger75);
        MyInteger myInteger79 = myInteger60.add(myInteger71);
        MyInteger myInteger80 = myInteger56.multiply(myInteger79);
        MyInteger myInteger81 = myInteger29.multiply(myInteger80);
        boolean boolean83 = myInteger80.equals((java.lang.Object) (byte) -1);
        MyInteger myInteger84 = myInteger3.add(myInteger80);
        MyInteger myInteger85 = myInteger1.multiply(myInteger3);
        int int86 = myInteger3.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger7", myInteger1.equals(myInteger7) ? myInteger1.hashCode() == myInteger7.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.add(myInteger9);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        MyInteger myInteger27 = myInteger15.multiply(myInteger19);
        MyInteger myInteger29 = new MyInteger((int) (short) -1);
        java.lang.String str30 = myInteger29.toString();
        java.lang.String str31 = myInteger29.toString();
        MyInteger myInteger32 = myInteger19.multiply(myInteger29);
        MyInteger myInteger33 = myInteger1.multiply(myInteger29);
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger42 = myInteger35.multiply(myInteger39);
        int int43 = myInteger35.getIntValue();
        java.lang.String str44 = myInteger35.toString();
        java.lang.String str45 = myInteger35.toString();
        MyInteger myInteger46 = myInteger29.add(myInteger35);
        int int47 = myInteger29.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger46", myInteger1.equals(myInteger46) ? myInteger1.hashCode() == myInteger46.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        MyInteger myInteger1 = new MyInteger((int) ' ');
        MyInteger myInteger3 = new MyInteger((int) 'a');
        int int4 = myInteger3.getIntValue();
        MyInteger myInteger5 = myInteger1.multiply(myInteger3);
        int int6 = myInteger3.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger5", myInteger1.equals(myInteger5) ? myInteger1.hashCode() == myInteger5.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.add(myInteger9);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        MyInteger myInteger27 = myInteger15.multiply(myInteger19);
        MyInteger myInteger29 = new MyInteger((int) (short) -1);
        java.lang.String str30 = myInteger29.toString();
        java.lang.String str31 = myInteger29.toString();
        MyInteger myInteger32 = myInteger19.multiply(myInteger29);
        MyInteger myInteger33 = myInteger1.multiply(myInteger29);
        int int34 = myInteger33.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger29", myInteger1.equals(myInteger29) ? myInteger1.hashCode() == myInteger29.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        int int14 = myInteger5.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        MyInteger myInteger24 = myInteger5.add(myInteger16);
        MyInteger myInteger25 = myInteger1.multiply(myInteger24);
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = myInteger27.multiply(myInteger31);
        java.lang.Class<?> wildcardClass35 = myInteger31.getClass();
        boolean boolean36 = myInteger25.equals((java.lang.Object) wildcardClass35);
        MyInteger myInteger38 = new MyInteger((int) (short) 0);
        boolean boolean40 = myInteger38.equals((java.lang.Object) 1.0f);
        MyInteger myInteger42 = new MyInteger((int) (short) 0);
        boolean boolean44 = myInteger42.equals((java.lang.Object) 1.0f);
        MyInteger myInteger46 = new MyInteger((int) (short) 0);
        boolean boolean48 = myInteger46.equals((java.lang.Object) 1.0f);
        MyInteger myInteger49 = myInteger42.multiply(myInteger46);
        MyInteger myInteger50 = myInteger38.add(myInteger46);
        MyInteger myInteger52 = new MyInteger((int) (short) 0);
        boolean boolean54 = myInteger52.equals((java.lang.Object) 1.0f);
        MyInteger myInteger56 = new MyInteger((int) (short) 0);
        boolean boolean58 = myInteger56.equals((java.lang.Object) 1.0f);
        MyInteger myInteger60 = new MyInteger((int) (short) 0);
        boolean boolean62 = myInteger60.equals((java.lang.Object) 1.0f);
        MyInteger myInteger63 = myInteger56.multiply(myInteger60);
        MyInteger myInteger64 = myInteger52.multiply(myInteger56);
        MyInteger myInteger66 = new MyInteger((int) (short) -1);
        java.lang.String str67 = myInteger66.toString();
        java.lang.String str68 = myInteger66.toString();
        MyInteger myInteger69 = myInteger56.multiply(myInteger66);
        MyInteger myInteger70 = myInteger38.multiply(myInteger66);
        boolean boolean71 = myInteger25.equals((java.lang.Object) myInteger66);
        java.lang.String str72 = myInteger25.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger66", myInteger1.equals(myInteger66) ? myInteger1.hashCode() == myInteger66.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        int int9 = myInteger1.getIntValue();
        MyInteger myInteger11 = new MyInteger((int) (byte) 1);
        MyInteger myInteger12 = myInteger1.multiply(myInteger11);
        MyInteger myInteger14 = new MyInteger((int) (short) 0);
        boolean boolean16 = myInteger14.equals((java.lang.Object) 1.0f);
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = myInteger18.multiply(myInteger22);
        MyInteger myInteger26 = myInteger14.add(myInteger22);
        MyInteger myInteger28 = new MyInteger((int) (short) 0);
        boolean boolean30 = myInteger28.equals((java.lang.Object) 1.0f);
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        boolean boolean34 = myInteger32.equals((java.lang.Object) 1.0f);
        MyInteger myInteger36 = new MyInteger((int) (short) 0);
        boolean boolean38 = myInteger36.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = myInteger32.multiply(myInteger36);
        int int40 = myInteger32.getIntValue();
        int int41 = myInteger32.getIntValue();
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger47 = new MyInteger((int) (short) 0);
        boolean boolean49 = myInteger47.equals((java.lang.Object) 1.0f);
        MyInteger myInteger50 = myInteger43.multiply(myInteger47);
        MyInteger myInteger51 = myInteger32.add(myInteger43);
        int int52 = myInteger51.getIntValue();
        boolean boolean53 = myInteger28.equals((java.lang.Object) myInteger51);
        int int54 = myInteger51.getIntValue();
        MyInteger myInteger56 = new MyInteger((int) (short) 0);
        boolean boolean58 = myInteger56.equals((java.lang.Object) 1.0f);
        MyInteger myInteger60 = new MyInteger((int) (short) 0);
        boolean boolean62 = myInteger60.equals((java.lang.Object) 1.0f);
        MyInteger myInteger63 = myInteger56.multiply(myInteger60);
        int int64 = myInteger60.getIntValue();
        MyInteger myInteger65 = myInteger51.multiply(myInteger60);
        boolean boolean67 = myInteger60.equals((java.lang.Object) "97");
        MyInteger myInteger68 = myInteger22.multiply(myInteger60);
        MyInteger myInteger69 = myInteger1.multiply(myInteger68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger5 and myInteger11", myInteger5.equals(myInteger11) ? myInteger5.hashCode() == myInteger11.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.multiply(myInteger5);
        MyInteger myInteger15 = new MyInteger((int) (short) -1);
        java.lang.String str16 = myInteger15.toString();
        java.lang.String str17 = myInteger15.toString();
        MyInteger myInteger18 = myInteger5.multiply(myInteger15);
        java.lang.String str19 = myInteger18.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger15", myInteger1.equals(myInteger15) ? myInteger1.hashCode() == myInteger15.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        MyInteger myInteger1 = new MyInteger((int) ' ');
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = myInteger3.multiply(myInteger7);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        MyInteger myInteger13 = myInteger3.multiply(myInteger12);
        java.lang.String str14 = myInteger3.toString();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        int int24 = myInteger16.getIntValue();
        java.lang.String str25 = myInteger16.toString();
        boolean boolean27 = myInteger16.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger28 = myInteger3.multiply(myInteger16);
        MyInteger myInteger29 = myInteger1.add(myInteger28);
        int int30 = myInteger28.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger3", myInteger1.equals(myInteger3) ? myInteger1.hashCode() == myInteger3.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        MyInteger myInteger1 = new MyInteger(1);
        java.lang.String str2 = myInteger1.toString();
        MyInteger myInteger4 = new MyInteger((int) (short) 0);
        boolean boolean6 = myInteger4.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger15 = myInteger8.multiply(myInteger12);
        int int16 = myInteger8.getIntValue();
        int int17 = myInteger8.getIntValue();
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        MyInteger myInteger27 = myInteger8.add(myInteger19);
        MyInteger myInteger28 = myInteger4.multiply(myInteger27);
        java.lang.String str29 = myInteger4.toString();
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger42 = myInteger35.multiply(myInteger39);
        int int43 = myInteger35.getIntValue();
        int int44 = myInteger35.getIntValue();
        MyInteger myInteger46 = new MyInteger((int) (short) 0);
        boolean boolean48 = myInteger46.equals((java.lang.Object) 1.0f);
        MyInteger myInteger50 = new MyInteger((int) (short) 0);
        boolean boolean52 = myInteger50.equals((java.lang.Object) 1.0f);
        MyInteger myInteger53 = myInteger46.multiply(myInteger50);
        MyInteger myInteger54 = myInteger35.add(myInteger46);
        MyInteger myInteger55 = myInteger31.multiply(myInteger54);
        MyInteger myInteger56 = myInteger4.multiply(myInteger55);
        MyInteger myInteger57 = myInteger1.multiply(myInteger56);
        java.lang.String str58 = myInteger57.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger4", myInteger1.equals(myInteger4) ? myInteger1.hashCode() == myInteger4.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        int int14 = myInteger5.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        MyInteger myInteger24 = myInteger5.add(myInteger16);
        MyInteger myInteger25 = myInteger1.multiply(myInteger24);
        java.lang.String str26 = myInteger1.toString();
        MyInteger myInteger28 = new MyInteger((int) (short) 0);
        boolean boolean30 = myInteger28.equals((java.lang.Object) 1.0f);
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        boolean boolean34 = myInteger32.equals((java.lang.Object) 1.0f);
        MyInteger myInteger36 = new MyInteger((int) (short) 0);
        boolean boolean38 = myInteger36.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = myInteger32.multiply(myInteger36);
        MyInteger myInteger40 = myInteger28.multiply(myInteger32);
        MyInteger myInteger42 = new MyInteger((int) (short) -1);
        java.lang.String str43 = myInteger42.toString();
        java.lang.String str44 = myInteger42.toString();
        MyInteger myInteger45 = myInteger32.multiply(myInteger42);
        MyInteger myInteger47 = new MyInteger((int) (short) 0);
        boolean boolean49 = myInteger47.equals((java.lang.Object) 1.0f);
        MyInteger myInteger51 = new MyInteger((int) (short) 0);
        boolean boolean53 = myInteger51.equals((java.lang.Object) 1.0f);
        MyInteger myInteger55 = new MyInteger((int) (short) 0);
        boolean boolean57 = myInteger55.equals((java.lang.Object) 1.0f);
        MyInteger myInteger58 = myInteger51.multiply(myInteger55);
        MyInteger myInteger59 = myInteger47.multiply(myInteger51);
        MyInteger myInteger60 = myInteger42.multiply(myInteger47);
        MyInteger myInteger61 = myInteger1.multiply(myInteger60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger5 and myInteger42", myInteger5.equals(myInteger42) ? myInteger5.hashCode() == myInteger42.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.multiply(myInteger5);
        MyInteger myInteger15 = new MyInteger(1);
        java.lang.String str16 = myInteger15.toString();
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = new MyInteger((int) (short) 0);
        boolean boolean28 = myInteger26.equals((java.lang.Object) 1.0f);
        MyInteger myInteger29 = myInteger22.multiply(myInteger26);
        int int30 = myInteger22.getIntValue();
        int int31 = myInteger22.getIntValue();
        MyInteger myInteger33 = new MyInteger((int) (short) 0);
        boolean boolean35 = myInteger33.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = new MyInteger((int) (short) 0);
        boolean boolean39 = myInteger37.equals((java.lang.Object) 1.0f);
        MyInteger myInteger40 = myInteger33.multiply(myInteger37);
        MyInteger myInteger41 = myInteger22.add(myInteger33);
        MyInteger myInteger42 = myInteger18.multiply(myInteger41);
        java.lang.String str43 = myInteger18.toString();
        MyInteger myInteger45 = new MyInteger((int) (short) 0);
        boolean boolean47 = myInteger45.equals((java.lang.Object) 1.0f);
        MyInteger myInteger49 = new MyInteger((int) (short) 0);
        boolean boolean51 = myInteger49.equals((java.lang.Object) 1.0f);
        MyInteger myInteger53 = new MyInteger((int) (short) 0);
        boolean boolean55 = myInteger53.equals((java.lang.Object) 1.0f);
        MyInteger myInteger56 = myInteger49.multiply(myInteger53);
        int int57 = myInteger49.getIntValue();
        int int58 = myInteger49.getIntValue();
        MyInteger myInteger60 = new MyInteger((int) (short) 0);
        boolean boolean62 = myInteger60.equals((java.lang.Object) 1.0f);
        MyInteger myInteger64 = new MyInteger((int) (short) 0);
        boolean boolean66 = myInteger64.equals((java.lang.Object) 1.0f);
        MyInteger myInteger67 = myInteger60.multiply(myInteger64);
        MyInteger myInteger68 = myInteger49.add(myInteger60);
        MyInteger myInteger69 = myInteger45.multiply(myInteger68);
        MyInteger myInteger70 = myInteger18.multiply(myInteger69);
        MyInteger myInteger71 = myInteger15.multiply(myInteger70);
        MyInteger myInteger72 = myInteger1.add(myInteger71);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger5 and myInteger15", myInteger5.equals(myInteger15) ? myInteger5.hashCode() == myInteger15.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        MyInteger myInteger11 = myInteger1.multiply(myInteger10);
        int int12 = myInteger11.getIntValue();
        MyInteger myInteger14 = new MyInteger((int) (short) -1);
        int int15 = myInteger14.getIntValue();
        MyInteger myInteger17 = new MyInteger((int) (short) -1);
        java.lang.String str18 = myInteger17.toString();
        MyInteger myInteger19 = myInteger14.add(myInteger17);
        MyInteger myInteger20 = myInteger11.add(myInteger14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger17", myInteger1.equals(myInteger17) ? myInteger1.hashCode() == myInteger17.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = myInteger3.multiply(myInteger7);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        MyInteger myInteger13 = myInteger3.multiply(myInteger12);
        boolean boolean15 = myInteger3.equals((java.lang.Object) '4');
        MyInteger myInteger16 = myInteger1.add(myInteger3);
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        boolean boolean22 = myInteger18.equals((java.lang.Object) (-1.0f));
        MyInteger myInteger23 = myInteger1.multiply(myInteger18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger16", myInteger3.equals(myInteger16) ? myInteger3.hashCode() == myInteger16.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        MyInteger myInteger1 = new MyInteger((int) ' ');
        MyInteger myInteger3 = new MyInteger((int) 'a');
        int int4 = myInteger3.getIntValue();
        MyInteger myInteger5 = myInteger1.multiply(myInteger3);
        MyInteger myInteger7 = new MyInteger((int) (byte) 1);
        MyInteger myInteger8 = myInteger3.multiply(myInteger7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger5", myInteger1.equals(myInteger5) ? myInteger1.hashCode() == myInteger5.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        MyInteger myInteger1 = new MyInteger(1);
        java.lang.String str2 = myInteger1.toString();
        MyInteger myInteger4 = new MyInteger((int) (short) 0);
        boolean boolean6 = myInteger4.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = myInteger4.multiply(myInteger8);
        boolean boolean13 = myInteger8.equals((java.lang.Object) (byte) -1);
        int int14 = myInteger8.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        int int24 = myInteger16.getIntValue();
        java.lang.String str25 = myInteger16.toString();
        java.lang.String str26 = myInteger16.toString();
        MyInteger myInteger27 = myInteger8.add(myInteger16);
        MyInteger myInteger28 = myInteger1.add(myInteger8);
        int int29 = myInteger1.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger4 and myInteger28", myInteger4.equals(myInteger28) ? myInteger4.hashCode() == myInteger28.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        MyInteger myInteger1 = new MyInteger(0);
        java.lang.String str2 = myInteger1.toString();
        MyInteger myInteger4 = new MyInteger(1);
        java.lang.String str5 = myInteger4.toString();
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger14 = myInteger7.multiply(myInteger11);
        boolean boolean16 = myInteger11.equals((java.lang.Object) (byte) -1);
        int int17 = myInteger11.getIntValue();
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        int int27 = myInteger19.getIntValue();
        java.lang.String str28 = myInteger19.toString();
        java.lang.String str29 = myInteger19.toString();
        MyInteger myInteger30 = myInteger11.add(myInteger19);
        MyInteger myInteger31 = myInteger4.add(myInteger11);
        MyInteger myInteger32 = myInteger1.multiply(myInteger11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger4 and myInteger7", myInteger4.equals(myInteger7) ? myInteger4.hashCode() == myInteger7.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.add(myInteger9);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        int int27 = myInteger19.getIntValue();
        int int28 = myInteger19.getIntValue();
        MyInteger myInteger30 = new MyInteger((int) (short) 0);
        boolean boolean32 = myInteger30.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = myInteger30.multiply(myInteger34);
        MyInteger myInteger38 = myInteger19.add(myInteger30);
        int int39 = myInteger38.getIntValue();
        boolean boolean40 = myInteger15.equals((java.lang.Object) myInteger38);
        int int41 = myInteger38.getIntValue();
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger47 = new MyInteger((int) (short) 0);
        boolean boolean49 = myInteger47.equals((java.lang.Object) 1.0f);
        MyInteger myInteger50 = myInteger43.multiply(myInteger47);
        int int51 = myInteger47.getIntValue();
        MyInteger myInteger52 = myInteger38.multiply(myInteger47);
        boolean boolean54 = myInteger47.equals((java.lang.Object) "97");
        MyInteger myInteger55 = myInteger9.multiply(myInteger47);
        MyInteger myInteger57 = new MyInteger((int) (short) 0);
        boolean boolean59 = myInteger57.equals((java.lang.Object) 1.0f);
        MyInteger myInteger61 = new MyInteger((int) (short) 0);
        boolean boolean63 = myInteger61.equals((java.lang.Object) 1.0f);
        MyInteger myInteger64 = myInteger57.multiply(myInteger61);
        MyInteger myInteger66 = new MyInteger((int) (short) 0);
        MyInteger myInteger67 = myInteger57.multiply(myInteger66);
        int int68 = myInteger57.getIntValue();
        MyInteger myInteger69 = myInteger47.add(myInteger57);
        MyInteger myInteger71 = new MyInteger(1);
        java.lang.String str72 = myInteger71.toString();
        MyInteger myInteger74 = new MyInteger((int) (short) 0);
        boolean boolean76 = myInteger74.equals((java.lang.Object) 1.0f);
        MyInteger myInteger78 = new MyInteger((int) (short) 0);
        boolean boolean80 = myInteger78.equals((java.lang.Object) 1.0f);
        MyInteger myInteger81 = myInteger74.multiply(myInteger78);
        boolean boolean83 = myInteger78.equals((java.lang.Object) (byte) -1);
        int int84 = myInteger78.getIntValue();
        MyInteger myInteger86 = new MyInteger((int) (short) 0);
        boolean boolean88 = myInteger86.equals((java.lang.Object) 1.0f);
        MyInteger myInteger90 = new MyInteger((int) (short) 0);
        boolean boolean92 = myInteger90.equals((java.lang.Object) 1.0f);
        MyInteger myInteger93 = myInteger86.multiply(myInteger90);
        int int94 = myInteger86.getIntValue();
        java.lang.String str95 = myInteger86.toString();
        java.lang.String str96 = myInteger86.toString();
        MyInteger myInteger97 = myInteger78.add(myInteger86);
        MyInteger myInteger98 = myInteger71.add(myInteger78);
        boolean boolean99 = myInteger47.equals((java.lang.Object) myInteger71);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger98", myInteger1.equals(myInteger98) ? myInteger1.hashCode() == myInteger98.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        MyInteger myInteger1 = new MyInteger((int) 'a');
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        MyInteger myInteger5 = new MyInteger((int) (short) -1);
        java.lang.String str6 = myInteger5.toString();
        MyInteger myInteger7 = myInteger3.add(myInteger5);
        boolean boolean8 = myInteger1.equals((java.lang.Object) myInteger3);
        java.lang.Class<?> wildcardClass9 = myInteger1.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger5", myInteger3.equals(myInteger5) ? myInteger3.hashCode() == myInteger5.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        MyInteger myInteger1 = new MyInteger(1);
        java.lang.String str2 = myInteger1.toString();
        MyInteger myInteger4 = new MyInteger((int) (short) 0);
        boolean boolean6 = myInteger4.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger15 = myInteger8.multiply(myInteger12);
        int int16 = myInteger8.getIntValue();
        int int17 = myInteger8.getIntValue();
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        MyInteger myInteger27 = myInteger8.add(myInteger19);
        MyInteger myInteger28 = myInteger4.multiply(myInteger27);
        java.lang.String str29 = myInteger4.toString();
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger42 = myInteger35.multiply(myInteger39);
        int int43 = myInteger35.getIntValue();
        int int44 = myInteger35.getIntValue();
        MyInteger myInteger46 = new MyInteger((int) (short) 0);
        boolean boolean48 = myInteger46.equals((java.lang.Object) 1.0f);
        MyInteger myInteger50 = new MyInteger((int) (short) 0);
        boolean boolean52 = myInteger50.equals((java.lang.Object) 1.0f);
        MyInteger myInteger53 = myInteger46.multiply(myInteger50);
        MyInteger myInteger54 = myInteger35.add(myInteger46);
        MyInteger myInteger55 = myInteger31.multiply(myInteger54);
        MyInteger myInteger56 = myInteger4.multiply(myInteger55);
        MyInteger myInteger57 = myInteger1.multiply(myInteger56);
        java.lang.Class<?> wildcardClass58 = myInteger56.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger4", myInteger1.equals(myInteger4) ? myInteger1.hashCode() == myInteger4.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        java.lang.String str3 = myInteger1.toString();
        int int4 = myInteger1.getIntValue();
        MyInteger myInteger6 = new MyInteger((int) (short) 0);
        boolean boolean8 = myInteger6.equals((java.lang.Object) 1.0f);
        int int9 = myInteger6.getIntValue();
        MyInteger myInteger10 = myInteger1.add(myInteger6);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = myInteger12.multiply(myInteger16);
        int int20 = myInteger12.getIntValue();
        java.lang.String str21 = myInteger12.toString();
        boolean boolean22 = myInteger1.equals((java.lang.Object) myInteger12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger6 and myInteger10", myInteger6.equals(myInteger10) ? myInteger6.hashCode() == myInteger10.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        int int2 = myInteger1.getIntValue();
        MyInteger myInteger4 = new MyInteger((int) (short) 0);
        boolean boolean6 = myInteger4.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger15 = myInteger8.multiply(myInteger12);
        MyInteger myInteger16 = myInteger4.add(myInteger12);
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = new MyInteger((int) (short) 0);
        boolean boolean28 = myInteger26.equals((java.lang.Object) 1.0f);
        MyInteger myInteger29 = myInteger22.multiply(myInteger26);
        int int30 = myInteger22.getIntValue();
        int int31 = myInteger22.getIntValue();
        MyInteger myInteger33 = new MyInteger((int) (short) 0);
        boolean boolean35 = myInteger33.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = new MyInteger((int) (short) 0);
        boolean boolean39 = myInteger37.equals((java.lang.Object) 1.0f);
        MyInteger myInteger40 = myInteger33.multiply(myInteger37);
        MyInteger myInteger41 = myInteger22.add(myInteger33);
        int int42 = myInteger41.getIntValue();
        boolean boolean43 = myInteger18.equals((java.lang.Object) myInteger41);
        int int44 = myInteger41.getIntValue();
        MyInteger myInteger46 = new MyInteger((int) (short) 0);
        boolean boolean48 = myInteger46.equals((java.lang.Object) 1.0f);
        MyInteger myInteger50 = new MyInteger((int) (short) 0);
        boolean boolean52 = myInteger50.equals((java.lang.Object) 1.0f);
        MyInteger myInteger53 = myInteger46.multiply(myInteger50);
        int int54 = myInteger50.getIntValue();
        MyInteger myInteger55 = myInteger41.multiply(myInteger50);
        boolean boolean57 = myInteger50.equals((java.lang.Object) "97");
        MyInteger myInteger58 = myInteger12.multiply(myInteger50);
        MyInteger myInteger60 = new MyInteger((int) (short) 0);
        boolean boolean62 = myInteger60.equals((java.lang.Object) 1.0f);
        MyInteger myInteger64 = new MyInteger((int) (short) 0);
        boolean boolean66 = myInteger64.equals((java.lang.Object) 1.0f);
        MyInteger myInteger67 = myInteger60.multiply(myInteger64);
        MyInteger myInteger69 = new MyInteger((int) (short) 0);
        MyInteger myInteger70 = myInteger60.multiply(myInteger69);
        int int71 = myInteger60.getIntValue();
        MyInteger myInteger72 = myInteger50.add(myInteger60);
        MyInteger myInteger73 = myInteger1.add(myInteger60);
        MyInteger myInteger75 = new MyInteger((int) (byte) 10);
        MyInteger myInteger77 = new MyInteger((int) (short) 0);
        boolean boolean79 = myInteger77.equals((java.lang.Object) 1.0f);
        MyInteger myInteger81 = new MyInteger((int) (short) 0);
        boolean boolean83 = myInteger81.equals((java.lang.Object) 1.0f);
        MyInteger myInteger84 = myInteger77.multiply(myInteger81);
        MyInteger myInteger86 = new MyInteger((int) (short) 0);
        MyInteger myInteger87 = myInteger77.multiply(myInteger86);
        boolean boolean89 = myInteger77.equals((java.lang.Object) '4');
        MyInteger myInteger90 = myInteger75.add(myInteger77);
        MyInteger myInteger91 = myInteger73.add(myInteger90);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger75", myInteger1.equals(myInteger75) ? myInteger1.hashCode() == myInteger75.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        MyInteger myInteger11 = myInteger1.multiply(myInteger10);
        java.lang.String str12 = myInteger1.toString();
        MyInteger myInteger14 = new MyInteger((int) (short) 0);
        boolean boolean16 = myInteger14.equals((java.lang.Object) 1.0f);
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger21 = myInteger14.multiply(myInteger18);
        int int22 = myInteger14.getIntValue();
        java.lang.String str23 = myInteger14.toString();
        boolean boolean25 = myInteger14.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger26 = myInteger1.multiply(myInteger14);
        MyInteger myInteger28 = new MyInteger((int) (short) 10);
        MyInteger myInteger30 = new MyInteger((int) (short) 0);
        boolean boolean32 = myInteger30.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger38 = new MyInteger((int) (short) 0);
        boolean boolean40 = myInteger38.equals((java.lang.Object) 1.0f);
        MyInteger myInteger41 = myInteger34.multiply(myInteger38);
        MyInteger myInteger42 = myInteger30.multiply(myInteger34);
        boolean boolean43 = myInteger28.equals((java.lang.Object) myInteger30);
        MyInteger myInteger44 = myInteger14.multiply(myInteger28);
        java.lang.String str45 = myInteger14.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger28", myInteger1.equals(myInteger28) ? myInteger1.hashCode() == myInteger28.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        MyInteger myInteger1 = new MyInteger((int) (byte) 1);
        MyInteger myInteger3 = new MyInteger((int) 'a');
        MyInteger myInteger4 = myInteger1.multiply(myInteger3);
        MyInteger myInteger6 = new MyInteger((int) (short) 0);
        boolean boolean8 = myInteger6.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        boolean boolean12 = myInteger10.equals((java.lang.Object) 1.0f);
        MyInteger myInteger13 = myInteger6.multiply(myInteger10);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        MyInteger myInteger16 = myInteger6.multiply(myInteger15);
        java.lang.String str17 = myInteger6.toString();
        MyInteger myInteger18 = myInteger4.add(myInteger6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger3", myInteger1.equals(myInteger3) ? myInteger1.hashCode() == myInteger3.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        int int2 = myInteger1.getIntValue();
        java.lang.String str3 = myInteger1.toString();
        int int4 = myInteger1.getIntValue();
        MyInteger myInteger6 = new MyInteger((int) '4');
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger15 = myInteger8.multiply(myInteger12);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        MyInteger myInteger18 = myInteger8.multiply(myInteger17);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger24 = new MyInteger((int) (short) 0);
        boolean boolean26 = myInteger24.equals((java.lang.Object) 1.0f);
        MyInteger myInteger28 = new MyInteger((int) (short) 0);
        boolean boolean30 = myInteger28.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = myInteger24.multiply(myInteger28);
        int int32 = myInteger24.getIntValue();
        int int33 = myInteger24.getIntValue();
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger42 = myInteger35.multiply(myInteger39);
        MyInteger myInteger43 = myInteger24.add(myInteger35);
        int int44 = myInteger43.getIntValue();
        boolean boolean45 = myInteger20.equals((java.lang.Object) myInteger43);
        MyInteger myInteger46 = myInteger17.multiply(myInteger20);
        MyInteger myInteger48 = new MyInteger((int) (short) 0);
        boolean boolean50 = myInteger48.equals((java.lang.Object) 1.0f);
        MyInteger myInteger52 = new MyInteger((int) (short) 0);
        boolean boolean54 = myInteger52.equals((java.lang.Object) 1.0f);
        MyInteger myInteger55 = myInteger48.multiply(myInteger52);
        MyInteger myInteger57 = new MyInteger((int) (short) 0);
        MyInteger myInteger58 = myInteger48.multiply(myInteger57);
        java.lang.String str59 = myInteger48.toString();
        MyInteger myInteger61 = new MyInteger((int) (short) 0);
        boolean boolean63 = myInteger61.equals((java.lang.Object) 1.0f);
        MyInteger myInteger65 = new MyInteger((int) (short) 0);
        boolean boolean67 = myInteger65.equals((java.lang.Object) 1.0f);
        MyInteger myInteger68 = myInteger61.multiply(myInteger65);
        int int69 = myInteger61.getIntValue();
        java.lang.String str70 = myInteger61.toString();
        boolean boolean72 = myInteger61.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger73 = myInteger48.multiply(myInteger61);
        MyInteger myInteger74 = myInteger17.add(myInteger61);
        MyInteger myInteger75 = myInteger6.add(myInteger61);
        MyInteger myInteger76 = myInteger1.multiply(myInteger6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger8 and myInteger75", myInteger8.equals(myInteger75) ? myInteger8.hashCode() == myInteger75.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        MyInteger myInteger4 = new MyInteger((int) (short) 0);
        boolean boolean6 = myInteger4.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger15 = myInteger8.multiply(myInteger12);
        int int16 = myInteger8.getIntValue();
        int int17 = myInteger8.getIntValue();
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        MyInteger myInteger27 = myInteger8.add(myInteger19);
        MyInteger myInteger28 = myInteger4.multiply(myInteger27);
        MyInteger myInteger29 = myInteger1.add(myInteger28);
        MyInteger myInteger31 = new MyInteger((int) (short) -1);
        int int32 = myInteger31.getIntValue();
        MyInteger myInteger34 = new MyInteger((int) (short) -1);
        java.lang.String str35 = myInteger34.toString();
        MyInteger myInteger36 = myInteger31.add(myInteger34);
        MyInteger myInteger38 = new MyInteger((int) (short) -1);
        MyInteger myInteger39 = myInteger36.multiply(myInteger38);
        MyInteger myInteger40 = myInteger29.add(myInteger36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger4", myInteger1.equals(myInteger4) ? myInteger1.hashCode() == myInteger4.hashCode() : true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.add(myInteger9);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        MyInteger myInteger27 = myInteger15.multiply(myInteger19);
        MyInteger myInteger29 = new MyInteger((int) (short) -1);
        java.lang.String str30 = myInteger29.toString();
        java.lang.String str31 = myInteger29.toString();
        MyInteger myInteger32 = myInteger19.multiply(myInteger29);
        MyInteger myInteger33 = myInteger1.multiply(myInteger29);
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger42 = myInteger35.multiply(myInteger39);
        boolean boolean44 = myInteger39.equals((java.lang.Object) (byte) -1);
        int int45 = myInteger39.getIntValue();
        MyInteger myInteger47 = new MyInteger((int) (short) 0);
        boolean boolean49 = myInteger47.equals((java.lang.Object) 1.0f);
        MyInteger myInteger51 = new MyInteger((int) (short) 0);
        boolean boolean53 = myInteger51.equals((java.lang.Object) 1.0f);
        MyInteger myInteger54 = myInteger47.multiply(myInteger51);
        int int55 = myInteger47.getIntValue();
        java.lang.String str56 = myInteger47.toString();
        java.lang.String str57 = myInteger47.toString();
        MyInteger myInteger58 = myInteger39.add(myInteger47);
        java.lang.String str59 = myInteger39.toString();
        MyInteger myInteger60 = myInteger33.add(myInteger39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger29", myInteger1.equals(myInteger29) ? myInteger1.hashCode() == myInteger29.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.add(myInteger9);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        MyInteger myInteger27 = myInteger15.multiply(myInteger19);
        MyInteger myInteger29 = new MyInteger((int) (short) -1);
        java.lang.String str30 = myInteger29.toString();
        java.lang.String str31 = myInteger29.toString();
        MyInteger myInteger32 = myInteger19.multiply(myInteger29);
        MyInteger myInteger33 = myInteger1.multiply(myInteger29);
        java.lang.String str34 = myInteger33.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger29", myInteger1.equals(myInteger29) ? myInteger1.hashCode() == myInteger29.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = myInteger3.multiply(myInteger7);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        MyInteger myInteger13 = myInteger3.multiply(myInteger12);
        boolean boolean15 = myInteger3.equals((java.lang.Object) '4');
        MyInteger myInteger16 = myInteger1.add(myInteger3);
        int int17 = myInteger1.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger16", myInteger3.equals(myInteger16) ? myInteger3.hashCode() == myInteger16.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        MyInteger myInteger1 = new MyInteger(1);
        java.lang.String str2 = myInteger1.toString();
        MyInteger myInteger4 = new MyInteger((int) (short) 0);
        boolean boolean6 = myInteger4.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger15 = myInteger8.multiply(myInteger12);
        int int16 = myInteger8.getIntValue();
        int int17 = myInteger8.getIntValue();
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        MyInteger myInteger27 = myInteger8.add(myInteger19);
        MyInteger myInteger28 = myInteger4.multiply(myInteger27);
        java.lang.String str29 = myInteger4.toString();
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger42 = myInteger35.multiply(myInteger39);
        int int43 = myInteger35.getIntValue();
        int int44 = myInteger35.getIntValue();
        MyInteger myInteger46 = new MyInteger((int) (short) 0);
        boolean boolean48 = myInteger46.equals((java.lang.Object) 1.0f);
        MyInteger myInteger50 = new MyInteger((int) (short) 0);
        boolean boolean52 = myInteger50.equals((java.lang.Object) 1.0f);
        MyInteger myInteger53 = myInteger46.multiply(myInteger50);
        MyInteger myInteger54 = myInteger35.add(myInteger46);
        MyInteger myInteger55 = myInteger31.multiply(myInteger54);
        MyInteger myInteger56 = myInteger4.multiply(myInteger55);
        MyInteger myInteger57 = myInteger1.multiply(myInteger56);
        MyInteger myInteger59 = new MyInteger((int) (short) 0);
        boolean boolean61 = myInteger59.equals((java.lang.Object) 1.0f);
        MyInteger myInteger63 = new MyInteger((int) (short) 0);
        boolean boolean65 = myInteger63.equals((java.lang.Object) 1.0f);
        MyInteger myInteger66 = myInteger59.multiply(myInteger63);
        boolean boolean68 = myInteger63.equals((java.lang.Object) (byte) -1);
        int int69 = myInteger63.getIntValue();
        MyInteger myInteger71 = new MyInteger((int) (short) 0);
        boolean boolean73 = myInteger71.equals((java.lang.Object) 1.0f);
        MyInteger myInteger75 = new MyInteger((int) (short) 0);
        boolean boolean77 = myInteger75.equals((java.lang.Object) 1.0f);
        MyInteger myInteger78 = myInteger71.multiply(myInteger75);
        int int79 = myInteger71.getIntValue();
        java.lang.String str80 = myInteger71.toString();
        java.lang.String str81 = myInteger71.toString();
        MyInteger myInteger82 = myInteger63.add(myInteger71);
        java.lang.String str83 = myInteger63.toString();
        MyInteger myInteger84 = myInteger1.add(myInteger63);
        int int85 = myInteger63.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger4", myInteger1.equals(myInteger4) ? myInteger1.hashCode() == myInteger4.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        boolean boolean10 = myInteger5.equals((java.lang.Object) (byte) -1);
        int int11 = myInteger5.getIntValue();
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = myInteger13.multiply(myInteger17);
        int int21 = myInteger13.getIntValue();
        java.lang.String str22 = myInteger13.toString();
        java.lang.String str23 = myInteger13.toString();
        MyInteger myInteger24 = myInteger5.add(myInteger13);
        MyInteger myInteger26 = new MyInteger((int) (short) 0);
        boolean boolean28 = myInteger26.equals((java.lang.Object) 1.0f);
        int int29 = myInteger26.getIntValue();
        java.lang.String str30 = myInteger26.toString();
        MyInteger myInteger31 = myInteger5.add(myInteger26);
        MyInteger myInteger33 = new MyInteger((int) (short) 0);
        boolean boolean35 = myInteger33.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = new MyInteger((int) (short) 0);
        boolean boolean39 = myInteger37.equals((java.lang.Object) 1.0f);
        MyInteger myInteger40 = myInteger33.multiply(myInteger37);
        MyInteger myInteger42 = new MyInteger((int) (short) 0);
        MyInteger myInteger43 = myInteger33.multiply(myInteger42);
        int int44 = myInteger33.getIntValue();
        MyInteger myInteger45 = myInteger5.multiply(myInteger33);
        MyInteger myInteger47 = new MyInteger((int) (short) 0);
        boolean boolean49 = myInteger47.equals((java.lang.Object) 1.0f);
        MyInteger myInteger51 = new MyInteger((int) (short) 0);
        boolean boolean53 = myInteger51.equals((java.lang.Object) 1.0f);
        MyInteger myInteger55 = new MyInteger((int) (short) 0);
        boolean boolean57 = myInteger55.equals((java.lang.Object) 1.0f);
        MyInteger myInteger58 = myInteger51.multiply(myInteger55);
        MyInteger myInteger59 = myInteger47.add(myInteger55);
        MyInteger myInteger61 = new MyInteger((int) (short) 0);
        boolean boolean63 = myInteger61.equals((java.lang.Object) 1.0f);
        MyInteger myInteger65 = new MyInteger((int) (short) 0);
        boolean boolean67 = myInteger65.equals((java.lang.Object) 1.0f);
        MyInteger myInteger69 = new MyInteger((int) (short) 0);
        boolean boolean71 = myInteger69.equals((java.lang.Object) 1.0f);
        MyInteger myInteger72 = myInteger65.multiply(myInteger69);
        MyInteger myInteger73 = myInteger61.multiply(myInteger65);
        MyInteger myInteger75 = new MyInteger((int) (short) -1);
        java.lang.String str76 = myInteger75.toString();
        java.lang.String str77 = myInteger75.toString();
        MyInteger myInteger78 = myInteger65.multiply(myInteger75);
        MyInteger myInteger79 = myInteger47.multiply(myInteger75);
        MyInteger myInteger80 = myInteger5.multiply(myInteger47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger75", myInteger1.equals(myInteger75) ? myInteger1.hashCode() == myInteger75.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        MyInteger myInteger11 = myInteger1.multiply(myInteger10);
        java.lang.String str12 = myInteger1.toString();
        MyInteger myInteger14 = new MyInteger((int) (short) 0);
        boolean boolean16 = myInteger14.equals((java.lang.Object) 1.0f);
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger21 = myInteger14.multiply(myInteger18);
        int int22 = myInteger14.getIntValue();
        java.lang.String str23 = myInteger14.toString();
        boolean boolean25 = myInteger14.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger26 = myInteger1.multiply(myInteger14);
        MyInteger myInteger28 = new MyInteger((int) (short) 10);
        MyInteger myInteger30 = new MyInteger((int) (short) 0);
        boolean boolean32 = myInteger30.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger38 = new MyInteger((int) (short) 0);
        boolean boolean40 = myInteger38.equals((java.lang.Object) 1.0f);
        MyInteger myInteger41 = myInteger34.multiply(myInteger38);
        MyInteger myInteger42 = myInteger30.multiply(myInteger34);
        boolean boolean43 = myInteger28.equals((java.lang.Object) myInteger30);
        MyInteger myInteger44 = myInteger14.multiply(myInteger28);
        int int45 = myInteger44.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger28", myInteger1.equals(myInteger28) ? myInteger1.hashCode() == myInteger28.hashCode() : true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        MyInteger myInteger1 = new MyInteger(10);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = myInteger3.multiply(myInteger7);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        MyInteger myInteger13 = myInteger3.multiply(myInteger12);
        java.lang.String str14 = myInteger3.toString();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        int int24 = myInteger16.getIntValue();
        java.lang.String str25 = myInteger16.toString();
        boolean boolean27 = myInteger16.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger28 = myInteger3.multiply(myInteger16);
        MyInteger myInteger29 = myInteger1.add(myInteger3);
        int int30 = myInteger1.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger29", myInteger3.equals(myInteger29) ? myInteger3.hashCode() == myInteger29.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        boolean boolean4 = myInteger1.equals((java.lang.Object) (-1));
        MyInteger myInteger6 = new MyInteger((int) (short) 0);
        boolean boolean8 = myInteger6.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        boolean boolean12 = myInteger10.equals((java.lang.Object) 1.0f);
        MyInteger myInteger13 = myInteger6.multiply(myInteger10);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        MyInteger myInteger16 = myInteger6.multiply(myInteger15);
        java.lang.String str17 = myInteger6.toString();
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        int int27 = myInteger19.getIntValue();
        java.lang.String str28 = myInteger19.toString();
        boolean boolean30 = myInteger19.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger31 = myInteger6.multiply(myInteger19);
        boolean boolean32 = myInteger1.equals((java.lang.Object) myInteger19);
        int int33 = myInteger1.getIntValue();
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger46 = myInteger39.multiply(myInteger43);
        MyInteger myInteger47 = myInteger35.add(myInteger43);
        int int48 = myInteger47.getIntValue();
        MyInteger myInteger49 = myInteger1.add(myInteger47);
        int int50 = myInteger1.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger6 and myInteger49", myInteger6.equals(myInteger49) ? myInteger6.hashCode() == myInteger49.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        MyInteger myInteger4 = new MyInteger((int) (short) 0);
        boolean boolean6 = myInteger4.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger15 = myInteger8.multiply(myInteger12);
        int int16 = myInteger8.getIntValue();
        int int17 = myInteger8.getIntValue();
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        MyInteger myInteger27 = myInteger8.add(myInteger19);
        MyInteger myInteger28 = myInteger4.multiply(myInteger27);
        MyInteger myInteger29 = myInteger1.add(myInteger28);
        java.lang.String str30 = myInteger29.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger4", myInteger1.equals(myInteger4) ? myInteger1.hashCode() == myInteger4.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.add(myInteger9);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        MyInteger myInteger27 = myInteger15.multiply(myInteger19);
        MyInteger myInteger29 = new MyInteger((int) (short) -1);
        java.lang.String str30 = myInteger29.toString();
        java.lang.String str31 = myInteger29.toString();
        MyInteger myInteger32 = myInteger19.multiply(myInteger29);
        MyInteger myInteger33 = myInteger1.multiply(myInteger29);
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger42 = myInteger35.multiply(myInteger39);
        int int43 = myInteger35.getIntValue();
        java.lang.String str44 = myInteger35.toString();
        java.lang.String str45 = myInteger35.toString();
        MyInteger myInteger46 = myInteger29.add(myInteger35);
        java.lang.String str47 = myInteger46.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger29", myInteger1.equals(myInteger29) ? myInteger1.hashCode() == myInteger29.hashCode() : true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        java.lang.String str3 = myInteger1.toString();
        int int4 = myInteger1.getIntValue();
        MyInteger myInteger6 = new MyInteger((int) (short) 0);
        boolean boolean8 = myInteger6.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        boolean boolean12 = myInteger10.equals((java.lang.Object) 1.0f);
        MyInteger myInteger14 = new MyInteger((int) (short) 0);
        boolean boolean16 = myInteger14.equals((java.lang.Object) 1.0f);
        MyInteger myInteger17 = myInteger10.multiply(myInteger14);
        int int18 = myInteger10.getIntValue();
        int int19 = myInteger10.getIntValue();
        MyInteger myInteger21 = new MyInteger((int) (short) 0);
        boolean boolean23 = myInteger21.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = new MyInteger((int) (short) 0);
        boolean boolean27 = myInteger25.equals((java.lang.Object) 1.0f);
        MyInteger myInteger28 = myInteger21.multiply(myInteger25);
        MyInteger myInteger29 = myInteger10.add(myInteger21);
        int int30 = myInteger29.getIntValue();
        boolean boolean31 = myInteger6.equals((java.lang.Object) myInteger29);
        MyInteger myInteger32 = myInteger1.add(myInteger6);
        int int33 = myInteger1.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger6 and myInteger32", myInteger6.equals(myInteger32) ? myInteger6.hashCode() == myInteger32.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = myInteger3.multiply(myInteger7);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        MyInteger myInteger13 = myInteger3.multiply(myInteger12);
        boolean boolean15 = myInteger3.equals((java.lang.Object) '4');
        MyInteger myInteger16 = myInteger1.add(myInteger3);
        java.lang.Class<?> wildcardClass17 = myInteger16.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger3", myInteger1.equals(myInteger3) ? myInteger1.hashCode() == myInteger3.hashCode() : true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        int int2 = myInteger1.getIntValue();
        MyInteger myInteger4 = new MyInteger((int) (short) -1);
        java.lang.String str5 = myInteger4.toString();
        MyInteger myInteger6 = myInteger1.add(myInteger4);
        java.lang.Class<?> wildcardClass7 = myInteger1.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger4 and myInteger6", myInteger4.equals(myInteger6) ? myInteger4.hashCode() == myInteger6.hashCode() : true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        int int3 = myInteger1.getIntValue();
        MyInteger myInteger5 = new MyInteger((int) (short) 10);
        MyInteger myInteger6 = myInteger1.multiply(myInteger5);
        java.lang.String str7 = myInteger1.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger5 and myInteger6", myInteger5.equals(myInteger6) ? myInteger5.hashCode() == myInteger6.hashCode() : true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.multiply(myInteger5);
        MyInteger myInteger15 = new MyInteger((int) (short) -1);
        java.lang.String str16 = myInteger15.toString();
        java.lang.String str17 = myInteger15.toString();
        MyInteger myInteger18 = myInteger5.multiply(myInteger15);
        boolean boolean20 = myInteger5.equals((java.lang.Object) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger15", myInteger1.equals(myInteger15) ? myInteger1.hashCode() == myInteger15.hashCode() : true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.add(myInteger9);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        MyInteger myInteger27 = myInteger15.multiply(myInteger19);
        MyInteger myInteger29 = new MyInteger((int) (short) -1);
        java.lang.String str30 = myInteger29.toString();
        java.lang.String str31 = myInteger29.toString();
        MyInteger myInteger32 = myInteger19.multiply(myInteger29);
        MyInteger myInteger33 = myInteger1.multiply(myInteger29);
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger42 = myInteger35.multiply(myInteger39);
        int int43 = myInteger35.getIntValue();
        java.lang.String str44 = myInteger35.toString();
        java.lang.String str45 = myInteger35.toString();
        MyInteger myInteger46 = myInteger29.add(myInteger35);
        MyInteger myInteger48 = new MyInteger((int) (short) 100);
        MyInteger myInteger49 = myInteger35.add(myInteger48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger29", myInteger1.equals(myInteger29) ? myInteger1.hashCode() == myInteger29.hashCode() : true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        MyInteger myInteger1 = new MyInteger((int) ' ');
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = myInteger3.multiply(myInteger7);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        MyInteger myInteger13 = myInteger3.multiply(myInteger12);
        java.lang.String str14 = myInteger3.toString();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        int int24 = myInteger16.getIntValue();
        java.lang.String str25 = myInteger16.toString();
        boolean boolean27 = myInteger16.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger28 = myInteger3.multiply(myInteger16);
        MyInteger myInteger29 = myInteger1.add(myInteger28);
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger38 = myInteger31.multiply(myInteger35);
        MyInteger myInteger40 = new MyInteger((int) (short) 0);
        MyInteger myInteger41 = myInteger31.multiply(myInteger40);
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger47 = new MyInteger((int) (short) 0);
        boolean boolean49 = myInteger47.equals((java.lang.Object) 1.0f);
        MyInteger myInteger51 = new MyInteger((int) (short) 0);
        boolean boolean53 = myInteger51.equals((java.lang.Object) 1.0f);
        MyInteger myInteger54 = myInteger47.multiply(myInteger51);
        int int55 = myInteger47.getIntValue();
        int int56 = myInteger47.getIntValue();
        MyInteger myInteger58 = new MyInteger((int) (short) 0);
        boolean boolean60 = myInteger58.equals((java.lang.Object) 1.0f);
        MyInteger myInteger62 = new MyInteger((int) (short) 0);
        boolean boolean64 = myInteger62.equals((java.lang.Object) 1.0f);
        MyInteger myInteger65 = myInteger58.multiply(myInteger62);
        MyInteger myInteger66 = myInteger47.add(myInteger58);
        int int67 = myInteger66.getIntValue();
        boolean boolean68 = myInteger43.equals((java.lang.Object) myInteger66);
        MyInteger myInteger69 = myInteger40.multiply(myInteger43);
        MyInteger myInteger71 = new MyInteger((int) (short) 0);
        boolean boolean73 = myInteger71.equals((java.lang.Object) 1.0f);
        MyInteger myInteger75 = new MyInteger((int) (short) 0);
        boolean boolean77 = myInteger75.equals((java.lang.Object) 1.0f);
        MyInteger myInteger78 = myInteger71.multiply(myInteger75);
        int int79 = myInteger71.getIntValue();
        java.lang.String str80 = myInteger71.toString();
        java.lang.String str81 = myInteger71.toString();
        boolean boolean82 = myInteger40.equals((java.lang.Object) str81);
        MyInteger myInteger83 = myInteger1.multiply(myInteger40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger29", myInteger3.equals(myInteger29) ? myInteger3.hashCode() == myInteger29.hashCode() : true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        boolean boolean10 = myInteger5.equals((java.lang.Object) (byte) -1);
        int int11 = myInteger5.getIntValue();
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = myInteger13.multiply(myInteger17);
        int int21 = myInteger13.getIntValue();
        java.lang.String str22 = myInteger13.toString();
        java.lang.String str23 = myInteger13.toString();
        MyInteger myInteger24 = myInteger5.add(myInteger13);
        int int25 = myInteger13.getIntValue();
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = myInteger27.multiply(myInteger31);
        boolean boolean35 = myInteger13.equals((java.lang.Object) myInteger31);
        MyInteger myInteger37 = new MyInteger((int) (short) 0);
        boolean boolean39 = myInteger37.equals((java.lang.Object) 1.0f);
        MyInteger myInteger41 = new MyInteger((int) (short) 0);
        boolean boolean43 = myInteger41.equals((java.lang.Object) 1.0f);
        MyInteger myInteger45 = new MyInteger((int) (short) 0);
        boolean boolean47 = myInteger45.equals((java.lang.Object) 1.0f);
        MyInteger myInteger48 = myInteger41.multiply(myInteger45);
        MyInteger myInteger49 = myInteger37.add(myInteger45);
        MyInteger myInteger51 = new MyInteger((int) (short) 0);
        boolean boolean53 = myInteger51.equals((java.lang.Object) 1.0f);
        MyInteger myInteger55 = new MyInteger((int) (short) 0);
        boolean boolean57 = myInteger55.equals((java.lang.Object) 1.0f);
        MyInteger myInteger59 = new MyInteger((int) (short) 0);
        boolean boolean61 = myInteger59.equals((java.lang.Object) 1.0f);
        MyInteger myInteger62 = myInteger55.multiply(myInteger59);
        int int63 = myInteger55.getIntValue();
        int int64 = myInteger55.getIntValue();
        MyInteger myInteger66 = new MyInteger((int) (short) 0);
        boolean boolean68 = myInteger66.equals((java.lang.Object) 1.0f);
        MyInteger myInteger70 = new MyInteger((int) (short) 0);
        boolean boolean72 = myInteger70.equals((java.lang.Object) 1.0f);
        MyInteger myInteger73 = myInteger66.multiply(myInteger70);
        MyInteger myInteger74 = myInteger55.add(myInteger66);
        int int75 = myInteger74.getIntValue();
        boolean boolean76 = myInteger51.equals((java.lang.Object) myInteger74);
        int int77 = myInteger74.getIntValue();
        MyInteger myInteger79 = new MyInteger((int) (short) 0);
        boolean boolean81 = myInteger79.equals((java.lang.Object) 1.0f);
        MyInteger myInteger83 = new MyInteger((int) (short) 0);
        boolean boolean85 = myInteger83.equals((java.lang.Object) 1.0f);
        MyInteger myInteger86 = myInteger79.multiply(myInteger83);
        int int87 = myInteger83.getIntValue();
        MyInteger myInteger88 = myInteger74.multiply(myInteger83);
        boolean boolean90 = myInteger83.equals((java.lang.Object) "97");
        MyInteger myInteger91 = myInteger45.multiply(myInteger83);
        MyInteger myInteger92 = myInteger31.add(myInteger91);
        MyInteger myInteger94 = new MyInteger((int) (byte) 10);
        MyInteger myInteger95 = myInteger31.multiply(myInteger94);
        java.lang.Class<?> wildcardClass96 = myInteger95.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger94", myInteger1.equals(myInteger94) ? myInteger1.hashCode() == myInteger94.hashCode() : true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = myInteger3.multiply(myInteger7);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        MyInteger myInteger13 = myInteger3.multiply(myInteger12);
        boolean boolean15 = myInteger3.equals((java.lang.Object) '4');
        MyInteger myInteger16 = myInteger1.add(myInteger3);
        MyInteger myInteger18 = new MyInteger((int) (short) 10);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger24 = new MyInteger((int) (short) 0);
        boolean boolean26 = myInteger24.equals((java.lang.Object) 1.0f);
        MyInteger myInteger28 = new MyInteger((int) (short) 0);
        boolean boolean30 = myInteger28.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = myInteger24.multiply(myInteger28);
        MyInteger myInteger32 = myInteger20.multiply(myInteger24);
        boolean boolean33 = myInteger18.equals((java.lang.Object) myInteger20);
        MyInteger myInteger34 = myInteger16.add(myInteger20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger3", myInteger1.equals(myInteger3) ? myInteger1.hashCode() == myInteger3.hashCode() : true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        MyInteger myInteger1 = new MyInteger((int) ' ');
        MyInteger myInteger3 = new MyInteger((int) 'a');
        int int4 = myInteger3.getIntValue();
        MyInteger myInteger5 = myInteger1.multiply(myInteger3);
        java.lang.Object obj6 = null;
        boolean boolean7 = myInteger3.equals(obj6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger5", myInteger1.equals(myInteger5) ? myInteger1.hashCode() == myInteger5.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        MyInteger myInteger1 = new MyInteger(10);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger14 = myInteger7.multiply(myInteger11);
        int int15 = myInteger7.getIntValue();
        int int16 = myInteger7.getIntValue();
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = myInteger18.multiply(myInteger22);
        MyInteger myInteger26 = myInteger7.add(myInteger18);
        int int27 = myInteger26.getIntValue();
        boolean boolean28 = myInteger3.equals((java.lang.Object) myInteger26);
        int int29 = myInteger26.getIntValue();
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger38 = myInteger31.multiply(myInteger35);
        int int39 = myInteger35.getIntValue();
        MyInteger myInteger40 = myInteger26.multiply(myInteger35);
        MyInteger myInteger42 = new MyInteger((int) (short) 0);
        boolean boolean44 = myInteger42.equals((java.lang.Object) 1.0f);
        MyInteger myInteger46 = new MyInteger((int) (short) 0);
        boolean boolean48 = myInteger46.equals((java.lang.Object) 1.0f);
        MyInteger myInteger50 = new MyInteger((int) (short) 0);
        boolean boolean52 = myInteger50.equals((java.lang.Object) 1.0f);
        MyInteger myInteger53 = myInteger46.multiply(myInteger50);
        MyInteger myInteger54 = myInteger42.add(myInteger50);
        int int55 = myInteger54.getIntValue();
        MyInteger myInteger56 = myInteger35.add(myInteger54);
        boolean boolean57 = myInteger1.equals((java.lang.Object) myInteger54);
        int int58 = myInteger54.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger3", myInteger1.equals(myInteger3) ? myInteger1.hashCode() == myInteger3.hashCode() : true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        int int3 = myInteger1.getIntValue();
        MyInteger myInteger5 = new MyInteger((int) (short) 10);
        MyInteger myInteger6 = myInteger1.multiply(myInteger5);
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = myInteger12.multiply(myInteger16);
        int int20 = myInteger12.getIntValue();
        int int21 = myInteger12.getIntValue();
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger30 = myInteger23.multiply(myInteger27);
        MyInteger myInteger31 = myInteger12.add(myInteger23);
        MyInteger myInteger32 = myInteger8.multiply(myInteger31);
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger38 = new MyInteger((int) (short) 0);
        boolean boolean40 = myInteger38.equals((java.lang.Object) 1.0f);
        MyInteger myInteger41 = myInteger34.multiply(myInteger38);
        java.lang.Class<?> wildcardClass42 = myInteger38.getClass();
        boolean boolean43 = myInteger32.equals((java.lang.Object) wildcardClass42);
        MyInteger myInteger45 = new MyInteger((int) (short) 0);
        boolean boolean47 = myInteger45.equals((java.lang.Object) 1.0f);
        MyInteger myInteger49 = new MyInteger((int) (short) 0);
        boolean boolean51 = myInteger49.equals((java.lang.Object) 1.0f);
        MyInteger myInteger53 = new MyInteger((int) (short) 0);
        boolean boolean55 = myInteger53.equals((java.lang.Object) 1.0f);
        MyInteger myInteger56 = myInteger49.multiply(myInteger53);
        MyInteger myInteger57 = myInteger45.add(myInteger53);
        MyInteger myInteger59 = new MyInteger((int) (short) 0);
        boolean boolean61 = myInteger59.equals((java.lang.Object) 1.0f);
        MyInteger myInteger63 = new MyInteger((int) (short) 0);
        boolean boolean65 = myInteger63.equals((java.lang.Object) 1.0f);
        MyInteger myInteger67 = new MyInteger((int) (short) 0);
        boolean boolean69 = myInteger67.equals((java.lang.Object) 1.0f);
        MyInteger myInteger70 = myInteger63.multiply(myInteger67);
        MyInteger myInteger71 = myInteger59.multiply(myInteger63);
        MyInteger myInteger73 = new MyInteger((int) (short) -1);
        java.lang.String str74 = myInteger73.toString();
        java.lang.String str75 = myInteger73.toString();
        MyInteger myInteger76 = myInteger63.multiply(myInteger73);
        MyInteger myInteger77 = myInteger45.multiply(myInteger73);
        boolean boolean78 = myInteger32.equals((java.lang.Object) myInteger73);
        MyInteger myInteger79 = myInteger6.multiply(myInteger32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger5", myInteger1.equals(myInteger5) ? myInteger1.hashCode() == myInteger5.hashCode() : true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        int int2 = myInteger1.getIntValue();
        MyInteger myInteger4 = new MyInteger((int) (short) -1);
        java.lang.String str5 = myInteger4.toString();
        MyInteger myInteger6 = myInteger1.add(myInteger4);
        MyInteger myInteger8 = new MyInteger((int) (short) -1);
        MyInteger myInteger9 = myInteger6.multiply(myInteger8);
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger18 = myInteger11.multiply(myInteger15);
        int int19 = myInteger11.getIntValue();
        MyInteger myInteger21 = new MyInteger((int) '#');
        MyInteger myInteger22 = myInteger11.add(myInteger21);
        boolean boolean23 = myInteger9.equals((java.lang.Object) myInteger11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger6", myInteger1.equals(myInteger6) ? myInteger1.hashCode() == myInteger6.hashCode() : true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.multiply(myInteger5);
        MyInteger myInteger15 = new MyInteger((int) ' ');
        MyInteger myInteger16 = myInteger13.multiply(myInteger15);
        java.lang.String str17 = myInteger15.toString();
        MyInteger myInteger19 = new MyInteger((int) (short) -1);
        java.lang.String str20 = myInteger19.toString();
        int int21 = myInteger19.getIntValue();
        MyInteger myInteger23 = new MyInteger((int) (short) 10);
        MyInteger myInteger24 = myInteger19.multiply(myInteger23);
        boolean boolean25 = myInteger15.equals((java.lang.Object) myInteger19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger23", myInteger1.equals(myInteger23) ? myInteger1.hashCode() == myInteger23.hashCode() : true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        MyInteger myInteger11 = myInteger1.multiply(myInteger10);
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger21 = new MyInteger((int) (short) 0);
        boolean boolean23 = myInteger21.equals((java.lang.Object) 1.0f);
        MyInteger myInteger24 = myInteger17.multiply(myInteger21);
        int int25 = myInteger17.getIntValue();
        int int26 = myInteger17.getIntValue();
        MyInteger myInteger28 = new MyInteger((int) (short) 0);
        boolean boolean30 = myInteger28.equals((java.lang.Object) 1.0f);
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        boolean boolean34 = myInteger32.equals((java.lang.Object) 1.0f);
        MyInteger myInteger35 = myInteger28.multiply(myInteger32);
        MyInteger myInteger36 = myInteger17.add(myInteger28);
        int int37 = myInteger36.getIntValue();
        boolean boolean38 = myInteger13.equals((java.lang.Object) myInteger36);
        MyInteger myInteger39 = myInteger10.multiply(myInteger13);
        MyInteger myInteger41 = new MyInteger((int) (byte) 100);
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger46 = myInteger41.multiply(myInteger43);
        boolean boolean47 = myInteger39.equals((java.lang.Object) myInteger41);
        int int48 = myInteger41.getIntValue();
        MyInteger myInteger50 = new MyInteger((int) (short) -1);
        java.lang.String str51 = myInteger50.toString();
        boolean boolean53 = myInteger50.equals((java.lang.Object) (-1));
        int int54 = myInteger50.getIntValue();
        MyInteger myInteger55 = myInteger41.multiply(myInteger50);
        java.lang.String str56 = myInteger55.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger41", myInteger1.equals(myInteger41) ? myInteger1.hashCode() == myInteger41.hashCode() : true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        java.lang.String str3 = myInteger1.toString();
        int int4 = myInteger1.getIntValue();
        MyInteger myInteger6 = new MyInteger(1);
        java.lang.String str7 = myInteger6.toString();
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = myInteger13.multiply(myInteger17);
        int int21 = myInteger13.getIntValue();
        int int22 = myInteger13.getIntValue();
        MyInteger myInteger24 = new MyInteger((int) (short) 0);
        boolean boolean26 = myInteger24.equals((java.lang.Object) 1.0f);
        MyInteger myInteger28 = new MyInteger((int) (short) 0);
        boolean boolean30 = myInteger28.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = myInteger24.multiply(myInteger28);
        MyInteger myInteger32 = myInteger13.add(myInteger24);
        MyInteger myInteger33 = myInteger9.multiply(myInteger32);
        java.lang.String str34 = myInteger9.toString();
        MyInteger myInteger36 = new MyInteger((int) (short) 0);
        boolean boolean38 = myInteger36.equals((java.lang.Object) 1.0f);
        MyInteger myInteger40 = new MyInteger((int) (short) 0);
        boolean boolean42 = myInteger40.equals((java.lang.Object) 1.0f);
        MyInteger myInteger44 = new MyInteger((int) (short) 0);
        boolean boolean46 = myInteger44.equals((java.lang.Object) 1.0f);
        MyInteger myInteger47 = myInteger40.multiply(myInteger44);
        int int48 = myInteger40.getIntValue();
        int int49 = myInteger40.getIntValue();
        MyInteger myInteger51 = new MyInteger((int) (short) 0);
        boolean boolean53 = myInteger51.equals((java.lang.Object) 1.0f);
        MyInteger myInteger55 = new MyInteger((int) (short) 0);
        boolean boolean57 = myInteger55.equals((java.lang.Object) 1.0f);
        MyInteger myInteger58 = myInteger51.multiply(myInteger55);
        MyInteger myInteger59 = myInteger40.add(myInteger51);
        MyInteger myInteger60 = myInteger36.multiply(myInteger59);
        MyInteger myInteger61 = myInteger9.multiply(myInteger60);
        MyInteger myInteger62 = myInteger6.multiply(myInteger61);
        MyInteger myInteger63 = myInteger1.add(myInteger6);
        MyInteger myInteger65 = new MyInteger((int) 'a');
        MyInteger myInteger66 = myInteger1.add(myInteger65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger6 and myInteger9", myInteger6.equals(myInteger9) ? myInteger6.hashCode() == myInteger9.hashCode() : true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        MyInteger myInteger1 = new MyInteger((int) ' ');
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = myInteger3.multiply(myInteger7);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        MyInteger myInteger13 = myInteger3.multiply(myInteger12);
        java.lang.String str14 = myInteger3.toString();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        int int24 = myInteger16.getIntValue();
        java.lang.String str25 = myInteger16.toString();
        boolean boolean27 = myInteger16.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger28 = myInteger3.multiply(myInteger16);
        MyInteger myInteger29 = myInteger1.add(myInteger28);
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger42 = myInteger35.multiply(myInteger39);
        MyInteger myInteger43 = myInteger31.multiply(myInteger35);
        int int44 = myInteger31.getIntValue();
        MyInteger myInteger46 = new MyInteger((int) (short) 0);
        boolean boolean48 = myInteger46.equals((java.lang.Object) 1.0f);
        MyInteger myInteger50 = new MyInteger((int) (short) 0);
        boolean boolean52 = myInteger50.equals((java.lang.Object) 1.0f);
        MyInteger myInteger54 = new MyInteger((int) (short) 0);
        boolean boolean56 = myInteger54.equals((java.lang.Object) 1.0f);
        MyInteger myInteger57 = myInteger50.multiply(myInteger54);
        int int58 = myInteger50.getIntValue();
        int int59 = myInteger50.getIntValue();
        MyInteger myInteger61 = new MyInteger((int) (short) 0);
        boolean boolean63 = myInteger61.equals((java.lang.Object) 1.0f);
        MyInteger myInteger65 = new MyInteger((int) (short) 0);
        boolean boolean67 = myInteger65.equals((java.lang.Object) 1.0f);
        MyInteger myInteger68 = myInteger61.multiply(myInteger65);
        MyInteger myInteger69 = myInteger50.add(myInteger61);
        MyInteger myInteger70 = myInteger46.multiply(myInteger69);
        java.lang.String str71 = myInteger46.toString();
        MyInteger myInteger72 = myInteger31.multiply(myInteger46);
        MyInteger myInteger73 = myInteger1.multiply(myInteger46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger29", myInteger3.equals(myInteger29) ? myInteger3.hashCode() == myInteger29.hashCode() : true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        MyInteger myInteger1 = new MyInteger((int) 'a');
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        MyInteger myInteger5 = new MyInteger((int) (short) -1);
        java.lang.String str6 = myInteger5.toString();
        MyInteger myInteger7 = myInteger3.add(myInteger5);
        boolean boolean8 = myInteger1.equals((java.lang.Object) myInteger3);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        boolean boolean12 = myInteger10.equals((java.lang.Object) 1.0f);
        MyInteger myInteger14 = new MyInteger((int) (short) 0);
        boolean boolean16 = myInteger14.equals((java.lang.Object) 1.0f);
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger21 = myInteger14.multiply(myInteger18);
        MyInteger myInteger22 = myInteger10.add(myInteger18);
        MyInteger myInteger24 = new MyInteger((int) (short) 0);
        boolean boolean26 = myInteger24.equals((java.lang.Object) 1.0f);
        MyInteger myInteger28 = new MyInteger((int) (short) 0);
        boolean boolean30 = myInteger28.equals((java.lang.Object) 1.0f);
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        boolean boolean34 = myInteger32.equals((java.lang.Object) 1.0f);
        MyInteger myInteger35 = myInteger28.multiply(myInteger32);
        int int36 = myInteger28.getIntValue();
        int int37 = myInteger28.getIntValue();
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger46 = myInteger39.multiply(myInteger43);
        MyInteger myInteger47 = myInteger28.add(myInteger39);
        int int48 = myInteger47.getIntValue();
        boolean boolean49 = myInteger24.equals((java.lang.Object) myInteger47);
        int int50 = myInteger47.getIntValue();
        MyInteger myInteger52 = new MyInteger((int) (short) 0);
        boolean boolean54 = myInteger52.equals((java.lang.Object) 1.0f);
        MyInteger myInteger56 = new MyInteger((int) (short) 0);
        boolean boolean58 = myInteger56.equals((java.lang.Object) 1.0f);
        MyInteger myInteger59 = myInteger52.multiply(myInteger56);
        int int60 = myInteger56.getIntValue();
        MyInteger myInteger61 = myInteger47.multiply(myInteger56);
        boolean boolean63 = myInteger56.equals((java.lang.Object) "97");
        MyInteger myInteger64 = myInteger18.multiply(myInteger56);
        MyInteger myInteger66 = new MyInteger((int) (short) 0);
        boolean boolean68 = myInteger66.equals((java.lang.Object) 1.0f);
        MyInteger myInteger70 = new MyInteger((int) (short) 0);
        boolean boolean72 = myInteger70.equals((java.lang.Object) 1.0f);
        MyInteger myInteger73 = myInteger66.multiply(myInteger70);
        MyInteger myInteger75 = new MyInteger((int) (short) 0);
        MyInteger myInteger76 = myInteger66.multiply(myInteger75);
        int int77 = myInteger66.getIntValue();
        MyInteger myInteger78 = myInteger56.add(myInteger66);
        java.lang.Object obj79 = new java.lang.Object();
        boolean boolean80 = myInteger56.equals(obj79);
        MyInteger myInteger81 = myInteger1.multiply(myInteger56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger5", myInteger3.equals(myInteger5) ? myInteger3.hashCode() == myInteger5.hashCode() : true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        java.lang.String str3 = myInteger1.toString();
        int int4 = myInteger1.getIntValue();
        MyInteger myInteger6 = new MyInteger((int) (short) 0);
        boolean boolean8 = myInteger6.equals((java.lang.Object) 1.0f);
        int int9 = myInteger6.getIntValue();
        MyInteger myInteger10 = myInteger1.add(myInteger6);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        int int24 = myInteger16.getIntValue();
        int int25 = myInteger16.getIntValue();
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = myInteger27.multiply(myInteger31);
        MyInteger myInteger35 = myInteger16.add(myInteger27);
        MyInteger myInteger36 = myInteger12.multiply(myInteger35);
        java.lang.String str37 = myInteger12.toString();
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger47 = new MyInteger((int) (short) 0);
        boolean boolean49 = myInteger47.equals((java.lang.Object) 1.0f);
        MyInteger myInteger50 = myInteger43.multiply(myInteger47);
        int int51 = myInteger43.getIntValue();
        int int52 = myInteger43.getIntValue();
        MyInteger myInteger54 = new MyInteger((int) (short) 0);
        boolean boolean56 = myInteger54.equals((java.lang.Object) 1.0f);
        MyInteger myInteger58 = new MyInteger((int) (short) 0);
        boolean boolean60 = myInteger58.equals((java.lang.Object) 1.0f);
        MyInteger myInteger61 = myInteger54.multiply(myInteger58);
        MyInteger myInteger62 = myInteger43.add(myInteger54);
        MyInteger myInteger63 = myInteger39.multiply(myInteger62);
        MyInteger myInteger64 = myInteger12.multiply(myInteger63);
        MyInteger myInteger65 = myInteger6.add(myInteger12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger16", myInteger1.equals(myInteger16) ? myInteger1.hashCode() == myInteger16.hashCode() : true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        int int2 = myInteger1.getIntValue();
        MyInteger myInteger4 = new MyInteger((int) (short) -1);
        java.lang.String str5 = myInteger4.toString();
        MyInteger myInteger6 = myInteger1.add(myInteger4);
        MyInteger myInteger8 = new MyInteger((int) (short) -1);
        MyInteger myInteger9 = myInteger6.multiply(myInteger8);
        int int10 = myInteger8.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger6", myInteger1.equals(myInteger6) ? myInteger1.hashCode() == myInteger6.hashCode() : true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        boolean boolean10 = myInteger5.equals((java.lang.Object) (byte) -1);
        int int11 = myInteger5.getIntValue();
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = myInteger13.multiply(myInteger17);
        int int21 = myInteger13.getIntValue();
        java.lang.String str22 = myInteger13.toString();
        java.lang.String str23 = myInteger13.toString();
        MyInteger myInteger24 = myInteger5.add(myInteger13);
        MyInteger myInteger26 = new MyInteger((int) (short) 0);
        boolean boolean28 = myInteger26.equals((java.lang.Object) 1.0f);
        int int29 = myInteger26.getIntValue();
        java.lang.String str30 = myInteger26.toString();
        MyInteger myInteger31 = myInteger5.add(myInteger26);
        MyInteger myInteger33 = new MyInteger((int) (short) 0);
        boolean boolean35 = myInteger33.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = new MyInteger((int) (short) 0);
        boolean boolean39 = myInteger37.equals((java.lang.Object) 1.0f);
        MyInteger myInteger40 = myInteger33.multiply(myInteger37);
        MyInteger myInteger42 = new MyInteger((int) (short) 0);
        MyInteger myInteger43 = myInteger33.multiply(myInteger42);
        int int44 = myInteger33.getIntValue();
        MyInteger myInteger45 = myInteger5.multiply(myInteger33);
        MyInteger myInteger47 = new MyInteger((int) (short) 0);
        boolean boolean49 = myInteger47.equals((java.lang.Object) 1.0f);
        MyInteger myInteger51 = new MyInteger((int) (short) 0);
        boolean boolean53 = myInteger51.equals((java.lang.Object) 1.0f);
        MyInteger myInteger54 = myInteger47.multiply(myInteger51);
        int int55 = myInteger47.getIntValue();
        int int56 = myInteger47.getIntValue();
        MyInteger myInteger58 = new MyInteger((int) (short) 0);
        boolean boolean60 = myInteger58.equals((java.lang.Object) 1.0f);
        MyInteger myInteger62 = new MyInteger((int) (short) 0);
        boolean boolean64 = myInteger62.equals((java.lang.Object) 1.0f);
        MyInteger myInteger65 = myInteger58.multiply(myInteger62);
        MyInteger myInteger66 = myInteger47.add(myInteger58);
        MyInteger myInteger67 = myInteger33.multiply(myInteger47);
        MyInteger myInteger69 = new MyInteger(97);
        boolean boolean70 = myInteger47.equals((java.lang.Object) 97);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger69", myInteger1.equals(myInteger69) ? myInteger1.hashCode() == myInteger69.hashCode() : true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        int int14 = myInteger5.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        MyInteger myInteger24 = myInteger5.add(myInteger16);
        MyInteger myInteger25 = myInteger1.multiply(myInteger24);
        MyInteger myInteger27 = new MyInteger((int) (short) -1);
        java.lang.String str28 = myInteger27.toString();
        java.lang.String str29 = myInteger27.toString();
        int int30 = myInteger27.getIntValue();
        MyInteger myInteger31 = myInteger1.multiply(myInteger27);
        MyInteger myInteger33 = new MyInteger((int) (short) -1);
        java.lang.String str34 = myInteger33.toString();
        boolean boolean36 = myInteger33.equals((java.lang.Object) (-1));
        int int37 = myInteger33.getIntValue();
        java.lang.String str38 = myInteger33.toString();
        MyInteger myInteger39 = myInteger31.add(myInteger33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger27", myInteger1.equals(myInteger27) ? myInteger1.hashCode() == myInteger27.hashCode() : true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        MyInteger myInteger1 = new MyInteger((int) ' ');
        MyInteger myInteger3 = new MyInteger((int) 'a');
        int int4 = myInteger3.getIntValue();
        MyInteger myInteger5 = myInteger1.multiply(myInteger3);
        MyInteger myInteger7 = new MyInteger(1);
        boolean boolean8 = myInteger3.equals((java.lang.Object) myInteger7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger5", myInteger1.equals(myInteger5) ? myInteger1.hashCode() == myInteger5.hashCode() : true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.multiply(myInteger5);
        MyInteger myInteger15 = new MyInteger((int) (short) -1);
        java.lang.String str16 = myInteger15.toString();
        java.lang.String str17 = myInteger15.toString();
        MyInteger myInteger18 = myInteger5.multiply(myInteger15);
        int int19 = myInteger5.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger15", myInteger1.equals(myInteger15) ? myInteger1.hashCode() == myInteger15.hashCode() : true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.multiply(myInteger5);
        int int14 = myInteger1.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) -1);
        int int17 = myInteger16.getIntValue();
        MyInteger myInteger19 = new MyInteger((int) (short) -1);
        java.lang.String str20 = myInteger19.toString();
        MyInteger myInteger21 = myInteger16.add(myInteger19);
        MyInteger myInteger23 = new MyInteger((int) (short) -1);
        MyInteger myInteger24 = myInteger21.multiply(myInteger23);
        MyInteger myInteger25 = myInteger1.multiply(myInteger24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger5 and myInteger16", myInteger5.equals(myInteger16) ? myInteger5.hashCode() == myInteger16.hashCode() : true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        MyInteger myInteger1 = new MyInteger(1);
        java.lang.String str2 = myInteger1.toString();
        MyInteger myInteger4 = new MyInteger((int) (short) 0);
        boolean boolean6 = myInteger4.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = myInteger4.multiply(myInteger8);
        boolean boolean13 = myInteger8.equals((java.lang.Object) (byte) -1);
        int int14 = myInteger8.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        int int24 = myInteger16.getIntValue();
        java.lang.String str25 = myInteger16.toString();
        java.lang.String str26 = myInteger16.toString();
        MyInteger myInteger27 = myInteger8.add(myInteger16);
        MyInteger myInteger28 = myInteger1.add(myInteger8);
        MyInteger myInteger30 = new MyInteger((int) (short) 0);
        boolean boolean32 = myInteger30.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = myInteger30.multiply(myInteger34);
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger47 = new MyInteger((int) (short) 0);
        boolean boolean49 = myInteger47.equals((java.lang.Object) 1.0f);
        MyInteger myInteger50 = myInteger43.multiply(myInteger47);
        MyInteger myInteger51 = myInteger39.multiply(myInteger43);
        java.lang.Class<?> wildcardClass52 = myInteger39.getClass();
        boolean boolean53 = myInteger30.equals((java.lang.Object) wildcardClass52);
        java.lang.String str54 = myInteger30.toString();
        boolean boolean55 = myInteger28.equals((java.lang.Object) myInteger30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger4", myInteger1.equals(myInteger4) ? myInteger1.hashCode() == myInteger4.hashCode() : true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        MyInteger myInteger1 = new MyInteger(1);
        java.lang.String str2 = myInteger1.toString();
        MyInteger myInteger4 = new MyInteger((int) (short) 0);
        boolean boolean6 = myInteger4.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = myInteger4.multiply(myInteger8);
        boolean boolean13 = myInteger8.equals((java.lang.Object) (byte) -1);
        int int14 = myInteger8.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        int int24 = myInteger16.getIntValue();
        java.lang.String str25 = myInteger16.toString();
        java.lang.String str26 = myInteger16.toString();
        MyInteger myInteger27 = myInteger8.add(myInteger16);
        MyInteger myInteger28 = myInteger1.add(myInteger8);
        java.lang.String str29 = myInteger28.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger4", myInteger1.equals(myInteger4) ? myInteger1.hashCode() == myInteger4.hashCode() : true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        MyInteger myInteger1 = new MyInteger((int) '4');
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = myInteger3.multiply(myInteger7);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        MyInteger myInteger13 = myInteger3.multiply(myInteger12);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        int int27 = myInteger19.getIntValue();
        int int28 = myInteger19.getIntValue();
        MyInteger myInteger30 = new MyInteger((int) (short) 0);
        boolean boolean32 = myInteger30.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = myInteger30.multiply(myInteger34);
        MyInteger myInteger38 = myInteger19.add(myInteger30);
        int int39 = myInteger38.getIntValue();
        boolean boolean40 = myInteger15.equals((java.lang.Object) myInteger38);
        MyInteger myInteger41 = myInteger12.multiply(myInteger15);
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger47 = new MyInteger((int) (short) 0);
        boolean boolean49 = myInteger47.equals((java.lang.Object) 1.0f);
        MyInteger myInteger50 = myInteger43.multiply(myInteger47);
        MyInteger myInteger52 = new MyInteger((int) (short) 0);
        MyInteger myInteger53 = myInteger43.multiply(myInteger52);
        java.lang.String str54 = myInteger43.toString();
        MyInteger myInteger56 = new MyInteger((int) (short) 0);
        boolean boolean58 = myInteger56.equals((java.lang.Object) 1.0f);
        MyInteger myInteger60 = new MyInteger((int) (short) 0);
        boolean boolean62 = myInteger60.equals((java.lang.Object) 1.0f);
        MyInteger myInteger63 = myInteger56.multiply(myInteger60);
        int int64 = myInteger56.getIntValue();
        java.lang.String str65 = myInteger56.toString();
        boolean boolean67 = myInteger56.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger68 = myInteger43.multiply(myInteger56);
        MyInteger myInteger69 = myInteger12.add(myInteger56);
        MyInteger myInteger70 = myInteger1.add(myInteger56);
        int int71 = myInteger1.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger70", myInteger3.equals(myInteger70) ? myInteger3.hashCode() == myInteger70.hashCode() : true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.add(myInteger9);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        MyInteger myInteger27 = myInteger15.multiply(myInteger19);
        MyInteger myInteger29 = new MyInteger((int) (short) -1);
        java.lang.String str30 = myInteger29.toString();
        java.lang.String str31 = myInteger29.toString();
        MyInteger myInteger32 = myInteger19.multiply(myInteger29);
        MyInteger myInteger33 = myInteger1.multiply(myInteger29);
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger42 = myInteger35.multiply(myInteger39);
        int int43 = myInteger35.getIntValue();
        java.lang.String str44 = myInteger35.toString();
        java.lang.String str45 = myInteger35.toString();
        MyInteger myInteger46 = myInteger29.add(myInteger35);
        java.lang.String str47 = myInteger35.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger29", myInteger1.equals(myInteger29) ? myInteger1.hashCode() == myInteger29.hashCode() : true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        MyInteger myInteger11 = myInteger1.multiply(myInteger10);
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger21 = new MyInteger((int) (short) 0);
        boolean boolean23 = myInteger21.equals((java.lang.Object) 1.0f);
        MyInteger myInteger24 = myInteger17.multiply(myInteger21);
        int int25 = myInteger17.getIntValue();
        int int26 = myInteger17.getIntValue();
        MyInteger myInteger28 = new MyInteger((int) (short) 0);
        boolean boolean30 = myInteger28.equals((java.lang.Object) 1.0f);
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        boolean boolean34 = myInteger32.equals((java.lang.Object) 1.0f);
        MyInteger myInteger35 = myInteger28.multiply(myInteger32);
        MyInteger myInteger36 = myInteger17.add(myInteger28);
        int int37 = myInteger36.getIntValue();
        boolean boolean38 = myInteger13.equals((java.lang.Object) myInteger36);
        MyInteger myInteger39 = myInteger10.multiply(myInteger13);
        MyInteger myInteger41 = new MyInteger((int) (byte) 100);
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger46 = myInteger41.multiply(myInteger43);
        boolean boolean47 = myInteger39.equals((java.lang.Object) myInteger41);
        int int48 = myInteger41.getIntValue();
        MyInteger myInteger50 = new MyInteger((int) (short) -1);
        java.lang.String str51 = myInteger50.toString();
        boolean boolean53 = myInteger50.equals((java.lang.Object) (-1));
        int int54 = myInteger50.getIntValue();
        MyInteger myInteger55 = myInteger41.multiply(myInteger50);
        MyInteger myInteger57 = new MyInteger((int) (short) 0);
        boolean boolean59 = myInteger57.equals((java.lang.Object) 1.0f);
        MyInteger myInteger61 = new MyInteger((int) (short) 0);
        boolean boolean63 = myInteger61.equals((java.lang.Object) 1.0f);
        MyInteger myInteger64 = myInteger57.multiply(myInteger61);
        MyInteger myInteger66 = new MyInteger((int) (short) 0);
        MyInteger myInteger67 = myInteger57.multiply(myInteger66);
        boolean boolean68 = myInteger41.equals((java.lang.Object) myInteger66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger50", myInteger1.equals(myInteger50) ? myInteger1.hashCode() == myInteger50.hashCode() : true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        MyInteger myInteger1 = new MyInteger(10);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger14 = myInteger7.multiply(myInteger11);
        int int15 = myInteger7.getIntValue();
        int int16 = myInteger7.getIntValue();
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = myInteger18.multiply(myInteger22);
        MyInteger myInteger26 = myInteger7.add(myInteger18);
        int int27 = myInteger26.getIntValue();
        boolean boolean28 = myInteger3.equals((java.lang.Object) myInteger26);
        int int29 = myInteger26.getIntValue();
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger38 = myInteger31.multiply(myInteger35);
        int int39 = myInteger35.getIntValue();
        MyInteger myInteger40 = myInteger26.multiply(myInteger35);
        MyInteger myInteger42 = new MyInteger((int) (short) 0);
        boolean boolean44 = myInteger42.equals((java.lang.Object) 1.0f);
        MyInteger myInteger46 = new MyInteger((int) (short) 0);
        boolean boolean48 = myInteger46.equals((java.lang.Object) 1.0f);
        MyInteger myInteger50 = new MyInteger((int) (short) 0);
        boolean boolean52 = myInteger50.equals((java.lang.Object) 1.0f);
        MyInteger myInteger53 = myInteger46.multiply(myInteger50);
        MyInteger myInteger54 = myInteger42.add(myInteger50);
        int int55 = myInteger54.getIntValue();
        MyInteger myInteger56 = myInteger35.add(myInteger54);
        boolean boolean57 = myInteger1.equals((java.lang.Object) myInteger54);
        MyInteger myInteger59 = new MyInteger((int) (byte) 1);
        MyInteger myInteger61 = new MyInteger((int) (short) -1);
        java.lang.String str62 = myInteger61.toString();
        int int63 = myInteger61.getIntValue();
        boolean boolean64 = myInteger59.equals((java.lang.Object) myInteger61);
        MyInteger myInteger65 = myInteger1.multiply(myInteger61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger59", myInteger3.equals(myInteger59) ? myInteger3.hashCode() == myInteger59.hashCode() : true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        MyInteger myInteger1 = new MyInteger((int) (byte) 1);
        MyInteger myInteger3 = new MyInteger((int) 'a');
        MyInteger myInteger4 = myInteger1.multiply(myInteger3);
        java.lang.Class<?> wildcardClass5 = myInteger3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger4", myInteger1.equals(myInteger4) ? myInteger1.hashCode() == myInteger4.hashCode() : true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        int int2 = myInteger1.getIntValue();
        MyInteger myInteger4 = new MyInteger((int) (short) -1);
        java.lang.String str5 = myInteger4.toString();
        MyInteger myInteger6 = myInteger1.add(myInteger4);
        MyInteger myInteger8 = new MyInteger((int) (short) -1);
        MyInteger myInteger9 = myInteger6.multiply(myInteger8);
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger18 = myInteger11.multiply(myInteger15);
        boolean boolean20 = myInteger15.equals((java.lang.Object) (byte) -1);
        int int21 = myInteger15.getIntValue();
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger30 = myInteger23.multiply(myInteger27);
        int int31 = myInteger23.getIntValue();
        java.lang.String str32 = myInteger23.toString();
        java.lang.String str33 = myInteger23.toString();
        MyInteger myInteger34 = myInteger15.add(myInteger23);
        int int35 = myInteger34.getIntValue();
        boolean boolean36 = myInteger6.equals((java.lang.Object) int35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger9", myInteger1.equals(myInteger9) ? myInteger1.hashCode() == myInteger9.hashCode() : true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        java.lang.String str3 = myInteger1.toString();
        int int4 = myInteger1.getIntValue();
        MyInteger myInteger6 = new MyInteger(1);
        java.lang.String str7 = myInteger6.toString();
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = myInteger13.multiply(myInteger17);
        int int21 = myInteger13.getIntValue();
        int int22 = myInteger13.getIntValue();
        MyInteger myInteger24 = new MyInteger((int) (short) 0);
        boolean boolean26 = myInteger24.equals((java.lang.Object) 1.0f);
        MyInteger myInteger28 = new MyInteger((int) (short) 0);
        boolean boolean30 = myInteger28.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = myInteger24.multiply(myInteger28);
        MyInteger myInteger32 = myInteger13.add(myInteger24);
        MyInteger myInteger33 = myInteger9.multiply(myInteger32);
        java.lang.String str34 = myInteger9.toString();
        MyInteger myInteger36 = new MyInteger((int) (short) 0);
        boolean boolean38 = myInteger36.equals((java.lang.Object) 1.0f);
        MyInteger myInteger40 = new MyInteger((int) (short) 0);
        boolean boolean42 = myInteger40.equals((java.lang.Object) 1.0f);
        MyInteger myInteger44 = new MyInteger((int) (short) 0);
        boolean boolean46 = myInteger44.equals((java.lang.Object) 1.0f);
        MyInteger myInteger47 = myInteger40.multiply(myInteger44);
        int int48 = myInteger40.getIntValue();
        int int49 = myInteger40.getIntValue();
        MyInteger myInteger51 = new MyInteger((int) (short) 0);
        boolean boolean53 = myInteger51.equals((java.lang.Object) 1.0f);
        MyInteger myInteger55 = new MyInteger((int) (short) 0);
        boolean boolean57 = myInteger55.equals((java.lang.Object) 1.0f);
        MyInteger myInteger58 = myInteger51.multiply(myInteger55);
        MyInteger myInteger59 = myInteger40.add(myInteger51);
        MyInteger myInteger60 = myInteger36.multiply(myInteger59);
        MyInteger myInteger61 = myInteger9.multiply(myInteger60);
        MyInteger myInteger62 = myInteger6.multiply(myInteger61);
        MyInteger myInteger63 = myInteger1.add(myInteger6);
        MyInteger myInteger65 = new MyInteger((int) ' ');
        MyInteger myInteger67 = new MyInteger((int) (short) 0);
        boolean boolean69 = myInteger67.equals((java.lang.Object) 1.0f);
        MyInteger myInteger71 = new MyInteger((int) (short) 0);
        boolean boolean73 = myInteger71.equals((java.lang.Object) 1.0f);
        MyInteger myInteger74 = myInteger67.multiply(myInteger71);
        MyInteger myInteger76 = new MyInteger((int) (short) 0);
        MyInteger myInteger77 = myInteger67.multiply(myInteger76);
        java.lang.String str78 = myInteger67.toString();
        MyInteger myInteger80 = new MyInteger((int) (short) 0);
        boolean boolean82 = myInteger80.equals((java.lang.Object) 1.0f);
        MyInteger myInteger84 = new MyInteger((int) (short) 0);
        boolean boolean86 = myInteger84.equals((java.lang.Object) 1.0f);
        MyInteger myInteger87 = myInteger80.multiply(myInteger84);
        int int88 = myInteger80.getIntValue();
        java.lang.String str89 = myInteger80.toString();
        boolean boolean91 = myInteger80.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger92 = myInteger67.multiply(myInteger80);
        MyInteger myInteger93 = myInteger65.add(myInteger92);
        MyInteger myInteger94 = myInteger1.multiply(myInteger92);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger6 and myInteger9", myInteger6.equals(myInteger9) ? myInteger6.hashCode() == myInteger9.hashCode() : true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger14 = myInteger7.multiply(myInteger11);
        int int15 = myInteger7.getIntValue();
        int int16 = myInteger7.getIntValue();
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = myInteger18.multiply(myInteger22);
        MyInteger myInteger26 = myInteger7.add(myInteger18);
        MyInteger myInteger27 = myInteger3.multiply(myInteger26);
        MyInteger myInteger28 = myInteger1.add(myInteger27);
        MyInteger myInteger30 = new MyInteger((int) (short) 0);
        boolean boolean32 = myInteger30.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger38 = new MyInteger((int) (short) 0);
        boolean boolean40 = myInteger38.equals((java.lang.Object) 1.0f);
        MyInteger myInteger41 = myInteger34.multiply(myInteger38);
        int int42 = myInteger34.getIntValue();
        int int43 = myInteger34.getIntValue();
        MyInteger myInteger45 = new MyInteger((int) (short) 0);
        boolean boolean47 = myInteger45.equals((java.lang.Object) 1.0f);
        MyInteger myInteger49 = new MyInteger((int) (short) 0);
        boolean boolean51 = myInteger49.equals((java.lang.Object) 1.0f);
        MyInteger myInteger52 = myInteger45.multiply(myInteger49);
        MyInteger myInteger53 = myInteger34.add(myInteger45);
        int int54 = myInteger53.getIntValue();
        boolean boolean55 = myInteger30.equals((java.lang.Object) myInteger53);
        int int56 = myInteger53.getIntValue();
        MyInteger myInteger58 = new MyInteger((int) (short) 0);
        boolean boolean60 = myInteger58.equals((java.lang.Object) 1.0f);
        MyInteger myInteger62 = new MyInteger((int) (short) 0);
        boolean boolean64 = myInteger62.equals((java.lang.Object) 1.0f);
        MyInteger myInteger65 = myInteger58.multiply(myInteger62);
        int int66 = myInteger62.getIntValue();
        MyInteger myInteger67 = myInteger53.multiply(myInteger62);
        MyInteger myInteger69 = new MyInteger((int) (short) 0);
        boolean boolean71 = myInteger69.equals((java.lang.Object) 1.0f);
        MyInteger myInteger73 = new MyInteger((int) (short) 0);
        boolean boolean75 = myInteger73.equals((java.lang.Object) 1.0f);
        MyInteger myInteger77 = new MyInteger((int) (short) 0);
        boolean boolean79 = myInteger77.equals((java.lang.Object) 1.0f);
        MyInteger myInteger80 = myInteger73.multiply(myInteger77);
        MyInteger myInteger81 = myInteger69.add(myInteger77);
        int int82 = myInteger81.getIntValue();
        MyInteger myInteger83 = myInteger62.add(myInteger81);
        boolean boolean84 = myInteger1.equals((java.lang.Object) myInteger83);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger28", myInteger3.equals(myInteger28) ? myInteger3.hashCode() == myInteger28.hashCode() : true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        int int9 = myInteger1.getIntValue();
        java.lang.String str10 = myInteger1.toString();
        MyInteger myInteger12 = new MyInteger(1);
        boolean boolean13 = myInteger1.equals((java.lang.Object) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger5 and myInteger12", myInteger5.equals(myInteger12) ? myInteger5.hashCode() == myInteger12.hashCode() : true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        boolean boolean12 = myInteger10.equals((java.lang.Object) 1.0f);
        MyInteger myInteger14 = new MyInteger((int) (short) 0);
        boolean boolean16 = myInteger14.equals((java.lang.Object) 1.0f);
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger21 = myInteger14.multiply(myInteger18);
        MyInteger myInteger22 = myInteger10.multiply(myInteger14);
        java.lang.Class<?> wildcardClass23 = myInteger10.getClass();
        boolean boolean24 = myInteger1.equals((java.lang.Object) wildcardClass23);
        int int25 = myInteger1.getIntValue();
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger38 = myInteger31.multiply(myInteger35);
        int int39 = myInteger31.getIntValue();
        int int40 = myInteger31.getIntValue();
        MyInteger myInteger42 = new MyInteger((int) (short) 0);
        boolean boolean44 = myInteger42.equals((java.lang.Object) 1.0f);
        MyInteger myInteger46 = new MyInteger((int) (short) 0);
        boolean boolean48 = myInteger46.equals((java.lang.Object) 1.0f);
        MyInteger myInteger49 = myInteger42.multiply(myInteger46);
        MyInteger myInteger50 = myInteger31.add(myInteger42);
        MyInteger myInteger51 = myInteger27.multiply(myInteger50);
        java.lang.String str52 = myInteger27.toString();
        MyInteger myInteger54 = new MyInteger((int) (short) 0);
        boolean boolean56 = myInteger54.equals((java.lang.Object) 1.0f);
        MyInteger myInteger58 = new MyInteger((int) (short) 0);
        boolean boolean60 = myInteger58.equals((java.lang.Object) 1.0f);
        MyInteger myInteger62 = new MyInteger((int) (short) 0);
        boolean boolean64 = myInteger62.equals((java.lang.Object) 1.0f);
        MyInteger myInteger65 = myInteger58.multiply(myInteger62);
        int int66 = myInteger58.getIntValue();
        int int67 = myInteger58.getIntValue();
        MyInteger myInteger69 = new MyInteger((int) (short) 0);
        boolean boolean71 = myInteger69.equals((java.lang.Object) 1.0f);
        MyInteger myInteger73 = new MyInteger((int) (short) 0);
        boolean boolean75 = myInteger73.equals((java.lang.Object) 1.0f);
        MyInteger myInteger76 = myInteger69.multiply(myInteger73);
        MyInteger myInteger77 = myInteger58.add(myInteger69);
        MyInteger myInteger78 = myInteger54.multiply(myInteger77);
        MyInteger myInteger79 = myInteger27.multiply(myInteger78);
        boolean boolean81 = myInteger78.equals((java.lang.Object) (byte) -1);
        MyInteger myInteger82 = myInteger1.add(myInteger78);
        MyInteger myInteger84 = new MyInteger((int) (byte) 10);
        int int85 = myInteger84.getIntValue();
        java.lang.String str86 = myInteger84.toString();
        int int87 = myInteger84.getIntValue();
        boolean boolean88 = myInteger1.equals((java.lang.Object) int87);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger5 and myInteger84", myInteger5.equals(myInteger84) ? myInteger5.hashCode() == myInteger84.hashCode() : true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        MyInteger myInteger3 = new MyInteger((int) (byte) 10);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger16 = myInteger9.multiply(myInteger13);
        int int17 = myInteger9.getIntValue();
        int int18 = myInteger9.getIntValue();
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger24 = new MyInteger((int) (short) 0);
        boolean boolean26 = myInteger24.equals((java.lang.Object) 1.0f);
        MyInteger myInteger27 = myInteger20.multiply(myInteger24);
        MyInteger myInteger28 = myInteger9.add(myInteger20);
        MyInteger myInteger29 = myInteger5.multiply(myInteger28);
        MyInteger myInteger30 = myInteger3.add(myInteger29);
        MyInteger myInteger31 = myInteger1.add(myInteger3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger5 and myInteger30", myInteger5.equals(myInteger30) ? myInteger5.hashCode() == myInteger30.hashCode() : true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        MyInteger myInteger11 = myInteger1.multiply(myInteger10);
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = myInteger13.multiply(myInteger17);
        boolean boolean22 = myInteger17.equals((java.lang.Object) (byte) -1);
        int int23 = myInteger17.getIntValue();
        MyInteger myInteger25 = new MyInteger((int) (short) 0);
        boolean boolean27 = myInteger25.equals((java.lang.Object) 1.0f);
        MyInteger myInteger29 = new MyInteger((int) (short) 0);
        boolean boolean31 = myInteger29.equals((java.lang.Object) 1.0f);
        MyInteger myInteger32 = myInteger25.multiply(myInteger29);
        int int33 = myInteger25.getIntValue();
        java.lang.String str34 = myInteger25.toString();
        java.lang.String str35 = myInteger25.toString();
        MyInteger myInteger36 = myInteger17.add(myInteger25);
        int int37 = myInteger25.getIntValue();
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger46 = myInteger39.multiply(myInteger43);
        boolean boolean47 = myInteger25.equals((java.lang.Object) myInteger43);
        boolean boolean48 = myInteger10.equals((java.lang.Object) myInteger43);
        MyInteger myInteger50 = new MyInteger((int) (short) 0);
        boolean boolean52 = myInteger50.equals((java.lang.Object) 1.0f);
        MyInteger myInteger54 = new MyInteger((int) (short) 0);
        boolean boolean56 = myInteger54.equals((java.lang.Object) 1.0f);
        MyInteger myInteger57 = myInteger50.multiply(myInteger54);
        int int58 = myInteger50.getIntValue();
        MyInteger myInteger60 = new MyInteger((int) '#');
        MyInteger myInteger61 = myInteger50.add(myInteger60);
        MyInteger myInteger62 = myInteger43.multiply(myInteger61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger60", myInteger1.equals(myInteger60) ? myInteger1.hashCode() == myInteger60.hashCode() : true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        MyInteger myInteger11 = myInteger1.multiply(myInteger10);
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger21 = new MyInteger((int) (short) 0);
        boolean boolean23 = myInteger21.equals((java.lang.Object) 1.0f);
        MyInteger myInteger24 = myInteger17.multiply(myInteger21);
        int int25 = myInteger17.getIntValue();
        int int26 = myInteger17.getIntValue();
        MyInteger myInteger28 = new MyInteger((int) (short) 0);
        boolean boolean30 = myInteger28.equals((java.lang.Object) 1.0f);
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        boolean boolean34 = myInteger32.equals((java.lang.Object) 1.0f);
        MyInteger myInteger35 = myInteger28.multiply(myInteger32);
        MyInteger myInteger36 = myInteger17.add(myInteger28);
        int int37 = myInteger36.getIntValue();
        boolean boolean38 = myInteger13.equals((java.lang.Object) myInteger36);
        MyInteger myInteger39 = myInteger10.multiply(myInteger13);
        MyInteger myInteger41 = new MyInteger((int) (short) 0);
        boolean boolean43 = myInteger41.equals((java.lang.Object) 1.0f);
        boolean boolean44 = myInteger13.equals((java.lang.Object) myInteger41);
        MyInteger myInteger46 = new MyInteger((int) (short) 0);
        boolean boolean48 = myInteger46.equals((java.lang.Object) 1.0f);
        MyInteger myInteger50 = new MyInteger((int) (short) 0);
        boolean boolean52 = myInteger50.equals((java.lang.Object) 1.0f);
        MyInteger myInteger54 = new MyInteger((int) (short) 0);
        boolean boolean56 = myInteger54.equals((java.lang.Object) 1.0f);
        MyInteger myInteger57 = myInteger50.multiply(myInteger54);
        int int58 = myInteger50.getIntValue();
        int int59 = myInteger50.getIntValue();
        MyInteger myInteger61 = new MyInteger((int) (short) 0);
        boolean boolean63 = myInteger61.equals((java.lang.Object) 1.0f);
        MyInteger myInteger65 = new MyInteger((int) (short) 0);
        boolean boolean67 = myInteger65.equals((java.lang.Object) 1.0f);
        MyInteger myInteger68 = myInteger61.multiply(myInteger65);
        MyInteger myInteger69 = myInteger50.add(myInteger61);
        int int70 = myInteger69.getIntValue();
        boolean boolean71 = myInteger46.equals((java.lang.Object) myInteger69);
        java.lang.String str72 = myInteger46.toString();
        MyInteger myInteger74 = new MyInteger((int) (byte) 10);
        MyInteger myInteger75 = myInteger46.add(myInteger74);
        MyInteger myInteger76 = myInteger13.multiply(myInteger75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger74", myInteger1.equals(myInteger74) ? myInteger1.hashCode() == myInteger74.hashCode() : true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        MyInteger myInteger4 = new MyInteger((int) (short) 0);
        boolean boolean6 = myInteger4.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = myInteger4.multiply(myInteger8);
        int int12 = myInteger8.getIntValue();
        MyInteger myInteger13 = myInteger1.multiply(myInteger8);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        int int27 = myInteger19.getIntValue();
        int int28 = myInteger19.getIntValue();
        MyInteger myInteger30 = new MyInteger((int) (short) 0);
        boolean boolean32 = myInteger30.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = myInteger30.multiply(myInteger34);
        MyInteger myInteger38 = myInteger19.add(myInteger30);
        MyInteger myInteger39 = myInteger15.multiply(myInteger38);
        java.lang.String str40 = myInteger38.toString();
        boolean boolean41 = myInteger8.equals((java.lang.Object) myInteger38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger4", myInteger1.equals(myInteger4) ? myInteger1.hashCode() == myInteger4.hashCode() : true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        MyInteger myInteger1 = new MyInteger((-2));
        MyInteger myInteger3 = new MyInteger(32);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        java.lang.String str14 = myInteger5.toString();
        boolean boolean16 = myInteger5.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger18 = new MyInteger((int) 'a');
        int int19 = myInteger18.getIntValue();
        int int20 = myInteger18.getIntValue();
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = new MyInteger((int) (short) 0);
        boolean boolean28 = myInteger26.equals((java.lang.Object) 1.0f);
        MyInteger myInteger29 = myInteger22.multiply(myInteger26);
        int int30 = myInteger22.getIntValue();
        java.lang.String str31 = myInteger22.toString();
        boolean boolean33 = myInteger22.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger34 = myInteger18.multiply(myInteger22);
        boolean boolean35 = myInteger5.equals((java.lang.Object) myInteger18);
        MyInteger myInteger36 = myInteger3.multiply(myInteger18);
        MyInteger myInteger37 = myInteger1.multiply(myInteger3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger5 and myInteger18", myInteger5.equals(myInteger18) ? myInteger5.hashCode() == myInteger18.hashCode() : true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        int int14 = myInteger5.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        MyInteger myInteger24 = myInteger5.add(myInteger16);
        int int25 = myInteger24.getIntValue();
        boolean boolean26 = myInteger1.equals((java.lang.Object) myInteger24);
        int int27 = myInteger24.getIntValue();
        MyInteger myInteger29 = new MyInteger((int) (short) 0);
        boolean boolean31 = myInteger29.equals((java.lang.Object) 1.0f);
        MyInteger myInteger33 = new MyInteger((int) (short) 0);
        boolean boolean35 = myInteger33.equals((java.lang.Object) 1.0f);
        MyInteger myInteger36 = myInteger29.multiply(myInteger33);
        int int37 = myInteger33.getIntValue();
        MyInteger myInteger38 = myInteger24.multiply(myInteger33);
        boolean boolean40 = myInteger33.equals((java.lang.Object) "97");
        MyInteger myInteger42 = new MyInteger((int) (short) 0);
        boolean boolean44 = myInteger42.equals((java.lang.Object) 1.0f);
        MyInteger myInteger46 = new MyInteger((int) (short) 0);
        boolean boolean48 = myInteger46.equals((java.lang.Object) 1.0f);
        MyInteger myInteger50 = new MyInteger((int) (short) 0);
        boolean boolean52 = myInteger50.equals((java.lang.Object) 1.0f);
        MyInteger myInteger53 = myInteger46.multiply(myInteger50);
        int int54 = myInteger46.getIntValue();
        int int55 = myInteger46.getIntValue();
        MyInteger myInteger57 = new MyInteger((int) (short) 0);
        boolean boolean59 = myInteger57.equals((java.lang.Object) 1.0f);
        MyInteger myInteger61 = new MyInteger((int) (short) 0);
        boolean boolean63 = myInteger61.equals((java.lang.Object) 1.0f);
        MyInteger myInteger64 = myInteger57.multiply(myInteger61);
        MyInteger myInteger65 = myInteger46.add(myInteger57);
        int int66 = myInteger65.getIntValue();
        boolean boolean67 = myInteger42.equals((java.lang.Object) myInteger65);
        int int68 = myInteger65.getIntValue();
        MyInteger myInteger70 = new MyInteger((int) (short) 0);
        boolean boolean72 = myInteger70.equals((java.lang.Object) 1.0f);
        MyInteger myInteger74 = new MyInteger((int) (short) 0);
        boolean boolean76 = myInteger74.equals((java.lang.Object) 1.0f);
        MyInteger myInteger77 = myInteger70.multiply(myInteger74);
        int int78 = myInteger74.getIntValue();
        MyInteger myInteger79 = myInteger65.multiply(myInteger74);
        MyInteger myInteger80 = myInteger33.add(myInteger79);
        MyInteger myInteger82 = new MyInteger((int) 'a');
        int int83 = myInteger82.getIntValue();
        int int84 = myInteger82.getIntValue();
        MyInteger myInteger86 = new MyInteger((int) (short) 0);
        boolean boolean88 = myInteger86.equals((java.lang.Object) 1.0f);
        MyInteger myInteger90 = new MyInteger((int) (short) 0);
        boolean boolean92 = myInteger90.equals((java.lang.Object) 1.0f);
        MyInteger myInteger93 = myInteger86.multiply(myInteger90);
        int int94 = myInteger86.getIntValue();
        java.lang.String str95 = myInteger86.toString();
        boolean boolean97 = myInteger86.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger98 = myInteger82.multiply(myInteger86);
        MyInteger myInteger99 = myInteger33.add(myInteger86);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger82", myInteger1.equals(myInteger82) ? myInteger1.hashCode() == myInteger82.hashCode() : true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        boolean boolean10 = myInteger5.equals((java.lang.Object) (byte) -1);
        int int11 = myInteger5.getIntValue();
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = myInteger13.multiply(myInteger17);
        int int21 = myInteger13.getIntValue();
        java.lang.String str22 = myInteger13.toString();
        java.lang.String str23 = myInteger13.toString();
        MyInteger myInteger24 = myInteger5.add(myInteger13);
        int int25 = myInteger13.getIntValue();
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = myInteger27.multiply(myInteger31);
        boolean boolean35 = myInteger13.equals((java.lang.Object) myInteger31);
        MyInteger myInteger37 = new MyInteger((int) (short) 0);
        boolean boolean39 = myInteger37.equals((java.lang.Object) 1.0f);
        MyInteger myInteger41 = new MyInteger((int) (short) 0);
        boolean boolean43 = myInteger41.equals((java.lang.Object) 1.0f);
        MyInteger myInteger44 = myInteger37.multiply(myInteger41);
        MyInteger myInteger46 = new MyInteger((int) (short) 0);
        MyInteger myInteger47 = myInteger37.multiply(myInteger46);
        MyInteger myInteger49 = new MyInteger((int) (short) 0);
        boolean boolean51 = myInteger49.equals((java.lang.Object) 1.0f);
        MyInteger myInteger53 = new MyInteger((int) (short) 0);
        boolean boolean55 = myInteger53.equals((java.lang.Object) 1.0f);
        MyInteger myInteger56 = myInteger49.multiply(myInteger53);
        boolean boolean58 = myInteger53.equals((java.lang.Object) (byte) -1);
        int int59 = myInteger53.getIntValue();
        MyInteger myInteger61 = new MyInteger((int) (short) 0);
        boolean boolean63 = myInteger61.equals((java.lang.Object) 1.0f);
        MyInteger myInteger65 = new MyInteger((int) (short) 0);
        boolean boolean67 = myInteger65.equals((java.lang.Object) 1.0f);
        MyInteger myInteger68 = myInteger61.multiply(myInteger65);
        int int69 = myInteger61.getIntValue();
        java.lang.String str70 = myInteger61.toString();
        java.lang.String str71 = myInteger61.toString();
        MyInteger myInteger72 = myInteger53.add(myInteger61);
        int int73 = myInteger61.getIntValue();
        MyInteger myInteger75 = new MyInteger((int) (short) 0);
        boolean boolean77 = myInteger75.equals((java.lang.Object) 1.0f);
        MyInteger myInteger79 = new MyInteger((int) (short) 0);
        boolean boolean81 = myInteger79.equals((java.lang.Object) 1.0f);
        MyInteger myInteger82 = myInteger75.multiply(myInteger79);
        boolean boolean83 = myInteger61.equals((java.lang.Object) myInteger79);
        boolean boolean84 = myInteger46.equals((java.lang.Object) myInteger79);
        MyInteger myInteger86 = new MyInteger((-1));
        int int87 = myInteger86.getIntValue();
        MyInteger myInteger88 = myInteger79.add(myInteger86);
        MyInteger myInteger89 = myInteger13.add(myInteger79);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger86", myInteger1.equals(myInteger86) ? myInteger1.hashCode() == myInteger86.hashCode() : true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.multiply(myInteger5);
        MyInteger myInteger15 = new MyInteger((int) (short) -1);
        java.lang.String str16 = myInteger15.toString();
        java.lang.String str17 = myInteger15.toString();
        MyInteger myInteger18 = myInteger5.multiply(myInteger15);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger24 = new MyInteger((int) (short) 0);
        boolean boolean26 = myInteger24.equals((java.lang.Object) 1.0f);
        MyInteger myInteger28 = new MyInteger((int) (short) 0);
        boolean boolean30 = myInteger28.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = myInteger24.multiply(myInteger28);
        MyInteger myInteger32 = myInteger20.multiply(myInteger24);
        MyInteger myInteger33 = myInteger15.multiply(myInteger20);
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        int int36 = myInteger35.getIntValue();
        MyInteger myInteger38 = new MyInteger((int) (short) 0);
        boolean boolean40 = myInteger38.equals((java.lang.Object) 1.0f);
        MyInteger myInteger42 = new MyInteger((int) (short) 0);
        boolean boolean44 = myInteger42.equals((java.lang.Object) 1.0f);
        MyInteger myInteger45 = myInteger38.multiply(myInteger42);
        boolean boolean47 = myInteger42.equals((java.lang.Object) (byte) -1);
        MyInteger myInteger49 = new MyInteger((int) (short) 0);
        boolean boolean51 = myInteger49.equals((java.lang.Object) 1.0f);
        MyInteger myInteger53 = new MyInteger((int) (short) 0);
        boolean boolean55 = myInteger53.equals((java.lang.Object) 1.0f);
        MyInteger myInteger57 = new MyInteger((int) (short) 0);
        boolean boolean59 = myInteger57.equals((java.lang.Object) 1.0f);
        MyInteger myInteger60 = myInteger53.multiply(myInteger57);
        int int61 = myInteger53.getIntValue();
        int int62 = myInteger53.getIntValue();
        MyInteger myInteger64 = new MyInteger((int) (short) 0);
        boolean boolean66 = myInteger64.equals((java.lang.Object) 1.0f);
        MyInteger myInteger68 = new MyInteger((int) (short) 0);
        boolean boolean70 = myInteger68.equals((java.lang.Object) 1.0f);
        MyInteger myInteger71 = myInteger64.multiply(myInteger68);
        MyInteger myInteger72 = myInteger53.add(myInteger64);
        int int73 = myInteger72.getIntValue();
        boolean boolean74 = myInteger49.equals((java.lang.Object) myInteger72);
        java.lang.String str75 = myInteger49.toString();
        MyInteger myInteger76 = myInteger42.multiply(myInteger49);
        MyInteger myInteger77 = myInteger35.multiply(myInteger42);
        MyInteger myInteger78 = myInteger33.add(myInteger42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger15", myInteger1.equals(myInteger15) ? myInteger1.hashCode() == myInteger15.hashCode() : true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        int int14 = myInteger5.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        MyInteger myInteger24 = myInteger5.add(myInteger16);
        MyInteger myInteger25 = myInteger1.multiply(myInteger24);
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = myInteger27.multiply(myInteger31);
        java.lang.Class<?> wildcardClass35 = myInteger31.getClass();
        boolean boolean36 = myInteger25.equals((java.lang.Object) wildcardClass35);
        MyInteger myInteger38 = new MyInteger((int) (byte) 10);
        MyInteger myInteger39 = myInteger25.multiply(myInteger38);
        MyInteger myInteger41 = new MyInteger((int) (short) 0);
        boolean boolean43 = myInteger41.equals((java.lang.Object) 1.0f);
        MyInteger myInteger45 = new MyInteger((int) (short) 0);
        boolean boolean47 = myInteger45.equals((java.lang.Object) 1.0f);
        MyInteger myInteger48 = myInteger41.multiply(myInteger45);
        MyInteger myInteger49 = myInteger39.add(myInteger45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger38", myInteger1.equals(myInteger38) ? myInteger1.hashCode() == myInteger38.hashCode() : true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger14 = myInteger7.multiply(myInteger11);
        int int15 = myInteger7.getIntValue();
        int int16 = myInteger7.getIntValue();
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = myInteger18.multiply(myInteger22);
        MyInteger myInteger26 = myInteger7.add(myInteger18);
        MyInteger myInteger27 = myInteger3.multiply(myInteger26);
        MyInteger myInteger28 = myInteger1.add(myInteger27);
        java.lang.String str29 = myInteger28.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger3", myInteger1.equals(myInteger3) ? myInteger1.hashCode() == myInteger3.hashCode() : true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        MyInteger myInteger1 = new MyInteger((int) (byte) 100);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger6 = myInteger1.multiply(myInteger3);
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = myInteger12.multiply(myInteger16);
        MyInteger myInteger20 = myInteger8.multiply(myInteger12);
        MyInteger myInteger22 = new MyInteger((int) (short) -1);
        boolean boolean23 = myInteger20.equals((java.lang.Object) myInteger22);
        MyInteger myInteger24 = myInteger1.add(myInteger22);
        java.lang.Class<?> wildcardClass25 = myInteger24.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger3", myInteger1.equals(myInteger3) ? myInteger1.hashCode() == myInteger3.hashCode() : true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        MyInteger myInteger11 = myInteger1.multiply(myInteger10);
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger21 = new MyInteger((int) (short) 0);
        boolean boolean23 = myInteger21.equals((java.lang.Object) 1.0f);
        MyInteger myInteger24 = myInteger17.multiply(myInteger21);
        MyInteger myInteger25 = myInteger13.add(myInteger21);
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger38 = myInteger31.multiply(myInteger35);
        MyInteger myInteger39 = myInteger27.multiply(myInteger31);
        MyInteger myInteger41 = new MyInteger((int) (short) -1);
        java.lang.String str42 = myInteger41.toString();
        java.lang.String str43 = myInteger41.toString();
        MyInteger myInteger44 = myInteger31.multiply(myInteger41);
        MyInteger myInteger45 = myInteger13.multiply(myInteger41);
        java.lang.Class<?> wildcardClass46 = myInteger41.getClass();
        boolean boolean47 = myInteger11.equals((java.lang.Object) wildcardClass46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger41", myInteger1.equals(myInteger41) ? myInteger1.hashCode() == myInteger41.hashCode() : true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.multiply(myInteger5);
        MyInteger myInteger15 = new MyInteger((int) '#');
        int int16 = myInteger15.getIntValue();
        java.lang.String str17 = myInteger15.toString();
        MyInteger myInteger18 = myInteger1.add(myInteger15);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger24 = new MyInteger((int) (short) 0);
        boolean boolean26 = myInteger24.equals((java.lang.Object) 1.0f);
        MyInteger myInteger28 = new MyInteger((int) (short) 0);
        boolean boolean30 = myInteger28.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = myInteger24.multiply(myInteger28);
        int int32 = myInteger24.getIntValue();
        int int33 = myInteger24.getIntValue();
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger42 = myInteger35.multiply(myInteger39);
        MyInteger myInteger43 = myInteger24.add(myInteger35);
        int int44 = myInteger43.getIntValue();
        boolean boolean45 = myInteger20.equals((java.lang.Object) myInteger43);
        java.lang.String str46 = myInteger20.toString();
        MyInteger myInteger47 = myInteger1.multiply(myInteger20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger5 and myInteger15", myInteger5.equals(myInteger15) ? myInteger5.hashCode() == myInteger15.hashCode() : true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        MyInteger myInteger1 = new MyInteger((int) 'a');
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        MyInteger myInteger5 = new MyInteger((int) (short) -1);
        java.lang.String str6 = myInteger5.toString();
        MyInteger myInteger7 = myInteger3.add(myInteger5);
        boolean boolean8 = myInteger1.equals((java.lang.Object) myInteger3);
        int int9 = myInteger3.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger5", myInteger1.equals(myInteger5) ? myInteger1.hashCode() == myInteger5.hashCode() : true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        int int2 = myInteger1.getIntValue();
        MyInteger myInteger4 = new MyInteger((int) (short) 0);
        boolean boolean6 = myInteger4.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger15 = myInteger8.multiply(myInteger12);
        MyInteger myInteger16 = myInteger4.add(myInteger12);
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = new MyInteger((int) (short) 0);
        boolean boolean28 = myInteger26.equals((java.lang.Object) 1.0f);
        MyInteger myInteger29 = myInteger22.multiply(myInteger26);
        int int30 = myInteger22.getIntValue();
        int int31 = myInteger22.getIntValue();
        MyInteger myInteger33 = new MyInteger((int) (short) 0);
        boolean boolean35 = myInteger33.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = new MyInteger((int) (short) 0);
        boolean boolean39 = myInteger37.equals((java.lang.Object) 1.0f);
        MyInteger myInteger40 = myInteger33.multiply(myInteger37);
        MyInteger myInteger41 = myInteger22.add(myInteger33);
        int int42 = myInteger41.getIntValue();
        boolean boolean43 = myInteger18.equals((java.lang.Object) myInteger41);
        int int44 = myInteger41.getIntValue();
        MyInteger myInteger46 = new MyInteger((int) (short) 0);
        boolean boolean48 = myInteger46.equals((java.lang.Object) 1.0f);
        MyInteger myInteger50 = new MyInteger((int) (short) 0);
        boolean boolean52 = myInteger50.equals((java.lang.Object) 1.0f);
        MyInteger myInteger53 = myInteger46.multiply(myInteger50);
        int int54 = myInteger50.getIntValue();
        MyInteger myInteger55 = myInteger41.multiply(myInteger50);
        boolean boolean57 = myInteger50.equals((java.lang.Object) "97");
        MyInteger myInteger58 = myInteger12.multiply(myInteger50);
        MyInteger myInteger60 = new MyInteger((int) (short) 0);
        boolean boolean62 = myInteger60.equals((java.lang.Object) 1.0f);
        MyInteger myInteger64 = new MyInteger((int) (short) 0);
        boolean boolean66 = myInteger64.equals((java.lang.Object) 1.0f);
        MyInteger myInteger67 = myInteger60.multiply(myInteger64);
        MyInteger myInteger69 = new MyInteger((int) (short) 0);
        MyInteger myInteger70 = myInteger60.multiply(myInteger69);
        int int71 = myInteger60.getIntValue();
        MyInteger myInteger72 = myInteger50.add(myInteger60);
        MyInteger myInteger73 = myInteger1.add(myInteger60);
        MyInteger myInteger75 = new MyInteger((int) (byte) 100);
        MyInteger myInteger77 = new MyInteger((int) (short) 0);
        boolean boolean79 = myInteger77.equals((java.lang.Object) 1.0f);
        MyInteger myInteger80 = myInteger75.multiply(myInteger77);
        MyInteger myInteger81 = myInteger73.multiply(myInteger77);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger75", myInteger1.equals(myInteger75) ? myInteger1.hashCode() == myInteger75.hashCode() : true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        int int14 = myInteger5.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        MyInteger myInteger24 = myInteger5.add(myInteger16);
        MyInteger myInteger25 = myInteger1.multiply(myInteger24);
        java.lang.String str26 = myInteger24.toString();
        boolean boolean28 = myInteger24.equals((java.lang.Object) "1");
        MyInteger myInteger30 = new MyInteger((int) (short) 0);
        boolean boolean32 = myInteger30.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger38 = new MyInteger((int) (short) 0);
        boolean boolean40 = myInteger38.equals((java.lang.Object) 1.0f);
        MyInteger myInteger41 = myInteger34.multiply(myInteger38);
        MyInteger myInteger42 = myInteger30.add(myInteger38);
        MyInteger myInteger44 = new MyInteger((int) (short) 0);
        boolean boolean46 = myInteger44.equals((java.lang.Object) 1.0f);
        MyInteger myInteger48 = new MyInteger((int) (short) 0);
        boolean boolean50 = myInteger48.equals((java.lang.Object) 1.0f);
        MyInteger myInteger52 = new MyInteger((int) (short) 0);
        boolean boolean54 = myInteger52.equals((java.lang.Object) 1.0f);
        MyInteger myInteger55 = myInteger48.multiply(myInteger52);
        MyInteger myInteger56 = myInteger44.multiply(myInteger48);
        MyInteger myInteger58 = new MyInteger((int) (short) -1);
        java.lang.String str59 = myInteger58.toString();
        java.lang.String str60 = myInteger58.toString();
        MyInteger myInteger61 = myInteger48.multiply(myInteger58);
        MyInteger myInteger62 = myInteger30.multiply(myInteger58);
        MyInteger myInteger63 = myInteger24.add(myInteger58);
        MyInteger myInteger65 = new MyInteger((int) (byte) 10);
        MyInteger myInteger67 = new MyInteger((int) (short) 0);
        boolean boolean69 = myInteger67.equals((java.lang.Object) 1.0f);
        MyInteger myInteger71 = new MyInteger((int) (short) 0);
        boolean boolean73 = myInteger71.equals((java.lang.Object) 1.0f);
        MyInteger myInteger74 = myInteger67.multiply(myInteger71);
        MyInteger myInteger76 = new MyInteger((int) (short) 0);
        MyInteger myInteger77 = myInteger67.multiply(myInteger76);
        boolean boolean79 = myInteger67.equals((java.lang.Object) '4');
        MyInteger myInteger80 = myInteger65.add(myInteger67);
        MyInteger myInteger81 = myInteger24.multiply(myInteger65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger58", myInteger1.equals(myInteger58) ? myInteger1.hashCode() == myInteger58.hashCode() : true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        MyInteger myInteger1 = new MyInteger(1);
        java.lang.String str2 = myInteger1.toString();
        MyInteger myInteger4 = new MyInteger((int) (short) 0);
        boolean boolean6 = myInteger4.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger15 = myInteger8.multiply(myInteger12);
        int int16 = myInteger8.getIntValue();
        int int17 = myInteger8.getIntValue();
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        MyInteger myInteger27 = myInteger8.add(myInteger19);
        MyInteger myInteger28 = myInteger4.multiply(myInteger27);
        java.lang.String str29 = myInteger4.toString();
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger42 = myInteger35.multiply(myInteger39);
        int int43 = myInteger35.getIntValue();
        int int44 = myInteger35.getIntValue();
        MyInteger myInteger46 = new MyInteger((int) (short) 0);
        boolean boolean48 = myInteger46.equals((java.lang.Object) 1.0f);
        MyInteger myInteger50 = new MyInteger((int) (short) 0);
        boolean boolean52 = myInteger50.equals((java.lang.Object) 1.0f);
        MyInteger myInteger53 = myInteger46.multiply(myInteger50);
        MyInteger myInteger54 = myInteger35.add(myInteger46);
        MyInteger myInteger55 = myInteger31.multiply(myInteger54);
        MyInteger myInteger56 = myInteger4.multiply(myInteger55);
        MyInteger myInteger57 = myInteger1.multiply(myInteger56);
        MyInteger myInteger59 = new MyInteger((int) (short) 0);
        boolean boolean61 = myInteger59.equals((java.lang.Object) 1.0f);
        MyInteger myInteger63 = new MyInteger((int) (short) 0);
        boolean boolean65 = myInteger63.equals((java.lang.Object) 1.0f);
        MyInteger myInteger67 = new MyInteger((int) (short) 0);
        boolean boolean69 = myInteger67.equals((java.lang.Object) 1.0f);
        MyInteger myInteger70 = myInteger63.multiply(myInteger67);
        int int71 = myInteger63.getIntValue();
        int int72 = myInteger63.getIntValue();
        MyInteger myInteger74 = new MyInteger((int) (short) 0);
        boolean boolean76 = myInteger74.equals((java.lang.Object) 1.0f);
        MyInteger myInteger78 = new MyInteger((int) (short) 0);
        boolean boolean80 = myInteger78.equals((java.lang.Object) 1.0f);
        MyInteger myInteger81 = myInteger74.multiply(myInteger78);
        MyInteger myInteger82 = myInteger63.add(myInteger74);
        int int83 = myInteger82.getIntValue();
        boolean boolean84 = myInteger59.equals((java.lang.Object) myInteger82);
        java.lang.String str85 = myInteger59.toString();
        MyInteger myInteger87 = new MyInteger((int) (byte) 10);
        MyInteger myInteger88 = myInteger59.add(myInteger87);
        MyInteger myInteger89 = myInteger57.multiply(myInteger59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger4", myInteger1.equals(myInteger4) ? myInteger1.hashCode() == myInteger4.hashCode() : true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        MyInteger myInteger3 = new MyInteger((int) (short) -1);
        java.lang.String str4 = myInteger3.toString();
        MyInteger myInteger5 = myInteger1.add(myInteger3);
        int int6 = myInteger1.getIntValue();
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = myInteger12.multiply(myInteger16);
        MyInteger myInteger20 = myInteger8.multiply(myInteger12);
        int int21 = myInteger8.getIntValue();
        MyInteger myInteger22 = myInteger1.multiply(myInteger8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger12", myInteger3.equals(myInteger12) ? myInteger3.hashCode() == myInteger12.hashCode() : true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        int int14 = myInteger5.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        MyInteger myInteger24 = myInteger5.add(myInteger16);
        MyInteger myInteger25 = myInteger1.multiply(myInteger24);
        int int26 = myInteger25.getIntValue();
        MyInteger myInteger28 = new MyInteger((int) (short) -1);
        java.lang.String str29 = myInteger28.toString();
        java.lang.String str30 = myInteger28.toString();
        int int31 = myInteger28.getIntValue();
        MyInteger myInteger33 = new MyInteger(1);
        java.lang.String str34 = myInteger33.toString();
        MyInteger myInteger36 = new MyInteger((int) (short) 0);
        boolean boolean38 = myInteger36.equals((java.lang.Object) 1.0f);
        MyInteger myInteger40 = new MyInteger((int) (short) 0);
        boolean boolean42 = myInteger40.equals((java.lang.Object) 1.0f);
        MyInteger myInteger44 = new MyInteger((int) (short) 0);
        boolean boolean46 = myInteger44.equals((java.lang.Object) 1.0f);
        MyInteger myInteger47 = myInteger40.multiply(myInteger44);
        int int48 = myInteger40.getIntValue();
        int int49 = myInteger40.getIntValue();
        MyInteger myInteger51 = new MyInteger((int) (short) 0);
        boolean boolean53 = myInteger51.equals((java.lang.Object) 1.0f);
        MyInteger myInteger55 = new MyInteger((int) (short) 0);
        boolean boolean57 = myInteger55.equals((java.lang.Object) 1.0f);
        MyInteger myInteger58 = myInteger51.multiply(myInteger55);
        MyInteger myInteger59 = myInteger40.add(myInteger51);
        MyInteger myInteger60 = myInteger36.multiply(myInteger59);
        java.lang.String str61 = myInteger36.toString();
        MyInteger myInteger63 = new MyInteger((int) (short) 0);
        boolean boolean65 = myInteger63.equals((java.lang.Object) 1.0f);
        MyInteger myInteger67 = new MyInteger((int) (short) 0);
        boolean boolean69 = myInteger67.equals((java.lang.Object) 1.0f);
        MyInteger myInteger71 = new MyInteger((int) (short) 0);
        boolean boolean73 = myInteger71.equals((java.lang.Object) 1.0f);
        MyInteger myInteger74 = myInteger67.multiply(myInteger71);
        int int75 = myInteger67.getIntValue();
        int int76 = myInteger67.getIntValue();
        MyInteger myInteger78 = new MyInteger((int) (short) 0);
        boolean boolean80 = myInteger78.equals((java.lang.Object) 1.0f);
        MyInteger myInteger82 = new MyInteger((int) (short) 0);
        boolean boolean84 = myInteger82.equals((java.lang.Object) 1.0f);
        MyInteger myInteger85 = myInteger78.multiply(myInteger82);
        MyInteger myInteger86 = myInteger67.add(myInteger78);
        MyInteger myInteger87 = myInteger63.multiply(myInteger86);
        MyInteger myInteger88 = myInteger36.multiply(myInteger87);
        MyInteger myInteger89 = myInteger33.multiply(myInteger88);
        MyInteger myInteger90 = myInteger28.add(myInteger33);
        MyInteger myInteger91 = myInteger25.multiply(myInteger90);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger28", myInteger1.equals(myInteger28) ? myInteger1.hashCode() == myInteger28.hashCode() : true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        MyInteger myInteger1 = new MyInteger((int) (short) 10);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger14 = myInteger7.multiply(myInteger11);
        MyInteger myInteger15 = myInteger3.multiply(myInteger7);
        boolean boolean16 = myInteger1.equals((java.lang.Object) myInteger3);
        java.lang.Class<?> wildcardClass17 = myInteger3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger7", myInteger1.equals(myInteger7) ? myInteger1.hashCode() == myInteger7.hashCode() : true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        int int2 = myInteger1.getIntValue();
        MyInteger myInteger4 = new MyInteger((int) (short) -1);
        java.lang.String str5 = myInteger4.toString();
        MyInteger myInteger6 = myInteger1.add(myInteger4);
        MyInteger myInteger8 = new MyInteger(1);
        java.lang.String str9 = myInteger8.toString();
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = myInteger15.multiply(myInteger19);
        int int23 = myInteger15.getIntValue();
        int int24 = myInteger15.getIntValue();
        MyInteger myInteger26 = new MyInteger((int) (short) 0);
        boolean boolean28 = myInteger26.equals((java.lang.Object) 1.0f);
        MyInteger myInteger30 = new MyInteger((int) (short) 0);
        boolean boolean32 = myInteger30.equals((java.lang.Object) 1.0f);
        MyInteger myInteger33 = myInteger26.multiply(myInteger30);
        MyInteger myInteger34 = myInteger15.add(myInteger26);
        MyInteger myInteger35 = myInteger11.multiply(myInteger34);
        java.lang.String str36 = myInteger11.toString();
        MyInteger myInteger38 = new MyInteger((int) (short) 0);
        boolean boolean40 = myInteger38.equals((java.lang.Object) 1.0f);
        MyInteger myInteger42 = new MyInteger((int) (short) 0);
        boolean boolean44 = myInteger42.equals((java.lang.Object) 1.0f);
        MyInteger myInteger46 = new MyInteger((int) (short) 0);
        boolean boolean48 = myInteger46.equals((java.lang.Object) 1.0f);
        MyInteger myInteger49 = myInteger42.multiply(myInteger46);
        int int50 = myInteger42.getIntValue();
        int int51 = myInteger42.getIntValue();
        MyInteger myInteger53 = new MyInteger((int) (short) 0);
        boolean boolean55 = myInteger53.equals((java.lang.Object) 1.0f);
        MyInteger myInteger57 = new MyInteger((int) (short) 0);
        boolean boolean59 = myInteger57.equals((java.lang.Object) 1.0f);
        MyInteger myInteger60 = myInteger53.multiply(myInteger57);
        MyInteger myInteger61 = myInteger42.add(myInteger53);
        MyInteger myInteger62 = myInteger38.multiply(myInteger61);
        MyInteger myInteger63 = myInteger11.multiply(myInteger62);
        MyInteger myInteger64 = myInteger8.multiply(myInteger63);
        MyInteger myInteger66 = new MyInteger((int) (short) 0);
        boolean boolean68 = myInteger66.equals((java.lang.Object) 1.0f);
        MyInteger myInteger70 = new MyInteger((int) (short) 0);
        boolean boolean72 = myInteger70.equals((java.lang.Object) 1.0f);
        MyInteger myInteger73 = myInteger66.multiply(myInteger70);
        boolean boolean75 = myInteger70.equals((java.lang.Object) (byte) -1);
        int int76 = myInteger70.getIntValue();
        MyInteger myInteger78 = new MyInteger((int) (short) 0);
        boolean boolean80 = myInteger78.equals((java.lang.Object) 1.0f);
        MyInteger myInteger82 = new MyInteger((int) (short) 0);
        boolean boolean84 = myInteger82.equals((java.lang.Object) 1.0f);
        MyInteger myInteger85 = myInteger78.multiply(myInteger82);
        int int86 = myInteger78.getIntValue();
        java.lang.String str87 = myInteger78.toString();
        java.lang.String str88 = myInteger78.toString();
        MyInteger myInteger89 = myInteger70.add(myInteger78);
        java.lang.String str90 = myInteger70.toString();
        MyInteger myInteger91 = myInteger8.add(myInteger70);
        MyInteger myInteger92 = myInteger4.multiply(myInteger70);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger6", myInteger1.equals(myInteger6) ? myInteger1.hashCode() == myInteger6.hashCode() : true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = myInteger3.multiply(myInteger7);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        MyInteger myInteger13 = myInteger3.multiply(myInteger12);
        boolean boolean15 = myInteger3.equals((java.lang.Object) '4');
        MyInteger myInteger16 = myInteger1.add(myInteger3);
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = new MyInteger((int) (short) 0);
        boolean boolean28 = myInteger26.equals((java.lang.Object) 1.0f);
        MyInteger myInteger29 = myInteger22.multiply(myInteger26);
        int int30 = myInteger22.getIntValue();
        int int31 = myInteger22.getIntValue();
        MyInteger myInteger33 = new MyInteger((int) (short) 0);
        boolean boolean35 = myInteger33.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = new MyInteger((int) (short) 0);
        boolean boolean39 = myInteger37.equals((java.lang.Object) 1.0f);
        MyInteger myInteger40 = myInteger33.multiply(myInteger37);
        MyInteger myInteger41 = myInteger22.add(myInteger33);
        MyInteger myInteger42 = myInteger18.multiply(myInteger41);
        MyInteger myInteger44 = new MyInteger((int) (short) 0);
        boolean boolean46 = myInteger44.equals((java.lang.Object) 1.0f);
        MyInteger myInteger48 = new MyInteger((int) (short) 0);
        boolean boolean50 = myInteger48.equals((java.lang.Object) 1.0f);
        MyInteger myInteger51 = myInteger44.multiply(myInteger48);
        java.lang.Class<?> wildcardClass52 = myInteger48.getClass();
        boolean boolean53 = myInteger42.equals((java.lang.Object) wildcardClass52);
        MyInteger myInteger55 = new MyInteger((int) (short) 0);
        boolean boolean57 = myInteger55.equals((java.lang.Object) 1.0f);
        MyInteger myInteger59 = new MyInteger((int) (short) 0);
        boolean boolean61 = myInteger59.equals((java.lang.Object) 1.0f);
        MyInteger myInteger63 = new MyInteger((int) (short) 0);
        boolean boolean65 = myInteger63.equals((java.lang.Object) 1.0f);
        MyInteger myInteger66 = myInteger59.multiply(myInteger63);
        MyInteger myInteger67 = myInteger55.add(myInteger63);
        MyInteger myInteger69 = new MyInteger((int) (short) 0);
        boolean boolean71 = myInteger69.equals((java.lang.Object) 1.0f);
        MyInteger myInteger73 = new MyInteger((int) (short) 0);
        boolean boolean75 = myInteger73.equals((java.lang.Object) 1.0f);
        MyInteger myInteger77 = new MyInteger((int) (short) 0);
        boolean boolean79 = myInteger77.equals((java.lang.Object) 1.0f);
        MyInteger myInteger80 = myInteger73.multiply(myInteger77);
        MyInteger myInteger81 = myInteger69.multiply(myInteger73);
        MyInteger myInteger83 = new MyInteger((int) (short) -1);
        java.lang.String str84 = myInteger83.toString();
        java.lang.String str85 = myInteger83.toString();
        MyInteger myInteger86 = myInteger73.multiply(myInteger83);
        MyInteger myInteger87 = myInteger55.multiply(myInteger83);
        boolean boolean88 = myInteger42.equals((java.lang.Object) myInteger83);
        MyInteger myInteger89 = myInteger16.add(myInteger42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger3", myInteger1.equals(myInteger3) ? myInteger1.hashCode() == myInteger3.hashCode() : true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger14 = myInteger7.multiply(myInteger11);
        int int15 = myInteger7.getIntValue();
        int int16 = myInteger7.getIntValue();
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = myInteger18.multiply(myInteger22);
        MyInteger myInteger26 = myInteger7.add(myInteger18);
        MyInteger myInteger27 = myInteger3.multiply(myInteger26);
        MyInteger myInteger28 = myInteger1.add(myInteger27);
        java.lang.String str29 = myInteger1.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger28", myInteger3.equals(myInteger28) ? myInteger3.hashCode() == myInteger28.hashCode() : true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        int int2 = myInteger1.getIntValue();
        MyInteger myInteger4 = new MyInteger((int) (short) -1);
        java.lang.String str5 = myInteger4.toString();
        MyInteger myInteger6 = myInteger1.add(myInteger4);
        MyInteger myInteger8 = new MyInteger((int) (short) -1);
        MyInteger myInteger9 = myInteger6.multiply(myInteger8);
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        int int12 = myInteger11.getIntValue();
        MyInteger myInteger14 = new MyInteger((int) (short) 0);
        boolean boolean16 = myInteger14.equals((java.lang.Object) 1.0f);
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = myInteger18.multiply(myInteger22);
        MyInteger myInteger26 = myInteger14.add(myInteger22);
        MyInteger myInteger28 = new MyInteger((int) (short) 0);
        boolean boolean30 = myInteger28.equals((java.lang.Object) 1.0f);
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        boolean boolean34 = myInteger32.equals((java.lang.Object) 1.0f);
        MyInteger myInteger36 = new MyInteger((int) (short) 0);
        boolean boolean38 = myInteger36.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = myInteger32.multiply(myInteger36);
        int int40 = myInteger32.getIntValue();
        int int41 = myInteger32.getIntValue();
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger47 = new MyInteger((int) (short) 0);
        boolean boolean49 = myInteger47.equals((java.lang.Object) 1.0f);
        MyInteger myInteger50 = myInteger43.multiply(myInteger47);
        MyInteger myInteger51 = myInteger32.add(myInteger43);
        int int52 = myInteger51.getIntValue();
        boolean boolean53 = myInteger28.equals((java.lang.Object) myInteger51);
        int int54 = myInteger51.getIntValue();
        MyInteger myInteger56 = new MyInteger((int) (short) 0);
        boolean boolean58 = myInteger56.equals((java.lang.Object) 1.0f);
        MyInteger myInteger60 = new MyInteger((int) (short) 0);
        boolean boolean62 = myInteger60.equals((java.lang.Object) 1.0f);
        MyInteger myInteger63 = myInteger56.multiply(myInteger60);
        int int64 = myInteger60.getIntValue();
        MyInteger myInteger65 = myInteger51.multiply(myInteger60);
        boolean boolean67 = myInteger60.equals((java.lang.Object) "97");
        MyInteger myInteger68 = myInteger22.multiply(myInteger60);
        MyInteger myInteger70 = new MyInteger((int) (short) 0);
        boolean boolean72 = myInteger70.equals((java.lang.Object) 1.0f);
        MyInteger myInteger74 = new MyInteger((int) (short) 0);
        boolean boolean76 = myInteger74.equals((java.lang.Object) 1.0f);
        MyInteger myInteger77 = myInteger70.multiply(myInteger74);
        MyInteger myInteger79 = new MyInteger((int) (short) 0);
        MyInteger myInteger80 = myInteger70.multiply(myInteger79);
        int int81 = myInteger70.getIntValue();
        MyInteger myInteger82 = myInteger60.add(myInteger70);
        MyInteger myInteger83 = myInteger11.add(myInteger70);
        boolean boolean84 = myInteger6.equals((java.lang.Object) myInteger83);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger9", myInteger1.equals(myInteger9) ? myInteger1.hashCode() == myInteger9.hashCode() : true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        MyInteger myInteger11 = myInteger1.multiply(myInteger10);
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger21 = new MyInteger((int) (short) 0);
        boolean boolean23 = myInteger21.equals((java.lang.Object) 1.0f);
        MyInteger myInteger24 = myInteger17.multiply(myInteger21);
        int int25 = myInteger17.getIntValue();
        int int26 = myInteger17.getIntValue();
        MyInteger myInteger28 = new MyInteger((int) (short) 0);
        boolean boolean30 = myInteger28.equals((java.lang.Object) 1.0f);
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        boolean boolean34 = myInteger32.equals((java.lang.Object) 1.0f);
        MyInteger myInteger35 = myInteger28.multiply(myInteger32);
        MyInteger myInteger36 = myInteger17.add(myInteger28);
        int int37 = myInteger36.getIntValue();
        boolean boolean38 = myInteger13.equals((java.lang.Object) myInteger36);
        MyInteger myInteger39 = myInteger10.multiply(myInteger13);
        MyInteger myInteger41 = new MyInteger((int) (byte) 100);
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger46 = myInteger41.multiply(myInteger43);
        boolean boolean47 = myInteger39.equals((java.lang.Object) myInteger41);
        int int48 = myInteger39.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger41", myInteger1.equals(myInteger41) ? myInteger1.hashCode() == myInteger41.hashCode() : true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        MyInteger myInteger1 = new MyInteger((int) ' ');
        MyInteger myInteger3 = new MyInteger((int) 'a');
        int int4 = myInteger3.getIntValue();
        MyInteger myInteger5 = myInteger1.multiply(myInteger3);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger18 = myInteger11.multiply(myInteger15);
        int int19 = myInteger11.getIntValue();
        int int20 = myInteger11.getIntValue();
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = new MyInteger((int) (short) 0);
        boolean boolean28 = myInteger26.equals((java.lang.Object) 1.0f);
        MyInteger myInteger29 = myInteger22.multiply(myInteger26);
        MyInteger myInteger30 = myInteger11.add(myInteger22);
        MyInteger myInteger31 = myInteger7.multiply(myInteger30);
        java.lang.String str32 = myInteger30.toString();
        boolean boolean34 = myInteger30.equals((java.lang.Object) "1");
        MyInteger myInteger35 = myInteger1.add(myInteger30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger5", myInteger3.equals(myInteger5) ? myInteger3.hashCode() == myInteger5.hashCode() : true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        int int14 = myInteger5.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        MyInteger myInteger24 = myInteger5.add(myInteger16);
        int int25 = myInteger24.getIntValue();
        boolean boolean26 = myInteger1.equals((java.lang.Object) myInteger24);
        java.lang.String str27 = myInteger1.toString();
        MyInteger myInteger29 = new MyInteger((int) (byte) 10);
        MyInteger myInteger30 = myInteger1.add(myInteger29);
        MyInteger myInteger32 = new MyInteger((int) (short) 10);
        MyInteger myInteger33 = myInteger30.add(myInteger32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger29", myInteger1.equals(myInteger29) ? myInteger1.hashCode() == myInteger29.hashCode() : true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        MyInteger myInteger1 = new MyInteger(1);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = myInteger3.multiply(myInteger7);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        MyInteger myInteger13 = myInteger3.multiply(myInteger12);
        java.lang.String str14 = myInteger3.toString();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        int int24 = myInteger16.getIntValue();
        java.lang.String str25 = myInteger16.toString();
        boolean boolean27 = myInteger16.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger28 = myInteger3.multiply(myInteger16);
        java.lang.String str29 = myInteger28.toString();
        int int30 = myInteger28.getIntValue();
        java.lang.Class<?> wildcardClass31 = myInteger28.getClass();
        boolean boolean32 = myInteger1.equals((java.lang.Object) myInteger28);
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger38 = new MyInteger((int) (short) 0);
        boolean boolean40 = myInteger38.equals((java.lang.Object) 1.0f);
        MyInteger myInteger42 = new MyInteger((int) (short) 0);
        boolean boolean44 = myInteger42.equals((java.lang.Object) 1.0f);
        MyInteger myInteger45 = myInteger38.multiply(myInteger42);
        MyInteger myInteger46 = myInteger34.add(myInteger42);
        MyInteger myInteger48 = new MyInteger((int) (short) 0);
        boolean boolean50 = myInteger48.equals((java.lang.Object) 1.0f);
        MyInteger myInteger52 = new MyInteger((int) (short) 0);
        boolean boolean54 = myInteger52.equals((java.lang.Object) 1.0f);
        MyInteger myInteger56 = new MyInteger((int) (short) 0);
        boolean boolean58 = myInteger56.equals((java.lang.Object) 1.0f);
        MyInteger myInteger59 = myInteger52.multiply(myInteger56);
        MyInteger myInteger60 = myInteger48.multiply(myInteger52);
        MyInteger myInteger62 = new MyInteger((int) (short) -1);
        java.lang.String str63 = myInteger62.toString();
        java.lang.String str64 = myInteger62.toString();
        MyInteger myInteger65 = myInteger52.multiply(myInteger62);
        MyInteger myInteger66 = myInteger34.multiply(myInteger62);
        MyInteger myInteger68 = new MyInteger((int) (short) 0);
        boolean boolean70 = myInteger68.equals((java.lang.Object) 1.0f);
        MyInteger myInteger72 = new MyInteger((int) (short) 0);
        boolean boolean74 = myInteger72.equals((java.lang.Object) 1.0f);
        MyInteger myInteger75 = myInteger68.multiply(myInteger72);
        int int76 = myInteger68.getIntValue();
        java.lang.String str77 = myInteger68.toString();
        java.lang.String str78 = myInteger68.toString();
        MyInteger myInteger79 = myInteger62.add(myInteger68);
        boolean boolean80 = myInteger1.equals((java.lang.Object) myInteger79);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger62", myInteger3.equals(myInteger62) ? myInteger3.hashCode() == myInteger62.hashCode() : true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        MyInteger myInteger1 = new MyInteger(10);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger14 = myInteger7.multiply(myInteger11);
        int int15 = myInteger7.getIntValue();
        int int16 = myInteger7.getIntValue();
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = myInteger18.multiply(myInteger22);
        MyInteger myInteger26 = myInteger7.add(myInteger18);
        int int27 = myInteger26.getIntValue();
        boolean boolean28 = myInteger3.equals((java.lang.Object) myInteger26);
        int int29 = myInteger26.getIntValue();
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger38 = myInteger31.multiply(myInteger35);
        int int39 = myInteger35.getIntValue();
        MyInteger myInteger40 = myInteger26.multiply(myInteger35);
        MyInteger myInteger42 = new MyInteger((int) (short) 0);
        boolean boolean44 = myInteger42.equals((java.lang.Object) 1.0f);
        MyInteger myInteger46 = new MyInteger((int) (short) 0);
        boolean boolean48 = myInteger46.equals((java.lang.Object) 1.0f);
        MyInteger myInteger50 = new MyInteger((int) (short) 0);
        boolean boolean52 = myInteger50.equals((java.lang.Object) 1.0f);
        MyInteger myInteger53 = myInteger46.multiply(myInteger50);
        MyInteger myInteger54 = myInteger42.add(myInteger50);
        int int55 = myInteger54.getIntValue();
        MyInteger myInteger56 = myInteger35.add(myInteger54);
        boolean boolean57 = myInteger1.equals((java.lang.Object) myInteger54);
        MyInteger myInteger59 = new MyInteger((int) (short) -1);
        java.lang.String str60 = myInteger59.toString();
        boolean boolean62 = myInteger59.equals((java.lang.Object) (-1));
        int int63 = myInteger59.getIntValue();
        MyInteger myInteger64 = myInteger54.add(myInteger59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger3", myInteger1.equals(myInteger3) ? myInteger1.hashCode() == myInteger3.hashCode() : true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.add(myInteger9);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = myInteger15.multiply(myInteger19);
        int int23 = myInteger19.getIntValue();
        MyInteger myInteger24 = myInteger13.multiply(myInteger19);
        MyInteger myInteger26 = new MyInteger(10);
        MyInteger myInteger28 = new MyInteger((int) (short) 0);
        boolean boolean30 = myInteger28.equals((java.lang.Object) 1.0f);
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        boolean boolean34 = myInteger32.equals((java.lang.Object) 1.0f);
        MyInteger myInteger35 = myInteger28.multiply(myInteger32);
        MyInteger myInteger37 = new MyInteger((int) (short) 0);
        MyInteger myInteger38 = myInteger28.multiply(myInteger37);
        java.lang.String str39 = myInteger28.toString();
        MyInteger myInteger41 = new MyInteger((int) (short) 0);
        boolean boolean43 = myInteger41.equals((java.lang.Object) 1.0f);
        MyInteger myInteger45 = new MyInteger((int) (short) 0);
        boolean boolean47 = myInteger45.equals((java.lang.Object) 1.0f);
        MyInteger myInteger48 = myInteger41.multiply(myInteger45);
        int int49 = myInteger41.getIntValue();
        java.lang.String str50 = myInteger41.toString();
        boolean boolean52 = myInteger41.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger53 = myInteger28.multiply(myInteger41);
        MyInteger myInteger54 = myInteger26.add(myInteger28);
        boolean boolean55 = myInteger13.equals((java.lang.Object) myInteger54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger26", myInteger1.equals(myInteger26) ? myInteger1.hashCode() == myInteger26.hashCode() : true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.add(myInteger9);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        int int27 = myInteger19.getIntValue();
        int int28 = myInteger19.getIntValue();
        MyInteger myInteger30 = new MyInteger((int) (short) 0);
        boolean boolean32 = myInteger30.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = myInteger30.multiply(myInteger34);
        MyInteger myInteger38 = myInteger19.add(myInteger30);
        int int39 = myInteger38.getIntValue();
        boolean boolean40 = myInteger15.equals((java.lang.Object) myInteger38);
        int int41 = myInteger38.getIntValue();
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger47 = new MyInteger((int) (short) 0);
        boolean boolean49 = myInteger47.equals((java.lang.Object) 1.0f);
        MyInteger myInteger50 = myInteger43.multiply(myInteger47);
        int int51 = myInteger47.getIntValue();
        MyInteger myInteger52 = myInteger38.multiply(myInteger47);
        boolean boolean54 = myInteger47.equals((java.lang.Object) "97");
        MyInteger myInteger55 = myInteger9.multiply(myInteger47);
        MyInteger myInteger57 = new MyInteger((int) (short) 0);
        boolean boolean59 = myInteger57.equals((java.lang.Object) 1.0f);
        MyInteger myInteger61 = new MyInteger((int) (short) 0);
        boolean boolean63 = myInteger61.equals((java.lang.Object) 1.0f);
        MyInteger myInteger64 = myInteger57.multiply(myInteger61);
        MyInteger myInteger66 = new MyInteger((int) (short) 0);
        MyInteger myInteger67 = myInteger57.multiply(myInteger66);
        int int68 = myInteger57.getIntValue();
        MyInteger myInteger69 = myInteger47.add(myInteger57);
        int int70 = myInteger47.getIntValue();
        MyInteger myInteger72 = new MyInteger((int) ' ');
        MyInteger myInteger74 = new MyInteger((int) 'a');
        int int75 = myInteger74.getIntValue();
        MyInteger myInteger76 = myInteger72.multiply(myInteger74);
        boolean boolean77 = myInteger47.equals((java.lang.Object) myInteger76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger72", myInteger1.equals(myInteger72) ? myInteger1.hashCode() == myInteger72.hashCode() : true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        int int14 = myInteger5.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        MyInteger myInteger24 = myInteger5.add(myInteger16);
        MyInteger myInteger25 = myInteger1.multiply(myInteger24);
        java.lang.String str26 = myInteger24.toString();
        boolean boolean28 = myInteger24.equals((java.lang.Object) "1");
        MyInteger myInteger30 = new MyInteger((int) (short) -1);
        java.lang.String str31 = myInteger30.toString();
        boolean boolean33 = myInteger30.equals((java.lang.Object) (-1));
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger42 = myInteger35.multiply(myInteger39);
        MyInteger myInteger44 = new MyInteger((int) (short) 0);
        MyInteger myInteger45 = myInteger35.multiply(myInteger44);
        java.lang.String str46 = myInteger35.toString();
        MyInteger myInteger48 = new MyInteger((int) (short) 0);
        boolean boolean50 = myInteger48.equals((java.lang.Object) 1.0f);
        MyInteger myInteger52 = new MyInteger((int) (short) 0);
        boolean boolean54 = myInteger52.equals((java.lang.Object) 1.0f);
        MyInteger myInteger55 = myInteger48.multiply(myInteger52);
        int int56 = myInteger48.getIntValue();
        java.lang.String str57 = myInteger48.toString();
        boolean boolean59 = myInteger48.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger60 = myInteger35.multiply(myInteger48);
        boolean boolean61 = myInteger30.equals((java.lang.Object) myInteger48);
        MyInteger myInteger63 = new MyInteger((int) (short) 0);
        boolean boolean65 = myInteger63.equals((java.lang.Object) 1.0f);
        MyInteger myInteger67 = new MyInteger((int) (short) 0);
        boolean boolean69 = myInteger67.equals((java.lang.Object) 1.0f);
        MyInteger myInteger71 = new MyInteger((int) (short) 0);
        boolean boolean73 = myInteger71.equals((java.lang.Object) 1.0f);
        MyInteger myInteger74 = myInteger67.multiply(myInteger71);
        int int75 = myInteger67.getIntValue();
        int int76 = myInteger67.getIntValue();
        MyInteger myInteger78 = new MyInteger((int) (short) 0);
        boolean boolean80 = myInteger78.equals((java.lang.Object) 1.0f);
        MyInteger myInteger82 = new MyInteger((int) (short) 0);
        boolean boolean84 = myInteger82.equals((java.lang.Object) 1.0f);
        MyInteger myInteger85 = myInteger78.multiply(myInteger82);
        MyInteger myInteger86 = myInteger67.add(myInteger78);
        int int87 = myInteger86.getIntValue();
        boolean boolean88 = myInteger63.equals((java.lang.Object) myInteger86);
        MyInteger myInteger89 = myInteger30.multiply(myInteger86);
        MyInteger myInteger90 = myInteger24.multiply(myInteger89);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger30", myInteger1.equals(myInteger30) ? myInteger1.hashCode() == myInteger30.hashCode() : true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.add(myInteger9);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = myInteger15.multiply(myInteger19);
        int int23 = myInteger19.getIntValue();
        MyInteger myInteger24 = myInteger13.multiply(myInteger19);
        MyInteger myInteger26 = new MyInteger((int) (short) -1);
        java.lang.String str27 = myInteger26.toString();
        MyInteger myInteger29 = new MyInteger((int) (short) 0);
        boolean boolean31 = myInteger29.equals((java.lang.Object) 1.0f);
        MyInteger myInteger33 = new MyInteger((int) (short) 0);
        boolean boolean35 = myInteger33.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = new MyInteger((int) (short) 0);
        boolean boolean39 = myInteger37.equals((java.lang.Object) 1.0f);
        MyInteger myInteger40 = myInteger33.multiply(myInteger37);
        int int41 = myInteger33.getIntValue();
        int int42 = myInteger33.getIntValue();
        MyInteger myInteger44 = new MyInteger((int) (short) 0);
        boolean boolean46 = myInteger44.equals((java.lang.Object) 1.0f);
        MyInteger myInteger48 = new MyInteger((int) (short) 0);
        boolean boolean50 = myInteger48.equals((java.lang.Object) 1.0f);
        MyInteger myInteger51 = myInteger44.multiply(myInteger48);
        MyInteger myInteger52 = myInteger33.add(myInteger44);
        MyInteger myInteger53 = myInteger29.multiply(myInteger52);
        MyInteger myInteger54 = myInteger26.add(myInteger53);
        MyInteger myInteger55 = myInteger13.add(myInteger26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger54", myInteger1.equals(myInteger54) ? myInteger1.hashCode() == myInteger54.hashCode() : true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        boolean boolean10 = myInteger5.equals((java.lang.Object) (byte) -1);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        int int24 = myInteger16.getIntValue();
        int int25 = myInteger16.getIntValue();
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = myInteger27.multiply(myInteger31);
        MyInteger myInteger35 = myInteger16.add(myInteger27);
        int int36 = myInteger35.getIntValue();
        boolean boolean37 = myInteger12.equals((java.lang.Object) myInteger35);
        java.lang.String str38 = myInteger12.toString();
        MyInteger myInteger39 = myInteger5.multiply(myInteger12);
        MyInteger myInteger41 = new MyInteger((int) (short) 0);
        boolean boolean43 = myInteger41.equals((java.lang.Object) 1.0f);
        MyInteger myInteger45 = new MyInteger((int) (short) 0);
        boolean boolean47 = myInteger45.equals((java.lang.Object) 1.0f);
        MyInteger myInteger48 = myInteger41.multiply(myInteger45);
        int int49 = myInteger41.getIntValue();
        MyInteger myInteger51 = new MyInteger((int) (byte) 1);
        MyInteger myInteger52 = myInteger41.multiply(myInteger51);
        MyInteger myInteger53 = myInteger39.add(myInteger41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger51", myInteger1.equals(myInteger51) ? myInteger1.hashCode() == myInteger51.hashCode() : true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        boolean boolean4 = myInteger1.equals((java.lang.Object) (-1));
        MyInteger myInteger6 = new MyInteger((int) (short) 0);
        boolean boolean8 = myInteger6.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        boolean boolean12 = myInteger10.equals((java.lang.Object) 1.0f);
        MyInteger myInteger13 = myInteger6.multiply(myInteger10);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        MyInteger myInteger16 = myInteger6.multiply(myInteger15);
        java.lang.String str17 = myInteger6.toString();
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        int int27 = myInteger19.getIntValue();
        java.lang.String str28 = myInteger19.toString();
        boolean boolean30 = myInteger19.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger31 = myInteger6.multiply(myInteger19);
        boolean boolean32 = myInteger1.equals((java.lang.Object) myInteger19);
        int int33 = myInteger1.getIntValue();
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger46 = myInteger39.multiply(myInteger43);
        MyInteger myInteger47 = myInteger35.add(myInteger43);
        int int48 = myInteger47.getIntValue();
        MyInteger myInteger49 = myInteger1.add(myInteger47);
        int int50 = myInteger47.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger6", myInteger1.equals(myInteger6) ? myInteger1.hashCode() == myInteger6.hashCode() : true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        int int2 = myInteger1.getIntValue();
        java.lang.String str3 = myInteger1.toString();
        int int4 = myInteger1.getIntValue();
        MyInteger myInteger6 = new MyInteger((int) (byte) 1);
        MyInteger myInteger8 = new MyInteger((int) 'a');
        MyInteger myInteger9 = myInteger6.multiply(myInteger8);
        MyInteger myInteger10 = myInteger1.add(myInteger6);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        int int24 = myInteger16.getIntValue();
        int int25 = myInteger16.getIntValue();
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = myInteger27.multiply(myInteger31);
        MyInteger myInteger35 = myInteger16.add(myInteger27);
        int int36 = myInteger35.getIntValue();
        boolean boolean37 = myInteger12.equals((java.lang.Object) myInteger35);
        java.lang.String str38 = myInteger12.toString();
        MyInteger myInteger39 = myInteger6.multiply(myInteger12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger8", myInteger1.equals(myInteger8) ? myInteger1.hashCode() == myInteger8.hashCode() : true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        java.lang.String str3 = myInteger1.toString();
        int int4 = myInteger1.getIntValue();
        MyInteger myInteger6 = new MyInteger((int) (short) 0);
        boolean boolean8 = myInteger6.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        boolean boolean12 = myInteger10.equals((java.lang.Object) 1.0f);
        MyInteger myInteger14 = new MyInteger((int) (short) 0);
        boolean boolean16 = myInteger14.equals((java.lang.Object) 1.0f);
        MyInteger myInteger17 = myInteger10.multiply(myInteger14);
        int int18 = myInteger10.getIntValue();
        int int19 = myInteger10.getIntValue();
        MyInteger myInteger21 = new MyInteger((int) (short) 0);
        boolean boolean23 = myInteger21.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = new MyInteger((int) (short) 0);
        boolean boolean27 = myInteger25.equals((java.lang.Object) 1.0f);
        MyInteger myInteger28 = myInteger21.multiply(myInteger25);
        MyInteger myInteger29 = myInteger10.add(myInteger21);
        int int30 = myInteger29.getIntValue();
        boolean boolean31 = myInteger6.equals((java.lang.Object) myInteger29);
        MyInteger myInteger32 = myInteger1.add(myInteger6);
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger38 = new MyInteger((int) (short) 0);
        boolean boolean40 = myInteger38.equals((java.lang.Object) 1.0f);
        MyInteger myInteger41 = myInteger34.multiply(myInteger38);
        int int42 = myInteger34.getIntValue();
        int int43 = myInteger34.getIntValue();
        MyInteger myInteger45 = new MyInteger((int) (short) 0);
        boolean boolean47 = myInteger45.equals((java.lang.Object) 1.0f);
        MyInteger myInteger49 = new MyInteger((int) (short) 0);
        boolean boolean51 = myInteger49.equals((java.lang.Object) 1.0f);
        MyInteger myInteger53 = new MyInteger((int) (short) 0);
        boolean boolean55 = myInteger53.equals((java.lang.Object) 1.0f);
        MyInteger myInteger56 = myInteger49.multiply(myInteger53);
        MyInteger myInteger57 = myInteger45.multiply(myInteger49);
        int int58 = myInteger45.getIntValue();
        MyInteger myInteger60 = new MyInteger((int) (short) 0);
        boolean boolean62 = myInteger60.equals((java.lang.Object) 1.0f);
        MyInteger myInteger64 = new MyInteger((int) (short) 0);
        boolean boolean66 = myInteger64.equals((java.lang.Object) 1.0f);
        MyInteger myInteger68 = new MyInteger((int) (short) 0);
        boolean boolean70 = myInteger68.equals((java.lang.Object) 1.0f);
        MyInteger myInteger71 = myInteger64.multiply(myInteger68);
        int int72 = myInteger64.getIntValue();
        int int73 = myInteger64.getIntValue();
        MyInteger myInteger75 = new MyInteger((int) (short) 0);
        boolean boolean77 = myInteger75.equals((java.lang.Object) 1.0f);
        MyInteger myInteger79 = new MyInteger((int) (short) 0);
        boolean boolean81 = myInteger79.equals((java.lang.Object) 1.0f);
        MyInteger myInteger82 = myInteger75.multiply(myInteger79);
        MyInteger myInteger83 = myInteger64.add(myInteger75);
        MyInteger myInteger84 = myInteger60.multiply(myInteger83);
        java.lang.String str85 = myInteger60.toString();
        MyInteger myInteger86 = myInteger45.multiply(myInteger60);
        boolean boolean87 = myInteger34.equals((java.lang.Object) myInteger86);
        MyInteger myInteger88 = myInteger32.multiply(myInteger86);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger6", myInteger1.equals(myInteger6) ? myInteger1.hashCode() == myInteger6.hashCode() : true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        boolean boolean10 = myInteger5.equals((java.lang.Object) (byte) -1);
        int int11 = myInteger5.getIntValue();
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = myInteger13.multiply(myInteger17);
        int int21 = myInteger13.getIntValue();
        java.lang.String str22 = myInteger13.toString();
        java.lang.String str23 = myInteger13.toString();
        MyInteger myInteger24 = myInteger5.add(myInteger13);
        int int25 = myInteger13.getIntValue();
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = myInteger27.multiply(myInteger31);
        boolean boolean35 = myInteger13.equals((java.lang.Object) myInteger31);
        MyInteger myInteger37 = new MyInteger((int) (short) 0);
        boolean boolean39 = myInteger37.equals((java.lang.Object) 1.0f);
        MyInteger myInteger41 = new MyInteger((int) (short) 0);
        boolean boolean43 = myInteger41.equals((java.lang.Object) 1.0f);
        MyInteger myInteger45 = new MyInteger((int) (short) 0);
        boolean boolean47 = myInteger45.equals((java.lang.Object) 1.0f);
        MyInteger myInteger48 = myInteger41.multiply(myInteger45);
        MyInteger myInteger49 = myInteger37.add(myInteger45);
        MyInteger myInteger51 = new MyInteger((int) (short) 0);
        boolean boolean53 = myInteger51.equals((java.lang.Object) 1.0f);
        MyInteger myInteger55 = new MyInteger((int) (short) 0);
        boolean boolean57 = myInteger55.equals((java.lang.Object) 1.0f);
        MyInteger myInteger59 = new MyInteger((int) (short) 0);
        boolean boolean61 = myInteger59.equals((java.lang.Object) 1.0f);
        MyInteger myInteger62 = myInteger55.multiply(myInteger59);
        int int63 = myInteger55.getIntValue();
        int int64 = myInteger55.getIntValue();
        MyInteger myInteger66 = new MyInteger((int) (short) 0);
        boolean boolean68 = myInteger66.equals((java.lang.Object) 1.0f);
        MyInteger myInteger70 = new MyInteger((int) (short) 0);
        boolean boolean72 = myInteger70.equals((java.lang.Object) 1.0f);
        MyInteger myInteger73 = myInteger66.multiply(myInteger70);
        MyInteger myInteger74 = myInteger55.add(myInteger66);
        int int75 = myInteger74.getIntValue();
        boolean boolean76 = myInteger51.equals((java.lang.Object) myInteger74);
        int int77 = myInteger74.getIntValue();
        MyInteger myInteger79 = new MyInteger((int) (short) 0);
        boolean boolean81 = myInteger79.equals((java.lang.Object) 1.0f);
        MyInteger myInteger83 = new MyInteger((int) (short) 0);
        boolean boolean85 = myInteger83.equals((java.lang.Object) 1.0f);
        MyInteger myInteger86 = myInteger79.multiply(myInteger83);
        int int87 = myInteger83.getIntValue();
        MyInteger myInteger88 = myInteger74.multiply(myInteger83);
        boolean boolean90 = myInteger83.equals((java.lang.Object) "97");
        MyInteger myInteger91 = myInteger45.multiply(myInteger83);
        MyInteger myInteger92 = myInteger31.add(myInteger91);
        MyInteger myInteger94 = new MyInteger((int) (byte) 10);
        MyInteger myInteger95 = myInteger31.multiply(myInteger94);
        int int96 = myInteger31.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger94", myInteger1.equals(myInteger94) ? myInteger1.hashCode() == myInteger94.hashCode() : true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        MyInteger myInteger1 = new MyInteger((int) (short) 10);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger14 = myInteger7.multiply(myInteger11);
        MyInteger myInteger15 = myInteger3.multiply(myInteger7);
        boolean boolean16 = myInteger1.equals((java.lang.Object) myInteger3);
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = new MyInteger((int) (short) 0);
        boolean boolean28 = myInteger26.equals((java.lang.Object) 1.0f);
        MyInteger myInteger29 = myInteger22.multiply(myInteger26);
        int int30 = myInteger22.getIntValue();
        int int31 = myInteger22.getIntValue();
        MyInteger myInteger33 = new MyInteger((int) (short) 0);
        boolean boolean35 = myInteger33.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = new MyInteger((int) (short) 0);
        boolean boolean39 = myInteger37.equals((java.lang.Object) 1.0f);
        MyInteger myInteger40 = myInteger33.multiply(myInteger37);
        MyInteger myInteger41 = myInteger22.add(myInteger33);
        MyInteger myInteger42 = myInteger18.multiply(myInteger41);
        java.lang.String str43 = myInteger41.toString();
        boolean boolean45 = myInteger41.equals((java.lang.Object) "1");
        MyInteger myInteger47 = new MyInteger((int) (short) 0);
        boolean boolean49 = myInteger47.equals((java.lang.Object) 1.0f);
        MyInteger myInteger51 = new MyInteger((int) (short) 0);
        boolean boolean53 = myInteger51.equals((java.lang.Object) 1.0f);
        MyInteger myInteger55 = new MyInteger((int) (short) 0);
        boolean boolean57 = myInteger55.equals((java.lang.Object) 1.0f);
        MyInteger myInteger58 = myInteger51.multiply(myInteger55);
        MyInteger myInteger59 = myInteger47.add(myInteger55);
        MyInteger myInteger61 = new MyInteger((int) (short) 0);
        boolean boolean63 = myInteger61.equals((java.lang.Object) 1.0f);
        MyInteger myInteger65 = new MyInteger((int) (short) 0);
        boolean boolean67 = myInteger65.equals((java.lang.Object) 1.0f);
        MyInteger myInteger69 = new MyInteger((int) (short) 0);
        boolean boolean71 = myInteger69.equals((java.lang.Object) 1.0f);
        MyInteger myInteger72 = myInteger65.multiply(myInteger69);
        MyInteger myInteger73 = myInteger61.multiply(myInteger65);
        MyInteger myInteger75 = new MyInteger((int) (short) -1);
        java.lang.String str76 = myInteger75.toString();
        java.lang.String str77 = myInteger75.toString();
        MyInteger myInteger78 = myInteger65.multiply(myInteger75);
        MyInteger myInteger79 = myInteger47.multiply(myInteger75);
        MyInteger myInteger80 = myInteger41.add(myInteger75);
        MyInteger myInteger81 = myInteger1.multiply(myInteger41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger75", myInteger3.equals(myInteger75) ? myInteger3.hashCode() == myInteger75.hashCode() : true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        MyInteger myInteger1 = new MyInteger((int) (byte) -1);
        int int2 = myInteger1.getIntValue();
        MyInteger myInteger4 = new MyInteger((int) (short) -1);
        java.lang.String str5 = myInteger4.toString();
        boolean boolean7 = myInteger4.equals((java.lang.Object) (-1));
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger16 = myInteger9.multiply(myInteger13);
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        MyInteger myInteger19 = myInteger9.multiply(myInteger18);
        java.lang.String str20 = myInteger9.toString();
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = new MyInteger((int) (short) 0);
        boolean boolean28 = myInteger26.equals((java.lang.Object) 1.0f);
        MyInteger myInteger29 = myInteger22.multiply(myInteger26);
        int int30 = myInteger22.getIntValue();
        java.lang.String str31 = myInteger22.toString();
        boolean boolean33 = myInteger22.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger34 = myInteger9.multiply(myInteger22);
        boolean boolean35 = myInteger4.equals((java.lang.Object) myInteger22);
        MyInteger myInteger36 = myInteger1.add(myInteger4);
        java.lang.String str37 = myInteger1.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger4 and myInteger9", myInteger4.equals(myInteger9) ? myInteger4.hashCode() == myInteger9.hashCode() : true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        int int14 = myInteger5.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        MyInteger myInteger24 = myInteger5.add(myInteger16);
        MyInteger myInteger25 = myInteger1.multiply(myInteger24);
        java.lang.String str26 = myInteger24.toString();
        boolean boolean28 = myInteger24.equals((java.lang.Object) "1");
        MyInteger myInteger30 = new MyInteger((int) (short) 0);
        boolean boolean32 = myInteger30.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger38 = new MyInteger((int) (short) 0);
        boolean boolean40 = myInteger38.equals((java.lang.Object) 1.0f);
        MyInteger myInteger41 = myInteger34.multiply(myInteger38);
        MyInteger myInteger42 = myInteger30.add(myInteger38);
        MyInteger myInteger44 = new MyInteger((int) (short) 0);
        boolean boolean46 = myInteger44.equals((java.lang.Object) 1.0f);
        MyInteger myInteger48 = new MyInteger((int) (short) 0);
        boolean boolean50 = myInteger48.equals((java.lang.Object) 1.0f);
        MyInteger myInteger52 = new MyInteger((int) (short) 0);
        boolean boolean54 = myInteger52.equals((java.lang.Object) 1.0f);
        MyInteger myInteger55 = myInteger48.multiply(myInteger52);
        MyInteger myInteger56 = myInteger44.multiply(myInteger48);
        MyInteger myInteger58 = new MyInteger((int) (short) -1);
        java.lang.String str59 = myInteger58.toString();
        java.lang.String str60 = myInteger58.toString();
        MyInteger myInteger61 = myInteger48.multiply(myInteger58);
        MyInteger myInteger62 = myInteger30.multiply(myInteger58);
        MyInteger myInteger63 = myInteger24.add(myInteger58);
        MyInteger myInteger65 = new MyInteger((int) (short) 0);
        boolean boolean67 = myInteger65.equals((java.lang.Object) 1.0f);
        MyInteger myInteger69 = new MyInteger((int) (short) 0);
        boolean boolean71 = myInteger69.equals((java.lang.Object) 1.0f);
        MyInteger myInteger73 = new MyInteger((int) (short) 0);
        boolean boolean75 = myInteger73.equals((java.lang.Object) 1.0f);
        MyInteger myInteger76 = myInteger69.multiply(myInteger73);
        MyInteger myInteger77 = myInteger65.multiply(myInteger69);
        MyInteger myInteger79 = new MyInteger((int) '#');
        int int80 = myInteger79.getIntValue();
        java.lang.String str81 = myInteger79.toString();
        MyInteger myInteger82 = myInteger65.add(myInteger79);
        MyInteger myInteger83 = myInteger63.add(myInteger82);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger58", myInteger1.equals(myInteger58) ? myInteger1.hashCode() == myInteger58.hashCode() : true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        MyInteger myInteger11 = myInteger1.multiply(myInteger10);
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger21 = new MyInteger((int) (short) 0);
        boolean boolean23 = myInteger21.equals((java.lang.Object) 1.0f);
        MyInteger myInteger24 = myInteger17.multiply(myInteger21);
        int int25 = myInteger17.getIntValue();
        int int26 = myInteger17.getIntValue();
        MyInteger myInteger28 = new MyInteger((int) (short) 0);
        boolean boolean30 = myInteger28.equals((java.lang.Object) 1.0f);
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        boolean boolean34 = myInteger32.equals((java.lang.Object) 1.0f);
        MyInteger myInteger35 = myInteger28.multiply(myInteger32);
        MyInteger myInteger36 = myInteger17.add(myInteger28);
        int int37 = myInteger36.getIntValue();
        boolean boolean38 = myInteger13.equals((java.lang.Object) myInteger36);
        MyInteger myInteger39 = myInteger10.multiply(myInteger13);
        MyInteger myInteger41 = new MyInteger((int) (byte) 10);
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger47 = new MyInteger((int) (short) 0);
        boolean boolean49 = myInteger47.equals((java.lang.Object) 1.0f);
        MyInteger myInteger50 = myInteger43.multiply(myInteger47);
        MyInteger myInteger52 = new MyInteger((int) (short) 0);
        MyInteger myInteger53 = myInteger43.multiply(myInteger52);
        MyInteger myInteger55 = new MyInteger((int) (short) 0);
        boolean boolean57 = myInteger55.equals((java.lang.Object) 1.0f);
        MyInteger myInteger59 = new MyInteger((int) (short) 0);
        boolean boolean61 = myInteger59.equals((java.lang.Object) 1.0f);
        MyInteger myInteger63 = new MyInteger((int) (short) 0);
        boolean boolean65 = myInteger63.equals((java.lang.Object) 1.0f);
        MyInteger myInteger66 = myInteger59.multiply(myInteger63);
        int int67 = myInteger59.getIntValue();
        int int68 = myInteger59.getIntValue();
        MyInteger myInteger70 = new MyInteger((int) (short) 0);
        boolean boolean72 = myInteger70.equals((java.lang.Object) 1.0f);
        MyInteger myInteger74 = new MyInteger((int) (short) 0);
        boolean boolean76 = myInteger74.equals((java.lang.Object) 1.0f);
        MyInteger myInteger77 = myInteger70.multiply(myInteger74);
        MyInteger myInteger78 = myInteger59.add(myInteger70);
        int int79 = myInteger78.getIntValue();
        boolean boolean80 = myInteger55.equals((java.lang.Object) myInteger78);
        MyInteger myInteger81 = myInteger52.multiply(myInteger55);
        MyInteger myInteger82 = myInteger41.multiply(myInteger81);
        MyInteger myInteger83 = myInteger13.multiply(myInteger41);
        int int84 = myInteger13.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger41", myInteger1.equals(myInteger41) ? myInteger1.hashCode() == myInteger41.hashCode() : true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        int int9 = myInteger1.getIntValue();
        java.lang.String str10 = myInteger1.toString();
        boolean boolean12 = myInteger1.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger14 = new MyInteger((int) 'a');
        int int15 = myInteger14.getIntValue();
        int int16 = myInteger14.getIntValue();
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = myInteger18.multiply(myInteger22);
        int int26 = myInteger18.getIntValue();
        java.lang.String str27 = myInteger18.toString();
        boolean boolean29 = myInteger18.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger30 = myInteger14.multiply(myInteger18);
        boolean boolean31 = myInteger1.equals((java.lang.Object) myInteger14);
        MyInteger myInteger33 = new MyInteger((int) (short) 0);
        boolean boolean35 = myInteger33.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = new MyInteger((int) (short) 0);
        boolean boolean39 = myInteger37.equals((java.lang.Object) 1.0f);
        MyInteger myInteger41 = new MyInteger((int) (short) 0);
        boolean boolean43 = myInteger41.equals((java.lang.Object) 1.0f);
        MyInteger myInteger44 = myInteger37.multiply(myInteger41);
        int int45 = myInteger37.getIntValue();
        int int46 = myInteger37.getIntValue();
        MyInteger myInteger48 = new MyInteger((int) (short) 0);
        boolean boolean50 = myInteger48.equals((java.lang.Object) 1.0f);
        MyInteger myInteger52 = new MyInteger((int) (short) 0);
        boolean boolean54 = myInteger52.equals((java.lang.Object) 1.0f);
        MyInteger myInteger55 = myInteger48.multiply(myInteger52);
        MyInteger myInteger56 = myInteger37.add(myInteger48);
        MyInteger myInteger57 = myInteger33.multiply(myInteger56);
        java.lang.String str58 = myInteger33.toString();
        MyInteger myInteger60 = new MyInteger((int) (short) 0);
        boolean boolean62 = myInteger60.equals((java.lang.Object) 1.0f);
        MyInteger myInteger64 = new MyInteger((int) (short) 0);
        boolean boolean66 = myInteger64.equals((java.lang.Object) 1.0f);
        MyInteger myInteger68 = new MyInteger((int) (short) 0);
        boolean boolean70 = myInteger68.equals((java.lang.Object) 1.0f);
        MyInteger myInteger71 = myInteger64.multiply(myInteger68);
        int int72 = myInteger64.getIntValue();
        int int73 = myInteger64.getIntValue();
        MyInteger myInteger75 = new MyInteger((int) (short) 0);
        boolean boolean77 = myInteger75.equals((java.lang.Object) 1.0f);
        MyInteger myInteger79 = new MyInteger((int) (short) 0);
        boolean boolean81 = myInteger79.equals((java.lang.Object) 1.0f);
        MyInteger myInteger82 = myInteger75.multiply(myInteger79);
        MyInteger myInteger83 = myInteger64.add(myInteger75);
        MyInteger myInteger84 = myInteger60.multiply(myInteger83);
        MyInteger myInteger85 = myInteger33.multiply(myInteger84);
        boolean boolean87 = myInteger84.equals((java.lang.Object) (byte) -1);
        boolean boolean89 = myInteger84.equals((java.lang.Object) 1);
        MyInteger myInteger90 = myInteger14.add(myInteger84);
        java.lang.Class<?> wildcardClass91 = myInteger90.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger14", myInteger1.equals(myInteger14) ? myInteger1.hashCode() == myInteger14.hashCode() : true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.multiply(myInteger5);
        MyInteger myInteger15 = new MyInteger((int) ' ');
        MyInteger myInteger16 = myInteger13.multiply(myInteger15);
        int int17 = myInteger15.getIntValue();
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        MyInteger myInteger28 = new MyInteger((int) (short) 0);
        MyInteger myInteger29 = myInteger19.multiply(myInteger28);
        java.lang.String str30 = myInteger19.toString();
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        boolean boolean34 = myInteger32.equals((java.lang.Object) 1.0f);
        MyInteger myInteger36 = new MyInteger((int) (short) 0);
        boolean boolean38 = myInteger36.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = myInteger32.multiply(myInteger36);
        int int40 = myInteger32.getIntValue();
        java.lang.String str41 = myInteger32.toString();
        boolean boolean43 = myInteger32.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger44 = myInteger19.multiply(myInteger32);
        java.lang.String str45 = myInteger44.toString();
        MyInteger myInteger46 = myInteger15.multiply(myInteger44);
        MyInteger myInteger48 = new MyInteger((int) (short) 0);
        boolean boolean50 = myInteger48.equals((java.lang.Object) 1.0f);
        MyInteger myInteger52 = new MyInteger((int) (short) 0);
        boolean boolean54 = myInteger52.equals((java.lang.Object) 1.0f);
        MyInteger myInteger56 = new MyInteger((int) (short) 0);
        boolean boolean58 = myInteger56.equals((java.lang.Object) 1.0f);
        MyInteger myInteger59 = myInteger52.multiply(myInteger56);
        MyInteger myInteger60 = myInteger48.add(myInteger56);
        int int61 = myInteger60.getIntValue();
        MyInteger myInteger62 = myInteger46.add(myInteger60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger15", myInteger1.equals(myInteger15) ? myInteger1.hashCode() == myInteger15.hashCode() : true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.add(myInteger9);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        int int27 = myInteger19.getIntValue();
        int int28 = myInteger19.getIntValue();
        MyInteger myInteger30 = new MyInteger((int) (short) 0);
        boolean boolean32 = myInteger30.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = myInteger30.multiply(myInteger34);
        MyInteger myInteger38 = myInteger19.add(myInteger30);
        int int39 = myInteger38.getIntValue();
        boolean boolean40 = myInteger15.equals((java.lang.Object) myInteger38);
        int int41 = myInteger38.getIntValue();
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger47 = new MyInteger((int) (short) 0);
        boolean boolean49 = myInteger47.equals((java.lang.Object) 1.0f);
        MyInteger myInteger50 = myInteger43.multiply(myInteger47);
        int int51 = myInteger47.getIntValue();
        MyInteger myInteger52 = myInteger38.multiply(myInteger47);
        boolean boolean54 = myInteger47.equals((java.lang.Object) "97");
        MyInteger myInteger55 = myInteger9.multiply(myInteger47);
        MyInteger myInteger57 = new MyInteger((int) (byte) 100);
        java.lang.String str58 = myInteger57.toString();
        boolean boolean59 = myInteger47.equals((java.lang.Object) str58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger57", myInteger1.equals(myInteger57) ? myInteger1.hashCode() == myInteger57.hashCode() : true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger14 = myInteger7.multiply(myInteger11);
        int int15 = myInteger7.getIntValue();
        int int16 = myInteger7.getIntValue();
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = myInteger18.multiply(myInteger22);
        MyInteger myInteger26 = myInteger7.add(myInteger18);
        MyInteger myInteger27 = myInteger3.multiply(myInteger26);
        MyInteger myInteger28 = myInteger1.add(myInteger27);
        MyInteger myInteger30 = new MyInteger((int) (short) 10);
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        boolean boolean34 = myInteger32.equals((java.lang.Object) 1.0f);
        MyInteger myInteger36 = new MyInteger((int) (short) 0);
        boolean boolean38 = myInteger36.equals((java.lang.Object) 1.0f);
        MyInteger myInteger40 = new MyInteger((int) (short) 0);
        boolean boolean42 = myInteger40.equals((java.lang.Object) 1.0f);
        MyInteger myInteger43 = myInteger36.multiply(myInteger40);
        MyInteger myInteger44 = myInteger32.multiply(myInteger36);
        boolean boolean45 = myInteger30.equals((java.lang.Object) myInteger32);
        int int46 = myInteger30.getIntValue();
        MyInteger myInteger47 = myInteger27.multiply(myInteger30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger3", myInteger1.equals(myInteger3) ? myInteger1.hashCode() == myInteger3.hashCode() : true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        boolean boolean10 = myInteger5.equals((java.lang.Object) (byte) -1);
        int int11 = myInteger5.getIntValue();
        MyInteger myInteger13 = new MyInteger((int) (byte) 100);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger18 = myInteger13.multiply(myInteger15);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger24 = new MyInteger((int) (short) 0);
        boolean boolean26 = myInteger24.equals((java.lang.Object) 1.0f);
        MyInteger myInteger28 = new MyInteger((int) (short) 0);
        boolean boolean30 = myInteger28.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = myInteger24.multiply(myInteger28);
        MyInteger myInteger32 = myInteger20.multiply(myInteger24);
        MyInteger myInteger34 = new MyInteger((int) (short) -1);
        boolean boolean35 = myInteger32.equals((java.lang.Object) myInteger34);
        MyInteger myInteger36 = myInteger13.add(myInteger34);
        MyInteger myInteger37 = myInteger5.add(myInteger13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger34", myInteger1.equals(myInteger34) ? myInteger1.hashCode() == myInteger34.hashCode() : true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        MyInteger myInteger1 = new MyInteger((int) ' ');
        MyInteger myInteger3 = new MyInteger((int) 'a');
        int int4 = myInteger3.getIntValue();
        MyInteger myInteger5 = myInteger1.multiply(myInteger3);
        java.lang.String str6 = myInteger1.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger5", myInteger3.equals(myInteger5) ? myInteger3.hashCode() == myInteger5.hashCode() : true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        int int2 = myInteger1.getIntValue();
        MyInteger myInteger4 = new MyInteger((int) (short) -1);
        java.lang.String str5 = myInteger4.toString();
        MyInteger myInteger6 = myInteger1.add(myInteger4);
        MyInteger myInteger8 = new MyInteger((int) (short) -1);
        MyInteger myInteger9 = myInteger6.multiply(myInteger8);
        java.lang.Class<?> wildcardClass10 = myInteger8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger6", myInteger1.equals(myInteger6) ? myInteger1.hashCode() == myInteger6.hashCode() : true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        MyInteger myInteger1 = new MyInteger((-2));
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = myInteger3.multiply(myInteger7);
        int int11 = myInteger3.getIntValue();
        int int12 = myInteger3.getIntValue();
        MyInteger myInteger14 = new MyInteger((int) (short) 0);
        boolean boolean16 = myInteger14.equals((java.lang.Object) 1.0f);
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger21 = myInteger14.multiply(myInteger18);
        MyInteger myInteger22 = myInteger3.add(myInteger14);
        int int23 = myInteger22.getIntValue();
        MyInteger myInteger25 = new MyInteger((int) (short) 0);
        boolean boolean27 = myInteger25.equals((java.lang.Object) 1.0f);
        MyInteger myInteger29 = new MyInteger((int) (short) 0);
        boolean boolean31 = myInteger29.equals((java.lang.Object) 1.0f);
        MyInteger myInteger32 = myInteger25.multiply(myInteger29);
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        MyInteger myInteger35 = myInteger25.multiply(myInteger34);
        MyInteger myInteger37 = new MyInteger((int) (short) 0);
        boolean boolean39 = myInteger37.equals((java.lang.Object) 1.0f);
        MyInteger myInteger41 = new MyInteger((int) (short) 0);
        boolean boolean43 = myInteger41.equals((java.lang.Object) 1.0f);
        MyInteger myInteger45 = new MyInteger((int) (short) 0);
        boolean boolean47 = myInteger45.equals((java.lang.Object) 1.0f);
        MyInteger myInteger48 = myInteger41.multiply(myInteger45);
        int int49 = myInteger41.getIntValue();
        int int50 = myInteger41.getIntValue();
        MyInteger myInteger52 = new MyInteger((int) (short) 0);
        boolean boolean54 = myInteger52.equals((java.lang.Object) 1.0f);
        MyInteger myInteger56 = new MyInteger((int) (short) 0);
        boolean boolean58 = myInteger56.equals((java.lang.Object) 1.0f);
        MyInteger myInteger59 = myInteger52.multiply(myInteger56);
        MyInteger myInteger60 = myInteger41.add(myInteger52);
        int int61 = myInteger60.getIntValue();
        boolean boolean62 = myInteger37.equals((java.lang.Object) myInteger60);
        MyInteger myInteger63 = myInteger34.multiply(myInteger37);
        MyInteger myInteger65 = new MyInteger((int) (short) 0);
        boolean boolean67 = myInteger65.equals((java.lang.Object) 1.0f);
        MyInteger myInteger69 = new MyInteger((int) (short) 0);
        boolean boolean71 = myInteger69.equals((java.lang.Object) 1.0f);
        MyInteger myInteger72 = myInteger65.multiply(myInteger69);
        MyInteger myInteger74 = new MyInteger((int) (short) 0);
        MyInteger myInteger75 = myInteger65.multiply(myInteger74);
        java.lang.String str76 = myInteger65.toString();
        MyInteger myInteger78 = new MyInteger((int) (short) 0);
        boolean boolean80 = myInteger78.equals((java.lang.Object) 1.0f);
        MyInteger myInteger82 = new MyInteger((int) (short) 0);
        boolean boolean84 = myInteger82.equals((java.lang.Object) 1.0f);
        MyInteger myInteger85 = myInteger78.multiply(myInteger82);
        int int86 = myInteger78.getIntValue();
        java.lang.String str87 = myInteger78.toString();
        boolean boolean89 = myInteger78.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger90 = myInteger65.multiply(myInteger78);
        MyInteger myInteger91 = myInteger34.add(myInteger78);
        boolean boolean92 = myInteger22.equals((java.lang.Object) myInteger78);
        MyInteger myInteger94 = new MyInteger((int) (byte) 10);
        int int95 = myInteger94.getIntValue();
        java.lang.String str96 = myInteger94.toString();
        MyInteger myInteger97 = myInteger22.multiply(myInteger94);
        MyInteger myInteger98 = myInteger1.add(myInteger22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger94", myInteger3.equals(myInteger94) ? myInteger3.hashCode() == myInteger94.hashCode() : true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        int int2 = myInteger1.getIntValue();
        int int3 = myInteger1.getIntValue();
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger14 = new MyInteger((int) (short) 0);
        MyInteger myInteger15 = myInteger5.multiply(myInteger14);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger21 = new MyInteger((int) (short) 0);
        boolean boolean23 = myInteger21.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = new MyInteger((int) (short) 0);
        boolean boolean27 = myInteger25.equals((java.lang.Object) 1.0f);
        MyInteger myInteger28 = myInteger21.multiply(myInteger25);
        int int29 = myInteger21.getIntValue();
        int int30 = myInteger21.getIntValue();
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        boolean boolean34 = myInteger32.equals((java.lang.Object) 1.0f);
        MyInteger myInteger36 = new MyInteger((int) (short) 0);
        boolean boolean38 = myInteger36.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = myInteger32.multiply(myInteger36);
        MyInteger myInteger40 = myInteger21.add(myInteger32);
        int int41 = myInteger40.getIntValue();
        boolean boolean42 = myInteger17.equals((java.lang.Object) myInteger40);
        MyInteger myInteger43 = myInteger14.multiply(myInteger17);
        MyInteger myInteger45 = new MyInteger((int) (short) 0);
        boolean boolean47 = myInteger45.equals((java.lang.Object) 1.0f);
        MyInteger myInteger49 = new MyInteger((int) (short) 0);
        boolean boolean51 = myInteger49.equals((java.lang.Object) 1.0f);
        MyInteger myInteger52 = myInteger45.multiply(myInteger49);
        MyInteger myInteger54 = new MyInteger((int) (short) 0);
        MyInteger myInteger55 = myInteger45.multiply(myInteger54);
        java.lang.String str56 = myInteger45.toString();
        MyInteger myInteger58 = new MyInteger((int) (short) 0);
        boolean boolean60 = myInteger58.equals((java.lang.Object) 1.0f);
        MyInteger myInteger62 = new MyInteger((int) (short) 0);
        boolean boolean64 = myInteger62.equals((java.lang.Object) 1.0f);
        MyInteger myInteger65 = myInteger58.multiply(myInteger62);
        int int66 = myInteger58.getIntValue();
        java.lang.String str67 = myInteger58.toString();
        boolean boolean69 = myInteger58.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger70 = myInteger45.multiply(myInteger58);
        MyInteger myInteger71 = myInteger14.add(myInteger58);
        MyInteger myInteger72 = myInteger1.add(myInteger58);
        java.lang.Class<?> wildcardClass73 = myInteger1.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger5 and myInteger72", myInteger5.equals(myInteger72) ? myInteger5.hashCode() == myInteger72.hashCode() : true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        boolean boolean10 = myInteger5.equals((java.lang.Object) (byte) -1);
        int int11 = myInteger5.getIntValue();
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = myInteger13.multiply(myInteger17);
        int int21 = myInteger13.getIntValue();
        java.lang.String str22 = myInteger13.toString();
        java.lang.String str23 = myInteger13.toString();
        MyInteger myInteger24 = myInteger5.add(myInteger13);
        MyInteger myInteger26 = new MyInteger((int) (short) 0);
        boolean boolean28 = myInteger26.equals((java.lang.Object) 1.0f);
        int int29 = myInteger26.getIntValue();
        java.lang.String str30 = myInteger26.toString();
        MyInteger myInteger31 = myInteger5.add(myInteger26);
        MyInteger myInteger33 = new MyInteger((int) (short) 0);
        boolean boolean35 = myInteger33.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = new MyInteger((int) (short) 0);
        boolean boolean39 = myInteger37.equals((java.lang.Object) 1.0f);
        MyInteger myInteger40 = myInteger33.multiply(myInteger37);
        MyInteger myInteger42 = new MyInteger((int) (short) 0);
        MyInteger myInteger43 = myInteger33.multiply(myInteger42);
        int int44 = myInteger33.getIntValue();
        MyInteger myInteger45 = myInteger5.multiply(myInteger33);
        MyInteger myInteger47 = new MyInteger((int) (short) 0);
        boolean boolean49 = myInteger47.equals((java.lang.Object) 1.0f);
        MyInteger myInteger51 = new MyInteger((int) (short) 0);
        boolean boolean53 = myInteger51.equals((java.lang.Object) 1.0f);
        MyInteger myInteger54 = myInteger47.multiply(myInteger51);
        int int55 = myInteger47.getIntValue();
        int int56 = myInteger47.getIntValue();
        MyInteger myInteger58 = new MyInteger((int) (short) 0);
        boolean boolean60 = myInteger58.equals((java.lang.Object) 1.0f);
        MyInteger myInteger62 = new MyInteger((int) (short) 0);
        boolean boolean64 = myInteger62.equals((java.lang.Object) 1.0f);
        MyInteger myInteger65 = myInteger58.multiply(myInteger62);
        MyInteger myInteger66 = myInteger47.add(myInteger58);
        MyInteger myInteger67 = myInteger33.multiply(myInteger47);
        MyInteger myInteger69 = new MyInteger((int) (short) 0);
        boolean boolean71 = myInteger69.equals((java.lang.Object) 1.0f);
        java.lang.String str72 = myInteger69.toString();
        MyInteger myInteger73 = myInteger33.add(myInteger69);
        MyInteger myInteger75 = new MyInteger((int) (short) 0);
        MyInteger myInteger77 = new MyInteger((int) (short) -1);
        java.lang.String str78 = myInteger77.toString();
        MyInteger myInteger79 = myInteger75.add(myInteger77);
        boolean boolean80 = myInteger73.equals((java.lang.Object) myInteger75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger77", myInteger1.equals(myInteger77) ? myInteger1.hashCode() == myInteger77.hashCode() : true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        int int9 = myInteger1.getIntValue();
        MyInteger myInteger11 = new MyInteger((int) (byte) 1);
        MyInteger myInteger12 = myInteger1.multiply(myInteger11);
        java.lang.String str13 = myInteger1.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger5 and myInteger11", myInteger5.equals(myInteger11) ? myInteger5.hashCode() == myInteger11.hashCode() : true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        MyInteger myInteger1 = new MyInteger((int) (byte) 100);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger6 = myInteger1.multiply(myInteger3);
        java.lang.String str7 = myInteger6.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger3", myInteger1.equals(myInteger3) ? myInteger1.hashCode() == myInteger3.hashCode() : true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        MyInteger myInteger1 = new MyInteger((-1));
        int int2 = myInteger1.getIntValue();
        MyInteger myInteger4 = new MyInteger((int) (byte) 1);
        MyInteger myInteger6 = new MyInteger((int) 'a');
        MyInteger myInteger7 = myInteger4.multiply(myInteger6);
        MyInteger myInteger8 = myInteger1.add(myInteger7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger4 and myInteger6", myInteger4.equals(myInteger6) ? myInteger4.hashCode() == myInteger6.hashCode() : true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        int int9 = myInteger1.getIntValue();
        java.lang.String str10 = myInteger1.toString();
        boolean boolean12 = myInteger1.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger14 = new MyInteger((int) 'a');
        int int15 = myInteger14.getIntValue();
        int int16 = myInteger14.getIntValue();
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = myInteger18.multiply(myInteger22);
        int int26 = myInteger18.getIntValue();
        java.lang.String str27 = myInteger18.toString();
        boolean boolean29 = myInteger18.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger30 = myInteger14.multiply(myInteger18);
        boolean boolean31 = myInteger1.equals((java.lang.Object) myInteger14);
        java.lang.String str32 = myInteger14.toString();
        MyInteger myInteger34 = new MyInteger(1);
        java.lang.String str35 = myInteger34.toString();
        MyInteger myInteger37 = new MyInteger((int) (short) 0);
        boolean boolean39 = myInteger37.equals((java.lang.Object) 1.0f);
        MyInteger myInteger41 = new MyInteger((int) (short) 0);
        boolean boolean43 = myInteger41.equals((java.lang.Object) 1.0f);
        MyInteger myInteger45 = new MyInteger((int) (short) 0);
        boolean boolean47 = myInteger45.equals((java.lang.Object) 1.0f);
        MyInteger myInteger48 = myInteger41.multiply(myInteger45);
        int int49 = myInteger41.getIntValue();
        int int50 = myInteger41.getIntValue();
        MyInteger myInteger52 = new MyInteger((int) (short) 0);
        boolean boolean54 = myInteger52.equals((java.lang.Object) 1.0f);
        MyInteger myInteger56 = new MyInteger((int) (short) 0);
        boolean boolean58 = myInteger56.equals((java.lang.Object) 1.0f);
        MyInteger myInteger59 = myInteger52.multiply(myInteger56);
        MyInteger myInteger60 = myInteger41.add(myInteger52);
        MyInteger myInteger61 = myInteger37.multiply(myInteger60);
        java.lang.String str62 = myInteger37.toString();
        MyInteger myInteger64 = new MyInteger((int) (short) 0);
        boolean boolean66 = myInteger64.equals((java.lang.Object) 1.0f);
        MyInteger myInteger68 = new MyInteger((int) (short) 0);
        boolean boolean70 = myInteger68.equals((java.lang.Object) 1.0f);
        MyInteger myInteger72 = new MyInteger((int) (short) 0);
        boolean boolean74 = myInteger72.equals((java.lang.Object) 1.0f);
        MyInteger myInteger75 = myInteger68.multiply(myInteger72);
        int int76 = myInteger68.getIntValue();
        int int77 = myInteger68.getIntValue();
        MyInteger myInteger79 = new MyInteger((int) (short) 0);
        boolean boolean81 = myInteger79.equals((java.lang.Object) 1.0f);
        MyInteger myInteger83 = new MyInteger((int) (short) 0);
        boolean boolean85 = myInteger83.equals((java.lang.Object) 1.0f);
        MyInteger myInteger86 = myInteger79.multiply(myInteger83);
        MyInteger myInteger87 = myInteger68.add(myInteger79);
        MyInteger myInteger88 = myInteger64.multiply(myInteger87);
        MyInteger myInteger89 = myInteger37.multiply(myInteger88);
        MyInteger myInteger90 = myInteger34.multiply(myInteger89);
        boolean boolean92 = myInteger34.equals((java.lang.Object) "-1");
        java.lang.String str93 = myInteger34.toString();
        MyInteger myInteger94 = myInteger14.multiply(myInteger34);
        int int95 = myInteger14.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger34", myInteger1.equals(myInteger34) ? myInteger1.hashCode() == myInteger34.hashCode() : true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        java.lang.String str3 = myInteger1.toString();
        int int4 = myInteger1.getIntValue();
        MyInteger myInteger6 = new MyInteger(1);
        java.lang.String str7 = myInteger6.toString();
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = myInteger13.multiply(myInteger17);
        int int21 = myInteger13.getIntValue();
        int int22 = myInteger13.getIntValue();
        MyInteger myInteger24 = new MyInteger((int) (short) 0);
        boolean boolean26 = myInteger24.equals((java.lang.Object) 1.0f);
        MyInteger myInteger28 = new MyInteger((int) (short) 0);
        boolean boolean30 = myInteger28.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = myInteger24.multiply(myInteger28);
        MyInteger myInteger32 = myInteger13.add(myInteger24);
        MyInteger myInteger33 = myInteger9.multiply(myInteger32);
        java.lang.String str34 = myInteger9.toString();
        MyInteger myInteger36 = new MyInteger((int) (short) 0);
        boolean boolean38 = myInteger36.equals((java.lang.Object) 1.0f);
        MyInteger myInteger40 = new MyInteger((int) (short) 0);
        boolean boolean42 = myInteger40.equals((java.lang.Object) 1.0f);
        MyInteger myInteger44 = new MyInteger((int) (short) 0);
        boolean boolean46 = myInteger44.equals((java.lang.Object) 1.0f);
        MyInteger myInteger47 = myInteger40.multiply(myInteger44);
        int int48 = myInteger40.getIntValue();
        int int49 = myInteger40.getIntValue();
        MyInteger myInteger51 = new MyInteger((int) (short) 0);
        boolean boolean53 = myInteger51.equals((java.lang.Object) 1.0f);
        MyInteger myInteger55 = new MyInteger((int) (short) 0);
        boolean boolean57 = myInteger55.equals((java.lang.Object) 1.0f);
        MyInteger myInteger58 = myInteger51.multiply(myInteger55);
        MyInteger myInteger59 = myInteger40.add(myInteger51);
        MyInteger myInteger60 = myInteger36.multiply(myInteger59);
        MyInteger myInteger61 = myInteger9.multiply(myInteger60);
        MyInteger myInteger62 = myInteger6.multiply(myInteger61);
        MyInteger myInteger63 = myInteger1.add(myInteger6);
        java.lang.Class<?> wildcardClass64 = myInteger6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger9", myInteger1.equals(myInteger9) ? myInteger1.hashCode() == myInteger9.hashCode() : true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        MyInteger myInteger1 = new MyInteger((int) (short) 100);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        boolean boolean6 = myInteger1.equals((java.lang.Object) 1.0f);
        int int7 = myInteger1.getIntValue();
        MyInteger myInteger9 = new MyInteger(1);
        java.lang.String str10 = myInteger9.toString();
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        int int24 = myInteger16.getIntValue();
        int int25 = myInteger16.getIntValue();
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = myInteger27.multiply(myInteger31);
        MyInteger myInteger35 = myInteger16.add(myInteger27);
        MyInteger myInteger36 = myInteger12.multiply(myInteger35);
        java.lang.String str37 = myInteger12.toString();
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger47 = new MyInteger((int) (short) 0);
        boolean boolean49 = myInteger47.equals((java.lang.Object) 1.0f);
        MyInteger myInteger50 = myInteger43.multiply(myInteger47);
        int int51 = myInteger43.getIntValue();
        int int52 = myInteger43.getIntValue();
        MyInteger myInteger54 = new MyInteger((int) (short) 0);
        boolean boolean56 = myInteger54.equals((java.lang.Object) 1.0f);
        MyInteger myInteger58 = new MyInteger((int) (short) 0);
        boolean boolean60 = myInteger58.equals((java.lang.Object) 1.0f);
        MyInteger myInteger61 = myInteger54.multiply(myInteger58);
        MyInteger myInteger62 = myInteger43.add(myInteger54);
        MyInteger myInteger63 = myInteger39.multiply(myInteger62);
        MyInteger myInteger64 = myInteger12.multiply(myInteger63);
        MyInteger myInteger65 = myInteger9.multiply(myInteger64);
        MyInteger myInteger67 = new MyInteger((int) (short) 0);
        boolean boolean69 = myInteger67.equals((java.lang.Object) 1.0f);
        MyInteger myInteger71 = new MyInteger((int) (short) 0);
        boolean boolean73 = myInteger71.equals((java.lang.Object) 1.0f);
        MyInteger myInteger74 = myInteger67.multiply(myInteger71);
        boolean boolean76 = myInteger71.equals((java.lang.Object) (byte) -1);
        int int77 = myInteger71.getIntValue();
        MyInteger myInteger79 = new MyInteger((int) (short) 0);
        boolean boolean81 = myInteger79.equals((java.lang.Object) 1.0f);
        MyInteger myInteger83 = new MyInteger((int) (short) 0);
        boolean boolean85 = myInteger83.equals((java.lang.Object) 1.0f);
        MyInteger myInteger86 = myInteger79.multiply(myInteger83);
        int int87 = myInteger79.getIntValue();
        java.lang.String str88 = myInteger79.toString();
        java.lang.String str89 = myInteger79.toString();
        MyInteger myInteger90 = myInteger71.add(myInteger79);
        java.lang.String str91 = myInteger71.toString();
        MyInteger myInteger92 = myInteger9.add(myInteger71);
        MyInteger myInteger93 = myInteger1.multiply(myInteger71);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger9", myInteger3.equals(myInteger9) ? myInteger3.hashCode() == myInteger9.hashCode() : true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        MyInteger myInteger1 = new MyInteger(10);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = myInteger3.multiply(myInteger7);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        MyInteger myInteger13 = myInteger3.multiply(myInteger12);
        java.lang.String str14 = myInteger3.toString();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        int int24 = myInteger16.getIntValue();
        java.lang.String str25 = myInteger16.toString();
        boolean boolean27 = myInteger16.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger28 = myInteger3.multiply(myInteger16);
        MyInteger myInteger29 = myInteger1.add(myInteger3);
        java.lang.String str30 = myInteger3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger7", myInteger1.equals(myInteger7) ? myInteger1.hashCode() == myInteger7.hashCode() : true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        MyInteger myInteger4 = new MyInteger((int) (short) 0);
        boolean boolean6 = myInteger4.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = myInteger4.multiply(myInteger8);
        int int12 = myInteger8.getIntValue();
        MyInteger myInteger13 = myInteger1.multiply(myInteger8);
        java.lang.Class<?> wildcardClass14 = myInteger8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger4", myInteger1.equals(myInteger4) ? myInteger1.hashCode() == myInteger4.hashCode() : true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        boolean boolean10 = myInteger5.equals((java.lang.Object) (byte) -1);
        int int11 = myInteger5.getIntValue();
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = myInteger13.multiply(myInteger17);
        int int21 = myInteger13.getIntValue();
        java.lang.String str22 = myInteger13.toString();
        java.lang.String str23 = myInteger13.toString();
        MyInteger myInteger24 = myInteger5.add(myInteger13);
        MyInteger myInteger26 = new MyInteger((int) (short) 0);
        boolean boolean28 = myInteger26.equals((java.lang.Object) 1.0f);
        int int29 = myInteger26.getIntValue();
        java.lang.String str30 = myInteger26.toString();
        MyInteger myInteger31 = myInteger5.add(myInteger26);
        MyInteger myInteger33 = new MyInteger((int) (short) 0);
        boolean boolean35 = myInteger33.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = new MyInteger((int) (short) 0);
        boolean boolean39 = myInteger37.equals((java.lang.Object) 1.0f);
        MyInteger myInteger40 = myInteger33.multiply(myInteger37);
        MyInteger myInteger42 = new MyInteger((int) (short) 0);
        MyInteger myInteger43 = myInteger33.multiply(myInteger42);
        int int44 = myInteger33.getIntValue();
        MyInteger myInteger45 = myInteger5.multiply(myInteger33);
        MyInteger myInteger47 = new MyInteger((int) (short) 0);
        boolean boolean49 = myInteger47.equals((java.lang.Object) 1.0f);
        MyInteger myInteger51 = new MyInteger((int) (short) 0);
        boolean boolean53 = myInteger51.equals((java.lang.Object) 1.0f);
        MyInteger myInteger54 = myInteger47.multiply(myInteger51);
        MyInteger myInteger56 = new MyInteger((int) (short) 0);
        MyInteger myInteger57 = myInteger47.multiply(myInteger56);
        java.lang.String str58 = myInteger47.toString();
        MyInteger myInteger60 = new MyInteger((int) (short) 0);
        boolean boolean62 = myInteger60.equals((java.lang.Object) 1.0f);
        MyInteger myInteger64 = new MyInteger((int) (short) 0);
        boolean boolean66 = myInteger64.equals((java.lang.Object) 1.0f);
        MyInteger myInteger67 = myInteger60.multiply(myInteger64);
        int int68 = myInteger60.getIntValue();
        java.lang.String str69 = myInteger60.toString();
        boolean boolean71 = myInteger60.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger72 = myInteger47.multiply(myInteger60);
        java.lang.String str73 = myInteger72.toString();
        MyInteger myInteger74 = myInteger45.add(myInteger72);
        int int75 = myInteger45.getIntValue();
        MyInteger myInteger77 = new MyInteger((int) (short) 0);
        boolean boolean79 = myInteger77.equals((java.lang.Object) 1.0f);
        MyInteger myInteger81 = new MyInteger((int) (short) 0);
        boolean boolean83 = myInteger81.equals((java.lang.Object) 1.0f);
        MyInteger myInteger84 = myInteger77.multiply(myInteger81);
        MyInteger myInteger86 = new MyInteger((int) (short) 0);
        MyInteger myInteger87 = myInteger77.multiply(myInteger86);
        MyInteger myInteger88 = myInteger45.add(myInteger77);
        MyInteger myInteger90 = new MyInteger((int) (short) -1);
        java.lang.String str91 = myInteger90.toString();
        boolean boolean93 = myInteger90.equals((java.lang.Object) (-1));
        int int94 = myInteger90.getIntValue();
        java.lang.String str95 = myInteger90.toString();
        MyInteger myInteger96 = myInteger88.multiply(myInteger90);
        java.lang.Class<?> wildcardClass97 = myInteger88.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger90", myInteger1.equals(myInteger90) ? myInteger1.hashCode() == myInteger90.hashCode() : true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        MyInteger myInteger1 = new MyInteger((int) (byte) 100);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger6 = myInteger1.multiply(myInteger3);
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = myInteger12.multiply(myInteger16);
        MyInteger myInteger20 = myInteger8.multiply(myInteger12);
        MyInteger myInteger22 = new MyInteger((int) (short) -1);
        boolean boolean23 = myInteger20.equals((java.lang.Object) myInteger22);
        MyInteger myInteger24 = myInteger1.add(myInteger22);
        java.lang.Class<?> wildcardClass25 = myInteger22.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger3", myInteger1.equals(myInteger3) ? myInteger1.hashCode() == myInteger3.hashCode() : true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        boolean boolean10 = myInteger5.equals((java.lang.Object) (byte) -1);
        int int11 = myInteger5.getIntValue();
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = myInteger13.multiply(myInteger17);
        int int21 = myInteger13.getIntValue();
        java.lang.String str22 = myInteger13.toString();
        java.lang.String str23 = myInteger13.toString();
        MyInteger myInteger24 = myInteger5.add(myInteger13);
        MyInteger myInteger26 = new MyInteger((int) (short) 0);
        boolean boolean28 = myInteger26.equals((java.lang.Object) 1.0f);
        int int29 = myInteger26.getIntValue();
        java.lang.String str30 = myInteger26.toString();
        MyInteger myInteger31 = myInteger5.add(myInteger26);
        MyInteger myInteger33 = new MyInteger((int) (short) 0);
        boolean boolean35 = myInteger33.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = new MyInteger((int) (short) 0);
        boolean boolean39 = myInteger37.equals((java.lang.Object) 1.0f);
        MyInteger myInteger40 = myInteger33.multiply(myInteger37);
        MyInteger myInteger42 = new MyInteger((int) (short) 0);
        MyInteger myInteger43 = myInteger33.multiply(myInteger42);
        int int44 = myInteger33.getIntValue();
        MyInteger myInteger45 = myInteger5.multiply(myInteger33);
        MyInteger myInteger47 = new MyInteger((int) (short) 0);
        boolean boolean49 = myInteger47.equals((java.lang.Object) 1.0f);
        MyInteger myInteger51 = new MyInteger((int) (short) 0);
        boolean boolean53 = myInteger51.equals((java.lang.Object) 1.0f);
        MyInteger myInteger54 = myInteger47.multiply(myInteger51);
        MyInteger myInteger56 = new MyInteger((int) (short) 0);
        MyInteger myInteger57 = myInteger47.multiply(myInteger56);
        java.lang.String str58 = myInteger47.toString();
        MyInteger myInteger60 = new MyInteger((int) (short) 0);
        boolean boolean62 = myInteger60.equals((java.lang.Object) 1.0f);
        MyInteger myInteger64 = new MyInteger((int) (short) 0);
        boolean boolean66 = myInteger64.equals((java.lang.Object) 1.0f);
        MyInteger myInteger67 = myInteger60.multiply(myInteger64);
        int int68 = myInteger60.getIntValue();
        java.lang.String str69 = myInteger60.toString();
        boolean boolean71 = myInteger60.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger72 = myInteger47.multiply(myInteger60);
        java.lang.String str73 = myInteger72.toString();
        MyInteger myInteger74 = myInteger45.add(myInteger72);
        int int75 = myInteger45.getIntValue();
        MyInteger myInteger77 = new MyInteger((int) (short) 0);
        boolean boolean79 = myInteger77.equals((java.lang.Object) 1.0f);
        MyInteger myInteger81 = new MyInteger((int) (short) 0);
        boolean boolean83 = myInteger81.equals((java.lang.Object) 1.0f);
        MyInteger myInteger84 = myInteger77.multiply(myInteger81);
        MyInteger myInteger86 = new MyInteger((int) (short) 0);
        MyInteger myInteger87 = myInteger77.multiply(myInteger86);
        MyInteger myInteger88 = myInteger45.add(myInteger77);
        MyInteger myInteger90 = new MyInteger((int) (short) -1);
        java.lang.String str91 = myInteger90.toString();
        boolean boolean93 = myInteger90.equals((java.lang.Object) (-1));
        int int94 = myInteger90.getIntValue();
        java.lang.String str95 = myInteger90.toString();
        MyInteger myInteger96 = myInteger88.multiply(myInteger90);
        java.lang.Class<?> wildcardClass97 = myInteger96.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger90", myInteger1.equals(myInteger90) ? myInteger1.hashCode() == myInteger90.hashCode() : true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger10 = new MyInteger((int) '#');
        int int11 = myInteger10.getIntValue();
        java.lang.String str12 = myInteger10.toString();
        int int13 = myInteger10.getIntValue();
        boolean boolean14 = myInteger5.equals((java.lang.Object) myInteger10);
        int int15 = myInteger5.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger10", myInteger1.equals(myInteger10) ? myInteger1.hashCode() == myInteger10.hashCode() : true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        MyInteger myInteger1 = new MyInteger((int) (byte) -1);
        int int2 = myInteger1.getIntValue();
        MyInteger myInteger4 = new MyInteger((int) (short) -1);
        java.lang.String str5 = myInteger4.toString();
        boolean boolean7 = myInteger4.equals((java.lang.Object) (-1));
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger16 = myInteger9.multiply(myInteger13);
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        MyInteger myInteger19 = myInteger9.multiply(myInteger18);
        java.lang.String str20 = myInteger9.toString();
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = new MyInteger((int) (short) 0);
        boolean boolean28 = myInteger26.equals((java.lang.Object) 1.0f);
        MyInteger myInteger29 = myInteger22.multiply(myInteger26);
        int int30 = myInteger22.getIntValue();
        java.lang.String str31 = myInteger22.toString();
        boolean boolean33 = myInteger22.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger34 = myInteger9.multiply(myInteger22);
        boolean boolean35 = myInteger4.equals((java.lang.Object) myInteger22);
        MyInteger myInteger36 = myInteger1.add(myInteger4);
        java.lang.Class<?> wildcardClass37 = myInteger4.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger9", myInteger1.equals(myInteger9) ? myInteger1.hashCode() == myInteger9.hashCode() : true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        int int14 = myInteger5.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        MyInteger myInteger24 = myInteger5.add(myInteger16);
        MyInteger myInteger25 = myInteger1.multiply(myInteger24);
        java.lang.String str26 = myInteger25.toString();
        MyInteger myInteger28 = new MyInteger((int) (short) 0);
        boolean boolean30 = myInteger28.equals((java.lang.Object) 1.0f);
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        boolean boolean34 = myInteger32.equals((java.lang.Object) 1.0f);
        MyInteger myInteger35 = myInteger28.multiply(myInteger32);
        MyInteger myInteger37 = new MyInteger((int) (short) 0);
        MyInteger myInteger38 = myInteger28.multiply(myInteger37);
        boolean boolean40 = myInteger28.equals((java.lang.Object) '4');
        MyInteger myInteger41 = myInteger25.multiply(myInteger28);
        MyInteger myInteger43 = new MyInteger((int) (byte) 1);
        int int44 = myInteger43.getIntValue();
        MyInteger myInteger45 = myInteger41.add(myInteger43);
        java.lang.Class<?> wildcardClass46 = myInteger45.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger43", myInteger1.equals(myInteger43) ? myInteger1.hashCode() == myInteger43.hashCode() : true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.multiply(myInteger5);
        MyInteger myInteger15 = new MyInteger((int) ' ');
        MyInteger myInteger16 = myInteger13.multiply(myInteger15);
        MyInteger myInteger18 = new MyInteger((int) (short) -1);
        java.lang.String str19 = myInteger18.toString();
        java.lang.String str20 = myInteger18.toString();
        int int21 = myInteger18.getIntValue();
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = myInteger27.multiply(myInteger31);
        int int35 = myInteger27.getIntValue();
        int int36 = myInteger27.getIntValue();
        MyInteger myInteger38 = new MyInteger((int) (short) 0);
        boolean boolean40 = myInteger38.equals((java.lang.Object) 1.0f);
        MyInteger myInteger42 = new MyInteger((int) (short) 0);
        boolean boolean44 = myInteger42.equals((java.lang.Object) 1.0f);
        MyInteger myInteger45 = myInteger38.multiply(myInteger42);
        MyInteger myInteger46 = myInteger27.add(myInteger38);
        int int47 = myInteger46.getIntValue();
        boolean boolean48 = myInteger23.equals((java.lang.Object) myInteger46);
        MyInteger myInteger49 = myInteger18.add(myInteger23);
        MyInteger myInteger50 = myInteger16.add(myInteger18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger15", myInteger1.equals(myInteger15) ? myInteger1.hashCode() == myInteger15.hashCode() : true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        int int2 = myInteger1.getIntValue();
        MyInteger myInteger4 = new MyInteger((int) (short) 0);
        boolean boolean6 = myInteger4.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger15 = myInteger8.multiply(myInteger12);
        MyInteger myInteger16 = myInteger4.multiply(myInteger8);
        MyInteger myInteger18 = new MyInteger((int) ' ');
        MyInteger myInteger19 = myInteger16.multiply(myInteger18);
        int int20 = myInteger18.getIntValue();
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = new MyInteger((int) (short) 0);
        boolean boolean28 = myInteger26.equals((java.lang.Object) 1.0f);
        MyInteger myInteger29 = myInteger22.multiply(myInteger26);
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        MyInteger myInteger32 = myInteger22.multiply(myInteger31);
        java.lang.String str33 = myInteger22.toString();
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger42 = myInteger35.multiply(myInteger39);
        int int43 = myInteger35.getIntValue();
        java.lang.String str44 = myInteger35.toString();
        boolean boolean46 = myInteger35.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger47 = myInteger22.multiply(myInteger35);
        java.lang.String str48 = myInteger47.toString();
        MyInteger myInteger49 = myInteger18.multiply(myInteger47);
        MyInteger myInteger50 = myInteger1.add(myInteger49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger4 and myInteger18", myInteger4.equals(myInteger18) ? myInteger4.hashCode() == myInteger18.hashCode() : true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.multiply(myInteger5);
        int int14 = myInteger1.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger24 = new MyInteger((int) (short) 0);
        boolean boolean26 = myInteger24.equals((java.lang.Object) 1.0f);
        MyInteger myInteger27 = myInteger20.multiply(myInteger24);
        int int28 = myInteger20.getIntValue();
        int int29 = myInteger20.getIntValue();
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger38 = myInteger31.multiply(myInteger35);
        MyInteger myInteger39 = myInteger20.add(myInteger31);
        MyInteger myInteger40 = myInteger16.multiply(myInteger39);
        java.lang.String str41 = myInteger16.toString();
        MyInteger myInteger42 = myInteger1.multiply(myInteger16);
        MyInteger myInteger44 = new MyInteger((int) (short) 0);
        boolean boolean46 = myInteger44.equals((java.lang.Object) 1.0f);
        MyInteger myInteger48 = new MyInteger((int) (short) 0);
        boolean boolean50 = myInteger48.equals((java.lang.Object) 1.0f);
        MyInteger myInteger51 = myInteger44.multiply(myInteger48);
        int int52 = myInteger44.getIntValue();
        MyInteger myInteger54 = new MyInteger((int) (byte) 1);
        MyInteger myInteger55 = myInteger44.multiply(myInteger54);
        MyInteger myInteger57 = new MyInteger((int) 'a');
        MyInteger myInteger58 = myInteger54.multiply(myInteger57);
        MyInteger myInteger59 = myInteger42.add(myInteger58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger54", myInteger1.equals(myInteger54) ? myInteger1.hashCode() == myInteger54.hashCode() : true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.add(myInteger9);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        MyInteger myInteger27 = myInteger15.multiply(myInteger19);
        MyInteger myInteger29 = new MyInteger((int) (short) -1);
        java.lang.String str30 = myInteger29.toString();
        java.lang.String str31 = myInteger29.toString();
        MyInteger myInteger32 = myInteger19.multiply(myInteger29);
        MyInteger myInteger33 = myInteger1.multiply(myInteger29);
        MyInteger myInteger35 = new MyInteger((int) (short) -1);
        int int36 = myInteger35.getIntValue();
        boolean boolean37 = myInteger33.equals((java.lang.Object) myInteger35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger29", myInteger1.equals(myInteger29) ? myInteger1.hashCode() == myInteger29.hashCode() : true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = myInteger3.multiply(myInteger7);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        MyInteger myInteger13 = myInteger3.multiply(myInteger12);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        int int27 = myInteger19.getIntValue();
        int int28 = myInteger19.getIntValue();
        MyInteger myInteger30 = new MyInteger((int) (short) 0);
        boolean boolean32 = myInteger30.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = myInteger30.multiply(myInteger34);
        MyInteger myInteger38 = myInteger19.add(myInteger30);
        int int39 = myInteger38.getIntValue();
        boolean boolean40 = myInteger15.equals((java.lang.Object) myInteger38);
        MyInteger myInteger41 = myInteger12.multiply(myInteger15);
        MyInteger myInteger42 = myInteger1.multiply(myInteger41);
        MyInteger myInteger44 = new MyInteger((int) (short) 0);
        boolean boolean46 = myInteger44.equals((java.lang.Object) 1.0f);
        MyInteger myInteger48 = new MyInteger((int) (short) 0);
        boolean boolean50 = myInteger48.equals((java.lang.Object) 1.0f);
        MyInteger myInteger51 = myInteger44.multiply(myInteger48);
        boolean boolean53 = myInteger48.equals((java.lang.Object) (byte) -1);
        int int54 = myInteger48.getIntValue();
        MyInteger myInteger56 = new MyInteger((int) (short) 0);
        boolean boolean58 = myInteger56.equals((java.lang.Object) 1.0f);
        MyInteger myInteger60 = new MyInteger((int) (short) 0);
        boolean boolean62 = myInteger60.equals((java.lang.Object) 1.0f);
        MyInteger myInteger63 = myInteger56.multiply(myInteger60);
        int int64 = myInteger56.getIntValue();
        java.lang.String str65 = myInteger56.toString();
        java.lang.String str66 = myInteger56.toString();
        MyInteger myInteger67 = myInteger48.add(myInteger56);
        MyInteger myInteger68 = myInteger42.add(myInteger56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger3", myInteger1.equals(myInteger3) ? myInteger1.hashCode() == myInteger3.hashCode() : true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        int int14 = myInteger5.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        MyInteger myInteger24 = myInteger5.add(myInteger16);
        MyInteger myInteger25 = myInteger1.multiply(myInteger24);
        java.lang.String str26 = myInteger1.toString();
        MyInteger myInteger28 = new MyInteger((int) (short) 0);
        boolean boolean30 = myInteger28.equals((java.lang.Object) 1.0f);
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        boolean boolean34 = myInteger32.equals((java.lang.Object) 1.0f);
        MyInteger myInteger36 = new MyInteger((int) (short) 0);
        boolean boolean38 = myInteger36.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = myInteger32.multiply(myInteger36);
        int int40 = myInteger32.getIntValue();
        int int41 = myInteger32.getIntValue();
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger47 = new MyInteger((int) (short) 0);
        boolean boolean49 = myInteger47.equals((java.lang.Object) 1.0f);
        MyInteger myInteger50 = myInteger43.multiply(myInteger47);
        MyInteger myInteger51 = myInteger32.add(myInteger43);
        MyInteger myInteger52 = myInteger28.multiply(myInteger51);
        MyInteger myInteger53 = myInteger1.multiply(myInteger52);
        int int54 = myInteger53.getIntValue();
        MyInteger myInteger56 = new MyInteger((int) ' ');
        MyInteger myInteger58 = new MyInteger((int) 'a');
        int int59 = myInteger58.getIntValue();
        MyInteger myInteger60 = myInteger56.multiply(myInteger58);
        MyInteger myInteger61 = myInteger53.add(myInteger60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger56", myInteger1.equals(myInteger56) ? myInteger1.hashCode() == myInteger56.hashCode() : true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        int int2 = myInteger1.getIntValue();
        MyInteger myInteger4 = new MyInteger((int) (short) 0);
        boolean boolean6 = myInteger4.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = myInteger4.multiply(myInteger8);
        boolean boolean13 = myInteger8.equals((java.lang.Object) (byte) -1);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        int int27 = myInteger19.getIntValue();
        int int28 = myInteger19.getIntValue();
        MyInteger myInteger30 = new MyInteger((int) (short) 0);
        boolean boolean32 = myInteger30.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = myInteger30.multiply(myInteger34);
        MyInteger myInteger38 = myInteger19.add(myInteger30);
        int int39 = myInteger38.getIntValue();
        boolean boolean40 = myInteger15.equals((java.lang.Object) myInteger38);
        java.lang.String str41 = myInteger15.toString();
        MyInteger myInteger42 = myInteger8.multiply(myInteger15);
        MyInteger myInteger43 = myInteger1.multiply(myInteger8);
        MyInteger myInteger45 = new MyInteger((int) (byte) -1);
        int int46 = myInteger45.getIntValue();
        MyInteger myInteger48 = new MyInteger((int) (short) -1);
        java.lang.String str49 = myInteger48.toString();
        boolean boolean51 = myInteger48.equals((java.lang.Object) (-1));
        MyInteger myInteger53 = new MyInteger((int) (short) 0);
        boolean boolean55 = myInteger53.equals((java.lang.Object) 1.0f);
        MyInteger myInteger57 = new MyInteger((int) (short) 0);
        boolean boolean59 = myInteger57.equals((java.lang.Object) 1.0f);
        MyInteger myInteger60 = myInteger53.multiply(myInteger57);
        MyInteger myInteger62 = new MyInteger((int) (short) 0);
        MyInteger myInteger63 = myInteger53.multiply(myInteger62);
        java.lang.String str64 = myInteger53.toString();
        MyInteger myInteger66 = new MyInteger((int) (short) 0);
        boolean boolean68 = myInteger66.equals((java.lang.Object) 1.0f);
        MyInteger myInteger70 = new MyInteger((int) (short) 0);
        boolean boolean72 = myInteger70.equals((java.lang.Object) 1.0f);
        MyInteger myInteger73 = myInteger66.multiply(myInteger70);
        int int74 = myInteger66.getIntValue();
        java.lang.String str75 = myInteger66.toString();
        boolean boolean77 = myInteger66.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger78 = myInteger53.multiply(myInteger66);
        boolean boolean79 = myInteger48.equals((java.lang.Object) myInteger66);
        MyInteger myInteger80 = myInteger45.add(myInteger48);
        MyInteger myInteger81 = myInteger1.multiply(myInteger48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger4 and myInteger45", myInteger4.equals(myInteger45) ? myInteger4.hashCode() == myInteger45.hashCode() : true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        int int14 = myInteger5.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        MyInteger myInteger24 = myInteger5.add(myInteger16);
        MyInteger myInteger25 = myInteger1.multiply(myInteger24);
        java.lang.String str26 = myInteger25.toString();
        MyInteger myInteger28 = new MyInteger((int) (short) 0);
        boolean boolean30 = myInteger28.equals((java.lang.Object) 1.0f);
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        boolean boolean34 = myInteger32.equals((java.lang.Object) 1.0f);
        MyInteger myInteger35 = myInteger28.multiply(myInteger32);
        MyInteger myInteger37 = new MyInteger((int) (short) 0);
        MyInteger myInteger38 = myInteger28.multiply(myInteger37);
        boolean boolean40 = myInteger28.equals((java.lang.Object) '4');
        MyInteger myInteger41 = myInteger25.multiply(myInteger28);
        MyInteger myInteger43 = new MyInteger((int) (byte) 1);
        int int44 = myInteger43.getIntValue();
        MyInteger myInteger45 = myInteger41.add(myInteger43);
        java.lang.Class<?> wildcardClass46 = myInteger41.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger43", myInteger1.equals(myInteger43) ? myInteger1.hashCode() == myInteger43.hashCode() : true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        int int14 = myInteger5.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        MyInteger myInteger24 = myInteger5.add(myInteger16);
        MyInteger myInteger25 = myInteger1.multiply(myInteger24);
        java.lang.String str26 = myInteger24.toString();
        boolean boolean28 = myInteger24.equals((java.lang.Object) "1");
        MyInteger myInteger30 = new MyInteger((int) (short) 0);
        boolean boolean32 = myInteger30.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger38 = new MyInteger((int) (short) 0);
        boolean boolean40 = myInteger38.equals((java.lang.Object) 1.0f);
        MyInteger myInteger41 = myInteger34.multiply(myInteger38);
        MyInteger myInteger42 = myInteger30.add(myInteger38);
        MyInteger myInteger44 = new MyInteger((int) (short) 0);
        boolean boolean46 = myInteger44.equals((java.lang.Object) 1.0f);
        MyInteger myInteger48 = new MyInteger((int) (short) 0);
        boolean boolean50 = myInteger48.equals((java.lang.Object) 1.0f);
        MyInteger myInteger52 = new MyInteger((int) (short) 0);
        boolean boolean54 = myInteger52.equals((java.lang.Object) 1.0f);
        MyInteger myInteger55 = myInteger48.multiply(myInteger52);
        MyInteger myInteger56 = myInteger44.multiply(myInteger48);
        MyInteger myInteger58 = new MyInteger((int) (short) -1);
        java.lang.String str59 = myInteger58.toString();
        java.lang.String str60 = myInteger58.toString();
        MyInteger myInteger61 = myInteger48.multiply(myInteger58);
        MyInteger myInteger62 = myInteger30.multiply(myInteger58);
        MyInteger myInteger63 = myInteger24.add(myInteger58);
        int int64 = myInteger24.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger58", myInteger1.equals(myInteger58) ? myInteger1.hashCode() == myInteger58.hashCode() : true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        int int14 = myInteger5.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        MyInteger myInteger24 = myInteger5.add(myInteger16);
        MyInteger myInteger25 = myInteger1.multiply(myInteger24);
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = myInteger27.multiply(myInteger31);
        java.lang.Class<?> wildcardClass35 = myInteger31.getClass();
        boolean boolean36 = myInteger25.equals((java.lang.Object) wildcardClass35);
        MyInteger myInteger38 = new MyInteger((int) (byte) 10);
        MyInteger myInteger39 = myInteger25.multiply(myInteger38);
        MyInteger myInteger41 = new MyInteger((-1));
        MyInteger myInteger42 = myInteger39.multiply(myInteger41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger38", myInteger1.equals(myInteger38) ? myInteger1.hashCode() == myInteger38.hashCode() : true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        MyInteger myInteger1 = new MyInteger(1);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger14 = myInteger7.multiply(myInteger11);
        int int15 = myInteger7.getIntValue();
        int int16 = myInteger7.getIntValue();
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = myInteger18.multiply(myInteger22);
        MyInteger myInteger26 = myInteger7.add(myInteger18);
        int int27 = myInteger26.getIntValue();
        boolean boolean28 = myInteger3.equals((java.lang.Object) myInteger26);
        java.lang.String str29 = myInteger3.toString();
        int int30 = myInteger3.getIntValue();
        java.lang.String str31 = myInteger3.toString();
        boolean boolean32 = myInteger1.equals((java.lang.Object) str31);
        MyInteger myInteger34 = new MyInteger((int) (byte) 100);
        java.lang.String str35 = myInteger34.toString();
        MyInteger myInteger37 = new MyInteger((-2));
        java.lang.String str38 = myInteger37.toString();
        boolean boolean39 = myInteger34.equals((java.lang.Object) myInteger37);
        boolean boolean40 = myInteger1.equals((java.lang.Object) myInteger34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger37", myInteger3.equals(myInteger37) ? myInteger3.hashCode() == myInteger37.hashCode() : true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        java.lang.String str3 = myInteger1.toString();
        int int4 = myInteger1.getIntValue();
        MyInteger myInteger6 = new MyInteger((int) (short) 0);
        boolean boolean8 = myInteger6.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        boolean boolean12 = myInteger10.equals((java.lang.Object) 1.0f);
        MyInteger myInteger14 = new MyInteger((int) (short) 0);
        boolean boolean16 = myInteger14.equals((java.lang.Object) 1.0f);
        MyInteger myInteger17 = myInteger10.multiply(myInteger14);
        int int18 = myInteger10.getIntValue();
        int int19 = myInteger10.getIntValue();
        MyInteger myInteger21 = new MyInteger((int) (short) 0);
        boolean boolean23 = myInteger21.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = new MyInteger((int) (short) 0);
        boolean boolean27 = myInteger25.equals((java.lang.Object) 1.0f);
        MyInteger myInteger28 = myInteger21.multiply(myInteger25);
        MyInteger myInteger29 = myInteger10.add(myInteger21);
        int int30 = myInteger29.getIntValue();
        boolean boolean31 = myInteger6.equals((java.lang.Object) myInteger29);
        MyInteger myInteger32 = myInteger1.add(myInteger6);
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger38 = new MyInteger((int) (short) 0);
        boolean boolean40 = myInteger38.equals((java.lang.Object) 1.0f);
        MyInteger myInteger42 = new MyInteger((int) (short) 0);
        boolean boolean44 = myInteger42.equals((java.lang.Object) 1.0f);
        MyInteger myInteger45 = myInteger38.multiply(myInteger42);
        MyInteger myInteger46 = myInteger34.multiply(myInteger38);
        int int47 = myInteger34.getIntValue();
        MyInteger myInteger49 = new MyInteger((int) (short) 0);
        boolean boolean51 = myInteger49.equals((java.lang.Object) 1.0f);
        MyInteger myInteger53 = new MyInteger((int) (short) 0);
        boolean boolean55 = myInteger53.equals((java.lang.Object) 1.0f);
        MyInteger myInteger57 = new MyInteger((int) (short) 0);
        boolean boolean59 = myInteger57.equals((java.lang.Object) 1.0f);
        MyInteger myInteger60 = myInteger53.multiply(myInteger57);
        int int61 = myInteger53.getIntValue();
        int int62 = myInteger53.getIntValue();
        MyInteger myInteger64 = new MyInteger((int) (short) 0);
        boolean boolean66 = myInteger64.equals((java.lang.Object) 1.0f);
        MyInteger myInteger68 = new MyInteger((int) (short) 0);
        boolean boolean70 = myInteger68.equals((java.lang.Object) 1.0f);
        MyInteger myInteger71 = myInteger64.multiply(myInteger68);
        MyInteger myInteger72 = myInteger53.add(myInteger64);
        MyInteger myInteger73 = myInteger49.multiply(myInteger72);
        java.lang.String str74 = myInteger49.toString();
        MyInteger myInteger75 = myInteger34.multiply(myInteger49);
        MyInteger myInteger76 = myInteger1.multiply(myInteger34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger6 and myInteger32", myInteger6.equals(myInteger32) ? myInteger6.hashCode() == myInteger32.hashCode() : true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        MyInteger myInteger1 = new MyInteger((int) (short) 1);
        MyInteger myInteger3 = new MyInteger((int) '4');
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger14 = new MyInteger((int) (short) 0);
        MyInteger myInteger15 = myInteger5.multiply(myInteger14);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger21 = new MyInteger((int) (short) 0);
        boolean boolean23 = myInteger21.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = new MyInteger((int) (short) 0);
        boolean boolean27 = myInteger25.equals((java.lang.Object) 1.0f);
        MyInteger myInteger28 = myInteger21.multiply(myInteger25);
        int int29 = myInteger21.getIntValue();
        int int30 = myInteger21.getIntValue();
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        boolean boolean34 = myInteger32.equals((java.lang.Object) 1.0f);
        MyInteger myInteger36 = new MyInteger((int) (short) 0);
        boolean boolean38 = myInteger36.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = myInteger32.multiply(myInteger36);
        MyInteger myInteger40 = myInteger21.add(myInteger32);
        int int41 = myInteger40.getIntValue();
        boolean boolean42 = myInteger17.equals((java.lang.Object) myInteger40);
        MyInteger myInteger43 = myInteger14.multiply(myInteger17);
        MyInteger myInteger45 = new MyInteger((int) (short) 0);
        boolean boolean47 = myInteger45.equals((java.lang.Object) 1.0f);
        MyInteger myInteger49 = new MyInteger((int) (short) 0);
        boolean boolean51 = myInteger49.equals((java.lang.Object) 1.0f);
        MyInteger myInteger52 = myInteger45.multiply(myInteger49);
        MyInteger myInteger54 = new MyInteger((int) (short) 0);
        MyInteger myInteger55 = myInteger45.multiply(myInteger54);
        java.lang.String str56 = myInteger45.toString();
        MyInteger myInteger58 = new MyInteger((int) (short) 0);
        boolean boolean60 = myInteger58.equals((java.lang.Object) 1.0f);
        MyInteger myInteger62 = new MyInteger((int) (short) 0);
        boolean boolean64 = myInteger62.equals((java.lang.Object) 1.0f);
        MyInteger myInteger65 = myInteger58.multiply(myInteger62);
        int int66 = myInteger58.getIntValue();
        java.lang.String str67 = myInteger58.toString();
        boolean boolean69 = myInteger58.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger70 = myInteger45.multiply(myInteger58);
        MyInteger myInteger71 = myInteger14.add(myInteger58);
        MyInteger myInteger72 = myInteger3.add(myInteger58);
        MyInteger myInteger73 = myInteger1.add(myInteger58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger3 and myInteger5", myInteger3.equals(myInteger5) ? myInteger3.hashCode() == myInteger5.hashCode() : true);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        MyInteger myInteger11 = myInteger1.multiply(myInteger10);
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger21 = new MyInteger((int) (short) 0);
        boolean boolean23 = myInteger21.equals((java.lang.Object) 1.0f);
        MyInteger myInteger24 = myInteger17.multiply(myInteger21);
        int int25 = myInteger17.getIntValue();
        int int26 = myInteger17.getIntValue();
        MyInteger myInteger28 = new MyInteger((int) (short) 0);
        boolean boolean30 = myInteger28.equals((java.lang.Object) 1.0f);
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        boolean boolean34 = myInteger32.equals((java.lang.Object) 1.0f);
        MyInteger myInteger35 = myInteger28.multiply(myInteger32);
        MyInteger myInteger36 = myInteger17.add(myInteger28);
        int int37 = myInteger36.getIntValue();
        boolean boolean38 = myInteger13.equals((java.lang.Object) myInteger36);
        MyInteger myInteger39 = myInteger10.multiply(myInteger13);
        MyInteger myInteger41 = new MyInteger((int) (short) 0);
        boolean boolean43 = myInteger41.equals((java.lang.Object) 1.0f);
        MyInteger myInteger45 = new MyInteger((int) (short) 0);
        boolean boolean47 = myInteger45.equals((java.lang.Object) 1.0f);
        MyInteger myInteger48 = myInteger41.multiply(myInteger45);
        MyInteger myInteger50 = new MyInteger((int) (short) 0);
        MyInteger myInteger51 = myInteger41.multiply(myInteger50);
        java.lang.String str52 = myInteger41.toString();
        MyInteger myInteger54 = new MyInteger((int) (short) 0);
        boolean boolean56 = myInteger54.equals((java.lang.Object) 1.0f);
        MyInteger myInteger58 = new MyInteger((int) (short) 0);
        boolean boolean60 = myInteger58.equals((java.lang.Object) 1.0f);
        MyInteger myInteger61 = myInteger54.multiply(myInteger58);
        int int62 = myInteger54.getIntValue();
        java.lang.String str63 = myInteger54.toString();
        boolean boolean65 = myInteger54.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger66 = myInteger41.multiply(myInteger54);
        MyInteger myInteger67 = myInteger10.add(myInteger54);
        java.lang.String str68 = myInteger10.toString();
        MyInteger myInteger70 = new MyInteger((int) 'a');
        java.lang.String str71 = myInteger70.toString();
        MyInteger myInteger73 = new MyInteger((int) (short) 0);
        boolean boolean75 = myInteger73.equals((java.lang.Object) 1.0f);
        MyInteger myInteger77 = new MyInteger((int) (short) 0);
        boolean boolean79 = myInteger77.equals((java.lang.Object) 1.0f);
        MyInteger myInteger80 = myInteger73.multiply(myInteger77);
        int int81 = myInteger73.getIntValue();
        MyInteger myInteger83 = new MyInteger((int) (byte) 1);
        MyInteger myInteger84 = myInteger73.multiply(myInteger83);
        MyInteger myInteger85 = myInteger70.multiply(myInteger83);
        boolean boolean86 = myInteger10.equals((java.lang.Object) myInteger83);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger70", myInteger1.equals(myInteger70) ? myInteger1.hashCode() == myInteger70.hashCode() : true);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        int int14 = myInteger5.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        MyInteger myInteger24 = myInteger5.add(myInteger16);
        int int25 = myInteger24.getIntValue();
        boolean boolean26 = myInteger1.equals((java.lang.Object) myInteger24);
        java.lang.String str27 = myInteger1.toString();
        MyInteger myInteger29 = new MyInteger((int) (byte) 10);
        MyInteger myInteger30 = myInteger1.add(myInteger29);
        java.lang.String str31 = myInteger29.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger30", myInteger1.equals(myInteger30) ? myInteger1.hashCode() == myInteger30.hashCode() : true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.add(myInteger9);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        MyInteger myInteger27 = myInteger15.multiply(myInteger19);
        MyInteger myInteger29 = new MyInteger((int) (short) -1);
        java.lang.String str30 = myInteger29.toString();
        java.lang.String str31 = myInteger29.toString();
        MyInteger myInteger32 = myInteger19.multiply(myInteger29);
        MyInteger myInteger33 = myInteger1.multiply(myInteger29);
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger42 = myInteger35.multiply(myInteger39);
        int int43 = myInteger35.getIntValue();
        java.lang.String str44 = myInteger35.toString();
        java.lang.String str45 = myInteger35.toString();
        MyInteger myInteger46 = myInteger29.add(myInteger35);
        MyInteger myInteger48 = new MyInteger((int) (short) 0);
        boolean boolean50 = myInteger48.equals((java.lang.Object) 1.0f);
        MyInteger myInteger52 = new MyInteger((int) (short) 0);
        boolean boolean54 = myInteger52.equals((java.lang.Object) 1.0f);
        MyInteger myInteger55 = myInteger48.multiply(myInteger52);
        int int56 = myInteger48.getIntValue();
        MyInteger myInteger58 = new MyInteger((int) '#');
        MyInteger myInteger59 = myInteger48.add(myInteger58);
        boolean boolean60 = myInteger29.equals((java.lang.Object) myInteger59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger46", myInteger1.equals(myInteger46) ? myInteger1.hashCode() == myInteger46.hashCode() : true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        java.lang.String str4 = myInteger1.toString();
        MyInteger myInteger6 = new MyInteger((-1));
        int int7 = myInteger6.getIntValue();
        int int8 = myInteger6.getIntValue();
        MyInteger myInteger9 = myInteger1.add(myInteger6);
        int int10 = myInteger9.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger6", myInteger1.equals(myInteger6) ? myInteger1.hashCode() == myInteger6.hashCode() : true);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        MyInteger myInteger1 = new MyInteger((int) 'a');
        java.lang.String str2 = myInteger1.toString();
        java.lang.String str3 = myInteger1.toString();
        MyInteger myInteger5 = new MyInteger((int) ' ');
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger14 = myInteger7.multiply(myInteger11);
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        MyInteger myInteger17 = myInteger7.multiply(myInteger16);
        java.lang.String str18 = myInteger7.toString();
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger24 = new MyInteger((int) (short) 0);
        boolean boolean26 = myInteger24.equals((java.lang.Object) 1.0f);
        MyInteger myInteger27 = myInteger20.multiply(myInteger24);
        int int28 = myInteger20.getIntValue();
        java.lang.String str29 = myInteger20.toString();
        boolean boolean31 = myInteger20.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger32 = myInteger7.multiply(myInteger20);
        MyInteger myInteger33 = myInteger5.add(myInteger32);
        boolean boolean34 = myInteger1.equals((java.lang.Object) myInteger33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger5 and myInteger7", myInteger5.equals(myInteger7) ? myInteger5.hashCode() == myInteger7.hashCode() : true);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.multiply(myInteger5);
        MyInteger myInteger15 = new MyInteger((int) ' ');
        MyInteger myInteger16 = myInteger13.multiply(myInteger15);
        int int17 = myInteger15.getIntValue();
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        MyInteger myInteger28 = new MyInteger((int) (short) 0);
        MyInteger myInteger29 = myInteger19.multiply(myInteger28);
        java.lang.String str30 = myInteger19.toString();
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        boolean boolean34 = myInteger32.equals((java.lang.Object) 1.0f);
        MyInteger myInteger36 = new MyInteger((int) (short) 0);
        boolean boolean38 = myInteger36.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = myInteger32.multiply(myInteger36);
        int int40 = myInteger32.getIntValue();
        java.lang.String str41 = myInteger32.toString();
        boolean boolean43 = myInteger32.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger44 = myInteger19.multiply(myInteger32);
        java.lang.String str45 = myInteger44.toString();
        MyInteger myInteger46 = myInteger15.multiply(myInteger44);
        java.lang.Class<?> wildcardClass47 = myInteger46.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger15", myInteger1.equals(myInteger15) ? myInteger1.hashCode() == myInteger15.hashCode() : true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        MyInteger myInteger1 = new MyInteger((int) (byte) -1);
        int int2 = myInteger1.getIntValue();
        MyInteger myInteger4 = new MyInteger((int) (short) -1);
        java.lang.String str5 = myInteger4.toString();
        boolean boolean7 = myInteger4.equals((java.lang.Object) (-1));
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger16 = myInteger9.multiply(myInteger13);
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        MyInteger myInteger19 = myInteger9.multiply(myInteger18);
        java.lang.String str20 = myInteger9.toString();
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = new MyInteger((int) (short) 0);
        boolean boolean28 = myInteger26.equals((java.lang.Object) 1.0f);
        MyInteger myInteger29 = myInteger22.multiply(myInteger26);
        int int30 = myInteger22.getIntValue();
        java.lang.String str31 = myInteger22.toString();
        boolean boolean33 = myInteger22.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger34 = myInteger9.multiply(myInteger22);
        boolean boolean35 = myInteger4.equals((java.lang.Object) myInteger22);
        MyInteger myInteger36 = myInteger1.add(myInteger4);
        java.lang.Class<?> wildcardClass37 = myInteger1.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger4 and myInteger9", myInteger4.equals(myInteger9) ? myInteger4.hashCode() == myInteger9.hashCode() : true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        int int14 = myInteger5.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        MyInteger myInteger24 = myInteger5.add(myInteger16);
        MyInteger myInteger25 = myInteger1.multiply(myInteger24);
        java.lang.String str26 = myInteger25.toString();
        MyInteger myInteger28 = new MyInteger((int) 'a');
        int int29 = myInteger28.getIntValue();
        int int30 = myInteger28.getIntValue();
        java.lang.String str31 = myInteger28.toString();
        MyInteger myInteger33 = new MyInteger((int) (short) 0);
        boolean boolean35 = myInteger33.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = new MyInteger((int) (short) 0);
        boolean boolean39 = myInteger37.equals((java.lang.Object) 1.0f);
        MyInteger myInteger41 = new MyInteger((int) (short) 0);
        boolean boolean43 = myInteger41.equals((java.lang.Object) 1.0f);
        MyInteger myInteger44 = myInteger37.multiply(myInteger41);
        int int45 = myInteger37.getIntValue();
        int int46 = myInteger37.getIntValue();
        MyInteger myInteger48 = new MyInteger((int) (short) 0);
        boolean boolean50 = myInteger48.equals((java.lang.Object) 1.0f);
        MyInteger myInteger52 = new MyInteger((int) (short) 0);
        boolean boolean54 = myInteger52.equals((java.lang.Object) 1.0f);
        MyInteger myInteger55 = myInteger48.multiply(myInteger52);
        MyInteger myInteger56 = myInteger37.add(myInteger48);
        MyInteger myInteger57 = myInteger33.multiply(myInteger56);
        java.lang.String str58 = myInteger57.toString();
        MyInteger myInteger60 = new MyInteger((int) (short) 0);
        boolean boolean62 = myInteger60.equals((java.lang.Object) 1.0f);
        MyInteger myInteger64 = new MyInteger((int) (short) 0);
        boolean boolean66 = myInteger64.equals((java.lang.Object) 1.0f);
        MyInteger myInteger67 = myInteger60.multiply(myInteger64);
        boolean boolean69 = myInteger64.equals((java.lang.Object) (byte) -1);
        int int70 = myInteger64.getIntValue();
        MyInteger myInteger72 = new MyInteger((int) (short) 0);
        boolean boolean74 = myInteger72.equals((java.lang.Object) 1.0f);
        MyInteger myInteger76 = new MyInteger((int) (short) 0);
        boolean boolean78 = myInteger76.equals((java.lang.Object) 1.0f);
        MyInteger myInteger79 = myInteger72.multiply(myInteger76);
        int int80 = myInteger72.getIntValue();
        java.lang.String str81 = myInteger72.toString();
        java.lang.String str82 = myInteger72.toString();
        MyInteger myInteger83 = myInteger64.add(myInteger72);
        int int84 = myInteger72.getIntValue();
        MyInteger myInteger86 = new MyInteger((int) (short) 0);
        boolean boolean88 = myInteger86.equals((java.lang.Object) 1.0f);
        MyInteger myInteger90 = new MyInteger((int) (short) 0);
        boolean boolean92 = myInteger90.equals((java.lang.Object) 1.0f);
        MyInteger myInteger93 = myInteger86.multiply(myInteger90);
        boolean boolean94 = myInteger72.equals((java.lang.Object) myInteger90);
        MyInteger myInteger95 = myInteger57.multiply(myInteger72);
        MyInteger myInteger96 = myInteger28.add(myInteger95);
        boolean boolean97 = myInteger25.equals((java.lang.Object) myInteger96);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger28", myInteger1.equals(myInteger28) ? myInteger1.hashCode() == myInteger28.hashCode() : true);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        MyInteger myInteger11 = myInteger1.multiply(myInteger10);
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = myInteger13.multiply(myInteger17);
        boolean boolean22 = myInteger17.equals((java.lang.Object) (byte) -1);
        int int23 = myInteger17.getIntValue();
        MyInteger myInteger25 = new MyInteger((int) (short) 0);
        boolean boolean27 = myInteger25.equals((java.lang.Object) 1.0f);
        MyInteger myInteger29 = new MyInteger((int) (short) 0);
        boolean boolean31 = myInteger29.equals((java.lang.Object) 1.0f);
        MyInteger myInteger32 = myInteger25.multiply(myInteger29);
        int int33 = myInteger25.getIntValue();
        java.lang.String str34 = myInteger25.toString();
        java.lang.String str35 = myInteger25.toString();
        MyInteger myInteger36 = myInteger17.add(myInteger25);
        int int37 = myInteger25.getIntValue();
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger46 = myInteger39.multiply(myInteger43);
        boolean boolean47 = myInteger25.equals((java.lang.Object) myInteger43);
        boolean boolean48 = myInteger10.equals((java.lang.Object) myInteger43);
        MyInteger myInteger50 = new MyInteger((-1));
        int int51 = myInteger50.getIntValue();
        MyInteger myInteger52 = myInteger43.add(myInteger50);
        MyInteger myInteger54 = new MyInteger((int) (short) 0);
        boolean boolean56 = myInteger54.equals((java.lang.Object) 1.0f);
        MyInteger myInteger58 = new MyInteger((int) (short) 0);
        boolean boolean60 = myInteger58.equals((java.lang.Object) 1.0f);
        MyInteger myInteger61 = myInteger54.multiply(myInteger58);
        MyInteger myInteger63 = new MyInteger((int) (short) 0);
        MyInteger myInteger64 = myInteger54.multiply(myInteger63);
        MyInteger myInteger66 = new MyInteger((int) (short) 0);
        boolean boolean68 = myInteger66.equals((java.lang.Object) 1.0f);
        MyInteger myInteger70 = new MyInteger((int) (short) 0);
        boolean boolean72 = myInteger70.equals((java.lang.Object) 1.0f);
        MyInteger myInteger74 = new MyInteger((int) (short) 0);
        boolean boolean76 = myInteger74.equals((java.lang.Object) 1.0f);
        MyInteger myInteger77 = myInteger70.multiply(myInteger74);
        int int78 = myInteger70.getIntValue();
        int int79 = myInteger70.getIntValue();
        MyInteger myInteger81 = new MyInteger((int) (short) 0);
        boolean boolean83 = myInteger81.equals((java.lang.Object) 1.0f);
        MyInteger myInteger85 = new MyInteger((int) (short) 0);
        boolean boolean87 = myInteger85.equals((java.lang.Object) 1.0f);
        MyInteger myInteger88 = myInteger81.multiply(myInteger85);
        MyInteger myInteger89 = myInteger70.add(myInteger81);
        int int90 = myInteger89.getIntValue();
        boolean boolean91 = myInteger66.equals((java.lang.Object) myInteger89);
        MyInteger myInteger92 = myInteger63.multiply(myInteger66);
        MyInteger myInteger93 = myInteger50.add(myInteger66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger52", myInteger1.equals(myInteger52) ? myInteger1.hashCode() == myInteger52.hashCode() : true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        int int9 = myInteger1.getIntValue();
        MyInteger myInteger11 = new MyInteger((int) (byte) 1);
        MyInteger myInteger12 = myInteger1.multiply(myInteger11);
        MyInteger myInteger14 = new MyInteger((int) 'a');
        MyInteger myInteger15 = myInteger11.multiply(myInteger14);
        java.lang.Class<?> wildcardClass16 = myInteger14.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger11", myInteger1.equals(myInteger11) ? myInteger1.hashCode() == myInteger11.hashCode() : true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        int int2 = myInteger1.getIntValue();
        java.lang.String str3 = myInteger1.toString();
        int int4 = myInteger1.getIntValue();
        MyInteger myInteger6 = new MyInteger((int) (byte) 1);
        MyInteger myInteger8 = new MyInteger((int) 'a');
        MyInteger myInteger9 = myInteger6.multiply(myInteger8);
        MyInteger myInteger10 = myInteger1.add(myInteger6);
        MyInteger myInteger12 = new MyInteger(1);
        boolean boolean13 = myInteger10.equals((java.lang.Object) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger6", myInteger1.equals(myInteger6) ? myInteger1.hashCode() == myInteger6.hashCode() : true);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        MyInteger myInteger11 = myInteger1.multiply(myInteger10);
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = myInteger13.multiply(myInteger17);
        boolean boolean22 = myInteger17.equals((java.lang.Object) (byte) -1);
        int int23 = myInteger17.getIntValue();
        MyInteger myInteger25 = new MyInteger((int) (short) 0);
        boolean boolean27 = myInteger25.equals((java.lang.Object) 1.0f);
        MyInteger myInteger29 = new MyInteger((int) (short) 0);
        boolean boolean31 = myInteger29.equals((java.lang.Object) 1.0f);
        MyInteger myInteger32 = myInteger25.multiply(myInteger29);
        int int33 = myInteger25.getIntValue();
        java.lang.String str34 = myInteger25.toString();
        java.lang.String str35 = myInteger25.toString();
        MyInteger myInteger36 = myInteger17.add(myInteger25);
        int int37 = myInteger25.getIntValue();
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger46 = myInteger39.multiply(myInteger43);
        boolean boolean47 = myInteger25.equals((java.lang.Object) myInteger43);
        boolean boolean48 = myInteger10.equals((java.lang.Object) myInteger43);
        MyInteger myInteger50 = new MyInteger((int) ' ');
        MyInteger myInteger52 = new MyInteger((int) 'a');
        int int53 = myInteger52.getIntValue();
        MyInteger myInteger54 = myInteger50.multiply(myInteger52);
        boolean boolean55 = myInteger43.equals((java.lang.Object) myInteger54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger50", myInteger1.equals(myInteger50) ? myInteger1.hashCode() == myInteger50.hashCode() : true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        int int14 = myInteger5.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        MyInteger myInteger24 = myInteger5.add(myInteger16);
        MyInteger myInteger25 = myInteger1.multiply(myInteger24);
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = myInteger27.multiply(myInteger31);
        java.lang.Class<?> wildcardClass35 = myInteger31.getClass();
        boolean boolean36 = myInteger25.equals((java.lang.Object) wildcardClass35);
        MyInteger myInteger38 = new MyInteger((int) (byte) 10);
        MyInteger myInteger39 = myInteger25.multiply(myInteger38);
        MyInteger myInteger41 = new MyInteger((int) (short) 0);
        boolean boolean43 = myInteger41.equals((java.lang.Object) 1.0f);
        MyInteger myInteger45 = new MyInteger((int) (short) 0);
        boolean boolean47 = myInteger45.equals((java.lang.Object) 1.0f);
        MyInteger myInteger48 = myInteger41.multiply(myInteger45);
        boolean boolean50 = myInteger45.equals((java.lang.Object) (byte) -1);
        MyInteger myInteger52 = new MyInteger((int) (short) 0);
        boolean boolean54 = myInteger52.equals((java.lang.Object) 1.0f);
        MyInteger myInteger56 = new MyInteger((int) (short) 0);
        boolean boolean58 = myInteger56.equals((java.lang.Object) 1.0f);
        MyInteger myInteger60 = new MyInteger((int) (short) 0);
        boolean boolean62 = myInteger60.equals((java.lang.Object) 1.0f);
        MyInteger myInteger63 = myInteger56.multiply(myInteger60);
        int int64 = myInteger56.getIntValue();
        int int65 = myInteger56.getIntValue();
        MyInteger myInteger67 = new MyInteger((int) (short) 0);
        boolean boolean69 = myInteger67.equals((java.lang.Object) 1.0f);
        MyInteger myInteger71 = new MyInteger((int) (short) 0);
        boolean boolean73 = myInteger71.equals((java.lang.Object) 1.0f);
        MyInteger myInteger74 = myInteger67.multiply(myInteger71);
        MyInteger myInteger75 = myInteger56.add(myInteger67);
        int int76 = myInteger75.getIntValue();
        boolean boolean77 = myInteger52.equals((java.lang.Object) myInteger75);
        java.lang.String str78 = myInteger52.toString();
        MyInteger myInteger79 = myInteger45.multiply(myInteger52);
        int int80 = myInteger52.getIntValue();
        java.lang.String str81 = myInteger52.toString();
        java.lang.String str82 = myInteger52.toString();
        MyInteger myInteger83 = myInteger25.add(myInteger52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger38", myInteger1.equals(myInteger38) ? myInteger1.hashCode() == myInteger38.hashCode() : true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        MyInteger myInteger11 = myInteger1.multiply(myInteger10);
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = myInteger13.multiply(myInteger17);
        boolean boolean22 = myInteger17.equals((java.lang.Object) (byte) -1);
        int int23 = myInteger17.getIntValue();
        MyInteger myInteger25 = new MyInteger((int) (short) 0);
        boolean boolean27 = myInteger25.equals((java.lang.Object) 1.0f);
        MyInteger myInteger29 = new MyInteger((int) (short) 0);
        boolean boolean31 = myInteger29.equals((java.lang.Object) 1.0f);
        MyInteger myInteger32 = myInteger25.multiply(myInteger29);
        int int33 = myInteger25.getIntValue();
        java.lang.String str34 = myInteger25.toString();
        java.lang.String str35 = myInteger25.toString();
        MyInteger myInteger36 = myInteger17.add(myInteger25);
        int int37 = myInteger25.getIntValue();
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger43 = new MyInteger((int) (short) 0);
        boolean boolean45 = myInteger43.equals((java.lang.Object) 1.0f);
        MyInteger myInteger46 = myInteger39.multiply(myInteger43);
        boolean boolean47 = myInteger25.equals((java.lang.Object) myInteger43);
        boolean boolean48 = myInteger10.equals((java.lang.Object) myInteger43);
        MyInteger myInteger50 = new MyInteger((-1));
        int int51 = myInteger50.getIntValue();
        MyInteger myInteger52 = myInteger43.add(myInteger50);
        int int53 = myInteger50.getIntValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger52", myInteger1.equals(myInteger52) ? myInteger1.hashCode() == myInteger52.hashCode() : true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        MyInteger myInteger4 = new MyInteger((int) (short) 0);
        boolean boolean6 = myInteger4.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger15 = myInteger8.multiply(myInteger12);
        int int16 = myInteger8.getIntValue();
        int int17 = myInteger8.getIntValue();
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger26 = myInteger19.multiply(myInteger23);
        MyInteger myInteger27 = myInteger8.add(myInteger19);
        MyInteger myInteger28 = myInteger4.multiply(myInteger27);
        MyInteger myInteger29 = myInteger1.add(myInteger28);
        MyInteger myInteger31 = new MyInteger((int) 'a');
        int int32 = myInteger31.getIntValue();
        int int33 = myInteger31.getIntValue();
        MyInteger myInteger35 = new MyInteger((int) (short) 0);
        boolean boolean37 = myInteger35.equals((java.lang.Object) 1.0f);
        MyInteger myInteger39 = new MyInteger((int) (short) 0);
        boolean boolean41 = myInteger39.equals((java.lang.Object) 1.0f);
        MyInteger myInteger42 = myInteger35.multiply(myInteger39);
        int int43 = myInteger35.getIntValue();
        java.lang.String str44 = myInteger35.toString();
        boolean boolean46 = myInteger35.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger47 = myInteger31.multiply(myInteger35);
        boolean boolean48 = myInteger28.equals((java.lang.Object) myInteger35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger4", myInteger1.equals(myInteger4) ? myInteger1.hashCode() == myInteger4.hashCode() : true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        boolean boolean10 = myInteger5.equals((java.lang.Object) (byte) -1);
        int int11 = myInteger5.getIntValue();
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = myInteger13.multiply(myInteger17);
        int int21 = myInteger13.getIntValue();
        java.lang.String str22 = myInteger13.toString();
        java.lang.String str23 = myInteger13.toString();
        MyInteger myInteger24 = myInteger5.add(myInteger13);
        MyInteger myInteger26 = new MyInteger((int) (short) 0);
        boolean boolean28 = myInteger26.equals((java.lang.Object) 1.0f);
        MyInteger myInteger30 = new MyInteger((int) (short) 0);
        boolean boolean32 = myInteger30.equals((java.lang.Object) 1.0f);
        MyInteger myInteger33 = myInteger26.multiply(myInteger30);
        int int34 = myInteger26.getIntValue();
        MyInteger myInteger36 = new MyInteger((int) (byte) 1);
        MyInteger myInteger37 = myInteger26.multiply(myInteger36);
        MyInteger myInteger38 = myInteger24.add(myInteger37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger36", myInteger1.equals(myInteger36) ? myInteger1.hashCode() == myInteger36.hashCode() : true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        int int13 = myInteger5.getIntValue();
        int int14 = myInteger5.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        MyInteger myInteger24 = myInteger5.add(myInteger16);
        MyInteger myInteger25 = myInteger1.multiply(myInteger24);
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = myInteger27.multiply(myInteger31);
        java.lang.Class<?> wildcardClass35 = myInteger31.getClass();
        boolean boolean36 = myInteger25.equals((java.lang.Object) wildcardClass35);
        MyInteger myInteger38 = new MyInteger((int) (byte) 10);
        MyInteger myInteger39 = myInteger25.multiply(myInteger38);
        MyInteger myInteger41 = new MyInteger((int) (short) 0);
        int int42 = myInteger41.getIntValue();
        MyInteger myInteger44 = new MyInteger((int) (short) 0);
        boolean boolean46 = myInteger44.equals((java.lang.Object) 1.0f);
        MyInteger myInteger48 = new MyInteger((int) (short) 0);
        boolean boolean50 = myInteger48.equals((java.lang.Object) 1.0f);
        MyInteger myInteger52 = new MyInteger((int) (short) 0);
        boolean boolean54 = myInteger52.equals((java.lang.Object) 1.0f);
        MyInteger myInteger55 = myInteger48.multiply(myInteger52);
        int int56 = myInteger48.getIntValue();
        int int57 = myInteger48.getIntValue();
        MyInteger myInteger59 = new MyInteger((int) (short) 0);
        boolean boolean61 = myInteger59.equals((java.lang.Object) 1.0f);
        MyInteger myInteger63 = new MyInteger((int) (short) 0);
        boolean boolean65 = myInteger63.equals((java.lang.Object) 1.0f);
        MyInteger myInteger66 = myInteger59.multiply(myInteger63);
        MyInteger myInteger67 = myInteger48.add(myInteger59);
        int int68 = myInteger67.getIntValue();
        boolean boolean69 = myInteger44.equals((java.lang.Object) myInteger67);
        boolean boolean70 = myInteger41.equals((java.lang.Object) myInteger67);
        boolean boolean71 = myInteger39.equals((java.lang.Object) myInteger41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on myInteger1 and myInteger38", myInteger1.equals(myInteger38) ? myInteger1.hashCode() == myInteger38.hashCode() : true);
    }
}

