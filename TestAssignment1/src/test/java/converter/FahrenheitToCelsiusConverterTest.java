package converter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FahrenheitToCelsiusConverterTest {

    @Test
    public void mustBeAbleToCreateConverter(){
        // Arrange
        FahrenheitToCelsiusConverter test = new FahrenheitToCelsiusConverter();

        // Act

        // Assert
        assertEquals(35.0, test.convert(95.0), 0.1);

    }
}
