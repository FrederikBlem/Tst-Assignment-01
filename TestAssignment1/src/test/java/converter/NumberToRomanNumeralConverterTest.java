package converter;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class NumberToRomanNumeralConverterTest {
    private NumberToRomanNumeralConverter test;

    @BeforeEach
    public void setup()
    {
        test = new NumberToRomanNumeralConverter();
    }

    @Test
    public void testTwentyNineMustEqualXXIX() {
        // Arrange
        // Act
        // Assert
        assertEquals("XXIX", test.convert(29));

    }
    @Test
    public void testThreeHundredAndFortySevenMustEqualCCCXLVII() {
        // Arrange
        // Act
        // Assert
        assertEquals("CCCXLVII", test.convert(347));

    }
    @Test
    public void testSixHundredAndEightySixMustEqualDCLXXXVI() {
        // Arrange
        // Act
        // Assert
        assertEquals("DCLXXXVI", test.convert(686));

    }
    @Test
    public void testTwoThousandFourHundredAndSixtyNineMustEqualMMCDLXIX() {
        // Arrange
        // Act
        // Assert
        assertEquals("MMCDLXIX", test.convert(2469));

    }
}
