package nic.transport.homologation.web.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2019-12-17T18:42:47.889+05:30
 * Generated source version: 3.2.4
 *
 */
@WebServiceClient(name = "dataportws",
                  wsdlLocation = "file:/Users/redhat/Documents/TML/Vahan/fuse_vahan/src/main/resources/esb_vahan.wsdl",
                  targetNamespace = "http://service.web.homologation.transport.nic/")
public class Dataportws_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.web.homologation.transport.nic/", "dataportws");
    public final static QName DataportwsPort = new QName("http://service.web.homologation.transport.nic/", "dataportwsPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/redhat/Documents/TML/Vahan/fuse_vahan/src/main/resources/esb_vahan.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Dataportws_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/Users/redhat/Documents/TML/Vahan/fuse_vahan/src/main/resources/esb_vahan.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Dataportws_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Dataportws_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Dataportws_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public Dataportws_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Dataportws_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Dataportws_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns Dataportws
     */
    @WebEndpoint(name = "dataportwsPort")
    public Dataportws getDataportwsPort() {
        return super.getPort(DataportwsPort, Dataportws.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Dataportws
     */
    @WebEndpoint(name = "dataportwsPort")
    public Dataportws getDataportwsPort(WebServiceFeature... features) {
        return super.getPort(DataportwsPort, Dataportws.class, features);
    }

}
