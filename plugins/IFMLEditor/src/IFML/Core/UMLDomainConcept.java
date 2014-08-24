/**
 */
package IFML.Core;

import org.eclipse.uml2.uml.Classifier;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Domain Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Core.UMLDomainConcept#getClassifier <em>Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Core.CorePackage#getUMLDomainConcept()
 * @model
 * @generated
 */
public interface UMLDomainConcept extends DomainConcept {
	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier</em>' reference.
	 * @see #setClassifier(Classifier)
	 * @see IFML.Core.CorePackage#getUMLDomainConcept_Classifier()
	 * @model ordered="false"
	 * @generated
	 */
	Classifier getClassifier();

	/**
	 * Sets the value of the '{@link IFML.Core.UMLDomainConcept#getClassifier <em>Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier</em>' reference.
	 * @see #getClassifier()
	 * @generated
	 */
	void setClassifier(Classifier value);

} // UMLDomainConcept
