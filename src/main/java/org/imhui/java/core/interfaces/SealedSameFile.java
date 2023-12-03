package org.imhui.java.core.interfaces;

/**
 * @author: imhuis
 * @date: 2023/12/3
 * @description:
 */
sealed class ABC{}

// 同一个文件不需要permits
final class A extends ABC{}

final class B extends ABC{}


public class SealedSameFile {
}
