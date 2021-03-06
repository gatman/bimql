package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcOrganizationRelationship;

public class GetAttributeSubIfcOrganizationRelationship {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcOrganizationRelationship(Object object, String string) {
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
		if (string.equals("RelatingOrganization")) {
			resultList.add(((IfcOrganizationRelationship) object).getRelatingOrganization());
			 //1IfcOrganization
		}
		else if (string.equals("RelatedOrganizations")) {
			//3xxx
			for (int i = 0; i < ((IfcOrganizationRelationship) object).getRelatedOrganizations().size(); i++) {
				resultList.add(((IfcOrganizationRelationship) object).getRelatedOrganizations().get(i));
			}
			 //1EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcOrganizationRelationship) object).getName());
			 //1String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcOrganizationRelationship) object).getDescription());
			 //1String
		}
		return resultList;
	}
}
