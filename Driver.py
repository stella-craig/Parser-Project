import sys
from antlr4 import *
from MyLanguageLexer import MyLanguageLexer
from MyLanguageParser import MyLanguageParser

def main(argv):
    input_stream = FileStream(argv[1])
    lexer = MyLanguageLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = MyLanguageParser(stream)
    tree = parser.start()

if __name__ == '__main__':
    main(sys.argv)