import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromesTest {

    Palindromes p=new Palindromes();

    @Test
    public void palindrome(){
        String result=p.palindrome("sai");
        assertEquals("ias",result);
    }

    @Test
    public void palindrome1(){
        String result=p.palindrome("lol");
        assertEquals("lol",result);
    }



}