package test.be.jadv.util;

import be.jadv.util.MyHelperClass;
import org.junit.jupiter.api.Assertions;

class MyHelperClassTest {

    MyHelperClass myHelperClass = new MyHelperClass();

    @org.junit.jupiter.api.Test
    void add2NumbersNegativeNumberTest() {
        Assertions.assertEquals(-1,
                myHelperClass.add2Numbers(100, -1400));
    }
}