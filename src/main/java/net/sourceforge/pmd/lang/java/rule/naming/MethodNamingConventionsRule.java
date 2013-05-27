/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
package net.sourceforge.pmd.lang.java.rule.naming;

import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclarator;
import net.sourceforge.pmd.lang.java.rule.AbstractJavaRule;
import net.sourceforge.pmd.lang.java.rule.ViolationController;

public class MethodNamingConventionsRule extends AbstractJavaRule {

    public Object visit(ASTMethodDeclarator node, Object data) {
    	
    	String methodName = node.getImage();
    	
        if (Character.isUpperCase(methodName.charAt(0))) {
        	addViolationWithMessage(data, node, "Method names should not start with capital letters");
        	ViolationController.AddViolation(Violation.NAMING, path, name, line, msg)
        	
        }
        if (methodName.indexOf('_') >= 0) {
            addViolationWithMessage(data, node, "Method names should not contain underscores");
        }
        return data;
    }

}
