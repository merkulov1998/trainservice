package generated;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 *
 */
@WebServiceClient(name = "TrainService", targetNamespace = "", wsdlLocation = "file:/D:/javase2017-11/\u043d\u0438\u043a\u0438\u0442\u0430/trainservice/src/main/resources/train.wsdl")
public class TrainService_Service
        extends Service
{

    private final static URL TRAINSERVICE_WSDL_LOCATION;
    private final static WebServiceException TRAINSERVICE_EXCEPTION;
    private final static QName TRAINSERVICE_QNAME = new QName("", "TrainService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/javase2017-11/\u043d\u0438\u043a\u0438\u0442\u0430/trainservice/src/main/resources/train.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TRAINSERVICE_WSDL_LOCATION = url;
        TRAINSERVICE_EXCEPTION = e;
    }

    public TrainService_Service() {
        super(__getWsdlLocation(), TRAINSERVICE_QNAME);
    }

    public TrainService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), TRAINSERVICE_QNAME, features);
    }

    public TrainService_Service(URL wsdlLocation) {
        super(wsdlLocation, TRAINSERVICE_QNAME);
    }

    public TrainService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TRAINSERVICE_QNAME, features);
    }

    public TrainService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TrainService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns TrainService
     */
    @WebEndpoint(name = "TrainServiceSOAP")
    public TrainService getTrainServiceSOAP() {
        return super.getPort(new QName("", "TrainServiceSOAP"), TrainService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TrainService
     */
    @WebEndpoint(name = "TrainServiceSOAP")
    public TrainService getTrainServiceSOAP(WebServiceFeature... features) {
        return super.getPort(new QName("", "TrainServiceSOAP"), TrainService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TRAINSERVICE_EXCEPTION!= null) {
            throw TRAINSERVICE_EXCEPTION;
        }
        return TRAINSERVICE_WSDL_LOCATION;
    }

}