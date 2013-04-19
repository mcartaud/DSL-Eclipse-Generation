/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Location</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getLocation()
 * @model
 * @generated
 */
public enum Location implements Enumerator {
	/**
	 * The '<em><b>BOTTOM RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	BOTTOM_RIGHT(0, "BOTTOM_RIGHT", "BOTTOM_RIGHT"),

	/**
	 * The '<em><b>BOTTOM LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	BOTTOM_LEFT(0, "BOTTOM_LEFT", "BOTTOM_LEFT"),

	/**
	 * The '<em><b>TOP RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOP_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	TOP_RIGHT(0, "TOP_RIGHT", "TOP_RIGHT"),

	/**
	 * The '<em><b>TOP LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOP_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	TOP_LEFT(0, "TOP_LEFT", "TOP_LEFT"),

	/**
	 * The '<em><b>UNDERLAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDERLAY_VALUE
	 * @generated
	 * @ordered
	 */
	UNDERLAY(0, "UNDERLAY", "UNDERLAY"),

	/**
	 * The '<em><b>REPLACE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLACE_VALUE
	 * @generated
	 * @ordered
	 */
	REPLACE(0, "REPLACE", "REPLACE");

	/**
	 * The '<em><b>BOTTOM RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BOTTOM RIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOTTOM_RIGHT_VALUE = 0;

	/**
	 * The '<em><b>BOTTOM LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BOTTOM LEFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOTTOM_LEFT_VALUE = 0;

	/**
	 * The '<em><b>TOP RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOP RIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOP_RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOP_RIGHT_VALUE = 0;

	/**
	 * The '<em><b>TOP LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOP LEFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOP_LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOP_LEFT_VALUE = 0;

	/**
	 * The '<em><b>UNDERLAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNDERLAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDERLAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNDERLAY_VALUE = 0;

	/**
	 * The '<em><b>REPLACE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REPLACE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPLACE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REPLACE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Location</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Location[] VALUES_ARRAY =
		new Location[] {
			BOTTOM_RIGHT,
			BOTTOM_LEFT,
			TOP_RIGHT,
			TOP_LEFT,
			UNDERLAY,
			REPLACE,
		};

	/**
	 * A public read-only list of all the '<em><b>Location</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Location> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Location</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Location get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Location result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Location</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Location getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Location result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Location</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Location get(int value) {
		switch (value) {
			case BOTTOM_RIGHT_VALUE: return BOTTOM_RIGHT;
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
	private Location(int value, String name, String literal) {
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
	
} //Location
