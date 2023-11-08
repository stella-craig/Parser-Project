import sys
from io import StringIO
from antlr4 import *
from MyLanguageLexer import MyLanguageLexer
from MyLanguageParser import MyLanguageParser

#def main(argv):
def main():
	valid_strings = ["assign : 123", "assign = 123"]
	#inp_stream = FileStream(argv[1])
	print("Valid Strings:")

	for x in valid_strings:
		s = InputStream(x)
		#lexer = MyLanguageLexer(inp_stream)
		lexer = MyLanguageLexer(s)
		stream = CommonTokenStream(lexer)
		parser = MyLanguageParser(stream)
		# tree = parser.prog()
		if parser.getNumberOfSyntaxErrors() > 0:
			print("failed: " + str(s) + "\n")
		else:
			print("passed!\n")

if __name__ == '__main__':
	#main(sys.argv)
	main()