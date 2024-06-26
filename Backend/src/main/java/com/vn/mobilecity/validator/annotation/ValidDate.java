package com.vn.mobilecity.validator.annotation;


import com.vn.mobilecity.validator.DateValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.PARAMETER})
@Constraint(validatedBy = {DateValidator.class})
public @interface ValidDate {

    String message() default "invalid.date-format";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
