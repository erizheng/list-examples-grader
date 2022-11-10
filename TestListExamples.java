import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class LongChecker implements StringChecker{
  @Override
  public boolean checkString(String s){
    if(s.length() > 5){
      return true;
    }else{
      return false;
    }
  }
}

public class TestListExamples {
  // Write your grading tests here!
  @Test 
    public void testFilter(){
        List<String> input = new ArrayList<String>(Arrays.asList("hi", "bye"));
        List<String> result = new ArrayList<String>();

        assertArrayEquals(result.toArray(), ListExamples.filter(input, new LongChecker()).toArray());
    }

    @Test 
    public void testFilter2(){
        List<String> input = new ArrayList<String>(Arrays.asList());
        List<String> result = new ArrayList<String>();

        assertArrayEquals(result.toArray(), ListExamples.filter(input, new LongChecker()).toArray());
    }
    @Test 
    public void testFilter3(){
        List<String> input = new ArrayList<String>(Arrays.asList("thisthing", "thatthing", "no", "yes"));
        List<String> result = new ArrayList<String>(Arrays.asList("thisthing", "thatthing"));

        assertArrayEquals(result.toArray(), ListExamples.filter(input, new LongChecker()).toArray());
    }
    @Test 
    public void testFilter4(){
        List<String> input = new ArrayList<String>(Arrays.asList("thisthing", "thatthing"));
        List<String> result = new ArrayList<String>(Arrays.asList("thisthing", "thatthing"));

        assertArrayEquals(result.toArray(), ListExamples.filter(input, new LongChecker()).toArray());
    }

    @Test
    public void testMerge(){
        List<String> input = new ArrayList<String>(Arrays.asList("a", "b"));
        List<String> input2 = new ArrayList<String>(Arrays.asList("c", "d"));
        List<String> result = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));

        assertArrayEquals(result.toArray(), ListExamples.merge(input, input2).toArray());
    }

}
