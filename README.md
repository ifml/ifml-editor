IFML Editor
===========

The open source IFML editor - Based on Sirius

Using the tool
==============

The tool is available at <a href="https://ifml.github.io">https://ifml.atlanmod.github.io</a>

Projects
=========
- IFMLEditor: project with model and model sources.
  * Folder “Model”: contains the .ecore and the .genmodel.
- IFMLEditor.edit : project with the generated edit code.
- IFMLEditor.editor: project with the generated editor code.
- IFMLEditorDesign: project with the editor design
  * Folder “description”: IFML.odesign file which specifies the editor
  * Source Folder “templates” inside the src folder: helper.mtl file, which specifies some queries, used by the IFML.odesign.

Remarks
=========

- In order to avoid problems due to the existence of elements with the same name in other metamodels the following elements were renamed only for the Editor:
```        
        - Action --> IFML Action
        - Menu --> IFMLMenu
        - Slot --> IFMLSlot
        - Parameter --> IFMLParameter
        - Window --> IFMLWindow
        - Port --> IFMLPort
        - Module --> IFMLModule
```
- In order to generate a unique identifier for each element the ElementImpl.java class in the package IFML.Core.impl in the Model Project was modified:
``` 
        - inserting the following line in the ElementImpl Constructor
          id=EcoreUtil.generateUUID(); 
        - marking the constructor @generated NOT
        - changing the variable ID_EDEFAULT value from null to "":
          protected static final String ID_DEFAULT = ""
```
