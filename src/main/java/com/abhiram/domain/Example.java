package com.abhiram.domain;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "value"
})
@Data
@ToString
public class Example implements Serializable
{
    @JsonProperty(value = "name")
    private String name;
    @JsonProperty("value")
    private String value;
    @JsonCreator
    public Example(@JsonProperty(value = "name") String name) {
        this.name = name;
    }
}