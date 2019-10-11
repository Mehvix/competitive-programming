sentence = input("Enter sentence:")

old = ["I'm", "I've", "I'll"]
new = ["I am", "I have", "I will"]
for n in range(len(old)):
    sentence = sentence.replace(str(old[n]), str(new[n]))

print(sentence)
