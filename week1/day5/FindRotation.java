import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

public class FindRotation {

public int findRotationPoint(String[] words)
    {
        if(words.length==0)
            return -1;
        else if(words.length==1)
            return 0;
        else
        {
            int low=0;
            int high=words.length-1;
            while(low<=high)
            {
                int mid=low+(high-low)/2;
                if(mid!=0)
                {
                    if (words[mid - 1].compareTo(words[mid]) > 0)
                        return mid;
                }
                if(mid!=words.length-1) {
                    if (words[mid].compareTo(words[mid + 1]) > 0)
                        return mid + 1;
                }

                if(words[low].compareTo(words[mid])>0)
                {
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }


            }
            return 0;

        }
    }


















    // tests

    @Test
    public void smallArrayTest() {
        final int actual = findRotationPoint(new String[] {"cape", "cake"});
        final int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void mediumArrayTest() {
        final int actual = findRotationPoint(new String[] {"grape", "orange", "plum",
            "radish", "apple"});
        final int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void largeArrayTest() {
        final int actual = findRotationPoint(
            new String[] {"ptolemaic", "retrograde", "supplant", "undulate", "xenoepist",
            "asymptote", "babka", "banoffee", "engender", "karpatka", "othellolagkage"});
        final int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void possiblyMissingEdgeCaseTest() {
        // are we missing any edge cases?
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Solution.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("All tests passed.");
        }
    }
}
