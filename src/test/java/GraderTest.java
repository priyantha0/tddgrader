import org.junit.Assert;
import org.junit.Test;

public class GraderTest {
    // 75inc -> 100inc = A
    // 65inc -> 74inc  = B
    // 55inc -> 64inc  = C
    // 0inc -> 54inc = F

    @Test
    public void graderShouldReturnAFor75() {
        var grader = new com.test.Grader();
        Assert.assertEquals("A", grader.grade(75));
    }

    @Test
    public void graderShouldReturnAFor100() {
        var grader = new com.test.Grader();
        Assert.assertEquals("A", grader.grade(100));
    }

    @Test
    public void graderShouldReturnBFor65() {
        var grader = new com.test.Grader();
        Assert.assertEquals("B", grader.grade(65));
    }

    @Test
    public void graderShouldReturnBFor74() {
        var grader = new com.test.Grader();
        Assert.assertEquals("B", grader.grade(74));
    }

    @Test
    public void graderShouldReturnCFor55() {
        var grader = new com.test.Grader();
        Assert.assertEquals("C", grader.grade(55));
    }

    @Test
    public void graderShouldReturnCFor64() {
        var grader = new com.test.Grader();
        Assert.assertEquals("C", grader.grade(64));
    }

    @Test
    public void graderShouldReturnFFor0() {
        var grader = new com.test.Grader();
        Assert.assertEquals("F", grader.grade(0));
    }

    @Test
    public void graderShouldReturnFFor54() {
        var grader = new com.test.Grader();
        Assert.assertEquals("F", grader.grade(54));
    }

    @Test(expected = IllegalArgumentException.class)
    public void lessThan0ShouldReturnError() {
        var grader = new com.test.Grader();
        grader.grade(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void greaterThan100ShouldReturnError() {
        var grader = new com.test.Grader();
        grader.grade(101);
    }
}
