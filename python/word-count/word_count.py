def word_count(phrase):
	punctuation = "[,.;:!!_&@$%^& -\t\n]"
	phrase = phrase.translate(str.maketrans(punctuation, ' ' * len(punctuation) ))
	phrase = phrase.lower()
	words = phrase.split()

	thisdict = {}
	for word in words:
		if len(word)>0:
			if not word in thisdict:
				thisdict[word] = 1
			else:
				thisdict[word] += 1
	return thisdict
