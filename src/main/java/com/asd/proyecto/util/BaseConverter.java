package com.asd.proyecto.util;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.IterableMapping;
import org.mapstruct.Named;

import java.util.stream.Stream;

public interface BaseConverter<LEFT, RIGHT> {

    @InheritConfiguration
    @Named("rightToLeft")
    LEFT rightToLeft(RIGHT right);

    @InheritConfiguration
    @Named("leftToRight")
    RIGHT leftToRight(LEFT left);

    @InheritConfiguration
    @IterableMapping(qualifiedByName = "leftToRight")
    Stream<RIGHT> leftToRight(Iterable<LEFT> left);

    @InheritConfiguration
    @IterableMapping(qualifiedByName = "rightToLeft")
    Stream<LEFT> rightToLeft(Iterable<RIGHT> right);
}
