Limitations
=========

- There can be at most 3 nested ViewContainers, Windows or Menus.
- There can be at most 3 nested ModulePackages.
- Module and Port can be defined only outside Module Definitions.
- The element Parameter is not implemented, instead is implemented the element Slot, which can be inserted in each ViewComponent (ViewComponent, List, Details, Form).
- Each ViewComponentPart (ViewComponentPart, Slot, SimpleField, Selection Field, DataBinding, Conditional Expression) can be inserted in each ViewComponent.
- Relationships between elements in the editor are guided only by the ecore (there
aren’t any extra rules introduced by the editor).
- Module Definitions cannot be nested.
- About Expressions only ActivationExpression and ConditionalExpression were implemented.
- UML elements were not implemented.
- Context elements were not implemented.
- Deleting the flow, which connects the ParameterBindingGroup with the DataFlow or the NavigationFlow, does not delete the ParameterBindingGroup element.
