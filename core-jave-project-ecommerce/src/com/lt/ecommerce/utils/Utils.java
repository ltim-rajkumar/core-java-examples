package com.lt.ecommerce.utils;

public class Utils {
    public enum UserInput {
        CUSTOMER,
        SELLER,
        DELIVERY_AGENT,
        SHOP,
        PRODUCT,
        ORDER;

        public final int value = 1 + ordinal();
    }

}
