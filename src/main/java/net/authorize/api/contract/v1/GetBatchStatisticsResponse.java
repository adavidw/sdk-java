//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.25 at 03:55:04 PM IST 
//


package net.authorize.api.contract.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ANetApiResponse">
 *       &lt;sequence>
 *         &lt;element name="batch" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}batchDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "batch"
})
@XmlRootElement(name = "getBatchStatisticsResponse")
public class GetBatchStatisticsResponse
    extends ANetApiResponse
{

    protected BatchDetailsType batch;

    /**
     * Gets the value of the batch property.
     * 
     * @return
     *     possible object is
     *     {@link BatchDetailsType }
     *     
     */
    public BatchDetailsType getBatch() {
        return batch;
    }

    /**
     * Sets the value of the batch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchDetailsType }
     *     
     */
    public void setBatch(BatchDetailsType value) {
        this.batch = value;
    }

}
