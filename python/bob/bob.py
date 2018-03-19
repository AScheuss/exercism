def hey(conversation):
	if (conversation.isupper()):
		return 'Whoa, chill out!'
	elif (conversation.strip() == ''):
		return 'Fine. Be that way!'
	elif (conversation.strip().endswith('?')):
		return 'Sure.'
	else:
		return 'Whatever.'

print(hey(''))