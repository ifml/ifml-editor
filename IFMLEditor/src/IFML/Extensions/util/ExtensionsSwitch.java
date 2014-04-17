/**
 */
package IFML.Extensions.util;

import IFML.Core.BooleanExpression;
import IFML.Core.CatchingEvent;
import IFML.Core.Constraint;
import IFML.Core.ContextDimension;
import IFML.Core.Element;
import IFML.Core.Event;
import IFML.Core.Expression;
import IFML.Core.IFMLParameter;
import IFML.Core.InteractionFlowElement;
import IFML.Core.InteractionFlowModelElement;
import IFML.Core.NamedElement;
import IFML.Core.SystemEvent;
import IFML.Core.ThrowingEvent;
import IFML.Core.ViewComponent;
import IFML.Core.ViewComponentPart;
import IFML.Core.ViewContainer;
import IFML.Core.ViewElement;
import IFML.Core.ViewElementEvent;

import IFML.Extensions.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see IFML.Extensions.ExtensionsPackage
 * @generated
 */
public class ExtensionsSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExtensionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionsSwitch() {
		if (modelPackage == null) {
			modelPackage = ExtensionsPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ExtensionsPackage.ON_SUBMIT_EVENT: {
				OnSubmitEvent onSubmitEvent = (OnSubmitEvent)theEObject;
				Object result = caseOnSubmitEvent(onSubmitEvent);
				if (result == null) result = caseViewElementEvent(onSubmitEvent);
				if (result == null) result = caseCatchingEvent(onSubmitEvent);
				if (result == null) result = caseEvent(onSubmitEvent);
				if (result == null) result = caseInteractionFlowElement(onSubmitEvent);
				if (result == null) result = caseNamedElement(onSubmitEvent);
				if (result == null) result = caseInteractionFlowModelElement(onSubmitEvent);
				if (result == null) result = caseElement(onSubmitEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionsPackage.VALIDATION_RULE: {
				ValidationRule validationRule = (ValidationRule)theEObject;
				Object result = caseValidationRule(validationRule);
				if (result == null) result = caseConstraint(validationRule);
				if (result == null) result = caseBooleanExpression(validationRule);
				if (result == null) result = caseExpression(validationRule);
				if (result == null) result = caseInteractionFlowModelElement(validationRule);
				if (result == null) result = caseElement(validationRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionsPackage.LIST: {
				IFML.Extensions.List list = (IFML.Extensions.List)theEObject;
				Object result = caseList(list);
				if (result == null) result = caseViewComponent(list);
				if (result == null) result = caseViewElement(list);
				if (result == null) result = caseInteractionFlowElement(list);
				if (result == null) result = caseNamedElement(list);
				if (result == null) result = caseInteractionFlowModelElement(list);
				if (result == null) result = caseElement(list);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionsPackage.POSITION: {
				Position position = (Position)theEObject;
				Object result = casePosition(position);
				if (result == null) result = caseContextDimension(position);
				if (result == null) result = caseNamedElement(position);
				if (result == null) result = caseElement(position);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionsPackage.USER_ROLE: {
				UserRole userRole = (UserRole)theEObject;
				Object result = caseUserRole(userRole);
				if (result == null) result = caseContextDimension(userRole);
				if (result == null) result = caseNamedElement(userRole);
				if (result == null) result = caseElement(userRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionsPackage.IFML_SLOT: {
				IFMLSlot ifmlSlot = (IFMLSlot)theEObject;
				Object result = caseIFMLSlot(ifmlSlot);
				if (result == null) result = caseViewComponentPart(ifmlSlot);
				if (result == null) result = caseIFMLParameter(ifmlSlot);
				if (result == null) result = caseInteractionFlowElement(ifmlSlot);
				if (result == null) result = caseNamedElement(ifmlSlot);
				if (result == null) result = caseInteractionFlowModelElement(ifmlSlot);
				if (result == null) result = caseElement(ifmlSlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionsPackage.ON_SELECT_EVENT: {
				OnSelectEvent onSelectEvent = (OnSelectEvent)theEObject;
				Object result = caseOnSelectEvent(onSelectEvent);
				if (result == null) result = caseViewElementEvent(onSelectEvent);
				if (result == null) result = caseCatchingEvent(onSelectEvent);
				if (result == null) result = caseEvent(onSelectEvent);
				if (result == null) result = caseInteractionFlowElement(onSelectEvent);
				if (result == null) result = caseNamedElement(onSelectEvent);
				if (result == null) result = caseInteractionFlowModelElement(onSelectEvent);
				if (result == null) result = caseElement(onSelectEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionsPackage.FIELD: {
				Field field = (Field)theEObject;
				Object result = caseField(field);
				if (result == null) result = caseViewComponentPart(field);
				if (result == null) result = caseIFMLParameter(field);
				if (result == null) result = caseInteractionFlowElement(field);
				if (result == null) result = caseNamedElement(field);
				if (result == null) result = caseInteractionFlowModelElement(field);
				if (result == null) result = caseElement(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionsPackage.FORM: {
				Form form = (Form)theEObject;
				Object result = caseForm(form);
				if (result == null) result = caseViewComponent(form);
				if (result == null) result = caseViewElement(form);
				if (result == null) result = caseInteractionFlowElement(form);
				if (result == null) result = caseNamedElement(form);
				if (result == null) result = caseInteractionFlowModelElement(form);
				if (result == null) result = caseElement(form);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionsPackage.DEVICE: {
				Device device = (Device)theEObject;
				Object result = caseDevice(device);
				if (result == null) result = caseContextDimension(device);
				if (result == null) result = caseNamedElement(device);
				if (result == null) result = caseElement(device);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionsPackage.SELECTION_FIELD: {
				SelectionField selectionField = (SelectionField)theEObject;
				Object result = caseSelectionField(selectionField);
				if (result == null) result = caseField(selectionField);
				if (result == null) result = caseViewComponentPart(selectionField);
				if (result == null) result = caseIFMLParameter(selectionField);
				if (result == null) result = caseInteractionFlowElement(selectionField);
				if (result == null) result = caseNamedElement(selectionField);
				if (result == null) result = caseInteractionFlowModelElement(selectionField);
				if (result == null) result = caseElement(selectionField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionsPackage.SIMPLE_FIELD: {
				SimpleField simpleField = (SimpleField)theEObject;
				Object result = caseSimpleField(simpleField);
				if (result == null) result = caseField(simpleField);
				if (result == null) result = caseViewComponentPart(simpleField);
				if (result == null) result = caseIFMLParameter(simpleField);
				if (result == null) result = caseInteractionFlowElement(simpleField);
				if (result == null) result = caseNamedElement(simpleField);
				if (result == null) result = caseInteractionFlowModelElement(simpleField);
				if (result == null) result = caseElement(simpleField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionsPackage.DETAILS: {
				Details details = (Details)theEObject;
				Object result = caseDetails(details);
				if (result == null) result = caseViewComponent(details);
				if (result == null) result = caseViewElement(details);
				if (result == null) result = caseInteractionFlowElement(details);
				if (result == null) result = caseNamedElement(details);
				if (result == null) result = caseInteractionFlowModelElement(details);
				if (result == null) result = caseElement(details);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionsPackage.IFML_WINDOW: {
				IFMLWindow ifmlWindow = (IFMLWindow)theEObject;
				Object result = caseIFMLWindow(ifmlWindow);
				if (result == null) result = caseViewContainer(ifmlWindow);
				if (result == null) result = caseViewElement(ifmlWindow);
				if (result == null) result = caseInteractionFlowElement(ifmlWindow);
				if (result == null) result = caseNamedElement(ifmlWindow);
				if (result == null) result = caseInteractionFlowModelElement(ifmlWindow);
				if (result == null) result = caseElement(ifmlWindow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionsPackage.ON_LOAD_EVENT: {
				OnLoadEvent onLoadEvent = (OnLoadEvent)theEObject;
				Object result = caseOnLoadEvent(onLoadEvent);
				if (result == null) result = caseSystemEvent(onLoadEvent);
				if (result == null) result = caseCatchingEvent(onLoadEvent);
				if (result == null) result = caseEvent(onLoadEvent);
				if (result == null) result = caseInteractionFlowElement(onLoadEvent);
				if (result == null) result = caseNamedElement(onLoadEvent);
				if (result == null) result = caseInteractionFlowModelElement(onLoadEvent);
				if (result == null) result = caseElement(onLoadEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionsPackage.IFML_MENU: {
				IFMLMenu ifmlMenu = (IFMLMenu)theEObject;
				Object result = caseIFMLMenu(ifmlMenu);
				if (result == null) result = caseViewContainer(ifmlMenu);
				if (result == null) result = caseViewElement(ifmlMenu);
				if (result == null) result = caseInteractionFlowElement(ifmlMenu);
				if (result == null) result = caseNamedElement(ifmlMenu);
				if (result == null) result = caseInteractionFlowModelElement(ifmlMenu);
				if (result == null) result = caseElement(ifmlMenu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionsPackage.JUMP_EVENT: {
				JumpEvent jumpEvent = (JumpEvent)theEObject;
				Object result = caseJumpEvent(jumpEvent);
				if (result == null) result = caseThrowingEvent(jumpEvent);
				if (result == null) result = caseEvent(jumpEvent);
				if (result == null) result = caseInteractionFlowElement(jumpEvent);
				if (result == null) result = caseNamedElement(jumpEvent);
				if (result == null) result = caseInteractionFlowModelElement(jumpEvent);
				if (result == null) result = caseElement(jumpEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionsPackage.LANDING_EVENT: {
				LandingEvent landingEvent = (LandingEvent)theEObject;
				Object result = caseLandingEvent(landingEvent);
				if (result == null) result = caseCatchingEvent(landingEvent);
				if (result == null) result = caseEvent(landingEvent);
				if (result == null) result = caseInteractionFlowElement(landingEvent);
				if (result == null) result = caseNamedElement(landingEvent);
				if (result == null) result = caseInteractionFlowModelElement(landingEvent);
				if (result == null) result = caseElement(landingEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionsPackage.SET_CONTEXT_EVENT: {
				SetContextEvent setContextEvent = (SetContextEvent)theEObject;
				Object result = caseSetContextEvent(setContextEvent);
				if (result == null) result = caseThrowingEvent(setContextEvent);
				if (result == null) result = caseEvent(setContextEvent);
				if (result == null) result = caseInteractionFlowElement(setContextEvent);
				if (result == null) result = caseNamedElement(setContextEvent);
				if (result == null) result = caseInteractionFlowModelElement(setContextEvent);
				if (result == null) result = caseElement(setContextEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Submit Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Submit Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOnSubmitEvent(OnSubmitEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validation Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseValidationRule(ValidationRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseList(IFML.Extensions.List object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePosition(Position object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUserRole(UserRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IFML Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IFML Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIFMLSlot(IFMLSlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Select Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Select Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOnSelectEvent(OnSelectEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseForm(Form object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDevice(Device object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSelectionField(SelectionField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSimpleField(SimpleField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDetails(Details object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IFML Window</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IFML Window</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIFMLWindow(IFMLWindow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Load Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Load Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOnLoadEvent(OnLoadEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IFML Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IFML Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIFMLMenu(IFMLMenu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jump Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jump Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseJumpEvent(JumpEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Landing Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Landing Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLandingEvent(LandingEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Context Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Context Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSetContextEvent(SetContextEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Flow Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Flow Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInteractionFlowModelElement(InteractionFlowModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Flow Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Flow Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInteractionFlowElement(InteractionFlowElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catching Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catching Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCatchingEvent(CatchingEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Element Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Element Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseViewElementEvent(ViewElementEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBooleanExpression(BooleanExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseViewElement(ViewElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseViewComponent(ViewComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseContextDimension(ContextDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Component Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Component Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseViewComponentPart(ViewComponentPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IFML Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IFML Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIFMLParameter(IFMLParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseViewContainer(ViewContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSystemEvent(SystemEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Throwing Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Throwing Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseThrowingEvent(ThrowingEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //ExtensionsSwitch
