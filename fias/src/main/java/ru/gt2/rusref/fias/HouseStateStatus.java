package ru.gt2.rusref.fias;

import ru.gt2.rusref.Description;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@Description("Статус состояния домов")
@Entity
@XmlType(propOrder = {"houseStId", "name"})
public class HouseStateStatus implements Serializable {
    @Description("Признак строения")
    @Id
    @Column(nullable = false, scale = 10)
    @NotNull
    @Digits(integer = 10, fraction = 0)
    @XmlAttribute(name = "HOUSESTID", required = true)
    private Integer houseStId;

    // Наличие плюсов с минусами в именах явно намекает на то, что помимо именования нужно ещё пару полей,
    // да и из скобок сокращений лучше убрать.
    @Description("Наименование")
    @Column(nullable = false, length = 60)
    @NotNull
    @Size(min = 1, max = 60)
    @XmlAttribute(name = "NAME", required = true)
    private String name;
}
