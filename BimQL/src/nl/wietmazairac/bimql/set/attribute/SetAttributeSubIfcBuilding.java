package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcBuilding;

public class SetAttributeSubIfcBuilding {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcBuilding() {
	}

	public SetAttributeSubIfcBuilding(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("BuildingAddress")) {
			//1NoEList
			 //1void
			 //1IfcPostalAddress
		}
		else if (attributeName.equals("ElevationOfRefHeightAsString")) {
			//1NoEList
			((IfcBuilding) object).setElevationOfRefHeightAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ElevationOfTerrainAsString")) {
			//1NoEList
			((IfcBuilding) object).setElevationOfTerrainAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ElevationOfRefHeight")) {
			//1NoEList
			((IfcBuilding) object).setElevationOfRefHeight(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("ElevationOfTerrain")) {
			//1NoEList
			((IfcBuilding) object).setElevationOfTerrain(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("CompositionType")) {
			//2NoEList
			 //2void
			 //2IfcElementCompositionEnum
		}
		else if (attributeName.equals("LongName")) {
			//2NoEList
			((IfcBuilding) object).setLongName(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("ObjectPlacement")) {
			//5NoEList
			 //5void
			 //5IfcObjectPlacement
		}
		else if (attributeName.equals("Representation")) {
			//5NoEList
			 //5void
			 //5IfcProductRepresentation
		}
		else if (attributeName.equals("ObjectType")) {
			//5NoEList
			((IfcBuilding) object).setObjectType(attributeNewValue);
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
			((IfcBuilding) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcBuilding) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
