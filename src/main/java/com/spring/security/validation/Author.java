package com.spring.security.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AuthorValidator.class)
@Documented
public @interface Author {

    String message() default "Author should be from list Santideva, Marie KBC, Martin Fowler, Virendra Singh";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
