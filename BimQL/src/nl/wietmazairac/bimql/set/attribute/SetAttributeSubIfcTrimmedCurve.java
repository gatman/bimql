package nl.wietmazairac.bimql.set.attribute;


public class SetAttributeSubIfcTrimmedCurve {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcTrimmedCurve() {
	}

	public SetAttributeSubIfcTrimmedCurve(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("BasisCurve")) {
			//1NoEList
			 //1void
			 //1IfcCurve
		}
		else if (attributeName.equals("SenseAgreement")) {
			//1NoEList
			 //1void
			 //1Tristate
		}
		else if (attributeName.equals("MasterRepresentation")) {
			//1NoEList
			 //1void
			 //1IfcTrimmingPreference
		}
		else if (attributeName.equals("Dim")) {
			//5NoEList
			 //5void
			 //5int
		}
		else {
		}
	}
}
