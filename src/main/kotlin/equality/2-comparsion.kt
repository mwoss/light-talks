package equality


/**
 * equals(other: Any?) indicates whether "other" object is "equal to" caller object
 *  -> more info here: https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html
 *
 *
 * x == y is quite similar to equals(other: Any?) but with additional null check, it can be translated to:
 *      a?.equals(b) ?: (b === null)
 * If we overwrite equals(other: Any?) we would change behaviour of == too!
 *
 *
 * x === y evaluates to true only if x and y points to the same object in memory.
 */
