IFML Editor
===========

The open source Eclipse editor for [IFML](http://www.ifml.org/) (Interaction Flow Modeling Language). 

The editor is based on [Sirius](http://www.eclipse.org/sirius/) an Eclipse project to facilitate the creation of modeling editors.

Using the tool
==============

Instructions on how to install and get started with the tool are available in the [tool web page](http://ifml.github.io)


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

Authors
=======

IFML Editor is the result of a collaboration between [WebRatio](http://www.webratio.com/), [Politecnico di Milano](http://www.polimi.it/en/) and the INRIA research team [AtlanMod](http://www.emn.fr/z-info/atlanmod/index.php/Main_Page).  
