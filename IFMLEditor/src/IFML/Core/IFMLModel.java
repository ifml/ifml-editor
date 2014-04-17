/**
 */
package IFML.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IFML Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Core.IFMLModel#getInteractionFlowModel <em>Interaction Flow Model</em>}</li>
 *   <li>{@link IFML.Core.IFMLModel#getDomainModel <em>Domain Model</em>}</li>
 *   <li>{@link IFML.Core.IFMLModel#getInteractionFlowModelViewpoint <em>Interaction Flow Model Viewpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Core.CorePackage#getIFMLModel()
 * @model
 * @generated
 */
public interface IFMLModel extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Interaction Flow Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Flow Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Flow Model</em>' containment reference.
	 * @see #setInteractionFlowModel(InteractionFlowModel)
	 * @see IFML.Core.CorePackage#getIFMLModel_InteractionFlowModel()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	InteractionFlowModel getInteractionFlowModel();

	/**
	 * Sets the value of the '{@link IFML.Core.IFMLModel#getInteractionFlowModel <em>Interaction Flow Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction Flow Model</em>' containment reference.
	 * @see #getInteractionFlowModel()
	 * @generated
	 */
	void setInteractionFlowModel(InteractionFlowModel value);

	/**
	 * Returns the value of the '<em><b>Domain Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Model</em>' containment reference.
	 * @see #setDomainModel(DomainModel)
	 * @see IFML.Core.CorePackage#getIFMLModel_DomainModel()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	DomainModel getDomainModel();

	/**
	 * Sets the value of the '{@link IFML.Core.IFMLModel#getDomainModel <em>Domain Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Model</em>' containment reference.
	 * @see #getDomainModel()
	 * @generated
	 */
	void setDomainModel(DomainModel value);

	/**
	 * Returns the value of the '<em><b>Interaction Flow Model Viewpoint</b></em>' containment reference list.
	 * The list contents are of type {@link IFML.Core.Viewpoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Flow Model Viewpoint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Flow Model Viewpoint</em>' containment reference list.
	 * @see IFML.Core.CorePackage#getIFMLModel_InteractionFlowModelViewpoint()
	 * @model type="IFML.Core.Viewpoint" containment="true" ordered="false"
	 * @generated
	 */
	EList getInteractionFlowModelViewpoint();

} // IFMLModel
