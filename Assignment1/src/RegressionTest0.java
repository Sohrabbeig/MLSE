import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        int int2 = myInteger1.getIntValue();
        java.lang.Class<?> wildcardClass3 = myInteger1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        MyInteger myInteger11 = myInteger1.multiply(myInteger10);
        java.lang.Class<?> wildcardClass12 = myInteger11.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.multiply(myInteger5);
        java.lang.Class<?> wildcardClass14 = myInteger5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.Class<?> wildcardClass2 = myInteger1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        MyInteger myInteger1 = new MyInteger((int) 'a');
        int int2 = myInteger1.getIntValue();
        int int3 = myInteger1.getIntValue();
        java.lang.Class<?> wildcardClass4 = myInteger1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
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
        java.lang.Class<?> wildcardClass21 = myInteger20.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(myInteger19);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
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
        java.lang.Class<?> wildcardClass26 = myInteger25.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        int int9 = myInteger1.getIntValue();
        java.lang.String str10 = myInteger1.toString();
        boolean boolean12 = myInteger1.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass13 = myInteger1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(myInteger15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertNotNull(myInteger27);
        org.junit.Assert.assertNotNull(myInteger28);
        org.junit.Assert.assertNotNull(myInteger29);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger9 = null;
        // The following exception was thrown during execution in test generation
        try {
            MyInteger myInteger10 = myInteger8.multiply(myInteger9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        MyInteger myInteger3 = new MyInteger((int) (short) -1);
        java.lang.String str4 = myInteger3.toString();
        MyInteger myInteger5 = myInteger1.add(myInteger3);
        java.lang.Class<?> wildcardClass6 = myInteger1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(myInteger5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        int int3 = myInteger1.getIntValue();
        java.lang.Class<?> wildcardClass4 = myInteger1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        int int9 = myInteger1.getIntValue();
        MyInteger myInteger11 = new MyInteger((int) '#');
        MyInteger myInteger12 = myInteger1.add(myInteger11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(myInteger12);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        MyInteger myInteger1 = new MyInteger((int) 'a');
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        MyInteger myInteger5 = new MyInteger((int) (short) -1);
        java.lang.String str6 = myInteger5.toString();
        MyInteger myInteger7 = myInteger3.add(myInteger5);
        boolean boolean8 = myInteger1.equals((java.lang.Object) myInteger3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertNotNull(myInteger7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        int int2 = myInteger1.getIntValue();
        MyInteger myInteger4 = new MyInteger((int) (short) -1);
        java.lang.String str5 = myInteger4.toString();
        MyInteger myInteger6 = myInteger1.add(myInteger4);
        MyInteger myInteger8 = new MyInteger((int) (short) -1);
        MyInteger myInteger9 = myInteger6.multiply(myInteger8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertNotNull(myInteger6);
        org.junit.Assert.assertNotNull(myInteger9);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(myInteger14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertNotNull(myInteger27);
        org.junit.Assert.assertNotNull(myInteger28);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        MyInteger myInteger1 = new MyInteger(1);
        java.lang.Class<?> wildcardClass2 = myInteger1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        MyInteger myInteger1 = new MyInteger((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = myInteger1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
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
        java.lang.Class<?> wildcardClass27 = myInteger1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        int int4 = myInteger1.getIntValue();
        java.lang.Class<?> wildcardClass5 = myInteger1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        MyInteger myInteger1 = new MyInteger((int) 'a');
        java.lang.String str2 = myInteger1.toString();
        java.lang.Class<?> wildcardClass3 = myInteger1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "97" + "'", str2, "97");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        MyInteger myInteger11 = myInteger1.multiply(myInteger10);
        boolean boolean13 = myInteger1.equals((java.lang.Object) '4');
        java.lang.Class<?> wildcardClass14 = myInteger1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
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
        java.lang.String str21 = myInteger12.toString();
        java.lang.Class<?> wildcardClass22 = myInteger12.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(myInteger19);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0" + "'", str21, "0");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        MyInteger myInteger11 = myInteger1.multiply(myInteger10);
        java.lang.Class<?> wildcardClass12 = myInteger1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        java.lang.Class<?> wildcardClass9 = myInteger1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
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
        java.lang.Class<?> wildcardClass40 = myInteger39.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(myInteger35);
        org.junit.Assert.assertNotNull(myInteger36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        MyInteger myInteger1 = new MyInteger((int) (byte) 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
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
        java.lang.Class<?> wildcardClass27 = myInteger24.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        MyInteger myInteger3 = new MyInteger((int) (short) -1);
        java.lang.String str4 = myInteger3.toString();
        MyInteger myInteger5 = myInteger1.add(myInteger3);
        java.lang.String str6 = myInteger1.toString();
        MyInteger myInteger7 = null;
        // The following exception was thrown during execution in test generation
        try {
            MyInteger myInteger8 = myInteger1.multiply(myInteger7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(myInteger5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(myInteger10);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0" + "'", str25, "0");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(myInteger28);
        org.junit.Assert.assertNotNull(myInteger29);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        MyInteger myInteger3 = new MyInteger((int) (short) -1);
        java.lang.String str4 = myInteger3.toString();
        MyInteger myInteger5 = myInteger1.add(myInteger3);
        java.lang.String str6 = myInteger1.toString();
        java.lang.String str7 = myInteger1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(myInteger5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(myInteger10);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0" + "'", str25, "0");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(myInteger28);
        org.junit.Assert.assertNotNull(myInteger29);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertNotNull(myInteger27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-1" + "'", str30, "-1");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-1" + "'", str31, "-1");
        org.junit.Assert.assertNotNull(myInteger32);
        org.junit.Assert.assertNotNull(myInteger33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(myInteger42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "0" + "'", str44, "0");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "0" + "'", str45, "0");
        org.junit.Assert.assertNotNull(myInteger46);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0" + "'", str25, "0");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertNotNull(myInteger27);
        org.junit.Assert.assertNotNull(myInteger28);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        MyInteger myInteger1 = new MyInteger((int) ' ');
        java.lang.Class<?> wildcardClass2 = myInteger1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        int int2 = myInteger1.getIntValue();
        MyInteger myInteger4 = new MyInteger((int) (short) -1);
        java.lang.String str5 = myInteger4.toString();
        MyInteger myInteger6 = myInteger1.add(myInteger4);
        int int7 = myInteger6.getIntValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertNotNull(myInteger6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(myInteger34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(myInteger49);
        org.junit.Assert.assertNotNull(myInteger50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(myInteger63);
        org.junit.Assert.assertNotNull(myInteger64);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "-1" + "'", str67, "-1");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "-1" + "'", str68, "-1");
        org.junit.Assert.assertNotNull(myInteger69);
        org.junit.Assert.assertNotNull(myInteger70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        boolean boolean5 = myInteger1.equals((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass6 = myInteger1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
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
        int int40 = myInteger39.getIntValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(myInteger35);
        org.junit.Assert.assertNotNull(myInteger36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        MyInteger myInteger1 = new MyInteger((int) (short) 1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
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
        MyInteger myInteger37 = null;
        // The following exception was thrown during execution in test generation
        try {
            MyInteger myInteger38 = myInteger25.multiply(myInteger37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(myInteger34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        MyInteger myInteger1 = new MyInteger((int) 'a');
        java.lang.Class<?> wildcardClass2 = myInteger1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
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
        java.lang.Class<?> wildcardClass32 = myInteger31.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertNotNull(myInteger31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
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
        java.lang.Class<?> wildcardClass68 = myInteger67.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(myInteger35);
        org.junit.Assert.assertNotNull(myInteger36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(myInteger48);
        org.junit.Assert.assertNotNull(myInteger51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "0" + "'", str52, "0");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(myInteger61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "0" + "'", str63, "0");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(myInteger66);
        org.junit.Assert.assertNotNull(myInteger67);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        MyInteger myInteger1 = new MyInteger((int) ' ');
        MyInteger myInteger3 = new MyInteger((int) 'a');
        int int4 = myInteger3.getIntValue();
        MyInteger myInteger5 = myInteger1.multiply(myInteger3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(myInteger5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        int int9 = myInteger1.getIntValue();
        java.lang.String str10 = myInteger1.toString();
        java.lang.String str11 = myInteger1.toString();
        java.lang.Class<?> wildcardClass12 = myInteger1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(myInteger16);
        org.junit.Assert.assertNotNull(myInteger17);
        org.junit.Assert.assertNotNull(myInteger18);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertNotNull(myInteger16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0" + "'", str28, "0");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(myInteger31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(myInteger46);
        org.junit.Assert.assertNotNull(myInteger47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(myInteger49);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        int int9 = myInteger1.getIntValue();
        java.lang.Class<?> wildcardClass10 = myInteger1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
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
        MyInteger myInteger28 = new MyInteger((int) (short) 0);
        boolean boolean30 = myInteger28.equals((java.lang.Object) 1.0f);
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        boolean boolean34 = myInteger32.equals((java.lang.Object) 1.0f);
        MyInteger myInteger35 = myInteger28.multiply(myInteger32);
        MyInteger myInteger37 = new MyInteger((int) (short) 0);
        MyInteger myInteger38 = myInteger28.multiply(myInteger37);
        MyInteger myInteger40 = new MyInteger((int) (short) 0);
        boolean boolean42 = myInteger40.equals((java.lang.Object) 1.0f);
        MyInteger myInteger44 = new MyInteger((int) (short) 0);
        boolean boolean46 = myInteger44.equals((java.lang.Object) 1.0f);
        MyInteger myInteger48 = new MyInteger((int) (short) 0);
        boolean boolean50 = myInteger48.equals((java.lang.Object) 1.0f);
        MyInteger myInteger51 = myInteger44.multiply(myInteger48);
        int int52 = myInteger44.getIntValue();
        int int53 = myInteger44.getIntValue();
        MyInteger myInteger55 = new MyInteger((int) (short) 0);
        boolean boolean57 = myInteger55.equals((java.lang.Object) 1.0f);
        MyInteger myInteger59 = new MyInteger((int) (short) 0);
        boolean boolean61 = myInteger59.equals((java.lang.Object) 1.0f);
        MyInteger myInteger62 = myInteger55.multiply(myInteger59);
        MyInteger myInteger63 = myInteger44.add(myInteger55);
        int int64 = myInteger63.getIntValue();
        boolean boolean65 = myInteger40.equals((java.lang.Object) myInteger63);
        MyInteger myInteger66 = myInteger37.multiply(myInteger40);
        MyInteger myInteger68 = new MyInteger((int) (short) 0);
        boolean boolean70 = myInteger68.equals((java.lang.Object) 1.0f);
        MyInteger myInteger72 = new MyInteger((int) (short) 0);
        boolean boolean74 = myInteger72.equals((java.lang.Object) 1.0f);
        MyInteger myInteger75 = myInteger68.multiply(myInteger72);
        int int76 = myInteger68.getIntValue();
        java.lang.String str77 = myInteger68.toString();
        java.lang.String str78 = myInteger68.toString();
        boolean boolean79 = myInteger37.equals((java.lang.Object) str78);
        boolean boolean80 = myInteger14.equals((java.lang.Object) boolean79);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(myInteger21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(myInteger35);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(myInteger51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(myInteger62);
        org.junit.Assert.assertNotNull(myInteger63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(myInteger66);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(myInteger75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "0" + "'", str77, "0");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "0" + "'", str78, "0");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(myInteger28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertNotNull(myInteger40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(myInteger43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(myInteger52);
        org.junit.Assert.assertNotNull(myInteger55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "0" + "'", str56, "0");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(myInteger65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "0" + "'", str67, "0");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(myInteger70);
        org.junit.Assert.assertNotNull(myInteger71);
        org.junit.Assert.assertNotNull(myInteger72);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
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
        java.lang.String str75 = myInteger72.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertNotNull(myInteger31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(myInteger40);
        org.junit.Assert.assertNotNull(myInteger43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(myInteger45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(myInteger54);
        org.junit.Assert.assertNotNull(myInteger57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "0" + "'", str58, "0");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(myInteger67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "0" + "'", str69, "0");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(myInteger72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "0" + "'", str73, "0");
        org.junit.Assert.assertNotNull(myInteger74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "0" + "'", str75, "0");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(myInteger10);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(myInteger37);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(myInteger41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(myInteger50);
        org.junit.Assert.assertNotNull(myInteger53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "0" + "'", str54, "0");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(myInteger63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "0" + "'", str65, "0");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(myInteger68);
        org.junit.Assert.assertNotNull(myInteger69);
        org.junit.Assert.assertNotNull(myInteger70);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(myInteger31);
        org.junit.Assert.assertNotNull(myInteger32);
        org.junit.Assert.assertNotNull(myInteger33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "0" + "'", str34, "0");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(myInteger47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(myInteger58);
        org.junit.Assert.assertNotNull(myInteger59);
        org.junit.Assert.assertNotNull(myInteger60);
        org.junit.Assert.assertNotNull(myInteger61);
        org.junit.Assert.assertNotNull(myInteger62);
        org.junit.Assert.assertNotNull(myInteger63);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
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
        java.lang.Class<?> wildcardClass26 = myInteger1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(myInteger21);
        org.junit.Assert.assertNotNull(myInteger22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
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
        MyInteger myInteger45 = null;
        // The following exception was thrown during execution in test generation
        try {
            MyInteger myInteger46 = myInteger28.add(myInteger45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(myInteger21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(myInteger41);
        org.junit.Assert.assertNotNull(myInteger42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(myInteger44);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
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
        java.lang.String str27 = myInteger25.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0" + "'", str27, "0");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        MyInteger myInteger1 = new MyInteger((int) (byte) 1);
        MyInteger myInteger3 = new MyInteger((int) (short) -1);
        java.lang.String str4 = myInteger3.toString();
        int int5 = myInteger3.getIntValue();
        boolean boolean6 = myInteger1.equals((java.lang.Object) myInteger3);
        java.lang.Class<?> wildcardClass7 = myInteger3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "97" + "'", str2, "97");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(myInteger15);
        org.junit.Assert.assertNotNull(myInteger16);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        int int9 = myInteger1.getIntValue();
        MyInteger myInteger11 = new MyInteger((int) (byte) 1);
        MyInteger myInteger12 = myInteger1.multiply(myInteger11);
        java.lang.Class<?> wildcardClass13 = myInteger11.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        int int9 = myInteger1.getIntValue();
        java.lang.String str10 = myInteger1.toString();
        int int11 = myInteger1.getIntValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
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
        java.lang.String str93 = myInteger92.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(myInteger34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(myInteger48);
        org.junit.Assert.assertNotNull(myInteger49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(myInteger62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(myInteger73);
        org.junit.Assert.assertNotNull(myInteger74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(myInteger86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(myInteger88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(myInteger91);
        org.junit.Assert.assertNotNull(myInteger92);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "0" + "'", str93, "0");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(myInteger35);
        org.junit.Assert.assertNotNull(myInteger36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(myInteger46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "-1" + "'", str51, "-1");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(myInteger55);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
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
        java.lang.Class<?> wildcardClass75 = myInteger72.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertNotNull(myInteger31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(myInteger40);
        org.junit.Assert.assertNotNull(myInteger43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(myInteger45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(myInteger54);
        org.junit.Assert.assertNotNull(myInteger57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "0" + "'", str58, "0");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(myInteger67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "0" + "'", str69, "0");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(myInteger72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "0" + "'", str73, "0");
        org.junit.Assert.assertNotNull(myInteger74);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        int int9 = myInteger1.getIntValue();
        java.lang.String str10 = myInteger1.toString();
        java.lang.Class<?> wildcardClass11 = myInteger1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
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
        boolean boolean24 = myInteger19.equals((java.lang.Object) (byte) -1);
        int int25 = myInteger19.getIntValue();
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = myInteger27.multiply(myInteger31);
        int int35 = myInteger27.getIntValue();
        java.lang.String str36 = myInteger27.toString();
        java.lang.String str37 = myInteger27.toString();
        MyInteger myInteger38 = myInteger19.add(myInteger27);
        MyInteger myInteger40 = new MyInteger((int) (short) 0);
        boolean boolean42 = myInteger40.equals((java.lang.Object) 1.0f);
        int int43 = myInteger40.getIntValue();
        java.lang.String str44 = myInteger40.toString();
        MyInteger myInteger45 = myInteger19.add(myInteger40);
        MyInteger myInteger46 = myInteger9.multiply(myInteger45);
        java.lang.Class<?> wildcardClass47 = myInteger9.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(myInteger22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(myInteger34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0" + "'", str36, "0");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0" + "'", str37, "0");
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "0" + "'", str44, "0");
        org.junit.Assert.assertNotNull(myInteger45);
        org.junit.Assert.assertNotNull(myInteger46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0" + "'", str27, "0");
        org.junit.Assert.assertNotNull(myInteger30);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        MyInteger myInteger4 = new MyInteger((int) (short) 0);
        boolean boolean6 = myInteger4.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = myInteger4.multiply(myInteger8);
        int int12 = myInteger8.getIntValue();
        MyInteger myInteger13 = myInteger1.multiply(myInteger8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(myInteger13);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        MyInteger myInteger1 = new MyInteger(1);
        MyInteger myInteger2 = null;
        // The following exception was thrown during execution in test generation
        try {
            MyInteger myInteger3 = myInteger1.add(myInteger2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
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
        int int49 = myInteger41.getIntValue();
        java.lang.String str50 = myInteger41.toString();
        java.lang.String str51 = myInteger41.toString();
        boolean boolean52 = myInteger10.equals((java.lang.Object) str51);
        java.lang.String str53 = myInteger10.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(myInteger35);
        org.junit.Assert.assertNotNull(myInteger36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(myInteger48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "0" + "'", str50, "0");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "0" + "'", str51, "0");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "0" + "'", str53, "0");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
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
        int int21 = myInteger20.getIntValue();
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger30 = myInteger23.multiply(myInteger27);
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        MyInteger myInteger33 = myInteger23.multiply(myInteger32);
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
        int int59 = myInteger58.getIntValue();
        boolean boolean60 = myInteger35.equals((java.lang.Object) myInteger58);
        MyInteger myInteger61 = myInteger32.multiply(myInteger35);
        MyInteger myInteger63 = new MyInteger((int) (short) 0);
        boolean boolean65 = myInteger63.equals((java.lang.Object) 1.0f);
        MyInteger myInteger67 = new MyInteger((int) (short) 0);
        boolean boolean69 = myInteger67.equals((java.lang.Object) 1.0f);
        MyInteger myInteger70 = myInteger63.multiply(myInteger67);
        MyInteger myInteger72 = new MyInteger((int) (short) 0);
        MyInteger myInteger73 = myInteger63.multiply(myInteger72);
        java.lang.String str74 = myInteger63.toString();
        MyInteger myInteger76 = new MyInteger((int) (short) 0);
        boolean boolean78 = myInteger76.equals((java.lang.Object) 1.0f);
        MyInteger myInteger80 = new MyInteger((int) (short) 0);
        boolean boolean82 = myInteger80.equals((java.lang.Object) 1.0f);
        MyInteger myInteger83 = myInteger76.multiply(myInteger80);
        int int84 = myInteger76.getIntValue();
        java.lang.String str85 = myInteger76.toString();
        boolean boolean87 = myInteger76.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger88 = myInteger63.multiply(myInteger76);
        MyInteger myInteger89 = myInteger32.add(myInteger76);
        boolean boolean90 = myInteger20.equals((java.lang.Object) myInteger76);
        java.lang.Class<?> wildcardClass91 = myInteger76.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(myInteger19);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(myInteger30);
        org.junit.Assert.assertNotNull(myInteger33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(myInteger46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(myInteger57);
        org.junit.Assert.assertNotNull(myInteger58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(myInteger61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(myInteger70);
        org.junit.Assert.assertNotNull(myInteger73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "0" + "'", str74, "0");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(myInteger83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "0" + "'", str85, "0");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(myInteger88);
        org.junit.Assert.assertNotNull(myInteger89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
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
        java.lang.Class<?> wildcardClass56 = myInteger55.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(myInteger37);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(myInteger50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(myInteger52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(myInteger55);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
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
        boolean boolean55 = myInteger52.equals((java.lang.Object) (byte) -1);
        boolean boolean57 = myInteger52.equals((java.lang.Object) 1);
        java.lang.String str58 = myInteger52.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(myInteger50);
        org.junit.Assert.assertNotNull(myInteger51);
        org.junit.Assert.assertNotNull(myInteger52);
        org.junit.Assert.assertNotNull(myInteger53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "0" + "'", str58, "0");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        int int3 = myInteger1.getIntValue();
        MyInteger myInteger5 = new MyInteger((int) (short) 10);
        MyInteger myInteger6 = myInteger1.multiply(myInteger5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(myInteger6);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        MyInteger myInteger3 = new MyInteger((int) (short) -1);
        java.lang.String str4 = myInteger3.toString();
        MyInteger myInteger5 = myInteger1.add(myInteger3);
        int int6 = myInteger1.getIntValue();
        java.lang.Object obj7 = null;
        boolean boolean8 = myInteger1.equals(obj7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNotNull(myInteger5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        MyInteger myInteger1 = new MyInteger((int) (byte) 1);
        MyInteger myInteger3 = new MyInteger((int) 'a');
        MyInteger myInteger4 = myInteger1.multiply(myInteger3);
        java.lang.Class<?> wildcardClass5 = myInteger1.getClass();
        org.junit.Assert.assertNotNull(myInteger4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
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
        MyInteger myInteger77 = new MyInteger((int) 'a');
        int int78 = myInteger77.getIntValue();
        int int79 = myInteger77.getIntValue();
        MyInteger myInteger81 = new MyInteger((int) (short) 0);
        boolean boolean83 = myInteger81.equals((java.lang.Object) 1.0f);
        MyInteger myInteger85 = new MyInteger((int) (short) 0);
        boolean boolean87 = myInteger85.equals((java.lang.Object) 1.0f);
        MyInteger myInteger88 = myInteger81.multiply(myInteger85);
        int int89 = myInteger81.getIntValue();
        java.lang.String str90 = myInteger81.toString();
        boolean boolean92 = myInteger81.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger93 = myInteger77.multiply(myInteger81);
        MyInteger myInteger94 = myInteger45.add(myInteger77);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertNotNull(myInteger31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(myInteger40);
        org.junit.Assert.assertNotNull(myInteger43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(myInteger45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(myInteger54);
        org.junit.Assert.assertNotNull(myInteger57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "0" + "'", str58, "0");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(myInteger67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "0" + "'", str69, "0");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(myInteger72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "0" + "'", str73, "0");
        org.junit.Assert.assertNotNull(myInteger74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 97 + "'", int78 == 97);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 97 + "'", int79 == 97);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(myInteger88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "0" + "'", str90, "0");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(myInteger93);
        org.junit.Assert.assertNotNull(myInteger94);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        MyInteger myInteger1 = new MyInteger(100);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
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
        int int25 = myInteger24.getIntValue();
        int int26 = myInteger24.getIntValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
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
        int int40 = myInteger12.getIntValue();
        java.lang.Object obj41 = null;
        boolean boolean42 = myInteger12.equals(obj41);
        boolean boolean44 = myInteger12.equals((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(myInteger34);
        org.junit.Assert.assertNotNull(myInteger35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0" + "'", str38, "0");
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
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
        java.lang.Class<?> wildcardClass34 = myInteger15.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1" + "'", str16, "-1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1" + "'", str17, "-1");
        org.junit.Assert.assertNotNull(myInteger18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(myInteger31);
        org.junit.Assert.assertNotNull(myInteger32);
        org.junit.Assert.assertNotNull(myInteger33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        MyInteger myInteger1 = new MyInteger(97);
        java.lang.Class<?> wildcardClass2 = myInteger1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(myInteger17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(myInteger28);
        org.junit.Assert.assertNotNull(myInteger29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(myInteger32);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(myInteger15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertNotNull(myInteger27);
        org.junit.Assert.assertNotNull(myInteger28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0" + "'", str29, "0");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(myInteger42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(myInteger53);
        org.junit.Assert.assertNotNull(myInteger54);
        org.junit.Assert.assertNotNull(myInteger55);
        org.junit.Assert.assertNotNull(myInteger56);
        org.junit.Assert.assertNotNull(myInteger57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(myInteger66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(myInteger78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "0" + "'", str80, "0");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "0" + "'", str81, "0");
        org.junit.Assert.assertNotNull(myInteger82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "0" + "'", str83, "0");
        org.junit.Assert.assertNotNull(myInteger84);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        int int4 = myInteger1.getIntValue();
        boolean boolean6 = myInteger1.equals((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass7 = myInteger1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertNotNull(myInteger16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "32" + "'", str17, "32");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
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
        java.lang.Class<?> wildcardClass34 = myInteger29.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertNotNull(myInteger27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-1" + "'", str30, "-1");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-1" + "'", str31, "-1");
        org.junit.Assert.assertNotNull(myInteger32);
        org.junit.Assert.assertNotNull(myInteger33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
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
        MyInteger myInteger68 = null;
        // The following exception was thrown during execution in test generation
        try {
            MyInteger myInteger69 = myInteger10.add(myInteger68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(myInteger35);
        org.junit.Assert.assertNotNull(myInteger36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(myInteger48);
        org.junit.Assert.assertNotNull(myInteger51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "0" + "'", str52, "0");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(myInteger61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "0" + "'", str63, "0");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(myInteger66);
        org.junit.Assert.assertNotNull(myInteger67);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        MyInteger myInteger1 = new MyInteger(0);
        java.lang.String str2 = myInteger1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
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
        java.lang.String str25 = myInteger5.toString();
        java.lang.String str26 = myInteger5.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0" + "'", str25, "0");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
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
        java.lang.String str25 = myInteger5.toString();
        java.lang.Class<?> wildcardClass26 = myInteger5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0" + "'", str25, "0");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(myInteger10);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0" + "'", str25, "0");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(myInteger28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0" + "'", str29, "0");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
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
        java.lang.Class<?> wildcardClass49 = myInteger43.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(myInteger32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "0" + "'", str34, "0");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0" + "'", str35, "0");
        org.junit.Assert.assertNotNull(myInteger36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(myInteger46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(myInteger10);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(myInteger16);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
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
        java.lang.String str58 = myInteger1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(myInteger15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertNotNull(myInteger27);
        org.junit.Assert.assertNotNull(myInteger28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0" + "'", str29, "0");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(myInteger42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(myInteger53);
        org.junit.Assert.assertNotNull(myInteger54);
        org.junit.Assert.assertNotNull(myInteger55);
        org.junit.Assert.assertNotNull(myInteger56);
        org.junit.Assert.assertNotNull(myInteger57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "1" + "'", str58, "1");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(myInteger34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(myInteger48);
        org.junit.Assert.assertNotNull(myInteger49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(myInteger62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(myInteger73);
        org.junit.Assert.assertNotNull(myInteger74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(myInteger86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(myInteger88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(myInteger91);
        org.junit.Assert.assertNotNull(myInteger92);
        org.junit.Assert.assertNotNull(myInteger95);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
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
        int int34 = myInteger15.getIntValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1" + "'", str16, "-1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1" + "'", str17, "-1");
        org.junit.Assert.assertNotNull(myInteger18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(myInteger31);
        org.junit.Assert.assertNotNull(myInteger32);
        org.junit.Assert.assertNotNull(myInteger33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
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
        java.lang.Class<?> wildcardClass39 = myInteger24.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(myInteger36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
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
        java.lang.Class<?> wildcardClass49 = myInteger10.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(myInteger32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "0" + "'", str34, "0");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0" + "'", str35, "0");
        org.junit.Assert.assertNotNull(myInteger36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(myInteger46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertNotNull(myInteger16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertNotNull(myInteger29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0" + "'", str41, "0");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(myInteger44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "0" + "'", str45, "0");
        org.junit.Assert.assertNotNull(myInteger46);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        MyInteger myInteger1 = new MyInteger((int) 'a');
        int int2 = myInteger1.getIntValue();
        int int3 = myInteger1.getIntValue();
        MyInteger myInteger4 = null;
        // The following exception was thrown during execution in test generation
        try {
            MyInteger myInteger5 = myInteger1.multiply(myInteger4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
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
        boolean boolean24 = myInteger19.equals((java.lang.Object) (byte) -1);
        int int25 = myInteger19.getIntValue();
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = myInteger27.multiply(myInteger31);
        int int35 = myInteger27.getIntValue();
        java.lang.String str36 = myInteger27.toString();
        java.lang.String str37 = myInteger27.toString();
        MyInteger myInteger38 = myInteger19.add(myInteger27);
        MyInteger myInteger40 = new MyInteger((int) (short) 0);
        boolean boolean42 = myInteger40.equals((java.lang.Object) 1.0f);
        int int43 = myInteger40.getIntValue();
        java.lang.String str44 = myInteger40.toString();
        MyInteger myInteger45 = myInteger19.add(myInteger40);
        MyInteger myInteger46 = myInteger9.multiply(myInteger45);
        java.lang.String str47 = myInteger45.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(myInteger22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(myInteger34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0" + "'", str36, "0");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0" + "'", str37, "0");
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "0" + "'", str44, "0");
        org.junit.Assert.assertNotNull(myInteger45);
        org.junit.Assert.assertNotNull(myInteger46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "0" + "'", str47, "0");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
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
        java.lang.Class<?> wildcardClass32 = myInteger27.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-1" + "'", str28, "-1");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-1" + "'", str29, "-1");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(myInteger31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        boolean boolean4 = myInteger1.equals((java.lang.Object) (-1));
        java.lang.String str5 = myInteger1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
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
        MyInteger myInteger33 = null;
        // The following exception was thrown during execution in test generation
        try {
            MyInteger myInteger34 = myInteger14.multiply(myInteger33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0" + "'", str27, "0");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(myInteger30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "97" + "'", str32, "97");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        boolean boolean10 = myInteger5.equals((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass11 = myInteger5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
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
        int int42 = myInteger41.getIntValue();
        MyInteger myInteger44 = new MyInteger((int) (short) 0);
        boolean boolean46 = myInteger44.equals((java.lang.Object) 1.0f);
        MyInteger myInteger48 = new MyInteger((int) (short) 0);
        boolean boolean50 = myInteger48.equals((java.lang.Object) 1.0f);
        MyInteger myInteger52 = new MyInteger((int) (short) 0);
        boolean boolean54 = myInteger52.equals((java.lang.Object) 1.0f);
        MyInteger myInteger55 = myInteger48.multiply(myInteger52);
        MyInteger myInteger56 = myInteger44.add(myInteger52);
        MyInteger myInteger58 = new MyInteger((int) (short) 0);
        boolean boolean60 = myInteger58.equals((java.lang.Object) 1.0f);
        MyInteger myInteger62 = new MyInteger((int) (short) 0);
        boolean boolean64 = myInteger62.equals((java.lang.Object) 1.0f);
        MyInteger myInteger66 = new MyInteger((int) (short) 0);
        boolean boolean68 = myInteger66.equals((java.lang.Object) 1.0f);
        MyInteger myInteger69 = myInteger62.multiply(myInteger66);
        int int70 = myInteger62.getIntValue();
        int int71 = myInteger62.getIntValue();
        MyInteger myInteger73 = new MyInteger((int) (short) 0);
        boolean boolean75 = myInteger73.equals((java.lang.Object) 1.0f);
        MyInteger myInteger77 = new MyInteger((int) (short) 0);
        boolean boolean79 = myInteger77.equals((java.lang.Object) 1.0f);
        MyInteger myInteger80 = myInteger73.multiply(myInteger77);
        MyInteger myInteger81 = myInteger62.add(myInteger73);
        int int82 = myInteger81.getIntValue();
        boolean boolean83 = myInteger58.equals((java.lang.Object) myInteger81);
        int int84 = myInteger81.getIntValue();
        MyInteger myInteger86 = new MyInteger((int) (short) 0);
        boolean boolean88 = myInteger86.equals((java.lang.Object) 1.0f);
        MyInteger myInteger90 = new MyInteger((int) (short) 0);
        boolean boolean92 = myInteger90.equals((java.lang.Object) 1.0f);
        MyInteger myInteger93 = myInteger86.multiply(myInteger90);
        int int94 = myInteger90.getIntValue();
        MyInteger myInteger95 = myInteger81.multiply(myInteger90);
        boolean boolean97 = myInteger90.equals((java.lang.Object) "97");
        MyInteger myInteger98 = myInteger52.multiply(myInteger90);
        boolean boolean99 = myInteger41.equals((java.lang.Object) myInteger90);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(myInteger35);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(myInteger41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(myInteger55);
        org.junit.Assert.assertNotNull(myInteger56);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(myInteger69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(myInteger80);
        org.junit.Assert.assertNotNull(myInteger81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(myInteger93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertNotNull(myInteger95);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(myInteger98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
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
        int int55 = myInteger53.getIntValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(myInteger50);
        org.junit.Assert.assertNotNull(myInteger51);
        org.junit.Assert.assertNotNull(myInteger52);
        org.junit.Assert.assertNotNull(myInteger53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(myInteger41);
        org.junit.Assert.assertNotNull(myInteger42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(myInteger55);
        org.junit.Assert.assertNotNull(myInteger56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "-1" + "'", str59, "-1");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "-1" + "'", str60, "-1");
        org.junit.Assert.assertNotNull(myInteger61);
        org.junit.Assert.assertNotNull(myInteger62);
        org.junit.Assert.assertNotNull(myInteger63);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
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
        java.lang.Class<?> wildcardClass71 = myInteger47.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(myInteger37);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(myInteger50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(myInteger52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(myInteger55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(myInteger64);
        org.junit.Assert.assertNotNull(myInteger67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(myInteger69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
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
        int int28 = myInteger1.getIntValue();
        java.lang.Class<?> wildcardClass29 = myInteger1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0" + "'", str27, "0");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
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
        boolean boolean55 = myInteger52.equals((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass56 = myInteger52.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(myInteger50);
        org.junit.Assert.assertNotNull(myInteger51);
        org.junit.Assert.assertNotNull(myInteger52);
        org.junit.Assert.assertNotNull(myInteger53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
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
        MyInteger myInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            MyInteger myInteger27 = myInteger24.multiply(myInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertNotNull(myInteger25);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        int int2 = myInteger1.getIntValue();
        int int3 = myInteger1.getIntValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
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
        int int81 = myInteger78.getIntValue();
        MyInteger myInteger83 = new MyInteger((int) (short) 0);
        boolean boolean85 = myInteger83.equals((java.lang.Object) 1.0f);
        MyInteger myInteger87 = new MyInteger((int) (short) 0);
        boolean boolean89 = myInteger87.equals((java.lang.Object) 1.0f);
        MyInteger myInteger90 = myInteger83.multiply(myInteger87);
        int int91 = myInteger87.getIntValue();
        MyInteger myInteger92 = myInteger78.multiply(myInteger87);
        MyInteger myInteger93 = myInteger52.multiply(myInteger87);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(myInteger50);
        org.junit.Assert.assertNotNull(myInteger51);
        org.junit.Assert.assertNotNull(myInteger52);
        org.junit.Assert.assertNotNull(myInteger53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(myInteger66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(myInteger77);
        org.junit.Assert.assertNotNull(myInteger78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(myInteger90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertNotNull(myInteger92);
        org.junit.Assert.assertNotNull(myInteger93);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
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
        MyInteger myInteger34 = null;
        // The following exception was thrown during execution in test generation
        try {
            MyInteger myInteger35 = myInteger33.multiply(myInteger34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1" + "'", str16, "-1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1" + "'", str17, "-1");
        org.junit.Assert.assertNotNull(myInteger18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(myInteger31);
        org.junit.Assert.assertNotNull(myInteger32);
        org.junit.Assert.assertNotNull(myInteger33);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
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
        java.lang.String str25 = myInteger1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(myInteger21);
        org.junit.Assert.assertNotNull(myInteger22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0" + "'", str25, "0");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(myInteger6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(myInteger19);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(myInteger24);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
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
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = myInteger18.multiply(myInteger22);
        int int26 = myInteger18.getIntValue();
        int int27 = myInteger18.getIntValue();
        MyInteger myInteger29 = new MyInteger((int) (short) 0);
        boolean boolean31 = myInteger29.equals((java.lang.Object) 1.0f);
        MyInteger myInteger33 = new MyInteger((int) (short) 0);
        boolean boolean35 = myInteger33.equals((java.lang.Object) 1.0f);
        MyInteger myInteger36 = myInteger29.multiply(myInteger33);
        MyInteger myInteger37 = myInteger18.add(myInteger29);
        MyInteger myInteger38 = myInteger14.multiply(myInteger37);
        java.lang.String str39 = myInteger37.toString();
        MyInteger myInteger40 = myInteger1.multiply(myInteger37);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(myInteger36);
        org.junit.Assert.assertNotNull(myInteger37);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "0" + "'", str39, "0");
        org.junit.Assert.assertNotNull(myInteger40);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
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
        java.lang.String str74 = myInteger73.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(myInteger15);
        org.junit.Assert.assertNotNull(myInteger16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(myInteger29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(myInteger40);
        org.junit.Assert.assertNotNull(myInteger41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(myInteger53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(myInteger55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(myInteger58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(myInteger67);
        org.junit.Assert.assertNotNull(myInteger70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(myInteger72);
        org.junit.Assert.assertNotNull(myInteger73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "0" + "'", str74, "0");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        boolean boolean4 = myInteger1.equals((java.lang.Object) (-1));
        int int5 = myInteger1.getIntValue();
        java.lang.String str6 = myInteger1.toString();
        java.lang.Class<?> wildcardClass7 = myInteger1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(myInteger35);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(myInteger41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(myInteger45);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
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
        java.lang.Class<?> wildcardClass45 = myInteger41.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(myInteger35);
        org.junit.Assert.assertNotNull(myInteger36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
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
        java.lang.Class<?> wildcardClass40 = myInteger13.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(myInteger35);
        org.junit.Assert.assertNotNull(myInteger36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
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
        java.lang.Class<?> wildcardClass29 = myInteger24.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        MyInteger myInteger1 = new MyInteger(32);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger10 = myInteger3.multiply(myInteger7);
        int int11 = myInteger3.getIntValue();
        java.lang.String str12 = myInteger3.toString();
        boolean boolean14 = myInteger3.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger16 = new MyInteger((int) 'a');
        int int17 = myInteger16.getIntValue();
        int int18 = myInteger16.getIntValue();
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger24 = new MyInteger((int) (short) 0);
        boolean boolean26 = myInteger24.equals((java.lang.Object) 1.0f);
        MyInteger myInteger27 = myInteger20.multiply(myInteger24);
        int int28 = myInteger20.getIntValue();
        java.lang.String str29 = myInteger20.toString();
        boolean boolean31 = myInteger20.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger32 = myInteger16.multiply(myInteger20);
        boolean boolean33 = myInteger3.equals((java.lang.Object) myInteger16);
        MyInteger myInteger34 = myInteger1.multiply(myInteger16);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(myInteger10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(myInteger27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0" + "'", str29, "0");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(myInteger32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(myInteger34);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
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
        java.lang.Class<?> wildcardClass32 = myInteger14.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0" + "'", str27, "0");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(myInteger30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
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
        MyInteger myInteger65 = new MyInteger((int) (short) 0);
        boolean boolean67 = myInteger65.equals((java.lang.Object) 1.0f);
        MyInteger myInteger68 = myInteger61.multiply(myInteger65);
        int int69 = myInteger61.getIntValue();
        int int70 = myInteger61.getIntValue();
        MyInteger myInteger72 = new MyInteger((int) (short) 0);
        boolean boolean74 = myInteger72.equals((java.lang.Object) 1.0f);
        MyInteger myInteger76 = new MyInteger((int) (short) 0);
        boolean boolean78 = myInteger76.equals((java.lang.Object) 1.0f);
        MyInteger myInteger79 = myInteger72.multiply(myInteger76);
        MyInteger myInteger80 = myInteger61.add(myInteger72);
        int int81 = myInteger80.getIntValue();
        boolean boolean82 = myInteger57.equals((java.lang.Object) myInteger80);
        int int83 = myInteger80.getIntValue();
        MyInteger myInteger85 = new MyInteger((int) (short) 0);
        boolean boolean87 = myInteger85.equals((java.lang.Object) 1.0f);
        MyInteger myInteger89 = new MyInteger((int) (short) 0);
        boolean boolean91 = myInteger89.equals((java.lang.Object) 1.0f);
        MyInteger myInteger92 = myInteger85.multiply(myInteger89);
        int int93 = myInteger89.getIntValue();
        MyInteger myInteger94 = myInteger80.multiply(myInteger89);
        java.lang.String str95 = myInteger89.toString();
        MyInteger myInteger96 = myInteger55.multiply(myInteger89);
        int int97 = myInteger96.getIntValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(myInteger37);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(myInteger50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(myInteger52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(myInteger55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(myInteger68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(myInteger79);
        org.junit.Assert.assertNotNull(myInteger80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(myInteger92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertNotNull(myInteger94);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "0" + "'", str95, "0");
        org.junit.Assert.assertNotNull(myInteger96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
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
        java.lang.Class<?> wildcardClass40 = myInteger10.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(myInteger35);
        org.junit.Assert.assertNotNull(myInteger36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "35" + "'", str17, "35");
        org.junit.Assert.assertNotNull(myInteger18);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
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
        java.lang.String str68 = myInteger47.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertNotNull(myInteger31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(myInteger40);
        org.junit.Assert.assertNotNull(myInteger43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(myInteger45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(myInteger54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(myInteger65);
        org.junit.Assert.assertNotNull(myInteger66);
        org.junit.Assert.assertNotNull(myInteger67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "0" + "'", str68, "0");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
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
        int int21 = myInteger20.getIntValue();
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger30 = myInteger23.multiply(myInteger27);
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        MyInteger myInteger33 = myInteger23.multiply(myInteger32);
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
        int int59 = myInteger58.getIntValue();
        boolean boolean60 = myInteger35.equals((java.lang.Object) myInteger58);
        MyInteger myInteger61 = myInteger32.multiply(myInteger35);
        MyInteger myInteger63 = new MyInteger((int) (short) 0);
        boolean boolean65 = myInteger63.equals((java.lang.Object) 1.0f);
        MyInteger myInteger67 = new MyInteger((int) (short) 0);
        boolean boolean69 = myInteger67.equals((java.lang.Object) 1.0f);
        MyInteger myInteger70 = myInteger63.multiply(myInteger67);
        MyInteger myInteger72 = new MyInteger((int) (short) 0);
        MyInteger myInteger73 = myInteger63.multiply(myInteger72);
        java.lang.String str74 = myInteger63.toString();
        MyInteger myInteger76 = new MyInteger((int) (short) 0);
        boolean boolean78 = myInteger76.equals((java.lang.Object) 1.0f);
        MyInteger myInteger80 = new MyInteger((int) (short) 0);
        boolean boolean82 = myInteger80.equals((java.lang.Object) 1.0f);
        MyInteger myInteger83 = myInteger76.multiply(myInteger80);
        int int84 = myInteger76.getIntValue();
        java.lang.String str85 = myInteger76.toString();
        boolean boolean87 = myInteger76.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger88 = myInteger63.multiply(myInteger76);
        MyInteger myInteger89 = myInteger32.add(myInteger76);
        boolean boolean90 = myInteger20.equals((java.lang.Object) myInteger76);
        MyInteger myInteger92 = new MyInteger((int) (byte) 10);
        int int93 = myInteger92.getIntValue();
        java.lang.String str94 = myInteger92.toString();
        MyInteger myInteger95 = myInteger20.multiply(myInteger92);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(myInteger19);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(myInteger30);
        org.junit.Assert.assertNotNull(myInteger33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(myInteger46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(myInteger57);
        org.junit.Assert.assertNotNull(myInteger58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(myInteger61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(myInteger70);
        org.junit.Assert.assertNotNull(myInteger73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "0" + "'", str74, "0");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(myInteger83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "0" + "'", str85, "0");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(myInteger88);
        org.junit.Assert.assertNotNull(myInteger89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 10 + "'", int93 == 10);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "10" + "'", str94, "10");
        org.junit.Assert.assertNotNull(myInteger95);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        MyInteger myInteger1 = new MyInteger((int) (byte) 1);
        MyInteger myInteger3 = new MyInteger((int) (short) -1);
        java.lang.String str4 = myInteger3.toString();
        int int5 = myInteger3.getIntValue();
        boolean boolean6 = myInteger1.equals((java.lang.Object) myInteger3);
        int int7 = myInteger3.getIntValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(myInteger34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(myInteger39);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        MyInteger myInteger11 = myInteger1.multiply(myInteger10);
        boolean boolean13 = myInteger1.equals((java.lang.Object) '4');
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
        java.lang.String str40 = myInteger39.toString();
        MyInteger myInteger42 = new MyInteger((int) (short) 0);
        boolean boolean44 = myInteger42.equals((java.lang.Object) 1.0f);
        MyInteger myInteger46 = new MyInteger((int) (short) 0);
        boolean boolean48 = myInteger46.equals((java.lang.Object) 1.0f);
        MyInteger myInteger49 = myInteger42.multiply(myInteger46);
        MyInteger myInteger51 = new MyInteger((int) (short) 0);
        MyInteger myInteger52 = myInteger42.multiply(myInteger51);
        boolean boolean54 = myInteger42.equals((java.lang.Object) '4');
        MyInteger myInteger55 = myInteger39.multiply(myInteger42);
        java.lang.String str56 = myInteger39.toString();
        MyInteger myInteger57 = myInteger1.add(myInteger39);
        java.lang.String str58 = myInteger57.toString();
        java.lang.String str59 = myInteger57.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(myInteger37);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0" + "'", str40, "0");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(myInteger49);
        org.junit.Assert.assertNotNull(myInteger52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(myInteger55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "0" + "'", str56, "0");
        org.junit.Assert.assertNotNull(myInteger57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "0" + "'", str58, "0");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "0" + "'", str59, "0");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
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
        MyInteger myInteger35 = myInteger28.multiply(myInteger32);
        MyInteger myInteger37 = new MyInteger((int) (short) 0);
        MyInteger myInteger38 = myInteger28.multiply(myInteger37);
        MyInteger myInteger40 = new MyInteger((int) (short) 0);
        boolean boolean42 = myInteger40.equals((java.lang.Object) 1.0f);
        MyInteger myInteger44 = new MyInteger((int) (short) 0);
        boolean boolean46 = myInteger44.equals((java.lang.Object) 1.0f);
        MyInteger myInteger47 = myInteger40.multiply(myInteger44);
        boolean boolean49 = myInteger44.equals((java.lang.Object) (byte) -1);
        int int50 = myInteger44.getIntValue();
        MyInteger myInteger52 = new MyInteger((int) (short) 0);
        boolean boolean54 = myInteger52.equals((java.lang.Object) 1.0f);
        MyInteger myInteger56 = new MyInteger((int) (short) 0);
        boolean boolean58 = myInteger56.equals((java.lang.Object) 1.0f);
        MyInteger myInteger59 = myInteger52.multiply(myInteger56);
        int int60 = myInteger52.getIntValue();
        java.lang.String str61 = myInteger52.toString();
        java.lang.String str62 = myInteger52.toString();
        MyInteger myInteger63 = myInteger44.add(myInteger52);
        int int64 = myInteger52.getIntValue();
        MyInteger myInteger66 = new MyInteger((int) (short) 0);
        boolean boolean68 = myInteger66.equals((java.lang.Object) 1.0f);
        MyInteger myInteger70 = new MyInteger((int) (short) 0);
        boolean boolean72 = myInteger70.equals((java.lang.Object) 1.0f);
        MyInteger myInteger73 = myInteger66.multiply(myInteger70);
        boolean boolean74 = myInteger52.equals((java.lang.Object) myInteger70);
        boolean boolean75 = myInteger37.equals((java.lang.Object) myInteger70);
        MyInteger myInteger76 = myInteger1.multiply(myInteger70);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(myInteger35);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(myInteger47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(myInteger59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "0" + "'", str61, "0");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "0" + "'", str62, "0");
        org.junit.Assert.assertNotNull(myInteger63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(myInteger73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(myInteger76);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
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
        int int28 = myInteger1.getIntValue();
        java.lang.String str29 = myInteger1.toString();
        java.lang.Class<?> wildcardClass30 = myInteger1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0" + "'", str27, "0");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0" + "'", str29, "0");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(myInteger35);
        org.junit.Assert.assertNotNull(myInteger36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(myInteger50);
        org.junit.Assert.assertNotNull(myInteger53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(myInteger66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(myInteger77);
        org.junit.Assert.assertNotNull(myInteger78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(myInteger81);
        org.junit.Assert.assertNotNull(myInteger82);
        org.junit.Assert.assertNotNull(myInteger83);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
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
        int int27 = myInteger25.getIntValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
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
        java.lang.String str35 = myInteger29.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertNotNull(myInteger27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-1" + "'", str30, "-1");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-1" + "'", str31, "-1");
        org.junit.Assert.assertNotNull(myInteger32);
        org.junit.Assert.assertNotNull(myInteger33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-1" + "'", str35, "-1");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
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
        int int93 = myInteger31.getIntValue();
        java.lang.Class<?> wildcardClass94 = myInteger31.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(myInteger34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(myInteger48);
        org.junit.Assert.assertNotNull(myInteger49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(myInteger62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(myInteger73);
        org.junit.Assert.assertNotNull(myInteger74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(myInteger86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(myInteger88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(myInteger91);
        org.junit.Assert.assertNotNull(myInteger92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        boolean boolean5 = myInteger1.equals((java.lang.Object) (-1.0f));
        java.lang.String str6 = myInteger1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(myInteger16);
        org.junit.Assert.assertNotNull(myInteger19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(myInteger29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "0" + "'", str31, "0");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(myInteger34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(myInteger36);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
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
        java.lang.String str27 = myInteger24.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0" + "'", str27, "0");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
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
        int int40 = myInteger12.getIntValue();
        java.lang.Object obj41 = null;
        boolean boolean42 = myInteger12.equals(obj41);
        java.lang.Class<?> wildcardClass43 = myInteger12.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(myInteger34);
        org.junit.Assert.assertNotNull(myInteger35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0" + "'", str38, "0");
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "35" + "'", str12, "35");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.add(myInteger9);
        MyInteger myInteger15 = new MyInteger((int) (short) 100);
        MyInteger myInteger16 = myInteger1.multiply(myInteger15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertNotNull(myInteger16);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
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
        int int17 = myInteger1.getIntValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(myInteger14);
        org.junit.Assert.assertNotNull(myInteger15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        MyInteger myInteger1 = new MyInteger((int) 'a');
        java.lang.String str2 = myInteger1.toString();
        java.lang.String str3 = myInteger1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "97" + "'", str2, "97");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "97" + "'", str3, "97");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
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
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger23 = myInteger16.multiply(myInteger20);
        MyInteger myInteger24 = myInteger12.multiply(myInteger16);
        int int25 = myInteger12.getIntValue();
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
        MyInteger myInteger53 = myInteger12.multiply(myInteger27);
        boolean boolean54 = myInteger1.equals((java.lang.Object) myInteger53);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(myInteger49);
        org.junit.Assert.assertNotNull(myInteger50);
        org.junit.Assert.assertNotNull(myInteger51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "0" + "'", str52, "0");
        org.junit.Assert.assertNotNull(myInteger53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
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
        java.lang.Class<?> wildcardClass43 = myInteger1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(myInteger27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertNotNull(myInteger40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0" + "'", str41, "0");
        org.junit.Assert.assertNotNull(myInteger42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        int int4 = myInteger1.getIntValue();
        java.lang.String str5 = myInteger1.toString();
        java.lang.Class<?> wildcardClass6 = myInteger1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
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
        int int34 = myInteger1.getIntValue();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertNotNull(myInteger16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0" + "'", str28, "0");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(myInteger31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
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
        java.lang.String str25 = myInteger5.toString();
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = myInteger27.multiply(myInteger31);
        MyInteger myInteger36 = new MyInteger((int) (short) 0);
        MyInteger myInteger37 = myInteger27.multiply(myInteger36);
        boolean boolean38 = myInteger5.equals((java.lang.Object) myInteger36);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0" + "'", str25, "0");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(myInteger34);
        org.junit.Assert.assertNotNull(myInteger37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
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
        java.lang.Class<?> wildcardClass36 = myInteger13.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(myInteger34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.multiply(myInteger5);
        int int14 = myInteger13.getIntValue();
        MyInteger myInteger16 = new MyInteger((int) (short) 0);
        boolean boolean18 = myInteger16.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger24 = new MyInteger((int) (short) 0);
        boolean boolean26 = myInteger24.equals((java.lang.Object) 1.0f);
        MyInteger myInteger27 = myInteger20.multiply(myInteger24);
        MyInteger myInteger28 = myInteger16.add(myInteger24);
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
        boolean boolean69 = myInteger62.equals((java.lang.Object) "97");
        MyInteger myInteger70 = myInteger24.multiply(myInteger62);
        MyInteger myInteger72 = new MyInteger((int) (short) 0);
        boolean boolean74 = myInteger72.equals((java.lang.Object) 1.0f);
        MyInteger myInteger76 = new MyInteger((int) (short) 0);
        boolean boolean78 = myInteger76.equals((java.lang.Object) 1.0f);
        MyInteger myInteger79 = myInteger72.multiply(myInteger76);
        MyInteger myInteger81 = new MyInteger((int) (short) 0);
        MyInteger myInteger82 = myInteger72.multiply(myInteger81);
        int int83 = myInteger72.getIntValue();
        MyInteger myInteger84 = myInteger62.add(myInteger72);
        int int85 = myInteger72.getIntValue();
        int int86 = myInteger72.getIntValue();
        boolean boolean87 = myInteger13.equals((java.lang.Object) myInteger72);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(myInteger27);
        org.junit.Assert.assertNotNull(myInteger28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(myInteger41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(myInteger52);
        org.junit.Assert.assertNotNull(myInteger53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(myInteger65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(myInteger67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(myInteger70);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(myInteger79);
        org.junit.Assert.assertNotNull(myInteger82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(myInteger84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        MyInteger myInteger1 = new MyInteger(35);
        java.lang.String str2 = myInteger1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "35" + "'", str2, "35");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        MyInteger myInteger1 = new MyInteger((int) '#');
        int int2 = myInteger1.getIntValue();
        java.lang.Class<?> wildcardClass3 = myInteger1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
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
        java.lang.Object obj70 = new java.lang.Object();
        boolean boolean71 = myInteger47.equals(obj70);
        java.lang.Class<?> wildcardClass72 = obj70.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(myInteger37);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(myInteger50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(myInteger52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(myInteger55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(myInteger64);
        org.junit.Assert.assertNotNull(myInteger67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(myInteger69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        MyInteger myInteger1 = new MyInteger((int) (byte) 1);
        int int2 = myInteger1.getIntValue();
        java.lang.String str3 = myInteger1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
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
        java.lang.String str76 = myInteger45.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertNotNull(myInteger31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(myInteger40);
        org.junit.Assert.assertNotNull(myInteger43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(myInteger45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(myInteger54);
        org.junit.Assert.assertNotNull(myInteger57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "0" + "'", str58, "0");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(myInteger67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "0" + "'", str69, "0");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(myInteger72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "0" + "'", str73, "0");
        org.junit.Assert.assertNotNull(myInteger74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "0" + "'", str76, "0");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
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
        int int27 = myInteger14.getIntValue();
        MyInteger myInteger29 = new MyInteger((int) (short) 0);
        boolean boolean31 = myInteger29.equals((java.lang.Object) 1.0f);
        MyInteger myInteger33 = new MyInteger((int) (short) 0);
        boolean boolean35 = myInteger33.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = new MyInteger((int) (short) 0);
        boolean boolean39 = myInteger37.equals((java.lang.Object) 1.0f);
        MyInteger myInteger40 = myInteger33.multiply(myInteger37);
        MyInteger myInteger41 = myInteger29.add(myInteger37);
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
        int int69 = myInteger66.getIntValue();
        MyInteger myInteger71 = new MyInteger((int) (short) 0);
        boolean boolean73 = myInteger71.equals((java.lang.Object) 1.0f);
        MyInteger myInteger75 = new MyInteger((int) (short) 0);
        boolean boolean77 = myInteger75.equals((java.lang.Object) 1.0f);
        MyInteger myInteger78 = myInteger71.multiply(myInteger75);
        int int79 = myInteger75.getIntValue();
        MyInteger myInteger80 = myInteger66.multiply(myInteger75);
        boolean boolean82 = myInteger75.equals((java.lang.Object) "97");
        MyInteger myInteger83 = myInteger37.multiply(myInteger75);
        MyInteger myInteger85 = new MyInteger((int) (short) 0);
        boolean boolean87 = myInteger85.equals((java.lang.Object) 1.0f);
        MyInteger myInteger89 = new MyInteger((int) (short) 0);
        boolean boolean91 = myInteger89.equals((java.lang.Object) 1.0f);
        MyInteger myInteger92 = myInteger85.multiply(myInteger89);
        MyInteger myInteger94 = new MyInteger((int) (short) 0);
        MyInteger myInteger95 = myInteger85.multiply(myInteger94);
        int int96 = myInteger85.getIntValue();
        MyInteger myInteger97 = myInteger75.add(myInteger85);
        java.lang.String str98 = myInteger85.toString();
        MyInteger myInteger99 = myInteger14.multiply(myInteger85);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(myInteger21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(myInteger40);
        org.junit.Assert.assertNotNull(myInteger41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(myInteger54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(myInteger65);
        org.junit.Assert.assertNotNull(myInteger66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(myInteger78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(myInteger80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(myInteger83);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(myInteger92);
        org.junit.Assert.assertNotNull(myInteger95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNotNull(myInteger97);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "0" + "'", str98, "0");
        org.junit.Assert.assertNotNull(myInteger99);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        java.lang.String str3 = myInteger1.toString();
        int int4 = myInteger1.getIntValue();
        int int5 = myInteger1.getIntValue();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
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
        int int58 = myInteger1.getIntValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(myInteger14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(myInteger40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(myInteger53);
        org.junit.Assert.assertNotNull(myInteger54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(myInteger56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        int int2 = myInteger1.getIntValue();
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
        int int28 = myInteger27.getIntValue();
        boolean boolean29 = myInteger4.equals((java.lang.Object) myInteger27);
        boolean boolean30 = myInteger1.equals((java.lang.Object) myInteger27);
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        boolean boolean34 = myInteger32.equals((java.lang.Object) 1.0f);
        MyInteger myInteger36 = new MyInteger((int) (short) 0);
        boolean boolean38 = myInteger36.equals((java.lang.Object) 1.0f);
        MyInteger myInteger40 = new MyInteger((int) (short) 0);
        boolean boolean42 = myInteger40.equals((java.lang.Object) 1.0f);
        MyInteger myInteger43 = myInteger36.multiply(myInteger40);
        MyInteger myInteger44 = myInteger32.add(myInteger40);
        MyInteger myInteger46 = new MyInteger((int) (short) 0);
        boolean boolean48 = myInteger46.equals((java.lang.Object) 1.0f);
        MyInteger myInteger50 = new MyInteger((int) (short) 0);
        boolean boolean52 = myInteger50.equals((java.lang.Object) 1.0f);
        MyInteger myInteger53 = myInteger46.multiply(myInteger50);
        boolean boolean55 = myInteger50.equals((java.lang.Object) (byte) -1);
        int int56 = myInteger50.getIntValue();
        MyInteger myInteger58 = new MyInteger((int) (short) 0);
        boolean boolean60 = myInteger58.equals((java.lang.Object) 1.0f);
        MyInteger myInteger62 = new MyInteger((int) (short) 0);
        boolean boolean64 = myInteger62.equals((java.lang.Object) 1.0f);
        MyInteger myInteger65 = myInteger58.multiply(myInteger62);
        int int66 = myInteger58.getIntValue();
        java.lang.String str67 = myInteger58.toString();
        java.lang.String str68 = myInteger58.toString();
        MyInteger myInteger69 = myInteger50.add(myInteger58);
        MyInteger myInteger71 = new MyInteger((int) (short) 0);
        boolean boolean73 = myInteger71.equals((java.lang.Object) 1.0f);
        int int74 = myInteger71.getIntValue();
        java.lang.String str75 = myInteger71.toString();
        MyInteger myInteger76 = myInteger50.add(myInteger71);
        MyInteger myInteger77 = myInteger40.multiply(myInteger76);
        MyInteger myInteger78 = myInteger1.add(myInteger40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(myInteger15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertNotNull(myInteger27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(myInteger43);
        org.junit.Assert.assertNotNull(myInteger44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(myInteger53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(myInteger65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "0" + "'", str67, "0");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "0" + "'", str68, "0");
        org.junit.Assert.assertNotNull(myInteger69);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "0" + "'", str75, "0");
        org.junit.Assert.assertNotNull(myInteger76);
        org.junit.Assert.assertNotNull(myInteger77);
        org.junit.Assert.assertNotNull(myInteger78);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
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
        java.lang.String str27 = myInteger26.toString();
        int int28 = myInteger26.getIntValue();
        int int29 = myInteger26.getIntValue();
        java.lang.Class<?> wildcardClass30 = myInteger26.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(myInteger21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0" + "'", str27, "0");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
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
        boolean boolean37 = myInteger32.equals((java.lang.Object) (byte) -1);
        int int38 = myInteger32.getIntValue();
        MyInteger myInteger40 = new MyInteger((int) (short) 0);
        boolean boolean42 = myInteger40.equals((java.lang.Object) 1.0f);
        MyInteger myInteger44 = new MyInteger((int) (short) 0);
        boolean boolean46 = myInteger44.equals((java.lang.Object) 1.0f);
        MyInteger myInteger47 = myInteger40.multiply(myInteger44);
        int int48 = myInteger40.getIntValue();
        java.lang.String str49 = myInteger40.toString();
        java.lang.String str50 = myInteger40.toString();
        MyInteger myInteger51 = myInteger32.add(myInteger40);
        int int52 = myInteger40.getIntValue();
        MyInteger myInteger54 = new MyInteger((int) (short) 0);
        boolean boolean56 = myInteger54.equals((java.lang.Object) 1.0f);
        MyInteger myInteger58 = new MyInteger((int) (short) 0);
        boolean boolean60 = myInteger58.equals((java.lang.Object) 1.0f);
        MyInteger myInteger61 = myInteger54.multiply(myInteger58);
        boolean boolean62 = myInteger40.equals((java.lang.Object) myInteger58);
        MyInteger myInteger63 = myInteger25.multiply(myInteger40);
        java.lang.String str64 = myInteger25.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(myInteger35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(myInteger47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "0" + "'", str49, "0");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "0" + "'", str50, "0");
        org.junit.Assert.assertNotNull(myInteger51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(myInteger61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(myInteger63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "0" + "'", str64, "0");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
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
        java.lang.String str40 = myInteger12.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(myInteger34);
        org.junit.Assert.assertNotNull(myInteger35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0" + "'", str38, "0");
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0" + "'", str40, "0");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        MyInteger myInteger1 = new MyInteger((int) (byte) 100);
        java.lang.String str2 = myInteger1.toString();
        MyInteger myInteger4 = new MyInteger((-2));
        java.lang.String str5 = myInteger4.toString();
        boolean boolean6 = myInteger1.equals((java.lang.Object) myInteger4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-2" + "'", str5, "-2");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
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
        java.lang.Class<?> wildcardClass81 = myInteger79.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(myInteger36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(myInteger53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(myInteger64);
        org.junit.Assert.assertNotNull(myInteger65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(myInteger77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(myInteger79);
        org.junit.Assert.assertNotNull(myInteger80);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        int int9 = myInteger1.getIntValue();
        java.lang.String str10 = myInteger1.toString();
        java.lang.String str11 = myInteger1.toString();
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = myInteger13.multiply(myInteger17);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        MyInteger myInteger23 = myInteger13.multiply(myInteger22);
        int int24 = myInteger23.getIntValue();
        MyInteger myInteger26 = new MyInteger((int) (short) 0);
        boolean boolean28 = myInteger26.equals((java.lang.Object) 1.0f);
        MyInteger myInteger30 = new MyInteger((int) (short) 0);
        boolean boolean32 = myInteger30.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = myInteger30.multiply(myInteger34);
        MyInteger myInteger38 = myInteger26.multiply(myInteger30);
        int int39 = myInteger26.getIntValue();
        MyInteger myInteger41 = new MyInteger((int) (short) 0);
        boolean boolean43 = myInteger41.equals((java.lang.Object) 1.0f);
        MyInteger myInteger45 = new MyInteger((int) (short) 0);
        boolean boolean47 = myInteger45.equals((java.lang.Object) 1.0f);
        MyInteger myInteger49 = new MyInteger((int) (short) 0);
        boolean boolean51 = myInteger49.equals((java.lang.Object) 1.0f);
        MyInteger myInteger52 = myInteger45.multiply(myInteger49);
        int int53 = myInteger45.getIntValue();
        int int54 = myInteger45.getIntValue();
        MyInteger myInteger56 = new MyInteger((int) (short) 0);
        boolean boolean58 = myInteger56.equals((java.lang.Object) 1.0f);
        MyInteger myInteger60 = new MyInteger((int) (short) 0);
        boolean boolean62 = myInteger60.equals((java.lang.Object) 1.0f);
        MyInteger myInteger63 = myInteger56.multiply(myInteger60);
        MyInteger myInteger64 = myInteger45.add(myInteger56);
        MyInteger myInteger65 = myInteger41.multiply(myInteger64);
        java.lang.String str66 = myInteger41.toString();
        MyInteger myInteger67 = myInteger26.multiply(myInteger41);
        MyInteger myInteger68 = myInteger23.multiply(myInteger26);
        MyInteger myInteger69 = myInteger1.add(myInteger23);
        java.lang.String str70 = myInteger69.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(myInteger37);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(myInteger52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(myInteger63);
        org.junit.Assert.assertNotNull(myInteger64);
        org.junit.Assert.assertNotNull(myInteger65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "0" + "'", str66, "0");
        org.junit.Assert.assertNotNull(myInteger67);
        org.junit.Assert.assertNotNull(myInteger68);
        org.junit.Assert.assertNotNull(myInteger69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "0" + "'", str70, "0");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        java.lang.String str4 = myInteger1.toString();
        MyInteger myInteger6 = new MyInteger((-1));
        int int7 = myInteger6.getIntValue();
        int int8 = myInteger6.getIntValue();
        MyInteger myInteger9 = myInteger1.add(myInteger6);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(myInteger9);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        MyInteger myInteger7 = new MyInteger((int) (short) 0);
        boolean boolean9 = myInteger7.equals((java.lang.Object) 1.0f);
        MyInteger myInteger11 = new MyInteger((int) (short) 0);
        boolean boolean13 = myInteger11.equals((java.lang.Object) 1.0f);
        MyInteger myInteger14 = myInteger7.multiply(myInteger11);
        MyInteger myInteger15 = myInteger3.multiply(myInteger7);
        MyInteger myInteger17 = new MyInteger((int) (short) -1);
        boolean boolean18 = myInteger15.equals((java.lang.Object) myInteger17);
        boolean boolean19 = myInteger1.equals((java.lang.Object) myInteger17);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(myInteger14);
        org.junit.Assert.assertNotNull(myInteger15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
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
        java.lang.String str69 = myInteger10.toString();
        java.lang.Class<?> wildcardClass70 = myInteger10.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(myInteger35);
        org.junit.Assert.assertNotNull(myInteger36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(myInteger48);
        org.junit.Assert.assertNotNull(myInteger51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "0" + "'", str52, "0");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(myInteger61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "0" + "'", str63, "0");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(myInteger66);
        org.junit.Assert.assertNotNull(myInteger67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "0" + "'", str68, "0");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "0" + "'", str69, "0");
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
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
        java.lang.Class<?> wildcardClass27 = myInteger1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
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
        java.lang.Class<?> wildcardClass93 = myInteger91.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(myInteger34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(myInteger48);
        org.junit.Assert.assertNotNull(myInteger49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(myInteger62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(myInteger73);
        org.junit.Assert.assertNotNull(myInteger74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(myInteger86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(myInteger88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(myInteger91);
        org.junit.Assert.assertNotNull(myInteger92);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
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
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger38 = new MyInteger((int) (short) 0);
        boolean boolean40 = myInteger38.equals((java.lang.Object) 1.0f);
        MyInteger myInteger42 = new MyInteger((int) (short) 0);
        boolean boolean44 = myInteger42.equals((java.lang.Object) 1.0f);
        MyInteger myInteger45 = myInteger38.multiply(myInteger42);
        int int46 = myInteger38.getIntValue();
        int int47 = myInteger38.getIntValue();
        MyInteger myInteger49 = new MyInteger((int) (short) 0);
        boolean boolean51 = myInteger49.equals((java.lang.Object) 1.0f);
        MyInteger myInteger53 = new MyInteger((int) (short) 0);
        boolean boolean55 = myInteger53.equals((java.lang.Object) 1.0f);
        MyInteger myInteger56 = myInteger49.multiply(myInteger53);
        MyInteger myInteger57 = myInteger38.add(myInteger49);
        MyInteger myInteger58 = myInteger34.multiply(myInteger57);
        java.lang.String str59 = myInteger58.toString();
        MyInteger myInteger61 = new MyInteger((int) (short) 0);
        boolean boolean63 = myInteger61.equals((java.lang.Object) 1.0f);
        MyInteger myInteger65 = new MyInteger((int) (short) 0);
        boolean boolean67 = myInteger65.equals((java.lang.Object) 1.0f);
        MyInteger myInteger68 = myInteger61.multiply(myInteger65);
        boolean boolean70 = myInteger65.equals((java.lang.Object) (byte) -1);
        int int71 = myInteger65.getIntValue();
        MyInteger myInteger73 = new MyInteger((int) (short) 0);
        boolean boolean75 = myInteger73.equals((java.lang.Object) 1.0f);
        MyInteger myInteger77 = new MyInteger((int) (short) 0);
        boolean boolean79 = myInteger77.equals((java.lang.Object) 1.0f);
        MyInteger myInteger80 = myInteger73.multiply(myInteger77);
        int int81 = myInteger73.getIntValue();
        java.lang.String str82 = myInteger73.toString();
        java.lang.String str83 = myInteger73.toString();
        MyInteger myInteger84 = myInteger65.add(myInteger73);
        int int85 = myInteger73.getIntValue();
        MyInteger myInteger87 = new MyInteger((int) (short) 0);
        boolean boolean89 = myInteger87.equals((java.lang.Object) 1.0f);
        MyInteger myInteger91 = new MyInteger((int) (short) 0);
        boolean boolean93 = myInteger91.equals((java.lang.Object) 1.0f);
        MyInteger myInteger94 = myInteger87.multiply(myInteger91);
        boolean boolean95 = myInteger73.equals((java.lang.Object) myInteger91);
        MyInteger myInteger96 = myInteger58.multiply(myInteger73);
        MyInteger myInteger97 = myInteger1.add(myInteger58);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(myInteger14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0" + "'", str29, "0");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "0" + "'", str31, "0");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(myInteger45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(myInteger56);
        org.junit.Assert.assertNotNull(myInteger57);
        org.junit.Assert.assertNotNull(myInteger58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "0" + "'", str59, "0");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(myInteger68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(myInteger80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "0" + "'", str82, "0");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "0" + "'", str83, "0");
        org.junit.Assert.assertNotNull(myInteger84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(myInteger94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(myInteger96);
        org.junit.Assert.assertNotNull(myInteger97);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.multiply(myInteger5);
        MyInteger myInteger15 = new MyInteger((int) (short) -1);
        boolean boolean16 = myInteger13.equals((java.lang.Object) myInteger15);
        int int17 = myInteger15.getIntValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        MyInteger myInteger1 = new MyInteger((int) (byte) -1);
        java.lang.String str2 = myInteger1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
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
        int int21 = myInteger20.getIntValue();
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger30 = myInteger23.multiply(myInteger27);
        MyInteger myInteger32 = new MyInteger((int) (short) 0);
        MyInteger myInteger33 = myInteger23.multiply(myInteger32);
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
        int int59 = myInteger58.getIntValue();
        boolean boolean60 = myInteger35.equals((java.lang.Object) myInteger58);
        MyInteger myInteger61 = myInteger32.multiply(myInteger35);
        MyInteger myInteger63 = new MyInteger((int) (short) 0);
        boolean boolean65 = myInteger63.equals((java.lang.Object) 1.0f);
        MyInteger myInteger67 = new MyInteger((int) (short) 0);
        boolean boolean69 = myInteger67.equals((java.lang.Object) 1.0f);
        MyInteger myInteger70 = myInteger63.multiply(myInteger67);
        MyInteger myInteger72 = new MyInteger((int) (short) 0);
        MyInteger myInteger73 = myInteger63.multiply(myInteger72);
        java.lang.String str74 = myInteger63.toString();
        MyInteger myInteger76 = new MyInteger((int) (short) 0);
        boolean boolean78 = myInteger76.equals((java.lang.Object) 1.0f);
        MyInteger myInteger80 = new MyInteger((int) (short) 0);
        boolean boolean82 = myInteger80.equals((java.lang.Object) 1.0f);
        MyInteger myInteger83 = myInteger76.multiply(myInteger80);
        int int84 = myInteger76.getIntValue();
        java.lang.String str85 = myInteger76.toString();
        boolean boolean87 = myInteger76.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger88 = myInteger63.multiply(myInteger76);
        MyInteger myInteger89 = myInteger32.add(myInteger76);
        boolean boolean90 = myInteger20.equals((java.lang.Object) myInteger76);
        int int91 = myInteger20.getIntValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(myInteger19);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(myInteger30);
        org.junit.Assert.assertNotNull(myInteger33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(myInteger46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(myInteger57);
        org.junit.Assert.assertNotNull(myInteger58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(myInteger61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(myInteger70);
        org.junit.Assert.assertNotNull(myInteger73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "0" + "'", str74, "0");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(myInteger83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "0" + "'", str85, "0");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(myInteger88);
        org.junit.Assert.assertNotNull(myInteger89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertNotNull(myInteger31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(myInteger40);
        org.junit.Assert.assertNotNull(myInteger43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(myInteger45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(myInteger54);
        org.junit.Assert.assertNotNull(myInteger57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "0" + "'", str58, "0");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(myInteger67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "0" + "'", str69, "0");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(myInteger72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "0" + "'", str73, "0");
        org.junit.Assert.assertNotNull(myInteger74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(myInteger84);
        org.junit.Assert.assertNotNull(myInteger87);
        org.junit.Assert.assertNotNull(myInteger88);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "-1" + "'", str91, "-1");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "-1" + "'", str95, "-1");
        org.junit.Assert.assertNotNull(myInteger96);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
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
        java.lang.Class<?> wildcardClass41 = myInteger33.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(myInteger36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
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
        java.lang.String str56 = myInteger55.toString();
        java.lang.Class<?> wildcardClass57 = myInteger55.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(myInteger37);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(myInteger50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(myInteger52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(myInteger55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "0" + "'", str56, "0");
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
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
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger38 = new MyInteger((int) (short) 0);
        boolean boolean40 = myInteger38.equals((java.lang.Object) 1.0f);
        MyInteger myInteger42 = new MyInteger((int) (short) 0);
        boolean boolean44 = myInteger42.equals((java.lang.Object) 1.0f);
        MyInteger myInteger45 = myInteger38.multiply(myInteger42);
        int int46 = myInteger38.getIntValue();
        int int47 = myInteger38.getIntValue();
        MyInteger myInteger49 = new MyInteger((int) (short) 0);
        boolean boolean51 = myInteger49.equals((java.lang.Object) 1.0f);
        MyInteger myInteger53 = new MyInteger((int) (short) 0);
        boolean boolean55 = myInteger53.equals((java.lang.Object) 1.0f);
        MyInteger myInteger56 = myInteger49.multiply(myInteger53);
        MyInteger myInteger57 = myInteger38.add(myInteger49);
        int int58 = myInteger57.getIntValue();
        boolean boolean59 = myInteger34.equals((java.lang.Object) myInteger57);
        MyInteger myInteger60 = myInteger1.multiply(myInteger57);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertNotNull(myInteger16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0" + "'", str28, "0");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(myInteger31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(myInteger45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(myInteger56);
        org.junit.Assert.assertNotNull(myInteger57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(myInteger60);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        MyInteger myInteger11 = myInteger1.multiply(myInteger10);
        int int12 = myInteger11.getIntValue();
        MyInteger myInteger14 = new MyInteger((int) (short) 0);
        boolean boolean16 = myInteger14.equals((java.lang.Object) 1.0f);
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = myInteger18.multiply(myInteger22);
        MyInteger myInteger26 = myInteger14.multiply(myInteger18);
        int int27 = myInteger14.getIntValue();
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
        MyInteger myInteger55 = myInteger14.multiply(myInteger29);
        MyInteger myInteger56 = myInteger11.multiply(myInteger14);
        java.lang.String str57 = myInteger56.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(myInteger40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(myInteger51);
        org.junit.Assert.assertNotNull(myInteger52);
        org.junit.Assert.assertNotNull(myInteger53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "0" + "'", str54, "0");
        org.junit.Assert.assertNotNull(myInteger55);
        org.junit.Assert.assertNotNull(myInteger56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "0" + "'", str57, "0");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0" + "'", str27, "0");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(myInteger30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(myInteger44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(myInteger55);
        org.junit.Assert.assertNotNull(myInteger56);
        org.junit.Assert.assertNotNull(myInteger57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "0" + "'", str58, "0");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(myInteger71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(myInteger82);
        org.junit.Assert.assertNotNull(myInteger83);
        org.junit.Assert.assertNotNull(myInteger84);
        org.junit.Assert.assertNotNull(myInteger85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(myInteger90);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
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
        boolean boolean59 = myInteger1.equals((java.lang.Object) "-1");
        int int60 = myInteger1.getIntValue();
        MyInteger myInteger62 = new MyInteger((int) (short) 0);
        boolean boolean64 = myInteger62.equals((java.lang.Object) 1.0f);
        MyInteger myInteger66 = new MyInteger((int) (short) 0);
        boolean boolean68 = myInteger66.equals((java.lang.Object) 1.0f);
        MyInteger myInteger69 = myInteger62.multiply(myInteger66);
        MyInteger myInteger71 = new MyInteger((int) (short) 0);
        MyInteger myInteger72 = myInteger62.multiply(myInteger71);
        java.lang.String str73 = myInteger62.toString();
        MyInteger myInteger75 = new MyInteger((int) (short) 0);
        boolean boolean77 = myInteger75.equals((java.lang.Object) 1.0f);
        MyInteger myInteger79 = new MyInteger((int) (short) 0);
        boolean boolean81 = myInteger79.equals((java.lang.Object) 1.0f);
        MyInteger myInteger82 = myInteger75.multiply(myInteger79);
        int int83 = myInteger75.getIntValue();
        java.lang.String str84 = myInteger75.toString();
        boolean boolean86 = myInteger75.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger87 = myInteger62.multiply(myInteger75);
        java.lang.String str88 = myInteger87.toString();
        int int89 = myInteger87.getIntValue();
        int int90 = myInteger87.getIntValue();
        boolean boolean91 = myInteger1.equals((java.lang.Object) myInteger87);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(myInteger15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertNotNull(myInteger27);
        org.junit.Assert.assertNotNull(myInteger28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0" + "'", str29, "0");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(myInteger42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(myInteger53);
        org.junit.Assert.assertNotNull(myInteger54);
        org.junit.Assert.assertNotNull(myInteger55);
        org.junit.Assert.assertNotNull(myInteger56);
        org.junit.Assert.assertNotNull(myInteger57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(myInteger69);
        org.junit.Assert.assertNotNull(myInteger72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "0" + "'", str73, "0");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(myInteger82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "0" + "'", str84, "0");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(myInteger87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "0" + "'", str88, "0");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        MyInteger myInteger1 = new MyInteger((int) 'a');
        int int2 = myInteger1.getIntValue();
        java.lang.Class<?> wildcardClass3 = myInteger1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        boolean boolean10 = myInteger5.equals((java.lang.Object) (byte) -1);
        int int11 = myInteger5.getIntValue();
        int int12 = myInteger5.getIntValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0" + "'", str27, "0");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(myInteger30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "97" + "'", str32, "97");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1" + "'", str35, "1");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(myInteger48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(myInteger59);
        org.junit.Assert.assertNotNull(myInteger60);
        org.junit.Assert.assertNotNull(myInteger61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "0" + "'", str62, "0");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(myInteger75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(myInteger86);
        org.junit.Assert.assertNotNull(myInteger87);
        org.junit.Assert.assertNotNull(myInteger88);
        org.junit.Assert.assertNotNull(myInteger89);
        org.junit.Assert.assertNotNull(myInteger90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "1" + "'", str93, "1");
        org.junit.Assert.assertNotNull(myInteger94);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        int int2 = myInteger1.getIntValue();
        java.lang.String str3 = myInteger1.toString();
        int int4 = myInteger1.getIntValue();
        MyInteger myInteger6 = new MyInteger((int) (byte) 1);
        MyInteger myInteger8 = new MyInteger((int) 'a');
        MyInteger myInteger9 = myInteger6.multiply(myInteger8);
        MyInteger myInteger10 = myInteger1.add(myInteger6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(myInteger9);
        org.junit.Assert.assertNotNull(myInteger10);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
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
        int int21 = myInteger20.getIntValue();
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = myInteger27.multiply(myInteger31);
        MyInteger myInteger35 = myInteger23.multiply(myInteger27);
        MyInteger myInteger37 = new MyInteger((int) (short) -1);
        boolean boolean38 = myInteger35.equals((java.lang.Object) myInteger37);
        MyInteger myInteger39 = myInteger20.multiply(myInteger37);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(myInteger19);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(myInteger34);
        org.junit.Assert.assertNotNull(myInteger35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(myInteger39);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        MyInteger myInteger11 = myInteger1.multiply(myInteger10);
        boolean boolean13 = myInteger1.equals((java.lang.Object) '4');
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
        java.lang.String str40 = myInteger39.toString();
        MyInteger myInteger42 = new MyInteger((int) (short) 0);
        boolean boolean44 = myInteger42.equals((java.lang.Object) 1.0f);
        MyInteger myInteger46 = new MyInteger((int) (short) 0);
        boolean boolean48 = myInteger46.equals((java.lang.Object) 1.0f);
        MyInteger myInteger49 = myInteger42.multiply(myInteger46);
        MyInteger myInteger51 = new MyInteger((int) (short) 0);
        MyInteger myInteger52 = myInteger42.multiply(myInteger51);
        boolean boolean54 = myInteger42.equals((java.lang.Object) '4');
        MyInteger myInteger55 = myInteger39.multiply(myInteger42);
        java.lang.String str56 = myInteger39.toString();
        MyInteger myInteger57 = myInteger1.add(myInteger39);
        java.lang.Class<?> wildcardClass58 = myInteger1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(myInteger37);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0" + "'", str40, "0");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(myInteger49);
        org.junit.Assert.assertNotNull(myInteger52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(myInteger55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "0" + "'", str56, "0");
        org.junit.Assert.assertNotNull(myInteger57);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
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
        MyInteger myInteger53 = null;
        // The following exception was thrown during execution in test generation
        try {
            MyInteger myInteger54 = myInteger52.add(myInteger53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(myInteger32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "0" + "'", str34, "0");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0" + "'", str35, "0");
        org.junit.Assert.assertNotNull(myInteger36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(myInteger46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(myInteger52);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        MyInteger myInteger11 = myInteger1.multiply(myInteger10);
        int int12 = myInteger11.getIntValue();
        MyInteger myInteger14 = new MyInteger((int) (short) 0);
        boolean boolean16 = myInteger14.equals((java.lang.Object) 1.0f);
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        boolean boolean24 = myInteger22.equals((java.lang.Object) 1.0f);
        MyInteger myInteger25 = myInteger18.multiply(myInteger22);
        MyInteger myInteger26 = myInteger14.multiply(myInteger18);
        int int27 = myInteger14.getIntValue();
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
        MyInteger myInteger55 = myInteger14.multiply(myInteger29);
        MyInteger myInteger56 = myInteger11.multiply(myInteger14);
        int int57 = myInteger14.getIntValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(myInteger40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(myInteger51);
        org.junit.Assert.assertNotNull(myInteger52);
        org.junit.Assert.assertNotNull(myInteger53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "0" + "'", str54, "0");
        org.junit.Assert.assertNotNull(myInteger55);
        org.junit.Assert.assertNotNull(myInteger56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
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
        MyInteger myInteger53 = new MyInteger((int) (short) 0);
        MyInteger myInteger54 = myInteger44.multiply(myInteger53);
        java.lang.String str55 = myInteger44.toString();
        MyInteger myInteger57 = new MyInteger((int) (short) 0);
        boolean boolean59 = myInteger57.equals((java.lang.Object) 1.0f);
        MyInteger myInteger61 = new MyInteger((int) (short) 0);
        boolean boolean63 = myInteger61.equals((java.lang.Object) 1.0f);
        MyInteger myInteger64 = myInteger57.multiply(myInteger61);
        int int65 = myInteger57.getIntValue();
        java.lang.String str66 = myInteger57.toString();
        boolean boolean68 = myInteger57.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger69 = myInteger44.multiply(myInteger57);
        java.lang.String str70 = myInteger57.toString();
        java.lang.Class<?> wildcardClass71 = myInteger57.getClass();
        boolean boolean72 = myInteger1.equals((java.lang.Object) myInteger57);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(myInteger27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertNotNull(myInteger40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0" + "'", str41, "0");
        org.junit.Assert.assertNotNull(myInteger42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(myInteger51);
        org.junit.Assert.assertNotNull(myInteger54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "0" + "'", str55, "0");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(myInteger64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "0" + "'", str66, "0");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(myInteger69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "0" + "'", str70, "0");
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
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
        int int45 = myInteger13.getIntValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(myInteger35);
        org.junit.Assert.assertNotNull(myInteger36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
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
        int int27 = myInteger1.getIntValue();
        java.lang.Class<?> wildcardClass28 = myInteger1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        MyInteger myInteger11 = myInteger1.multiply(myInteger10);
        java.lang.String str12 = myInteger1.toString();
        java.lang.String str13 = myInteger1.toString();
        java.lang.Class<?> wildcardClass14 = myInteger1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
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
        int int40 = myInteger12.getIntValue();
        java.lang.String str41 = myInteger12.toString();
        java.lang.String str42 = myInteger12.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(myInteger34);
        org.junit.Assert.assertNotNull(myInteger35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0" + "'", str38, "0");
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0" + "'", str41, "0");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0" + "'", str42, "0");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        MyInteger myInteger1 = new MyInteger((int) 'a');
        int int2 = myInteger1.getIntValue();
        int int3 = myInteger1.getIntValue();
        java.lang.String str4 = myInteger1.toString();
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
        MyInteger myInteger30 = myInteger6.multiply(myInteger29);
        java.lang.String str31 = myInteger30.toString();
        MyInteger myInteger33 = new MyInteger((int) (short) 0);
        boolean boolean35 = myInteger33.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = new MyInteger((int) (short) 0);
        boolean boolean39 = myInteger37.equals((java.lang.Object) 1.0f);
        MyInteger myInteger40 = myInteger33.multiply(myInteger37);
        boolean boolean42 = myInteger37.equals((java.lang.Object) (byte) -1);
        int int43 = myInteger37.getIntValue();
        MyInteger myInteger45 = new MyInteger((int) (short) 0);
        boolean boolean47 = myInteger45.equals((java.lang.Object) 1.0f);
        MyInteger myInteger49 = new MyInteger((int) (short) 0);
        boolean boolean51 = myInteger49.equals((java.lang.Object) 1.0f);
        MyInteger myInteger52 = myInteger45.multiply(myInteger49);
        int int53 = myInteger45.getIntValue();
        java.lang.String str54 = myInteger45.toString();
        java.lang.String str55 = myInteger45.toString();
        MyInteger myInteger56 = myInteger37.add(myInteger45);
        int int57 = myInteger45.getIntValue();
        MyInteger myInteger59 = new MyInteger((int) (short) 0);
        boolean boolean61 = myInteger59.equals((java.lang.Object) 1.0f);
        MyInteger myInteger63 = new MyInteger((int) (short) 0);
        boolean boolean65 = myInteger63.equals((java.lang.Object) 1.0f);
        MyInteger myInteger66 = myInteger59.multiply(myInteger63);
        boolean boolean67 = myInteger45.equals((java.lang.Object) myInteger63);
        MyInteger myInteger68 = myInteger30.multiply(myInteger45);
        MyInteger myInteger69 = myInteger1.add(myInteger68);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "97" + "'", str4, "97");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(myInteger17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(myInteger28);
        org.junit.Assert.assertNotNull(myInteger29);
        org.junit.Assert.assertNotNull(myInteger30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "0" + "'", str31, "0");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(myInteger40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(myInteger52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "0" + "'", str54, "0");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "0" + "'", str55, "0");
        org.junit.Assert.assertNotNull(myInteger56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(myInteger66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(myInteger68);
        org.junit.Assert.assertNotNull(myInteger69);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
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
        java.lang.String str44 = myInteger1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(myInteger37);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0" + "'", str41, "0");
        org.junit.Assert.assertNotNull(myInteger42);
        org.junit.Assert.assertNotNull(myInteger43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "0" + "'", str44, "0");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
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
        MyInteger myInteger65 = new MyInteger((int) (short) 0);
        boolean boolean67 = myInteger65.equals((java.lang.Object) 1.0f);
        MyInteger myInteger68 = myInteger61.multiply(myInteger65);
        int int69 = myInteger61.getIntValue();
        int int70 = myInteger61.getIntValue();
        MyInteger myInteger72 = new MyInteger((int) (short) 0);
        boolean boolean74 = myInteger72.equals((java.lang.Object) 1.0f);
        MyInteger myInteger76 = new MyInteger((int) (short) 0);
        boolean boolean78 = myInteger76.equals((java.lang.Object) 1.0f);
        MyInteger myInteger79 = myInteger72.multiply(myInteger76);
        MyInteger myInteger80 = myInteger61.add(myInteger72);
        int int81 = myInteger80.getIntValue();
        boolean boolean82 = myInteger57.equals((java.lang.Object) myInteger80);
        int int83 = myInteger80.getIntValue();
        MyInteger myInteger85 = new MyInteger((int) (short) 0);
        boolean boolean87 = myInteger85.equals((java.lang.Object) 1.0f);
        MyInteger myInteger89 = new MyInteger((int) (short) 0);
        boolean boolean91 = myInteger89.equals((java.lang.Object) 1.0f);
        MyInteger myInteger92 = myInteger85.multiply(myInteger89);
        int int93 = myInteger89.getIntValue();
        MyInteger myInteger94 = myInteger80.multiply(myInteger89);
        java.lang.String str95 = myInteger89.toString();
        MyInteger myInteger96 = myInteger55.multiply(myInteger89);
        java.lang.String str97 = myInteger55.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(myInteger37);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(myInteger50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(myInteger52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(myInteger55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(myInteger68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(myInteger79);
        org.junit.Assert.assertNotNull(myInteger80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(myInteger92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertNotNull(myInteger94);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "0" + "'", str95, "0");
        org.junit.Assert.assertNotNull(myInteger96);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "0" + "'", str97, "0");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
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
        java.lang.String str42 = myInteger25.toString();
        MyInteger myInteger44 = new MyInteger((int) (short) 0);
        boolean boolean46 = myInteger44.equals((java.lang.Object) 1.0f);
        MyInteger myInteger48 = new MyInteger((int) (short) 0);
        boolean boolean50 = myInteger48.equals((java.lang.Object) 1.0f);
        MyInteger myInteger51 = myInteger44.multiply(myInteger48);
        MyInteger myInteger53 = new MyInteger((int) (short) 0);
        MyInteger myInteger54 = myInteger44.multiply(myInteger53);
        java.lang.String str55 = myInteger44.toString();
        MyInteger myInteger57 = new MyInteger((int) (short) 0);
        boolean boolean59 = myInteger57.equals((java.lang.Object) 1.0f);
        MyInteger myInteger61 = new MyInteger((int) (short) 0);
        boolean boolean63 = myInteger61.equals((java.lang.Object) 1.0f);
        MyInteger myInteger64 = myInteger57.multiply(myInteger61);
        int int65 = myInteger57.getIntValue();
        java.lang.String str66 = myInteger57.toString();
        boolean boolean68 = myInteger57.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger69 = myInteger44.multiply(myInteger57);
        java.lang.String str70 = myInteger69.toString();
        int int71 = myInteger69.getIntValue();
        int int72 = myInteger69.getIntValue();
        MyInteger myInteger73 = myInteger25.add(myInteger69);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(myInteger35);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(myInteger41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0" + "'", str42, "0");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(myInteger51);
        org.junit.Assert.assertNotNull(myInteger54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "0" + "'", str55, "0");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(myInteger64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "0" + "'", str66, "0");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(myInteger69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "0" + "'", str70, "0");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(myInteger73);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger15);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
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
        boolean boolean55 = myInteger52.equals((java.lang.Object) (byte) -1);
        java.lang.String str56 = myInteger52.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(myInteger50);
        org.junit.Assert.assertNotNull(myInteger51);
        org.junit.Assert.assertNotNull(myInteger52);
        org.junit.Assert.assertNotNull(myInteger53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "0" + "'", str56, "0");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
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
        boolean boolean55 = myInteger52.equals((java.lang.Object) (byte) -1);
        int int56 = myInteger52.getIntValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(myInteger50);
        org.junit.Assert.assertNotNull(myInteger51);
        org.junit.Assert.assertNotNull(myInteger52);
        org.junit.Assert.assertNotNull(myInteger53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
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
        int int43 = myInteger1.getIntValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(myInteger10);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(myInteger37);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(myInteger41);
        org.junit.Assert.assertNotNull(myInteger42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        java.lang.String str9 = myInteger1.toString();
        java.lang.String str10 = myInteger1.toString();
        java.lang.String str11 = myInteger1.toString();
        MyInteger myInteger13 = new MyInteger(1);
        java.lang.Object obj14 = null;
        boolean boolean15 = myInteger13.equals(obj14);
        int int16 = myInteger13.getIntValue();
        MyInteger myInteger17 = myInteger1.add(myInteger13);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(myInteger17);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        MyInteger myInteger1 = new MyInteger((-2));
        java.lang.String str2 = myInteger1.toString();
        java.lang.String str3 = myInteger1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-2" + "'", str2, "-2");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2" + "'", str3, "-2");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
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
        java.lang.String str21 = myInteger1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(myInteger19);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0" + "'", str21, "0");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        MyInteger myInteger1 = new MyInteger((int) (short) 100);
        MyInteger myInteger3 = new MyInteger((int) (short) 0);
        boolean boolean5 = myInteger3.equals((java.lang.Object) 1.0f);
        boolean boolean6 = myInteger1.equals((java.lang.Object) 1.0f);
        int int7 = myInteger1.getIntValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
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
        int int27 = myInteger14.getIntValue();
        java.lang.Class<?> wildcardClass28 = myInteger14.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(myInteger21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
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
        int int86 = myInteger1.getIntValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(myInteger10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(myInteger40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(myInteger51);
        org.junit.Assert.assertNotNull(myInteger52);
        org.junit.Assert.assertNotNull(myInteger53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "0" + "'", str54, "0");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(myInteger67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(myInteger78);
        org.junit.Assert.assertNotNull(myInteger79);
        org.junit.Assert.assertNotNull(myInteger80);
        org.junit.Assert.assertNotNull(myInteger81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(myInteger84);
        org.junit.Assert.assertNotNull(myInteger85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 10 + "'", int86 == 10);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
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
        java.lang.String str36 = myInteger31.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(myInteger34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0" + "'", str36, "0");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
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
        java.lang.Class<?> wildcardClass86 = myInteger1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(myInteger10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(myInteger40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(myInteger51);
        org.junit.Assert.assertNotNull(myInteger52);
        org.junit.Assert.assertNotNull(myInteger53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "0" + "'", str54, "0");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(myInteger67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(myInteger78);
        org.junit.Assert.assertNotNull(myInteger79);
        org.junit.Assert.assertNotNull(myInteger80);
        org.junit.Assert.assertNotNull(myInteger81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(myInteger84);
        org.junit.Assert.assertNotNull(myInteger85);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
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
        int int74 = myInteger73.getIntValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertNotNull(myInteger31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(myInteger40);
        org.junit.Assert.assertNotNull(myInteger43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(myInteger45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(myInteger54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(myInteger65);
        org.junit.Assert.assertNotNull(myInteger66);
        org.junit.Assert.assertNotNull(myInteger67);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "0" + "'", str72, "0");
        org.junit.Assert.assertNotNull(myInteger73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
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
        boolean boolean24 = myInteger19.equals((java.lang.Object) (byte) -1);
        int int25 = myInteger19.getIntValue();
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = myInteger27.multiply(myInteger31);
        int int35 = myInteger27.getIntValue();
        java.lang.String str36 = myInteger27.toString();
        java.lang.String str37 = myInteger27.toString();
        MyInteger myInteger38 = myInteger19.add(myInteger27);
        MyInteger myInteger40 = new MyInteger((int) (short) 0);
        boolean boolean42 = myInteger40.equals((java.lang.Object) 1.0f);
        int int43 = myInteger40.getIntValue();
        java.lang.String str44 = myInteger40.toString();
        MyInteger myInteger45 = myInteger19.add(myInteger40);
        MyInteger myInteger46 = myInteger9.multiply(myInteger45);
        MyInteger myInteger48 = new MyInteger(1);
        java.lang.Object obj49 = null;
        boolean boolean50 = myInteger48.equals(obj49);
        int int51 = myInteger48.getIntValue();
        java.lang.String str52 = myInteger48.toString();
        MyInteger myInteger53 = myInteger46.multiply(myInteger48);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(myInteger22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(myInteger34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0" + "'", str36, "0");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0" + "'", str37, "0");
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "0" + "'", str44, "0");
        org.junit.Assert.assertNotNull(myInteger45);
        org.junit.Assert.assertNotNull(myInteger46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1" + "'", str52, "1");
        org.junit.Assert.assertNotNull(myInteger53);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.multiply(myInteger5);
        MyInteger myInteger15 = new MyInteger((int) (short) 0);
        boolean boolean17 = myInteger15.equals((java.lang.Object) 1.0f);
        MyInteger myInteger19 = new MyInteger((int) (short) 0);
        boolean boolean21 = myInteger19.equals((java.lang.Object) 1.0f);
        MyInteger myInteger22 = myInteger15.multiply(myInteger19);
        MyInteger myInteger24 = new MyInteger((int) (short) 0);
        MyInteger myInteger25 = myInteger15.multiply(myInteger24);
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
        int int51 = myInteger50.getIntValue();
        boolean boolean52 = myInteger27.equals((java.lang.Object) myInteger50);
        MyInteger myInteger53 = myInteger24.multiply(myInteger27);
        MyInteger myInteger55 = new MyInteger((int) (short) 0);
        boolean boolean57 = myInteger55.equals((java.lang.Object) 1.0f);
        MyInteger myInteger59 = new MyInteger((int) (short) 0);
        boolean boolean61 = myInteger59.equals((java.lang.Object) 1.0f);
        MyInteger myInteger62 = myInteger55.multiply(myInteger59);
        int int63 = myInteger55.getIntValue();
        java.lang.String str64 = myInteger55.toString();
        java.lang.String str65 = myInteger55.toString();
        boolean boolean66 = myInteger24.equals((java.lang.Object) str65);
        MyInteger myInteger67 = myInteger13.add(myInteger24);
        int int68 = myInteger67.getIntValue();
        int int69 = myInteger67.getIntValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(myInteger22);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(myInteger49);
        org.junit.Assert.assertNotNull(myInteger50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(myInteger53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(myInteger62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "0" + "'", str64, "0");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "0" + "'", str65, "0");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(myInteger67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
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
        int int48 = myInteger47.getIntValue();
        MyInteger myInteger50 = new MyInteger((int) (short) 0);
        boolean boolean52 = myInteger50.equals((java.lang.Object) 1.0f);
        MyInteger myInteger54 = new MyInteger((int) (short) 0);
        boolean boolean56 = myInteger54.equals((java.lang.Object) 1.0f);
        MyInteger myInteger58 = new MyInteger((int) (short) 0);
        boolean boolean60 = myInteger58.equals((java.lang.Object) 1.0f);
        MyInteger myInteger61 = myInteger54.multiply(myInteger58);
        MyInteger myInteger62 = myInteger50.multiply(myInteger54);
        int int63 = myInteger50.getIntValue();
        MyInteger myInteger65 = new MyInteger((int) (short) 0);
        boolean boolean67 = myInteger65.equals((java.lang.Object) 1.0f);
        MyInteger myInteger69 = new MyInteger((int) (short) 0);
        boolean boolean71 = myInteger69.equals((java.lang.Object) 1.0f);
        MyInteger myInteger73 = new MyInteger((int) (short) 0);
        boolean boolean75 = myInteger73.equals((java.lang.Object) 1.0f);
        MyInteger myInteger76 = myInteger69.multiply(myInteger73);
        int int77 = myInteger69.getIntValue();
        int int78 = myInteger69.getIntValue();
        MyInteger myInteger80 = new MyInteger((int) (short) 0);
        boolean boolean82 = myInteger80.equals((java.lang.Object) 1.0f);
        MyInteger myInteger84 = new MyInteger((int) (short) 0);
        boolean boolean86 = myInteger84.equals((java.lang.Object) 1.0f);
        MyInteger myInteger87 = myInteger80.multiply(myInteger84);
        MyInteger myInteger88 = myInteger69.add(myInteger80);
        MyInteger myInteger89 = myInteger65.multiply(myInteger88);
        java.lang.String str90 = myInteger65.toString();
        MyInteger myInteger91 = myInteger50.multiply(myInteger65);
        MyInteger myInteger92 = myInteger47.multiply(myInteger50);
        MyInteger myInteger93 = myInteger31.add(myInteger50);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(myInteger34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(myInteger44);
        org.junit.Assert.assertNotNull(myInteger47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(myInteger61);
        org.junit.Assert.assertNotNull(myInteger62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(myInteger76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(myInteger87);
        org.junit.Assert.assertNotNull(myInteger88);
        org.junit.Assert.assertNotNull(myInteger89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "0" + "'", str90, "0");
        org.junit.Assert.assertNotNull(myInteger91);
        org.junit.Assert.assertNotNull(myInteger92);
        org.junit.Assert.assertNotNull(myInteger93);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
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
        MyInteger myInteger40 = new MyInteger((int) (short) 0);
        boolean boolean42 = myInteger40.equals((java.lang.Object) 1.0f);
        MyInteger myInteger44 = new MyInteger((int) (short) 0);
        boolean boolean46 = myInteger44.equals((java.lang.Object) 1.0f);
        MyInteger myInteger48 = new MyInteger((int) (short) 0);
        boolean boolean50 = myInteger48.equals((java.lang.Object) 1.0f);
        MyInteger myInteger51 = myInteger44.multiply(myInteger48);
        MyInteger myInteger52 = myInteger40.add(myInteger48);
        int int53 = myInteger52.getIntValue();
        MyInteger myInteger54 = myInteger33.add(myInteger52);
        java.lang.String str55 = myInteger52.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(myInteger36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(myInteger51);
        org.junit.Assert.assertNotNull(myInteger52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(myInteger54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "0" + "'", str55, "0");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
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
        MyInteger myInteger46 = new MyInteger((int) (short) -1);
        boolean boolean47 = myInteger13.equals((java.lang.Object) myInteger46);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(myInteger35);
        org.junit.Assert.assertNotNull(myInteger36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
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
        MyInteger myInteger40 = new MyInteger((int) (short) 0);
        boolean boolean42 = myInteger40.equals((java.lang.Object) 1.0f);
        MyInteger myInteger44 = new MyInteger((int) (short) 0);
        boolean boolean46 = myInteger44.equals((java.lang.Object) 1.0f);
        MyInteger myInteger48 = new MyInteger((int) (short) 0);
        boolean boolean50 = myInteger48.equals((java.lang.Object) 1.0f);
        MyInteger myInteger51 = myInteger44.multiply(myInteger48);
        MyInteger myInteger52 = myInteger40.add(myInteger48);
        int int53 = myInteger52.getIntValue();
        MyInteger myInteger54 = myInteger33.add(myInteger52);
        java.lang.Class<?> wildcardClass55 = myInteger52.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(myInteger36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(myInteger51);
        org.junit.Assert.assertNotNull(myInteger52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(myInteger54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
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
        boolean boolean37 = myInteger32.equals((java.lang.Object) (byte) -1);
        int int38 = myInteger32.getIntValue();
        MyInteger myInteger40 = new MyInteger((int) (short) 0);
        boolean boolean42 = myInteger40.equals((java.lang.Object) 1.0f);
        MyInteger myInteger44 = new MyInteger((int) (short) 0);
        boolean boolean46 = myInteger44.equals((java.lang.Object) 1.0f);
        MyInteger myInteger47 = myInteger40.multiply(myInteger44);
        int int48 = myInteger40.getIntValue();
        java.lang.String str49 = myInteger40.toString();
        java.lang.String str50 = myInteger40.toString();
        MyInteger myInteger51 = myInteger32.add(myInteger40);
        int int52 = myInteger40.getIntValue();
        MyInteger myInteger54 = new MyInteger((int) (short) 0);
        boolean boolean56 = myInteger54.equals((java.lang.Object) 1.0f);
        MyInteger myInteger58 = new MyInteger((int) (short) 0);
        boolean boolean60 = myInteger58.equals((java.lang.Object) 1.0f);
        MyInteger myInteger61 = myInteger54.multiply(myInteger58);
        boolean boolean62 = myInteger40.equals((java.lang.Object) myInteger58);
        MyInteger myInteger63 = myInteger25.multiply(myInteger40);
        MyInteger myInteger65 = new MyInteger((int) (short) 0);
        MyInteger myInteger66 = myInteger63.multiply(myInteger65);
        int int67 = myInteger63.getIntValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(myInteger35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(myInteger47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "0" + "'", str49, "0");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "0" + "'", str50, "0");
        org.junit.Assert.assertNotNull(myInteger51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(myInteger61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(myInteger63);
        org.junit.Assert.assertNotNull(myInteger66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
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
        java.lang.String str34 = myInteger26.toString();
        MyInteger myInteger35 = myInteger5.multiply(myInteger26);
        int int36 = myInteger5.getIntValue();
        java.lang.String str37 = myInteger5.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(myInteger33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "0" + "'", str34, "0");
        org.junit.Assert.assertNotNull(myInteger35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0" + "'", str37, "0");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        MyInteger myInteger11 = myInteger1.multiply(myInteger10);
        boolean boolean13 = myInteger1.equals((java.lang.Object) '4');
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
        java.lang.String str40 = myInteger39.toString();
        MyInteger myInteger42 = new MyInteger((int) (short) 0);
        boolean boolean44 = myInteger42.equals((java.lang.Object) 1.0f);
        MyInteger myInteger46 = new MyInteger((int) (short) 0);
        boolean boolean48 = myInteger46.equals((java.lang.Object) 1.0f);
        MyInteger myInteger49 = myInteger42.multiply(myInteger46);
        MyInteger myInteger51 = new MyInteger((int) (short) 0);
        MyInteger myInteger52 = myInteger42.multiply(myInteger51);
        boolean boolean54 = myInteger42.equals((java.lang.Object) '4');
        MyInteger myInteger55 = myInteger39.multiply(myInteger42);
        java.lang.String str56 = myInteger39.toString();
        MyInteger myInteger57 = myInteger1.add(myInteger39);
        java.lang.String str58 = myInteger1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(myInteger37);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0" + "'", str40, "0");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(myInteger49);
        org.junit.Assert.assertNotNull(myInteger52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(myInteger55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "0" + "'", str56, "0");
        org.junit.Assert.assertNotNull(myInteger57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "0" + "'", str58, "0");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
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
        MyInteger myInteger37 = myInteger13.multiply(myInteger36);
        java.lang.String str38 = myInteger37.toString();
        MyInteger myInteger40 = new MyInteger((int) (short) 0);
        boolean boolean42 = myInteger40.equals((java.lang.Object) 1.0f);
        MyInteger myInteger44 = new MyInteger((int) (short) 0);
        boolean boolean46 = myInteger44.equals((java.lang.Object) 1.0f);
        MyInteger myInteger47 = myInteger40.multiply(myInteger44);
        MyInteger myInteger49 = new MyInteger((int) (short) 0);
        MyInteger myInteger50 = myInteger40.multiply(myInteger49);
        boolean boolean52 = myInteger40.equals((java.lang.Object) '4');
        MyInteger myInteger53 = myInteger37.multiply(myInteger40);
        MyInteger myInteger54 = myInteger5.multiply(myInteger40);
        java.lang.Class<?> wildcardClass55 = myInteger54.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(myInteger35);
        org.junit.Assert.assertNotNull(myInteger36);
        org.junit.Assert.assertNotNull(myInteger37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0" + "'", str38, "0");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(myInteger47);
        org.junit.Assert.assertNotNull(myInteger50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(myInteger53);
        org.junit.Assert.assertNotNull(myInteger54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        java.lang.String str3 = myInteger1.toString();
        boolean boolean5 = myInteger1.equals((java.lang.Object) 97);
        java.lang.String str6 = myInteger1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        MyInteger myInteger1 = new MyInteger(1);
        java.lang.String str2 = myInteger1.toString();
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
        int int73 = myInteger60.getIntValue();
        int int74 = myInteger60.getIntValue();
        MyInteger myInteger75 = myInteger1.multiply(myInteger60);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(myInteger15);
        org.junit.Assert.assertNotNull(myInteger16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(myInteger29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(myInteger40);
        org.junit.Assert.assertNotNull(myInteger41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(myInteger53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(myInteger55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(myInteger58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(myInteger67);
        org.junit.Assert.assertNotNull(myInteger70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(myInteger72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(myInteger75);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.multiply(myInteger5);
        int int14 = myInteger13.getIntValue();
        int int15 = myInteger13.getIntValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        java.lang.String str3 = myInteger1.toString();
        int int4 = myInteger1.getIntValue();
        MyInteger myInteger6 = new MyInteger((int) (short) 0);
        boolean boolean8 = myInteger6.equals((java.lang.Object) 1.0f);
        int int9 = myInteger6.getIntValue();
        MyInteger myInteger10 = myInteger1.add(myInteger6);
        java.lang.Class<?> wildcardClass11 = myInteger6.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(myInteger10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        MyInteger myInteger10 = new MyInteger((int) (short) 0);
        MyInteger myInteger11 = myInteger1.multiply(myInteger10);
        boolean boolean13 = myInteger1.equals((java.lang.Object) '4');
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
        java.lang.String str40 = myInteger39.toString();
        MyInteger myInteger42 = new MyInteger((int) (short) 0);
        boolean boolean44 = myInteger42.equals((java.lang.Object) 1.0f);
        MyInteger myInteger46 = new MyInteger((int) (short) 0);
        boolean boolean48 = myInteger46.equals((java.lang.Object) 1.0f);
        MyInteger myInteger49 = myInteger42.multiply(myInteger46);
        MyInteger myInteger51 = new MyInteger((int) (short) 0);
        MyInteger myInteger52 = myInteger42.multiply(myInteger51);
        boolean boolean54 = myInteger42.equals((java.lang.Object) '4');
        MyInteger myInteger55 = myInteger39.multiply(myInteger42);
        java.lang.String str56 = myInteger39.toString();
        MyInteger myInteger57 = myInteger1.add(myInteger39);
        boolean boolean59 = myInteger1.equals((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(myInteger37);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0" + "'", str40, "0");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(myInteger49);
        org.junit.Assert.assertNotNull(myInteger52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(myInteger55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "0" + "'", str56, "0");
        org.junit.Assert.assertNotNull(myInteger57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
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
        java.lang.Object obj70 = new java.lang.Object();
        boolean boolean71 = myInteger47.equals(obj70);
        java.lang.Class<?> wildcardClass72 = myInteger47.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(myInteger37);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(myInteger50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(myInteger52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(myInteger55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(myInteger64);
        org.junit.Assert.assertNotNull(myInteger67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(myInteger69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        java.lang.String str2 = myInteger1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        MyInteger myInteger1 = new MyInteger((int) (byte) 10);
        int int2 = myInteger1.getIntValue();
        java.lang.String str3 = myInteger1.toString();
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
        java.lang.String str30 = myInteger29.toString();
        java.lang.Class<?> wildcardClass31 = myInteger29.getClass();
        boolean boolean32 = myInteger1.equals((java.lang.Object) wildcardClass31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(myInteger16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(myInteger27);
        org.junit.Assert.assertNotNull(myInteger28);
        org.junit.Assert.assertNotNull(myInteger29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
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
        java.lang.String str61 = myInteger60.toString();
        int int62 = myInteger60.getIntValue();
        int int63 = myInteger60.getIntValue();
        MyInteger myInteger64 = myInteger15.add(myInteger60);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1" + "'", str16, "-1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1" + "'", str17, "-1");
        org.junit.Assert.assertNotNull(myInteger18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(myInteger31);
        org.junit.Assert.assertNotNull(myInteger32);
        org.junit.Assert.assertNotNull(myInteger33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(myInteger42);
        org.junit.Assert.assertNotNull(myInteger45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "0" + "'", str46, "0");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(myInteger55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "0" + "'", str57, "0");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(myInteger60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "0" + "'", str61, "0");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(myInteger64);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
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
        java.lang.String str30 = myInteger27.toString();
        MyInteger myInteger31 = myInteger1.multiply(myInteger27);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertNotNull(myInteger31);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        int int4 = myInteger1.getIntValue();
        java.lang.String str5 = myInteger1.toString();
        int int6 = myInteger1.getIntValue();
        MyInteger myInteger8 = new MyInteger((int) (short) 0);
        boolean boolean10 = myInteger8.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = new MyInteger((int) (short) 0);
        boolean boolean14 = myInteger12.equals((java.lang.Object) 1.0f);
        MyInteger myInteger15 = myInteger8.multiply(myInteger12);
        boolean boolean17 = myInteger12.equals((java.lang.Object) (byte) -1);
        int int18 = myInteger12.getIntValue();
        MyInteger myInteger20 = new MyInteger((int) (short) 0);
        boolean boolean22 = myInteger20.equals((java.lang.Object) 1.0f);
        MyInteger myInteger24 = new MyInteger((int) (short) 0);
        boolean boolean26 = myInteger24.equals((java.lang.Object) 1.0f);
        MyInteger myInteger27 = myInteger20.multiply(myInteger24);
        int int28 = myInteger20.getIntValue();
        java.lang.String str29 = myInteger20.toString();
        java.lang.String str30 = myInteger20.toString();
        MyInteger myInteger31 = myInteger12.add(myInteger20);
        int int32 = myInteger20.getIntValue();
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger38 = new MyInteger((int) (short) 0);
        boolean boolean40 = myInteger38.equals((java.lang.Object) 1.0f);
        MyInteger myInteger41 = myInteger34.multiply(myInteger38);
        boolean boolean42 = myInteger20.equals((java.lang.Object) myInteger38);
        java.lang.String str43 = myInteger20.toString();
        MyInteger myInteger44 = myInteger1.multiply(myInteger20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(myInteger15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(myInteger27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0" + "'", str29, "0");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertNotNull(myInteger31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(myInteger41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "0" + "'", str43, "0");
        org.junit.Assert.assertNotNull(myInteger44);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
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
        java.lang.Class<?> wildcardClass43 = myInteger16.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(myInteger27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertNotNull(myInteger40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0" + "'", str41, "0");
        org.junit.Assert.assertNotNull(myInteger42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
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
        java.lang.String str25 = myInteger19.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(myInteger22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0" + "'", str25, "0");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        int int9 = myInteger1.getIntValue();
        java.lang.String str10 = myInteger1.toString();
        boolean boolean12 = myInteger1.equals((java.lang.Object) (byte) 0);
        int int13 = myInteger1.getIntValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
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
        java.lang.String str45 = myInteger28.toString();
        MyInteger myInteger47 = new MyInteger((int) (short) 0);
        boolean boolean49 = myInteger47.equals((java.lang.Object) 1.0f);
        MyInteger myInteger51 = new MyInteger((int) (short) 0);
        boolean boolean53 = myInteger51.equals((java.lang.Object) 1.0f);
        MyInteger myInteger54 = myInteger47.multiply(myInteger51);
        int int55 = myInteger47.getIntValue();
        java.lang.String str56 = myInteger47.toString();
        boolean boolean58 = myInteger47.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger60 = new MyInteger((int) 'a');
        int int61 = myInteger60.getIntValue();
        int int62 = myInteger60.getIntValue();
        MyInteger myInteger64 = new MyInteger((int) (short) 0);
        boolean boolean66 = myInteger64.equals((java.lang.Object) 1.0f);
        MyInteger myInteger68 = new MyInteger((int) (short) 0);
        boolean boolean70 = myInteger68.equals((java.lang.Object) 1.0f);
        MyInteger myInteger71 = myInteger64.multiply(myInteger68);
        int int72 = myInteger64.getIntValue();
        java.lang.String str73 = myInteger64.toString();
        boolean boolean75 = myInteger64.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger76 = myInteger60.multiply(myInteger64);
        boolean boolean77 = myInteger47.equals((java.lang.Object) myInteger60);
        java.lang.String str78 = myInteger60.toString();
        MyInteger myInteger79 = myInteger28.multiply(myInteger60);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(myInteger21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(myInteger41);
        org.junit.Assert.assertNotNull(myInteger42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(myInteger44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "10" + "'", str45, "10");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(myInteger54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "0" + "'", str56, "0");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 97 + "'", int61 == 97);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 97 + "'", int62 == 97);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(myInteger71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "0" + "'", str73, "0");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(myInteger76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "97" + "'", str78, "97");
        org.junit.Assert.assertNotNull(myInteger79);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
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
        int int43 = myInteger1.getIntValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(myInteger27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertNotNull(myInteger40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0" + "'", str41, "0");
        org.junit.Assert.assertNotNull(myInteger42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
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
        MyInteger myInteger40 = new MyInteger((int) (short) 0);
        boolean boolean42 = myInteger40.equals((java.lang.Object) 1.0f);
        MyInteger myInteger44 = new MyInteger((int) (short) 0);
        boolean boolean46 = myInteger44.equals((java.lang.Object) 1.0f);
        MyInteger myInteger48 = new MyInteger((int) (short) 0);
        boolean boolean50 = myInteger48.equals((java.lang.Object) 1.0f);
        MyInteger myInteger51 = myInteger44.multiply(myInteger48);
        MyInteger myInteger52 = myInteger40.add(myInteger48);
        int int53 = myInteger52.getIntValue();
        MyInteger myInteger54 = myInteger33.add(myInteger52);
        java.lang.Class<?> wildcardClass55 = myInteger54.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(myInteger36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(myInteger51);
        org.junit.Assert.assertNotNull(myInteger52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(myInteger54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
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
        MyInteger myInteger69 = new MyInteger((int) (short) 0);
        boolean boolean71 = myInteger69.equals((java.lang.Object) 1.0f);
        int int72 = myInteger69.getIntValue();
        java.lang.String str73 = myInteger69.toString();
        MyInteger myInteger74 = myInteger48.add(myInteger69);
        MyInteger myInteger76 = new MyInteger((int) (short) 0);
        boolean boolean78 = myInteger76.equals((java.lang.Object) 1.0f);
        MyInteger myInteger80 = new MyInteger((int) (short) 0);
        boolean boolean82 = myInteger80.equals((java.lang.Object) 1.0f);
        MyInteger myInteger83 = myInteger76.multiply(myInteger80);
        MyInteger myInteger85 = new MyInteger((int) (short) 0);
        MyInteger myInteger86 = myInteger76.multiply(myInteger85);
        int int87 = myInteger76.getIntValue();
        MyInteger myInteger88 = myInteger48.multiply(myInteger76);
        java.lang.Class<?> wildcardClass89 = myInteger48.getClass();
        boolean boolean90 = myInteger42.equals((java.lang.Object) wildcardClass89);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(myInteger27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertNotNull(myInteger40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0" + "'", str41, "0");
        org.junit.Assert.assertNotNull(myInteger42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(myInteger51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(myInteger63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "0" + "'", str65, "0");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "0" + "'", str66, "0");
        org.junit.Assert.assertNotNull(myInteger67);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "0" + "'", str73, "0");
        org.junit.Assert.assertNotNull(myInteger74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(myInteger83);
        org.junit.Assert.assertNotNull(myInteger86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(myInteger88);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
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
        java.lang.String str40 = myInteger13.toString();
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
        MyInteger myInteger66 = myInteger42.multiply(myInteger65);
        java.lang.String str67 = myInteger66.toString();
        MyInteger myInteger69 = new MyInteger((int) (short) 0);
        boolean boolean71 = myInteger69.equals((java.lang.Object) 1.0f);
        MyInteger myInteger73 = new MyInteger((int) (short) 0);
        boolean boolean75 = myInteger73.equals((java.lang.Object) 1.0f);
        MyInteger myInteger76 = myInteger69.multiply(myInteger73);
        MyInteger myInteger78 = new MyInteger((int) (short) 0);
        MyInteger myInteger79 = myInteger69.multiply(myInteger78);
        boolean boolean81 = myInteger69.equals((java.lang.Object) '4');
        MyInteger myInteger82 = myInteger66.multiply(myInteger69);
        int int83 = myInteger82.getIntValue();
        boolean boolean84 = myInteger13.equals((java.lang.Object) int83);
        int int85 = myInteger13.getIntValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(myInteger35);
        org.junit.Assert.assertNotNull(myInteger36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0" + "'", str40, "0");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(myInteger53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(myInteger64);
        org.junit.Assert.assertNotNull(myInteger65);
        org.junit.Assert.assertNotNull(myInteger66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "0" + "'", str67, "0");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(myInteger76);
        org.junit.Assert.assertNotNull(myInteger79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(myInteger82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
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
        int int68 = myInteger33.getIntValue();
        MyInteger myInteger70 = new MyInteger((int) (short) 0);
        boolean boolean72 = myInteger70.equals((java.lang.Object) 1.0f);
        MyInteger myInteger74 = new MyInteger((int) (short) 0);
        boolean boolean76 = myInteger74.equals((java.lang.Object) 1.0f);
        MyInteger myInteger78 = new MyInteger((int) (short) 0);
        boolean boolean80 = myInteger78.equals((java.lang.Object) 1.0f);
        MyInteger myInteger81 = myInteger74.multiply(myInteger78);
        MyInteger myInteger82 = myInteger70.add(myInteger78);
        boolean boolean83 = myInteger33.equals((java.lang.Object) myInteger78);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertNotNull(myInteger31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(myInteger40);
        org.junit.Assert.assertNotNull(myInteger43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(myInteger45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(myInteger54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(myInteger65);
        org.junit.Assert.assertNotNull(myInteger66);
        org.junit.Assert.assertNotNull(myInteger67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(myInteger81);
        org.junit.Assert.assertNotNull(myInteger82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        int int3 = myInteger1.getIntValue();
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        boolean boolean14 = myInteger9.equals((java.lang.Object) (byte) -1);
        int int15 = myInteger9.getIntValue();
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger21 = new MyInteger((int) (short) 0);
        boolean boolean23 = myInteger21.equals((java.lang.Object) 1.0f);
        MyInteger myInteger24 = myInteger17.multiply(myInteger21);
        int int25 = myInteger17.getIntValue();
        java.lang.String str26 = myInteger17.toString();
        java.lang.String str27 = myInteger17.toString();
        MyInteger myInteger28 = myInteger9.add(myInteger17);
        MyInteger myInteger30 = new MyInteger((int) (short) 0);
        boolean boolean32 = myInteger30.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = myInteger30.multiply(myInteger34);
        java.lang.String str38 = myInteger30.toString();
        MyInteger myInteger39 = myInteger9.multiply(myInteger30);
        int int40 = myInteger9.getIntValue();
        MyInteger myInteger42 = new MyInteger((int) (short) 0);
        boolean boolean44 = myInteger42.equals((java.lang.Object) 1.0f);
        MyInteger myInteger46 = new MyInteger((int) (short) 0);
        boolean boolean48 = myInteger46.equals((java.lang.Object) 1.0f);
        MyInteger myInteger49 = myInteger42.multiply(myInteger46);
        boolean boolean51 = myInteger46.equals((java.lang.Object) (byte) -1);
        MyInteger myInteger53 = new MyInteger((int) (short) 0);
        boolean boolean55 = myInteger53.equals((java.lang.Object) 1.0f);
        MyInteger myInteger57 = new MyInteger((int) (short) 0);
        boolean boolean59 = myInteger57.equals((java.lang.Object) 1.0f);
        MyInteger myInteger61 = new MyInteger((int) (short) 0);
        boolean boolean63 = myInteger61.equals((java.lang.Object) 1.0f);
        MyInteger myInteger64 = myInteger57.multiply(myInteger61);
        int int65 = myInteger57.getIntValue();
        int int66 = myInteger57.getIntValue();
        MyInteger myInteger68 = new MyInteger((int) (short) 0);
        boolean boolean70 = myInteger68.equals((java.lang.Object) 1.0f);
        MyInteger myInteger72 = new MyInteger((int) (short) 0);
        boolean boolean74 = myInteger72.equals((java.lang.Object) 1.0f);
        MyInteger myInteger75 = myInteger68.multiply(myInteger72);
        MyInteger myInteger76 = myInteger57.add(myInteger68);
        int int77 = myInteger76.getIntValue();
        boolean boolean78 = myInteger53.equals((java.lang.Object) myInteger76);
        java.lang.String str79 = myInteger53.toString();
        MyInteger myInteger80 = myInteger46.multiply(myInteger53);
        boolean boolean81 = myInteger9.equals((java.lang.Object) myInteger80);
        MyInteger myInteger82 = myInteger1.add(myInteger9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0" + "'", str27, "0");
        org.junit.Assert.assertNotNull(myInteger28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(myInteger37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0" + "'", str38, "0");
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(myInteger49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(myInteger64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(myInteger75);
        org.junit.Assert.assertNotNull(myInteger76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "0" + "'", str79, "0");
        org.junit.Assert.assertNotNull(myInteger80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(myInteger82);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        MyInteger myInteger1 = new MyInteger((int) '#');
        java.lang.Class<?> wildcardClass2 = myInteger1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        MyInteger myInteger1 = new MyInteger((int) (byte) 1);
        MyInteger myInteger3 = new MyInteger((int) 'a');
        MyInteger myInteger4 = myInteger1.multiply(myInteger3);
        MyInteger myInteger5 = null;
        // The following exception was thrown during execution in test generation
        try {
            MyInteger myInteger6 = myInteger1.add(myInteger5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(myInteger4);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
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
        boolean boolean24 = myInteger19.equals((java.lang.Object) (byte) -1);
        int int25 = myInteger19.getIntValue();
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = myInteger27.multiply(myInteger31);
        int int35 = myInteger27.getIntValue();
        java.lang.String str36 = myInteger27.toString();
        java.lang.String str37 = myInteger27.toString();
        MyInteger myInteger38 = myInteger19.add(myInteger27);
        MyInteger myInteger40 = new MyInteger((int) (short) 0);
        boolean boolean42 = myInteger40.equals((java.lang.Object) 1.0f);
        int int43 = myInteger40.getIntValue();
        java.lang.String str44 = myInteger40.toString();
        MyInteger myInteger45 = myInteger19.add(myInteger40);
        MyInteger myInteger46 = myInteger9.multiply(myInteger45);
        java.lang.String str47 = myInteger46.toString();
        MyInteger myInteger49 = new MyInteger((int) (short) 0);
        boolean boolean51 = myInteger49.equals((java.lang.Object) 1.0f);
        MyInteger myInteger53 = new MyInteger((int) (short) 0);
        boolean boolean55 = myInteger53.equals((java.lang.Object) 1.0f);
        MyInteger myInteger56 = myInteger49.multiply(myInteger53);
        MyInteger myInteger58 = new MyInteger((int) (short) 0);
        MyInteger myInteger59 = myInteger49.multiply(myInteger58);
        int int60 = myInteger59.getIntValue();
        java.lang.Class<?> wildcardClass61 = myInteger59.getClass();
        boolean boolean62 = myInteger46.equals((java.lang.Object) myInteger59);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(myInteger22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(myInteger34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0" + "'", str36, "0");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0" + "'", str37, "0");
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "0" + "'", str44, "0");
        org.junit.Assert.assertNotNull(myInteger45);
        org.junit.Assert.assertNotNull(myInteger46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "0" + "'", str47, "0");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(myInteger56);
        org.junit.Assert.assertNotNull(myInteger59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
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
        MyInteger myInteger85 = myInteger56.multiply(myInteger59);
        MyInteger myInteger87 = new MyInteger((int) (short) 0);
        boolean boolean89 = myInteger87.equals((java.lang.Object) 1.0f);
        boolean boolean90 = myInteger59.equals((java.lang.Object) myInteger87);
        MyInteger myInteger91 = myInteger45.multiply(myInteger87);
        java.lang.Class<?> wildcardClass92 = myInteger45.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertNotNull(myInteger31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(myInteger40);
        org.junit.Assert.assertNotNull(myInteger43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(myInteger45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(myInteger54);
        org.junit.Assert.assertNotNull(myInteger57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(myInteger70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(myInteger81);
        org.junit.Assert.assertNotNull(myInteger82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(myInteger85);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(myInteger91);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger9 = new MyInteger((int) (short) 0);
        boolean boolean11 = myInteger9.equals((java.lang.Object) 1.0f);
        MyInteger myInteger12 = myInteger5.multiply(myInteger9);
        MyInteger myInteger13 = myInteger1.multiply(myInteger5);
        int int14 = myInteger13.getIntValue();
        java.lang.String str15 = myInteger13.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
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
        java.lang.String str34 = myInteger26.toString();
        MyInteger myInteger35 = myInteger5.multiply(myInteger26);
        java.lang.Class<?> wildcardClass36 = myInteger26.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(myInteger33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "0" + "'", str34, "0");
        org.junit.Assert.assertNotNull(myInteger35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        int int9 = myInteger1.getIntValue();
        java.lang.String str10 = myInteger1.toString();
        boolean boolean12 = myInteger1.equals((java.lang.Object) (byte) 0);
        MyInteger myInteger14 = new MyInteger((int) (short) 0);
        boolean boolean16 = myInteger14.equals((java.lang.Object) 1.0f);
        MyInteger myInteger18 = new MyInteger((int) (short) 0);
        boolean boolean20 = myInteger18.equals((java.lang.Object) 1.0f);
        MyInteger myInteger21 = myInteger14.multiply(myInteger18);
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = myInteger27.multiply(myInteger31);
        MyInteger myInteger35 = myInteger23.multiply(myInteger27);
        java.lang.Class<?> wildcardClass36 = myInteger23.getClass();
        boolean boolean37 = myInteger14.equals((java.lang.Object) wildcardClass36);
        int int38 = myInteger14.getIntValue();
        MyInteger myInteger40 = new MyInteger((int) (short) 0);
        boolean boolean42 = myInteger40.equals((java.lang.Object) 1.0f);
        MyInteger myInteger44 = new MyInteger((int) (short) 0);
        boolean boolean46 = myInteger44.equals((java.lang.Object) 1.0f);
        MyInteger myInteger48 = new MyInteger((int) (short) 0);
        boolean boolean50 = myInteger48.equals((java.lang.Object) 1.0f);
        MyInteger myInteger51 = myInteger44.multiply(myInteger48);
        int int52 = myInteger44.getIntValue();
        int int53 = myInteger44.getIntValue();
        MyInteger myInteger55 = new MyInteger((int) (short) 0);
        boolean boolean57 = myInteger55.equals((java.lang.Object) 1.0f);
        MyInteger myInteger59 = new MyInteger((int) (short) 0);
        boolean boolean61 = myInteger59.equals((java.lang.Object) 1.0f);
        MyInteger myInteger62 = myInteger55.multiply(myInteger59);
        MyInteger myInteger63 = myInteger44.add(myInteger55);
        MyInteger myInteger64 = myInteger40.multiply(myInteger63);
        java.lang.String str65 = myInteger40.toString();
        MyInteger myInteger67 = new MyInteger((int) (short) 0);
        boolean boolean69 = myInteger67.equals((java.lang.Object) 1.0f);
        MyInteger myInteger71 = new MyInteger((int) (short) 0);
        boolean boolean73 = myInteger71.equals((java.lang.Object) 1.0f);
        MyInteger myInteger75 = new MyInteger((int) (short) 0);
        boolean boolean77 = myInteger75.equals((java.lang.Object) 1.0f);
        MyInteger myInteger78 = myInteger71.multiply(myInteger75);
        int int79 = myInteger71.getIntValue();
        int int80 = myInteger71.getIntValue();
        MyInteger myInteger82 = new MyInteger((int) (short) 0);
        boolean boolean84 = myInteger82.equals((java.lang.Object) 1.0f);
        MyInteger myInteger86 = new MyInteger((int) (short) 0);
        boolean boolean88 = myInteger86.equals((java.lang.Object) 1.0f);
        MyInteger myInteger89 = myInteger82.multiply(myInteger86);
        MyInteger myInteger90 = myInteger71.add(myInteger82);
        MyInteger myInteger91 = myInteger67.multiply(myInteger90);
        MyInteger myInteger92 = myInteger40.multiply(myInteger91);
        boolean boolean94 = myInteger91.equals((java.lang.Object) (byte) -1);
        MyInteger myInteger95 = myInteger14.add(myInteger91);
        MyInteger myInteger96 = myInteger1.multiply(myInteger95);
        java.lang.String str97 = myInteger96.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(myInteger21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(myInteger34);
        org.junit.Assert.assertNotNull(myInteger35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(myInteger51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(myInteger62);
        org.junit.Assert.assertNotNull(myInteger63);
        org.junit.Assert.assertNotNull(myInteger64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "0" + "'", str65, "0");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(myInteger78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(myInteger89);
        org.junit.Assert.assertNotNull(myInteger90);
        org.junit.Assert.assertNotNull(myInteger91);
        org.junit.Assert.assertNotNull(myInteger92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(myInteger95);
        org.junit.Assert.assertNotNull(myInteger96);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "0" + "'", str97, "0");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        MyInteger myInteger1 = new MyInteger((int) (short) -1);
        java.lang.String str2 = myInteger1.toString();
        boolean boolean4 = myInteger1.equals((java.lang.Object) (-1));
        int int5 = myInteger1.getIntValue();
        java.lang.String str6 = myInteger1.toString();
        boolean boolean8 = myInteger1.equals((java.lang.Object) (-2));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
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
        int int56 = myInteger9.getIntValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(myInteger37);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(myInteger50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(myInteger52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(myInteger55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
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
        int int27 = myInteger14.getIntValue();
        int int28 = myInteger14.getIntValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(myInteger21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
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
        int int21 = myInteger20.getIntValue();
        MyInteger myInteger23 = new MyInteger((int) (short) 0);
        boolean boolean25 = myInteger23.equals((java.lang.Object) 1.0f);
        MyInteger myInteger27 = new MyInteger((int) (short) 0);
        boolean boolean29 = myInteger27.equals((java.lang.Object) 1.0f);
        MyInteger myInteger31 = new MyInteger((int) (short) 0);
        boolean boolean33 = myInteger31.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = myInteger27.multiply(myInteger31);
        MyInteger myInteger35 = myInteger23.multiply(myInteger27);
        boolean boolean36 = myInteger20.equals((java.lang.Object) myInteger27);
        int int37 = myInteger27.getIntValue();
        java.lang.String str38 = myInteger27.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(myInteger19);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(myInteger34);
        org.junit.Assert.assertNotNull(myInteger35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0" + "'", str38, "0");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
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
        MyInteger myInteger34 = myInteger27.multiply(myInteger31);
        boolean boolean36 = myInteger31.equals((java.lang.Object) (byte) -1);
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
        int int62 = myInteger61.getIntValue();
        boolean boolean63 = myInteger38.equals((java.lang.Object) myInteger61);
        java.lang.String str64 = myInteger38.toString();
        MyInteger myInteger65 = myInteger31.multiply(myInteger38);
        MyInteger myInteger66 = myInteger1.add(myInteger65);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(myInteger21);
        org.junit.Assert.assertNotNull(myInteger22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(myInteger34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(myInteger49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(myInteger60);
        org.junit.Assert.assertNotNull(myInteger61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "0" + "'", str64, "0");
        org.junit.Assert.assertNotNull(myInteger65);
        org.junit.Assert.assertNotNull(myInteger66);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        MyInteger myInteger1 = new MyInteger((int) (short) 0);
        boolean boolean3 = myInteger1.equals((java.lang.Object) 1.0f);
        MyInteger myInteger5 = new MyInteger((int) (short) 0);
        boolean boolean7 = myInteger5.equals((java.lang.Object) 1.0f);
        MyInteger myInteger8 = myInteger1.multiply(myInteger5);
        int int9 = myInteger1.getIntValue();
        java.lang.String str10 = myInteger1.toString();
        java.lang.String str11 = myInteger1.toString();
        MyInteger myInteger13 = new MyInteger((int) (short) 0);
        boolean boolean15 = myInteger13.equals((java.lang.Object) 1.0f);
        MyInteger myInteger17 = new MyInteger((int) (short) 0);
        boolean boolean19 = myInteger17.equals((java.lang.Object) 1.0f);
        MyInteger myInteger20 = myInteger13.multiply(myInteger17);
        MyInteger myInteger22 = new MyInteger((int) (short) 0);
        MyInteger myInteger23 = myInteger13.multiply(myInteger22);
        int int24 = myInteger23.getIntValue();
        MyInteger myInteger26 = new MyInteger((int) (short) 0);
        boolean boolean28 = myInteger26.equals((java.lang.Object) 1.0f);
        MyInteger myInteger30 = new MyInteger((int) (short) 0);
        boolean boolean32 = myInteger30.equals((java.lang.Object) 1.0f);
        MyInteger myInteger34 = new MyInteger((int) (short) 0);
        boolean boolean36 = myInteger34.equals((java.lang.Object) 1.0f);
        MyInteger myInteger37 = myInteger30.multiply(myInteger34);
        MyInteger myInteger38 = myInteger26.multiply(myInteger30);
        int int39 = myInteger26.getIntValue();
        MyInteger myInteger41 = new MyInteger((int) (short) 0);
        boolean boolean43 = myInteger41.equals((java.lang.Object) 1.0f);
        MyInteger myInteger45 = new MyInteger((int) (short) 0);
        boolean boolean47 = myInteger45.equals((java.lang.Object) 1.0f);
        MyInteger myInteger49 = new MyInteger((int) (short) 0);
        boolean boolean51 = myInteger49.equals((java.lang.Object) 1.0f);
        MyInteger myInteger52 = myInteger45.multiply(myInteger49);
        int int53 = myInteger45.getIntValue();
        int int54 = myInteger45.getIntValue();
        MyInteger myInteger56 = new MyInteger((int) (short) 0);
        boolean boolean58 = myInteger56.equals((java.lang.Object) 1.0f);
        MyInteger myInteger60 = new MyInteger((int) (short) 0);
        boolean boolean62 = myInteger60.equals((java.lang.Object) 1.0f);
        MyInteger myInteger63 = myInteger56.multiply(myInteger60);
        MyInteger myInteger64 = myInteger45.add(myInteger56);
        MyInteger myInteger65 = myInteger41.multiply(myInteger64);
        java.lang.String str66 = myInteger41.toString();
        MyInteger myInteger67 = myInteger26.multiply(myInteger41);
        MyInteger myInteger68 = myInteger23.multiply(myInteger26);
        MyInteger myInteger69 = myInteger1.add(myInteger23);
        MyInteger myInteger71 = new MyInteger(97);
        MyInteger myInteger72 = myInteger23.add(myInteger71);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(myInteger20);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(myInteger37);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(myInteger52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(myInteger63);
        org.junit.Assert.assertNotNull(myInteger64);
        org.junit.Assert.assertNotNull(myInteger65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "0" + "'", str66, "0");
        org.junit.Assert.assertNotNull(myInteger67);
        org.junit.Assert.assertNotNull(myInteger68);
        org.junit.Assert.assertNotNull(myInteger69);
        org.junit.Assert.assertNotNull(myInteger72);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
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
        java.lang.String str69 = myInteger10.toString();
        int int70 = myInteger10.getIntValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(myInteger8);
        org.junit.Assert.assertNotNull(myInteger11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(myInteger35);
        org.junit.Assert.assertNotNull(myInteger36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(myInteger39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(myInteger48);
        org.junit.Assert.assertNotNull(myInteger51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "0" + "'", str52, "0");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(myInteger61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "0" + "'", str63, "0");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(myInteger66);
        org.junit.Assert.assertNotNull(myInteger67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "0" + "'", str68, "0");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "0" + "'", str69, "0");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
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
        java.lang.String str27 = myInteger24.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(myInteger23);
        org.junit.Assert.assertNotNull(myInteger24);
        org.junit.Assert.assertNotNull(myInteger25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0" + "'", str27, "0");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
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
        MyInteger myInteger72 = new MyInteger((int) (short) 0);
        boolean boolean74 = myInteger72.equals((java.lang.Object) 1.0f);
        MyInteger myInteger76 = new MyInteger((int) (short) 0);
        boolean boolean78 = myInteger76.equals((java.lang.Object) 1.0f);
        MyInteger myInteger80 = new MyInteger((int) (short) 0);
        boolean boolean82 = myInteger80.equals((java.lang.Object) 1.0f);
        MyInteger myInteger83 = myInteger76.multiply(myInteger80);
        MyInteger myInteger84 = myInteger72.multiply(myInteger76);
        MyInteger myInteger85 = myInteger47.add(myInteger76);
        java.lang.Class<?> wildcardClass86 = myInteger47.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(myInteger12);
        org.junit.Assert.assertNotNull(myInteger13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(myInteger26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(myInteger37);
        org.junit.Assert.assertNotNull(myInteger38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(myInteger50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(myInteger52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(myInteger55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(myInteger64);
        org.junit.Assert.assertNotNull(myInteger67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(myInteger69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(myInteger83);
        org.junit.Assert.assertNotNull(myInteger84);
        org.junit.Assert.assertNotNull(myInteger85);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }
}

