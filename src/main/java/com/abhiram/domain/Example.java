package com.abhiram.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "value"
})
public class Example implements Serializable
{

    @JsonProperty("name")
    private String name;
    @JsonProperty("value")
    private String value;
    private final static long serialVersionUID = 6176239322512713810L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Example() {
    }

    /**
     *
     * @param name
     * @param value
     */
    public Example(String name, String value) {
        super();
        this.name = name;
        this.value = value;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Example withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public Example withValue(String value) {
        this.value = value;
        return this;
    }
}