package smartrics.restfixture.sample;

/**
 * Created by ABAMRI on 28/03/2017.
 */
import java.io.File;
import org.junit.Before;
import org.junit.Test;
import fitnesse.junit.JUnitHelper;

public class ClassRunner2 {

    private JUnitHelper helper;


    @Before
    public void prepare() {
        helper = new JUnitHelper("src/main/ressources", new File("target", "fitnesse-junit").getAbsolutePath());
        helper.setPort(9090);
    }

    @Test
    public void restFixtureTests() throws Exception {
        helper.assertSuitePasses("MyTestSamples.MySimple2");
    }

}