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
}
