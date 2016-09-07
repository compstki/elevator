import java.util.*;

public class OFFICEBLOCK
{
    elevator liftA = new elevator();
    Random randomPeople = new Random();

    public OFFICEBLOCK()
    {

    }

    // make a test story
    // predict the outcome and compare to result
    // OUTCOME: lift A would be on floor 1 with 1 person

    public void testLoop()
    {
        // loop 10 times
        for (int i = 0 ; i <= 15; i++) {
            // exit random queue (0 - persons on board)
            liftA.exit(randomPeople.nextInt(liftA.getOccupants()+1));
            // board random queue (0-9)
            // liftA is the object
            // board is the method
            // randomPeople.nextInt(10) is the parameter
            liftA.board(randomPeople.nextInt(10));
            // move lift
            liftA.moveLift();
            // end
            liftA.displayLift();
        }
    }
}
