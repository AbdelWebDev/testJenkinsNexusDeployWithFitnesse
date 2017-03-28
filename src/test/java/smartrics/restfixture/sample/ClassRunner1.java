package smartrics.restfixture.sample;

import java.io.File;
import org.junit.Before;
import org.junit.Test;
import fitnesse.junit.JUnitHelper;

public class ClassRunner1 {

    private JUnitHelper helper;


    @Before
    public void prepare() {
        helper = new JUnitHelper("src/main/ressources", new File("target", "fitnesse-junit").getAbsolutePath());
        helper.setPort(9090);
    }

    @Test
    public void restFixtureTests() throws Exception {
        helper.assertSuitePasses("MyTestSamples.MySimple1");
    }

}

//Chemin = C:\Users\abamri\Desktop\maven-project-fitnesse\src\test\java\smartrics\restfixture\sample
