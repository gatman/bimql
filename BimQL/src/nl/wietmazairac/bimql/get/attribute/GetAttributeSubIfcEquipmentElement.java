package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcEquipmentElement;

public class GetAttributeSubIfcEquipmentElement {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcEquipmentElement(Object object, String string) {
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
		if (string.equals("HasStructuralMember")) {
			//3xxx
			for (int i = 0; i < ((IfcEquipmentElement) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcEquipmentElement) object).getHasStructuralMember().get(i));
			}
			 //2EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcEquipmentElement) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcEquipmentElement) object).getReferencedInStructures().get(i));
			}
			 //2EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcEquipmentElement) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcEquipmentElement) object).getIsConnectionRealization().get(i));
			}
			 //2EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcEquipmentElement) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcEquipmentElement) object).getProvidesBoundaries().get(i));
			}
			 //2EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcEquipmentElement) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcEquipmentElement) object).getContainedInStructure().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcEquipmentElement) object).getHasPorts().size(); i++) {
				resultList.add(((IfcEquipmentElement) object).getHasPorts().get(i));
			}
			 //2EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcEquipmentElement) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcEquipmentElement) object).getFillsVoids().get(i));
			}
			 //2EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcEquipmentElement) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcEquipmentElement) object).getConnectedTo().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcEquipmentElement) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcEquipmentElement) object).getHasCoverings().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcEquipmentElement) object).getHasProjections().size(); i++) {
				resultList.add(((IfcEquipmentElement) object).getHasProjections().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcEquipmentElement) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcEquipmentElement) object).getHasOpenings().get(i));
			}
			 //2EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcEquipmentElement) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcEquipmentElement) object).getConnectedFrom().get(i));
			}
			 //2EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcEquipmentElement) object).getTag());
			 //2String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcEquipmentElement) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcEquipmentElement) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcEquipmentElement) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcEquipmentElement) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcEquipmentElement) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcEquipmentElement) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcEquipmentElement) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcEquipmentElement) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcEquipmentElement) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcEquipmentElement) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcEquipmentElement) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcEquipmentElement) object).getDecomposes().size(); i++) {
				resultList.add(((IfcEquipmentElement) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcEquipmentElement) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcEquipmentElement) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcEquipmentElement) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcEquipmentElement) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcEquipmentElement) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcEquipmentElement) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcEquipmentElement) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
