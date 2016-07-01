import forcomp.Anagrams._

sentenceOccurrences(List("abcd", "e"))

val l = List(('a', 2), ('b', 3))
//combinations(List(('a', 2), ('b', 2))).toSet


val lard = List(('a', 1), ('d', 1), ('l', 1), ('r', 1))
val r = List(('r', 1))
val lad = List(('a', 1), ('d', 1), ('l', 1))

subtract(lard, r)
