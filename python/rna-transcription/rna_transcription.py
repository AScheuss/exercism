def to_rna(dna_strand):
	if first_try(dna_strand) == copied(dna_strand) and first_try(dna_strand) == copied2(dna_strand):
		return first_try(dna_strand)


def first_try(dna_strand):
	rna_strand = ""
	for letter in dna_strand:
		if letter == "G":
			rna_strand += "C"
		elif letter == "C":
			rna_strand += "G"
		elif letter == "T":
			rna_strand += "A"
		elif letter == "A":
			rna_strand += "U"
		else:
			return ""
	return rna_strand


# from http://exercism.io/submissions/64b0d94e2d2d4f949ca0527a561364cf
def copied(dna):
	mapping = {'G' : 'C', 'C' : 'G', 'T' : 'A', 'A' : 'U'}
	if not all((i in mapping.keys()) for i in dna): 
		return ''
	return ''.join([mapping[n] for n in dna])


# from http://exercism.io/submissions/b012abf345874d4bafaecb20cbd593f4
def copied2(dna):
    if not set(dna) <= set('GCTA'): return ''
    return dna.translate(str.maketrans('GCTA', 'CGAU'))
