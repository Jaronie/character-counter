import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest {

    @Test
    public void testCharacterCountFreq(){
        //Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello");
        //Act
        int actual = counter.getFrequency('l');


        //Assert
        assertEquals(2, actual);
    }

    @Test
    public void testGetRelativeFreqMissingChar(){
        //Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello");

        //Act
        double actual = counter.getRelativePercentage('x');

        //Assert
        assertEquals(0.0, actual, 0.001);
    }
    
}