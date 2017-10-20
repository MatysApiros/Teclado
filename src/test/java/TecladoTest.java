import org.junit.Test;

import static org.junit.Assert.*;

public class TecladoTest {



    @Test
    public void deveRetornarAlex() {
        // given
        String esperado = "alex";
        // when
        Teclado teclado = new Teclado();
        String retorno = teclado.decodifica("1#444#22#88");
        // then
        assertEquals(esperado, retorno);
    }

    @Test
    public void deveRetornarHyan() {
        // given
        String esperado = "hyan";
        // when
        Teclado teclado = new Teclado();
        String retorno = teclado.decodifica("33#888#1#55");
        // then
        assertEquals(esperado, retorno);
    }

    @Test
    public void retornaNumero(){
        String esperado = "h";


        Teclado teclado = new Teclado();

        String retorno = teclado.decodifica("33");

        assertEquals(esperado, retorno);
    }

    @Test
    public void retornaDouglas(){
        String esperado = "douglas";

        Teclado teclado = new Teclado();

        String retorno = teclado.decodifica("2#555#77#3#444#1#6666");

        assertEquals(esperado, retorno);
    }

    @Test
    public void retornaArrayAlex(){
        String esperado = "alex";

        Teclado teclado = new Teclado();

        String retorno = teclado.decodifica("1#444#22#88");

        assertEquals(esperado, retorno);
    }

    @Test
    public void verificaAlfa(){
        String esperado = "a";

        Teclado teclado = new Teclado();

        String retorno = teclado.verificaA("1");

        assertEquals(esperado,retorno);
    }

    @Test
    public void verificaAlfabeto(){
        String esperado = "m";

        Teclado teclado = new Teclado();

        String retorno  =  teclado.retornaLetraDoAlfabeto("5");

        assertEquals(esperado,retorno);
    }

    @Test
    public void verificaDecodifica(){
        String esperado = "matheus";

        Teclado teclado = new Teclado();

        String retorno  =  teclado.decodifica("5#1#7#33#22#77#6666");

        assertEquals(esperado,retorno);
    }

    public void verificaDecodifica2(){
        String esperado = "alex";

        Teclado teclado = new Teclado();

        String retorno  =  teclado.decodifica("1#444#22#88");

        assertEquals(esperado,retorno);
    }

    public void verificaDecodifica3(){
        String esperado = "douglas";

        Teclado teclado = new Teclado();

        String retorno  =  teclado.decodifica("2#555#77#3#444#1#6666");

        assertEquals(esperado,retorno);
    }
}