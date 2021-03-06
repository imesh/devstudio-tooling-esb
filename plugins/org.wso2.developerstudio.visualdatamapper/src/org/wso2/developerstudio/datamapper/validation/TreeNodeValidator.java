/**
 *
 * $Id$
 */
package org.wso2.developerstudio.datamapper.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.wso2.developerstudio.datamapper.Element;
import org.wso2.developerstudio.datamapper.InNode;
import org.wso2.developerstudio.datamapper.Input;
import org.wso2.developerstudio.datamapper.OutNode;
import org.wso2.developerstudio.datamapper.Output;
import org.wso2.developerstudio.datamapper.PropertyKeyValuePair;
import org.wso2.developerstudio.datamapper.SchemaDataType;
import org.wso2.developerstudio.datamapper.TreeNode;

/**
 * A sample validator interface for {@link org.wso2.developerstudio.datamapper.TreeNode}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TreeNodeValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateNode(EList<TreeNode> value);
	boolean validateElement(EList<Element> value);
	boolean validateFieldParent(TreeNode value);
	boolean validateOutputParent(Output value);
	boolean validateInputParent(Input value);
	boolean validateSchemaDataType(SchemaDataType value);
	boolean validateLevel(int value);
	boolean validateProperties(EList<PropertyKeyValuePair> value);

	boolean validateProperties(EMap<String, String> value);
	boolean validateOutNode(OutNode value);
	boolean validateInNode(InNode value);
}
