package com.uc.lombok.example;

import lombok.Data;
import lombok.NonNull;

/**
 * User: uc
 * Date: 2018-04-13
 * Time: 18:08
 * Desc:
 */
@Data
public class NonNullExample {
    @NonNull private String name;
}
