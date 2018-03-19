def decode(encoded_message):
	temp_char = encoded_message[0];
	count = 0
	decoded_message = ''
	for char in encoded_message:
		if char != temp_char:
			decoded_message = append_string(count, decoded_message, temp_char)
			temp_char = char
			count = 1
		else:
			count += 1
	decoded_message = append_string(count, decoded_message, temp_char)
	return decoded_message

def encode(message):
	encoded_message = ''

	# for char in message:
	# 	# first extract the number



	# for index in range(len(message) // 2):
	# 	print(int(message[2*(index)]) * message[2*(index)-1])
	# 	print(message[2*(index)-1])
	# 	print(index)

	pass



def append_string(count, decoded_message, temp_char):
	if count == 1:
		decoded_message += temp_char
	else:
		decoded_message += str(count) + temp_char
	return decoded_message


print(decode("WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWB"))

# encode("3A12B")
