/**
 */
package bank;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see bank.BankFactory
 * @model kind="package"
 * @generated
 */
public interface BankPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bank";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.com/bank";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bank";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BankPackage eINSTANCE = bank.impl.BankPackageImpl.init();

	/**
	 * The meta object id for the '{@link bank.impl.BankImpl <em>Bank</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bank.impl.BankImpl
	 * @see bank.impl.BankPackageImpl#getBank()
	 * @generated
	 */
	int BANK = 0;

	/**
	 * The feature id for the '<em><b>Managers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__MANAGERS = 0;

	/**
	 * The feature id for the '<em><b>Accounts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__ACCOUNTS = 1;

	/**
	 * The feature id for the '<em><b>Clients</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__CLIENTS = 2;

	/**
	 * The number of structural features of the '<em>Bank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Bank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bank.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bank.impl.ClientImpl
	 * @see bank.impl.BankPackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 1;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__ACCOUNTS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Sponsorships</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__SPONSORSHIPS = 3;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__CAPACITY = 4;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bank.impl.ManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bank.impl.ManagerImpl
	 * @see bank.impl.BankPackageImpl#getManager()
	 * @generated
	 */
	int MANAGER = 2;

	/**
	 * The feature id for the '<em><b>Clients</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__CLIENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bank.impl.AccountImpl <em>Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bank.impl.AccountImpl
	 * @see bank.impl.BankPackageImpl#getAccount()
	 * @generated
	 */
	int ACCOUNT = 3;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__OWNERS = 0;

	/**
	 * The feature id for the '<em><b>Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__CREDIT = 1;

	/**
	 * The feature id for the '<em><b>Overdraft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__OVERDRAFT = 2;

	/**
	 * The feature id for the '<em><b>Cards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__CARDS = 3;

	/**
	 * The number of structural features of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bank.impl.CardImpl <em>Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bank.impl.CardImpl
	 * @see bank.impl.BankPackageImpl#getCard()
	 * @generated
	 */
	int CARD = 4;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bank.CardType <em>Card Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bank.CardType
	 * @see bank.impl.BankPackageImpl#getCardType()
	 * @generated
	 */
	int CARD_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link bank.Bank <em>Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bank</em>'.
	 * @see bank.Bank
	 * @generated
	 */
	EClass getBank();

	/**
	 * Returns the meta object for the containment reference list '{@link bank.Bank#getManagers <em>Managers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Managers</em>'.
	 * @see bank.Bank#getManagers()
	 * @see #getBank()
	 * @generated
	 */
	EReference getBank_Managers();

	/**
	 * Returns the meta object for the containment reference list '{@link bank.Bank#getAccounts <em>Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accounts</em>'.
	 * @see bank.Bank#getAccounts()
	 * @see #getBank()
	 * @generated
	 */
	EReference getBank_Accounts();

	/**
	 * Returns the meta object for the containment reference list '{@link bank.Bank#getClients <em>Clients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clients</em>'.
	 * @see bank.Bank#getClients()
	 * @see #getBank()
	 * @generated
	 */
	EReference getBank_Clients();

	/**
	 * Returns the meta object for class '{@link bank.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see bank.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the reference list '{@link bank.Client#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Manager</em>'.
	 * @see bank.Client#getManager()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Manager();

	/**
	 * Returns the meta object for the reference list '{@link bank.Client#getAccounts <em>Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accounts</em>'.
	 * @see bank.Client#getAccounts()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Accounts();

	/**
	 * Returns the meta object for the attribute '{@link bank.Client#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bank.Client#getName()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Name();

	/**
	 * Returns the meta object for the reference list '{@link bank.Client#getSponsorships <em>Sponsorships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sponsorships</em>'.
	 * @see bank.Client#getSponsorships()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Sponsorships();

	/**
	 * Returns the meta object for the attribute '{@link bank.Client#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see bank.Client#getCapacity()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Capacity();

	/**
	 * Returns the meta object for class '{@link bank.Manager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see bank.Manager
	 * @generated
	 */
	EClass getManager();

	/**
	 * Returns the meta object for the reference list '{@link bank.Manager#getClients <em>Clients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clients</em>'.
	 * @see bank.Manager#getClients()
	 * @see #getManager()
	 * @generated
	 */
	EReference getManager_Clients();

	/**
	 * Returns the meta object for the attribute '{@link bank.Manager#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bank.Manager#getName()
	 * @see #getManager()
	 * @generated
	 */
	EAttribute getManager_Name();

	/**
	 * Returns the meta object for class '{@link bank.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account</em>'.
	 * @see bank.Account
	 * @generated
	 */
	EClass getAccount();

	/**
	 * Returns the meta object for the reference list '{@link bank.Account#getOwners <em>Owners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owners</em>'.
	 * @see bank.Account#getOwners()
	 * @see #getAccount()
	 * @generated
	 */
	EReference getAccount_Owners();

	/**
	 * Returns the meta object for the attribute '{@link bank.Account#getCredit <em>Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit</em>'.
	 * @see bank.Account#getCredit()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Credit();

	/**
	 * Returns the meta object for the attribute '{@link bank.Account#getOverdraft <em>Overdraft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overdraft</em>'.
	 * @see bank.Account#getOverdraft()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Overdraft();

	/**
	 * Returns the meta object for the reference list '{@link bank.Account#getCards <em>Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cards</em>'.
	 * @see bank.Account#getCards()
	 * @see #getAccount()
	 * @generated
	 */
	EReference getAccount_Cards();

	/**
	 * Returns the meta object for class '{@link bank.Card <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card</em>'.
	 * @see bank.Card
	 * @generated
	 */
	EClass getCard();

	/**
	 * Returns the meta object for the attribute '{@link bank.Card#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see bank.Card#getNumber()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Number();

	/**
	 * Returns the meta object for the attribute '{@link bank.Card#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bank.Card#getType()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Type();

	/**
	 * Returns the meta object for enum '{@link bank.CardType <em>Card Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Card Type</em>'.
	 * @see bank.CardType
	 * @generated
	 */
	EEnum getCardType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BankFactory getBankFactory();

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
		 * The meta object literal for the '{@link bank.impl.BankImpl <em>Bank</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bank.impl.BankImpl
		 * @see bank.impl.BankPackageImpl#getBank()
		 * @generated
		 */
		EClass BANK = eINSTANCE.getBank();

		/**
		 * The meta object literal for the '<em><b>Managers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANK__MANAGERS = eINSTANCE.getBank_Managers();

		/**
		 * The meta object literal for the '<em><b>Accounts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANK__ACCOUNTS = eINSTANCE.getBank_Accounts();

		/**
		 * The meta object literal for the '<em><b>Clients</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANK__CLIENTS = eINSTANCE.getBank_Clients();

		/**
		 * The meta object literal for the '{@link bank.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bank.impl.ClientImpl
		 * @see bank.impl.BankPackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>Manager</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__MANAGER = eINSTANCE.getClient_Manager();

		/**
		 * The meta object literal for the '<em><b>Accounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__ACCOUNTS = eINSTANCE.getClient_Accounts();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__NAME = eINSTANCE.getClient_Name();

		/**
		 * The meta object literal for the '<em><b>Sponsorships</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__SPONSORSHIPS = eINSTANCE.getClient_Sponsorships();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__CAPACITY = eINSTANCE.getClient_Capacity();

		/**
		 * The meta object literal for the '{@link bank.impl.ManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bank.impl.ManagerImpl
		 * @see bank.impl.BankPackageImpl#getManager()
		 * @generated
		 */
		EClass MANAGER = eINSTANCE.getManager();

		/**
		 * The meta object literal for the '<em><b>Clients</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER__CLIENTS = eINSTANCE.getManager_Clients();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGER__NAME = eINSTANCE.getManager_Name();

		/**
		 * The meta object literal for the '{@link bank.impl.AccountImpl <em>Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bank.impl.AccountImpl
		 * @see bank.impl.BankPackageImpl#getAccount()
		 * @generated
		 */
		EClass ACCOUNT = eINSTANCE.getAccount();

		/**
		 * The meta object literal for the '<em><b>Owners</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT__OWNERS = eINSTANCE.getAccount_Owners();

		/**
		 * The meta object literal for the '<em><b>Credit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__CREDIT = eINSTANCE.getAccount_Credit();

		/**
		 * The meta object literal for the '<em><b>Overdraft</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__OVERDRAFT = eINSTANCE.getAccount_Overdraft();

		/**
		 * The meta object literal for the '<em><b>Cards</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT__CARDS = eINSTANCE.getAccount_Cards();

		/**
		 * The meta object literal for the '{@link bank.impl.CardImpl <em>Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bank.impl.CardImpl
		 * @see bank.impl.BankPackageImpl#getCard()
		 * @generated
		 */
		EClass CARD = eINSTANCE.getCard();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__NUMBER = eINSTANCE.getCard_Number();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__TYPE = eINSTANCE.getCard_Type();

		/**
		 * The meta object literal for the '{@link bank.CardType <em>Card Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bank.CardType
		 * @see bank.impl.BankPackageImpl#getCardType()
		 * @generated
		 */
		EEnum CARD_TYPE = eINSTANCE.getCardType();

	}

} //BankPackage
