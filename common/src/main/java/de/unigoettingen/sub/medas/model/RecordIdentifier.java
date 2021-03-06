package de.unigoettingen.sub.medas.model;

import javax.xml.bind.annotation.*;

/**
 * Created by jpanzer on 04.03.14.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recordIdentifier", propOrder = {
        "value"
})
public class RecordIdentifier {

    @XmlTransient
    private final String DEFAULT_TYPE = "gbv-ppn";

    public RecordIdentifier() {
    }

    public RecordIdentifier(String value, String source) {
        this.value = value;
        this.source = source;
    }

    @XmlValue
    private String value;

    @XmlAttribute(name = "source")
    private String source;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;

    }

}
