import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CaculatorTest {
    public Caculator caculator;
    @Test
    public void should_be_6_when_less_than_2_km() throws Exception {
        caculator = new Caculator();
        assertThat(caculator.caculate(1.0),is(6.0));
    }

    @Test
    public void should_be_9_when_more_than_2_km() throws Exception {
        caculator = new Caculator();
        assertThat(caculator.caculate(7.0),is(9.0));
    }

    @Test
    public void should_be_12_when_more_than_8_km() throws Exception {
        caculator = new Caculator();
        assertThat(caculator.caculate(10.0),is(12.0));
    }

    @Test
    public void should_be_13_when_more_than_8_km_and_wait_1_hour() throws Exception {
        caculator = new Caculator();
        assertThat(caculator.caculate(10.0,1.0),is(13.0));
    }
}
