
// types of datatypes 
// int          4 bytes (32 bits)  -2³¹ to 2³¹-1
// byte         1 byte (8 bits)    -128 to 127
// short        2 bytes (16 bits)  -32,768 to 32,767
// long         8 bytes (64 bits)  -2⁶³ to 2⁶³-1
// float        4 bytes             decimal numbers (less precision)
// double       8 bytes             decimal numbers (high precision)
// boolean      JVM dependent (usually 1 bit/1 byte)true / false
// char         2 bytes             single character (Unicode)


//java additon of 3 numbers with datatypes 

class ps1 {
    public static void main (String[] args){
        byte a = 8;
        byte b = 10;
        byte c = 2;
    int add = a + b + c ;
    System.out.print(add);
    }
}
