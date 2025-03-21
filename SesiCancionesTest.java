

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class SesiCancionesTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SesiCancionesTest
{
    private MusicOrganizer musicOrg1;

    /**
     * Default constructor for test class SesiCancionesTest
     */
    public SesiCancionesTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        
        
        musicOrg1 = new MusicOrganizer();
        musicOrg1.addFile("Loba - Shakira.mp3");
        musicOrg1.addFile("Bailando - Enrique Iglesias.mp3");
        musicOrg1.addFile("Waka Waka - Shakira.mp3");
        musicOrg1.addFile("Umbrella - Rihanna.mp3");
        musicOrg1.addFile("Iglesias Ardiendo - Manuel Carrasco.mp3");
        musicOrg1.addFile("Can't Remember to Forget You - Rihanna & Shakira.mp3");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
