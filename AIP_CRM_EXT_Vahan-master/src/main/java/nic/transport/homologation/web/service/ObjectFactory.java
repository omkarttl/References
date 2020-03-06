
package nic.transport.homologation.web.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nic.transport.homologation.web.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InventoryDetails_QNAME = new QName("http://service.web.homologation.transport.nic/", "InventoryDetails");
    private final static QName _Upload_QNAME = new QName("http://service.web.homologation.transport.nic/", "upload");
    private final static QName _UploadResponse_QNAME = new QName("http://service.web.homologation.transport.nic/", "uploadResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nic.transport.homologation.web.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InventoryDetailsDobj }
     * 
     */
    public InventoryDetailsDobj createInventoryDetailsDobj() {
        return new InventoryDetailsDobj();
    }

    /**
     * Create an instance of {@link Upload }
     * 
     */
    public Upload createUpload() {
        return new Upload();
    }

    /**
     * Create an instance of {@link UploadResponse }
     * 
     */
    public UploadResponse createUploadResponse() {
        return new UploadResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryDetailsDobj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.homologation.transport.nic/", name = "InventoryDetails")
    public JAXBElement<InventoryDetailsDobj> createInventoryDetails(InventoryDetailsDobj value) {
        return new JAXBElement<InventoryDetailsDobj>(_InventoryDetails_QNAME, InventoryDetailsDobj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Upload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.homologation.transport.nic/", name = "upload")
    public JAXBElement<Upload> createUpload(Upload value) {
        return new JAXBElement<Upload>(_Upload_QNAME, Upload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.homologation.transport.nic/", name = "uploadResponse")
    public JAXBElement<UploadResponse> createUploadResponse(UploadResponse value) {
        return new JAXBElement<UploadResponse>(_UploadResponse_QNAME, UploadResponse.class, null, value);
    }

}
