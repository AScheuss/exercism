def is_pangram(word):
	import string

	check_word = word.lower()
	char_list = []
	for letter in string.ascii_lowercase:
		if check_word.count(letter) < 1:
			return False
	return True
