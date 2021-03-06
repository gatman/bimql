package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcSlippageConnectionCondition;

public class SetAttributeSubIfcSlippageConnectionCondition {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcSlippageConnectionCondition() {
	}

	public SetAttributeSubIfcSlippageConnectionCondition(Object object, String attributeName, String attributeNewValue) {
		this.object = object;
		this.attributeName = attributeName;
		this.attributeNewValue = attributeNewValue;
	}

	// methods
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getAttributeNewValue() {
		return attributeNewValue;
	}

	public void setAttributeNewValue(String attributeNewValue) {
		this.attributeNewValue = attributeNewValue;
	}

	public void setAttribute() {
		if (attributeName.equals("SlippageX")) {
			//1NoEList
			((IfcSlippageConnectionCondition) object).setSlippageX(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("SlippageY")) {
			//1NoEList
			((IfcSlippageConnectionCondition) object).setSlippageY(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("SlippageZ")) {
			//1NoEList
			((IfcSlippageConnectionCondition) object).setSlippageZ(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("SlippageXAsString")) {
			//1NoEList
			((IfcSlippageConnectionCondition) object).setSlippageXAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("SlippageYAsString")) {
			//1NoEList
			((IfcSlippageConnectionCondition) object).setSlippageYAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("SlippageZAsString")) {
			//1NoEList
			((IfcSlippageConnectionCondition) object).setSlippageZAsString(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
