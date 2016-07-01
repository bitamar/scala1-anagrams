import forcomp.Anagrams._

sentenceOccurrences(List("abcd", "e"))


dictionaryByOccurrences.get(List(('a', 1), ('e', 1), ('t', 1))).map(_.toSet)