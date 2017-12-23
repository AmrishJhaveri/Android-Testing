package org.coursera.sustainableapps;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ValidationUtilsTest {

    private ValidationUtils validationUtils;

    @Before
    public void setUp(){
        validationUtils=new ValidationUtils();
    }

    @Test
    public void testPasswordLengthChecksLessThan8()throws Exception{
        assertEquals(false,validationUtils.isPasswordLengthValid("1234"));
    }

    @Test
    public void testPasswordLengthChecksEqualTo8()throws Exception{
        assertEquals(true,validationUtils.isPasswordLengthValid("12345678"));
    }

    @Test
    public void testPasswordLengthChecksGreaterThan8()throws Exception{
        assertEquals(true,validationUtils.isPasswordLengthValid("123456789"));
    }
}