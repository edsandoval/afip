
package ar.com.system.afip.wsmtxca.service.api;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import static com.google.common.base.Preconditions.checkNotNull;


/**
 * <p>Clase Java para InformarComprobanteCAEARequestType complex type.</p>
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 *
 * <pre>
 * &lt;complexType name="InformarComprobanteCAEARequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authRequest" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}AuthRequestType"/>
 *         &lt;element name="comprobanteCAEARequest" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}ComprobanteType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformarComprobanteCAEARequestType", propOrder = {
        "authRequest",
        "comprobanteCAEARequest"
})
@Root(name = "informarComprobanteCAEARequest")
@Namespace(reference = MTXCAServicePortType.SERVICE_NAMESPACE)
public class InformarComprobanteCAEARequestType {

    @XmlElement(required = true)
    @Element
    protected AuthRequestType authRequest;
    @XmlElement(required = true)
    @Element
    protected ComprobanteType comprobanteCAEARequest;

    public InformarComprobanteCAEARequestType(AuthRequestType authRequest, ComprobanteType comprobanteCAEARequest) {
        this.authRequest = checkNotNull(authRequest);
        this.comprobanteCAEARequest = checkNotNull(comprobanteCAEARequest);
    }

    /**
     * Obtiene el valor de la propiedad authRequest.
     *
     * @return possible object is
     * {@link AuthRequestType }
     */
    public AuthRequestType getAuthRequest() {
        return authRequest;
    }

    /**
     * Define el valor de la propiedad authRequest.
     *
     * @param value allowed object is
     *              {@link AuthRequestType }
     */
    public void setAuthRequest(AuthRequestType value) {
        this.authRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad comprobanteCAEARequest.
     *
     * @return possible object is
     * {@link ComprobanteType }
     */
    public ComprobanteType getComprobanteCAEARequest() {
        return comprobanteCAEARequest;
    }

    /**
     * Define el valor de la propiedad comprobanteCAEARequest.
     *
     * @param value allowed object is
     *              {@link ComprobanteType }
     */
    public void setComprobanteCAEARequest(ComprobanteType value) {
        this.comprobanteCAEARequest = value;
    }

}
