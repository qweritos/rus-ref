package ru.gt2.rusref.fias;

import lombok.ToString;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * Статус интервалов домов.
 */
@ToString
public class IntervalStatus {
    /** Идентификатор статуса. */
    @NotNull
    @Digits(integer = 10, fraction = 0)
    @XmlAttribute(name = "INTVSTATID", required = true)
    private Integer intStatId;

    /** Наименование */
    @NotNull
    @Size(min = 1, max = 60)
    @XmlAttribute(name = "NAME", required = true)
    private String name;
}
