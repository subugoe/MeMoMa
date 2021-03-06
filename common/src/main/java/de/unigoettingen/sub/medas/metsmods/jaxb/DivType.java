//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.24 at 04:05:56 PM CET 
//


package de.unigoettingen.sub.medas.metsmods.jaxb;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Div Complex Type
 * 					The METS standard represents a document structurally as a series of nested div elements, that is, as a hierarchy (e.g., a book, which is composed of chapters, which are composed of subchapters, which are composed of text).  Every div node in the structural map hierarchy may be connected (via subsidiary mptr or fptr 	elements) to content files which represent that div's portion of the whole document.
 * 
 * SPECIAL NOTE REGARDING DIV ATTRIBUTE VALUES:
 * to clarify the differences between the ORDER, ORDERLABEL, and LABEL attributes for the <div> element, imagine a text with 10 roman numbered pages followed by 10 arabic numbered pages. Page iii would have an ORDER of "3", an ORDERLABEL of "iii" and a LABEL of "Page iii", while page 3 would have an ORDER of "13", an ORDERLABEL of "3" and a LABEL of "Page 3".
 * 			
 * 
 * <p>Java class for divType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="divType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mptr" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.w3.org/1999/xlink}simpleLink"/>
 *                 &lt;attGroup ref="{http://www.loc.gov/METS/}LOCATION"/>
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                 &lt;attribute name="CONTENTIDS" type="{http://www.loc.gov/METS/}URIs" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="fptr" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="par" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="area" type="{http://www.loc.gov/METS/}areaType" maxOccurs="unbounded"/>
 *                             &lt;element name="seq" type="{http://www.loc.gov/METS/}seqType" maxOccurs="unbounded"/>
 *                           &lt;/choice>
 *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="seq" type="{http://www.loc.gov/METS/}seqType" minOccurs="0"/>
 *                   &lt;element name="area" type="{http://www.loc.gov/METS/}areaType" minOccurs="0"/>
 *                 &lt;/choice>
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                 &lt;attribute name="FILEID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *                 &lt;attribute name="CONTENTIDS" type="{http://www.loc.gov/METS/}URIs" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="div" type="{http://www.loc.gov/METS/}divType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="ORDER" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ORDERLABEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DMDID" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *       &lt;attribute name="ADMID" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *       &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CONTENTIDS" type="{http://www.loc.gov/METS/}URIs" />
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}label"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "divType", namespace = "http://www.loc.gov/METS/", propOrder = {
    "mptrs",
    "fptrs",
    "divs"
})
public class DivType {

    @XmlElement(name = "mptr")
    protected List<DivType.Mptr> mptrs;
    @XmlElement(name = "fptr")
    protected List<DivType.Fptr> fptrs;
    @XmlElement(name = "div")
    protected List<DivType> divs;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "ORDER")
    protected BigInteger order;
    @XmlAttribute(name = "ORDERLABEL")
    protected String orderlabel;
    @XmlAttribute(name = "LABEL")
    protected String label;

    @XmlAttribute(name = "DMDID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> dmdids;

    @XmlAttribute(name = "ADMID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> admids;

    @XmlAttribute(name = "TYPE")
    protected String type;

    @XmlAttribute(name = "CONTENTIDS")
    protected List<String> contentids;

    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    protected String xlinkLabel;

    /**
     * Gets the value of the mptrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mptrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMptrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DivType.Mptr }
     * 
     * 
     */
    public List<DivType.Mptr> getMptrs() {
        if (mptrs == null) {
            mptrs = new ArrayList<DivType.Mptr>();
        }
        return this.mptrs;
    }

    /**
     * Gets the value of the fptrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fptrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFptrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DivType.Fptr }
     * 
     * 
     */
    public List<DivType.Fptr> getFptrs() {
        if (fptrs == null) {
            fptrs = new ArrayList<DivType.Fptr>();
        }
        return this.fptrs;
    }

    /**
     * Gets the value of the divs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the divs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDivs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DivType }
     * 
     * 
     */
    public List<DivType> getDivs() {
        if (divs == null) {
            divs = new ArrayList<DivType>();
        }
        return this.divs;
    }

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
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getORDER() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setORDER(BigInteger value) {
        this.order = value;
    }

    /**
     * Gets the value of the orderlabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERLABEL() {
        return orderlabel;
    }

    /**
     * Sets the value of the orderlabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERLABEL(String value) {
        this.orderlabel = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLABEL() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLABEL(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the dmdids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dmdids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDMDIDS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getDMDIDS() {
        if (dmdids == null) {
            dmdids = new ArrayList<Object>();
        }
        return this.dmdids;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPE(String value) {
        this.type = value;
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

    /**
     * xlink:label - an xlink label to be referred to by an smLink element
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXlinkLabel() {
        return xlinkLabel;
    }

    /**
     * Sets the value of the xlinkLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXlinkLabel(String value) {
        this.xlinkLabel = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="par" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="area" type="{http://www.loc.gov/METS/}areaType" maxOccurs="unbounded"/>
     *                   &lt;element name="seq" type="{http://www.loc.gov/METS/}seqType" maxOccurs="unbounded"/>
     *                 &lt;/choice>
     *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="seq" type="{http://www.loc.gov/METS/}seqType" minOccurs="0"/>
     *         &lt;element name="area" type="{http://www.loc.gov/METS/}areaType" minOccurs="0"/>
     *       &lt;/choice>
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *       &lt;attribute name="FILEID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *       &lt;attribute name="CONTENTIDS" type="{http://www.loc.gov/METS/}URIs" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "area",
        "seq",
        "par"
    })
    public static class Fptr {

        @XmlElement(namespace = "http://www.loc.gov/METS/")
        protected AreaType area;
        @XmlElement(namespace = "http://www.loc.gov/METS/")
        protected SeqType seq;
        @XmlElement(namespace = "http://www.loc.gov/METS/")
        protected DivType.Fptr.Par par;
        @XmlAttribute(name = "ID")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;
        @XmlAttribute(name = "FILEID")
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        protected Object fileid;
        @XmlAttribute(name = "CONTENTIDS")
        protected List<String> contentids;

        /**
         * Gets the value of the area property.
         * 
         * @return
         *     possible object is
         *     {@link AreaType }
         *     
         */
        public AreaType getArea() {
            return area;
        }

        /**
         * Sets the value of the area property.
         * 
         * @param value
         *     allowed object is
         *     {@link AreaType }
         *     
         */
        public void setArea(AreaType value) {
            this.area = value;
        }

        /**
         * Gets the value of the seq property.
         * 
         * @return
         *     possible object is
         *     {@link SeqType }
         *     
         */
        public SeqType getSeq() {
            return seq;
        }

        /**
         * Sets the value of the seq property.
         * 
         * @param value
         *     allowed object is
         *     {@link SeqType }
         *     
         */
        public void setSeq(SeqType value) {
            this.seq = value;
        }

        /**
         * Gets the value of the par property.
         * 
         * @return
         *     possible object is
         *     {@link DivType.Fptr.Par }
         *     
         */
        public DivType.Fptr.Par getPar() {
            return par;
        }

        /**
         * Sets the value of the par property.
         * 
         * @param value
         *     allowed object is
         *     {@link DivType.Fptr.Par }
         *     
         */
        public void setPar(DivType.Fptr.Par value) {
            this.par = value;
        }

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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;choice>
         *         &lt;element name="area" type="{http://www.loc.gov/METS/}areaType" maxOccurs="unbounded"/>
         *         &lt;element name="seq" type="{http://www.loc.gov/METS/}seqType" maxOccurs="unbounded"/>
         *       &lt;/choice>
         *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "seqs",
            "areas"
        })
        public static class Par {

            @XmlElement(name = "seq", namespace = "http://www.loc.gov/METS/")
            protected List<SeqType> seqs;
            @XmlElement(name = "area", namespace = "http://www.loc.gov/METS/")
            protected List<AreaType> areas;
            @XmlAttribute(name = "ID")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String id;

            /**
             * Gets the value of the seqs property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the seqs property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSeqs().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SeqType }
             * 
             * 
             */
            public List<SeqType> getSeqs() {
                if (seqs == null) {
                    seqs = new ArrayList<SeqType>();
                }
                return this.seqs;
            }

            /**
             * Gets the value of the areas property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the areas property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAreas().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AreaType }
             * 
             * 
             */
            public List<AreaType> getAreas() {
                if (areas == null) {
                    areas = new ArrayList<AreaType>();
                }
                return this.areas;
            }

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

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}simpleLink"/>
     *       &lt;attGroup ref="{http://www.loc.gov/METS/}LOCATION"/>
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *       &lt;attribute name="CONTENTIDS" type="{http://www.loc.gov/METS/}URIs" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Mptr {

        @XmlAttribute(name = "ID")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;
        @XmlAttribute(name = "CONTENTIDS")
        protected List<String> contentids;
        @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
        protected String xlinkType;
        @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
        @XmlSchemaType(name = "anyURI")
        protected String href;
        @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
        protected String role;
        @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
        protected String arcrole;
        @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
        protected String title;
        @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
        protected String show;
        @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
        protected String actuate;
        @XmlAttribute(name = "LOCTYPE", required = true)
        protected String loctype;
        @XmlAttribute(name = "OTHERLOCTYPE")
        protected String otherloctype;

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

        /**
         * Gets the value of the xlinkType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXlinkType() {
            if (xlinkType == null) {
                return "simple";
            } else {
                return xlinkType;
            }
        }

        /**
         * Sets the value of the xlinkType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXlinkType(String value) {
            this.xlinkType = value;
        }

        /**
         * Gets the value of the href property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHref() {
            return href;
        }

        /**
         * Sets the value of the href property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHref(String value) {
            this.href = value;
        }

        /**
         * Gets the value of the role property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRole() {
            return role;
        }

        /**
         * Sets the value of the role property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRole(String value) {
            this.role = value;
        }

        /**
         * Gets the value of the arcrole property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getArcrole() {
            return arcrole;
        }

        /**
         * Sets the value of the arcrole property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArcrole(String value) {
            this.arcrole = value;
        }

        /**
         * Gets the value of the title property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle() {
            return title;
        }

        /**
         * Sets the value of the title property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitle(String value) {
            this.title = value;
        }

        /**
         * Gets the value of the show property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShow() {
            return show;
        }

        /**
         * Sets the value of the show property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShow(String value) {
            this.show = value;
        }

        /**
         * Gets the value of the actuate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActuate() {
            return actuate;
        }

        /**
         * Sets the value of the actuate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActuate(String value) {
            this.actuate = value;
        }

        /**
         * Gets the value of the loctype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLOCTYPE() {
            return loctype;
        }

        /**
         * Sets the value of the loctype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLOCTYPE(String value) {
            this.loctype = value;
        }

        /**
         * Gets the value of the otherloctype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOTHERLOCTYPE() {
            return otherloctype;
        }

        /**
         * Sets the value of the otherloctype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOTHERLOCTYPE(String value) {
            this.otherloctype = value;
        }

    }

}
