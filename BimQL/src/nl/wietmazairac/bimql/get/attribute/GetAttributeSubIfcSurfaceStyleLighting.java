package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcSurfaceStyleLighting;

public class GetAttributeSubIfcSurfaceStyleLighting {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcSurfaceStyleLighting(Object object, String string) {
		this.object = object;
		this.string = string;
	}

	// methods
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public ArrayList<Object> getResult() {
	ArrayList<Object> resultList = new ArrayList<Object>();
		if (string.equals("ReflectanceColour")) {
			resultList.add(((IfcSurfaceStyleLighting) object).getReflectanceColour());
			 //1IfcColourRgb
		}
		else if (string.equals("DiffuseTransmissionColour")) {
			resultList.add(((IfcSurfaceStyleLighting) object).getDiffuseTransmissionColour());
			 //1IfcColourRgb
		}
		else if (string.equals("DiffuseReflectionColour")) {
			resultList.add(((IfcSurfaceStyleLighting) object).getDiffuseReflectionColour());
			 //1IfcColourRgb
		}
		else if (string.equals("TransmissionColour")) {
			resultList.add(((IfcSurfaceStyleLighting) object).getTransmissionColour());
			 //1IfcColourRgb
		}
		return resultList;
	}
}
