package org.imhui.java.core.interfaces;

/**
 * @author: imhuis
 * @date: 2023/12/3
 * @description:
 */
public class Sealed {}

sealed class Base permits Derived1, Derived2 {}

final class Derived1 extends Base {}

sealed class Derived2 extends Base permits Derived3 {}

// non-sealed允许未知的子类来继承它
non-sealed class Derived3 extends Derived2 {}

// 非法不能继承
//final class Derived3 extends Base {}

sealed interface Ifc permits Imp1, Imp2 {}

final class Imp1 implements Ifc {}

final class Imp2 implements Ifc {}

sealed abstract class AC permits X {}

final class X extends AC {}