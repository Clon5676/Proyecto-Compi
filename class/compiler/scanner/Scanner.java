// import java.util.ArrayList;
// import java.util.List;

// public class Scanner {
//     private String input;
//     private int position;
//     private int line;
//     private int column;
    
//     public Scanner(String input) {
//         this.input = input;
//         this.position = 0;
//         this.line = 1;
//         this.column = 1;
//     }
    
//     public List<Token> scan() {
//         List<Token> tokens = new ArrayList<>();
        
//         while (position < input.length()) {
//             char currentChar = peek();

//             if (Character.isWhitespace(currentChar)) {
//                 skipWhitespace();
//             } else if (Character.isLetter(currentChar)) {
//                 tokens.add(scanIdentifierOrKeyword());
//             } else if (Character.isDigit(currentChar)) {
//                 tokens.add(scanNumber());
//             } else if (currentChar == '"') {
//                 tokens.add(scanString());
//             } else if (currentChar == '/') {
//                 if (peekNext() == '/') {
//                     skipSingleLineComment();
//                 } else if (peekNext() == '*') {
//                     skipMultiLineComment();
//                 } else {
//                     tokens.add(scanOperator());
//                 }
//             } else {
//                 tokens.add(scanOperator());
//             }
//         }
        
//         return tokens;
//     }
    
//     private char peek() {
//         return input.charAt(position);
//     }

//     private char peekNext() {
//         if (position + 1 >= input.length()) {
//             return '\0';
//         }
//         return input.charAt(position + 1);
//     }

//     private char advance() {
//         char currentChar = input.charAt(position);
//         position++;
//         column++;
//         if (currentChar == '\n') {
//             line++;
//             column = 1;
//         }
//         return currentChar;
//     }

//     private void skipWhitespace() {
//         while (position < input.length() && Character.isWhitespace(peek())) {
//             advance();
//         }
//     }

//     private Token scanIdentifierOrKeyword() {
//         StringBuilder buffer = new StringBuilder();
//         while (position < input.length() && (Character.isLetterOrDigit(peek()) || peek() == '_')) {
//             buffer.append(advance());
//         }
//         String lexeme = buffer.toString();
//         TokenType type = TokenType.IDENTIFIER; // Default to IDENTIFIER
        
//         // Check if lexeme is a keyword
//         if (isKeyword(lexeme)) {
//             type = TokenType.KEYWORD;
//         }

//         return new Token(type, lexeme, line, column);
//     }

//     private Token scanNumber() {
//         StringBuilder buffer = new StringBuilder();
//         while (position < input.length() && Character.isDigit(peek())) {
//             buffer.append(advance());
//         }
//         return new Token(TokenType.NUMBER, buffer.toString(), line, column);
//     }

//     private Token scanString() {
//         StringBuilder buffer = new StringBuilder();
//         advance(); // Skip opening quote

//         while (position < input.length() && peek() != '"') {
//             if (peek() == '\n') {
//                 return new Token(TokenType.ERROR, "String literal not terminated", line, column);
//             }
//             buffer.append(advance());
//         }

//         if (position >= input.length()) {
//             return new Token(TokenType.ERROR, "String literal not terminated", line, column);
//         }

//         advance(); // Skip closing quote
//         return new Token(TokenType.STRING, buffer.toString(), line, column);
//     }

//     private void skipSingleLineComment() {
//         while (position < input.length() && peek() != '\n') {
//             advance();
//         }
//     }

//     private void skipMultiLineComment() {
//         advance(); // Skip initial '*'
//         advance(); // Skip initial '/'
        
//         while (position < input.length()) {
//             if (peek() == '*' && peekNext() == '/') {
//                 advance();
//                 advance();
//                 break;
//             }
//             advance();
//         }
//     }

//     private Token scanOperator() {
//         char currentChar = advance();
//         switch (currentChar) {
//             case '+': return new Token(TokenType.PLUS, "+", line, column);
//             case '-': return new Token(TokenType.MINUS, "-", line, column);
//             case '*': return new Token(TokenType.MULTIPLY, "*", line, column);
//             case '/': return new Token(TokenType.DIVIDE, "/", line, column);
//             case '(': return new Token(TokenType.LEFT_PAREN, "(", line, column);
//             case ')': return new Token(TokenType.RIGHT_PAREN, ")", line, column);
//             case '{': return new Token(TokenType.LEFT_BRACE, "{", line, column);
//             case '}': return new Token(TokenType.RIGHT_BRACE, "}", line, column);
//             case ';': return new Token(TokenType.SEMICOLON, ";", line, column);
//             case ',': return new Token(TokenType.COMMA, ",", line, column);
//             // Agregar más operadores aquí
//             default: return new Token(TokenType.ERROR, "Illegal character: " + currentChar, line, column);
//         }
//     }

//     private boolean isKeyword(String lexeme) {
//         // Implementar verificación para palabras clave de Decaf
//         return lexeme.equals("if") || lexeme.equals("else") || lexeme.equals("while") || lexeme.equals("return");
//     }

//     // Clase Token y TokenType deben estar definidas aquí o en archivos separados
//     public static class Token {
//         public TokenType type;
//         public String lexeme;
//         public int line;
//         public int column;

//         public Token(TokenType type, String lexeme, int line, int column) {
//             this.type = type;
//             this.lexeme = lexeme;
//             this.line = line;
//             this.column = column;
//         }

//         @Override
//         public String toString() {
//             return type + " '" + lexeme + "' at " + line + ":" + column;
//         }
//     }

//     public enum TokenType {
//         IDENTIFIER, KEYWORD, NUMBER, STRING, PLUS, MINUS, MULTIPLY, DIVIDE, 
//         LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE, SEMICOLON, COMMA, ERROR
//         // Agregar más tipos de tokens aquí
//     }

//     // Método principal para prueba
//     public static void main(String[] args) {
//         String code = "int main() { // comentario\n return 42; }";
//         Scanner scanner = new Scanner(code);
//         List<Token> tokens = scanner.scan();
//         for (Token token : tokens) {
//             System.out.println(token);
//         }
//     }
// }

