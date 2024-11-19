package org.cis120;

public interface Shape extends Area, Displaceable {
    Rectangle getBoundingBox();
}
