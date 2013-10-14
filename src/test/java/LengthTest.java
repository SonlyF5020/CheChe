import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LengthTest {
    @Test
    public void test_same_unit_equal() throws Exception {
        assertThat(new Length((double) 1, Unit.M).equals(new Length((double) 1, Unit.M)),is(true));
        assertThat(new Length((double) 1, Unit.CM).equals(new Length((double) 1, Unit.M)),is(false));
        assertThat(new Length((double) 2, Unit.M).equals(new Length((double) 1, Unit.M)),is(false));
    }

    @Test
    public void test_same_unit_add() throws Exception {
        assertThat(new Length((double) 1, Unit.M).add(new Length((double) 1, Unit.M)),is(new Length((double) 2, Unit.M)));
    }

    @Test
    public void test_same_unit_minus() throws Exception {
        assertThat(new Length((double) 2, Unit.M).minus(new Length((double) 1, Unit.M)),is(new Length((double) 1, Unit.M)));
    }

    @Test
    public void test_diff_unit_equal() throws Exception {
        assertThat(new Length((double) 100, Unit.CM).equals(new Length((double) 1, Unit.M)),is(true));
        assertThat(new Length((double) 100, Unit.CM).equals(new Length((double) 2, Unit.M)),is(false));
    }

    @Test
    public void test_diff_unit_add() throws Exception {
        assertThat(new Length((double) 1, Unit.M).add(new Length((double) 100, Unit.CM)),is(new Length((double) 2, Unit.M)));
    }

    @Test
    public void test_diff_unit_minus() throws Exception {
        assertThat(new Length((double) 1, Unit.M).minus(new Length((double) 100, Unit.CM)),is(new Length((double) 0, Unit.M)));
    }


}
