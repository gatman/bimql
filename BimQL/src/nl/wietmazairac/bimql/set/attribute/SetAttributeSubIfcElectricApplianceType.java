package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcElectricApplianceType;

public class SetAttributeSubIfcElectricApplianceType {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcElectricApplianceType() {
	}

	public SetAttributeSubIfcElectricApplianceType(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("PredefinedType")) {
			//1NoEList
			 //1void
			 //1IfcElectricApplianceTypeEnum
		}
		else if (attributeName.equals("ElementType")) {
			//5NoEList
			((IfcElectricApplianceType) object).setElementType(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Tag")) {
			//5NoEList
			((IfcElectricApplianceType) object).setTag(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("ApplicableOccurrence")) {
			//5NoEList
			((IfcElectricApplianceType) object).setApplicableOccurrence(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("GlobalId")) {
			//5NoEList
			 //5void
			 //5IfcGloballyUniqueId
		}
		else if (attributeName.equals("OwnerHistory")) {
			//5NoEList
			 //5void
			 //5IfcOwnerHistory
		}
		else if (attributeName.equals("Name")) {
			//5NoEList
			((IfcElectricApplianceType) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcElectricApplianceType) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
