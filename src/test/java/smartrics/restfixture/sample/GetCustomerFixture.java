package smartrics.restfixture.sample;

import nl.hsac.fitnesse.fixture.fit.SoapCallMapColumnFixture;
import nl.hsac.fitnesse.fixture.util.XmlHttpResponse;

public class GetCustomerFixture extends SoapCallMapColumnFixture<XmlHttpResponse> {

    static {
        registerNs("wsX", "http://localhost:8040/services");
    }

    public GetCustomerFixture() {
        super(XmlHttpResponse.class);
        setTemplateName("samplePost.ftl.xml");
    }

    @Override
    protected XmlHttpResponse callService() {
        return callServiceImpl("customerUrl", "http://localhost:8040/services/CustomerService");
    }

    public String customerResult() {
        String result = getRawResponse().getXPath("//Phone/text()");
        return xmlAsHtml(result);
    }
}
