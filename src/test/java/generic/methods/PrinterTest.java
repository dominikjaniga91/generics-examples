package generic.methods;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.List;


@Test(groups = "Teacher")
public class PrinterTest {

    @Test
    public void printMeShouldPrintListOfPeopleToConsole() {
        //given
        var people = List.of(new Person(1, "Jan", "Kowalski", LocalDate.now()),
                             new Person(2, "Marek", "Kowalski", LocalDate.now()));
        var byteStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteStream));
        String expected = """
                            Name: Jan, Surname: Kowalski
                            Name: Marek, Surname: Kowalski
                            """;
        //when
        Printer.printMe(people);

        //then
        Assert.assertEquals(byteStream.toString(), expected);
    }
}
