package nl.wietmazairac.bimql.set.attribute;


public class SetAttributeSubIfcConnectionPortGeometry {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcConnectionPortGeometry() {
	}

	public SetAttributeSubIfcConnectionPortGeometry(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("LocationAtRelatingElement")) {
			//1NoEList
			 //1void
			 //1IfcAxis2Placement
		}
		else if (attributeName.equals("LocationAtRelatedElement")) {
			//1NoEList
			 //1void
			 //1IfcAxis2Placement
		}
		else if (attributeName.equals("ProfileOfPort")) {
			//1NoEList
			 //1void
			 //1IfcProfileDef
		}
	}
}
