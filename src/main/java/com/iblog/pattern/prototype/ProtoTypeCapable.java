package com.iblog.pattern.prototype;

/**
 * ProtoType pattern interface declaration.
 */
public interface ProtoTypeCapable extends Cloneable {
    ProtoTypeCapable clone() throws CloneNotSupportedException;
}
