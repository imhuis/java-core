package org.imhui.java.core.jdk8;

/**
 * @author: imhuis
 * @date: 2022/2/2
 * @description:
 */
@FunctionalInterface
public interface InterfaceWithException {

    void apply(String a) throws Exception;
}
