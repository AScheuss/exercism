def is_isogram(word):
	return first_try(word) and second_try(word)



def first_try(word):
	import string

	check_word = word.lower()
	char_list = []
	for char in check_word:
		if char in char_list:
			return False
		if char not in string.whitespace and char not in ["-"]:
			char_list.append(char)
	return True


# found a nicer way here: http://exercism.io/submissions/013b8e9252ab4af3b82e543da83f4f68
def second_try(word):
	import string

	check_word = word.lower()
	char_list = []
	for letter in string.ascii_lowercase:
		if check_word.count(letter) > 1:
			return False
	return True