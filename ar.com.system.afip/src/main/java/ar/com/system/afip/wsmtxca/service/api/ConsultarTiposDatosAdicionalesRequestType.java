
package ar.com.system.afip.wsmtxca.service.api;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultarTiposDatosAdicionalesRequestType complex type.</p>
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 *
 * <pre>
 * &lt;complexType name="ConsultarTiposDatosAdicionalesRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authRequest" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}AuthRequestType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarTiposDatosAdicionalesRequestType", propOrder = {
        "authRequest"
})
@Root(name = "consultarTiposDatosAdicionalesRequest")
@Namespace(reference = MTXCAServicePortType.SERVICE_NAMESPACE)
public class ConsultarTiposDatosAdicionalesRequestType {

    @XmlElement(required = true)
    @Element
    protected AuthRequestType authRequest;

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

}
