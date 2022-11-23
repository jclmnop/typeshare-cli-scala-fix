/**
 * Generated by typeshare 1.0.0
 */
package com.agilebits

package onepassword {

// Generated type representing the anonymous struct variant `Us` of the `AutofilledBy` Rust enum
case class AutofilledByUsInner (
	// The UUID for the fill
	uuid: String
)

// Generated type representing the anonymous struct variant `SomethingElse` of the `AutofilledBy` Rust enum
case class AutofilledBySomethingElseInner (
	// The UUID for the fill
	uuid: String,
	// Some other thing
	thing: Int
)

// Enum keeping track of who autofilled a field
sealed trait AutofilledBy {
	def serialName: String
}
object AutofilledBy {
	// This field was autofilled by us
	case class Us(content: AutofilledByUsInner) extends AutofilledBy {
		val serialName: String = "Us"
	}
	// Something else autofilled this field
	case class SomethingElse(content: AutofilledBySomethingElseInner) extends AutofilledBy {
		val serialName: String = "SomethingElse"
	}
}

// Generated type representing the anonymous struct variant `AnonVariant` of the `EnumWithManyVariants` Rust enum
case class EnumWithManyVariantsAnonVariantInner (
	uuid: String
)

// Generated type representing the anonymous struct variant `AnotherAnonVariant` of the `EnumWithManyVariants` Rust enum
case class EnumWithManyVariantsAnotherAnonVariantInner (
	uuid: String,
	thing: Int
)

// This is a comment (yareek sameek wuz here)
sealed trait EnumWithManyVariants {
	def serialName: String
}
object EnumWithManyVariants {
	case object UnitVariant extends EnumWithManyVariants {
		val serialName: String = "UnitVariant"
	}
	case class TupleVariantString(content: String) extends EnumWithManyVariants {
		val serialName: String = "TupleVariantString"
	}
	case class AnonVariant(content: EnumWithManyVariantsAnonVariantInner) extends EnumWithManyVariants {
		val serialName: String = "AnonVariant"
	}
	case class TupleVariantInt(content: Int) extends EnumWithManyVariants {
		val serialName: String = "TupleVariantInt"
	}
	case object AnotherUnitVariant extends EnumWithManyVariants {
		val serialName: String = "AnotherUnitVariant"
	}
	case class AnotherAnonVariant(content: EnumWithManyVariantsAnotherAnonVariantInner) extends EnumWithManyVariants {
		val serialName: String = "AnotherAnonVariant"
	}
}

}
