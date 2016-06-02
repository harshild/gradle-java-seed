import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by harshild on 6/2/2016.
 */
public class SampleTest {
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void itShouldReturnTrue() throws Exception {
        Assert.assertTrue(Sample.sample());
    }

}