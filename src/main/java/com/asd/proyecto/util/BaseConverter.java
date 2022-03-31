package com.asd.proyecto.util;

import org.mapstruct.IterableMapping;
import org.mapstruct.Named;

import java.util.stream.Stream;

public interface BaseConverter<LEFT, RIGHT> {

    @Named("rightToLeft")
    LEFT rightToLeft(RIGHT right);

    @Named("leftToRight")
    RIGHT leftToRight(LEFT left);

    @IterableMapping(qualifiedByName = "leftToRight")
    Stream<RIGHT> leftToRight(Iterable<LEFT> left);

    @IterableMapping(qualifiedByName = "rightToLeft")
    Stream<LEFT> rightToLeft(Iterable<RIGHT> right);
}
