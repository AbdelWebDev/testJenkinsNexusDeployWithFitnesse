package smartrics.restfixture.sample;

/**
 * Created by ABAMRI on 28/03/2017.
 */

import fitnesse.junit.JUnitHelper;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class ClassRunner5 {

    private JUnitHelper helper;


    @Before
    public void prepare() {
        helper = new JUnitHelper("src/main/ressources", new File("target", "fitnesse-junit").getAbsolutePath());
        helper.setPort(9090);
    }

    @Test
    public void restFixtureTests() throws Exception {
        helper.assertSuitePasses("MyTestSamples.MySimple5");
    }

}