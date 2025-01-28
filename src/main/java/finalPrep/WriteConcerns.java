package finalPrep;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface WriteConcerns {
    CaseFormatter caseFormatter() default CaseFormatter.ORDINARY;
    NumberFormatter numberFormater() default NumberFormatter.COMMA;
}
