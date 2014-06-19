/**
 */
package IFML.Core.presentation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.StringTokenizer;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;

import IFML.Core.CoreFactory;
import IFML.Core.CorePackage;
import IFML.Core.DomainModel;
import IFML.Core.IFMLModel;
import IFML.Core.UMLBehavior;
import IFML.Core.UMLBehavioralFeature;
import IFML.Core.UMLDomainConcept;
import IFML.Core.UMLStructuralFeature;
import IFML.DataTypes.provider.IFMLMetamodelEditPlugin;
import IFML.DataTypes.presentation.IFMLMetamodelEditorPlugin;

import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.StructuralFeature;

/**
 * This is a simple wizard for creating a new model file. <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * 
 * @generated NOT
 */
public class CoreModelWizard extends Wizard implements INewWizard {
	/**
	 * The supported extensions for created files. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<String> FILE_EXTENSIONS = Collections
			.unmodifiableList(Arrays.asList(IFMLMetamodelEditorPlugin.INSTANCE
					.getString("_UI_CoreEditorFilenameExtensions").split(
							"\\s*,\\s*")));

	/**
	 * A formatted list of supported file extensions, suitable for display. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String FORMATTED_FILE_EXTENSIONS = IFMLMetamodelEditorPlugin.INSTANCE
			.getString("_UI_CoreEditorFilenameExtensions").replaceAll(
					"\\s*,\\s*", ", ");

	/**
	 * This caches an instance of the model package. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CorePackage corePackage = CorePackage.eINSTANCE;

	/**
	 * This caches an instance of the model factory. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CoreFactory coreFactory = corePackage.getCoreFactory();

	/**
	 * This is the file creation page. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected CoreModelWizardNewFileCreationPage newFileCreationPage;

	/**
	 * This is the file creation page. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected UMLModelWizardPage newUMLImportPage;

	protected IFile umlFile = null;
	// /**
	// * This is the initial object creation page.
	// * <!-- begin-user-doc -->
	// * <!-- end-user-doc -->
	// * @generated
	// */
	// protected CoreModelWizardInitialObjectCreationPage
	// initialObjectCreationPage;

	/**
	 * Remember the selection during initialization for populating the default
	 * container. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * Remember the workbench during initialization. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IWorkbench workbench;

	/**
	 * Caches the names of the types that can be created as the root object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected List<String> initialObjectNames;

	private DomainModel domainModel;

	/**
	 * This just records the information. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(IFMLMetamodelEditorPlugin.INSTANCE
				.getString("_UI_Wizard_label"));
		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE
				.getImageDescriptor(IFMLMetamodelEditorPlugin.INSTANCE
						.getImage("full/wizban/NewCore")));
	}

	/**
	 * Returns the names of the types that can be created as the root object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Collection<String> getInitialObjectNames() {
		if (initialObjectNames == null) {
			initialObjectNames = new ArrayList<String>();
			for (EClassifier eClassifier : corePackage.getEClassifiers()) {
				if (eClassifier instanceof EClass) {
					EClass eClass = (EClass) eClassifier;
					if (!eClass.isAbstract()) {
						initialObjectNames.add(eClass.getName());
					}
				}
			}
			Collections.sort(initialObjectNames,
					CommonPlugin.INSTANCE.getComparator());
		}
		return initialObjectNames;
	}

	/**
	 * Create a new model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EObject createInitialModel() {
		EObject rootObject = coreFactory.createIFMLModel();
		domainModel = coreFactory.createDomainModel();

		((IFMLModel) rootObject).setDomainModel(domainModel);
		return rootObject;
	}

	/**
	 * Do the work after everything is specified. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean performFinish() {
		try {
			// Remember the file.
			//
			final IFile modelFile = getModelFile();

			// Do the work within an operation.
			//
			WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
				@Override
				protected void execute(IProgressMonitor progressMonitor) {
					try {
						// Create a resource set
						//
						ResourceSet resourceSet = new ResourceSetImpl();
						ResourceSet resourceSetUML = new ResourceSetImpl();

						// Get the URI of the model file.
						//
						URI fileURI = URI.createPlatformResourceURI(modelFile
								.getFullPath().toString(), true);

						// Create a resource for this file.
						//
						Resource resource = resourceSet.createResource(fileURI);

						// Add the initial model object to the contents.
						//
						EObject rootObject = createInitialModel();
						if (rootObject != null) {
							resource.getContents().add(rootObject);
						}
						// Get the resource
						Resource resourceUML = resourceSetUML
								.createResource(URI.createPlatformResourceURI(
										umlFile.getFullPath().toString(), true));
						resourceUML.load(null);
						TreeIterator<EObject> eAllContents = resourceUML
								.getAllContents();
						while (eAllContents.hasNext()) {
							EObject next = eAllContents.next();
							if (next instanceof Class) {
								UMLDomainConcept concept = coreFactory
										.createUMLDomainConcept();
								concept.setClassifier((Classifier) next);
								
								concept.setName(((Classifier) next).getLabel());
								domainModel.getDomainElements().add(concept);
							}
							else
							if (next instanceof BehavioralFeature) {
								UMLBehavioralFeature behavioralFeature = coreFactory
										.createUMLBehavioralFeature();
								behavioralFeature.setBehavioralFeature((BehavioralFeature) next);
								behavioralFeature.setName(((BehavioralFeature) next).getLabel());
								domainModel.getDomainElements().add(behavioralFeature);
							}
							else
								if (next instanceof Behavior) {
									UMLBehavior behavior = coreFactory
											.createUMLBehavior();
									behavior.setBehavior((Behavior) next);
									behavior.setName(((Behavior) next).getLabel());
									domainModel.getDomainElements().add(behavior);
								}
								else
									if (next instanceof StructuralFeature) {
										UMLStructuralFeature structuralFeature = coreFactory
												.createUMLStructuralFeature();
										structuralFeature.setStructuralFeature((StructuralFeature) next);
										structuralFeature.setName(((StructuralFeature) next).getLabel());;
										domainModel.getDomainElements().add(structuralFeature);
									}
						}
						// Save the contents of the resource to the file system.
						//
						Map<Object, Object> options = new HashMap<Object, Object>();
						// options.put(XMLResource.OPTION_ENCODING,
						// initialObjectCreationPage.getEncoding());
						resource.save(options);
					} catch (Exception exception) {
						IFMLMetamodelEditorPlugin.INSTANCE.log(exception);
					} finally {
						progressMonitor.done();
					}
				}
			};

			getContainer().run(false, false, operation);

			// Select the new file resource in the current view.
			//
			IWorkbenchWindow workbenchWindow = workbench
					.getActiveWorkbenchWindow();
			IWorkbenchPage page = workbenchWindow.getActivePage();
			final IWorkbenchPart activePart = page.getActivePart();
			if (activePart instanceof ISetSelectionTarget) {
				final ISelection targetSelection = new StructuredSelection(
						modelFile);
				getShell().getDisplay().asyncExec(new Runnable() {
					public void run() {
						((ISetSelectionTarget) activePart)
								.selectReveal(targetSelection);
					}
				});
			}

			// Open an editor on the new file.
			//
			try {
				page.openEditor(
						new FileEditorInput(modelFile),
						workbench
								.getEditorRegistry()
								.getDefaultEditor(
										modelFile.getFullPath().toString())
								.getId());
			} catch (PartInitException exception) {
				MessageDialog.openError(workbenchWindow.getShell(),
						IFMLMetamodelEditorPlugin.INSTANCE
								.getString("_UI_OpenEditorError_label"),
						exception.getMessage());
				return false;
			}

			return true;
		} catch (Exception exception) {
			IFMLMetamodelEditorPlugin.INSTANCE.log(exception);
			return false;
		}
	}

	/**
	 * This is the one page of the wizard. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public class CoreModelWizardNewFileCreationPage extends
			WizardNewFileCreationPage {
		/**
		 * Pass in the selection. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public CoreModelWizardNewFileCreationPage(String pageId,
				IStructuredSelection selection) {
			super(pageId, selection);
		}

		/**
		 * The framework calls this to see if the file is correct. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		@Override
		protected boolean validatePage() {
			if (super.validatePage()) {
				String extension = new Path(getFileName()).getFileExtension();
				if (extension == null || !FILE_EXTENSIONS.contains(extension)) {
					String key = FILE_EXTENSIONS.size() > 1 ? "_WARN_FilenameExtensions"
							: "_WARN_FilenameExtension";
					setErrorMessage(IFMLMetamodelEditorPlugin.INSTANCE
							.getString(key,
									new Object[] { FORMATTED_FILE_EXTENSIONS }));
					return false;
				}
				return true;
			}
			return false;
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public IFile getModelFile() {
			return ResourcesPlugin.getWorkspace().getRoot()
					.getFile(getContainerFullPath().append(getFileName()));
		}
	}

	/**
	 * This is the page where the type of object to create is selected. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public class CoreModelWizardInitialObjectCreationPage extends WizardPage {
		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		protected Combo initialObjectField;

		/**
		 * @generated <!-- begin-user-doc --> <!-- end-user-doc -->
		 */
		protected List<String> encodings;

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		protected Combo encodingField;

		/**
		 * Pass in the selection. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public CoreModelWizardInitialObjectCreationPage(String pageId) {
			super(pageId);
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public void createControl(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE);
			{
				GridLayout layout = new GridLayout();
				layout.numColumns = 1;
				layout.verticalSpacing = 12;
				composite.setLayout(layout);

				GridData data = new GridData();
				data.verticalAlignment = GridData.FILL;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = GridData.FILL;
				composite.setLayoutData(data);
			}

			Label containerLabel = new Label(composite, SWT.LEFT);
			{
				containerLabel.setText(IFMLMetamodelEditorPlugin.INSTANCE
						.getString("_UI_ModelObject"));

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				containerLabel.setLayoutData(data);
			}

			initialObjectField = new Combo(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				initialObjectField.setLayoutData(data);
			}

			for (String objectName : getInitialObjectNames()) {
				initialObjectField.add(getLabel(objectName));
			}

			if (initialObjectField.getItemCount() == 1) {
				initialObjectField.select(0);
			}
			initialObjectField.addModifyListener(validator);

			Label encodingLabel = new Label(composite, SWT.LEFT);
			{
				encodingLabel.setText(IFMLMetamodelEditorPlugin.INSTANCE
						.getString("_UI_XMLEncoding"));

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				encodingLabel.setLayoutData(data);
			}
			encodingField = new Combo(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				encodingField.setLayoutData(data);
			}

			for (String encoding : getEncodings()) {
				encodingField.add(encoding);
			}

			encodingField.select(0);
			encodingField.addModifyListener(validator);

			setPageComplete(validatePage());
			setControl(composite);
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		protected ModifyListener validator = new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				setPageComplete(validatePage());
			}
		};

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		protected boolean validatePage() {
			return getInitialObjectName() != null
					&& getEncodings().contains(encodingField.getText());
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		@Override
		public void setVisible(boolean visible) {
			super.setVisible(visible);
			if (visible) {
				if (initialObjectField.getItemCount() == 1) {
					initialObjectField.clearSelection();
					encodingField.setFocus();
				} else {
					encodingField.clearSelection();
					initialObjectField.setFocus();
				}
			}
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public String getInitialObjectName() {
			String label = initialObjectField.getText();

			for (String name : getInitialObjectNames()) {
				if (getLabel(name).equals(label)) {
					return name;
				}
			}
			return null;
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public String getEncoding() {
			return encodingField.getText();
		}

		/**
		 * Returns the label for the specified type name. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		protected String getLabel(String typeName) {
			try {
				return IFMLMetamodelEditPlugin.INSTANCE.getString("_UI_"
						+ typeName + "_type");
			} catch (MissingResourceException mre) {
				IFMLMetamodelEditorPlugin.INSTANCE.log(mre);
			}
			return typeName;
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		protected Collection<String> getEncodings() {
			if (encodings == null) {
				encodings = new ArrayList<String>();
				for (StringTokenizer stringTokenizer = new StringTokenizer(
						IFMLMetamodelEditorPlugin.INSTANCE
								.getString("_UI_XMLEncodingChoices")); stringTokenizer
						.hasMoreTokens();) {
					encodings.add(stringTokenizer.nextToken());
				}
			}
			return encodings;
		}
	}

	public class UMLModelWizardPage extends WizardPage {
		private Text text1;
		private Composite container;
		private TreeViewer treeViewer;

		public UMLModelWizardPage() {
			super("UML model");
			setTitle("UML model");
			setDescription("Add UML elements");
		}

		public void createControl(Composite parent) {
			container = new Composite(parent, SWT.NONE);
			GridLayout layout = new GridLayout();
			container.setLayout(layout);
			layout.numColumns = 3;
			Label label1 = new Label(container, SWT.NONE);
			label1.setText("UML model");

			text1 = new Text(container, SWT.BORDER | SWT.SINGLE);
			text1.setText("");

			text1.addModifyListener(new ModifyListener() {

				private ResourceSet resourceSet = new ResourceSetImpl();

				public void modifyText(ModifyEvent e) {
					setPageComplete(false);
					if (!text1.getText().isEmpty()) {
						try {
							umlFile = ResourcesPlugin.getWorkspace().getRoot()
									.getFile(new Path(text1.getText()));
							if (umlFile != null
									&& umlFile.getFileExtension()
											.equalsIgnoreCase("uml")) {

								Resource resourceUML = resourceSet
										.createResource(URI
												.createPlatformResourceURI(
														umlFile.getFullPath()
																.toString(),
														true));
								treeViewer.setInput(resourceUML.getContents());
								setPageComplete(true);
							}
						} catch (Exception e1) {

						}

					}

				}
			});
			;

			GridData gd = new GridData(GridData.FILL_HORIZONTAL);
			text1.setLayoutData(gd);
			Button loadButton = new Button(container, SWT.PUSH);
			loadButton.setText("Browse");
			loadButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(
							getShell(), WorkbenchLabelProvider
									.getDecoratingWorkbenchLabelProvider(),
							new WorkbenchContentProvider());
					dialog.setTitle("Select a UML file");
					dialog.setAllowMultiple(false);
					// Filter to the uml file

					dialog.addFilter(new ViewerFilter() {
						public boolean select(Viewer viewer,
								Object parentElement, Object element) {
							if (element instanceof IProject) {
								return ((IProject) element).isAccessible();
							}
							if (element instanceof IContainer) {
								return ((IContainer) element).isAccessible();
							}
							if (element instanceof IFile
									&& "uml".equalsIgnoreCase(((IFile) element)
											.getFileExtension()))
								return true;

							return false;
						}
					});
					dialog.setValidator(new ISelectionStatusValidator() {
						public IStatus validate(Object[] selection) {
							if (selection.length == 1
									&& selection[0] instanceof IFile
									&& "uml".equalsIgnoreCase(((IFile) selection[0])
											.getFileExtension())) {
								return new Status(IStatus.OK,
										IFMLMetamodelEditorPlugin.getPlugin()
												.getSymbolicName(), 0, "", null);
							}

							return new Status(IStatus.ERROR,
									IFMLMetamodelEditorPlugin.getPlugin()
											.getSymbolicName(), 0,
									"Please select a UML file!", null);
						}
					});
					dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
					// TODO try to preselect the current file
					if (dialog.open() == Window.OK) {
						Object[] results = dialog.getResult();
						if ((results != null) && (results.length > 0)
								&& (results[0] instanceof IFile)) {
							IFile umlFile = ((IFile) results[0]);
							text1.setText(umlFile.getFullPath().makeRelative()
									.toString());

						}
					}
				}
			});
			treeViewer = new TreeViewer(parent);
			treeViewer.setContentProvider(new WorkbenchContentProvider());
			treeViewer.setLabelProvider(WorkbenchLabelProvider
					.getDecoratingWorkbenchLabelProvider());

			treeViewer.expandAll();
			// required to avoid an error in the system
			setControl(container);
			setPageComplete(false);

		}

		public String getText1() {
			return text1.getText();
		}
	}

	/**
	 * The framework calls this to create the contents of the wizard. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void addPages() {
		// Create a page, set the title, and the initial model file name.
		//
		newFileCreationPage = new CoreModelWizardNewFileCreationPage(
				"Whatever", selection);
		newFileCreationPage.setTitle(IFMLMetamodelEditorPlugin.INSTANCE
				.getString("_UI_CoreModelWizard_label"));
		newFileCreationPage.setDescription(IFMLMetamodelEditorPlugin.INSTANCE
				.getString("_UI_CoreModelWizard_description"));
		newFileCreationPage.setFileName(IFMLMetamodelEditorPlugin.INSTANCE
				.getString("_UI_CoreEditorFilenameDefaultBase")
				+ "."
				+ FILE_EXTENSIONS.get(0));
		addPage(newFileCreationPage);

		// Try and get the resource selection to determine a current directory
		// for the file dialog.
		//
		if (selection != null && !selection.isEmpty()) {
			// Get the resource...
			//
			Object selectedElement = selection.iterator().next();
			if (selectedElement instanceof IResource) {
				// Get the resource parent, if its a file.
				//
				IResource selectedResource = (IResource) selectedElement;
				if (selectedResource.getType() == IResource.FILE) {
					selectedResource = selectedResource.getParent();
				}

				// This gives us a directory...
				//
				if (selectedResource instanceof IFolder
						|| selectedResource instanceof IProject) {
					// Set this for the container.
					//
					newFileCreationPage.setContainerFullPath(selectedResource
							.getFullPath());

					// Make up a unique new name here.
					//
					String defaultModelBaseFilename = IFMLMetamodelEditorPlugin.INSTANCE
							.getString("_UI_CoreEditorFilenameDefaultBase");
					String defaultModelFilenameExtension = FILE_EXTENSIONS
							.get(0);
					String modelFilename = defaultModelBaseFilename + "."
							+ defaultModelFilenameExtension;
					for (int i = 1; ((IContainer) selectedResource)
							.findMember(modelFilename) != null; ++i) {
						modelFilename = defaultModelBaseFilename + i + "."
								+ defaultModelFilenameExtension;
					}
					newFileCreationPage.setFileName(modelFilename);
				}
			}
		}
		// initialObjectCreationPage = new
		// CoreModelWizardInitialObjectCreationPage("Whatever2");
		// initialObjectCreationPage.setTitle(IFMLMetamodelEditorPlugin.INSTANCE.getString("_UI_CoreModelWizard_label"));
		// initialObjectCreationPage.setDescription(IFMLMetamodelEditorPlugin.INSTANCE.getString("_UI_Wizard_initial_object_description"));
		// addPage(initialObjectCreationPage);

		newUMLImportPage = new UMLModelWizardPage();
		addPage(newUMLImportPage);
	}

	/**
	 * Get the file from the page. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IFile getModelFile() {
		return newFileCreationPage.getModelFile();
	}
}
