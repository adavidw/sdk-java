//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.25 at 03:55:04 PM IST 
//


package net.authorize.api.contract.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for auResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="auResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auReasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="profileCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="reasonDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auResponseType", propOrder = {
    "auReasonCode",
    "profileCount",
    "reasonDescription"
})
public class AuResponseType {

    @XmlElement(required = true)
    protected String auReasonCode;
    protected long profileCount;
    @XmlElement(required = true)
    protected String reasonDescription;

    /**
     * Gets the value of the auReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuReasonCode() {
        return auReasonCode;
    }

    /**
     * Sets the value of the auReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuReasonCode(String value) {
        this.auReasonCode = value;
    }

    /**
     * Gets the value of the profileCount property.
     * 
     */
    public long getProfileCount() {
        return profileCount;
    }

    /**
     * Sets the value of the profileCount property.
     * 
     */
    public void setProfileCount(long value) {
        this.profileCount = value;
    }

    /**
     * Gets the value of the reasonDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonDescription() {
        return reasonDescription;
    }

    /**
     * Sets the value of the reasonDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonDescription(String value) {
        this.reasonDescription = value;
    }

}
