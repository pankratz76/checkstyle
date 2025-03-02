/*
InlineVariable

*/
package com.puppycrawl.tools.checkstyle.checks.coding.inlinevariable;

public class InputInlineVariableSimple {
    private String used() {
        String s = used2(); // violation, "InputInlineVariableSimple 's'"
        return s;
    }

    private String used2() {
        return "String";
    }

}
