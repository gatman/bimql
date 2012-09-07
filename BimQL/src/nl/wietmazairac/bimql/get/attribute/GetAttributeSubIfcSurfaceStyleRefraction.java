package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcSurfaceStyleRefraction {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcSurfaceStyleRefraction(Object object, String string) {
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
		if (string.equals("RefractionIndex")) {
			resultList.add(((IfcSurfaceStyleRefraction) object).getRefractionIndex());
			 //1double
		}
		else if (string.equals("DispersionFactor")) {
			resultList.add(((IfcSurfaceStyleRefraction) object).getDispersionFactor());
			 //1double
		}
		else if (string.equals("RefractionIndexAsString")) {
			resultList.add(((IfcSurfaceStyleRefraction) object).getRefractionIndexAsString());
			 //1String
		}
		else if (string.equals("DispersionFactorAsString")) {
			resultList.add(((IfcSurfaceStyleRefraction) object).getDispersionFactorAsString());
			 //1String
		}
		return resultList;
	}
}