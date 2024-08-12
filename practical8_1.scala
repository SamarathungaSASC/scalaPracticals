object practical8_1 extends App{
    def encrypt(text: String, shift: Int): String = {
        text.map({ char =>
            if (char.isLetter){
                val base  = if (char.isUpper) 'A' else 'a';
                val shifted = (char.toInt- base.toInt + shift) % 26 + base.toInt;
                shifted.toChar
            }else{
                char
            }
        });
    }

    def decrypt(text: String, shift: Int): String = {
        encrypt(text, -shift);
    }


    def ceasar(text: String, shift:Int, func: (String, Int) => String): String = {
        func(text, shift)
    }

    println(ceasar("ABCD", 1 , encrypt));
    println(ceasar("BCDE", 1 , decrypt));
}