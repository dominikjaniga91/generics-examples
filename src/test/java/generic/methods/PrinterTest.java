package generic.methods;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.List;


@Test(groups = "Teacher")
public class PrinterTest {
    private ByteArrayOutputStream byteStream;

    @BeforeMethod
    public void setUp() {
        byteStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteStream));
    }

    @Test
    public void printMeShouldPrintListOfPeopleToConsole() {
        //given
        var people = List.of(new Person(1, "Jan", "Kowalski", LocalDate.now()),
                             new Person(2, "Marek", "Kowalski", LocalDate.now()));
        String expected = """
                            Name: Jan, Surname: Kowalski
                            Name: Marek, Surname: Kowalski
                            """;
        //when
        Printer.printMe(people);

        //then
        Assert.assertEquals(byteStream.toString(), expected);
    }

    @Test
    public void printMeShouldPrintListOfNumbersToConsole() {
        //given
        var numbers = List.of(1, 2, 3, 4);
        String expected = """
                            1
                            2
                            3
                            4
                            """;
        //when
        Printer.printMe(numbers);

        //then
        Assert.assertEquals(byteStream.toString(), expected);
    }
}
