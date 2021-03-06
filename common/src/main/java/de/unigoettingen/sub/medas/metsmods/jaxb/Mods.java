//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.24 at 04:05:56 PM CET 
//


package de.unigoettingen.sub.medas.metsmods.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for modsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.loc.gov/mods/v3}modsGroup" maxOccurs="unbounded"/>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="version" type="{http://www.loc.gov/mods/v3}versionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modsType", propOrder = {
    "elements"
})
@XmlRootElement(name = "mods")
public class Mods {

    @XmlElements({
        @XmlElement(name = "titleInfo", type = TitleInfoType.class),
        @XmlElement(name = "name", type = NameType.class),
        @XmlElement(name = "typeOfResource", type = TypeOfResourceType.class),
        @XmlElement(name = "genre", type = GenreType.class),
        @XmlElement(name = "originInfo", type = OriginInfoType.class),
        @XmlElement(name = "language", type = LanguageType.class),
        @XmlElement(name = "physicalDescription", type = PhysicalDescriptionType.class),
        @XmlElement(name = "abstract", type = AbstractType.class),
        @XmlElement(name = "tableOfContents", type = TableOfContentsType.class),
        @XmlElement(name = "targetAudience", type = TargetAudienceType.class),
        @XmlElement(name = "note", type = NoteType.class),
        @XmlElement(name = "subject", type = SubjectType.class),
        @XmlElement(name = "classification", type = ClassificationType.class),
        @XmlElement(name = "relatedItem", type = RelatedItemType.class),
        @XmlElement(name = "identifier", type = IdentifierType.class),
        @XmlElement(name = "location", type = LocationType.class),
        @XmlElement(name = "accessCondition", type = AccessConditionType.class),
        @XmlElement(name = "part", type = PartType.class),
        @XmlElement(name = "extension", type = ExtensionType.class),
        @XmlElement(name = "recordInfo", namespace = "http://www.loc.gov/mods/v3", type = RecordInfoType.class)
    })
    protected List<Object> elements;

    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Gets the value of the titleInfosAndNamesAndTypeOfResources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titleInfosAndNamesAndTypeOfResources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitleInfosAndNamesAndTypeOfResources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TitleInfoType }
     * {@link NameType }
     * {@link TypeOfResourceType }
     * {@link GenreType }
     * {@link OriginInfoType }
     * {@link LanguageType }
     * {@link PhysicalDescriptionType }
     * {@link AbstractType }
     * {@link TableOfContentsType }
     * {@link TargetAudienceType }
     * {@link NoteType }
     * {@link SubjectType }
     * {@link ClassificationType }
     * {@link RelatedItemType }
     * {@link IdentifierType }
     * {@link LocationType }
     * {@link AccessConditionType }
     * {@link PartType }
     * {@link ExtensionType }
     * {@link RecordInfoType }
     * 
     * 
     */
    public List<Object> getElements() {
        if (elements == null) {
            elements = new ArrayList<Object>();
        }
        return this.elements;
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
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
