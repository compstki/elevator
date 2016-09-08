import java.util.*;

public class OFFICEBLOCK
{
    elevator liftA = new elevator();
    elevator liftB = new elevator(6,false);
    Random randomPeople = new Random();

    int[] floorQs = {0,0,0,0,0,0,0};

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
            floorQ();
            liftA.displayLift();
            // exit random queue (0 - persons on board)
            liftA.exit(randomPeople.nextInt(liftA.getOccupants()+1));
            // board random queue (0-9)
            // liftA is the object
            // board is the method
            // randomPeople.nextInt(10) is the parameter
            // liftA.board(randomPeople.nextInt(10));
            liftA.board(floorQs);
            // move lift
            liftA.moveLift();

            liftB.displayLift();
            liftB.exit(randomPeople.nextInt(liftB.getOccupants()+1));
            liftB.board(floorQs);
            liftB.moveLift();
            // end
        }
        liftA.displayLift();
        System.out.println();
        liftB.displayLift();
    }

    public void floorQ() {
        System.out.println();
        for (int i = 0; i < floorQs.length; i++) {
            floorQs[i] = floorQs[i] + randomPeople.nextInt(3);
            System.out.print("\t"+ floorQs[i] + " ");
        }
        System.out.println();
    }
}
