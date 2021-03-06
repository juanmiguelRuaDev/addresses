package com.zeroturnaround.rebellabs.addresses.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Neighborhood implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long              id;

    private String            name;

    private Locale            locale;

    public Neighborhood(Long id) {
        this.id = id;
    }

    public String toString() {
        return id == null ? null : id.toString();
    }

    public static Neighborhood valueOf(String value) {
        return new Neighborhood(Long.valueOf(value));
    }

}
