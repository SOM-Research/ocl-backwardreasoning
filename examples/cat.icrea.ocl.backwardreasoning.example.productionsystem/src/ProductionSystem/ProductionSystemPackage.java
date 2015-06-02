/**
 */
package ProductionSystem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ProductionSystem.ProductionSystemFactory
 * @model kind="package"
 * @generated
 */
public interface ProductionSystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ProductionSystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.com/PS";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "PS";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProductionSystemPackage eINSTANCE = ProductionSystem.impl.ProductionSystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link ProductionSystem.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProductionSystem.impl.MachineImpl
	 * @see ProductionSystem.impl.ProductionSystemPackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Ic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__IC = 0;

	/**
	 * The feature id for the '<em><b>Oc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__OC = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ID = 2;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProductionSystem.impl.ConveyorImpl <em>Conveyor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProductionSystem.impl.ConveyorImpl
	 * @see ProductionSystem.impl.ProductionSystemPackageImpl#getConveyor()
	 * @generated
	 */
	int CONVEYOR = 1;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__CAPACITY = 0;

	/**
	 * The feature id for the '<em><b>Piece</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__PIECE = 1;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__NEXT = 2;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__PREV = 3;

	/**
	 * The feature id for the '<em><b>Im</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__IM = 4;

	/**
	 * The feature id for the '<em><b>Om</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__OM = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__ID = 6;

	/**
	 * The number of structural features of the '<em>Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProductionSystem.impl.PieceImpl <em>Piece</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProductionSystem.impl.PieceImpl
	 * @see ProductionSystem.impl.ProductionSystemPackageImpl#getPiece()
	 * @generated
	 */
	int PIECE = 2;

	/**
	 * The feature id for the '<em><b>Conveyor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE__CONVEYOR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE__ID = 1;

	/**
	 * The number of structural features of the '<em>Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProductionSystem.impl.RawImpl <em>Raw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProductionSystem.impl.RawImpl
	 * @see ProductionSystem.impl.ProductionSystemPackageImpl#getRaw()
	 * @generated
	 */
	int RAW = 3;

	/**
	 * The feature id for the '<em><b>Conveyor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW__CONVEYOR = PIECE__CONVEYOR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW__ID = PIECE__ID;

	/**
	 * The number of structural features of the '<em>Raw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_FEATURE_COUNT = PIECE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Raw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_OPERATION_COUNT = PIECE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ProductionSystem.impl.ProcessedImpl <em>Processed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProductionSystem.impl.ProcessedImpl
	 * @see ProductionSystem.impl.ProductionSystemPackageImpl#getProcessed()
	 * @generated
	 */
	int PROCESSED = 4;

	/**
	 * The feature id for the '<em><b>Conveyor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSED__CONVEYOR = PIECE__CONVEYOR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSED__ID = PIECE__ID;

	/**
	 * The number of structural features of the '<em>Processed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSED_FEATURE_COUNT = PIECE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Processed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSED_OPERATION_COUNT = PIECE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ProductionSystem.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see ProductionSystem.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link ProductionSystem.Machine#getIc <em>Ic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ic</em>'.
	 * @see ProductionSystem.Machine#getIc()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_Ic();

	/**
	 * Returns the meta object for the containment reference list '{@link ProductionSystem.Machine#getOc <em>Oc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Oc</em>'.
	 * @see ProductionSystem.Machine#getOc()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_Oc();

	/**
	 * Returns the meta object for the attribute '{@link ProductionSystem.Machine#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ProductionSystem.Machine#getId()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Id();

	/**
	 * Returns the meta object for class '{@link ProductionSystem.Conveyor <em>Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conveyor</em>'.
	 * @see ProductionSystem.Conveyor
	 * @generated
	 */
	EClass getConveyor();

	/**
	 * Returns the meta object for the attribute '{@link ProductionSystem.Conveyor#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see ProductionSystem.Conveyor#getCapacity()
	 * @see #getConveyor()
	 * @generated
	 */
	EAttribute getConveyor_Capacity();

	/**
	 * Returns the meta object for the containment reference list '{@link ProductionSystem.Conveyor#getPiece <em>Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Piece</em>'.
	 * @see ProductionSystem.Conveyor#getPiece()
	 * @see #getConveyor()
	 * @generated
	 */
	EReference getConveyor_Piece();

	/**
	 * Returns the meta object for the reference list '{@link ProductionSystem.Conveyor#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Next</em>'.
	 * @see ProductionSystem.Conveyor#getNext()
	 * @see #getConveyor()
	 * @generated
	 */
	EReference getConveyor_Next();

	/**
	 * Returns the meta object for the reference '{@link ProductionSystem.Conveyor#getPrev <em>Prev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prev</em>'.
	 * @see ProductionSystem.Conveyor#getPrev()
	 * @see #getConveyor()
	 * @generated
	 */
	EReference getConveyor_Prev();

	/**
	 * Returns the meta object for the container reference '{@link ProductionSystem.Conveyor#getIm <em>Im</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Im</em>'.
	 * @see ProductionSystem.Conveyor#getIm()
	 * @see #getConveyor()
	 * @generated
	 */
	EReference getConveyor_Im();

	/**
	 * Returns the meta object for the container reference '{@link ProductionSystem.Conveyor#getOm <em>Om</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Om</em>'.
	 * @see ProductionSystem.Conveyor#getOm()
	 * @see #getConveyor()
	 * @generated
	 */
	EReference getConveyor_Om();

	/**
	 * Returns the meta object for the attribute '{@link ProductionSystem.Conveyor#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ProductionSystem.Conveyor#getId()
	 * @see #getConveyor()
	 * @generated
	 */
	EAttribute getConveyor_Id();

	/**
	 * Returns the meta object for class '{@link ProductionSystem.Piece <em>Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Piece</em>'.
	 * @see ProductionSystem.Piece
	 * @generated
	 */
	EClass getPiece();

	/**
	 * Returns the meta object for the container reference '{@link ProductionSystem.Piece#getConveyor <em>Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Conveyor</em>'.
	 * @see ProductionSystem.Piece#getConveyor()
	 * @see #getPiece()
	 * @generated
	 */
	EReference getPiece_Conveyor();

	/**
	 * Returns the meta object for the attribute '{@link ProductionSystem.Piece#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ProductionSystem.Piece#getId()
	 * @see #getPiece()
	 * @generated
	 */
	EAttribute getPiece_Id();

	/**
	 * Returns the meta object for class '{@link ProductionSystem.Raw <em>Raw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raw</em>'.
	 * @see ProductionSystem.Raw
	 * @generated
	 */
	EClass getRaw();

	/**
	 * Returns the meta object for class '{@link ProductionSystem.Processed <em>Processed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processed</em>'.
	 * @see ProductionSystem.Processed
	 * @generated
	 */
	EClass getProcessed();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProductionSystemFactory getProductionSystemFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ProductionSystem.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProductionSystem.impl.MachineImpl
		 * @see ProductionSystem.impl.ProductionSystemPackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

		/**
		 * The meta object literal for the '<em><b>Ic</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__IC = eINSTANCE.getMachine_Ic();

		/**
		 * The meta object literal for the '<em><b>Oc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__OC = eINSTANCE.getMachine_Oc();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__ID = eINSTANCE.getMachine_Id();

		/**
		 * The meta object literal for the '{@link ProductionSystem.impl.ConveyorImpl <em>Conveyor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProductionSystem.impl.ConveyorImpl
		 * @see ProductionSystem.impl.ProductionSystemPackageImpl#getConveyor()
		 * @generated
		 */
		EClass CONVEYOR = eINSTANCE.getConveyor();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVEYOR__CAPACITY = eINSTANCE.getConveyor_Capacity();

		/**
		 * The meta object literal for the '<em><b>Piece</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR__PIECE = eINSTANCE.getConveyor_Piece();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR__NEXT = eINSTANCE.getConveyor_Next();

		/**
		 * The meta object literal for the '<em><b>Prev</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR__PREV = eINSTANCE.getConveyor_Prev();

		/**
		 * The meta object literal for the '<em><b>Im</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR__IM = eINSTANCE.getConveyor_Im();

		/**
		 * The meta object literal for the '<em><b>Om</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR__OM = eINSTANCE.getConveyor_Om();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVEYOR__ID = eINSTANCE.getConveyor_Id();

		/**
		 * The meta object literal for the '{@link ProductionSystem.impl.PieceImpl <em>Piece</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProductionSystem.impl.PieceImpl
		 * @see ProductionSystem.impl.ProductionSystemPackageImpl#getPiece()
		 * @generated
		 */
		EClass PIECE = eINSTANCE.getPiece();

		/**
		 * The meta object literal for the '<em><b>Conveyor</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIECE__CONVEYOR = eINSTANCE.getPiece_Conveyor();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIECE__ID = eINSTANCE.getPiece_Id();

		/**
		 * The meta object literal for the '{@link ProductionSystem.impl.RawImpl <em>Raw</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProductionSystem.impl.RawImpl
		 * @see ProductionSystem.impl.ProductionSystemPackageImpl#getRaw()
		 * @generated
		 */
		EClass RAW = eINSTANCE.getRaw();

		/**
		 * The meta object literal for the '{@link ProductionSystem.impl.ProcessedImpl <em>Processed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProductionSystem.impl.ProcessedImpl
		 * @see ProductionSystem.impl.ProductionSystemPackageImpl#getProcessed()
		 * @generated
		 */
		EClass PROCESSED = eINSTANCE.getProcessed();

	}

} //ProductionSystemPackage
