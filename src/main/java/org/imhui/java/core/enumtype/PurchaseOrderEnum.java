package org.imhui.java.core.enumtype;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: imhuis
 * @date: 2022/11/1
 * @description:
 */
@Getter
@AllArgsConstructor
public enum PurchaseOrderEnum {


    PAY("pay", "", () -> null);

    private String code;
    private String desc;
    private PurchaseOrderFunctional functional;

    @FunctionalInterface
    public interface PurchaseOrderFunctional {
        Boolean proceed();
    }
}
