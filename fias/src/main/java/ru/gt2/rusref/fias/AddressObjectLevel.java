package ru.gt2.rusref.fias;

import ru.gt2.rusref.Description;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

@Description("Уровень адресного объекта")
@FiasRef(AddressObjectType.class)
public class AddressObjectLevel {
    @Description("Уровень адресного объекта")
    @Id
    @Column(nullable = false, scale = 10)
    @NotNull
    @Digits(integer = 10, fraction = 0)
    private Integer level;

}