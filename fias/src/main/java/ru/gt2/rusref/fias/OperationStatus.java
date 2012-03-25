package ru.gt2.rusref.fias;

import lombok.ToString;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * Статус действия.
 */
@ToString
public class OperationStatus {
    /** Идентификатор статуса (ключ) */
    @NotNull
    @Digits(integer = 10, fraction = 0)
    @XmlAttribute(name = "OPERSTATID", required = true)
    private Integer operStatId;

    /** Наименование */
    @NotNull
    @Size(min = 1, max = 100)
    @XmlAttribute(name = "NAME", required = true)
    private String name;
}