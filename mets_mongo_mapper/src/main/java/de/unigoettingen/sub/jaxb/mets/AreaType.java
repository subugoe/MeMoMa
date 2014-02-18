//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.17 at 05:51:52 PM CET 
//


package de.unigoettingen.sub.jaxb.mets;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * areaType: Complex Type for Area linking.
 * 				The area element provides for more sophisticated linking between a div element and content files representing that div, be they text, image, audio, or video files.  An area element can link a div to a point within a file, to a one-dimension segment of a file (e.g., text segment, image line, audio/video clip), or a two-dimensional section of a file 	(e.g, subsection of an image, or a subsection of the  video display of a video file.  The area element has no content; all information is recorded within its various attributes.
 * 			
 * 
 * <p>Java class for areaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="areaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="FILEID" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="SHAPE">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="RECT"/>
 *             &lt;enumeration value="CIRCLE"/>
 *             &lt;enumeration value="POLY"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="COORDS" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BEGIN" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="END" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BETYPE">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="BYTE"/>
 *             &lt;enumeration value="IDREF"/>
 *             &lt;enumeration value="SMIL"/>
 *             &lt;enumeration value="MIDI"/>
 *             &lt;enumeration value="SMPTE-25"/>
 *             &lt;enumeration value="SMPTE-24"/>
 *             &lt;enumeration value="SMPTE-DF30"/>
 *             &lt;enumeration value="SMPTE-NDF30"/>
 *             &lt;enumeration value="SMPTE-DF29.97"/>
 *             &lt;enumeration value="SMPTE-NDF29.97"/>
 *             &lt;enumeration value="TIME"/>
 *             &lt;enumeration value="TCF"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="EXTENT" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EXTTYPE">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="BYTE"/>
 *             &lt;enumeration value="SMIL"/>
 *             &lt;enumeration value="MIDI"/>
 *             &lt;enumeration value="SMPTE-25"/>
 *             &lt;enumeration value="SMPTE-24"/>
 *             &lt;enumeration value="SMPTE-DF30"/>
 *             &lt;enumeration value="SMPTE-NDF30"/>
 *             &lt;enumeration value="SMPTE-DF29.97"/>
 *             &lt;enumeration value="SMPTE-NDF29.97"/>
 *             &lt;enumeration value="TIME"/>
 *             &lt;enumeration value="TCF"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ADMID" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *       &lt;attribute name="CONTENTIDS" type="{http://www.loc.gov/METS/}URIs" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "areaType")
public class AreaType {

    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    @XmlAttribute(name = "FILEID", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object fileid;

    @XmlAttribute(name = "SHAPE")
    protected String shape;

    @XmlAttribute(name = "COORDS")
    protected String coords;

    @XmlAttribute(name = "BEGIN")
    protected String begin;

    @XmlAttribute(name = "END")
    protected String end;

    @XmlAttribute(name = "BETYPE")
    protected String betype;

    @XmlAttribute(name = "EXTENT")
    protected String extent;

    @XmlAttribute(name = "EXTTYPE")
    protected String exttype;

    @XmlAttribute(name = "ADMID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> admids;

    @XmlAttribute(name = "CONTENTIDS")
    protected List<String> contentids;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the fileid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFILEID() {
        return fileid;
    }

    /**
     * Sets the value of the fileid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFILEID(Object value) {
        this.fileid = value;
    }

    /**
     * Gets the value of the shape property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHAPE() {
        return shape;
    }

    /**
     * Sets the value of the shape property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHAPE(String value) {
        this.shape = value;
    }

    /**
     * Gets the value of the coords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOORDS() {
        return coords;
    }

    /**
     * Sets the value of the coords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOORDS(String value) {
        this.coords = value;
    }

    /**
     * Gets the value of the begin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEGIN() {
        return begin;
    }

    /**
     * Sets the value of the begin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEGIN(String value) {
        this.begin = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEND() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEND(String value) {
        this.end = value;
    }

    /**
     * Gets the value of the betype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBETYPE() {
        return betype;
    }

    /**
     * Sets the value of the betype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBETYPE(String value) {
        this.betype = value;
    }

    /**
     * Gets the value of the extent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTENT() {
        return extent;
    }

    /**
     * Sets the value of the extent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTENT(String value) {
        this.extent = value;
    }

    /**
     * Gets the value of the exttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTTYPE() {
        return exttype;
    }

    /**
     * Sets the value of the exttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTTYPE(String value) {
        this.exttype = value;
    }

    /**
     * Gets the value of the admids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the admids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getADMIDS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getADMIDS() {
        if (admids == null) {
            admids = new ArrayList<Object>();
        }
        return this.admids;
    }

    /**
     * Gets the value of the contentids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCONTENTIDS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCONTENTIDS() {
        if (contentids == null) {
            contentids = new ArrayList<String>();
        }
        return this.contentids;
    }

}
