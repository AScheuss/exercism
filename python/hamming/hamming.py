def distance(dna_1, dna_2):
	if len(dna_1) != len(dna_2):
		raise ValueError

	if calculate_distance(dna_1, dna_2) == calculate_distance_copied(dna_1, dna_2):
		return calculate_distance(dna_1, dna_2)


def calculate_distance(dna_1, dna_2):
	hamming_distance = 0
	for i in range( len(dna_1) ):
		if dna_1[i] != dna_2[i]:
			hamming_distance += 1
	return hamming_distance
	
# from http://exercism.io/submissions/04d2915cca524c009ec885400ebbfa99
def calculate_distance_copied(dna_1, dna_2):
	hamming_distance = 0
	for (index, letter) in enumerate(dna_1):
		if dna_1[index] != dna_2[index]:
			hamming_distance += 1
	return hamming_distance