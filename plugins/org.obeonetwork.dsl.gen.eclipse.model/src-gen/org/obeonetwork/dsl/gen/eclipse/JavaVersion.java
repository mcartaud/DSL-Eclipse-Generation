/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Java Version</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getJavaVersion()
 * @model
 * @generated
 */
public enum JavaVersion implements Enumerator {
	/**
	 * The '<em><b>Java SE15</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAVA_SE15_VALUE
	 * @generated
	 * @ordered
	 */
	JAVA_SE15(0, "JavaSE15", "JavaSE15"),

	/**
	 * The '<em><b>Java SE14</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAVA_SE14_VALUE
	 * @generated
	 * @ordered
	 */
	JAVA_SE14(1, "JavaSE14", "JavaSE14"),

	/**
	 * The '<em><b>Java SE16</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAVA_SE16_VALUE
	 * @generated
	 * @ordered
	 */
	JAVA_SE16(2, "JavaSE16", "JavaSE16"),

	/**
	 * The '<em><b>Java SE17</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAVA_SE17_VALUE
	 * @generated
	 * @ordered
	 */
	JAVA_SE17(3, "JavaSE17", "JavaSE17");

	/**
	 * The '<em><b>Java SE15</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Java SE15</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JAVA_SE15
	 * @model name="JavaSE15"
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_SE15_VALUE = 0;

	/**
	 * The '<em><b>Java SE14</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Java SE14</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JAVA_SE14
	 * @model name="JavaSE14"
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_SE14_VALUE = 1;

	/**
	 * The '<em><b>Java SE16</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Java SE16</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JAVA_SE16
	 * @model name="JavaSE16"
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_SE16_VALUE = 2;

	/**
	 * The '<em><b>Java SE17</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Java SE17</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JAVA_SE17
	 * @model name="JavaSE17"
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_SE17_VALUE = 3;

	/**
	 * An array of all the '<em><b>Java Version</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final JavaVersion[] VALUES_ARRAY =
		new JavaVersion[] {
			JAVA_SE15,
			JAVA_SE14,
			JAVA_SE16,
			JAVA_SE17,
		};

	/**
	 * A public read-only list of all the '<em><b>Java Version</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<JavaVersion> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Java Version</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JavaVersion get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JavaVersion result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Java Version</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JavaVersion getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JavaVersion result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Java Version</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JavaVersion get(int value) {
		switch (value) {
			case JAVA_SE15_VALUE: return JAVA_SE15;
			case JAVA_SE14_VALUE: return JAVA_SE14;
			case JAVA_SE16_VALUE: return JAVA_SE16;
			case JAVA_SE17_VALUE: return JAVA_SE17;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private JavaVersion(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //JavaVersion
