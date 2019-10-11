sentence = input("Enter sentence:")
# sentence = "Either it is science or just weird that I received sufficient caffeine"
sentence = sentence.split(" ")
previous_letter = ""
two_previous_letter = ""

for sentence_pos in range(len(sentence)):
    word = str(sentence[sentence_pos])

    for letter_pos in range(len(list(word))):
        current_letter = word[letter_pos]
        if (current_letter.lower() == "i") and (previous_letter.lower() == "e") and (two_previous_letter.lower() != "c"):
            print(sentence_pos + 1, ":", word)

        two_previous_letter = previous_letter
        previous_letter = current_letter
    previous_letter = ""
    two_previous_letter = ""
