package org.imhui.java.core.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.stream.Stream;

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
