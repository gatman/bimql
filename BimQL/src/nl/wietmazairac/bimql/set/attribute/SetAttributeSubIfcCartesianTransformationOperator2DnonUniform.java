package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcCartesianTransformationOperator2DnonUniform;

public class SetAttributeSubIfcCartesianTransformationOperator2DnonUniform {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcCartesianTransformationOperator2DnonUniform() {
	}

	public SetAttributeSubIfcCartesianTransformationOperator2DnonUniform(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("Scale2AsString")) {
			//1NoEList
			((IfcCartesianTransformationOperator2DnonUniform) object).setScale2AsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Scale2")) {
			//1NoEList
			((IfcCartesianTransformationOperator2DnonUniform) object).setScale2(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("Dim")) {
			//5NoEList
			 //5void
			 //5int
		}
		else if (attributeName.equals("Axis1")) {
			//5NoEList
			 //5void
			 //5IfcDirection
		}
		else if (attributeName.equals("LocalOrigin")) {
			//5NoEList
			 //5void
			 //5IfcCartesianPoint
		}
		else if (attributeName.equals("ScaleAsString")) {
			//5NoEList
			((IfcCartesianTransformationOperator2DnonUniform) object).setScaleAsString(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Axis2")) {
			//5NoEList
			 //5void
			 //5IfcDirection
		}
		else if (attributeName.equals("Scale")) {
			//5NoEList
			((IfcCartesianTransformationOperator2DnonUniform) object).setScale(Double.parseDouble(attributeNewValue));
			 //5void
			 //5double
		}
		else {
		}
	}
}
