package generic.methods;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Test(groups = "Teacher")
public class ArgumentsTest {


    @Test
    public void shouldReturnMax_fromGivenIntegerNumbers() {
        //given
        int expected = 80;

        //when
        int actual = Arguments.max(45,36,24,47,80,69,35,46,58);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnMax_fromGivenDoubleNumbers() {
        //given
        double expected = 45.46;

        //when
        double actual = Arguments.max(45.45,36.26,24.26,43.5,45.46,18.1);

        //then
        assertThat(actual).isEqualTo(expected);
    }
}
